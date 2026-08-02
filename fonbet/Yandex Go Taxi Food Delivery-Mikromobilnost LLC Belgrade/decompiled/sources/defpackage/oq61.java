package defpackage;

import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.utils.Cache;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
public class oq61 {
    public static final Cache a = Cache.newSoftMemoryCache(750);
    public static final Cache b = Cache.newSoftMemoryCache(750);
    public static final int c = GetProperty.getIntegerProperty("crl_cert_max_length", SelfTester_JCP.ENCRYPT_CBC);

    public static X509CertImpl a(X509Certificate x509Certificate) {
        X509CertImpl x509CertImpl;
        if (x509Certificate == null) {
            return null;
        }
        boolean z = x509Certificate instanceof X509CertImpl;
        byte[] encodedInternal = z ? X509CertImpl.toImpl(x509Certificate).getEncodedInternal() : x509Certificate.getEncoded();
        Cache cache = a;
        try {
            cache.readLock();
            Object obj = cache.get(new zr61(encodedInternal));
            cache.readUnlock();
            X509CertImpl x509CertImpl2 = (X509CertImpl) obj;
            if (x509CertImpl2 != null) {
                return x509CertImpl2;
            }
            if (z) {
                x509CertImpl = (X509CertImpl) x509Certificate;
            } else {
                x509CertImpl = new X509CertImpl(encodedInternal);
                encodedInternal = x509CertImpl.getEncodedInternal();
            }
            b(cache, encodedInternal, x509CertImpl);
            return x509CertImpl;
        } catch (Throwable th) {
            cache.readUnlock();
            throw th;
        }
    }

    public static void b(Cache cache, byte[] bArr, Object obj) {
        if (bArr.length > c) {
            return;
        }
        try {
            cache.writeLock();
            cache.put(new zr61(bArr), obj);
        } finally {
            cache.writeUnlock();
        }
    }
}
