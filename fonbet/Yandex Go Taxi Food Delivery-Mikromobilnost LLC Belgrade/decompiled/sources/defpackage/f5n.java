package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class f5n {
    public static final e5n Companion = new e5n();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(13))};
    public final long a;
    public final Map b;

    public /* synthetic */ f5n(long j, int i, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d5n.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = map;
    }
}
