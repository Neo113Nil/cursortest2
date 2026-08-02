package yads;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$drawable;
import xsna.k8z0;

/* loaded from: classes10.dex */
public final class uu0 extends ll3 {
    public final y31 c;

    public uu0(ImageView imageView, y31 y31Var) {
        super(imageView);
        this.c = y31Var;
    }

    @Override // yads.ll3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        x41 x41Var = ((ru0) obj).a;
        if (x41Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        a(x41Var);
    }

    public final void a(x41 x41Var) {
        this.c.a(x41Var, new k8z0(this));
    }

    public static final void a(uu0 uu0Var, Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = (ImageView) uu0Var.b();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) uu0Var.b();
        if (imageView2 != null) {
            imageView2.setImageDrawable(imageView2.getContext().getDrawable(R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
