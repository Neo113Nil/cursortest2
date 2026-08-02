package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: AnimationModifier.kt */
/* loaded from: classes11.dex */
public final class oxj0 extends ooy {
    public iq2<q9x> p;
    public dt1 q;
    public boolean t;
    public long r = xp2.a;
    public long s = s6j.b(0, 0, 0, 0, 15);
    public final wh50 u = androidx.compose.runtime.k.b(null);

    /* compiled from: AnimationModifier.kt */
    public static final class a {
        public final if2<q9x, tq2> a;
        public long b;

        public a() {
            throw null;
        }

        public a(if2 if2Var, long j) {
            this.a = if2Var;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && q9x.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) q9x.c(this.b)) + ')';
        }
    }

    /* compiled from: AnimationModifier.kt */
    public static final class b extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ int $height;
        final /* synthetic */ long $measuredSize;
        final /* synthetic */ tra0 $placeable;
        final /* synthetic */ ep10 $this_measure;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, int i, int i2, ep10 ep10Var, tra0 tra0Var) {
            super(1);
            this.$measuredSize = j;
            this.$width = i;
            this.$height = i2;
            this.$this_measure = ep10Var;
            this.$placeable = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.w(aVar, this.$placeable, oxj0.this.q.a(this.$measuredSize, (this.$width << 32) | (this.$height & 4294967295L), this.$this_measure.getLayoutDirection()));
            return s3q0.a;
        }
    }

    public oxj0(iq2 iq2Var, dt1 dt1Var) {
        this.p = iq2Var;
        this.q = dt1Var;
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.r = xp2.a;
        this.t = false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N;
        char c;
        long j2;
        a aVar;
        long d;
        a aVar2;
        if (ep10Var.z1()) {
            this.s = j;
            this.t = true;
            N = zo10Var.N(j);
        } else {
            N = zo10Var.N(this.t ? this.s : j);
        }
        tra0 tra0Var = N;
        long j3 = (tra0Var.c & 4294967295L) | (tra0Var.b << 32);
        if (ep10Var.z1()) {
            this.r = j3;
            c = ' ';
            d = j3;
            j2 = d;
        } else {
            long j4 = !q9x.b(this.r, xp2.a) ? this.r : j3;
            wh50 wh50Var = this.u;
            a aVar3 = (a) ((zak0) wh50Var).getValue();
            if (aVar3 != null) {
                if2<q9x, tq2> if2Var = aVar3.a;
                c = ' ';
                j2 = j3;
                boolean z = (q9x.b(j4, if2Var.d().a) || ((Boolean) ((zak0) if2Var.d).getValue()).booleanValue()) ? false : true;
                if (!q9x.b(j4, ((q9x) ((zak0) if2Var.e).getValue()).a) || z) {
                    aVar3.b = if2Var.d().a;
                    aVar2 = aVar3;
                    myc0.h(W1(), null, null, new pxj0(aVar2, j4, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                c = ' ';
                j2 = j3;
                long j5 = 1;
                aVar = new a(new if2(new q9x(j4), rte0.l, new q9x((j5 << 32) | (j5 & 4294967295L)), 8), j4);
            }
            ((zak0) wh50Var).setValue(aVar);
            d = s6j.d(j, aVar.a.d().a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return ep10Var.Q(i, i2, jgp.b, new b(j2, i, i2, ep10Var, tra0Var));
    }

    @Override // xsna.q630.c
    public final void c2() {
        ((zak0) this.u).setValue(null);
    }
}
