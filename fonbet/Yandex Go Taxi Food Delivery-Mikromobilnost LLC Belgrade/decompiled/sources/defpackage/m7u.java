package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class m7u {
    public static final l7u Companion = new l7u();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(15))};
    public final boolean a;
    public final List b;

    public /* synthetic */ m7u(int i, boolean z, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, k7u.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
    }

    public m7u(List list) {
        this.a = !list.isEmpty();
        this.b = list;
    }
}
