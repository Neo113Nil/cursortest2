package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes2.dex */
public final class aoq0 extends kr {
    public static final ynq0 Companion = new ynq0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(4))};
    public final String a;
    public final Map b;

    public /* synthetic */ aoq0(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, wnq0.a.getDescriptor());
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
