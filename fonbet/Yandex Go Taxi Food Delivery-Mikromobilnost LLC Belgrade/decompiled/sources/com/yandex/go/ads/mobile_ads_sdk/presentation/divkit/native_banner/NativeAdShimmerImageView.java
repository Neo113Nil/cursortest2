package com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.sls;
import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/go/ads/mobile_ads_sdk/presentation/divkit/native_banner/NativeAdShimmerImageView;", "Lcom/yandex/go/design/view/GoImageView;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lru/yandex/taxi/theme/ThemeType;", "themeTypeProvider", "Lkotlin/Function1;", "", "shimmeringColorResolver", "<init>", "(Landroid/content/Context;Lsls;Ltls;)V", "Lzy11;", "refreshCenterColor", "()V", "showShimmer", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lsls;", "Ltls;", "Lru/yandex/taxi/widget/ShimmeringPaint;", "loadingShimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "appliedCenterColor", "Ljava/lang/Integer;", "", "isLoading", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAdShimmerImageView extends GoImageView {
    private Integer appliedCenterColor;
    private boolean isLoading;
    private final ShimmeringPaint loadingShimmeringPaint;
    private final tls shimmeringColorResolver;
    private final sls themeTypeProvider;

    public NativeAdShimmerImageView(Context context, sls slsVar, tls tlsVar) {
        super(context, null, 0, 6, null);
        this.themeTypeProvider = slsVar;
        this.shimmeringColorResolver = tlsVar;
        this.loadingShimmeringPaint = new ShimmeringPaint(context);
    }

    private final void refreshCenterColor() {
        int intValue = ((Number) this.shimmeringColorResolver.invoke(this.themeTypeProvider.invoke())).intValue();
        Integer num = this.appliedCenterColor;
        if (num != null && intValue == num.intValue()) {
            return;
        }
        this.loadingShimmeringPaint.setColors(intValue, 16777215);
        this.appliedCenterColor = Integer.valueOf(intValue);
    }

    @Override // com.yandex.go.design.view.GoImageView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        refreshCenterColor();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.isLoading) {
            super.onDraw(canvas);
            return;
        }
        refreshCenterColor();
        this.loadingShimmeringPaint.updateOffset(this);
        this.loadingShimmeringPaint.updateShimmering();
        postInvalidateOnAnimation();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.loadingShimmeringPaint);
    }

    @Override // com.yandex.go.design.view.GoImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        if (bm != null) {
            this.isLoading = false;
            invalidate();
        }
    }

    @Override // com.yandex.go.design.view.GoImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.isLoading = false;
            invalidate();
        }
    }

    public final void showShimmer() {
        setVisibility(0);
        refreshCenterColor();
        this.isLoading = true;
        this.loadingShimmeringPaint.updateOffset(this);
        postInvalidateOnAnimation();
    }
}
