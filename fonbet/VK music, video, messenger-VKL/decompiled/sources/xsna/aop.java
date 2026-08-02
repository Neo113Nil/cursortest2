package xsna;

import androidx.compose.animation.EnterExitState;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.dt1;
import xsna.tra0;
import xsna.wlp0;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class aop extends ooy {
    public final j A;
    public wlp0<EnterExitState> p;
    public wlp0<EnterExitState>.a<q9x, tq2> q;
    public wlp0<EnterExitState>.a<h9x, tq2> r;
    public wlp0<EnterExitState>.a<h9x, tq2> s;
    public qpp t;
    public d5q u;
    public gzs<Boolean> v;
    public ndu w;
    public long x = xp2.a;
    public dt1 y;
    public final i z;

    /* compiled from: EnterExitTransition.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class b extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tra0 tra0Var) {
            super(1);
            this.$placeable = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            aVar.q(this.$placeable, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return s3q0.a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class c extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ izs<tdu, s3q0> $layerBlock;
        final /* synthetic */ long $offset;
        final /* synthetic */ long $offsetDelta;
        final /* synthetic */ tra0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(tra0 tra0Var, long j, long j2, izs<? super tdu, s3q0> izsVar) {
            super(1);
            this.$placeable = tra0Var;
            this.$offset = j;
            this.$offsetDelta = j2;
            this.$layerBlock = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0 tra0Var = this.$placeable;
            long j = this.$offset;
            long j2 = this.$offsetDelta;
            aVar.H(tra0Var, ((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.$layerBlock);
            return s3q0.a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class d extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tra0 tra0Var) {
            super(1);
            this.$this_run = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            aVar.q(this.$this_run, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return s3q0.a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class e extends Lambda implements izs<EnterExitState, q9x> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(1);
            this.$target = j;
        }

        @Override // xsna.izs
        public final q9x invoke(EnterExitState enterExitState) {
            izs<q9x, q9x> izsVar;
            izs<q9x, q9x> izsVar2;
            aop aopVar = aop.this;
            long j = this.$target;
            aopVar.getClass();
            int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    vsa vsaVar = aopVar.t.a().c;
                    if (vsaVar != null && (izsVar = vsaVar.b) != null) {
                        j = izsVar.invoke(new q9x(j)).a;
                    }
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vsa vsaVar2 = aopVar.u.a().c;
                    if (vsaVar2 != null && (izsVar2 = vsaVar2.b) != null) {
                        j = izsVar2.invoke(new q9x(j)).a;
                    }
                }
            }
            return new q9x(j);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class f extends Lambda implements izs<wlp0.b<EnterExitState>, phr<h9x>> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final phr<h9x> invoke(wlp0.b<EnterExitState> bVar) {
            return anp.c;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class g extends Lambda implements izs<EnterExitState, h9x> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.$target = j;
        }

        @Override // xsna.izs
        public final h9x invoke(EnterExitState enterExitState) {
            long j;
            int i;
            EnterExitState enterExitState2 = enterExitState;
            aop aopVar = aop.this;
            long j2 = this.$target;
            if (aopVar.y != null && aopVar.i2() != null && !epx.f(aopVar.y, aopVar.i2()) && (i = a.$EnumSwitchMapping$0[enterExitState2.ordinal()]) != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vsa vsaVar = aopVar.u.a().c;
                if (vsaVar != null) {
                    long j3 = vsaVar.b.invoke(new q9x(j2)).a;
                    dt1 i2 = aopVar.i2();
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    j = h9x.c(i2.a(j2, j3, layoutDirection), aopVar.y.a(j2, j3, layoutDirection));
                    return new h9x(j);
                }
            }
            j = 0;
            return new h9x(j);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class h extends Lambda implements izs<EnterExitState, h9x> {
        final /* synthetic */ long $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(1);
            this.$target = j;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
        @Override // xsna.izs
        public final h9x invoke(EnterExitState enterExitState) {
            EnterExitState enterExitState2 = enterExitState;
            aop aopVar = aop.this;
            long j = this.$target;
            b0k0 b0k0Var = aopVar.t.a().b;
            long j2 = 0;
            long j3 = b0k0Var != null ? ((h9x) b0k0Var.a.invoke(new q9x(j))).a : 0L;
            b0k0 b0k0Var2 = aopVar.u.a().b;
            long j4 = b0k0Var2 != null ? ((h9x) b0k0Var2.a.invoke(new q9x(j))).a : 0L;
            int i = a.$EnumSwitchMapping$0[enterExitState2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    j2 = j3;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = j4;
                }
            }
            return new h9x(j2);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class i extends Lambda implements izs<wlp0.b<EnterExitState>, phr<q9x>> {
        public i() {
            super(1);
        }

        @Override // xsna.izs
        public final phr<q9x> invoke(wlp0.b<EnterExitState> bVar) {
            wlp0.b<EnterExitState> bVar2 = bVar;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            phr<q9x> phrVar = null;
            if (bVar2.a(enterExitState, enterExitState2)) {
                vsa vsaVar = aop.this.t.a().c;
                if (vsaVar != null) {
                    phrVar = vsaVar.c;
                }
            } else if (bVar2.a(enterExitState2, EnterExitState.PostExit)) {
                vsa vsaVar2 = aop.this.u.a().c;
                if (vsaVar2 != null) {
                    phrVar = vsaVar2.c;
                }
            } else {
                phrVar = anp.d;
            }
            return phrVar == null ? anp.d : phrVar;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class j extends Lambda implements izs<wlp0.b<EnterExitState>, phr<h9x>> {
        public j() {
            super(1);
        }

        @Override // xsna.izs
        public final phr<h9x> invoke(wlp0.b<EnterExitState> bVar) {
            phr<h9x> phrVar;
            phr<h9x> phrVar2;
            wlp0.b<EnterExitState> bVar2 = bVar;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (bVar2.a(enterExitState, enterExitState2)) {
                b0k0 b0k0Var = aop.this.t.a().b;
                return (b0k0Var == null || (phrVar2 = b0k0Var.b) == null) ? anp.c : phrVar2;
            }
            if (!bVar2.a(enterExitState2, EnterExitState.PostExit)) {
                return anp.c;
            }
            b0k0 b0k0Var2 = aop.this.u.a().b;
            return (b0k0Var2 == null || (phrVar = b0k0Var2.b) == null) ? anp.c : phrVar;
        }
    }

    public aop(wlp0<EnterExitState> wlp0Var, wlp0<EnterExitState>.a<q9x, tq2> aVar, wlp0<EnterExitState>.a<h9x, tq2> aVar2, wlp0<EnterExitState>.a<h9x, tq2> aVar3, qpp qppVar, d5q d5qVar, gzs<Boolean> gzsVar, ndu nduVar) {
        this.p = wlp0Var;
        this.q = aVar;
        this.r = aVar2;
        this.s = aVar3;
        this.t = qppVar;
        this.u = d5qVar;
        this.v = gzsVar;
        this.w = nduVar;
        s6j.b(0, 0, 0, 0, 15);
        this.z = new i();
        this.A = new j();
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.x = xp2.a;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j2) {
        char c2;
        long j3;
        if (this.p.a.B() == ((zak0) this.p.d).getValue()) {
            this.y = null;
        } else if (this.y == null) {
            dt1 i2 = i2();
            if (i2 == null) {
                dt1.a.getClass();
                i2 = dt1.a.b;
            }
            this.y = i2;
        }
        boolean z1 = ep10Var.z1();
        jgp jgpVar = jgp.b;
        if (z1) {
            tra0 N = zo10Var.N(j2);
            long j4 = (N.b << 32) | (N.c & 4294967295L);
            this.x = j4;
            return ep10Var.Q((int) (j4 >> 32), (int) (4294967295L & j4), jgpVar, new b(N));
        }
        if (!this.v.invoke().booleanValue()) {
            tra0 N2 = zo10Var.N(j2);
            return ep10Var.Q(N2.b, N2.c, jgpVar, new d(N2));
        }
        dnp init = this.w.init();
        tra0 N3 = zo10Var.N(j2);
        long j5 = (N3.b << 32) | (N3.c & 4294967295L);
        long j6 = !q9x.b(this.x, xp2.a) ? this.x : j5;
        wlp0<EnterExitState>.a<q9x, tq2> aVar = this.q;
        wlp0.a.C3941a a2 = aVar != null ? aVar.a(this.z, new e(j6)) : null;
        if (a2 != null) {
            j5 = ((q9x) a2.getValue()).a;
        }
        long d2 = s6j.d(j2, j5);
        wlp0<EnterExitState>.a<h9x, tq2> aVar2 = this.r;
        long j7 = aVar2 != null ? ((h9x) aVar2.a(f.i, new g(j6)).getValue()).a : 0L;
        wlp0<EnterExitState>.a<h9x, tq2> aVar3 = this.s;
        if (aVar3 != null) {
            c2 = ' ';
            j3 = ((h9x) aVar3.a(this.A, new h(j6)).getValue()).a;
        } else {
            c2 = ' ';
            j3 = 0;
        }
        dt1 dt1Var = this.y;
        return ep10Var.Q((int) (d2 >> c2), (int) (d2 & 4294967295L), jgpVar, new c(N3, h9x.d(dt1Var != null ? dt1Var.a(j6, d2, LayoutDirection.Ltr) : 0L, j3), j7, init));
    }

    public final dt1 i2() {
        dt1 dt1Var;
        dt1 dt1Var2;
        if (this.p.e().a(EnterExitState.PreEnter, EnterExitState.Visible)) {
            vsa vsaVar = this.t.a().c;
            if (vsaVar != null && (dt1Var2 = vsaVar.a) != null) {
                return dt1Var2;
            }
            vsa vsaVar2 = this.u.a().c;
            if (vsaVar2 != null) {
                return vsaVar2.a;
            }
            return null;
        }
        vsa vsaVar3 = this.u.a().c;
        if (vsaVar3 != null && (dt1Var = vsaVar3.a) != null) {
            return dt1Var;
        }
        vsa vsaVar4 = this.t.a().c;
        if (vsaVar4 != null) {
            return vsaVar4.a;
        }
        return null;
    }
}
