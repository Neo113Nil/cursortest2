package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes10.dex */
public final class wo1 {
    public final v9 a;
    public final u41 b;

    public /* synthetic */ wo1(v9 v9Var) {
        this(v9Var, new u41());
    }

    public final iw2 a(CustomizableMediaView customizableMediaView, nj2 nj2Var, bp1 bp1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.b.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new iw2(customizableMediaView, bp1Var, new ml3(new f51(imageView, nj2Var, this.a)));
    }

    public wo1(v9 v9Var, u41 u41Var) {
        this.a = v9Var;
        this.b = u41Var;
    }
}
