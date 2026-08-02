package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.eng0;
import defpackage.f8p;
import defpackage.g8e;
import defpackage.h8p;
import defpackage.hy00;
import defpackage.jhr0;
import defpackage.kp50;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.n891;
import defpackage.ny61;
import defpackage.osi0;
import defpackage.oyr;
import defpackage.pdr;
import defpackage.r710;
import defpackage.rdr;
import defpackage.ry01;
import defpackage.s6;
import defpackage.th91;
import defpackage.uir0;
import defpackage.xh91;
import defpackage.xre;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes11.dex */
public final class MaterialContainerTransform extends Transition {
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private com.google.android.material.shape.b endShapeAppearanceModel;
    private View endView;
    private int endViewId;
    private int fadeMode;
    private r710 fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private r710 scaleMaskProgressThresholds;
    private r710 scaleProgressThresholds;
    private int scrimColor;
    private r710 shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private com.google.android.material.shape.b startShapeAppearanceModel;
    private View startView;
    private int startViewId;
    private int transitionDirection;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final c DEFAULT_ENTER_THRESHOLDS = new c(new r710(0.0f, 0.25f), new r710(0.0f, 1.0f), new r710(0.0f, 1.0f), new r710(0.0f, 0.75f));
    private static final c DEFAULT_RETURN_THRESHOLDS = new c(new r710(0.6f, 0.9f), new r710(0.0f, 1.0f), new r710(0.0f, 0.9f), new r710(0.3f, 0.9f));
    private static final c DEFAULT_ENTER_THRESHOLDS_ARC = new c(new r710(0.1f, 0.4f), new r710(0.1f, 1.0f), new r710(0.1f, 1.0f), new r710(0.1f, 0.9f));
    private static final c DEFAULT_RETURN_THRESHOLDS_ARC = new c(new r710(0.6f, 0.9f), new r710(0.0f, 0.9f), new r710(0.0f, 0.9f), new r710(0.2f, 0.9f));

