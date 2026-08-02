package xsna;

import android.view.ViewTreeObserver;
import com.vk.videomessage.impl.BackgroundBlurView;
import com.vkontakte.android.R;

/* compiled from: VideoMessagesCameraView.kt */
/* loaded from: classes7.dex */
public final class ots0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ nts0 b;

    public ots0(nts0 nts0Var) {
        this.b = nts0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nts0 nts0Var = this.b;
        if (((BackgroundBlurView) nts0Var.findViewById(R.id.blur_view)).getDrawInProgress()) {
            return false;
        }
        ViewTreeObserver x = bwt0.x(nts0Var);
        if (x == null) {
            return true;
        }
        x.removeOnPreDrawListener(this);
        return true;
    }
}
