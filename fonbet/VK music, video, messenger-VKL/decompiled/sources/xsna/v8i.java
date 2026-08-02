package xsna;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ComponentActivity.kt */
/* loaded from: classes11.dex */
public final class v8i {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, jai jaiVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(jaiVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(jaiVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (gqo.e(decorView) == null) {
            gqo.f(decorView, componentActivity);
        }
        if (ro.h(decorView) == null) {
            ro.o(decorView, componentActivity);
        }
        if (lyd.f(decorView) == null) {
            lyd.h(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, a);
    }
}
