package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.PopupWindow;
import com.vk.stickers.popup.PopupStickerView;

/* compiled from: EasterEggsPopupShowHelper.kt */
/* loaded from: classes14.dex */
public final class dvo extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dvo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 1:
                ((PopupStickerView) this.c).n = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                PopupWindow popupWindow = (PopupWindow) this.c;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    break;
                }
                break;
            case 1:
                PopupStickerView popupStickerView = (PopupStickerView) this.c;
                popupStickerView.n = false;
                gzs<s3q0> gzsVar = popupStickerView.k;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                popupStickerView.b();
                break;
            default:
                ((enh) this.c).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 1:
                ((PopupStickerView) this.c).n = true;
                break;
            case 2:
                s3q0 s3q0Var = s3q0.a;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public dvo(gc gcVar, enh enhVar) {
        this.b = 2;
        this.c = enhVar;
    }
}
