package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.kp50;
import defpackage.rje;
import defpackage.ung0;
import defpackage.ygb0;
import defpackage.zgb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002\u0013#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/PhotoFrameView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lzgb0;", ClidProvider.STATE, "render", "(Lzgb0;)V", "Landroid/graphics/Path;", "holePath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "holePaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "holeBorders", "Landroid/graphics/RectF;", "currentState", "Lzgb0;", "Companion", "ygb0", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoFrameView extends View {
    private zgb0 currentState;
    private RectF holeBorders;
    private final Paint holePaint;
    private final Path holePath;
    public static final ygb0 Companion = new ygb0();
    private static final float CORNER_RADIUS_PX = kp50.t(24);
    private static final float MARGIN_VERTICAL_PX = kp50.t(12);
    private static final float MARGIN_HORIZONTAL_PX = kp50.t(24);

    public PhotoFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        this.holePath = path;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(rje.a(context, ung0.ybColor_background_primary));
        this.holePaint = paint;
        this.holeBorders = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.clipPath(this.holePath);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        RectF rectF = this.holeBorders;
        float f = MARGIN_HORIZONTAL_PX;
        float f2 = MARGIN_VERTICAL_PX;
        rectF.set(f, f2, getWidth() - f, getHeight() - f2);
    }

    public final void render(zgb0 state) {
        invalidate();
    }

    public PhotoFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PhotoFrameView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PhotoFrameView(Context context) {
        this(context, null, 0, 6, null);
    }
}
