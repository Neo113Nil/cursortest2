package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes2.dex */
public final class i7s0 extends kr {
    public static final g7s0 Companion = new g7s0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(5))};
    public final String a;
    public final Map b;

    public /* synthetic */ i7s0(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, e7s0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }
}
