package com.ybsdk.widgets.common;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.utils.ColorModel;
import defpackage.bmg0;
import defpackage.cg91;
import defpackage.cu31;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.m810;
import defpackage.m9b1;
import defpackage.nc70;
import defpackage.nyg0;
import defpackage.oc70;
import defpackage.ok31;
import defpackage.pc70;
import defpackage.qc70;
import defpackage.qk31;
import defpackage.rje;
import defpackage.ung0;
import defpackage.vng;
import defpackage.w3i0;
import defpackage.w511;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0081\u00012\u00020\u0001:\t\u001d\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020%¢\u0006\u0004\b,\u0010(J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\f2\u0006\u0010\u001e\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b6\u0010\u0018J\u0017\u00107\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u0010\u0018J\u0017\u00108\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u0010\u0018J\u000f\u00109\u001a\u00020%H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0003¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020%H\u0002¢\u0006\u0004\b=\u0010:J\u000f\u0010>\u001a\u00020%H\u0002¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020%H\u0002¢\u0006\u0004\b?\u0010:J\u0011\u0010@\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020%H\u0002¢\u0006\u0004\bB\u0010:J\u000f\u0010C\u001a\u00020%H\u0002¢\u0006\u0004\bC\u0010:J\u0019\u0010E\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010W\u001a\u00020U2\u0006\u0010V\u001a\u00020U8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010d\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001c\u0010f\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010eR\u001c\u0010g\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u001c\u0010h\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010eR\u001c\u0010i\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010eR\u001c\u0010j\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010eR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u001c\u0010o\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010eR\u001c\u0010p\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010eR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR*\u0010v\u001a\u00020%2\u0006\u0010V\u001a\u00020%8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010:\"\u0004\by\u0010(R\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/ybsdk/widgets/common/OperationProgressView$Animation;", "animation", "configureAnimation", "(Lcom/ybsdk/widgets/common/OperationProgressView$Animation;)V", "Lqc70;", ClidProvider.STATE, "render", "(Lqc70;)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setSpinnerColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "", "thicknessInDp", "setSpinnerThickness", "(F)V", "circumference", "setSpinnerCircumference", "radiusPercent", "setSpinnerRadiusPercent", "", "isEnabled", "setScaleStrokeWidthEnabled", "(Z)V", "isClockwise", "setSpinnerRotation", "Lcom/ybsdk/widgets/common/l;", "playVibration", "(Lcom/ybsdk/widgets/common/l;)V", "drawSpinner", "drawIconBackground", "drawIcon", "getSpinnerRotationAngle", "()F", "getSpinnerColor", "()I", "getSpinnerScale", "getSpinnerExpansionAngle", "getSpinnerStrokeWidth", "getSpinnerAlpha", "()Ljava/lang/Integer;", "getIconBackgroundScale", "getIconAnimationScale", "alphaMax", "getIconAlpha", "(I)I", "", "getElapsedTime", "()J", "spinnerColor", CA20Status.STATUS_USER_I, "targetColor", "Landroid/graphics/drawable/Drawable;", "targetDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/ybsdk/widgets/common/OperationProgressView$StatusIcon;", "statusIcon", "Lcom/ybsdk/widgets/common/OperationProgressView$StatusIcon;", "currentState", "Lqc70;", "Lcom/ybsdk/widgets/common/OperationProgressView$InnerState;", "value", "innerState", "Lcom/ybsdk/widgets/common/OperationProgressView$InnerState;", "setInnerState", "(Lcom/ybsdk/widgets/common/OperationProgressView$InnerState;)V", "Landroid/graphics/Paint;", "spinnerPaint", "Landroid/graphics/Paint;", "iconBackgroundPaint", "Landroid/view/animation/LinearInterpolator;", "spinnerRotationInterpolator", "Landroid/view/animation/LinearInterpolator;", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "spinnerScaleInterpolator", "Landroid/view/animation/Interpolator;", "thicknessIncreaseInterpolator", "iconScaleIncreaseInterpolator", "iconScaleDecreaseInterpolator", "iconBackgroundScaleIncreaseInterpolator", "iconBackgroundScaleDecreaseInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "circleCloseInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "circleColorInterpolator", "fadeOutInterpolator", "fadeInInterpolator", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "animationStart", "J", "scale", "F", "getScale", "setScale", "Lcu31;", "viewProperties", "Lcu31;", "animationConfiguration", "Lcom/ybsdk/widgets/common/OperationProgressView$Animation;", "spinnerRotationClockwise", "Z", "Companion", "StatusIcon", "Animation", "InnerState", "nc70", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperationProgressView extends View {

    @Deprecated
    public static final int ALPHA_MAX_DEFAULT = 255;

    @Deprecated
    public static final int ALPHA_MIN_DEFAULT = 0;
    private static final nc70 Companion = new nc70();

    @Deprecated
    public static final float DEFAULT_CIRCUMFERENCE = 0.5f;

    @Deprecated
    public static final float DEFAULT_ICON_SCALE = 1.0f;

    @Deprecated
    public static final float DEFAULT_RADIUS_PERCENT = 0.72f;

    @Deprecated
    public static final float DEFAULT_SIZE = 100.0f;

    @Deprecated
    public static final long DIRECT_ANIMATION_DURATION = 1270;

    @Deprecated
    public static final long FADE_IN_ANIMATION_DURATION = 300;

    @Deprecated
    public static final long FADE_IN_ANIMATION_OFFSET = 180;

    @Deprecated
    public static final long FADE_OUT_ANIMATION_DURATION = 200;

    @Deprecated
    public static final long FADE_OUT_ANIMATION_OFFSET = 0;

    @Deprecated
    public static final float FULL_CIRCLE = 360.0f;

    @Deprecated
    public static final float HALF_CIRCLE = 180.0f;

    @Deprecated
    public static final float ICON_BACKGROUND_INITIAL_SCALE = 0.0f;

    @Deprecated
    public static final float ICON_BACKGROUND_SCALE_STEP_1 = 1.05f;

    @Deprecated
    public static final long ICON_BACKGROUND_SCALE_STEP_1_ANIMATION_DURATION = 260;

    @Deprecated
    public static final long ICON_BACKGROUND_SCALE_STEP_1_ANIMATION_OFFSET = 290;

    @Deprecated
    public static final float ICON_BACKGROUND_SCALE_STEP_2 = 1.0f;

    @Deprecated
    public static final long ICON_BACKGROUND_SCALE_STEP_2_ANIMATION_DURATION = 170;

    @Deprecated
    public static final long ICON_BACKGROUND_SCALE_STEP_2_ANIMATION_OFFSET = 550;

    @Deprecated
    public static final float ICON_INITIAL_SCALE = 0.0f;

    @Deprecated
    public static final float ICON_SCALE_STEP_1 = 1.05f;

    @Deprecated
    public static final long ICON_SCALE_STEP_1_ANIMATION_DURATION = 130;

    @Deprecated
    public static final long ICON_SCALE_STEP_1_ANIMATION_OFFSET = 440;

    @Deprecated
    public static final float ICON_SCALE_STEP_2 = 1.0f;

    @Deprecated
    public static final long ICON_SCALE_STEP_2_ANIMATION_DURATION = 700;

    @Deprecated
    public static final long ICON_SCALE_STEP_2_ANIMATION_OFFSET = 570;

    @Deprecated
    public static final long REVERSE_ANIMATION_DURATION = 480;

    @Deprecated
    public static final long ROTATION_ANIMATION_DURATION = 1200;

    @Deprecated
    public static final long SPINNER_CLOSURE_ANIMATION_DURATION = 280;

    @Deprecated
    public static final long SPINNER_COLOR_ANIMATION_DURATION = 50;

    @Deprecated
    public static final long SPINNER_COLOR_ANIMATION_OFFSET = 280;

    @Deprecated
    public static final float SPINNER_INITIAL_ANGLE = 180.0f;

    @Deprecated
    public static final float SPINNER_INITIAL_SCALE = 1.0f;

    @Deprecated
    public static final float SPINNER_INITIAL_STROKE_WIDTH = 3.0f;

    @Deprecated
    public static final float SPINNER_SCALE_STEP_1 = 1.1f;

    @Deprecated
    public static final long SPINNER_SCALE_STEP_1_ANIMATION_DURATION = 270;

    @Deprecated
    public static final long SPINNER_SCALE_STEP_1_ANIMATION_OFFSET = 0;

    @Deprecated
    public static final float SPINNER_SCALE_STEP_2 = 0.0f;

    @Deprecated
    public static final long SPINNER_SCALE_STEP_2_ANIMATION_DURATION = 180;

    @Deprecated
    public static final long SPINNER_SCALE_STEP_2_ANIMATION_OFFSET = 270;

    @Deprecated
    public static final float SPINNER_STROKE_WIDTH_STEP_1 = 6.0f;

    @Deprecated
    public static final long SPINNER_STROKE_WIDTH_STEP_1_ANIMATION_DURATION = 150;

    @Deprecated
    public static final long SPINNER_STROKE_WIDTH_STEP_1_ANIMATION_OFFSET = 0;

    @Deprecated
    public static final float SPINNER_STROKE_WIDTH_STEP_2 = 17.5f;

    @Deprecated
    public static final long SPINNER_STROKE_WIDTH_STEP_2_ANIMATION_DURATION = 240;

    @Deprecated
    public static final long SPINNER_STROKE_WIDTH_STEP_2_ANIMATION_OFFSET = 150;

    @Deprecated
    public static final float SPINNER_TARGET_ANGLE = 360.0f;
    private Animation animationConfiguration;
    private long animationStart;
    private final ArgbEvaluator argbEvaluator;
    private final AccelerateDecelerateInterpolator circleCloseInterpolator;
    private final AccelerateDecelerateInterpolator circleColorInterpolator;
    private qc70 currentState;
    private final Interpolator fadeInInterpolator;
    private final Interpolator fadeOutInterpolator;
    private final Paint iconBackgroundPaint;
    private final Interpolator iconBackgroundScaleDecreaseInterpolator;
    private final Interpolator iconBackgroundScaleIncreaseInterpolator;
    private final Interpolator iconScaleDecreaseInterpolator;
    private final Interpolator iconScaleIncreaseInterpolator;
    private InnerState innerState;
    private float scale;
    private int spinnerColor;
    private final Paint spinnerPaint;
    private boolean spinnerRotationClockwise;
    private final LinearInterpolator spinnerRotationInterpolator;
    private final Interpolator spinnerScaleInterpolator;
    private StatusIcon statusIcon;
    private int targetColor;
    private Drawable targetDrawable;
    private final Interpolator thicknessIncreaseInterpolator;
    private cu31 viewProperties;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressView$Animation;", "", "<init>", "(Ljava/lang/String;I)V", "Required", "Skipped", "NotPlayed", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Animation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Animation[] $VALUES;
        public static final Animation Required = new Animation("Required", 0);
        public static final Animation Skipped = new Animation("Skipped", 1);
        public static final Animation NotPlayed = new Animation("NotPlayed", 2);

        private static final /* synthetic */ Animation[] $values() {
            return new Animation[]{Required, Skipped, NotPlayed};
        }

        static {
            Animation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Animation(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Animation valueOf(String str) {
            return (Animation) Enum.valueOf(Animation.class, str);
        }

        public static Animation[] values() {
            return (Animation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressView$InnerState;", "", "HIDDEN", "LOADING", "DIRECT_ANIMATION_IN_PROGRESS", "DIRECT_ANIMATION_COMPLETED", "REVERSE_ANIMATION_IN_PROGRESS", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InnerState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InnerState[] $VALUES;
        public static final InnerState DIRECT_ANIMATION_COMPLETED;
        public static final InnerState DIRECT_ANIMATION_IN_PROGRESS;
        public static final InnerState HIDDEN;
        public static final InnerState LOADING;
        public static final InnerState REVERSE_ANIMATION_IN_PROGRESS;

        static {
            InnerState innerState = new InnerState("HIDDEN", 0);
            HIDDEN = innerState;
            InnerState innerState2 = new InnerState("LOADING", 1);
            LOADING = innerState2;
            InnerState innerState3 = new InnerState("DIRECT_ANIMATION_IN_PROGRESS", 2);
            DIRECT_ANIMATION_IN_PROGRESS = innerState3;
            InnerState innerState4 = new InnerState("DIRECT_ANIMATION_COMPLETED", 3);
            DIRECT_ANIMATION_COMPLETED = innerState4;
            InnerState innerState5 = new InnerState("REVERSE_ANIMATION_IN_PROGRESS", 4);
            REVERSE_ANIMATION_IN_PROGRESS = innerState5;
            InnerState[] innerStateArr = {innerState, innerState2, innerState3, innerState4, innerState5};
            $VALUES = innerStateArr;
            $ENTRIES = kotlin.enums.a.a(innerStateArr);
        }

        public static InnerState valueOf(String str) {
            return (InnerState) Enum.valueOf(InnerState.class, str);
        }

        public static InnerState[] values() {
            return (InnerState[]) $VALUES.clone();
        }
    }

    public OperationProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.spinnerColor = rje.a(context, ung0.ybColor_button_primaryNormal);
        this.innerState = InnerState.LOADING;
        Paint paint = new Paint();
        paint.setColor(this.spinnerColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.spinnerPaint = paint;
        this.iconBackgroundPaint = new Paint();
        this.spinnerRotationInterpolator = new LinearInterpolator();
        this.spinnerScaleInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_spinner_scale);
        this.thicknessIncreaseInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_spinner_thickness);
        this.iconScaleIncreaseInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_icon_scale_increase);
        this.iconScaleDecreaseInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_icon_scale_decrease);
        this.iconBackgroundScaleIncreaseInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_icon_background_scale_increase);
        this.iconBackgroundScaleDecreaseInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_icon_background_scale_decrease);
        this.circleCloseInterpolator = new AccelerateDecelerateInterpolator();
        this.circleColorInterpolator = new AccelerateDecelerateInterpolator();
        this.fadeOutInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_fade_out);
        this.fadeInInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_fade_in);
        this.argbEvaluator = new ArgbEvaluator();
        this.animationStart = SystemClock.uptimeMillis();
        this.animationConfiguration = Animation.Required;
        this.spinnerRotationClockwise = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w3i0.YbSdkOperationProgressView, i, i);
        float f = obtainStyledAttributes.getFloat(w3i0.YbSdkOperationProgressView_ybsdk_spinnerRadiusPercent, 0.72f);
        float v = com.ybsdk.core.utils.ext.view.b.v(obtainStyledAttributes, w3i0.YbSdkOperationProgressView_ybsdk_initialSpinnerWidth, kp50.s(3.0f));
        float f2 = obtainStyledAttributes.getFloat(w3i0.YbSdkOperationProgressView_ybsdk_backgroundRadiusPercent, 0.72f);
        this.viewProperties = new cu31(f, 0.5f, v, obtainStyledAttributes.getFloat(w3i0.YbSdkOperationProgressView_ybsdk_iconRadiusPercent, 0.72f), f2, com.ybsdk.core.utils.ext.view.b.v(obtainStyledAttributes, w3i0.YbSdkOperationProgressView_ybsdk_size, kp50.s(100.0f)), obtainStyledAttributes.getFloat(w3i0.YbSdkOperationProgressView_ybsdk_errorIconScale, 1.0f), true);
        this.spinnerColor = obtainStyledAttributes.getColor(w3i0.YbSdkOperationProgressView_ybsdk_indicatorColor, rje.a(context, ung0.ybColor_button_primaryNormal));
    }

    private final void drawIcon(Canvas canvas) {
        float iconAnimationScale;
        StatusIcon statusIcon = this.statusIcon;
        float f = 1.0f;
        if (statusIcon == null) {
            iconAnimationScale = getIconAnimationScale();
        } else if (m.b[statusIcon.ordinal()] == 1) {
            iconAnimationScale = this.viewProperties.g;
            f = getIconAnimationScale();
        } else {
            iconAnimationScale = getIconAnimationScale();
        }
        float f2 = iconAnimationScale * f;
        int save = canvas.save();
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
        try {
            float min = (Math.min(canvas.getWidth(), canvas.getHeight()) / 2) * this.viewProperties.d;
            Drawable drawable = this.targetDrawable;
            if (drawable != null) {
                drawable.setBounds(m810.b((canvas.getWidth() / 2.0f) - min), m810.b((canvas.getHeight() / 2.0f) - min), m810.b((canvas.getWidth() / 2.0f) + min), m810.b((canvas.getHeight() / 2.0f) + min));
            }
            Drawable drawable2 = this.targetDrawable;
            if (drawable2 != null) {
                drawable2.setAlpha(getIconAlpha$default(this, 0, 1, null));
            }
            Drawable drawable3 = this.targetDrawable;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    private final void drawIconBackground(Canvas canvas) {
        StatusIcon statusIcon = this.statusIcon;
        if (statusIcon != null) {
            this.iconBackgroundPaint.setAlpha(getIconAlpha((rje.a(getContext(), statusIcon.getBackgroundColor()) >> 24) & 255));
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (Math.min(getWidth(), getHeight()) / 2) * this.viewProperties.e * getIconBackgroundScale(), this.iconBackgroundPaint);
        }
    }

    private final void drawSpinner(Canvas canvas) {
        Canvas canvas2;
        Throwable th;
        float spinnerRotationAngle = getSpinnerRotationAngle();
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        int save = canvas.save();
        canvas.rotate(spinnerRotationAngle, width, height);
        try {
            this.spinnerPaint.setColor(getSpinnerColor());
            Integer spinnerAlpha = getSpinnerAlpha();
            if (spinnerAlpha != null) {
                try {
                    this.spinnerPaint.setAlpha(spinnerAlpha.intValue());
                } catch (Throwable th2) {
                    th = th2;
                    canvas2 = canvas;
                    canvas2.restoreToCount(save);
                    throw th;
                }
            }
            this.spinnerPaint.setStrokeWidth(getSpinnerStrokeWidth());
            float min = (((Math.min(canvas.getWidth(), canvas.getHeight()) / 2) * this.viewProperties.a) - (getSpinnerStrokeWidth() / 2.0f)) * getSpinnerScale();
            canvas2 = canvas;
            try {
                canvas2.drawArc((canvas.getWidth() / 2.0f) - min, (canvas.getHeight() / 2.0f) - min, (canvas.getWidth() / 2.0f) + min, (canvas.getHeight() / 2.0f) + min, 0.0f, getSpinnerExpansionAngle(), false, this.spinnerPaint);
                canvas2.restoreToCount(save);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                canvas2.restoreToCount(save);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    private final long getElapsedTime() {
        Animation animation = this.animationConfiguration;
        if (animation == Animation.Skipped) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        if (animation == Animation.Required) {
            return SystemClock.uptimeMillis() - this.animationStart;
        }
        return 0L;
    }

    private final int getIconAlpha(int alphaMax) {
        if (this.innerState != InnerState.REVERSE_ANIMATION_IN_PROGRESS) {
            return alphaMax;
        }
        return m810.b((this.fadeOutInterpolator.getInterpolation(y6i0.c(getElapsedTime() - 0.0f, 0.0f, 200.0f) / 200.0f) * (0 - alphaMax)) + alphaMax);
    }

    public static /* synthetic */ int getIconAlpha$default(OperationProgressView operationProgressView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 255;
        }
        return operationProgressView.getIconAlpha(i);
    }

    private final float getIconAnimationScale() {
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            return 1.0f;
        }
        long elapsedTime = getElapsedTime();
        if (elapsedTime < 440) {
            return 0.0f;
        }
        if (440 <= elapsedTime && elapsedTime < 571) {
            return m9b1.d(this.iconScaleIncreaseInterpolator, (elapsedTime - 440) / 130.0f, 0.0f, 1.05f);
        }
        if (570 > elapsedTime || elapsedTime >= 1271) {
            return 1.0f;
        }
        return m9b1.d(this.iconScaleDecreaseInterpolator, (elapsedTime - 570) / 700.0f, 1.05f, 1.0f);
    }

    private final float getIconBackgroundScale() {
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            return 1.0f;
        }
        long elapsedTime = getElapsedTime();
        if (elapsedTime < 290) {
            return 0.0f;
        }
        if (290 <= elapsedTime && elapsedTime < 551) {
            return m9b1.d(this.iconBackgroundScaleIncreaseInterpolator, (elapsedTime - 290) / 260.0f, 0.0f, 1.05f);
        }
        if (550 > elapsedTime || elapsedTime >= 721) {
            return 1.0f;
        }
        return m9b1.d(this.iconBackgroundScaleDecreaseInterpolator, (elapsedTime - 550) / 170.0f, 1.05f, 1.0f);
    }

    private final float getScale() {
        if (this.viewProperties.h) {
            return this.scale;
        }
        return 1.0f;
    }

    private final Integer getSpinnerAlpha() {
        if (this.innerState != InnerState.REVERSE_ANIMATION_IN_PROGRESS) {
            return null;
        }
        return Integer.valueOf(m810.b((this.fadeInInterpolator.getInterpolation(y6i0.c(getElapsedTime() - 180.0f, 0.0f, 300.0f) / 300.0f) * 255.0f) + 0.0f));
    }

    private final int getSpinnerColor() {
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            return this.spinnerColor;
        }
        long elapsedTime = getElapsedTime() - 280;
        return (0 > elapsedTime || elapsedTime >= 51) ? elapsedTime > 50 ? this.targetColor : this.spinnerColor : ((Integer) this.argbEvaluator.evaluate(this.circleColorInterpolator.getInterpolation(elapsedTime / 280.0f), Integer.valueOf(this.spinnerColor), Integer.valueOf(this.targetColor))).intValue();
    }

    private final float getSpinnerExpansionAngle() {
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            return this.viewProperties.b * 360.0f;
        }
        long elapsedTime = getElapsedTime();
        if (0 > elapsedTime || elapsedTime >= 281) {
            return 360.0f;
        }
        return m9b1.d(this.circleCloseInterpolator, elapsedTime / 280.0f, 180.0f, 360.0f);
    }

    private final float getSpinnerRotationAngle() {
        return m9b1.d(this.spinnerRotationInterpolator, (getElapsedTime() % ROTATION_ANIMATION_DURATION) / 1200.0f, 0.0f, 360.0f) * (this.spinnerRotationClockwise ? 1 : -1);
    }

    private final float getSpinnerScale() {
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            return 1.0f;
        }
        long elapsedTime = getElapsedTime();
        if (0 <= elapsedTime && elapsedTime < 271) {
            return m9b1.d(this.spinnerScaleInterpolator, elapsedTime / 270.0f, 1.0f, 1.1f);
        }
        if (270 > elapsedTime || elapsedTime >= 451) {
            return 0.0f;
        }
        return m9b1.d(this.spinnerScaleInterpolator, (elapsedTime - 270) / 180.0f, 1.1f, 0.0f);
    }

    private final float getSpinnerStrokeWidth() {
        float f;
        float s;
        float scale;
        if (this.innerState != InnerState.DIRECT_ANIMATION_IN_PROGRESS) {
            s = this.viewProperties.c;
            scale = getScale();
        } else {
            long elapsedTime = getElapsedTime();
            if (0 <= elapsedTime && elapsedTime < 151) {
                f = m9b1.d(this.thicknessIncreaseInterpolator, elapsedTime / 150.0f, kp50.w(this.viewProperties.c), 6.0f);
            } else if (150 > elapsedTime || elapsedTime >= 391) {
                f = 17.5f;
            } else {
                f = m9b1.d(this.thicknessIncreaseInterpolator, (elapsedTime - 150) / 240.0f, 6.0f, 17.5f);
            }
            s = kp50.s(f);
            scale = getScale();
        }
        return s / scale;
    }

    private final void playVibration(l state) {
        qk31 vibrationPattern = state.a.getVibrationPattern();
        if (vibrationPattern != null) {
            cg91.c(this, vibrationPattern);
        }
    }

    private final void setInnerState(InnerState innerState) {
        if (this.innerState == innerState) {
            return;
        }
        this.animationStart = SystemClock.uptimeMillis();
        this.innerState = innerState;
        invalidate();
    }

    private final void setScale(float f) {
        this.scale = f;
    }

    public final void configureAnimation(Animation animation) {
        this.animationConfiguration = animation;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = m.a[this.innerState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                drawSpinner(canvas);
                if (this.animationConfiguration == Animation.Required) {
                    invalidate();
                    return;
                }
                return;
            }
            if (i == 3) {
                drawSpinner(canvas);
                drawIconBackground(canvas);
                drawIcon(canvas);
                if (getElapsedTime() > DIRECT_ANIMATION_DURATION) {
                    setInnerState(InnerState.DIRECT_ANIMATION_COMPLETED);
                    return;
                } else {
                    invalidate();
                    return;
                }
            }
            if (i == 4) {
                drawIconBackground(canvas);
                drawIcon(canvas);
                return;
            }
            if (i != 5) {
                w511.b();
                return;
            }
            drawSpinner(canvas);
            drawIconBackground(canvas);
            drawIcon(canvas);
            if (getElapsedTime() <= 480) {
                setInnerState(InnerState.LOADING);
            } else if (this.animationConfiguration == Animation.Required) {
                invalidate();
            } else {
                setInnerState(InnerState.LOADING);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int b = m810.b(this.viewProperties.f);
        int b2 = m810.b(this.viewProperties.f);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            b = Math.min(b, size);
        } else if (mode == 1073741824) {
            b = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            b2 = Math.min(b2, size2);
        } else if (mode2 == 1073741824) {
            b2 = size2;
        }
        setMeasuredDimension(b, b2);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setScale(kp50.s(100.0f) / Math.min(w, h));
    }

    public final void render(qc70 state) {
        if (jl40.l(this.currentState, state)) {
            return;
        }
        if (state.equals(oc70.a)) {
            setInnerState(InnerState.HIDDEN);
        } else if (state.equals(pc70.a)) {
            if (this.innerState == InnerState.DIRECT_ANIMATION_COMPLETED) {
                setInnerState(InnerState.REVERSE_ANIMATION_IN_PROGRESS);
            } else {
                setInnerState(InnerState.LOADING);
            }
        } else {
            if (!(state instanceof l)) {
                w511.b();
                return;
            }
            l lVar = (l) state;
            StatusIcon statusIcon = lVar.a;
            this.statusIcon = statusIcon;
            setInnerState(InnerState.DIRECT_ANIMATION_IN_PROGRESS);
            this.targetColor = rje.a(getContext(), statusIcon.getBackgroundColor());
            this.iconBackgroundPaint.setColor(rje.a(getContext(), statusIcon.getBackgroundColor()));
            this.targetDrawable = vng.t(statusIcon.getDrawable(), getContext());
            if (this.currentState instanceof pc70) {
                playVibration(lVar);
            }
        }
        this.currentState = state;
    }

    public final void setScaleStrokeWidthEnabled(boolean isEnabled) {
        this.viewProperties = cu31.a(this.viewProperties, 0.0f, 0.0f, 0.0f, isEnabled, HProv.PP_VERSION_TIMESTAMP);
    }

    public final void setSpinnerCircumference(float circumference) {
        this.viewProperties = cu31.a(this.viewProperties, 0.0f, circumference, 0.0f, false, 253);
    }

    public final void setSpinnerColor(ColorModel color) {
        this.spinnerColor = color.get(getContext());
    }

    public final void setSpinnerRadiusPercent(float radiusPercent) {
        this.viewProperties = cu31.a(this.viewProperties, radiusPercent, 0.0f, 0.0f, false, 254);
    }

    public final void setSpinnerRotation(boolean isClockwise) {
        this.spinnerRotationClockwise = isClockwise;
    }

    public final void setSpinnerThickness(float thicknessInDp) {
        this.viewProperties = cu31.a(this.viewProperties, 0.0f, 0.0f, kp50.s(thicknessInDp), false, 251);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/widgets/common/OperationProgressView$StatusIcon;", "", "", "drawable", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lqk31;", "vibrationPattern", "<init>", "(Ljava/lang/String;IIILqk31;)V", CA20Status.STATUS_USER_I, "getDrawable", "()I", "getBackgroundColor", "Lqk31;", "getVibrationPattern", "()Lqk31;", "SUCCESS", "BOOST_FUNDED", "TIMEOUT", "ERROR", "WARNING", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusIcon {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StatusIcon[] $VALUES;
        public static final StatusIcon BOOST_FUNDED;
        public static final StatusIcon ERROR;
        public static final StatusIcon SUCCESS;
        public static final StatusIcon TIMEOUT;
        public static final StatusIcon WARNING;
        private final int backgroundColor;
        private final int drawable;
        private final qk31 vibrationPattern;

        private static final /* synthetic */ StatusIcon[] $values() {
            return new StatusIcon[]{SUCCESS, BOOST_FUNDED, TIMEOUT, ERROR, WARNING};
        }

        static {
            int i = nyg0.ybsdk_ic_operation_success;
            int i2 = ung0.ybColor_textIcon_positive;
            ok31 ok31Var = ok31.g;
            SUCCESS = new StatusIcon("SUCCESS", 0, i, i2, ok31Var);
            BOOST_FUNDED = new StatusIcon("BOOST_FUNDED", 1, nyg0.ybsdk_ic_operation_boost_funded, ung0.ybColor_product_ultra_300, ok31Var);
            int i3 = nyg0.ybsdk_ic_timeout;
            int i4 = ung0.ybsdk_transparentBackground;
            ok31 ok31Var2 = ok31.d;
            TIMEOUT = new StatusIcon("TIMEOUT", 2, i3, i4, ok31Var2);
            ERROR = new StatusIcon("ERROR", 3, nyg0.ybsdk_ic_operation_error, ung0.ybColor_textIcon_negative, ok31Var2);
            WARNING = new StatusIcon("WARNING", 4, nyg0.ybsdk_ic_operation_warning, ung0.ybColor_fill_color3_400, ok31Var2);
            StatusIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        public /* synthetic */ StatusIcon(String str, int i, int i2, int i3, qk31 qk31Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, i3, (i4 & 4) != 0 ? null : qk31Var);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StatusIcon valueOf(String str) {
            return (StatusIcon) Enum.valueOf(StatusIcon.class, str);
        }

        public static StatusIcon[] values() {
            return (StatusIcon[]) $VALUES.clone();
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getDrawable() {
            return this.drawable;
        }

        public final qk31 getVibrationPattern() {
            return this.vibrationPattern;
        }

        private StatusIcon(String str, int i, int i2, int i3, qk31 qk31Var) {
            this.drawable = i2;
            this.backgroundColor = i3;
            this.vibrationPattern = qk31Var;
        }
    }

    public OperationProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OperationProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OperationProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
