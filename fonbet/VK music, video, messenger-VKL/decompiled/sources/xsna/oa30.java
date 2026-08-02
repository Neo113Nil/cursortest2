package xsna;

import android.view.Choreographer;

/* compiled from: MotionLayoutAnimationChecker.kt */
/* loaded from: classes3.dex */
public final class oa30 {
    public final Choreographer a;

    /* compiled from: MotionLayoutAnimationChecker.kt */
    public static final class a implements va30 {
        public final gfs a;

        public a(gfs gfsVar) {
            this.a = gfsVar;
        }

        @Override // xsna.va30
        public final void J2() {
            this.a.b();
        }

        @Override // xsna.va30
        public final void Y2() {
            this.a.a();
        }
    }

    public oa30(Choreographer choreographer) {
        this.a = choreographer;
    }
}
