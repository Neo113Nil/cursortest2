package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: ApproachLayoutModifierNode.kt */
/* loaded from: classes11.dex */
public interface td3 extends noy {

    /* compiled from: ApproachLayoutModifierNode.kt */
    public static final class a extends Lambda implements izs<tra0.a, s3q0> {
        final /* synthetic */ tra0 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tra0 tra0Var) {
            super(1);
            this.$this_run = tra0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tra0.a aVar) {
            aVar.q(this.$this_run, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return s3q0.a;
        }
    }

    boolean O1();

    default int P0(sd3 sd3Var, zox zoxVar, int i) {
        if (!z().i.w1().H0()) {
            return zoxVar.M(i);
        }
        e570 e570Var = e570.Min;
        f570 f570Var = f570.Width;
        s6j.b(0, 0, 0, i, 7);
        sd3Var.getLayoutDirection();
        return o0().getWidth();
    }

    default int Z(sd3 sd3Var, zox zoxVar, int i) {
        if (!z().i.w1().H0()) {
            return zoxVar.l0(i);
        }
        e570 e570Var = e570.Min;
        f570 f570Var = f570.Width;
        s6j.b(0, 0, 0, i, 7);
        sd3Var.getLayoutDirection();
        return o0().getWidth();
    }

    @Override // xsna.noy
    default dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new a(N));
    }

    default int l0(sd3 sd3Var, zox zoxVar, int i) {
        if (!z().i.w1().H0()) {
            return zoxVar.Z(i);
        }
        e570 e570Var = e570.Min;
        f570 f570Var = f570.Width;
        s6j.b(0, i, 0, 0, 13);
        sd3Var.getLayoutDirection();
        return o0().getHeight();
    }

    default int m1(sd3 sd3Var, zox zoxVar, int i) {
        if (!z().i.w1().H0()) {
            return zoxVar.j0(i);
        }
        e570 e570Var = e570.Min;
        f570 f570Var = f570.Width;
        s6j.b(0, i, 0, 0, 13);
        sd3Var.getLayoutDirection();
        return o0().getHeight();
    }

    dp10 o0();
}
