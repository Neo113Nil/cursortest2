package xsna;

import android.view.View;
import com.vk.stories.design.view.polls.SimplePollView;

/* compiled from: SimplePollView.kt */
/* loaded from: classes6.dex */
public final class trj0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ SimplePollView b;

    public trj0(SimplePollView simplePollView) {
        this.b = simplePollView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SimplePollView simplePollView = this.b;
        simplePollView.j0.a = simplePollView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.j0.a = null;
    }
}
