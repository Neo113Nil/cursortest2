package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class di1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new md90(bi1.class);
        b = new ld90(b2);
        c = new bjx(xh1.class);
        d = new qix(b2, new xfo(16));
    }

    public static ag1 a(OutputPrefixType outputPrefixType) {
        int i = ci1.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return ag1.h;
        }
        if (i == 2 || i == 3) {
            return ag1.i;
        }
        if (i == 4) {
            return ag1.j;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}
