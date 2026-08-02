package com.google.android.material.transition;

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
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.ai91;
import defpackage.eng0;
import defpackage.g8e;
import defpackage.g8p;
import defpackage.i8p;
import defpackage.iq31;
import defpackage.iy00;
import defpackage.jhr0;
import defpackage.kp50;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.n891;
import defpackage.ny61;
import defpackage.osi0;
import defpackage.oyr;
import defpackage.qdr;
import defpackage.s6;
import defpackage.s710;
import defpackage.sdr;
import defpackage.sy01;
import defpackage.uh91;
import defpackage.uir0;
import defpackage.xre;
import defpackage.y610;
import java.util.HashMap;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes11.dex */
public final class MaterialContainerTransform extends Transition {
    public static final String[] p0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final s710 q0 = new s710(new iq31(0.0f, 0.25f), new iq31(0.0f, 1.0f), new iq31(0.0f, 1.0f), new iq31(0.0f, 0.75f));
    public static final s710 r0 = new s710(new iq31(0.6f, 0.9f), new iq31(0.0f, 1.0f), new iq31(0.0f, 0.9f), new iq31(0.3f, 0.9f));
    public static final s710 s0 = new s710(new iq31(0.1f, 0.4f), new iq31(0.1f, 1.0f), new iq31(0.1f, 1.0f), new iq31(0.1f, 0.9f));
    public static final s710 t0 = new s710(new iq31(0.6f, 0.9f), new iq31(0.0f, 0.9f), new iq31(0.0f, 0.9f), new iq31(0.2f, 0.9f));
    public boolean h0 = false;
    public final int i0 = R.id.content;
    public final int j0 = -1;
    public final int k0 = -1;
    public final int l0 = 1375731712;
    public final boolean m0 = true;
    public final float n0 = -1.0f;
    public final float o0 = -1.0f;

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
        private final b endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final g8p fadeModeEvaluator;
        private i8p fadeModeResult;
        private final qdr fitModeEvaluator;
        private sdr fitModeResult;
        private final iy00 maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final s710 progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final b startShapeAppearanceModel;
        private final View startView;

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, b bVar, float f, View view2, RectF rectF2, b bVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, g8p g8pVar, qdr qdrVar, s710 s710Var, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new iy00();
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
            this.fadeModeEvaluator = g8pVar;
            this.fitModeEvaluator = qdrVar;
            this.progressThresholds = s710Var;
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
            PathMeasure pathMeasure = new PathMeasure(pathMotion.a(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = sy01.a;
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
            b bVar = this.maskEvaluator.e;
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
                RectF rectF2 = sy01.a;
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
                RectF rectF2 = sy01.a;
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
            this.scrimPaint.setAlpha((int) (this.entering ? sy01.c(0.0f, 255.0f, f) : sy01.c(255.0f, 0.0f, f)));
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
            sdr d = this.fitModeEvaluator.d(f, this.progressThresholds.b.a, this.progressThresholds.b.b, this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = d;
            RectF rectF2 = this.currentStartBounds;
            float f11 = d.c / 2.0f;
            rectF2.set(f9 - f11, f10, f11 + f9, d.d + f10);
            RectF rectF3 = this.currentEndBounds;
            sdr sdrVar = this.fitModeResult;
            float f12 = sdrVar.e / 2.0f;
            rectF3.set(f9 - f12, f10, f12 + f9, sdrVar.f + f10);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float f13 = this.progressThresholds.c.a;
            float f14 = this.progressThresholds.c.b;
            boolean a = this.fitModeEvaluator.a(this.fitModeResult);
            RectF rectF4 = a ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float d2 = sy01.d(0.0f, 1.0f, f13, f14, f, false);
            if (!a) {
                d2 = 1.0f - d2;
            }
            this.fitModeEvaluator.n(rectF4, d2, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            iy00 iy00Var = this.maskEvaluator;
            b bVar = this.startShapeAppearanceModel;
            b bVar2 = this.endShapeAppearanceModel;
            RectF rectF5 = this.currentStartBounds;
            RectF rectF6 = this.currentStartBoundsMasked;
            RectF rectF7 = this.currentEndBoundsMasked;
            iq31 iq31Var = this.progressThresholds.d;
            Path path2 = iy00Var.c;
            Path path3 = iy00Var.b;
            jhr0 jhr0Var = iy00Var.d;
            float f15 = iq31Var.a;
            float f16 = iq31Var.b;
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
                    m.e = new s6(sy01.d(bVar.e.a(rectF5), bVar2.e.a(rectF7), f15, f16, f, false));
                    f4 = f;
                    m.f = new s6(sy01.d(xreVar4.a(rectF5), bVar2.f.a(rectF7), f15, f16, f4, false));
                    m.h = new s6(sy01.d(xreVar2.a(rectF5), bVar2.h.a(rectF7), f15, f16, f4, false));
                    m.g = new s6(sy01.d(xreVar3.a(rectF5), bVar2.g.a(rectF7), f15, f16, f4, false));
                    bVar = m.a();
                    iy00Var.e = bVar;
                    jhr0Var.a(bVar, rectF, path3);
                    Path path4 = path;
                    jhr0Var.a(iy00Var.e, rectF7, path4);
                    iy00Var.a.op(path3, path4, Path.Op.UNION);
                    this.currentElevation = sy01.c(this.startElevation, this.endElevation, f4);
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
            iy00Var.e = bVar;
            jhr0Var.a(bVar, rectF, path3);
            Path path42 = path;
            jhr0Var.a(iy00Var.e, rectF7, path42);
            iy00Var.a.op(path3, path42, Path.Op.UNION);
            this.currentElevation = sy01.c(this.startElevation, this.endElevation, f4);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(TransitionValues transitionValues, int i) {
        RectF b;
        b a;
        View view = transitionValues.b;
        if (i != -1) {
            RectF rectF = sy01.a;
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                findViewById = sy01.a(i, view);
            }
            transitionValues.b = findViewById;
        } else if (view.getTag(leh0.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.b.getTag(leh0.mtrl_motion_snapshot_view);
            transitionValues.b.setTag(leh0.mtrl_motion_snapshot_view, null);
            transitionValues.b = view2;
        }
        View view3 = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = sy01.a;
            b = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            b = sy01.b(view3);
        }
        hashMap.put("materialContainerTransition:bounds", b);
        if (view3.getTag(leh0.mtrl_motion_snapshot_view) instanceof b) {
            a = (b) view3.getTag(leh0.mtrl_motion_snapshot_view);
        } else {
            Context context = view3.getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{eng0.transitionShapeAppearance});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            a = resourceId != -1 ? b.g(context, resourceId, 0).a() : view3 instanceof uir0 ? ((uir0) view3).getShapeAppearanceModel() : new b.a().a();
        }
        b.a m = a.m();
        m.e = osi0.b(b, a.e);
        m.f = osi0.b(b, a.f);
        m.h = osi0.b(b, a.h);
        m.g = osi0.b(b, a.g);
        hashMap.put("materialContainerTransition:shapeAppearance", m.a());
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return p0;
    }

    @Override // androidx.transition.Transition
    public final void S(PathMotion pathMotion) {
        super.S(pathMotion);
        this.h0 = true;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues, this.k0);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues, this.j0);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View a;
        View view;
        RectF rectF;
        s710 s710Var;
        int i;
        int O;
        PathMotion pathMotion = null;
        if (transitionValues != null) {
            HashMap hashMap = transitionValues.a;
            if (transitionValues2 != null) {
                HashMap hashMap2 = transitionValues2.a;
                RectF rectF2 = (RectF) hashMap.get("materialContainerTransition:bounds");
                b bVar = (b) hashMap.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && bVar != null) {
                    RectF rectF3 = (RectF) hashMap2.get("materialContainerTransition:bounds");
                    b bVar2 = (b) hashMap2.get("materialContainerTransition:shapeAppearance");
                    if (rectF3 != null && bVar2 != null) {
                        View view2 = transitionValues.b;
                        View view3 = transitionValues2.b;
                        View view4 = view3.getParent() != null ? view3 : view2;
                        int id = view4.getId();
                        int i2 = this.i0;
                        if (i2 == id) {
                            a = (View) view4.getParent();
                            view = view4;
                        } else {
                            a = sy01.a(i2, view4);
                            view = null;
                        }
                        RectF b = sy01.b(a);
                        float f = -b.left;
                        float f2 = -b.top;
                        if (view != null) {
                            rectF = sy01.b(view);
                            rectF.offset(f, f2);
                        } else {
                            rectF = new RectF(0.0f, 0.0f, a.getWidth(), a.getHeight());
                        }
                        rectF2.offset(f, f2);
                        rectF3.offset(f, f2);
                        boolean z = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                        Context context = view4.getContext();
                        int i3 = eng0.motionEasingEmphasizedInterpolator;
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = mj2.b;
                        if (i3 != 0 && this.w == null) {
                            this.w = kp50.P(context, i3, fastOutSlowInInterpolator);
                        }
                        int i4 = z ? eng0.motionDurationLong2 : eng0.motionDurationMedium4;
                        if (i4 != 0 && this.c == -1 && (O = kp50.O(context, i4, -1)) != -1) {
                            this.c = O;
                        }
                        if (!this.h0 && (i = eng0.motionPath) != 0) {
                            TypedValue typedValue = new TypedValue();
                            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
                                int i5 = typedValue.type;
                                if (i5 == 16) {
                                    int i6 = typedValue.data;
                                    if (i6 != 0) {
                                        if (i6 != 1) {
                                            ny61.g(oyr.i(i6, "Invalid motion path type: "));
                                            return null;
                                        }
                                        pathMotion = new y610();
                                    }
                                } else {
                                    if (i5 != 3) {
                                        ny61.g("Motion path theme attribute must either be an enum value or path data string");
                                        return null;
                                    }
                                    pathMotion = new PatternPathMotion(n891.i(String.valueOf(typedValue.string)));
                                }
                            }
                            if (pathMotion != null) {
                                S(pathMotion);
                            }
                        }
                        PathMotion pathMotion2 = this.Z;
                        float f3 = this.n0;
                        if (f3 == -1.0f) {
                            f3 = view2.getElevation();
                        }
                        float f4 = f3;
                        float f5 = this.o0;
                        if (f5 == -1.0f) {
                            f5 = view3.getElevation();
                        }
                        float f6 = f5;
                        g8p g8pVar = z ? uh91.a : uh91.b;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        float width2 = rectF3.width();
                        float height2 = rectF3.height();
                        qdr qdrVar = (!z ? (width2 * height) / width >= height2 : (height2 * width) / width2 >= height) ? ai91.b : ai91.a;
                        PathMotion pathMotion3 = this.Z;
                        if ((pathMotion3 instanceof ArcMotion) || (pathMotion3 instanceof y610)) {
                            s710 s710Var2 = z ? s0 : t0;
                            s710Var = new s710(s710Var2.a, s710Var2.b, s710Var2.c, s710Var2.d);
                        } else {
                            s710 s710Var3 = z ? q0 : r0;
                            s710Var = new s710(s710Var3.a, s710Var3.b, s710Var3.c, s710Var3.d);
                        }
                        final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion2, view2, rectF2, bVar, f4, view3, rectF3, bVar2, f6, 0, 0, 0, this.l0, z, this.m0, g8pVar, qdrVar, s710Var, false);
                        transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                            }
                        });
                        a(new a(this, a, transitionDrawable, view2, view3));
                        return ofFloat;
                    }
                }
            }
        }
        return null;
    }
}
