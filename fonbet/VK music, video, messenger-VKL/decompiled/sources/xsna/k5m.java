package xsna;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import xsna.nbd0;

/* compiled from: DeterministicAeadWrapper.java */
/* loaded from: classes.dex */
public final class k5m implements obd0<i5m, i5m> {
    public static final Logger a = Logger.getLogger(k5m.class.getName());

    /* compiled from: DeterministicAeadWrapper.java */
    public static class a implements i5m {
        public nbd0<i5m> a;

        @Override // xsna.i5m
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            nbd0<i5m> nbd0Var = this.a;
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<nbd0.a<i5m>> it = nbd0Var.a(copyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().a.a(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        k5m.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator<nbd0.a<i5m>> it2 = nbd0Var.a(sjk.a).iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().a.a(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // xsna.i5m
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            nbd0<i5m> nbd0Var = this.a;
            return yfb.e(nbd0Var.b.a(), nbd0Var.b.a.b(bArr, bArr2));
        }
    }

    @Override // xsna.obd0
    public final Class<i5m> a() {
        return i5m.class;
    }

    @Override // xsna.obd0
    public final i5m b(nbd0<i5m> nbd0Var) throws GeneralSecurityException {
        a aVar = new a();
        aVar.a = nbd0Var;
        return aVar;
    }

    @Override // xsna.obd0
    public final Class<i5m> c() {
        return i5m.class;
    }
}
