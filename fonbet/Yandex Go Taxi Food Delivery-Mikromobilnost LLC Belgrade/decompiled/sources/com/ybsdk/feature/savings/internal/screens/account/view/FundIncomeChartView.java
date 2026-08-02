package com.ybsdk.feature.savings.internal.screens.account.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import defpackage.d6w;
import defpackage.kp50;
import defpackage.n;
import defpackage.nos;
import defpackage.oos;
import defpackage.pos;
import defpackage.rje;
import defpackage.scc;
import defpackage.sls;
import defpackage.t5w;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ung0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 [2\u00020\u0001:\u0002*\\B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0018J#\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0018J'\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010(Js\u00103\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\n2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0018\b\u0002\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u000101¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\fH\u0014¢\u0006\u0004\b5\u0010\u0018J/\u0010:\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010J\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020*0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020 0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010N\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010Y\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010OR&\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010UR\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010Z¨\u0006]"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/view/FundIncomeChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "delay", "Lzy11;", "startDrawAnimation", "(J)V", "", "targetAlpha", "animateGradientAlpha", "(F)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "trackTouch", "(Landroid/view/MotionEvent;)V", "stopTrackingTouch", "()V", RemoteBioParameters.X, "findNearestPointIndex", "(F)I", "setupGradient", "", "", CRLDistributionPointsExtension.POINTS, "Landroid/graphics/PointF;", "normalizePoints", "(Ljava/util/List;)Ljava/util/List;", "updateChartPath", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.Y, "drawPointLine", "(Landroid/graphics/Canvas;FF)V", "drawThumb", "Lpos;", "", "animate", "animationDelay", "Lkotlin/Function1;", "onAnimationProgress", "onPointSelected", "Lkotlin/Function0;", "onScrubStart", "render", "(Ljava/util/List;ZJLtls;Ltls;Lsls;)V", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "chartPath", "Landroid/graphics/Path;", "gradientPath", "Landroid/graphics/Paint;", "chartPaint", "Landroid/graphics/Paint;", "gradientPaint", "pointLinePaint", "thumbOuterPaint", "thumbInnerPaint", "pointDataList", "Ljava/util/List;", "normalizedPoints", "animationProgress", "F", "gradientAlpha", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "gradientAnimator", "Ltls;", "touchIndex", "Ljava/lang/Integer;", "thumbCenterX", "thumbCenterY", "Lsls;", "Companion", "oos", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundIncomeChartView extends View {
    private static final long ANIMATION_DURATION_MS = 2000;
    private static final float CHART_STROKE_WIDTH_PX;
    public static final oos Companion = new oos();
    private static final long GRADIENT_FADE_DURATION_MS = 200;
    private static final float HORIZONTAL_PADDING;
    private static final int MAX_ALPHA = 255;
    private static final float RADIUS_THUMB_INNER_PX;
    private static final float RADIUS_THUMB_OUTER_PX;
    private static final float SIZE_POINT_LINE_PX;
    private static final float VERTICAL_PADDING;
    private float animationProgress;
    private ValueAnimator animator;
    private final Paint chartPaint;
    private final Path chartPath;
    private float gradientAlpha;
    private ValueAnimator gradientAnimator;
    private final Paint gradientPaint;
    private final Path gradientPath;
    private List<? extends PointF> normalizedPoints;
    private tls onAnimationProgress;
    private tls onPointSelected;
    private sls onScrubStart;
    private List<pos> pointDataList;
    private final Paint pointLinePaint;
    private float thumbCenterX;
    private float thumbCenterY;
    private final Paint thumbInnerPaint;
    private final Paint thumbOuterPaint;
    private Integer touchIndex;

    static {
        float t = kp50.t(3);
        CHART_STROKE_WIDTH_PX = t;
        SIZE_POINT_LINE_PX = kp50.t(1);
        RADIUS_THUMB_INNER_PX = kp50.t(5);
        float t2 = kp50.t(8);
        RADIUS_THUMB_OUTER_PX = t2;
        HORIZONTAL_PADDING = t2;
        VERTICAL_PADDING = kp50.t(1) + (t / 2.0f) + t2;
    }

    public FundIncomeChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.chartPath = new Path();
        this.gradientPath = new Path();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(CHART_STROKE_WIDTH_PX);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        paint.setColor(rje.a(context, ung0.ybColor_fill_color7_400));
        this.chartPaint = paint;
        Paint paint2 = new Paint();
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.gradientPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(rje.a(context, ung0.ybColor_fill_default_900));
        paint3.setStrokeWidth(SIZE_POINT_LINE_PX);
        this.pointLinePaint = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style2);
        paint4.setColor(rje.a(context, ung0.ybColor_fill_default_0));
        paint4.setAntiAlias(true);
        this.thumbOuterPaint = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style2);
        paint5.setColor(rje.a(context, ung0.ybColor_fill_default_900));
        paint5.setAntiAlias(true);
        this.thumbInnerPaint = paint5;
        EmptyList emptyList = EmptyList.a;
        this.pointDataList = emptyList;
        this.normalizedPoints = emptyList;
        this.animationProgress = 1.0f;
        this.gradientAlpha = 1.0f;
    }

    private final void animateGradientAlpha(float targetAlpha) {
        ValueAnimator valueAnimator = this.gradientAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.gradientAlpha, targetAlpha);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new nos(this, 1));
        ofFloat.start();
        this.gradientAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateGradientAlpha$lambda$10$lambda$9(FundIncomeChartView fundIncomeChartView, ValueAnimator valueAnimator) {
        fundIncomeChartView.gradientAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fundIncomeChartView.invalidate();
    }

    private final void drawPointLine(Canvas canvas, float x, float y) {
        canvas.drawLine(x, y, x, getMeasuredHeight(), this.pointLinePaint);
    }

    private final void drawThumb(Canvas canvas, float x, float y) {
        canvas.drawCircle(x, y, RADIUS_THUMB_OUTER_PX, this.thumbOuterPaint);
        canvas.drawCircle(x, y, RADIUS_THUMB_INNER_PX, this.thumbInnerPaint);
    }

    private final int findNearestPointIndex(float x) {
        if (this.pointDataList.size() <= 1) {
            return 0;
        }
        float measuredWidth = getMeasuredWidth();
        float f = HORIZONTAL_PADDING;
        return y6i0.d((int) n.a(x, f, (measuredWidth - (2.0f * f)) / (this.pointDataList.size() - 1), 0.5f), 0, scc.f(this.pointDataList));
    }

    private final List<PointF> normalizePoints(List<Double> points) {
        Double valueOf;
        if (points.isEmpty()) {
            return EmptyList.a;
        }
        float measuredWidth = getMeasuredWidth() - (HORIZONTAL_PADDING * 2.0f);
        float measuredHeight = getMeasuredHeight() - (2.0f * VERTICAL_PADDING);
        List<Double> list = points;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            double doubleValue = ((Number) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
            }
            valueOf = Double.valueOf(doubleValue);
        } else {
            valueOf = null;
        }
        double doubleValue2 = valueOf != null ? valueOf.doubleValue() : 0.0d;
        Double d0 = a.d0(list);
        double doubleValue3 = (d0 != null ? d0.doubleValue() : 0.0d) - doubleValue2;
        int i = 0;
        if (points.size() == 1) {
            float f = points.get(0).doubleValue() <= 0.0d ? VERTICAL_PADDING + measuredHeight : VERTICAL_PADDING;
            float f2 = HORIZONTAL_PADDING;
            return scc.g(new PointF(f2, f), new PointF(f2 + measuredWidth, f));
        }
        if (doubleValue3 <= 0.0d) {
            float f3 = points.get(0).doubleValue() <= 0.0d ? VERTICAL_PADDING + measuredHeight : VERTICAL_PADDING;
            d6w e = scc.e(points);
            ArrayList arrayList = new ArrayList(tcc.n(e, 10));
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                arrayList.add(new PointF(((((t5w) it2).nextInt() * measuredWidth) / (points.size() - 1)) + HORIZONTAL_PADDING, f3));
            }
            return arrayList;
        }
        float size = measuredWidth / (points.size() - 1);
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList2.add(new PointF((i * size) + HORIZONTAL_PADDING, (VERTICAL_PADDING + measuredHeight) - (((float) ((((Number) obj).doubleValue() - doubleValue2) / doubleValue3)) * measuredHeight)));
            i = i2;
        }
        return arrayList2;
    }

    private final void setupGradient() {
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), rje.a(getContext(), ung0.ybColor_fill_color7_200), rje.a(getContext(), ung0.ybColor_internal_transparent), Shader.TileMode.CLAMP));
    }

    private final void startDrawAnimation(long delay) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animationProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setStartDelay(delay);
        ofFloat.setInterpolator(new PathInterpolator(0.16f, 1.0f, 0.3f, 1.0f));
        ofFloat.addUpdateListener(new nos(this, 0));
        ofFloat.start();
        this.animator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDrawAnimation$lambda$7$lambda$6(FundIncomeChartView fundIncomeChartView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fundIncomeChartView.animationProgress = floatValue;
        tls tlsVar = fundIncomeChartView.onAnimationProgress;
        if (tlsVar != null) {
            tlsVar.invoke(Float.valueOf(floatValue));
        }
        fundIncomeChartView.invalidate();
    }

    private final void stopTrackingTouch() {
        this.touchIndex = null;
        tls tlsVar = this.onPointSelected;
        if (tlsVar != null) {
            tlsVar.invoke(null);
        }
        invalidate();
    }

    private final void trackTouch(MotionEvent event) {
        if (this.pointDataList.isEmpty() || this.normalizedPoints.isEmpty()) {
            return;
        }
        float x = event.getX();
        int findNearestPointIndex = findNearestPointIndex(x);
        this.touchIndex = Integer.valueOf(findNearestPointIndex);
        if (this.pointDataList.size() == 1) {
            float f = HORIZONTAL_PADDING;
            this.thumbCenterX = y6i0.c(x, f, getMeasuredWidth() - f);
            this.thumbCenterY = ((PointF) a.P(this.normalizedPoints)).y;
        } else {
            PointF pointF = (PointF) a.S(findNearestPointIndex, this.normalizedPoints);
            if (pointF == null) {
                pointF = (PointF) a.P(this.normalizedPoints);
            }
            this.thumbCenterX = pointF.x;
            this.thumbCenterY = pointF.y;
        }
        tls tlsVar = this.onPointSelected;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(findNearestPointIndex));
        }
        invalidate();
    }

    private final void updateChartPath() {
        this.chartPath.reset();
        this.gradientPath.reset();
        if (this.normalizedPoints.isEmpty()) {
            return;
        }
        PointF pointF = (PointF) a.P(this.normalizedPoints);
        PointF pointF2 = (PointF) a.Z(this.normalizedPoints);
        this.chartPath.moveTo(pointF.x, pointF.y);
        this.gradientPath.moveTo(pointF.x, getMeasuredHeight());
        this.gradientPath.lineTo(pointF.x, pointF.y);
        int size = this.normalizedPoints.size();
        for (int i = 1; i < size; i++) {
            PointF pointF3 = this.normalizedPoints.get(i);
            this.chartPath.lineTo(pointF3.x, pointF3.y);
            this.gradientPath.lineTo(pointF3.x, pointF3.y);
        }
        this.gradientPath.lineTo(pointF2.x, getMeasuredHeight());
        this.gradientPath.close();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.gradientAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.animator = null;
        this.gradientAnimator = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth() * this.animationProgress, getMeasuredHeight());
            boolean z = this.touchIndex != null;
            float f = this.gradientAlpha;
            if (f > 0.0f) {
                this.gradientPaint.setAlpha((int) (255.0f * f));
                canvas.drawPath(this.gradientPath, this.gradientPaint);
            }
            canvas.drawPath(this.chartPath, this.chartPaint);
            if (z) {
                drawPointLine(canvas, this.thumbCenterX, this.thumbCenterY);
                drawThumb(canvas, this.thumbCenterX, this.thumbCenterY);
            } else {
                PointF pointF = (PointF) a.b0(this.normalizedPoints);
                if (pointF != null) {
                    drawPointLine(canvas, pointF.x, pointF.y);
                    drawThumb(canvas, pointF.x, pointF.y);
                }
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setupGradient();
        if (this.pointDataList.isEmpty()) {
            return;
        }
        List<pos> list = this.pointDataList;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((pos) it.next()).a));
        }
        this.normalizedPoints = normalizePoints(arrayList);
        updateChartPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        sls slsVar;
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    trackTouch(event);
                }
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            stopTrackingTouch();
            animateGradientAlpha(1.0f);
        } else {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.pointDataList.isEmpty() && (slsVar = this.onScrubStart) != null) {
                slsVar.invoke();
            }
            animateGradientAlpha(0.0f);
            trackTouch(event);
        }
        return true;
    }

    public final void render(List<pos> points, boolean animate, long animationDelay, tls onAnimationProgress, tls onPointSelected, sls onScrubStart) {
        if (points.isEmpty()) {
            EmptyList emptyList = EmptyList.a;
            this.pointDataList = emptyList;
            this.normalizedPoints = emptyList;
            this.animationProgress = 1.0f;
            this.gradientAlpha = 1.0f;
            this.touchIndex = null;
            invalidate();
            return;
        }
        this.pointDataList = points;
        ValueAnimator valueAnimator = this.gradientAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.gradientAlpha = 1.0f;
        this.onAnimationProgress = onAnimationProgress;
        this.onPointSelected = onPointSelected;
        this.onScrubStart = onScrubStart;
        this.touchIndex = null;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            List<pos> list = points;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((pos) it.next()).a));
            }
            this.normalizedPoints = normalizePoints(arrayList);
            updateChartPath();
        }
        if (!animate) {
            this.animationProgress = 1.0f;
            invalidate();
        } else {
            this.animationProgress = 0.0f;
            invalidate();
            startDrawAnimation(animationDelay);
        }
    }

    public FundIncomeChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FundIncomeChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FundIncomeChartView(Context context) {
        this(context, null, 0, 6, null);
    }
}
