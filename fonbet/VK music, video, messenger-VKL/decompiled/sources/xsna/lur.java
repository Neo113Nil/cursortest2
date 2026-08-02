package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: FlowerView.kt */
/* loaded from: classes18.dex */
public final class lur extends FrameLayout {
    public final LottieAnimationView b;

    public lur(Context context) {
        super(context, null, 0);
        setVisibility(0);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.b = lottieAnimationView;
        lottieAnimationView.l0();
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lottieAnimationView.U(new kur(this));
        addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void setAnimation(int i) {
        this.b.setAnimation(i);
    }
}
