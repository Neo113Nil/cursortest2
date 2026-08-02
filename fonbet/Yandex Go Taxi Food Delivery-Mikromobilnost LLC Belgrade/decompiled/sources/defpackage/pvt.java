package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class pvt {
    public static final ovt Companion = new ovt();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(0))};
    public final boolean a;
    public final List b;

    public /* synthetic */ pvt(int i, boolean z, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, nvt.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public pvt(boolean z) {
        this.a = z;
        this.b = null;
    }
}
