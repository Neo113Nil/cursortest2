package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class l3w {
    public static final k3w Companion = new k3w();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new smv(26))};
    public final List a;

    public /* synthetic */ l3w(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, j3w.a.getDescriptor());
            throw null;
        }
    }

    public l3w(List list) {
        this.a = list;
    }
}
