package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb3w;", "Lvn11;", "Companion", "a3w", "z2w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b3w implements vn11 {
    public static final a3w Companion = new a3w();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(13))};
    public static final b3w d = new b3w(0);
    public final Map b;

    public /* synthetic */ b3w(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }

    public b3w() {
        this(0);
    }

    public b3w(int i) {
        this.b = b.f();
    }
}
