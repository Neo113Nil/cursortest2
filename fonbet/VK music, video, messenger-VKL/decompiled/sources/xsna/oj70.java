package xsna;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: NotificationsIconViewController.kt */
/* loaded from: classes16.dex */
public final class oj70 {
    public final View a;
    public final gzs<s3q0> b;
    public ImageView c;
    public View d;
    public TextView e;
    public int f;

    public oj70(View view, gzs<s3q0> gzsVar) {
        this.a = view;
        this.b = gzsVar;
    }

    public final void a(int i) {
        if (i > 0 && i != this.f) {
            ImageView imageView = this.c;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        TextView textView = this.e;
        if (textView != null) {
            int i2 = this.f;
            if (i2 <= 0 && i > 0) {
                bwt0.W(textView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, new mj70(textView, i));
            } else if (i2 <= 0 || i > 0) {
                bwt0.p0(textView, i > 0);
                textView.setText(cn70.g(i));
            } else {
                bwt0.W(textView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new nj70(textView, i));
            }
        }
        this.f = i;
        View view = this.d;
        if (view != null) {
            bwt0.p0(view, false);
        }
    }

    public final View b() {
        View view = this.a;
        ImageView imageView = (ImageView) view.findViewById(R.id.notifications_button);
        imageView.setOnClickListener(new sa6(this, 7));
        this.c = imageView;
        this.d = view.findViewById(R.id.dot);
        this.e = (TextView) view.findViewById(R.id.counter);
        return view;
    }
}
