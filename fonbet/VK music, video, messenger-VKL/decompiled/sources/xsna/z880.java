package xsna;

import android.animation.ValueAnimator;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.core.view.components.pagination.a;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.se90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z880 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z880(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                OnMediaUiComponentAnimationDelegate.a aVar = (OnMediaUiComponentAnimationDelegate.a) this.c;
                OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = (OnMediaUiComponentAnimationDelegate) this.d;
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                aVar.getClass();
                if (currentPlayTime >= 167) {
                    onMediaUiComponentAnimationDelegate.b.invoke();
                }
                aVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                onMediaUiComponentAnimationDelegate.a.invoke();
                break;
            default:
                se90 se90Var = (se90) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                if (se90Var.e() == se90.a.Progress) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    VkPaginationDots vkPaginationDots = (VkPaginationDots) ref$ObjectRef.element;
                    if (vkPaginationDots != null) {
                        vkPaginationDots.setMode(new a.b(floatValue));
                        break;
                    }
                }
                break;
        }
    }
}
