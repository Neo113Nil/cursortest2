package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class eg1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new md90(cg1.class);
        b = new ld90(b2);
        c = new bjx(wf1.class);
        d = new qix(b2, new xfo(13));
    }

    public static ag1 a(HashType hashType) {
        int i = dg1.b[hashType.ordinal()];
        if (i == 1) {
            return ag1.c;
        }
        if (i == 2) {
            return ag1.d;
        }
        if (i == 3) {
            return ag1.e;
        }
        if (i == 4) {
            return ag1.f;
        }
        if (i == 5) {
            return ag1.g;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.a());
    }

    public static bg1 b(OutputPrefixType outputPrefixType) {
        int i = dg1.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return bg1.c;
        }
        if (i == 2 || i == 3) {
            return bg1.w;
        }
        if (i == 4) {
            return bg1.x;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}
