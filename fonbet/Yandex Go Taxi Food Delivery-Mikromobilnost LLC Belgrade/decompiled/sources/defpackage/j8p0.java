package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lj8p0;", "Lw96;", "Lc6z;", "Companion", "a", "g8p0", "f8p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j8p0 extends w96 implements c6z {
    public static final g8p0 Companion = new g8p0();
    public static final i3y[] e;
    public static final j8p0 f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new czo0(10)), kotlin.a.b(lazyThreadSafetyMode, new czo0(11))};
        f = new j8p0(0);
    }

    public /* synthetic */ j8p0(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public j8p0() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj8p0$a;", "", "Companion", "h8p0", "i8p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final i8p0 Companion = new i8p0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(12))};
        public final String a;
        public final String b;
        public final List c;

        public /* synthetic */ a(int i, String str, String str2, List list) {
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
                this.c = null;
            } else {
                this.c = list;
            }
        }

        public a() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    public j8p0(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }
}
