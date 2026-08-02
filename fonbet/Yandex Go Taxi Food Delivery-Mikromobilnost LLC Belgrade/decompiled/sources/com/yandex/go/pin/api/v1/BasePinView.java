package com.yandex.go.pin.api.v1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.b3h0;
import defpackage.fvb1;
import defpackage.g18;
import defpackage.itb0;
import defpackage.jl40;
import defpackage.jub0;
import defpackage.ktb0;
import defpackage.nf2;
import defpackage.ny61;
import defpackage.otb0;
import defpackage.pwf0;
import defpackage.tje;
import defpackage.vng;
import defpackage.wtg0;
import defpackage.xqg0;
import defpackage.y65;
import defpackage.z0c0;
import defpackage.zxf0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.f;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.pin.OvalShadowShape;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0098\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H$¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001aH$¢\u0006\u0004\b3\u0010\u001cJ\u000f\u00104\u001a\u00020\u0017H$¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\fH\u0014¢\u0006\u0004\b5\u0010.J\u0017\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010.J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\bI\u0010\u0016J\u0019\u0010L\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u00020\f2\b\b\u0001\u0010V\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010\u000eJ\u0017\u0010X\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bX\u0010\u000eJ\u0017\u0010Y\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\bY\u0010\u0016J\u000f\u0010Z\u001a\u00020\fH\u0002¢\u0006\u0004\bZ\u0010.J\u0019\u0010[\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b[\u0010\u0016J\u000f\u0010\\\u001a\u00020:H\u0002¢\u0006\u0004\b\\\u0010]R\"\u00100\u001a\u00020/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010^\u001a\u0004\b_\u0010`\"\u0004\b1\u0010aR\u0016\u0010b\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010^R\u0016\u0010c\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010fR\u0016\u0010j\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010fR\u0016\u0010l\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010mR\u0016\u0010o\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010p\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010mR\u0016\u0010q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010mR\u0018\u0010y\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020C0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010H\u001a\u0004\u0018\u00010\u00112\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00118\u0004@BX\u0084\u000e¢\u0006\r\n\u0004\bH\u0010f\u001a\u0005\b\u0083\u0001\u0010\u0013R\u0019\u0010\u0084\u0001\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R0\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008f\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0090\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u001cR\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0091\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/yandex/go/pin/api/v1/BasePinView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Lotb0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinCircle", "Lzy11;", "setPinCircleDrawable", "(I)V", "eyeRes", "setEyeDrawable", "Landroid/graphics/drawable/Drawable;", "getPinErrorDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable", "setPinErrorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lnf2;", "pinAnimatorStartValues", "()Lnf2;", "", "isAnchored", "()Z", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "pinCircleOverlayView", "setPinCircleOverlayView", "(Landroid/view/View;)V", "anchored", "animated", "setAnchored", "(ZZ)V", "", "playTime", "setAnimationCurrentPlayTime", "(J)V", "stopAnimation", "()V", "Lcom/yandex/go/pin/api/v1/Pin$State;", ClidProvider.STATE, "setState", "(Lcom/yandex/go/pin/api/v1/Pin$State;Z)V", "animateTransitions", "getAnimatedParams", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "translationY", "setParentTranslationY", "(F)V", "invalidatePinOverlay", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lktb0;", "listener", "Lg18;", "addListener", "(Lktb0;)Lg18;", "idleStateDrawable", "setIdleStateDrawable", "Litb0;", "animationCallback", "setAnimationCallback", "(Litb0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lz0c0;", "style", "setStyle", "(Lz0c0;)V", "columnDrawable", "setPinColumnDrawable", "processOverlayVisibility", "setIntrinsicSizeAndCenter", "processOverlayViewTranslation", "setInternalIdleStateDrawable", "calcCircleOffsetY", "()F", "Lcom/yandex/go/pin/api/v1/Pin$State;", "getState", "()Lcom/yandex/go/pin/api/v1/Pin$State;", "(Lcom/yandex/go/pin/api/v1/Pin$State;)V", "previousState", "previousStateStartTime", "J", "eyeDrawable", "Landroid/graphics/drawable/Drawable;", "pinCircleDrawable", "pinColumnDrawable", "pinShadowDrawable", "pinDotDrawable", "pinErrorDrawable", "pinCircleCenterOffset", "F", "pinColumnHeight", "eyeRadius", "parentTranslationY", "shadowRadius", CA20Status.STATUS_USER_I, "columnHalfWidth", "Z", "Lru/yandex/taxi/widget/pin/OvalShadowShape;", "shadowShape", "Lru/yandex/taxi/widget/pin/OvalShadowShape;", "pinCircleVerticalTranslate", "pinOverlayView", "Landroid/view/View;", "Lru/yandex/taxi/utils/f;", "stateChangeListeners", "Lru/yandex/taxi/utils/f;", "Litb0;", "Ljub0;", "pinAnimator", "Ljub0;", "value", "getIdleStateDrawable", "currentStyle", "Lz0c0;", "", "text", "getPinText", "()Ljava/lang/CharSequence;", "setPinText", "(Ljava/lang/CharSequence;)V", "pinText", "getAnimationDuration", "()J", "animationDuration", "isTextState", "Landroid/graphics/Rect;", "getPinVisibleBounds", "()Landroid/graphics/Rect;", "pinVisibleBounds", "getPinFullVisibleBounds", "pinFullVisibleBounds", "Companion", "y65", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePinView extends RobotoTextView implements otb0 {
    public static final int $stable = 8;
    private static final y65 Companion = new y65();
    private static final int MAX_CLIP_LEVEL = 10000;
    private boolean anchored;
    private itb0 animationCallback;
    private int columnHalfWidth;
    private z0c0 currentStyle;
    private Drawable eyeDrawable;
    private float eyeRadius;
    private Drawable idleStateDrawable;
    private float parentTranslationY;
    private final jub0 pinAnimator;
    private float pinCircleCenterOffset;
    private Drawable pinCircleDrawable;
    private float pinCircleVerticalTranslate;
    private Drawable pinColumnDrawable;
    private float pinColumnHeight;
    private final Drawable pinDotDrawable;
    private Drawable pinErrorDrawable;
    private View pinOverlayView;
    private final Drawable pinShadowDrawable;
    private Pin$State previousState;
    private long previousStateStartTime;
    private int shadowRadius;
    private final OvalShadowShape shadowShape;
    private Pin$State state;
    private final f stateChangeListeners;

    public BasePinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Pin$State pin$State = Pin$State.IDLE;
        this.state = pin$State;
        this.previousState = pin$State;
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.stateChangeListeners = new f(ktb0.class);
        this.animationCallback = (itb0) ((zxf0) pwf0.c(itb0.class));
        this.pinAnimator = new jub0(new fvb1(this), pinAnimatorStartValues());
        Context context2 = getContext();
        this.currentStyle = new z0c0(context2.getColor(xqg0.source_pin_main_color), context2.getColor(xqg0.source_pin_dark_color), context2.getColor(xqg0.pin_text_color), true);
        setGravity(17);
        setPadding(getPaddingLeft(), -5, getPaddingRight(), getPaddingBottom());
        setIncludeFontPadding(false);
        setLineSpacing(0.0f, 0.8f);
        setTextColor(getContext().getColor(xqg0.pin_text_color));
        setTextSize(0, tje.r(wtg0.pin_text_size_primary, getContext()));
        setPinCircleDrawable(b3h0.pin_circle);
        setPinColumnDrawable(b3h0.pin_column);
        OvalShadowShape ovalShadowShape = new OvalShadowShape();
        this.shadowShape = ovalShadowShape;
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShadowShape);
        this.pinShadowDrawable = shapeDrawable;
        int i2 = this.shadowRadius;
        int i3 = -i2;
        shapeDrawable.setBounds(i3, i3, i2, i2);
        Drawable t = vng.t(b3h0.pin_dot, getContext());
        this.pinDotDrawable = t;
        if (t != null) {
            setIntrinsicSizeAndCenter(t);
        }
        setEyeDrawable(b3h0.ic_pin_default_beacon);
        setPinErrorDrawable(getPinErrorDrawable());
        setStyle(this.currentStyle);
    }

    private final float calcCircleOffsetY() {
        float c = this.pinAnimator.c(AnimatedParams$Index.BASE_OFFSET);
        float c2 = this.pinAnimator.c(AnimatedParams$Index.CONTENT_OFFSET);
        float height = getHeight();
        int i = this.shadowRadius;
        return ((((height - (i / 2.0f)) - ((i / 2.0f) * c)) + this.columnHalfWidth) - (this.pinCircleCenterOffset * 2.0f)) - (this.pinColumnHeight * c2);
    }

    private final void processOverlayViewTranslation() {
        View view = this.pinOverlayView;
        if (view != null) {
            view.setTranslationY(((-view.getHeight()) / 2.0f) + this.parentTranslationY + this.pinCircleVerticalTranslate);
        }
    }

    private final void processOverlayVisibility(int visibility) {
        View view = this.pinOverlayView;
        if (view != null) {
            view.setVisibility(visibility);
        }
    }

    private final void setInternalIdleStateDrawable(Drawable idleStateDrawable) {
        boolean z = !jl40.l(this.idleStateDrawable, idleStateDrawable) && (idleStateDrawable == null || this.idleStateDrawable == null);
        this.idleStateDrawable = idleStateDrawable;
        if (idleStateDrawable != null) {
            setIntrinsicSizeAndCenter(idleStateDrawable);
        }
        if (z) {
            nf2 nf2Var = new nf2(true);
            nf2Var.a(0L);
            this.pinAnimator.b(nf2Var, getAnimatedParams(), false);
        }
    }

    private final void setIntrinsicSizeAndCenter(Drawable drawable) {
        drawable.setBounds((-drawable.getIntrinsicWidth()) / 2, (-drawable.getIntrinsicHeight()) / 2, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
    }

    private final void setPinColumnDrawable(int columnDrawable) {
        Drawable t = vng.t(columnDrawable, getContext());
        this.pinColumnDrawable = t;
        if (t != null) {
            if (t == null) {
                ny61.g("Required value was null.");
                return;
            }
            this.pinColumnDrawable = t;
            t.setTintMode(PorterDuff.Mode.SRC_ATOP);
            int intrinsicWidth = t.getIntrinsicWidth() / 2;
            this.columnHalfWidth = intrinsicWidth;
            int i = -intrinsicWidth;
            int intrinsicHeight = intrinsicWidth - t.getIntrinsicHeight();
            int i2 = this.columnHalfWidth;
            t.setBounds(i, intrinsicHeight, i2, i2);
            this.pinColumnHeight = t.getIntrinsicHeight();
        }
    }

    @Override // defpackage.otb0
    public g18 addListener(ktb0 listener) {
        return this.stateChangeListeners.h(listener);
    }

    public abstract boolean animateTransitions();

    @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getPointerCount() == 1 && event.getActionMasked() == 0 && (event.getY() < calcCircleOffsetY() || event.getY() > getHeight() - this.shadowRadius)) {
            return false;
        }
        return super.dispatchTouchEvent(event);
    }

    public abstract nf2 getAnimatedParams();

    @Override // defpackage.otb0
    public long getAnimationDuration() {
        AnimatorSet animatorSet = this.pinAnimator.c;
        long j = 0;
        if (animatorSet != null) {
            Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                j = Math.max(it.next().getDuration(), j);
            }
        }
        return j;
    }

    public final Drawable getIdleStateDrawable() {
        return this.idleStateDrawable;
    }

    public Drawable getPinErrorDrawable() {
        return vng.t(b3h0.pin_error_icon, getContext());
    }

    @Override // defpackage.otb0
    public Rect getPinFullVisibleBounds() {
        float c = this.pinAnimator.c(AnimatedParams$Index.BASE_OFFSET);
        float c2 = this.pinAnimator.c(AnimatedParams$Index.CONTENT_OFFSET);
        float c3 = this.pinAnimator.c(AnimatedParams$Index.SHADOW_SIZE);
        int width = getWidth() / 2;
        int i = this.shadowRadius;
        float f = ((-i) / 2.0f) * c;
        float f2 = this.columnHalfWidth;
        float f3 = this.pinCircleCenterOffset;
        return new Rect(-width, (int) ((((f2 - f3) - (this.pinColumnHeight * c2)) + f) - f3), width, (int) ((i * c3) / 2.0f));
    }

    @Override // defpackage.otb0
    public CharSequence getPinText() {
        return getText();
    }

    @Override // defpackage.otb0
    public Rect getPinVisibleBounds() {
        int width = getWidth() / 2;
        return new Rect(-width, (int) ((-this.pinColumnHeight) - (this.pinCircleCenterOffset * 2.0f)), width, this.shadowRadius / 2);
    }

    @Override // defpackage.otb0
    public Pin$State getState() {
        return this.state;
    }

    @Override // defpackage.otb0
    public void invalidatePinOverlay() {
        processOverlayVisibility(getVisibility());
        processOverlayViewTranslation();
    }

    /* renamed from: isAnchored, reason: from getter */
    public boolean getAnchored() {
        return this.anchored;
    }

    @Override // defpackage.otb0
    public boolean isTextState() {
        return getState() == Pin$State.TEXT;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.pinAnimator.d();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float c = this.pinAnimator.c(AnimatedParams$Index.BASE_OFFSET);
        float c2 = this.pinAnimator.c(AnimatedParams$Index.CONTENT_OFFSET);
        float c3 = this.pinAnimator.c(AnimatedParams$Index.SHADOW_SIZE);
        float c4 = this.pinAnimator.c(AnimatedParams$Index.SHADOW_ALPHA);
        float c5 = this.pinAnimator.c(AnimatedParams$Index.DOT_ALPHA);
        float c6 = this.pinAnimator.c(AnimatedParams$Index.EYE_OFFSET);
        float c7 = this.pinAnimator.c(AnimatedParams$Index.EYE_CLIP);
        float c8 = this.pinAnimator.c(AnimatedParams$Index.EYE_ALPHA);
        float c9 = this.pinAnimator.c(AnimatedParams$Index.EYE_COMPRESS);
        float c10 = this.pinAnimator.c(AnimatedParams$Index.TEXT_ALPHA);
        float c11 = this.pinAnimator.c(AnimatedParams$Index.TEXT_SCALE);
        float c12 = this.pinAnimator.c(AnimatedParams$Index.ERROR_ALPHA);
        float c13 = this.pinAnimator.c(AnimatedParams$Index.COLUMN_ALPHA);
        float c14 = this.pinAnimator.c(AnimatedParams$Index.IDLE_IMAGE_ALPHA);
        int save = canvas.save();
        float f = height;
        try {
            float f2 = f - (this.shadowRadius / 2.0f);
            float f3 = width / 2.0f;
            canvas.translate(f3, f2);
            save = canvas.save();
            canvas.scale(1.0f, 0.5f, 0.0f, 0.0f);
            try {
                OvalShadowShape ovalShadowShape = this.shadowShape;
                float f4 = this.shadowRadius;
                ovalShadowShape.updateRadialGradient(f4 * c3, f4 * 0.2f);
                this.pinShadowDrawable.setAlpha((int) (255.0f * c4));
                this.pinShadowDrawable.draw(canvas);
                canvas.restoreToCount(save);
                Drawable drawable = this.pinDotDrawable;
                if (drawable != null) {
                    drawable.setAlpha((int) (255.0f * c5));
                    this.pinDotDrawable.draw(canvas);
                }
                float f5 = f2 - ((this.shadowRadius / 2.0f) * c);
                canvas.translate(0.0f, ((-r4) / 2.0f) * c);
                Drawable drawable2 = this.pinColumnDrawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (255.0f * c13));
                    drawable2.draw(canvas);
                }
                float f6 = (this.columnHalfWidth - this.pinCircleCenterOffset) - (this.pinColumnHeight * c2);
                this.pinCircleVerticalTranslate = f5 + f6;
                canvas.translate(0.0f, f6);
                Drawable drawable3 = this.pinCircleDrawable;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
                Drawable drawable4 = this.pinErrorDrawable;
                if (drawable4 != null && c12 > 0.0f) {
                    drawable4.setAlpha((int) (255.0f * c12));
                    drawable4.draw(canvas);
                }
                float f7 = this.eyeRadius * c6;
                save = canvas.save();
                canvas.translate(0.0f, f7);
                try {
                    canvas.scale(1.0f, 1.0f - c9);
                    Drawable drawable5 = this.eyeDrawable;
                    if (drawable5 != null) {
                        drawable5.setAlpha((int) (c8 * 255.0f));
                        drawable5.setLevel((int) ((1.0f - c7) * 10000.0f));
                        drawable5.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                    processOverlayViewTranslation();
                    CharSequence text = getText();
                    if (text == null || text.length() == 0 || c10 <= 0.0f) {
                        Drawable drawable6 = this.idleStateDrawable;
                        if (drawable6 != null) {
                            drawable6.setAlpha((int) (255.0f * c14));
                            drawable6.draw(canvas);
                        }
                    } else {
                        getPaint().setAlpha((int) (255.0f * c10));
                        canvas.translate((-width) / 2.0f, (-height) / 2.0f);
                        canvas.scale(c11, c11, f3, f / 2.0f);
                        super.onDraw(canvas);
                    }
                    canvas.restoreToCount(save);
                    AnimatorSet animatorSet = this.pinAnimator.c;
                    if (animatorSet == null || !animatorSet.isRunning()) {
                        return;
                    }
                    postInvalidateOnAnimation();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        processOverlayVisibility(visibility);
    }

    public abstract nf2 pinAnimatorStartValues();

    @Override // defpackage.otb0
    public void setAnchored(boolean anchored, boolean animated) {
        if (this.anchored == anchored) {
            return;
        }
        this.anchored = anchored;
        if (getState() == Pin$State.MOVE) {
            return;
        }
        nf2 nf2Var = new nf2(true);
        if (!animated) {
            nf2Var.a(0L);
        }
        this.pinAnimator.b(nf2Var, getAnimatedParams(), animated);
    }

    @Override // defpackage.otb0
    public void setAnimationCallback(itb0 animationCallback) {
        if (animationCallback == null) {
            animationCallback = (itb0) ((zxf0) pwf0.c(itb0.class));
        }
        this.animationCallback = animationCallback;
    }

    @Override // defpackage.otb0
    public void setAnimationCurrentPlayTime(long playTime) {
        AnimatorSet animatorSet = this.pinAnimator.c;
        if (animatorSet != null) {
            Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                Animator next = it.next();
                ((ValueAnimator) next).setCurrentPlayTime(Math.min(next.getDuration(), playTime));
            }
        }
    }

    public final void setEyeDrawable(int eyeRes) {
        Drawable t = vng.t(eyeRes, getContext());
        this.eyeDrawable = t;
        if (t != null) {
            setIntrinsicSizeAndCenter(t);
            this.eyeRadius = t.getIntrinsicHeight() / 2.0f;
        }
    }

    @Override // defpackage.otb0
    public void setIdleStateDrawable(Drawable idleStateDrawable) {
        setInternalIdleStateDrawable(idleStateDrawable);
    }

    @Override // defpackage.otb0
    public void setParentTranslationY(float translationY) {
        this.parentTranslationY = translationY;
        processOverlayViewTranslation();
    }

    public final void setPinCircleDrawable(int pinCircle) {
        Drawable t = vng.t(pinCircle, getContext());
        this.pinCircleDrawable = t;
        if (t != null) {
            if (t == null) {
                ny61.g("Required value was null.");
                return;
            }
            this.pinCircleDrawable = t;
            t.setTintMode(PorterDuff.Mode.SRC_ATOP);
            setIntrinsicSizeAndCenter(t);
            this.pinCircleCenterOffset = t.getIntrinsicHeight() / 2.0f;
            this.shadowRadius = t.getIntrinsicHeight() / 2;
        }
    }

    @Override // defpackage.otb0
    public void setPinCircleOverlayView(View pinCircleOverlayView) {
        this.pinOverlayView = pinCircleOverlayView;
        invalidatePinOverlay();
    }

    public void setPinErrorDrawable(Drawable drawable) {
        this.pinErrorDrawable = drawable;
        if (drawable != null) {
            setIntrinsicSizeAndCenter(drawable);
        }
    }

    @Override // defpackage.otb0
    public void setPinText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Override // defpackage.otb0
    public void setState(Pin$State state, boolean animated) {
        Pin$State pin$State;
        if (getState() == state) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis - this.previousStateStartTime > 150 || !animated) {
            this.previousState = getState();
            this.previousStateStartTime = currentAnimationTimeMillis;
        }
        nf2 nf2Var = new nf2(true);
        if (animated && animateTransitions()) {
            if (state == Pin$State.TEXT && ((pin$State = this.previousState) == Pin$State.IN_PROGRESS || pin$State == Pin$State.MOVE)) {
                nf2Var.a(300L);
                nf2Var.b(AnimatedParams$Index.TEXT_SCALE, 0.0f);
                nf2Var.b(AnimatedParams$Index.TEXT_ALPHA, 0.0f);
                nf2Var.b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
                nf2Var.b(AnimatedParams$Index.EYE_OFFSET, 0.0f);
                nf2Var.b(AnimatedParams$Index.EYE_CLIP, 0.0f);
            }
            if (this.previousState == Pin$State.MOVE) {
                nf2Var.a(200L);
            }
        } else {
            nf2Var.a(0L);
        }
        setState(state);
        this.pinAnimator.b(nf2Var, getAnimatedParams(), animated);
        AnimatorSet animatorSet = this.pinAnimator.c;
        if (animatorSet == null || !animatorSet.isRunning()) {
            postInvalidate();
        }
        ((ktb0) this.stateChangeListeners.c).R3(state);
    }

    @Override // defpackage.otb0
    public void setStyle(z0c0 style) {
        this.currentStyle = style;
        Drawable drawable = this.pinCircleDrawable;
        if (drawable != null) {
            drawable.setTint(style.b);
        }
        Drawable drawable2 = this.pinColumnDrawable;
        if (drawable2 != null) {
            drawable2.setTint(style.c);
        }
        setTextColor(style.d);
        invalidate();
    }

    @Override // defpackage.otb0
    public void stopAnimation() {
        this.pinAnimator.d();
    }

    public void setState(Pin$State pin$State) {
        this.state = pin$State;
    }

    public BasePinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BasePinView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BasePinView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
