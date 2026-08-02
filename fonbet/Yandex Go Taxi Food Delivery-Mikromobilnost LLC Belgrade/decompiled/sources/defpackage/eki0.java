package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eki0 {
    public final View a;
    public final ig2 b;
    public final ValueAnimator c;

    public eki0(View view, ig2 ig2Var, ValueAnimator valueAnimator) {
        this.a = view;
        this.b = ig2Var;
        this.c = valueAnimator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eki0)) {
            return false;
        }
        eki0 eki0Var = (eki0) obj;
        return jl40.l(this.a, eki0Var.a) && jl40.l(this.b, eki0Var.b) && this.c.equals(eki0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ig2 ig2Var = this.b;
        return this.c.hashCode() + ((hashCode + (ig2Var == null ? 0 : ig2Var.hashCode())) * 31);
    }

    public final String toString() {
        return "AnimationState(view=" + this.a + ", viewHolder=" + this.b + ", animator=" + this.c + Extension.C_BRAKE;
    }
}
