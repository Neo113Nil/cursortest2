package xsna;

import android.view.Choreographer;
import com.vk.core.preference.Preference;
import com.vk.metrics.performance.animation.motionlayout.MotionLayoutScreenType;

/* compiled from: MotionLayoutAnimationPerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class qa30 {
    public final dx90 a;
    public final oa30 b;

    /* compiled from: MotionLayoutAnimationPerformanceChecker.kt */
    public static final class a implements ffs {
        public final MotionLayoutScreenType a;
        public final dx90 b;

        public a(MotionLayoutScreenType motionLayoutScreenType, dx90 dx90Var) {
            this.a = motionLayoutScreenType;
            this.b = dx90Var;
        }

        @Override // xsna.ffs
        public final void a(int i, int i2, long j, long j2) {
            this.b.getClass();
            MotionLayoutScreenType motionLayoutScreenType = this.a;
            ra30 e = dx90.e(motionLayoutScreenType);
            ra30 ra30Var = ra30.c;
            if (e == null) {
                e = ra30Var;
            }
            ra30 f = dx90.f(motionLayoutScreenType);
            if (f != null) {
                ra30Var = f;
            }
            long j3 = e.a + j;
            int i3 = e.b + i;
            long j4 = ra30Var.a + j2;
            int i4 = ra30Var.b + i2;
            Preference.F(j3, "performance", motionLayoutScreenType.l());
            Preference.F(i3, "performance", motionLayoutScreenType.i());
            Preference.F(j4, "performance", motionLayoutScreenType.k());
            Preference.F(i4, "performance", motionLayoutScreenType.j());
        }
    }

    public qa30(Choreographer choreographer, dx90 dx90Var) {
        this.a = dx90Var;
        this.b = new oa30(choreographer);
    }
}
