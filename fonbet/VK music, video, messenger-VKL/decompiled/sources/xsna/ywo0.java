package xsna;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.entity.Animation;
import com.vk.editor.timeline.entity.Edge;
import com.vk.editor.timeline.state.TracksFilter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.swo0;

/* compiled from: TimelineState.kt */
/* loaded from: classes18.dex */
public final class ywo0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public List<ckt0> f;
    public List<? extends List<? extends gp6>> g;
    public List<? extends List<oy4>> h;
    public List<? extends List<r7l0>> i;
    public gp6 j;
    public wwo0 k;
    public swo0 l;
    public boolean m;
    public b n;
    public final RectF o;
    public final RectF p;
    public final RectF q;
    public final z4h0 r;
    public long s;
    public float t;
    public izs<? super gp6, s3q0> u;
    public izs<? super a, s3q0> v;
    public gp6 w;
    public long x;
    public Integer y;

    /* compiled from: TimelineState.kt */
    public static final class a {
        public final int a;
        public final gp6 b;
        public final long c;

        public a(int i, long j, gp6 gp6Var) {
            this.a = i;
            this.b = gp6Var;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CursorItemInfo(index=");
            sb.append(this.a);
            sb.append(", item=");
            sb.append(this.b);
            sb.append(", positionMsInItem=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: TimelineState.kt */
    public static abstract class b {

        /* compiled from: TimelineState.kt */
        public static final class a extends b {
            public final gp6 a;
            public final Edge b;

            public a(gp6 gp6Var, Edge edge) {
                this.a = gp6Var;
                this.b = edge;
            }
        }

        /* compiled from: TimelineState.kt */
        /* renamed from: xsna.ywo0$b$b, reason: collision with other inner class name */
        public static final class C4142b extends b {
            public final gp6 a;

            public C4142b(gp6 gp6Var) {
                this.a = gp6Var;
            }
        }
    }

    /* compiled from: TimelineState.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Animation.Type.values().length];
            try {
                iArr[Animation.Type.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Animation.Type.Delete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Animation.Type.Split.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ywo0() {
        this(null);
    }

    public static float g(int i) {
        return ((i - 1) * gip0.n) + (jfp0.u * i);
    }

    public static boolean j(oy4 oy4Var, long j) {
        long max;
        long duration;
        if (j > 0) {
            duration = Math.min(oy4Var.c + j, oy4Var.g);
            max = duration - oy4Var.getDuration();
        } else {
            max = Math.max(oy4Var.b + j, 0L);
            duration = oy4Var.getDuration() + max;
        }
        boolean z = (max == oy4Var.b && duration == oy4Var.c) ? false : true;
        oy4Var.b = max;
        oy4Var.c = duration;
        return z;
    }

    public final gp6 a(float f, float f2) {
        Iterator<? extends List<? extends gp6>> it = this.g.iterator();
        while (it.hasNext()) {
            for (gp6 gp6Var : it.next()) {
                if (gp6Var.u().contains(f, f2)) {
                    return gp6Var;
                }
            }
        }
        return null;
    }

    public final gp6 b(String str) {
        Iterator<? extends List<? extends gp6>> it = this.g.iterator();
        while (it.hasNext()) {
            for (gp6 gp6Var : it.next()) {
                if (epx.f(gp6Var.m(), str)) {
                    return gp6Var;
                }
            }
        }
        return null;
    }

    public final List<List<gp6>> c() {
        if (this.f.isEmpty()) {
            return EmptyList.b;
        }
        return j5g.u0(this.g, Collections.singletonList(this.f));
    }

    public final float d() {
        return this.o.centerX() - this.a;
    }

    public final oy4 e() {
        swo0 swo0Var = this.l;
        if (epx.f(swo0Var, swo0.a.a)) {
            return null;
        }
        if (swo0Var instanceof swo0.b) {
            gp6 b2 = b(((swo0.b) swo0Var).a);
            if (b2 instanceof oy4) {
                return (oy4) b2;
            }
            return null;
        }
        if (!(swo0Var instanceof swo0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        gp6 b3 = b(((swo0.c) swo0Var).a);
        if (b3 instanceof oy4) {
            return (oy4) b3;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywo0)) {
            return false;
        }
        ywo0 ywo0Var = (ywo0) obj;
        return this.a == ywo0Var.a && this.b == ywo0Var.b && this.c == ywo0Var.c && this.d == ywo0Var.d && this.e == ywo0Var.e && epx.f(this.f, ywo0Var.f) && epx.f(this.g, ywo0Var.g) && epx.f(this.h, ywo0Var.h) && epx.f(this.i, ywo0Var.i) && epx.f(this.j, ywo0Var.j);
    }

    public final float f(TracksFilter tracksFilter) {
        Iterator<T> it = this.g.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            List list = (List) it.next();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((gp6) it2.next()).J()) {
                        if (tracksFilter == TracksFilter.ALL || tracksFilter == TracksFilter.ONLY_FIXED) {
                            i++;
                        }
                    }
                }
            }
            if (tracksFilter == TracksFilter.ALL || tracksFilter == TracksFilter.WITHOUT_FIXED) {
                i2++;
            }
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float g = i == 0 ? 0.0f : g(i);
        if (i2 != 0) {
            f = Math.min(this.k.h, g(i2));
        }
        return (gip0.m * 2) + g + f;
    }

    public final pwo0 h(gp6 gp6Var) {
        if (gp6Var != null) {
            int i = -1;
            int i2 = 0;
            if (j5g.P(this.f, gp6Var)) {
                Iterator<ckt0> it = this.f.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (epx.f(it.next().a, gp6Var.m())) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                return new pwo0(i, 0);
            }
            int i4 = 0;
            for (Object obj : this.g) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                List list = (List) obj;
                if (list.contains(gp6Var)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (epx.f(((gp6) it2.next()).m(), gp6Var.m())) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    return new pwo0(i, i4);
                }
                i4 = i5;
            }
        }
        return null;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(fw3.a(bh10.a(shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        gp6 gp6Var = this.j;
        return a2 + (gp6Var == null ? 0 : gp6Var.hashCode());
    }

    public final boolean i() {
        return (this.f.isEmpty() || this.o.isEmpty()) ? false : true;
    }

    public final void k(int i, int i2) {
        if (i != 0) {
            int i3 = this.a + i;
            this.a = i3;
            this.s = (long) ((i3 / this.c) * this.e);
            o();
            n();
        }
        if (i2 != 0) {
            int i4 = this.b + i2;
            this.b = i4;
            if (i4 > 0) {
                this.b = 0;
            }
            int i5 = this.b;
            int i6 = this.d;
            if (i5 < i6) {
                this.b = i6;
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        n();
    }

    public final void l(boolean z) {
        int i;
        Iterator<T> it = this.f.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((ckt0) it.next()).getDuration();
        }
        this.e = j;
        int d = (int) this.r.d(j);
        this.c = d;
        if (this.a > d) {
            this.a = d;
        }
        List<? extends List<? extends gp6>> list = this.g;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((gp6) it3.next()).J()) {
                            break;
                        }
                    }
                }
                i++;
                if (i < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        int i2 = -Math.max(0, ((int) (i == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : g(i))) - this.k.h);
        this.d = i2;
        if (this.b > 0) {
            this.b = 0;
        }
        if (this.b < i2) {
            this.b = i2;
        }
        if (z) {
            m();
        } else {
            this.s = (long) ((this.a / this.c) * this.e);
        }
        o();
        n();
    }

    public final void m() {
        this.a = (int) ((this.s / this.e) * this.c);
    }

    public final void n() {
        RectF rectF = this.q;
        if (rectF.isEmpty()) {
            return;
        }
        float d = d();
        float f = rectF.bottom - gip0.m;
        for (List<? extends gp6> list : this.g) {
            float f2 = f - jfp0.u;
            int size = list.size();
            int i = 0;
            while (i < size) {
                gp6 gp6Var = list.get(i);
                long H = gp6Var.H();
                z4h0 z4h0Var = this.r;
                float d2 = z4h0Var.d(H) + d;
                float d3 = z4h0Var.d(gp6Var.getDuration()) + d2;
                boolean J = gp6Var.J();
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float p = J ? 0.0f : gp6Var.p() - this.b;
                float q = gp6Var.K() ? 0.0f : gp6Var.q();
                gp6Var.u().set(d2 + q, f2 + p, d3 + q, p + f);
                gp6Var.L(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i++;
                gp6 gp6Var2 = (gp6) j5g.b0(i, list);
                if (gp6Var2 != null) {
                    b bVar = this.n;
                    b.C4142b c4142b = bVar instanceof b.C4142b ? (b.C4142b) bVar : null;
                    gp6 gp6Var3 = c4142b != null ? c4142b.a : null;
                    if (gp6Var3 != null && !epx.f(gp6Var.m(), gp6Var3.m()) && !epx.f(gp6Var2.m(), gp6Var3.m())) {
                        float f4 = gp6Var2.u().left - gp6Var.u().right;
                        float f5 = jfp0.y;
                        float f6 = f4 < f5 ? f5 - f4 : 0.0f;
                        float width = gp6Var.u().width() - f6;
                        float f7 = jfp0.z;
                        f3 = width < f7 ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gp6Var.u().width() - f7) : f6;
                    }
                }
                gp6Var.L(f3);
            }
            f = f2 - gip0.n;
        }
    }

    public final void o() {
        a aVar;
        izs<? super a, s3q0> izsVar;
        RectF rectF = this.p;
        if (rectF.isEmpty()) {
            return;
        }
        float d = d();
        a aVar2 = null;
        if (!epx.f(this.w, null)) {
            this.w = null;
            izs<? super gp6, s3q0> izsVar2 = this.u;
            if (izsVar2 != null) {
                izsVar2.invoke(null);
            }
        }
        this.y = null;
        int size = this.f.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            ckt0 ckt0Var = this.f.get(i);
            long duration = ckt0Var.getDuration() + j;
            Animation animation = ckt0Var.n;
            long j2 = this.s;
            if (j <= j2 && j2 <= duration) {
                if (!epx.f(this.w, ckt0Var)) {
                    this.w = ckt0Var;
                    izs<? super gp6, s3q0> izsVar3 = this.u;
                    if (izsVar3 != null) {
                        izsVar3.invoke(ckt0Var);
                    }
                }
                Integer valueOf = Integer.valueOf(i);
                this.y = valueOf;
                long j3 = j2 - j;
                if (this.x != j3) {
                    this.x = j3;
                    izs<? super a, s3q0> izsVar4 = this.v;
                    if (izsVar4 != null) {
                        gp6 gp6Var = this.w;
                        if (gp6Var == null) {
                            aVar = aVar2;
                            izsVar = izsVar4;
                        } else {
                            aVar = new a(valueOf.intValue(), gp6Var.E() + this.x, gp6Var);
                            izsVar = izsVar4;
                        }
                        izsVar.invoke(aVar);
                    }
                }
            }
            float d2 = this.r.d(ckt0Var.getDuration());
            float f = i != e43.g(this.f).c ? igs.p : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (animation != null) {
                int i2 = c.$EnumSwitchMapping$0[animation.a.ordinal()];
                if (i2 == 1) {
                    d2 *= animation.b;
                } else if (i2 == 2) {
                    d2 *= 1.0f - animation.b;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f *= animation.b;
                }
            }
            float f2 = d2 + d;
            ckt0Var.l.set(d, rectF.top, f2, rectF.bottom);
            ckt0Var.k = f;
            i++;
            d = f2;
            j = duration;
            aVar2 = null;
        }
        this.t = d;
    }

    public final String toString() {
        return "TimelineState(offsetX=" + this.a + ", offsetY=" + this.b + ", maxOffsetX=" + this.c + ", minOffsetY=" + this.d + ", duration=" + this.e + ", videoItems=" + this.f + ", tracks=" + this.g + ", audioTracks=" + this.h + ", stickerTracks=" + this.i + ", selectedItem=" + this.j + ')';
    }

    public ywo0(Object obj) {
        EmptyList emptyList = EmptyList.b;
        this.a = 0;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 0;
        this.e = 0L;
        this.f = emptyList;
        this.g = emptyList;
        this.h = emptyList;
        this.i = emptyList;
        this.j = null;
        this.k = wwo0.k;
        this.l = swo0.a.a;
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        z4h0 z4h0Var = new z4h0();
        z4h0Var.a = 3;
        z4h0Var.b = 1.0f;
        z4h0Var.d = 1.0f;
        z4h0Var.a();
        this.r = z4h0Var;
    }
}
