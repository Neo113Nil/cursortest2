package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lf0z;", "Ln96;", "Lc6z;", "Companion", "a", "c0z", "b0z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f0z extends n96 implements c6z {
    public static final c0z Companion = new c0z();
    public static final i3y[] e;
    public static final f0z f;
    public final boolean b;
    public final List c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new wwx(19)), kotlin.a.b(lazyThreadSafetyMode, new wwx(20))};
        f = new f0z(0);
    }

    public /* synthetic */ f0z(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? EmptyList.a : list;
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !this.c.isEmpty();
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public f0z() {
        this(0);
    }

    public f0z(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = EmptyList.a;
        this.d = f2;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf0z$a;", "", "Companion", "d0z", "e0z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final e0z Companion = new e0z();
        public final String a;
        public final String b;
        public final String c;
        public final Long d;

        public /* synthetic */ a(Long l, String str, String str2, String str3, int i) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = l;
            }
        }

        public a() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
        }
    }
}
