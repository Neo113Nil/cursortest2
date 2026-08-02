package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerItem;
import xsna.f5h0;

/* compiled from: ImStickerStaticView.kt */
/* loaded from: classes6.dex */
public final class jdw extends GenericDraweeView implements too0 {
    public final lpa0 i;
    public Boolean j;
    public n1l0 k;
    public boolean l;
    public final kcl0 m;

    public jdw(Context context) {
        super(context, null, 0);
        this.i = rhs.e();
        this.k = StickerItem.l;
        t6g0 t6g0Var = t6g0.b;
        this.m = t6g0.d();
        getHierarchy().o(f5h0.i.a);
    }

    @Override // xsna.too0
    public final void Ng() {
        StickerItem stickerItem = StickerItem.l;
        this.k = StickerItem.l;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void d(Boolean bool) {
        if (this.l) {
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(this.m.z0(this.k, Math.max(getMeasuredWidth(), getMeasuredHeight()), bool != null ? bool.booleanValue() : dhr0.M())));
            h.g = ImageRequest.CacheChoice.SMALL;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            h.d = (measuredWidth <= 0 || measuredHeight <= 0) ? null : new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight, 12);
            ?? a = h.a();
            lpa0 lpa0Var = this.i;
            lpa0Var.d();
            lpa0Var.l = getController();
            lpa0Var.c = a;
            setController(lpa0Var.b());
        }
    }

    public final int getFadeDuration() {
        return getHierarchy().e.m;
    }

    public final n1l0 getSticker$sticker_release() {
        return this.k;
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new UnsupportedOperationException("View supports only EXACTLY");
        }
        setMeasuredDimension(size, size2);
        if (this.l) {
            return;
        }
        this.l = true;
        d(this.j);
    }

    public final void setDarkTheme(Boolean bool) {
        this.j = bool;
    }

    public final void setFadeDuration(int i) {
        getHierarchy().q(i);
    }

    public final void setPlaceholder(Drawable drawable) {
        getHierarchy().p(drawable, 1);
    }

    public final void setSticker$sticker_release(n1l0 n1l0Var) {
        this.k = n1l0Var;
    }
}
