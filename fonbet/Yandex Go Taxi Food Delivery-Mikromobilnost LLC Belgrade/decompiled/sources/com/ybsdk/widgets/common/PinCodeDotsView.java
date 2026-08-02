package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import com.ybsdk.widgets.common.PinCodeDotsView;
import defpackage.bmg0;
import defpackage.cvb0;
import defpackage.d6w;
import defpackage.ei;
import defpackage.evb0;
import defpackage.fnb0;
import defpackage.fvb0;
import defpackage.gvb0;
import defpackage.gvu0;
import defpackage.imz;
import defpackage.ivb0;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.lcb1;
import defpackage.p1i0;
import defpackage.r5c;
import defpackage.rje;
import defpackage.sls;
import defpackage.sza;
import defpackage.t8;
import defpackage.t9b0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.w3i0;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.y740;
import defpackage.z4b0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001i\b\u0007\u0018\u0000 l2\u00020\u0001:\u0002mnB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b \u0010\u001cJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\"J\u001d\u0010&\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0019H\u0002¢\u0006\u0004\b&\u0010\u001cJ/\u0010*\u001a\u00020\f2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0018J\u0017\u0010-\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010\u0018J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010\u0018J\u0017\u0010/\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010\u0018J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010\u0018J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u001cR\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0014\u0010J\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010P\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010R\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u001c\u0010S\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010<R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010<R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010<R\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010<R$\u0010e\u001a\u00020c2\u0006\u0010d\u001a\u00020c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006o"}, d2 = {"Lcom/ybsdk/widgets/common/PinCodeDotsView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function0;", "onAnimationEnd", "clear", "(Lsls;)V", "n", "showSymbols", "(ILsls;)V", "showError", "showLoading", "()V", "showSuccess", "initEditText", "action", "doAfterFillAnimation", "Lkotlin/Function3;", "", "draw", "drawDots", "(Lzls;)V", "drawNormalDots", "drawWigglingDots", "drawShimmeringDots", "drawInflatingDots", "drawDeflatingDots", "Landroid/graphics/Shader;", "createShimmerGradient", "()Landroid/graphics/Shader;", "Lkotlin/Function1;", "onNewDigit", "Ltls;", "getOnNewDigit", "()Ltls;", "setOnNewDigit", "(Ltls;)V", "onLastDigitErased", "Lsls;", "getOnLastDigitErased", "()Lsls;", "setOnLastDigitErased", "", "shimmerGradientColors", "[I", "Landroid/graphics/Paint;", "paintFill", "Landroid/graphics/Paint;", "paintStroke", "paintGradientShimmer", "paintShimmer", "paintError", "paintSuccess", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "successInterpolator", "Landroid/view/animation/Interpolator;", "wiggleInterpolator", "shimmerInterpolator", "", "animStart", "J", "Landroid/graphics/Bitmap;", "shimmerGradientBitmap", "Landroid/graphics/Bitmap;", "shimmerMaskBitmap", "shimmerBufferBitmap", "oldFilledCount", CA20Status.STATUS_USER_I, "filledCount", "outerFillAnimationCallback", "innerFillAnimationCallback", "errorAnimationCallback", "successAnimationCallback", "Lcom/ybsdk/widgets/common/PinCodeDotsView$State;", "value", ClidProvider.STATE, "Lcom/ybsdk/widgets/common/PinCodeDotsView$State;", "setState", "(Lcom/ybsdk/widgets/common/PinCodeDotsView$State;)V", "com/ybsdk/widgets/common/PinCodeDotsView$emptySelectionCallback$1", "emptySelectionCallback", "Lcom/ybsdk/widgets/common/PinCodeDotsView$emptySelectionCallback$1;", "Companion", "State", "ivb0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PinCodeDotsView extends AppCompatEditText {
    private static final ivb0 Companion = new ivb0();

    @Deprecated
    public static final int DISTANCE_BETWEEN_DOTS = 24;

    @Deprecated
    public static final int DOT_COUNT = 4;

    @Deprecated
    public static final int DOT_RADIUS = 5;

    @Deprecated
    public static final int DOT_RADIUS_STROKED = 4;

    @Deprecated
    public static final int DOT_SIZE_EXTENSION = 2;

    @Deprecated
    public static final int DOT_STROKE_SIZE = 2;

    @Deprecated
    public static final int DOT_WIGGLE_OFFSET = 2;

    @Deprecated
    public static final String EDIT_TEXT_STUB_CONTENT = " ";

    @Deprecated
    public static final long ERROR_SINGLE_WIGGLE_ANIMATION_DURATION = 200;

    @Deprecated
    public static final long FILL_ANIMATION_DURATION = 200;

    @Deprecated
    public static final float HALF_PERIOD = 0.5f;

    @Deprecated
    public static final float INTERPOLATION_HALF = 0.5f;

    @Deprecated
    public static final long LOADING_ANIMATION_DURATION = 4000;

    @Deprecated
    public static final int PERIOD = 1;

    @Deprecated
    public static final float QUARTER_PERIOD = 0.25f;

    @Deprecated
    public static final long SUCCESS_ANIMATION_DURATION = 300;

    @Deprecated
    public static final int VIEW_HEIGHT = 44;

    @Deprecated
    public static final int WIGGLE_REPEATS_AMOUNT = 3;
    private long animStart;
    private final PinCodeDotsView$emptySelectionCallback$1 emptySelectionCallback;
    private sls errorAnimationCallback;
    private int filledCount;
    private sls innerFillAnimationCallback;
    private final AccelerateDecelerateInterpolator interpolator;
    private int oldFilledCount;
    private sls onLastDigitErased;
    private tls onNewDigit;
    private sls outerFillAnimationCallback;
    private final Paint paintError;
    private final Paint paintFill;
    private final Paint paintGradientShimmer;
    private final Paint paintShimmer;
    private final Paint paintStroke;
    private final Paint paintSuccess;
    private Bitmap shimmerBufferBitmap;
    private Bitmap shimmerGradientBitmap;
    private final int[] shimmerGradientColors;
    private final Interpolator shimmerInterpolator;
    private Bitmap shimmerMaskBitmap;
    private State state;
    private sls successAnimationCallback;
    private final Interpolator successInterpolator;
    private final Interpolator wiggleInterpolator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/widgets/common/PinCodeDotsView$State;", "", "INPUT", "ERROR", "SHIMMER", "SUCCESS_INFLATE", "SUCCESS_DEFLATE", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State INPUT;
        public static final State SHIMMER;
        public static final State SUCCESS_DEFLATE;
        public static final State SUCCESS_INFLATE;

        static {
            State state = new State("INPUT", 0);
            INPUT = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("SHIMMER", 2);
            SHIMMER = state3;
            State state4 = new State("SUCCESS_INFLATE", 3);
            SUCCESS_INFLATE = state4;
            State state5 = new State("SUCCESS_DEFLATE", 4);
            SUCCESS_DEFLATE = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v26, types: [android.view.ActionMode$Callback, com.ybsdk.widgets.common.PinCodeDotsView$emptySelectionCallback$1] */
    public PinCodeDotsView(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, p1i0.YbSdkThemeOverlayNoTextSelectHandles), attributeSet, i);
        this.onNewDigit = new fnb0(3);
        this.onLastDigitErased = new z4b0(26);
        this.shimmerGradientColors = new int[]{rje.a(context, ung0.ybColor_textIcon_primary), rje.a(context, ung0.ybColor_background_primary), rje.a(context, ung0.ybColor_textIcon_primary)};
        int i2 = 1;
        Paint paint = new Paint(1);
        paint.setColor(rje.a(context, ung0.ybColor_textIcon_primary));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        this.paintFill = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(rje.a(context, ung0.ybColor_textIcon_primary));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(kp50.t(2));
        this.paintStroke = paint2;
        Paint paint3 = new Paint();
        paint3.setShader(createShimmerGradient());
        this.paintGradientShimmer = paint3;
        Paint paint4 = new Paint();
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.paintShimmer = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(rje.a(context, ung0.ybColor_textIcon_negative));
        this.paintError = paint5;
        Paint paint6 = new Paint();
        paint6.setColor(rje.a(context, ung0.ybColor_textIcon_positive));
        this.paintSuccess = paint6;
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.successInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_anim_pin_ease_size_change);
        this.wiggleInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_anim_pin_ease_default);
        this.shimmerInterpolator = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_anim_pin_ease_default);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.shimmerGradientBitmap = Bitmap.createBitmap(1, 1, config);
        this.shimmerMaskBitmap = Bitmap.createBitmap(1, 1, config);
        this.shimmerBufferBitmap = Bitmap.createBitmap(1, 1, config);
        this.outerFillAnimationCallback = new z4b0(27);
        this.innerFillAnimationCallback = new z4b0(28);
        this.errorAnimationCallback = new fvb0(0);
        this.successAnimationCallback = new fvb0(i2);
        this.state = State.INPUT;
        ?? r7 = new ActionMode.Callback() { // from class: com.ybsdk.widgets.common.PinCodeDotsView$emptySelectionCallback$1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }
        };
        this.emptySelectionCallback = r7;
        setLayerType(1, null);
        setLongClickable(false);
        setOnLongClickListener(new gvb0());
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(r7);
        setFocusableInTouchMode(true);
        setInputType(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbSdkPinCodeDotsView);
        boolean z = obtainStyledAttributes.getBoolean(w3i0.YbSdkPinCodeDotsView_ybsdk_useAsEditText, true);
        obtainStyledAttributes.recycle();
        if (z) {
            initEditText();
        }
        setClickable(z);
        setFocusable(z);
        androidx.core.view.b.p(this, new ei(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$12(View view) {
        return true;
    }

    public static /* synthetic */ void clear$default(PinCodeDotsView pinCodeDotsView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = new z4b0(29);
        }
        pinCodeDotsView.clear(slsVar);
    }

    private final Shader createShimmerGradient() {
        return new LinearGradient(0.0f, 0.0f, getWidth() * 2.0f, 0.0f, this.shimmerGradientColors, (float[]) null, Shader.TileMode.MIRROR);
    }

    private final void doAfterFillAnimation(sls action) {
        this.innerFillAnimationCallback = action;
    }

    private final void drawDeflatingDots(Canvas canvas) {
        float interpolation = this.successInterpolator.getInterpolation(((Number) y6i0.h(Float.valueOf((SystemClock.uptimeMillis() - this.animStart) / 300.0f), new r5c(0.0f, 1.0f))).floatValue());
        drawDots(new cvb0(canvas, interpolation, this, 1));
        if (interpolation < 1.0f) {
            invalidate();
        } else {
            this.successAnimationCallback.invoke();
            this.successAnimationCallback = new z4b0(25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 drawDeflatingDots$lambda$37(Canvas canvas, float f, PinCodeDotsView pinCodeDotsView, int i, float f2, float f3) {
        canvas.drawCircle(f2, f3, kp50.t(7) - (kp50.t(2) * f), pinCodeDotsView.paintSuccess);
        return zy11.a;
    }

    private final void drawDots(zls draw) {
        float max = Math.max(kp50.t(2), kp50.t(2)) + kp50.t(5);
        float measuredHeight = getMeasuredHeight() / 2;
        for (int i = 0; i < 4; i++) {
            draw.invoke(Integer.valueOf(i), Float.valueOf((((kp50.t(5) * 2.0f) + kp50.t(24)) * i) + max), Float.valueOf(measuredHeight));
        }
    }

    private final void drawInflatingDots(Canvas canvas) {
        float interpolation = this.successInterpolator.getInterpolation(((Number) y6i0.h(Float.valueOf((SystemClock.uptimeMillis() - this.animStart) / 300.0f), new r5c(0.0f, 1.0f))).floatValue());
        drawDots(new cvb0(canvas, interpolation, this, 0));
        if (interpolation < 1.0f) {
            invalidate();
        } else {
            this.animStart = SystemClock.uptimeMillis();
            setState(State.SUCCESS_DEFLATE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 drawInflatingDots$lambda$36(Canvas canvas, float f, PinCodeDotsView pinCodeDotsView, int i, float f2, float f3) {
        canvas.drawCircle(f2, f3, (kp50.t(2) * f) + kp50.t(5), pinCodeDotsView.paintSuccess);
        return zy11.a;
    }

    private final void drawNormalDots(final Canvas canvas) {
        final float interpolation = this.interpolator.getInterpolation(((Number) y6i0.h(Float.valueOf((SystemClock.uptimeMillis() - this.animStart) / 200.0f), new r5c(0.0f, 1.0f))).floatValue());
        final int i = this.oldFilledCount - 1;
        final int i2 = this.filledCount - 1;
        drawDots(new zls() { // from class: hvb0
            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                zy11 drawNormalDots$lambda$27;
                drawNormalDots$lambda$27 = PinCodeDotsView.drawNormalDots$lambda$27(i, i2, interpolation, canvas, this, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                return drawNormalDots$lambda$27;
            }
        });
        if (interpolation < 1.0f) {
            invalidate();
            return;
        }
        this.innerFillAnimationCallback.invoke();
        this.innerFillAnimationCallback = new fvb0(5);
        this.outerFillAnimationCallback.invoke();
        this.outerFillAnimationCallback = new fvb0(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 drawNormalDots$lambda$27(int i, int i2, float f, Canvas canvas, PinCodeDotsView pinCodeDotsView, int i3, float f2, float f3) {
        Float f4 = null;
        if (i >= i3 || i2 >= i3) {
            if (i + 1 <= i3 && i3 <= i2) {
                f4 = Float.valueOf(kp50.t(5) * f);
            } else if (i2 + 1 <= i3 && i3 <= i) {
                f4 = Float.valueOf((1.0f - f) * kp50.t(5));
            } else if (i >= i3 && i2 >= i3) {
                f4 = Float.valueOf(kp50.t(5));
            }
        }
        if (f4 != null) {
            canvas.drawCircle(f2, f3, f4.floatValue(), pinCodeDotsView.paintFill);
        }
        canvas.drawCircle(f2, f3, kp50.t(4), pinCodeDotsView.paintStroke);
        return zy11.a;
    }

    private final void drawShimmeringDots(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.animStart > 4000) {
            this.animStart = uptimeMillis;
        }
        float interpolation = (this.shimmerInterpolator.getInterpolation(y6i0.g(uptimeMillis - this.animStart, new imz(0L, 4000L, false)) / 4000.0f) - 0.5f) * 2.0f * getWidth() * 2.0f;
        this.shimmerGradientBitmap.prepareToDraw();
        Canvas canvas2 = new Canvas(this.shimmerGradientBitmap);
        int save = canvas2.save();
        canvas2.translate(interpolation, 0.0f);
        try {
            canvas2.drawPaint(this.paintGradientShimmer);
            canvas2.restoreToCount(save);
            this.shimmerBufferBitmap.prepareToDraw();
            Canvas canvas3 = new Canvas(this.shimmerBufferBitmap);
            canvas3.drawBitmap(this.shimmerMaskBitmap, 0.0f, 0.0f, (Paint) null);
            canvas3.drawBitmap(this.shimmerGradientBitmap, 0.0f, 0.0f, this.paintShimmer);
            canvas.drawBitmap(this.shimmerBufferBitmap, 0.0f, 0.0f, (Paint) null);
            invalidate();
            this.innerFillAnimationCallback.invoke();
            this.innerFillAnimationCallback = new fvb0(4);
        } catch (Throwable th) {
            canvas2.restoreToCount(save);
            throw th;
        }
    }

    private final void drawWigglingDots(final Canvas canvas) {
        float uptimeMillis = SystemClock.uptimeMillis() - this.animStart;
        float f = uptimeMillis / 200.0f;
        Companion.getClass();
        float abs = Math.abs(f) % 1.0f;
        if (0.0f > abs || abs > 0.25f) {
            abs = ((0.25f > abs || abs > 0.5f) && (0.5f > abs || abs > 0.75f)) ? abs - 1.0f : 0.5f - abs;
        }
        final float signum = (Math.signum(f) * abs) / 0.25f;
        final float interpolation = this.wiggleInterpolator.getInterpolation(Math.abs(signum));
        drawDots(new zls() { // from class: dvb0
            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                zy11 drawWigglingDots$lambda$30;
                drawWigglingDots$lambda$30 = PinCodeDotsView.drawWigglingDots$lambda$30(canvas, interpolation, signum, this, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                return drawWigglingDots$lambda$30;
            }
        });
        if (uptimeMillis < 600.0f) {
            invalidate();
        } else {
            this.errorAnimationCallback.invoke();
            this.errorAnimationCallback = new z4b0(24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 drawWigglingDots$lambda$30(Canvas canvas, float f, float f2, PinCodeDotsView pinCodeDotsView, int i, float f3, float f4) {
        canvas.drawCircle((Math.signum(f2) * kp50.t(2) * f) + f3, f4, kp50.t(5), pinCodeDotsView.paintError);
        return zy11.a;
    }

    private final void initEditText() {
        addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.widgets.common.PinCodeDotsView$initEditText$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String obj;
                if (s == null || (obj = s.toString()) == null) {
                    return;
                }
                if (obj.length() == 0) {
                    PinCodeDotsView.this.getOnLastDigitErased().invoke();
                    PinCodeDotsView.this.setText(" ");
                } else {
                    Integer e = sza.e(gvu0.x0(obj));
                    d6w d6wVar = new d6w(0, 9, 1);
                    if (e == null || !d6wVar.g(e.intValue())) {
                        e = null;
                    }
                    if (e != null) {
                        PinCodeDotsView.this.getOnNewDigit().invoke(e);
                    }
                    if (!String.valueOf(PinCodeDotsView.this.getText()).equals(" ")) {
                        PinCodeDotsView.this.setText(" ");
                    }
                }
                PinCodeDotsView pinCodeDotsView = PinCodeDotsView.this;
                Editable text = pinCodeDotsView.getText();
                pinCodeDotsView.setSelection(text != null ? text.length() : 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        setOnTouchListener(new t8(15, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initEditText$lambda$16(PinCodeDotsView pinCodeDotsView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.isFocused()) {
            return true;
        }
        view.requestFocus();
        lcb1.f(pinCodeDotsView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onNewDigit$lambda$0(int i) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onSizeChanged$lambda$18$lambda$17(Canvas canvas, PinCodeDotsView pinCodeDotsView, int i, float f, float f2) {
        canvas.drawCircle(f, f2, kp50.t(5), pinCodeDotsView.paintFill);
        return zy11.a;
    }

    private final void setState(State state) {
        this.state = state;
        invalidate();
    }

    public static /* synthetic */ void showError$default(PinCodeDotsView pinCodeDotsView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = new fvb0(2);
        }
        pinCodeDotsView.showError(slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showError$lambda$22(PinCodeDotsView pinCodeDotsView, sls slsVar) {
        pinCodeDotsView.oldFilledCount = 0;
        pinCodeDotsView.filledCount = 0;
        pinCodeDotsView.errorAnimationCallback = slsVar;
        pinCodeDotsView.animStart = SystemClock.uptimeMillis();
        pinCodeDotsView.setState(State.ERROR);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showLoading$lambda$23(PinCodeDotsView pinCodeDotsView) {
        pinCodeDotsView.oldFilledCount = 0;
        pinCodeDotsView.filledCount = 0;
        pinCodeDotsView.animStart = SystemClock.uptimeMillis();
        pinCodeDotsView.setState(State.SHIMMER);
        return zy11.a;
    }

    public static /* synthetic */ void showSuccess$default(PinCodeDotsView pinCodeDotsView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = new fvb0(3);
        }
        pinCodeDotsView.showSuccess(slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showSuccess$lambda$25(PinCodeDotsView pinCodeDotsView, sls slsVar) {
        pinCodeDotsView.oldFilledCount = 0;
        pinCodeDotsView.filledCount = 0;
        pinCodeDotsView.successAnimationCallback = slsVar;
        pinCodeDotsView.animStart = SystemClock.uptimeMillis();
        pinCodeDotsView.setState(State.SUCCESS_INFLATE);
        return zy11.a;
    }

    public static /* synthetic */ void showSymbols$default(PinCodeDotsView pinCodeDotsView, int i, sls slsVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            slsVar = new fvb0(7);
        }
        pinCodeDotsView.showSymbols(i, slsVar);
    }

    public final void clear(sls onAnimationEnd) {
        showSymbols(0, onAnimationEnd);
    }

    public final sls getOnLastDigitErased() {
        return this.onLastDigitErased;
    }

    public final tls getOnNewDigit() {
        return this.onNewDigit;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i = n.a[this.state.ordinal()];
        if (i == 1) {
            drawNormalDots(canvas);
            return;
        }
        if (i == 2) {
            drawWigglingDots(canvas);
            return;
        }
        if (i == 3) {
            drawShimmeringDots(canvas);
            return;
        }
        if (i == 4) {
            drawInflatingDots(canvas);
        } else if (i == 5) {
            drawDeflatingDots(canvas);
        } else {
            w511.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension((int) ((Math.max(kp50.t(2), kp50.t(2)) * 2.0f) + (kp50.t(5) * 4.0f * 2.0f) + (kp50.t(24) * 3.0f)), (int) kp50.t(44));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.paintGradientShimmer.setShader(createShimmerGradient());
        int max = Math.max(1, w);
        int max2 = Math.max(1, h);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.shimmerGradientBitmap = Bitmap.createBitmap(max, max2, config);
        this.shimmerMaskBitmap = Bitmap.createBitmap(Math.max(1, w), Math.max(1, h), config);
        this.shimmerBufferBitmap = Bitmap.createBitmap(Math.max(1, w), Math.max(1, h), config);
        this.shimmerMaskBitmap.prepareToDraw();
        drawDots(new y740(11, new Canvas(this.shimmerMaskBitmap), this));
    }

    public final void setOnLastDigitErased(sls slsVar) {
        this.onLastDigitErased = slsVar;
    }

    public final void setOnNewDigit(tls tlsVar) {
        this.onNewDigit = tlsVar;
    }

    public final void showError(sls onAnimationEnd) {
        doAfterFillAnimation(new evb0(this, onAnimationEnd, 0));
        invalidate();
    }

    public final void showLoading() {
        doAfterFillAnimation(new t9b0(9, this));
        invalidate();
    }

    public final void showSuccess(sls onAnimationEnd) {
        doAfterFillAnimation(new evb0(this, onAnimationEnd, 1));
        invalidate();
    }

    public final void showSymbols(int n, sls onAnimationEnd) {
        if (n < 0 || n >= 5) {
            return;
        }
        this.oldFilledCount = this.filledCount;
        this.filledCount = n;
        this.animStart = SystemClock.uptimeMillis();
        this.outerFillAnimationCallback = onAnimationEnd;
        setState(State.INPUT);
    }

    public PinCodeDotsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PinCodeDotsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PinCodeDotsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
