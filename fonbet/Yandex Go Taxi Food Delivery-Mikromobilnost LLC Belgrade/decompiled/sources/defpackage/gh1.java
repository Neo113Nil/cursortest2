package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class gh1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new md90(bh1.class);
        b = new ld90(b2);
        c = new bjx(xg1.class);
        d = new qix(b2, new xfo(14));
    }

    public static mf1 a(OutputPrefixType outputPrefixType) {
        int i = fh1.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return mf1.z;
        }
        if (i == 2 || i == 3) {
            return mf1.A;
        }
        if (i == 4) {
            return mf1.B;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}
