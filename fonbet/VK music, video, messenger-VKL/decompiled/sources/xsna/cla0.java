package xsna;

import android.graphics.ColorFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.imageloader.fresco.CallerContext;
import com.vkontakte.android.R;

/* compiled from: PictureViewHolder.kt */
/* loaded from: classes2.dex */
public final class cla0 extends rx5<mka0> {
    public static final int q = iah0.a(94);
    public final SimpleDraweeView p;

    public cla0(View view, c.a aVar) {
        super(view, aVar);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.vkim_background_image);
        bwt0.p0(simpleDraweeView, true);
        this.p = simpleDraweeView;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    @Override // xsna.rx5
    public final void V5(mka0 mka0Var) {
        mka0 mka0Var2 = mka0Var;
        this.m = mka0Var2;
        mka0Var2.getClass();
        Uri uri = mka0Var2.c;
        Uri uri2 = mka0Var2.d;
        Uri uri3 = dhr0.M() ? uri2 : uri;
        SimpleDraweeView simpleDraweeView = this.p;
        if (uri3 != null) {
            lpa0 lpa0Var = rhs.a().get();
            lpa0Var.d();
            lpa0Var.b = CallerContext.Frontend;
            lpa0Var.l = simpleDraweeView.getController();
            if (dhr0.M()) {
                uri = uri2;
            }
            ImageRequestBuilder h = ImageRequestBuilder.h(uri);
            int i = q;
            h.d = i <= 0 ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i, 12);
            lpa0Var.c = h.a();
            simpleDraweeView.setController(lpa0Var.b());
        } else {
            simpleDraweeView.e(null, null);
        }
        mw5 mw5Var = this.m;
        if (mw5Var == null) {
            mw5Var = null;
        }
        boolean isChecked = mw5Var.isChecked();
        ImageView imageView = this.n;
        if (isChecked && !bwt0.K(imageView)) {
            imageView.setImageDrawable(this.o);
            imageView.setColorFilter((ColorFilter) null);
            bwt0.p0(imageView, true);
            imageView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView.animate().scaleX(1.0f).scaleYBy(1.0f).setDuration(100L).start();
        }
        bwt0.p0(imageView, mka0Var2.e);
    }
}
