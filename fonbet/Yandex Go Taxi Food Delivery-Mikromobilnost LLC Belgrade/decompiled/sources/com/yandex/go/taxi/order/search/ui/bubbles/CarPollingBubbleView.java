package com.yandex.go.taxi.order.search.ui.bubbles;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.n4h0;
import defpackage.n78;
import defpackage.o78;
import defpackage.tje;
import defpackage.wug0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010\u0011J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010\u0011R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010=R\u0016\u0010A\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=¨\u0006E"}, d2 = {"Lcom/yandex/go/taxi/order/search/ui/bubbles/CarPollingBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", RemoteBioParameters.X, RemoteBioParameters.Y, "Lzy11;", "replaceAnchorAndStartAppearing", "(FF)V", "restartDotsAnimation", "()V", "startBubbleAppearingAnimation", "from", "to", "Landroid/animation/ValueAnimator;", "scaleAnimator", "(FF)Landroid/animation/ValueAnimator;", "alphaAnimator", "(II)Landroid/animation/ValueAnimator;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/mapkit/ScreenPoint;", "screenPoint", "translateAt", "(Lcom/yandex/mapkit/ScreenPoint;)V", "animateBubbleAppearAt", "animateBubbleDisappear", "hidePollingBubble", "Landroid/graphics/Paint;", "bubblePaint", "Landroid/graphics/Paint;", "dotsPaint", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "dstRect", "Landroid/graphics/RectF;", "Landroid/view/animation/Interpolator;", "scaleInterpolator", "Landroid/view/animation/Interpolator;", "Landroid/graphics/Bitmap;", "bubble", "Landroid/graphics/Bitmap;", "dotsAnimator", "Landroid/animation/ValueAnimator;", "bubbleWidth", CA20Status.STATUS_USER_I, "bubbleHeight", "dotsMarginHorizontal", "dotsMarginTop", CarPollingBubbleView.PROPERTY_VALUE_DOT_SIZE_FIRST, "F", CarPollingBubbleView.PROPERTY_VALUE_DOT_SIZE_SECOND, CarPollingBubbleView.PROPERTY_VALUE_DOT_SIZE_THIRD, "bubbleScale", "pointerX", "pointerY", "Companion", "o78", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarPollingBubbleView extends FrameLayout {
    public static final int $stable = 8;
    private static final long BUBBLE_DURATION_MILLIS = 600;
    private static final o78 Companion = new o78();
    private static final long DOTS_ANIMATION_DURATION_MILLIS = 1200;
    private static final String PROPERTY_VALUE_DOT_SIZE_FIRST = "firstDotSize";
    private static final String PROPERTY_VALUE_DOT_SIZE_SECOND = "secondDotSize";
    private static final String PROPERTY_VALUE_DOT_SIZE_THIRD = "thirdDotSize";
    private final Bitmap bubble;
    private final int bubbleHeight;
    private final Paint bubblePaint;
    private float bubbleScale;
    private final int bubbleWidth;
    private final ValueAnimator dotsAnimator;
    private final int dotsMarginHorizontal;
    private final int dotsMarginTop;
    private final Paint dotsPaint;
    private final RectF dstRect;
    private float firstDotSize;
    private float pointerX;
    private float pointerY;
    private final Interpolator scaleInterpolator;
    private float secondDotSize;
    private final Rect srcRect;
    private float thirdDotSize;

    public CarPollingBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.bubblePaint = paint;
        Paint paint2 = new Paint();
        this.dotsPaint = paint2;
        Rect rect = new Rect();
        this.srcRect = rect;
        this.dstRect = new RectF();
        this.scaleInterpolator = new AccelerateInterpolator();
        this.pointerX = -1.0f;
        this.pointerY = -1.0f;
        setWillNotDraw(false);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), n4h0.polling_bubble);
        this.bubble = decodeResource;
        int width = decodeResource.getWidth();
        this.bubbleWidth = width;
        int height = decodeResource.getHeight();
        this.bubbleHeight = height;
        this.bubbleScale = 1.0f;
        rect.set(0, 0, width, height);
        int r = tje.r(wug0.search_poll_dots_min_size, getContext());
        int r2 = tje.r(wug0.search_poll_dots_max_size, getContext());
        this.dotsMarginHorizontal = tje.r(wug0.search_poll_dots_margin, getContext());
        this.dotsMarginTop = tje.r(wug0.search_poll_dots_margin_top, getContext());
        int c = x4e.c(r2, r, 2, r);
        float f = r;
        float f2 = r2;
        float f3 = c;
        ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(PROPERTY_VALUE_DOT_SIZE_FIRST, f, f2, f), PropertyValuesHolder.ofFloat(PROPERTY_VALUE_DOT_SIZE_SECOND, f3, f2, f3, f, f3), PropertyValuesHolder.ofFloat(PROPERTY_VALUE_DOT_SIZE_THIRD, f2, f, f2)).setDuration(1200L);
        this.dotsAnimator = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        duration.addUpdateListener(new n78(this, 2));
        paint.setAntiAlias(true);
        paint2.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        setLayerType(1, paint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CarPollingBubbleView carPollingBubbleView, ValueAnimator valueAnimator) {
        carPollingBubbleView.firstDotSize = ((Float) valueAnimator.getAnimatedValue(PROPERTY_VALUE_DOT_SIZE_FIRST)).floatValue();
        carPollingBubbleView.secondDotSize = ((Float) valueAnimator.getAnimatedValue(PROPERTY_VALUE_DOT_SIZE_SECOND)).floatValue();
        carPollingBubbleView.thirdDotSize = ((Float) valueAnimator.getAnimatedValue(PROPERTY_VALUE_DOT_SIZE_THIRD)).floatValue();
        carPollingBubbleView.invalidate();
    }

    private final ValueAnimator alphaAnimator(int from, int to) {
        ValueAnimator ofInt = ValueAnimator.ofInt(from, to);
        ofInt.setDuration(600L);
        ofInt.setInterpolator(this.scaleInterpolator);
        ofInt.addUpdateListener(new n78(this, 0));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alphaAnimator$lambda$0(CarPollingBubbleView carPollingBubbleView, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        carPollingBubbleView.bubblePaint.setAlpha(intValue);
        carPollingBubbleView.dotsPaint.setAlpha(intValue);
        carPollingBubbleView.invalidate();
    }

    private final void replaceAnchorAndStartAppearing(float x, float y) {
        this.pointerX = x;
        this.pointerY = y;
        startBubbleAppearingAnimation();
        restartDotsAnimation();
    }

    private final void restartDotsAnimation() {
        this.dotsAnimator.cancel();
        this.dotsAnimator.start();
    }

    private final ValueAnimator scaleAnimator(float from, float to) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(this.scaleInterpolator);
        ofFloat.addUpdateListener(new n78(this, 1));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scaleAnimator$lambda$0(CarPollingBubbleView carPollingBubbleView, ValueAnimator valueAnimator) {
        carPollingBubbleView.bubbleScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        carPollingBubbleView.invalidate();
    }

    private final void startBubbleAppearingAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(alphaAnimator(0, 255), scaleAnimator(0.25f, 1.0f));
        animatorSet.start();
    }

    public final void animateBubbleAppearAt(ScreenPoint screenPoint) {
        setVisibility(0);
        replaceAnchorAndStartAppearing(screenPoint.getX(), screenPoint.getY());
    }

    public final void animateBubbleDisappear() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(alphaAnimator(255, 0), scaleAnimator(1.0f, 0.25f));
        animatorSet.start();
    }

    public final void hidePollingBubble() {
        setVisibility(8);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.bubbleWidth;
        float f2 = this.bubbleScale;
        float f3 = f * f2;
        float f4 = this.bubbleHeight * f2;
        float f5 = this.pointerX - (f3 / 2.0f);
        float f6 = this.pointerY - f4;
        this.dstRect.set(f5, f6, f5 + f3, f4 + f6);
        canvas.drawBitmap(this.bubble, this.srcRect, this.dstRect, this.bubblePaint);
        float f7 = this.dotsMarginTop;
        float f8 = this.bubbleScale;
        float f9 = this.dotsMarginHorizontal * f8;
        float f10 = f6 + (f7 * f8);
        float f11 = (f3 / 2.0f) + f5;
        float f12 = this.firstDotSize * f8;
        float f13 = this.secondDotSize * f8;
        float f14 = this.thirdDotSize * f8;
        canvas.drawCircle(f11 - f9, f10, f12, this.dotsPaint);
        canvas.drawCircle(f11, f10, f13, this.dotsPaint);
        canvas.drawCircle(f9 + f11, f10, f14, this.dotsPaint);
    }

    public final void translateAt(ScreenPoint screenPoint) {
        this.pointerX = screenPoint.getX();
        this.pointerY = screenPoint.getY();
    }

    public CarPollingBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CarPollingBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CarPollingBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
