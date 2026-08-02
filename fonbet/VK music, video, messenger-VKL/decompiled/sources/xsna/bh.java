package xsna;

import android.view.View;
import android.widget.PopupMenu;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.stories.design.view.polls.AbstractPollView;

/* compiled from: AbstractPollView.kt */
/* loaded from: classes6.dex */
public final class bh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractPollView b;

    public bh(AbstractPollView abstractPollView) {
        this.b = abstractPollView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractPollView abstractPollView = this.b;
        AppCompatImageView actions = abstractPollView.getActions();
        abstractPollView.m();
        actions.setVisibility(0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        PopupMenu currentMenu = this.b.getCurrentMenu();
        if (currentMenu != null) {
            currentMenu.dismiss();
        }
    }
}
