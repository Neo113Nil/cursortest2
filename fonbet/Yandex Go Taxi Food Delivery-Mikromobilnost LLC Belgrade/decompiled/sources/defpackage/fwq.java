package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class fwq extends ooc {
    public static final ewq Companion = new ewq();
    public static final i3y[] g = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new wmq(27))};
    public final String e;
    public final List f;

    public fwq(int i, String str, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dwq.a.getDescriptor());
            throw null;
        }
        this.e = str;
        this.f = list;
    }

    public fwq(x6b0 x6b0Var) {
        String str = x6b0Var.a;
        List list = x6b0Var.b;
        this.e = str;
        this.f = list;
    }
}
