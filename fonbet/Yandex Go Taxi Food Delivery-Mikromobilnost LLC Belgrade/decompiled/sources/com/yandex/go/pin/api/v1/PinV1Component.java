package com.yandex.go.pin.api.v1;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.g18;
import defpackage.hst;
import defpackage.itb0;
import defpackage.jst;
import defpackage.ktb0;
import defpackage.of2;
import defpackage.otb0;
import defpackage.tje;
import defpackage.wtg0;
import defpackage.yvb0;
import defpackage.z0c0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.pin.PinView;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010&J\u0015\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J/\u0010E\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0014¢\u0006\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010e\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0013\u0010i\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lcom/yandex/go/pin/api/v1/PinV1Component;", "Lru/yandex/taxi/widget/pin/PinView;", "Landroid/content/Context;", "context", "Lyvb0;", "pinFactory", "<init>", "(Landroid/content/Context;Lyvb0;)V", "", "spec", "size", "makeMeasureSpec", "(II)I", "Litb0;", "animationCallback", "Lzy11;", "setAnimationCallback", "(Litb0;)V", "Landroid/view/View;", "pinCircleOverlayView", "setPinCircleOverlayView", "(Landroid/view/View;)V", "", "anchored", "animated", "setAnchored", "(ZZ)V", "Lcom/yandex/go/pin/api/v1/Pin$State;", ClidProvider.STATE, "setState", "(Lcom/yandex/go/pin/api/v1/Pin$State;Z)V", "", "getAnimationDuration", "()J", "playTime", "setAnimationCurrentPlayTime", "(J)V", "stopAnimation", "()V", "getState", "()Lcom/yandex/go/pin/api/v1/Pin$State;", "isTextState", "()Z", "invalidatePinOverlay", "Lktb0;", "listener", "Lg18;", "addListener", "(Lktb0;)Lg18;", "Landroid/graphics/drawable/Drawable;", "idleStateBitmap", "setIdleStateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lz0c0;", "pinV1Style", "setPinV1Style", "(Lz0c0;)V", "", "translationY", "setTranslationY", "(F)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "pinTipShiftLeft", CA20Status.STATUS_USER_I, "pinTipShiftDown", "pinWidth", "pinHeight", "Landroid/graphics/PointF;", "targetOffsetPoint", "Landroid/graphics/PointF;", "Lotb0;", "pin", "Lotb0;", "", "value", "getPinText", "()Ljava/lang/CharSequence;", "setPinText", "(Ljava/lang/CharSequence;)V", "pinText", "getTargetOffset", "()Landroid/graphics/PointF;", "targetOffset", "Landroid/graphics/Rect;", "getPinVisibleBounds", "()Landroid/graphics/Rect;", "pinVisibleBounds", "getPinFullVisibleBounds", "pinFullVisibleBounds", "Lcom/yandex/mapkit/ScreenRect;", "getPinScreenRect", "()Lcom/yandex/mapkit/ScreenRect;", "pinScreenRect", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinV1Component extends PinView {
    public static final int $stable = 8;
    private final otb0 pin;
    private final int pinHeight;
    private final int pinTipShiftDown;
    private final int pinTipShiftLeft;
    private final int pinWidth;
    private final PointF targetOffsetPoint;

    public PinV1Component(Context context, yvb0 yvb0Var) {
        super(context, null, 0, 6, null);
        this.pinTipShiftLeft = tje.r(wtg0.pin_aim_shift_left, getContext());
        this.pinTipShiftDown = tje.r(wtg0.pin_aim_shift_down, getContext());
        this.pinWidth = tje.r(wtg0.pin_width, getContext());
        this.pinHeight = tje.r(wtg0.pin_height, getContext());
        this.targetOffsetPoint = new PointF();
        ((of2) yvb0Var).getClass();
        AnimatedPinView animatedPinView = new AnimatedPinView(context);
        this.pin = animatedPinView;
        addView(animatedPinView);
        setClipChildren(false);
        setImportantForAccessibility(2);
    }

    private final int makeMeasureSpec(int spec, int size) {
        return View.MeasureSpec.getMode(spec) != 1073741824 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : spec;
    }

    public final g18 addListener(ktb0 listener) {
        return this.pin.addListener(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            z = getChildAt(childCount).dispatchTouchEvent(ev);
            if (z) {
                return z;
            }
        }
        return z;
    }

    public final long getAnimationDuration() {
        return this.pin.getAnimationDuration();
    }

    public final Rect getPinFullVisibleBounds() {
        return this.pin.getPinFullVisibleBounds();
    }

    public final ScreenRect getPinScreenRect() {
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        float x = getX() + 0.0f;
        float y = getY() + 0.0f;
        float x2 = (getX() + getWidth()) - 0.0f;
        float y2 = (getY() + getHeight()) - 0.0f;
        if (x < x2 && y < y2) {
            return new ScreenRect(new ScreenPoint(x, y), new ScreenPoint(x2, y2));
        }
        hst hstVar = jst.e;
        new IllegalStateException();
        hstVar.getClass();
        return null;
    }

    public final CharSequence getPinText() {
        return this.pin.getPinText();
    }

    @Override // ru.yandex.taxi.widget.pin.PinView
    public Rect getPinVisibleBounds() {
        return this.pin.getPinVisibleBounds();
    }

    public final Pin$State getState() {
        return this.pin.getState();
    }

    @Override // ru.yandex.taxi.widget.pin.PinView
    /* renamed from: getTargetOffset, reason: from getter */
    public PointF getTargetOffsetPoint() {
        return this.targetOffsetPoint;
    }

    public final void invalidatePinOverlay() {
        this.pin.invalidatePinOverlay();
    }

    public final boolean isTextState() {
        return this.pin.isTextState();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(makeMeasureSpec(widthMeasureSpec, this.pinWidth), makeMeasureSpec(heightMeasureSpec, this.pinHeight));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        PointF pointF = this.targetOffsetPoint;
        pointF.x = (w / 2.0f) - this.pinTipShiftLeft;
        pointF.y = (h / 2.0f) + this.pinTipShiftDown;
    }

    public final void setAnchored(boolean anchored, boolean animated) {
        this.pin.setAnchored(anchored, animated);
    }

    public final void setAnimationCallback(itb0 animationCallback) {
        this.pin.setAnimationCallback(animationCallback);
    }

    public final void setAnimationCurrentPlayTime(long playTime) {
        this.pin.setAnimationCurrentPlayTime(playTime);
    }

    public final void setIdleStateDrawable(Drawable idleStateBitmap) {
        this.pin.setIdleStateDrawable(idleStateBitmap);
    }

    public final void setPinCircleOverlayView(View pinCircleOverlayView) {
        this.pin.setPinCircleOverlayView(pinCircleOverlayView);
    }

    public final void setPinText(CharSequence charSequence) {
        this.pin.setPinText(charSequence);
    }

    public final void setPinV1Style(z0c0 pinV1Style) {
        this.pin.setStyle(pinV1Style);
    }

    public final void setState(Pin$State state, boolean animated) {
        this.pin.setState(state, animated);
    }

    @Override // android.view.View
    public void setTranslationY(float translationY) {
        super.setTranslationY(translationY);
        this.pin.setParentTranslationY(translationY);
    }

    public final void stopAnimation() {
        this.pin.stopAnimation();
    }
}
