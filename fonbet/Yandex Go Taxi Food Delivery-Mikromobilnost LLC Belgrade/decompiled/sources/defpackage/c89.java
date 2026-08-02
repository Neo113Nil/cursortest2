package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class c89 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new md90(a89.class);
        b = new ld90(b2);
        c = new bjx(w79.class);
        d = new qix(b2, new xfo(29));
    }

    public static bg1 a(OutputPrefixType outputPrefixType) {
        int i = b89.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return bg1.y;
        }
        if (i == 2 || i == 3) {
            return bg1.z;
        }
        if (i == 4) {
            return bg1.A;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}