    public static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final com.google.android.material.shape.b endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final f8p fadeModeEvaluator;
        private h8p fadeModeResult;
        private final pdr fitModeEvaluator;
        private rdr fitModeResult;
        private final hy00 maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final c progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final com.google.android.material.shape.b startShapeAppearanceModel;
        private final View startView;

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.b bVar, float f, View view2, RectF rectF2, com.google.android.material.shape.b bVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, f8p f8pVar, pdr pdrVar, c cVar, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new hy00();
            this.motionPathPosition = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.debugPaint = paint5;
            this.debugPath = new Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = bVar;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = bVar2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = f8pVar;
            this.fitModeEvaluator = pdrVar;
            this.progressThresholds = cVar;
            this.drawDebugEnabled = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.displayWidth = r9.widthPixels;
            this.displayHeight = r9.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(COMPAT_SHADOW_COLOR);
            RectF rectF3 = new RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = ry01.a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i4, i4, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.debugPaint.setColor(i);
                canvas.drawPath(path, this.debugPaint);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.a, Region.Op.DIFFERENCE);
            drawElevationShadowWithPaintShadowLayer(canvas);
            canvas.restore();
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.compatShadowDrawable;
            RectF rectF = this.currentMaskBounds;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.e);
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            com.google.android.material.shape.b bVar = this.maskEvaluator.e;
            if (!bVar.l(this.currentMaskBounds)) {
                canvas.drawPath(this.maskEvaluator.a, this.shadowPaint);
            } else {
                float a = bVar.e.a(this.currentMaskBounds);
                canvas.drawRoundRect(this.currentMaskBounds, a, a, this.shadowPaint);
            }
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentEndBounds;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.fitModeResult.b;
            int i = this.fadeModeResult.b;
            if (i <= 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF2 = ry01.a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i);
            }
            this.endView.draw(canvas);
            canvas.restoreToCount(save);
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentStartBounds;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.fitModeResult.a;
            int i = this.fadeModeResult.a;
            if (i <= 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF2 = ry01.a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i);
            }
            this.startView.draw(canvas);
            canvas.restoreToCount(save);
        }

        private static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0260  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0271  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void updateProgress(float f) {
            float f2;
            float f3;
            RectF rectF;
            Path path;
            float f4;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? ry01.c(0.0f, 255.0f, f) : ry01.c(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float f5 = fArr[0];
            float f6 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                f5 = g8e.b(f5, f7, f3, f5);
                f6 = g8e.b(f6, f8, f3, f6);
            }
            float f9 = f5;
            float f10 = f6;
            rdr d = this.fitModeEvaluator.d(f, this.progressThresholds.b.a, this.progressThresholds.b.b, this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = d;
            RectF rectF2 = this.currentStartBounds;
            float f11 = d.c / 2.0f;
            rectF2.set(f9 - f11, f10, f11 + f9, d.d + f10);
            RectF rectF3 = this.currentEndBounds;
            rdr rdrVar = this.fitModeResult;
            float f12 = rdrVar.e / 2.0f;
            rectF3.set(f9 - f12, f10, f12 + f9, rdrVar.f + f10);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float f13 = this.progressThresholds.c.a;
            float f14 = this.progressThresholds.c.b;
            boolean h = this.fitModeEvaluator.h(this.fitModeResult);
            RectF rectF4 = h ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float d2 = ry01.d(0.0f, 1.0f, f13, f14, f, false);
            if (!h) {
                d2 = 1.0f - d2;
            }
            this.fitModeEvaluator.r(rectF4, d2, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            hy00 hy00Var = this.maskEvaluator;
            com.google.android.material.shape.b bVar = this.startShapeAppearanceModel;
            com.google.android.material.shape.b bVar2 = this.endShapeAppearanceModel;
            RectF rectF5 = this.currentStartBounds;
            RectF rectF6 = this.currentStartBoundsMasked;
            RectF rectF7 = this.currentEndBoundsMasked;
            r710 r710Var = this.progressThresholds.d;
            Path path2 = hy00Var.c;
            Path path3 = hy00Var.b;
            jhr0 jhr0Var = hy00Var.d;
            float f15 = r710Var.a;
            float f16 = r710Var.b;
            if (f < f15) {
                f4 = f;
            } else {
                if (f <= f16) {
                    xre xreVar = bVar.e;
                    xre xreVar2 = bVar.h;
                    xre xreVar3 = bVar.g;
                    xre xreVar4 = bVar.f;
                    b.a m = ((xreVar.a(rectF5) == 0.0f && xreVar4.a(rectF5) == 0.0f && xreVar3.a(rectF5) == 0.0f && xreVar2.a(rectF5) == 0.0f) ? bVar2 : bVar).m();
                    rectF = rectF6;
                    path = path2;
                    m.e = new s6(ry01.d(bVar.e.a(rectF5), bVar2.e.a(rectF7), f15, f16, f, false));
                    f4 = f;
                    m.f = new s6(ry01.d(xreVar4.a(rectF5), bVar2.f.a(rectF7), f15, f16, f4, false));
                    m.h = new s6(ry01.d(xreVar2.a(rectF5), bVar2.h.a(rectF7), f15, f16, f4, false));
                    m.g = new s6(ry01.d(xreVar3.a(rectF5), bVar2.g.a(rectF7), f15, f16, f4, false));
                    bVar = m.a();
                    hy00Var.e = bVar;
                    jhr0Var.a(bVar, rectF, path3);
                    Path path4 = path;
                    jhr0Var.a(hy00Var.e, rectF7, path4);
                    hy00Var.a.op(path3, path4, Path.Op.UNION);
                    this.currentElevation = ry01.c(this.startElevation, this.endElevation, f4);
                    float calculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
                    float calculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
                    float f17 = this.currentElevation;
                    float f18 = (int) (calculateElevationDyMultiplier * f17);
                    this.currentElevationDy = f18;
                    this.shadowPaint.setShadowLayer(f17, (int) (calculateElevationDxMultiplier * f17), f18, SHADOW_COLOR);
                    this.fadeModeResult = this.fadeModeEvaluator.f(f4, this.progressThresholds.a.a, this.progressThresholds.a.b);
                    if (this.startContainerPaint.getColor() != 0) {
                        this.startContainerPaint.setAlpha(this.fadeModeResult.a);
                    }
                    if (this.endContainerPaint.getColor() != 0) {
                        this.endContainerPaint.setAlpha(this.fadeModeResult.b);
                    }
                    invalidateSelf();
                }
                f4 = f;
                bVar = bVar2;
            }
            rectF = rectF6;
            path = path2;
            hy00Var.e = bVar;
            jhr0Var.a(bVar, rectF, path3);
            Path path42 = path;
            jhr0Var.a(hy00Var.e, rectF7, path42);
            hy00Var.a.op(path3, path42, Path.Op.UNION);
            this.currentElevation = ry01.c(this.startElevation, this.endElevation, f4);
            float calculateElevationDxMultiplier2 = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float calculateElevationDyMultiplier2 = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f172 = this.currentElevation;
            float f182 = (int) (calculateElevationDyMultiplier2 * f172);
            this.currentElevationDy = f182;
            this.shadowPaint.setShadowLayer(f172, (int) (calculateElevationDxMultiplier2 * f172), f182, SHADOW_COLOR);
            this.fadeModeResult = this.fadeModeEvaluator.f(f4, this.progressThresholds.a.a, this.progressThresholds.a.b);
            if (this.startContainerPaint.getColor() != 0) {
            }
            if (this.endContainerPaint.getColor() != 0) {
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int save = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            canvas.clipPath(this.maskEvaluator.a);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.c) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(save);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, -256);
                drawDebugRect(canvas, this.currentStartBounds, DebugGraphView.DEFAULT_GRAPH_COLOR);
                drawDebugRect(canvas, this.currentEndBoundsMasked, -16711681);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public MaterialContainerTransform(Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = true;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    private c buildThresholdsGroup(boolean z) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) ? getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC) : getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF b = ry01.b(view2);
        b.offset(f, f2);
        return b;
    }

    private static com.google.android.material.shape.b captureShapeAppearance(View view, RectF rectF, com.google.android.material.shape.b bVar) {
        com.google.android.material.shape.b shapeAppearance = getShapeAppearance(view, bVar);
        RectF rectF2 = ry01.a;
        b.a m = shapeAppearance.m();
        m.e = osi0.b(rectF, shapeAppearance.e);
        m.f = osi0.b(rectF, shapeAppearance.f);
        m.h = osi0.b(rectF, shapeAppearance.h);
        m.g = osi0.b(rectF, shapeAppearance.g);
        return m.a();
    }

    private static void captureValues(TransitionValues transitionValues, View view, int i, com.google.android.material.shape.b bVar) {
        RectF b;
        if (i != -1) {
            View view2 = transitionValues.view;
            RectF rectF = ry01.a;
            View findViewById = view2.findViewById(i);
            if (findViewById == null) {
                findViewById = ry01.a(i, view2);
            }
            transitionValues.view = findViewById;
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(leh0.mtrl_motion_snapshot_view) instanceof View) {
            View view3 = (View) transitionValues.view.getTag(leh0.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(leh0.mtrl_motion_snapshot_view, null);
            transitionValues.view = view3;
        }
        View view4 = transitionValues.view;
        if (!view4.isLaidOut() && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        if (view4.getParent() == null) {
            RectF rectF2 = ry01.a;
            b = new RectF(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
        } else {
            b = ry01.b(view4);
        }
        transitionValues.values.put(PROP_BOUNDS, b);
        transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view4, b, bVar));
    }

    private static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : view.getElevation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.b getShapeAppearance(View view, com.google.android.material.shape.b bVar) {
        if (bVar != null) {
            return bVar;
        }
        if (view.getTag(leh0.mtrl_motion_snapshot_view) instanceof com.google.android.material.shape.b) {
            return (com.google.android.material.shape.b) view.getTag(leh0.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? com.google.android.material.shape.b.g(context, transitionShapeAppearanceResId, 0).a() : view instanceof uir0 ? ((uir0) view).getShapeAppearanceModel() : new b.a().a();
    }

    private c getThresholdsOrDefault(boolean z, c cVar, c cVar2) {
        if (!z) {
            cVar = cVar2;
        }
        r710 r710Var = this.fadeProgressThresholds;
        r710 r710Var2 = cVar.a;
        RectF rectF = ry01.a;
        if (r710Var == null) {
            r710Var = r710Var2;
        }
        r710 r710Var3 = this.scaleProgressThresholds;
        r710 r710Var4 = cVar.b;
        if (r710Var3 == null) {
            r710Var3 = r710Var4;
        }
        r710 r710Var5 = this.scaleMaskProgressThresholds;
        r710 r710Var6 = cVar.c;
        if (r710Var5 == null) {
            r710Var5 = r710Var6;
        }
        r710 r710Var7 = this.shapeMaskProgressThresholds;
        r710 r710Var8 = cVar.d;
        if (r710Var7 == null) {
            r710Var7 = r710Var8;
        }
        return new c(r710Var, r710Var3, r710Var5, r710Var7);
    }

    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{eng0.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            RectF rectF3 = ry01.a;
            return rectF2.height() * rectF2.width() > rectF.height() * rectF.width();
        }
        if (i != 1) {
            if (i != 2) {
                ny61.e(this.transitionDirection, "Invalid transition direction: ");
                return false;
            }
        }
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        int i;
        int O;
        int i2 = eng0.motionEasingEmphasizedInterpolator;
        FastOutSlowInInterpolator fastOutSlowInInterpolator = mj2.b;
        RectF rectF = ry01.a;
        if (i2 != 0 && getInterpolator() == null) {
            setInterpolator(kp50.P(context, i2, fastOutSlowInInterpolator));
        }
        int i3 = z ? eng0.motionDurationLong2 : eng0.motionDurationMedium4;
        if (i3 != 0 && getDuration() == -1 && (O = kp50.O(context, i3, -1)) != -1) {
            setDuration(O);
        }
        if (this.pathMotionCustom || (i = eng0.motionPath) == 0) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        boolean resolveAttribute = context.getTheme().resolveAttribute(i, typedValue, true);
        PathMotion pathMotion = null;
        if (resolveAttribute) {
            int i4 = typedValue.type;
            if (i4 == 16) {
                int i5 = typedValue.data;
                if (i5 != 0) {
                    if (i5 != 1) {
                        ny61.g(oyr.i(i5, "Invalid motion path type: "));
                        return;
                    }
                    pathMotion = new MaterialArcMotion();
                }
            } else {
                if (i4 != 3) {
                    ny61.g("Motion path theme attribute must either be an enum value or path data string");
                    return;
                }
                pathMotion = new PatternPathMotion(n891.i(String.valueOf(typedValue.string)));
            }
        }
        if (pathMotion != null) {
            setPathMotion(pathMotion);
        }
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r6 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        r22 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if (r6 != false) goto L33;
     */
    @Override // android.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View a;
        View view;
        f8p f8pVar;
        pdr pdrVar;
        pdr pdrVar2;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        RectF rectF = (RectF) transitionValues.values.get(PROP_BOUNDS);
        com.google.android.material.shape.b bVar = (com.google.android.material.shape.b) transitionValues.values.get(PROP_SHAPE_APPEARANCE);
        if (rectF == null || bVar == null) {
            return null;
        }
        RectF rectF2 = (RectF) transitionValues2.values.get(PROP_BOUNDS);
        com.google.android.material.shape.b bVar2 = (com.google.android.material.shape.b) transitionValues2.values.get(PROP_SHAPE_APPEARANCE);
        if (rectF2 == null || bVar2 == null) {
            return null;
        }
        final View view2 = transitionValues.view;
        final View view3 = transitionValues2.view;
        View view4 = view3.getParent() != null ? view3 : view2;
        if (this.drawingViewId == view4.getId()) {
            a = (View) view4.getParent();
            view = view4;
        } else {
            a = ry01.a(this.drawingViewId, view4);
            view = null;
        }
        RectF b = ry01.b(a);
        float f = -b.left;
        float f2 = -b.top;
        RectF calculateDrawableBounds = calculateDrawableBounds(a, view, f, f2);
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        boolean isEntering = isEntering(rectF, rectF2);
        if (!this.appliedThemeValues) {
            maybeApplyThemeValues(view4.getContext(), isEntering);
        }
        PathMotion pathMotion = getPathMotion();
        float elevationOrDefault = getElevationOrDefault(this.startElevation, view2);
        float elevationOrDefault2 = getElevationOrDefault(this.endElevation, view3);
        int i = this.containerColor;
        int i2 = this.startContainerColor;
        int i3 = this.endContainerColor;
        int i4 = this.scrimColor;
        boolean z = this.elevationShadowEnabled;
        int i5 = this.fadeMode;
        final View view5 = a;
        f8p f8pVar2 = th91.a;
        f8p f8pVar3 = th91.b;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    f8pVar2 = th91.c;
                } else {
                    if (i5 != 3) {
                        ny61.g(oyr.i(i5, "Invalid fade mode: "));
                        return null;
                    }
                    f8pVar2 = th91.d;
                }
            }
            f8pVar = f8pVar2;
        }
        int i6 = this.fitMode;
        pdr pdrVar3 = xh91.a;
        pdr pdrVar4 = xh91.b;
        if (i6 != 0) {
            pdrVar = pdrVar3;
            if (i6 != 1) {
                if (i6 != 2) {
                    ny61.g(oyr.i(i6, "Invalid fit mode: "));
                    return null;
                }
            }
            pdrVar2 = pdrVar;
        } else {
            pdrVar = pdrVar3;
            float width = rectF.width();
            float height = rectF.height();
            float width2 = rectF2.width();
            float height2 = rectF2.height();
            float f3 = (height2 * width) / width2;
            float f4 = (width2 * height) / width;
            pdrVar2 = !isEntering ? pdrVar4 : pdrVar4;
        }
        final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion, view2, rectF, bVar, elevationOrDefault, view3, rectF2, bVar2, elevationOrDefault2, i, i2, i3, i4, isEntering, z, f8pVar, pdrVar2, buildThresholdsGroup(isEntering), this.drawDebugEnabled);
        transitionDrawable.setBounds(Math.round(calculateDrawableBounds.left), Math.round(calculateDrawableBounds.top), Math.round(calculateDrawableBounds.right), Math.round(calculateDrawableBounds.bottom));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
            }
        });
        addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
            @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                MaterialContainerTransform.this.removeListener(this);
                if (MaterialContainerTransform.this.holdAtEndEnabled) {
                    return;
                }
                view2.setAlpha(1.0f);
                view3.setAlpha(1.0f);
                view5.getOverlay().remove(transitionDrawable);
            }

            @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                view5.getOverlay().add(transitionDrawable);
                view2.setAlpha(0.0f);
                view3.setAlpha(0.0f);
            }
        });
        return ofFloat;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public com.google.android.material.shape.b getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public r710 getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public r710 getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public r710 getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public r710 getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public com.google.android.material.shape.b getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(com.google.android.material.shape.b bVar) {
        this.endShapeAppearanceModel = bVar;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(r710 r710Var) {
        this.fadeProgressThresholds = r710Var;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(r710 r710Var) {
        this.scaleMaskProgressThresholds = r710Var;
    }

    public void setScaleProgressThresholds(r710 r710Var) {
        this.scaleProgressThresholds = r710Var;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(r710 r710Var) {
        this.shapeMaskProgressThresholds = r710Var;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(com.google.android.material.shape.b bVar) {
        this.startShapeAppearanceModel = bVar;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = true;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }
}
