package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Le1c0;", "Lvn11;", "Lc6z;", "Companion", "d1c0", "c1c0", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e1c0 implements vn11, c6z {
    public static final d1c0 Companion = new d1c0();
    public static final i3y[] h;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new l1b0(12)), null, null, null, a.b(lazyThreadSafetyMode, new l1b0(13))};
    }

    public /* synthetic */ e1c0(int i, boolean z, Map map, String str, String str2, String str3, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public e1c0() {
        this(null, false, 63);
    }

    public e1c0(Map map, boolean z, int i) {
        z = (i & 1) != 0 ? false : z;
        map = (i & 2) != 0 ? b.f() : map;
        String str = (i & 4) != 0 ? "" : "car_arriving_title";
        String str2 = (i & 8) != 0 ? "" : "car_transporting_title_template";
        String str3 = (i & 16) == 0 ? "clarify_starting_point_title" : "";
        this.b = z;
        this.c = map;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = EmptyList.a;
    }
}
