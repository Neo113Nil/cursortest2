package xsna;

import android.animation.ValueAnimator;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a980 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a980(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                OnMediaUiComponentAnimationDelegate.d dVar = (OnMediaUiComponentAnimationDelegate.d) this.c;
                OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = (OnMediaUiComponentAnimationDelegate) this.d;
                dVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                onMediaUiComponentAnimationDelegate.a.invoke();
                break;
            default:
                r6y0 r6y0Var = (r6y0) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                float f = r6y0.l;
                float b = u11.b(r6y0.k, f, valueAnimator.getAnimatedFraction(), f);
                r6y0Var.b.invoke(Float.valueOf(b / ref$FloatRef.element));
                ref$FloatRef.element = b;
                break;
        }
    }
}
