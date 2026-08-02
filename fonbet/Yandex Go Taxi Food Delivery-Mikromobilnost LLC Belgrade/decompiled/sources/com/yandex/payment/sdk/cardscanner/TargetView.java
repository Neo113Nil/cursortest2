package com.yandex.payment.sdk.cardscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ivg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R$\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/payment/sdk/cardscanner/TargetView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "maxVerticalOffset", CA20Status.STATUS_USER_I, "", "roundSize", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Path;", "targetPath", "Landroid/graphics/Path;", "shadowPath", "Landroid/graphics/Rect;", "value", "targetRect", "Landroid/graphics/Rect;", "getTargetRect", "()Landroid/graphics/Rect;", "cardscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TargetView extends View {
    private final Paint clearPaint;
    private final int maxVerticalOffset;
    private final Paint paint;
    private final float roundSize;
    private final Path shadowPath;
    private final Path targetPath;
    private Rect targetRect;

    public TargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxVerticalOffset = context.getResources().getDimensionPixelOffset(ivg0.paymentsdk_camera_target_vertical_offset);
        this.roundSize = context.getResources().getDimensionPixelSize(ivg0.paymentsdk_camera_target_round_corner);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(ivg0.paymentsdk_camera_target_line_width));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor("#A0000000"));
        paint2.setStyle(Paint.Style.FILL);
        this.clearPaint = paint2;
        this.targetPath = new Path();
        this.shadowPath = new Path();
        this.targetRect = new Rect();
    }

    public final Rect getTargetRect() {
        return this.targetRect;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawPath(this.shadowPath, this.clearPaint);
        canvas.drawPath(this.targetPath, this.paint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float f;
        float f2;
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            float width = getWidth();
            float width2 = (getWidth() * 54.0f) / 86.0f;
            float height = (getHeight() - width2) / 2.0f;
            if (height < this.maxVerticalOffset) {
                float height2 = getHeight() - (this.maxVerticalOffset * 2.0f);
                width *= height2 / width2;
                f = this.maxVerticalOffset;
                f2 = (getWidth() - width) / 2.0f;
                width2 = height2;
            } else {
                f = height;
                f2 = 0.0f;
            }
            float f3 = width + f2;
            float f4 = width2 + f;
            this.targetRect.set((int) f2, (int) f, (int) f3, (int) f4);
            Path path = this.targetPath;
            path.reset();
            float f5 = this.roundSize;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(f2, f, f3, f4, f5, f5, direction);
            Path path2 = this.shadowPath;
            path2.reset();
            path2.addRect(0.0f, 0.0f, getWidth(), getHeight(), direction);
            path2.op(this.targetPath, Path.Op.DIFFERENCE);
        }
    }

    public TargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TargetView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TargetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
