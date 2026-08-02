package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;
import xsna.q630;
import xsna.tra0;

/* compiled from: PainterModifier.kt */
/* loaded from: classes11.dex */
public final class og90 extends q630.c implements noy, lio {
    public lg90 p;
    public boolean q;
    public dt1 r;
    public wkj s;
    public float t;
    public d6g u;

    /* compiled from: PainterModifier.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var) {
            super(1);
            this.$placeable = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            tra0.a.x(aVar, this.$placeable, 0, 0);
            return s3q0.a;
        }
    }

    public static boolean j2(long j) {
        return !mxj0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean k2(long j) {
        return !mxj0.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(l2(j));
        return ep10Var.Q(N.b, N.c, jgp.b, new a(N));
    }

    public final boolean i2() {
        return this.q && this.p.i() != 9205357640488583168L;
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!i2()) {
            return zoxVar.Z(i);
        }
        long l2 = l2(s6j.b(0, i, 0, 0, 13));
        return Math.max(o6j.j(l2), zoxVar.Z(i));
    }

    public final long l2(long j) {
        boolean z = false;
        boolean z2 = o6j.e(j) && o6j.d(j);
        if (o6j.g(j) && o6j.f(j)) {
            z = true;
        }
        if ((!i2() && z2) || z) {
            return o6j.b(o6j.i(j), j, 0, o6j.h(j), 0, 10);
        }
        long i = this.p.i();
        int round = k2(i) ? Math.round(Float.intBitsToFloat((int) (i >> 32))) : o6j.k(j);
        int round2 = j2(i) ? Math.round(Float.intBitsToFloat((int) (i & 4294967295L))) : o6j.j(j);
        int g = s6j.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(s6j.f(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (i2()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!k2(this.p.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.p.i() >> 32))) << 32) | (Float.floatToRawIntBits(!j2(this.p.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.p.i() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0L : s200.O(floatToRawIntBits2, this.s.a(floatToRawIntBits2, floatToRawIntBits));
        }
        return o6j.b(s6j.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), j, 0, s6j.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.p + ", sizeToIntrinsics=" + this.q + ", alignment=" + this.r + ", alpha=" + this.t + ", colorFilter=" + this.u + ')';
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        er9 er9Var = toyVar.b;
        long i = this.p.i();
        long floatToRawIntBits = (Float.floatToRawIntBits(k2(i) ? Float.intBitsToFloat((int) (i >> 32)) : Float.intBitsToFloat((int) (er9Var.d() >> 32))) << 32) | (Float.floatToRawIntBits(j2(i) ? Float.intBitsToFloat((int) (i & 4294967295L)) : Float.intBitsToFloat((int) (er9Var.d() & 4294967295L))) & 4294967295L);
        long O = (Float.intBitsToFloat((int) (er9Var.d() >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (er9Var.d() & 4294967295L)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0L : s200.O(floatToRawIntBits, this.s.a(floatToRawIntBits, er9Var.d()));
        long a2 = this.r.a((Math.round(Float.intBitsToFloat((int) (O >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (O & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (er9Var.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (er9Var.d() & 4294967295L))) & 4294967295L), toyVar.getLayoutDirection());
        float f = (int) (a2 >> 32);
        float f2 = (int) (a2 & 4294967295L);
        er9Var.c.a.l(f, f2);
        try {
            this.p.g(toyVar, O, this.t, this.u);
            er9Var.c.a.l(-f, -f2);
            toyVar.s1();
        } catch (Throwable th) {
            er9Var.c.a.l(-f, -f2);
            throw th;
        }
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!i2()) {
            return zoxVar.M(i);
        }
        long l2 = l2(s6j.b(0, 0, 0, i, 7));
        return Math.max(o6j.k(l2), zoxVar.M(i));
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!i2()) {
            return zoxVar.j0(i);
        }
        long l2 = l2(s6j.b(0, i, 0, 0, 13));
        return Math.max(o6j.j(l2), zoxVar.j0(i));
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        if (!i2()) {
            return zoxVar.l0(i);
        }
        long l2 = l2(s6j.b(0, 0, 0, i, 7));
        return Math.max(o6j.k(l2), zoxVar.l0(i));
    }
}
