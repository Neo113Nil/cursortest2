package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f5h0;

/* compiled from: AlbumImageView.kt */
/* loaded from: classes18.dex */
public final class li1 extends FrameLayout {
    public boolean b;
    public final a c;
    public final VkPicture d;
    public final bpn0 e;
    public final bpn0 f;

    public li1(Context context) {
        super(context, null, 0);
        a aVar = new a(this, iah0.b(4.0f));
        this.c = aVar;
        VkPicture vkPicture = new VkPicture(context, null, 0);
        this.d = vkPicture;
        this.e = new bpn0(new ic(this, 4));
        this.f = new bpn0(new uz(1));
        addView(vkPicture, new FrameLayout.LayoutParams(-1, -1));
        vkPicture.setOverlayImage(aVar);
        vkPicture.setCornerRadius(4.0f);
        vkPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private final jwx getBlurPostProcessor() {
        return (jwx) this.f.getValue();
    }

    private final PorterDuffColorFilter getBlurredOverlayColorFilter() {
        return (PorterDuffColorFilter) this.e.getValue();
    }

    public final void a(String str, boolean z) {
        VkPicture vkPicture = this.d;
        if (z) {
            vkPicture.setActualColorFilter(getBlurredOverlayColorFilter());
            kci.o(vkPicture, getBlurPostProcessor());
        } else {
            vkPicture.setVkPostprocessor(null);
            str = null;
        }
        vkPicture.setOverlayImage(new a5h0(z ? new baf0(dhr0.t.a(R.drawable.vk_icon_hide_outline_56), -1) : dhr0.t.b(R.drawable.vk_icon_do_not_disturb_outline_56, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary), f5h0.g.a));
        vkPicture.o0(str, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final a getOverlay() {
        return this.c;
    }

    public final boolean getQuad() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        a aVar = this.c;
        RectF rectF = aVar.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        Paint paint = aVar.d;
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
        Path path = aVar.c;
        path.reset();
        float f = aVar.a;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        aVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setCornerRadius(float f) {
        this.d.setCornerRadius(f);
    }

    public final void setPlaceholderImage(Drawable drawable) {
        this.d.setPlaceholderImage(drawable);
    }

    public final void setQuad(boolean z) {
        this.b = z;
    }

    /* compiled from: AlbumImageView.kt */
    public final class a extends Drawable {
        public final float a;
        public final RectF b = new RectF();
        public final Path c = new Path();
        public final Paint d;

        public a(li1 li1Var, float f) {
            this.a = f;
            Paint paint = new Paint(1);
            Context context = li1Var.getContext();
            e3m.a aVar = e3m.a;
            paint.setColor(context.getColor(R.color.vk_black_alpha8));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(iah0.b(0.3f));
            this.d = paint;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            canvas.drawPath(this.c, this.d);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
