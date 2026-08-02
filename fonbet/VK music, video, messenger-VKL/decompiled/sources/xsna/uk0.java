package xsna;

import android.animation.Animator;
import com.vk.libvideo.live.api.view.AddButtonContract$State;
import com.vk.libvideo.live.impl.views.addbutton.AddButtonView;

/* compiled from: AddButtonView.java */
/* loaded from: classes3.dex */
public final class uk0 implements Animator.AnimatorListener {
    public final /* synthetic */ String b;
    public final /* synthetic */ AddButtonContract$State c;
    public final /* synthetic */ AddButtonView d;

    public uk0(AddButtonView addButtonView, String str, AddButtonContract$State addButtonContract$State) {
        this.d = addButtonView;
        this.b = str;
        this.c = addButtonContract$State;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AddButtonView addButtonView = this.d;
        addButtonView.animate().setListener(null).cancel();
        int i = AddButtonView.g;
        addButtonView.a(this.b, this.c);
        addButtonView.animate().alpha(1.0f).setDuration(300L).start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
