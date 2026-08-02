package xsna;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import xsna.nbd0;

/* compiled from: AeadWrapper.java */
/* loaded from: classes.dex */
public final class d51 implements obd0<b51, b51> {
    public static final Logger a = Logger.getLogger(d51.class.getName());

    /* compiled from: AeadWrapper.java */
    public static class a implements b51 {
        public final nbd0<b51> a;

        public a(nbd0 nbd0Var) {
            this.a = nbd0Var;
        }

        @Override // xsna.b51
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            nbd0<b51> nbd0Var = this.a;
            return yfb.e(nbd0Var.b.a(), nbd0Var.b.a.a(bArr, bArr2));
        }

        @Override // xsna.b51
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            nbd0<b51> nbd0Var = this.a;
            if (length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<nbd0.a<b51>> it = nbd0Var.a(copyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().a.b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        d51.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator<nbd0.a<b51>> it2 = nbd0Var.a(sjk.a).iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().a.b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // xsna.obd0
    public final Class<b51> a() {
        return b51.class;
    }

    @Override // xsna.obd0
    public final b51 b(nbd0<b51> nbd0Var) throws GeneralSecurityException {
        return new a(nbd0Var);
    }

    @Override // xsna.obd0
    public final Class<b51> c() {
        return b51.class;
    }
}
