package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class e8j0 {
    public static final d8j0 Companion = new d8j0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(26))};
    public final Map a;

    public /* synthetic */ e8j0(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            qje.Z(i, 1, c8j0.a.getDescriptor());
            throw null;
        }
    }

    public e8j0(Map map) {
        this.a = map;
    }
}
