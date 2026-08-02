package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lp3g0;", "Lw96;", "Lc6z;", "Companion", "a", "m3g0", "l3g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p3g0 extends w96 implements c6z {
    public static final m3g0 Companion = new m3g0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(25)), null};
    public static final p3g0 f = new p3g0(0);
    public final boolean b;
    public final Map c;
    public final a d;

    public /* synthetic */ p3g0(int i, boolean z, Map map, a aVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp3g0$a;", "", "Companion", "n3g0", "o3g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final o3g0 Companion = new o3g0();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
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
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public p3g0() {
        this(0);
    }

    public p3g0(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
    }
}
