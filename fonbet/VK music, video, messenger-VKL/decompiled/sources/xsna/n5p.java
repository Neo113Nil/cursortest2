package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: EditorTransitionAnimator.kt */
/* loaded from: classes4.dex */
public final class n5p {
    public final FrameLayout a;
    public final ViewGroup b;

    /* compiled from: EditorTransitionAnimator.kt */
    public static final class a {
        public final gzs<s3q0> a;
        public final gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            this.a = gzsVar;
            this.b = gzsVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gzs<s3q0> gzsVar = this.b;
            return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
        }

        public final String toString() {
            return "AnimateConfig(runnable=" + this.a + ", onEnd=" + this.b + ")";
        }
    }

    public n5p(FrameLayout frameLayout, ConstraintLayout constraintLayout) {
        this.a = frameLayout;
        this.b = constraintLayout;
    }
}
