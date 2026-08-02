package defpackage;

import java.io.IOException;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.reprov.RevCheck;
import ru.CryptoPro.sspiSSL.SSPISSL;

/* loaded from: classes4.dex */
public final class br61 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        ContainerReaderInterface containerReaderInterface;
        int i = this.a;
        ContainerReaderInterface containerReaderInterface2 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ox61 ox61Var = (ox61) obj;
                Enumeration enumeration = ox61Var.c;
                if (enumeration == null) {
                    return null;
                }
                String str = null;
                while (enumeration.hasMoreElements() && str == null) {
                    String str2 = (String) enumeration.nextElement();
                    ox61Var.a = str2;
                    try {
                        containerReaderInterface = ox61Var.d.open(str2, false);
                        try {
                            try {
                                String containerName = CPKeyContainer.getContainerName(containerReaderInterface);
                                if (containerReaderInterface != null) {
                                    containerReaderInterface.close();
                                }
                                str = containerName;
                            } catch (IOException e) {
                                e = e;
                                ox61Var.e = e;
                                if (containerReaderInterface == null) {
                                    return null;
                                }
                                containerReaderInterface.close();
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            containerReaderInterface2 = containerReaderInterface;
                            if (containerReaderInterface2 != null) {
                                containerReaderInterface2.close();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        containerReaderInterface = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (containerReaderInterface2 != null) {
                        }
                        throw th;
                    }
                }
                return str;
            case 1:
                JCPPref.getUser(CertifiedRandom.class).putByteArray("CertifiedRandom_class_RandomSeed", (byte[]) obj);
                return null;
            case 2:
                SSPISSL sspissl = (SSPISSL) obj;
                String str3 = SSPISSL.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
                sspissl.put("KeyManagerFactory.GostX509", "ru.CryptoPro.sspiSSL.KeyManagerFactoryImpl$GostX509");
                sspissl.put("TrustManagerFactory.GostX509", "ru.CryptoPro.sspiSSL.TrustManagerFactoryImpl$PKIXFactory");
                sspissl.put("Alg.Alias.TrustManagerFactory.GostPKIX", "GostX509");
                sspissl.put("Alg.Alias.TrustManagerFactory.X509", "GostX509");
                sspissl.put("Alg.Alias.TrustManagerFactory.X.509", "GostX509");
                sspissl.put("SSLContext.TLS", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLSContext");
                sspissl.put("SSLContext.TLSv1", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS10Context");
                sspissl.put("SSLContext.TLSv1.1", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS11Context");
                sspissl.put("SSLContext.TLSv1.2", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS12Context");
                sspissl.put("SSLContext.TLSv1.3", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS13Context");
                sspissl.put("SSLContext.Default", "ru.CryptoPro.sspiSSL.SSLContextImpl$DefaultSSLContext");
                sspissl.put("SSLContext.GostTLS", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS10Context");
                sspissl.put("SSLContext.GostTLSv1.1", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS11Context");
                sspissl.put("SSLContext.GostTLSv1.2", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS12Context");
                sspissl.put("SSLContext.GostTLSv1.3", "ru.CryptoPro.sspiSSL.SSLContextImpl$TLS13Context");
                sspissl.put("Alg.Alias.SSLContext.TLS", "TLSv1");
                sspissl.put("Alg.Alias.SSLContext.GostTLS", "GostTLS");
                sspissl.put("Alg.Alias.SSLContext.GostTLSv1.1", "GostTLSv1.1");
                sspissl.put("Alg.Alias.SSLContext.GostTLSv1.2", "GostTLSv1.2");
                sspissl.put("Alg.Alias.SSLContext.GostTLSv1.3", "GostTLSv1.3");
                sspissl.put("KeyStore.HDImageFile", vq61.class.getName());
                return null;
            default:
                RevCheck revCheck = (RevCheck) obj;
                revCheck.put("CertPathBuilder.CPPKIX", "ru.CryptoPro.reprov.CPCertPathBuilder");
                revCheck.put("CertPathBuilder.PKIX ValidationAlgorithm", "RFC3280");
                revCheck.put("CertPathValidator.CPPKIX", "ru.CryptoPro.reprov.CPCertPathValidator");
                revCheck.put("CertPathValidator.PKIX ValidationAlgorithm", "RFC3280");
                return null;
        }
    }
}
