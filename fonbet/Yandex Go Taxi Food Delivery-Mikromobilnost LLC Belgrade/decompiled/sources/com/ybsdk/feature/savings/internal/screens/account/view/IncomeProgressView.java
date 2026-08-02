package com.ybsdk.feature.savings.internal.screens.account.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.kp50;
import defpackage.lpv;
import defpackage.m810;
import defpackage.mpv;
import defpackage.rje;
import defpackage.sls;
import defpackage.smv;
import defpackage.tls;
import defpackage.ung0;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 k2\u00020\u0001:\u0002\u001dlB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0!¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u000e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010!¢\u0006\u0004\b*\u0010$J5\u00100\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020&2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0%¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u00105J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u00105J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u00105J\u0013\u0010<\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010\u0014J\u0013\u0010=\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010\u0014J\u0013\u0010>\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010\u0014J\u0013\u0010?\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010\u0014J\u0013\u0010@\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b@\u0010\u0014J\u0013\u0010A\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0014R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010G\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010H\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010DR\u0014\u0010J\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010DR\u0014\u0010K\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010DR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u001c\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u00105R\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010aR\u0016\u0010b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR$\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010i¨\u0006m"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/view/IncomeProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "Lmpv;", ClidProvider.STATE, "render", "(Lmpv;)V", "Lkotlin/Function1;", "listener", "setProgressListener", "(Ltls;)V", "Lkotlin/Function0;", "", "progressAnimationDurationCallback", "setProgressAnimationDurationCallback", "(Lsls;)V", "setTrackTouchedListener", "", "from", "to", "animationDuration", "onAnimationEnd", "animateProgress", "(FFJLsls;)V", "trackTouch", "(Landroid/view/MotionEvent;)V", "stopTrackingTouch", "()V", "newScale", "updatePositionScale", "(F)V", "updateThumbPosition", "onEnableStateUpdate", "adjustDrawingParams", "drawGradient", "drawBottomLine", "drawTrack", "drawPointLine", "drawZeroPoint", "drawThumb", "Landroid/graphics/Paint;", "paintTrack", "Landroid/graphics/Paint;", "paintTrackInactive", "paintPointLine", "paintZeroPointInner", "paintZeroPointOuter", "paintThumbInner", "paintBottomLine", "paintGradient", "Landroid/graphics/RectF;", "drawingBorders", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "gradientPath", "Landroid/graphics/Path;", "Landroid/graphics/LinearGradient;", "gradientEnabled", "Landroid/graphics/LinearGradient;", "gradientDisabled", "Landroid/view/animation/Interpolator;", "animationInterpolator", "Landroid/view/animation/Interpolator;", "getAnimationInterpolator$annotations", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "thumbCenterX", "F", "thumbCenterY", "thumbPositionScale", "Lsls;", "currPositionUnderThumb", CA20Status.STATUS_USER_I, "isDragging", "Z", "currentState", "Lmpv;", "progressListener", "Ltls;", "trackTouchedListener", "Companion", "lpv", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IncomeProgressView extends View {
    private static final long DEFAULT_ANIMATION_DURATION_MS = 750;
    private Interpolator animationInterpolator;
    private ValueAnimator animator;
    private int currPositionUnderThumb;
    private mpv currentState;
    private final RectF drawingBorders;
    private LinearGradient gradientDisabled;
    private LinearGradient gradientEnabled;
    private final Path gradientPath;
    private boolean isDragging;
    private final Paint paintBottomLine;
    private final Paint paintGradient;
    private final Paint paintPointLine;
    private final Paint paintThumbInner;
    private final Paint paintTrack;
    private final Paint paintTrackInactive;
    private final Paint paintZeroPointInner;
    private final Paint paintZeroPointOuter;
    private sls progressAnimationDurationCallback;
    private tls progressListener;
    private float thumbCenterX;
    private float thumbCenterY;
    private float thumbPositionScale;
    private tls trackTouchedListener;
    public static final lpv Companion = new lpv();
    private static final float SIZE_TRACK_PX = kp50.t(3);
    private static final float SIZE_POINT_LINE_PX = kp50.t(1);
    private static final float RADIUS_THUMB_INNER_PX = kp50.t(5);
    private static final float RADIUS_THUMB_OUTER_PX = kp50.t(8);
    private static final float RADIUS_ZERO_POINT_INNER_PX = kp50.t(2);
    private static final float RADIUS_ZERO_POINT_OUTER_PX = kp50.t(4);
    private static final float DRAWING_BORDER_PADDING_VERTICAL_PX = kp50.t(8);
    private static final float DRAWING_BORDER_PADDING_HORIZONTAL_PX = kp50.t(6);

    public IncomeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(SIZE_TRACK_PX);
        paint.setAntiAlias(true);
        this.paintTrack = paint;
        Paint paint2 = new Paint(paint);
        paint2.setColor(rje.a(context, ung0.ybColor_fill_default_100));
        this.paintTrackInactive = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(rje.a(context, ung0.ybColor_fill_default_900));
        paint3.setStrokeWidth(SIZE_POINT_LINE_PX);
        this.paintPointLine = paint3;
        Paint paint4 = new Paint();
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        paint4.setColor(rje.a(context, ung0.ybColor_fill_color7_400));
        paint4.setAntiAlias(true);
        this.paintZeroPointInner = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style2);
        paint5.setColor(rje.a(context, ung0.ybColor_fill_default_0));
        paint5.setAntiAlias(true);
        this.paintZeroPointOuter = paint5;
        Paint paint6 = new Paint();
        paint6.setStyle(style2);
        paint6.setColor(rje.a(context, ung0.ybColor_fill_default_900));
        paint6.setAntiAlias(true);
        this.paintThumbInner = paint6;
        Paint paint7 = new Paint();
        paint7.setStyle(style);
        paint7.setColor(rje.a(context, ung0.ybColor_other_separator));
        this.paintBottomLine = paint7;
        Paint paint8 = new Paint();
        paint8.setStyle(style2);
        this.paintGradient = paint8;
        this.drawingBorders = new RectF();
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        this.gradientPath = path;
        this.animationInterpolator = new PathInterpolator(0.25f, 1.0f, 0.65f, 1.0f);
        this.progressAnimationDurationCallback = new smv(19);
        setClickable(true);
        onEnableStateUpdate();
        if (isInEditMode()) {
            render(new mpv(0, 100, 50));
        }
    }

    private final void adjustDrawingParams() {
        RectF rectF = this.drawingBorders;
        float f = DRAWING_BORDER_PADDING_HORIZONTAL_PX;
        float f2 = DRAWING_BORDER_PADDING_VERTICAL_PX;
        rectF.set(f, f2, getMeasuredWidth() - f, getMeasuredHeight() - f2);
        Paint paint = this.paintTrack;
        RectF rectF2 = this.drawingBorders;
        float f3 = rectF2.left;
        float f4 = rectF2.bottom;
        float f5 = rectF2.right;
        float f6 = rectF2.top;
        int a = rje.a(getContext(), ung0.ybColor_fill_color7_400);
        int a2 = rje.a(getContext(), ung0.ybColor_gradient_income_progress_start);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(f3, f4, f5, f6, a, a2, tileMode));
        this.gradientEnabled = new LinearGradient(0.0f, 0.0f, 0.0f, this.drawingBorders.bottom, rje.a(getContext(), ung0.ybColor_fill_color7_200), rje.a(getContext(), ung0.ybColor_gradient_income_under_progress_end), tileMode);
        this.gradientDisabled = new LinearGradient(0.0f, 0.0f, 0.0f, this.drawingBorders.bottom, rje.a(getContext(), ung0.ybColor_fill_default_50), rje.a(getContext(), ung0.ybColor_internal_transparent), tileMode);
        this.paintGradient.setShader(isEnabled() ? this.gradientEnabled : this.gradientDisabled);
        updateThumbPosition();
    }

    public static /* synthetic */ void animateProgress$default(IncomeProgressView incomeProgressView, float f, float f2, long j, sls slsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            slsVar = new smv(18);
        }
        incomeProgressView.animateProgress(f, f2, j, slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgress$lambda$14$lambda$12(IncomeProgressView incomeProgressView, ValueAnimator valueAnimator) {
        incomeProgressView.updatePositionScale(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void drawBottomLine(Canvas canvas) {
        RectF rectF = this.drawingBorders;
        float f = rectF.left;
        float f2 = rectF.bottom;
        canvas.drawLine(f, f2, rectF.right, f2, this.paintBottomLine);
    }

    private final void drawGradient(Canvas canvas) {
        this.gradientPath.rewind();
        Path path = this.gradientPath;
        RectF rectF = this.drawingBorders;
        path.moveTo(rectF.left, rectF.bottom);
        this.gradientPath.lineTo(this.thumbCenterX, this.thumbCenterY);
        this.gradientPath.lineTo(this.thumbCenterX, this.drawingBorders.bottom);
        Path path2 = this.gradientPath;
        RectF rectF2 = this.drawingBorders;
        path2.lineTo(rectF2.left, rectF2.bottom);
        this.gradientPath.close();
        canvas.drawPath(this.gradientPath, this.paintGradient);
    }

    private final void drawPointLine(Canvas canvas) {
        float f = this.thumbCenterX;
        canvas.drawLine(f, this.thumbCenterY, f, this.drawingBorders.bottom, this.paintPointLine);
    }

    private final void drawThumb(Canvas canvas) {
        canvas.drawCircle(this.thumbCenterX, this.thumbCenterY, RADIUS_THUMB_OUTER_PX, this.paintZeroPointOuter);
        canvas.drawCircle(this.thumbCenterX, this.thumbCenterY, RADIUS_THUMB_INNER_PX, this.paintThumbInner);
    }

    private final void drawTrack(Canvas canvas) {
        Canvas canvas2;
        if (isEnabled()) {
            RectF rectF = this.drawingBorders;
            canvas2 = canvas;
            canvas2.drawLine(rectF.left, rectF.bottom, this.thumbCenterX, this.thumbCenterY, this.paintTrack);
        } else {
            canvas2 = canvas;
        }
        float f = isEnabled() ? this.thumbCenterX : this.drawingBorders.left;
        float f2 = isEnabled() ? this.thumbCenterY : this.drawingBorders.bottom;
        RectF rectF2 = this.drawingBorders;
        canvas2.drawLine(f, f2, rectF2.right, rectF2.top, this.paintTrackInactive);
    }

    private final void drawZeroPoint(Canvas canvas) {
        RectF rectF = this.drawingBorders;
        canvas.drawCircle(rectF.left, rectF.bottom, RADIUS_ZERO_POINT_OUTER_PX, this.paintZeroPointOuter);
        RectF rectF2 = this.drawingBorders;
        canvas.drawCircle(rectF2.left, rectF2.bottom, RADIUS_ZERO_POINT_INNER_PX, this.paintZeroPointInner);
    }

    private static /* synthetic */ void getAnimationInterpolator$annotations() {
    }

    private final void onEnableStateUpdate() {
        int a = rje.a(getContext(), isEnabled() ? ung0.ybColor_fill_default_900 : ung0.ybColor_fill_default_500);
        this.paintPointLine.setColor(a);
        this.paintThumbInner.setColor(a);
        this.paintZeroPointInner.setColor(rje.a(getContext(), isEnabled() ? ung0.ybColor_fill_color7_500 : ung0.ybColor_fill_default_100));
        Paint paint = this.paintGradient;
        Shader shader = isEnabled() ? this.gradientEnabled : this.gradientDisabled;
        if (shader == null) {
            shader = this.paintGradient.getShader();
        }
        paint.setShader(shader);
        invalidate();
    }

    private final void stopTrackingTouch() {
        tls tlsVar;
        float f = this.thumbPositionScale;
        mpv mpvVar = this.currentState;
        animateProgress$default(this, f, mpvVar != null ? mpvVar.a() : 0.0f, ((Number) this.progressAnimationDurationCallback.invoke()).longValue(), null, 8, null);
        if (this.isDragging && (tlsVar = this.trackTouchedListener) != null) {
            tlsVar.invoke(Boolean.FALSE);
        }
        this.isDragging = false;
    }

    private final void trackTouch(MotionEvent event) {
        tls tlsVar;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float x = event.getX();
        RectF rectF = this.drawingBorders;
        updatePositionScale(x <= rectF.left ? 0.0f : x >= rectF.width() ? 1.0f : x / this.drawingBorders.width());
        if (!this.isDragging && (tlsVar = this.trackTouchedListener) != null) {
            tlsVar.invoke(Boolean.TRUE);
        }
        this.isDragging = true;
    }

    private final void updatePositionScale(float newScale) {
        this.thumbPositionScale = newScale;
        updateThumbPosition();
    }

    private final void updateThumbPosition() {
        RectF rectF = this.drawingBorders;
        float f = rectF.right * this.thumbPositionScale;
        float f2 = rectF.left;
        if (f < f2) {
            f = f2;
        }
        this.thumbCenterX = f;
        float f3 = rectF.bottom;
        float height = rectF.height();
        float f4 = this.thumbPositionScale;
        float f5 = f3 - (height * f4);
        float f6 = this.drawingBorders.top;
        if (f5 < f6) {
            f5 = f6;
        }
        this.thumbCenterY = f5;
        mpv mpvVar = this.currentState;
        if (mpvVar != null) {
            int i = mpvVar.b;
            int i2 = mpvVar.a;
            int b = i - i2 == 0 ? 0 : i2 + m810.b((i - i2) * f4);
            this.currPositionUnderThumb = b;
            tls tlsVar = this.progressListener;
            if (tlsVar != null) {
                tlsVar.invoke(Integer.valueOf(b));
            }
        }
        invalidate();
    }

    public final void animateProgress(float from, float to, long animationDuration, final sls onAnimationEnd) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.setDuration(animationDuration);
        ofFloat.setInterpolator(this.animationInterpolator);
        ofFloat.addUpdateListener(new yso(7, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.account.view.IncomeProgressView$animateProgress$lambda$14$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IncomeProgressView.this.animator = null;
                onAnimationEnd.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.animator = ofFloat;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        try {
            drawGradient(canvas);
            drawBottomLine(canvas);
            drawTrack(canvas);
            drawPointLine(canvas);
            drawZeroPoint(canvas);
            drawThumb(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        adjustDrawingParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r0 != 3) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                }
            }
            stopTrackingTouch();
            return true;
        }
        trackTouch(event);
        return true;
    }

    public final void render(mpv state) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentState = state;
        updatePositionScale(state.a());
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        onEnableStateUpdate();
    }

    public final void setProgressAnimationDurationCallback(sls progressAnimationDurationCallback) {
        this.progressAnimationDurationCallback = progressAnimationDurationCallback;
    }

    public final void setProgressListener(tls listener) {
        this.progressListener = listener;
    }

    public final void setTrackTouchedListener(tls listener) {
        this.trackTouchedListener = listener;
    }

    public IncomeProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ IncomeProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public IncomeProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
