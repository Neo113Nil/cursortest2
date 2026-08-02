package defpackage;

import android.animation.ValueAnimator;
import com.lightside.animations.DslAnimator;
import com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout;

/* loaded from: classes11.dex */
public final /* synthetic */ class jl51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((YandexCoreIndicatorTabLayout) obj).lambda$animateToTab$0(valueAnimator);
                break;
            default:
                ((DslAnimator) obj).onUpdate(valueAnimator);
                break;
        }
    }
}
