package xsna;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import xsna.nbd0;

/* compiled from: MacWrapper.java */
/* loaded from: classes.dex */
public final class fc00 implements obd0<dc00, dc00> {
    public static final Logger a = Logger.getLogger(fc00.class.getName());

    /* compiled from: MacWrapper.java */
    /* loaded from: classes13.dex */
    public static class a implements dc00 {
        public final nbd0<dc00> a;
        public final byte[] b = {0};

        public a(nbd0 nbd0Var) {
            this.a = nbd0Var;
        }

        @Override // xsna.dc00
        public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            nbd0<dc00> nbd0Var = this.a;
            for (nbd0.a<dc00> aVar : nbd0Var.a(copyOf)) {
                try {
                    if (aVar.d.equals(OutputPrefixType.LEGACY)) {
                        aVar.a.a(copyOfRange, yfb.e(bArr2, this.b));
                    } else {
                        aVar.a.a(copyOfRange, bArr2);
                    }
                    return;
                } catch (GeneralSecurityException e) {
                    fc00.a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator<nbd0.a<dc00>> it = nbd0Var.a(sjk.a).iterator();
            while (it.hasNext()) {
                try {
                    it.next().a.a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // xsna.dc00
        public final byte[] b(byte[] bArr) throws GeneralSecurityException {
            nbd0<dc00> nbd0Var = this.a;
            return nbd0Var.b.d.equals(OutputPrefixType.LEGACY) ? yfb.e(nbd0Var.b.a(), nbd0Var.b.a.b(yfb.e(bArr, this.b))) : yfb.e(nbd0Var.b.a(), nbd0Var.b.a.b(bArr));
        }
    }

    @Override // xsna.obd0
    public final Class<dc00> a() {
        return dc00.class;
    }

    @Override // xsna.obd0
    public final dc00 b(nbd0<dc00> nbd0Var) throws GeneralSecurityException {
        return new a(nbd0Var);
    }

    @Override // xsna.obd0
    public final Class<dc00> c() {
        return dc00.class;
    }
}
