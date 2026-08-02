package com.yandex.go.masstransit.sdk.camera.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bgg0;
import defpackage.dgg0;
import defpackage.ep2;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 =2\u00020\u0001:\u0002.>B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001eJ\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0014¢\u0006\u0004\b+\u0010&R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R*\u00103\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b8\u00105R\u0017\u00109\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/yandex/go/masstransit/sdk/camera/view/QrTargetView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "color", "setBackgroundColor", "(I)V", "Landroid/graphics/Paint$Cap;", "strokeCap", "setStrokeCap", "(Landroid/graphics/Paint$Cap;)V", "width", "setTargetRectStrokeWidth", "Landroid/graphics/Rect;", "rect", "setDefaultQrTargetSize", "(Landroid/graphics/Rect;)V", "", "ratio", "setCornerSizeToRectRatio", "(F)V", "setTargetRect", "setCurrentGrabbedQrRect", "resetCurrentGrabbedQrRect", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "defaultQrTargetSize", CA20Status.STATUS_USER_I, "Ldgg0;", "qrTargetRenderer", "Ldgg0;", "", "value", "isActive", "Z", "()Z", "setActive", "(Z)V", "isQrRectGrabbed", "defaultQrTargetRect", "Landroid/graphics/Rect;", "getDefaultQrTargetRect", "()Landroid/graphics/Rect;", "Companion", "bgg0", "camera"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QrTargetView extends View {
    public static final bgg0 Companion = new bgg0();
    private static final float TARGET_CORNER_SIZE_TO_RECT_RATIO = 0.2f;
    private final Rect defaultQrTargetRect;
    private int defaultQrTargetSize;
    private boolean isActive;
    private boolean isQrRectGrabbed;
    private final dgg0 qrTargetRenderer;

    public QrTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.defaultQrTargetSize = tje.u(JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, getContext());
        this.qrTargetRenderer = new dgg0(this);
        this.defaultQrTargetRect = new Rect();
    }

    public final Rect getDefaultQrTargetRect() {
        return this.defaultQrTargetRect;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isQrRectGrabbed, reason: from getter */
    public final boolean getIsQrRectGrabbed() {
        return this.isQrRectGrabbed;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.qrTargetRenderer.j.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dgg0 dgg0Var = this.qrTargetRenderer;
        if (!dgg0Var.k.getIsActive()) {
            canvas.drawColor(dgg0Var.i);
            return;
        }
        canvas.save();
        canvas.clipOutPath(dgg0Var.d);
        canvas.drawColor(dgg0Var.i);
        canvas.restore();
        canvas.drawPath(dgg0Var.g, dgg0Var.h);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        int i = w / 2;
        int i2 = (int) (h / 3.57d);
        int i3 = this.defaultQrTargetSize;
        int i4 = i3 / 2;
        int i5 = i3 / 2;
        this.defaultQrTargetRect.set(i - i4, i2 - i5, i + i4, i2 + i5);
        this.qrTargetRenderer.a(this.defaultQrTargetRect);
    }

    public final void resetCurrentGrabbedQrRect() {
        this.isQrRectGrabbed = false;
        dgg0 dgg0Var = this.qrTargetRenderer;
        Rect rect = this.defaultQrTargetRect;
        dgg0Var.getClass();
        RectF rectF = new RectF(dgg0Var.f);
        ValueAnimator valueAnimator = dgg0Var.j;
        valueAnimator.cancel();
        valueAnimator.addUpdateListener(new ep2(dgg0Var, rectF, rect, dgg0Var.k, 1));
        valueAnimator.start();
    }

    public final void setActive(boolean z) {
        this.isActive = z;
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        dgg0 dgg0Var = this.qrTargetRenderer;
        dgg0Var.i = color;
        dgg0Var.k.invalidate();
    }

    public final void setCornerSizeToRectRatio(float ratio) {
        dgg0 dgg0Var = this.qrTargetRenderer;
        dgg0Var.c = ratio;
        dgg0Var.k.invalidate();
    }

    public final void setCurrentGrabbedQrRect(Rect rect) {
        if (this.isActive) {
            this.isQrRectGrabbed = true;
            dgg0 dgg0Var = this.qrTargetRenderer;
            dgg0Var.getClass();
            RectF rectF = new RectF(dgg0Var.f);
            ValueAnimator valueAnimator = dgg0Var.j;
            valueAnimator.cancel();
            valueAnimator.addUpdateListener(new ep2(dgg0Var, rectF, rect, dgg0Var.k, 1));
            valueAnimator.start();
        }
    }

    public final void setDefaultQrTargetSize(Rect rect) {
        this.defaultQrTargetSize = rect.height();
        this.defaultQrTargetRect.set(rect);
        this.qrTargetRenderer.a(this.defaultQrTargetRect);
        invalidate();
    }

    public final void setStrokeCap(Paint.Cap strokeCap) {
        dgg0 dgg0Var = this.qrTargetRenderer;
        dgg0Var.h.setStrokeCap(strokeCap);
        dgg0Var.k.invalidate();
    }

    public final void setTargetRect(Rect rect) {
        this.qrTargetRenderer.a(rect);
    }

    public final void setTargetRectStrokeWidth(int width) {
        dgg0 dgg0Var = this.qrTargetRenderer;
        dgg0Var.h.setStrokeWidth(width);
        dgg0Var.k.invalidate();
    }

    public QrTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public QrTargetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public QrTargetView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ QrTargetView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
