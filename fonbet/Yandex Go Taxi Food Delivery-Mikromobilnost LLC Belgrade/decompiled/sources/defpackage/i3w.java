package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class i3w {
    public static final h3w Companion = new h3w();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new smv(25))};
    public final List a;

    public /* synthetic */ i3w(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, g3w.a.getDescriptor());
            throw null;
        }
    }
}
