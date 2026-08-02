package xsna;

import androidx.compose.animation.core.AnimationEndReason;
import xsna.wq2;

/* compiled from: Animatable.kt */
/* loaded from: classes11.dex */
public final class fq2<T, V extends wq2> {
    public final kq2<T, V> a;
    public final AnimationEndReason b;

    public fq2(kq2<T, V> kq2Var, AnimationEndReason animationEndReason) {
        this.a = kq2Var;
        this.b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
