package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.stickers.popup.PopupStickerView;

/* compiled from: PopupStickerView.kt */
/* loaded from: classes6.dex */
public final class wxb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ PopupStickerView b;
    public final /* synthetic */ da50 c;

    public wxb0(PopupStickerView popupStickerView, da50 da50Var) {
        this.b = popupStickerView;
        this.c = da50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.b.setVisibility(8);
        this.c.invoke();
    }
}
