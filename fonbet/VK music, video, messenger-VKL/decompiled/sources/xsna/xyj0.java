package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class xyj0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ SkeletonScreenContent c;

    public xyj0(LinearLayout linearLayout, SkeletonScreenContent skeletonScreenContent) {
        this.b = linearLayout;
        this.c = skeletonScreenContent;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.c.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
