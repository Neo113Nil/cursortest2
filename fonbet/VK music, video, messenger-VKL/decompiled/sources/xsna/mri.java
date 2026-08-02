package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ComposeViewWrapper.kt */
/* loaded from: classes6.dex */
public final class mri extends FrameLayout {
    public final void setContent(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        ixt0 ixt0Var = new ixt0(this);
        while (ixt0Var.hasNext()) {
            View view = (View) ixt0Var.next();
            if (view instanceof ComposeView) {
                ((ComposeView) view).setContent(wzsVar);
            }
        }
    }
}
