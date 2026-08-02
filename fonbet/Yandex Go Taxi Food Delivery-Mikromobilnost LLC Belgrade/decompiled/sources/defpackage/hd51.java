package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class hd51 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new md90(fd51.class);
        b = new ld90(b2);
        c = new bjx(bd51.class);
        d = new qix(b2, new w511(15));
    }

    public static ag1 a(OutputPrefixType outputPrefixType) {
        int i = gd51.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return ag1.r;
        }
        if (i == 2 || i == 3) {
            return ag1.s;
        }
        if (i == 4) {
            return ag1.t;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}
