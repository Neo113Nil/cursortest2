package com.yandex.messaging.internal.view.custom;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ai91;
import defpackage.fx00;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.tls;
import defpackage.vif0;
import defpackage.wwg0;
import defpackage.yso;
import defpackage.z83;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010#J\u0017\u0010)\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b+\u0010#J\u0017\u0010,\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b,\u0010#J\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100R\"\u00101\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00103\"\u0004\b8\u00105RF\u0010;\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n\u0018\u0001092\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n\u0018\u0001098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010A\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R$\u0010%\u001a\u00020$2\u0006\u0010:\u001a\u00020$8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b%\u0010D\"\u0004\bE\u0010'R\u0014\u0010F\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u0014\u0010K\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010IR\u0014\u0010M\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u001c\u0010V\u001a\n U*\u0004\u0018\u00010Q0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010SR\u001c\u0010W\u001a\n U*\u0004\u0018\u00010Q0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010SR$\u0010X\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bX\u0010O\"\u0004\bY\u0010\u000fR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010b¨\u0006f"}, d2 = {"Lcom/yandex/messaging/internal/view/custom/ProgressIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setInitialState", "()V", "progressPercent", "setLoadingState", "(I)V", "setRetryState", "setErrorState", "setLoadedState", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/messaging/internal/view/custom/ProgressIndicator$Companion$State;", ClidProvider.STATE, "onLoadingStateChanged", "(Lcom/yandex/messaging/internal/view/custom/ProgressIndicator$Companion$State;)V", "drawBackground", "drawInitialState", "drawProgress", "drawRetry", "drawDiskError", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "toRectF", "(Landroid/graphics/Rect;)Landroid/graphics/RectF;", "isGif", "Z", "()Z", "setGif", "(Z)V", "showProgress", "getShowProgress", "setShowProgress", "Lkotlin/Function1;", "value", "onClickAction", "Ltls;", "getOnClickAction", "()Ltls;", "setOnClickAction", "(Ltls;)V", "onStateChangeListener", "getOnStateChangeListener", "setOnStateChangeListener", "Lcom/yandex/messaging/internal/view/custom/ProgressIndicator$Companion$State;", "setState", "viewRectF", "Landroid/graphics/RectF;", "viewRect", "Landroid/graphics/Rect;", "progressRect", "iconGifRect", "iconRetryRect", "iconCloseRect", "xRetryOffset", CA20Status.STATUS_USER_I, "yRetryOffset", "Landroid/graphics/drawable/Drawable;", "iconGif", "Landroid/graphics/drawable/Drawable;", "iconRetry", "kotlin.jvm.PlatformType", "iconClose", "iconYaDiskError", "progress", "setProgress", "", "progressStartAngle", "F", "Landroid/animation/ValueAnimator;", "progressAnimation", "Landroid/animation/ValueAnimator;", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/Paint;", "backgroundPaint", "Companion", "vif0", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProgressIndicator extends View {
    public static final int $stable = 8;
    private static final float PROGRESS_ARC_ANGLE = 270.0f;
    private final Paint backgroundPaint;
    private final Drawable iconClose;
    private final Rect iconCloseRect;
    private final Drawable iconGif;
    private final Rect iconGifRect;
    private final Drawable iconRetry;
    private final Rect iconRetryRect;
    private final Drawable iconYaDiskError;
    private boolean isGif;
    private tls onClickAction;
    private tls onStateChangeListener;
    private int progress;
    private ValueAnimator progressAnimation;
    private final Paint progressPaint;
    private final RectF progressRect;
    private float progressStartAngle;
    private boolean showProgress;
    private ProgressIndicator$Companion$State state;
    private final Rect viewRect;
    private final RectF viewRectF;
    private final int xRetryOffset;
    private final int yRetryOffset;
    public static final vif0 Companion = new vif0();
    private static final float PROGRESS_OFFSET = kjs0.b(4);
    private static final int DEFAULT_SIZE = kjs0.b(36);

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.showProgress = true;
        this.state = ProgressIndicator$Companion$State.Initial;
        this.viewRectF = new RectF();
        this.viewRect = new Rect();
        this.progressRect = new RectF();
        this.iconGifRect = new Rect();
        this.iconRetryRect = new Rect();
        this.iconCloseRect = new Rect();
        this.xRetryOffset = kjs0.b(5);
        this.yRetryOffset = kjs0.b(5);
        Drawable drawable = context.getResources().getDrawable(wwg0.msg_indicator_gif, context.getTheme());
        this.iconGif = drawable;
        Drawable drawable2 = context.getResources().getDrawable(wwg0.msg_indicator_retry, context.getTheme());
        this.iconRetry = drawable2;
        Drawable drawable3 = context.getResources().getDrawable(wwg0.msg_indicator_close, context.getTheme());
        this.iconClose = drawable3;
        Drawable drawable4 = context.getResources().getDrawable(wwg0.msg_ic_yadisk_error, context.getTheme());
        this.iconYaDiskError = drawable4;
        this.progress = -1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(800L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new yso(22, this));
        this.progressAnimation = ofFloat;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kjs0.b(2));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        paint2.setAlpha((int) Math.floor(102.0d));
        this.backgroundPaint = paint2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k3i0.ImageProgressIndicator);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(k3i0.ImageProgressIndicator_android_tint);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            paint.setColor(defaultColor);
            drawable.setTint(defaultColor);
            drawable2.setTint(defaultColor);
            drawable3.setTint(defaultColor);
            drawable4.setTint(defaultColor);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_onClickAction_$lambda$0(tls tlsVar, ProgressIndicator progressIndicator, View view) {
        tlsVar.invoke(progressIndicator.state);
    }

    private final void drawBackground(Canvas canvas) {
        if (this.state == ProgressIndicator$Companion$State.Error) {
            return;
        }
        float width = getWidth() / 2.0f;
        canvas.drawRoundRect(this.viewRectF, width, width, this.backgroundPaint);
    }

    private final void drawDiskError(Canvas canvas) {
        if (this.state != ProgressIndicator$Companion$State.Error) {
            return;
        }
        this.iconYaDiskError.draw(canvas);
    }

    private final void drawInitialState(Canvas canvas) {
        if (this.state == ProgressIndicator$Companion$State.Initial && this.isGif) {
            this.iconGif.draw(canvas);
        }
    }

    private final void drawProgress(Canvas canvas) {
        if (this.state != ProgressIndicator$Companion$State.Loading) {
            z83.c(null, this.progressAnimation.isStarted());
            return;
        }
        this.iconClose.draw(canvas);
        int i = this.progress;
        ValueAnimator valueAnimator = this.progressAnimation;
        if (i != -1) {
            z83.c(null, valueAnimator.isStarted());
            canvas.drawArc(this.progressRect, this.progressStartAngle, (this.progress * 360.0f) / 100.0f, false, this.progressPaint);
        } else {
            if (!valueAnimator.isStarted()) {
                this.progressAnimation.start();
            }
            canvas.drawArc(this.progressRect, this.progressStartAngle, 270.0f, false, this.progressPaint);
        }
    }

    private final void drawRetry(Canvas canvas) {
        if (this.state != ProgressIndicator$Companion$State.Retry) {
            return;
        }
        z83.c(null, this.progressAnimation.isStarted());
        this.iconRetry.draw(canvas);
    }

    private final void onLoadingStateChanged(ProgressIndicator$Companion$State state) {
        tls tlsVar = this.onStateChangeListener;
        if (tlsVar != null) {
            tlsVar.invoke(state);
        }
        if (state != ProgressIndicator$Companion$State.Loading) {
            this.progressAnimation.cancel();
        } else if (this.progress >= 0 || !this.showProgress) {
            this.progressAnimation.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void progressAnimation$lambda$2$lambda$1(ProgressIndicator progressIndicator, ValueAnimator valueAnimator) {
        progressIndicator.progressStartAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        progressIndicator.invalidate();
    }

    public static /* synthetic */ void setLoadingState$default(ProgressIndicator progressIndicator, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        progressIndicator.setLoadingState(i);
    }

    private final void setProgress(int i) {
        this.progress = Math.max(-1, Math.min(i, 100));
    }

    private final void setState(ProgressIndicator$Companion$State progressIndicator$Companion$State) {
        if (this.state != progressIndicator$Companion$State || progressIndicator$Companion$State == ProgressIndicator$Companion$State.Loading) {
            this.state = progressIndicator$Companion$State;
            onLoadingStateChanged(progressIndicator$Companion$State);
            invalidate();
        }
    }

    private final RectF toRectF(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final tls getOnClickAction() {
        return this.onClickAction;
    }

    public final tls getOnStateChangeListener() {
        return this.onStateChangeListener;
    }

    public final boolean getShowProgress() {
        return this.showProgress;
    }

    /* renamed from: isGif, reason: from getter */
    public final boolean getIsGif() {
        return this.isGif;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        animate().cancel();
        this.progressAnimation.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas);
        drawInitialState(canvas);
        drawProgress(canvas);
        drawRetry(canvas);
        drawDiskError(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.viewRect.set(0, 0, getWidth(), getHeight());
        this.viewRectF.set(toRectF(this.viewRect));
        RectF rectF = this.progressRect;
        float f = PROGRESS_OFFSET;
        rectF.set(f, f, getWidth() - f, getHeight() - f);
        int width = (getWidth() - this.iconGif.getIntrinsicWidth()) / 2;
        int height = (getHeight() - this.iconGif.getIntrinsicHeight()) / 2;
        this.iconGifRect.set(width, height, getWidth() - width, getHeight() - height);
        this.iconGif.setBounds(this.iconGifRect);
        this.iconRetryRect.set(this.xRetryOffset, this.yRetryOffset, getWidth() - this.xRetryOffset, getHeight() - this.yRetryOffset);
        this.iconRetry.setBounds(this.iconRetryRect);
        this.iconYaDiskError.setBounds(this.iconRetryRect);
        int width2 = getWidth() / 3;
        int height2 = getHeight() / 3;
        this.iconCloseRect.set(width2, height2, getWidth() - width2, getHeight() - height2);
        this.iconClose.setBounds(this.iconCloseRect);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getLayoutParams().width == -2) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(DEFAULT_SIZE, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }

    public final void setErrorState() {
        ai91.f(this, isAttachedToWindow());
        setState(ProgressIndicator$Companion$State.Error);
    }

    public final void setGif(boolean z) {
        this.isGif = z;
    }

    public final void setInitialState() {
        boolean z = this.isGif;
        boolean isAttachedToWindow = isAttachedToWindow();
        if (z) {
            ai91.f(this, isAttachedToWindow);
        } else {
            ai91.c(this, isAttachedToWindow);
        }
        setState(ProgressIndicator$Companion$State.Initial);
    }

    public final void setLoadedState() {
        ai91.c(this, isAttachedToWindow());
        setState(ProgressIndicator$Companion$State.Loaded);
    }

    public final void setLoadingState(int progressPercent) {
        boolean z = this.showProgress;
        boolean isAttachedToWindow = isAttachedToWindow();
        if (z) {
            ai91.f(this, isAttachedToWindow);
        } else {
            ai91.c(this, isAttachedToWindow);
        }
        setProgress(progressPercent);
        setState(ProgressIndicator$Companion$State.Loading);
    }

    public final void setOnClickAction(tls tlsVar) {
        this.onClickAction = tlsVar;
        if (tlsVar != null) {
            setOnClickListener(new fx00(27, tlsVar, this));
        } else {
            setOnClickListener(null);
        }
    }

    public final void setOnStateChangeListener(tls tlsVar) {
        this.onStateChangeListener = tlsVar;
    }

    public final void setRetryState() {
        ai91.f(this, isAttachedToWindow());
        setState(ProgressIndicator$Companion$State.Retry);
    }

    public final void setShowProgress(boolean z) {
        this.showProgress = z;
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProgressIndicator(Context context) {
        this(context, null, 0, 6, null);
    }
}
