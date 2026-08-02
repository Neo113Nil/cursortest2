package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;

/* loaded from: classes14.dex */
public final /* synthetic */ class nj2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ nj2(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke((Integer) valueAnimator.getAnimatedValue());
                break;
            case 1:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 2:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 3:
                DriverSectionView.createAnimator$lambda$1$0(tlsVar, valueAnimator);
                break;
            case 4:
                tlsVar.invoke((Integer) valueAnimator.getAnimatedValue());
                break;
            case 5:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 6:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 7:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
            default:
                tlsVar.invoke((Float) valueAnimator.getAnimatedValue());
                break;
        }
    }
}
