package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;

/* loaded from: classes10.dex */
public final class ey01 implements ComposeAnimation, dy01 {
    public final zx01 a;

    public ey01(zx01 zx01Var) {
        this.a = zx01Var;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    @Override // defpackage.dy01
    public final zx01 a() {
        return this.a;
    }
}
