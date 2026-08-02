package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class fo2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fo2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AnimationDialog animationDialog = (AnimationDialog) obj;
                int i2 = AnimationDialog.g0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.vk.libvideo.design.view.swipe.layout.a aVar = animationDialog.O;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.setBackgroundAlpha((int) (255 * floatValue));
                com.vk.libvideo.design.view.swipe.layout.a aVar2 = animationDialog.O;
                (aVar2 != null ? aVar2 : null).setVolume(floatValue);
                break;
            default:
                View view = (View) obj;
                int i3 = MusicStickerStyleSwitchingView.k;
                view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
