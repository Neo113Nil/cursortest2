package com.ybsdk.widgets.common.checkbox;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.ci8;
import defpackage.efb;
import defpackage.ffb;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.m810;
import defpackage.r5c;
import defpackage.rje;
import defpackage.scc;
import defpackage.ung0;
import defpackage.w3i0;
import defpackage.w511;
import defpackage.y6i0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0004)uvwB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010\u0016J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u0010(J\u0017\u00100\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b1\u0010(J\u0017\u00102\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b2\u0010(J\u001f\u00105\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010\u0016J\u000f\u0010:\u001a\u000203H\u0002¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u000203H\u0002¢\u0006\u0004\b?\u0010@R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0012R\u0016\u0010H\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010SR\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010SR\u0014\u0010f\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010IR\u0016\u0010i\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010IR\u0016\u0010j\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010IR\u0016\u0010k\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010IR\u0016\u0010l\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010IR\u0016\u0010m\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010IR\u0016\u0010n\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010NR\u0014\u0010o\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010NR\u0014\u0010p\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010NR\u0014\u0010s\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006x"}, d2 = {"Lcom/ybsdk/widgets/common/checkbox/CheckBoxView;", "Landroid/view/View;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "isChecked", "()Z", "isEnabled", "Lzy11;", "setEnabled", "(Z)V", "checked", "setChecked", "toggle", "()V", "animate", "(ZZ)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lffb;", "l", "setOnCheckedChangeListener", "(Lffb;)V", "startAnimation", "reset", "drawCenter", "drawBorder", "drawTick", "drawTickPath", "", "sideProgress", "drawLeftTickPart", "(Landroid/graphics/Canvas;F)V", "drawRightTickPart", "updateCheckedAnimationParams", "updateUncheckedAnimationParams", "getFloorScale", "()F", "startColor", "endColor", "progress", "getGradientColor", "(IIF)I", "Z", "isViewEnabled", "listener", "Lffb;", "toggleOnClick", "getToggleOnClick", "setToggleOnClick", "animationProgress", "F", "", "animationStartTime", "J", "uncheckedColor", CA20Status.STATUS_USER_I, "uncheckedColorDisabled", "colorTickDefault", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "", "Landroid/graphics/Point;", "tickPoints", "Ljava/util/List;", "Landroid/graphics/Path;", "tickPath", "Landroid/graphics/Path;", "tickPaint", "Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Size;", "size", "Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Size;", "Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Type;", "type", "Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Type;", "floorPaint", "centerPoint", "Landroid/graphics/Point;", "leftLineDistance", "rightLineDistance", "totalDistance", "drawDistance", "scaleVal", "floorScale", "floorColor", "predefinedCheckColor", "predefinedCheckColorDisabled", "getCheckColor", "()I", "checkColor", "Companion", "efb", "Size", "Type", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckBoxView extends View implements Checkable {
    private static final long ANIMATION_DURATION = 250;
    private static final float ANIMATION_END_PROGRESS = 1.0f;
    private static final float ANIMATION_HALF_PROGRESS = 0.5f;
    private static final long ANIMATION_NOT_STARTED = 0;
    private static final float ANIMATION_START_PROGRESS = 0.0f;
    public static final efb Companion = new efb();
    private static final float EDGE_0_X_POS_X_MULTIPLIER = 0.299f;
    private static final float EDGE_0_Y_POS_X_MULTIPLIER = 0.517f;
    private static final float EDGE_1_X_POS_X_MULTIPLIER = 0.441f;
    private static final float EDGE_1_y_POS_X_MULTIPLIER = 0.668f;
    private static final float EDGE_2_X_POS_X_MULTIPLIER = 0.704f;
    private static final float EDGE_2_Y_POS_X_MULTIPLIER = 0.327f;
    private static final float SCALE_THRESHOLD = 0.2f;
    private static final float STROKE_WIDTH_MULTIPLIER = 15.0f;
    private float animationProgress;
    private long animationStartTime;
    private final ArgbEvaluator argbEvaluator;
    private final Point centerPoint;
    private boolean checked;
    private final int colorTickDefault;
    private float drawDistance;
    private int floorColor;
    private final Paint floorPaint;
    private float floorScale;
    private boolean isViewEnabled;
    private float leftLineDistance;
    private ffb listener;
    private final Paint paint;
    private final int predefinedCheckColor;
    private final int predefinedCheckColorDisabled;
    private float rightLineDistance;
    private float scaleVal;
    private final Size size;
    private final Paint tickPaint;
    private final Path tickPath;
    private final List<Point> tickPoints;
    private boolean toggleOnClick;
    private float totalDistance;
    private final Type type;
    private final int uncheckedColor;
    private final int uncheckedColorDisabled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Size;", "", "boundsDp", "", "<init>", "(Ljava/lang/String;II)V", "getBoundsDp", "()I", "Small", "Medium", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        private final int boundsDp;
        public static final Size Small = new Size("Small", 0, 26);
        public static final Size Medium = new Size("Medium", 1, 32);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{Small, Medium};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Size(String str, int i, int i2) {
            this.boundsDp = i2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        public final int getBoundsDp() {
            return this.boundsDp;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/checkbox/CheckBoxView$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Colored", "Dark", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Colored = new Type("Colored", 0);
        public static final Type Dark = new Type("Dark", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Colored, Dark};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Type(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CheckBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int a;
        int a2;
        this.isViewEnabled = true;
        this.toggleOnClick = true;
        this.animationProgress = 1.0f;
        this.uncheckedColor = rje.a(context, ung0.ybColor_control_default);
        this.uncheckedColorDisabled = rje.a(context, ung0.ybColor_control_defaultDisabled);
        int a3 = rje.a(context, ung0.ybColor_control_handleDefault);
        this.colorTickDefault = a3;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paint = paint;
        this.argbEvaluator = new ArgbEvaluator();
        this.tickPoints = scc.g(new Point(), new Point(), new Point());
        this.tickPath = new Path();
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.tickPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.floorPaint = paint3;
        this.centerPoint = new Point();
        this.scaleVal = 1.0f;
        this.floorScale = 1.0f;
        this.floorColor = rje.a(context, ung0.ybColor_control_default);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbSdkCheckBoxView);
        this.size = Size.values()[obtainStyledAttributes.getInt(w3i0.YbSdkCheckBoxView_ybsdk_checkBoxSize, 1)];
        this.checked = obtainStyledAttributes.getBoolean(w3i0.YbSdkCheckBoxView_android_checked, false);
        Type type = Type.values()[obtainStyledAttributes.getInt(w3i0.YbSdkCheckBoxView_ybsdk_colorType, 0)];
        this.type = type;
        this.toggleOnClick = obtainStyledAttributes.getBoolean(w3i0.YbSdkCheckBoxView_ybsdk_toggleOnClick, true);
        int[] iArr = a.a;
        int i = iArr[type.ordinal()];
        if (i == 1) {
            a = rje.a(context, ung0.ybColor_control_default);
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            a = rje.a(context, ung0.ybColor_control_activeDark);
        }
        this.predefinedCheckColor = a;
        int i2 = iArr[type.ordinal()];
        if (i2 == 1) {
            a2 = rje.a(context, ung0.ybColor_control_defaultDisabled);
        } else {
            if (i2 != 2) {
                w511.b();
                throw null;
            }
            a2 = rje.a(context, ung0.ybColor_control_activeDarkDisabled);
        }
        this.predefinedCheckColorDisabled = a2;
        obtainStyledAttributes.recycle();
        paint.setColor(getCheckColor());
        paint2.setColor(a3);
        setOnClickListener(new ci8(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(CheckBoxView checkBoxView, View view) {
        if (checkBoxView.toggleOnClick) {
            checkBoxView.toggle();
        }
    }

    private final void drawBorder(Canvas canvas) {
        this.floorPaint.setColor(this.floorColor);
        int i = this.centerPoint.x;
        canvas.drawCircle(i, r0.y, i * this.floorScale, this.floorPaint);
    }

    private final void drawCenter(Canvas canvas) {
        this.paint.setColor(isEnabled() ? this.uncheckedColor : this.uncheckedColorDisabled);
        int i = this.centerPoint.x;
        canvas.drawCircle(i, r0.y, i * this.scaleVal, this.paint);
    }

    private final void drawLeftTickPart(Canvas canvas, float sideProgress) {
        this.tickPath.reset();
        this.tickPath.moveTo(this.tickPoints.get(0).x, this.tickPoints.get(0).y);
        this.tickPath.lineTo(((this.tickPoints.get(1).x - this.tickPoints.get(0).x) * sideProgress) + this.tickPoints.get(0).x, ((this.tickPoints.get(1).y - this.tickPoints.get(0).y) * sideProgress) + this.tickPoints.get(0).y);
        canvas.drawPath(this.tickPath, this.tickPaint);
    }

    private final void drawRightTickPart(Canvas canvas, float sideProgress) {
        float min = Math.min(sideProgress, 1.0f);
        this.tickPath.moveTo(this.tickPoints.get(1).x, this.tickPoints.get(1).y);
        this.tickPath.lineTo(((this.tickPoints.get(2).x - this.tickPoints.get(1).x) * min) + this.tickPoints.get(1).x, ((this.tickPoints.get(2).y - this.tickPoints.get(1).y) * min) + this.tickPoints.get(1).y);
        canvas.drawPath(this.tickPath, this.tickPaint);
    }

    private final void drawTick(Canvas canvas) {
        if (isChecked()) {
            drawTickPath(canvas);
        }
    }

    private final void drawTickPath(Canvas canvas) {
        float f = this.drawDistance;
        float f2 = this.leftLineDistance;
        drawLeftTickPart(canvas, f < f2 ? f / f2 : 1.0f);
        float f3 = this.drawDistance;
        float f4 = this.leftLineDistance;
        if (f3 > f4) {
            drawRightTickPart(canvas, (f3 - f4) / this.rightLineDistance);
        }
    }

    private final int getCheckColor() {
        return this.isViewEnabled ? this.predefinedCheckColor : this.predefinedCheckColorDisabled;
    }

    private final float getFloorScale() {
        return (Math.abs(this.animationProgress - 0.5f) * 0.4f) + 0.8f;
    }

    private final int getGradientColor(int startColor, int endColor, float progress) {
        return ((Integer) this.argbEvaluator.evaluate(progress, Integer.valueOf(startColor), Integer.valueOf(endColor))).intValue();
    }

    private final void reset() {
        this.animationProgress = 1.0f;
        if (isChecked()) {
            updateCheckedAnimationParams();
        } else {
            updateUncheckedAnimationParams();
        }
        invalidate();
    }

    private final void startAnimation() {
        this.animationStartTime = SystemClock.uptimeMillis();
        invalidate();
    }

    private final void updateCheckedAnimationParams() {
        float f = this.totalDistance;
        float f2 = this.animationProgress;
        this.drawDistance = f * f2;
        this.scaleVal = 1.0f - f2;
        this.floorColor = getGradientColor(this.uncheckedColor, getCheckColor(), 1.0f - this.scaleVal);
        this.floorScale = getFloorScale();
    }

    private final void updateUncheckedAnimationParams() {
        float f = this.totalDistance;
        float f2 = this.animationProgress;
        this.drawDistance = f * f2;
        this.scaleVal = f2;
        this.floorColor = getGradientColor(getCheckColor(), isEnabled() ? this.uncheckedColor : this.uncheckedColorDisabled, this.scaleVal);
        this.floorScale = getFloorScale();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.CheckBox";
    }

    public final boolean getToggleOnClick() {
        return this.toggleOnClick;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isViewEnabled;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.animationStartTime > 0) {
            this.animationProgress = ((Number) y6i0.h(Float.valueOf((SystemClock.uptimeMillis() - this.animationStartTime) / 250.0f), new r5c(0.0f, 1.0f))).floatValue();
        }
        if (isChecked()) {
            updateCheckedAnimationParams();
        } else {
            updateUncheckedAnimationParams();
        }
        drawBorder(canvas);
        drawCenter(canvas);
        drawTick(canvas);
        if (this.animationProgress < 1.0f) {
            postInvalidateOnAnimation();
            return;
        }
        if (this.animationStartTime != 0) {
            postInvalidateOnAnimation();
        }
        this.animationStartTime = 0L;
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.centerPoint.x = getMeasuredWidth() / 2;
        this.centerPoint.y = getMeasuredHeight() / 2;
        this.tickPaint.setStrokeWidth(getMeasuredHeight() / STROKE_WIDTH_MULTIPLIER);
        this.tickPoints.get(0).x = m810.b(getMeasuredWidth() * EDGE_0_X_POS_X_MULTIPLIER);
        this.tickPoints.get(0).y = m810.b(getMeasuredHeight() * EDGE_0_Y_POS_X_MULTIPLIER);
        this.tickPoints.get(1).x = m810.b(getMeasuredWidth() * EDGE_1_X_POS_X_MULTIPLIER);
        this.tickPoints.get(1).y = m810.b(getMeasuredHeight() * EDGE_1_y_POS_X_MULTIPLIER);
        this.tickPoints.get(2).x = m810.b(getMeasuredWidth() * EDGE_2_X_POS_X_MULTIPLIER);
        this.tickPoints.get(2).y = m810.b(getMeasuredHeight() * EDGE_2_Y_POS_X_MULTIPLIER);
        this.leftLineDistance = (float) Math.hypot(this.tickPoints.get(1).x - this.tickPoints.get(0).x, this.tickPoints.get(1).y - this.tickPoints.get(0).y);
        float hypot = (float) Math.hypot(this.tickPoints.get(2).x - this.tickPoints.get(1).x, this.tickPoints.get(2).y - this.tickPoints.get(1).y);
        this.rightLineDistance = hypot;
        this.totalDistance = this.leftLineDistance + hypot;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int r = kp50.r(this.size.getBoundsDp());
        setMeasuredDimension(r, r);
    }

    public final void setChecked(boolean checked, boolean animate) {
        if (isEnabled()) {
            if (!animate) {
                setChecked(checked);
                return;
            }
            this.checked = checked;
            this.animationProgress = 0.0f;
            startAnimation();
            ffb ffbVar = this.listener;
            if (ffbVar != null) {
                ffbVar.b(this, this.checked);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean isEnabled) {
        this.isViewEnabled = isEnabled;
        reset();
    }

    public final void setOnCheckedChangeListener(ffb l) {
        this.listener = l;
    }

    public final void setToggleOnClick(boolean z) {
        this.toggleOnClick = z;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isEnabled()) {
            setChecked(!isChecked());
            if (isChecked()) {
                updateCheckedAnimationParams();
            } else {
                updateUncheckedAnimationParams();
            }
            startAnimation();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        this.checked = checked;
        reset();
        ffb ffbVar = this.listener;
        if (ffbVar != null) {
            ffbVar.b(this, this.checked);
        }
    }

    public /* synthetic */ CheckBoxView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBoxView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
