package defpackage;

import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.material.ripple.b;

/* loaded from: classes10.dex */
public final class ac2 extends b implements ask0 {
    public RippleContainer D;
    public RippleHostView E;

    @Override // defpackage.e530
    public final void onDetach() {
        RippleContainer rippleContainer = this.D;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }
}
