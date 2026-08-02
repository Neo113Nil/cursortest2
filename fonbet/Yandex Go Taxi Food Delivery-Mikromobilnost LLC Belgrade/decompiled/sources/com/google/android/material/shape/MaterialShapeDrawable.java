package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.shape.b;
import defpackage.air0;
import defpackage.b64;
import defpackage.dir0;
import defpackage.eng0;
import defpackage.fhr0;
import defpackage.ghr0;
import defpackage.ihr0;
import defpackage.jhr0;
import defpackage.nwt0;
import defpackage.owt0;
import defpackage.sgr0;
import defpackage.tbm;
import defpackage.ubm;
import defpackage.uir0;
import defpackage.vez0;
import defpackage.vit;
import defpackage.w511;
import defpackage.x710;
import defpackage.xre;
import defpackage.y710;
import defpackage.yqn;
import defpackage.z610;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class MaterialShapeDrawable extends Drawable implements uir0 {
    private static final y710[] CORNER_SIZES_IN_PX;
    static final b DEFAULT_INTERPOLATION_START_SHAPE_APPEARANCE_MODEL;
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    private final BitSet containsIncompatibleShadowOp;
    private final air0[] cornerShadowOperation;
    nwt0[] cornerSpringAnimations;
    private owt0 cornerSpringForce;
    private MaterialShapeDrawableState drawableState;
    private final air0[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private boolean isRoundRectCornerMorph;
    private final Matrix matrix;
    private x710 onCornerSizeChangeListener;
    private final Path path;
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final jhr0 pathProvider;
    private final ihr0 pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final sgr0 shadowRenderer;
    private float[] springAnimatedCornerSizes;
    private float[] springAnimatedStrokeCornerSizes;
    private final ghr0 strokeInsetCornerSizeUnaryOperator;
    private final Paint strokePaint;
    private boolean strokePathDirty;
    private b strokeShapeAppearanceModel;
    private PorterDuffColorFilter strokeTintFilter;
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    static {
        b.a aVar = new b.a();
        aVar.d(0.0f);
        DEFAULT_INTERPOLATION_START_SHAPE_APPEARANCE_MODEL = aVar.a();
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        CORNER_SIZES_IN_PX = new y710[4];
        int i = 0;
        while (true) {
            y710[] y710VarArr = CORNER_SIZES_IN_PX;
            if (i >= y710VarArr.length) {
                return;
            }
            y710VarArr[i] = new y710(i);
            i++;
        }
    }

    public MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        this.strokeInsetCornerSizeUnaryOperator = new vit(28, this);
        this.cornerShadowOperation = new air0[4];
        this.edgeShadowOperation = new air0[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new sgr0();
        this.pathProvider = jhr0.c();
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.isRoundRectCornerMorph = true;
        this.cornerSpringAnimations = new nwt0[4];
        this.drawableState = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new a(this);
    }

    private PorterDuffColorFilter calculatePaintColorTintFilter(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
        this.resolvedTintColor = compositeElevationOverlayIfNeeded;
        if (compositeElevationOverlayIfNeeded != color) {
            return new PorterDuffColorFilter(compositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void calculatePath(RectF rectF, Path path) {
        calculatePathForSize(rectF, path);
        if (this.drawableState.scale != 1.0f) {
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f = this.drawableState.scale;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.matrix);
        }
        path.computeBounds(this.pathBounds, true);
    }

    private void calculateStrokePath() {
        this.pathProvider.b(this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, this.drawableState.interpolation, getBoundsInsetByStroke(), null, this.pathInsetByStroke);
    }

    private PorterDuffColorFilter calculateTintColorTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.resolvedTintColor = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter calculateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z) : calculateTintColorTintFilter(colorStateList, mode, z);
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(vez0.T(context, z610.f(context, eng0.colorSurface, TAG)));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f);
        return materialShapeDrawable;
    }

    private void drawCompatShadow(Canvas canvas) {
        this.containsIncompatibleShadowOp.cardinality();
        if (this.drawableState.shadowCompatOffset != 0) {
            canvas.drawPath(this.path, this.shadowRenderer.a);
        }
        for (int i = 0; i < 4; i++) {
            this.cornerShadowOperation[i].a(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
            this.edgeShadowOperation[i].a(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.path, clearPaint);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void drawFillShape(Canvas canvas) {
        drawShape(canvas, this.fillPaint, this.path, this.drawableState.shapeAppearance.c(), this.springAnimatedCornerSizes, getBoundsAsRectF());
    }

    private void drawShape(Canvas canvas, Paint paint, Path path, b bVar, float[] fArr, RectF rectF) {
        float calculateRoundRectCornerSize = calculateRoundRectCornerSize(rectF, bVar, fArr);
        if (calculateRoundRectCornerSize < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = calculateRoundRectCornerSize * this.drawableState.interpolation;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private RectF getBoundsInsetByStroke() {
        this.insetRectF.set(getBoundsAsRectF());
        float strokeInsetLength = getStrokeInsetLength();
        this.insetRectF.inset(strokeInsetLength, strokeInsetLength);
        return this.insetRectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getStrokeInsetLength() {
        if (hasStroke()) {
            return this.strokePaint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean hasCompatShadow() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        int i = materialShapeDrawableState.shadowCompatMode;
        if (i == 1 || materialShapeDrawableState.shadowCompatRadius <= 0) {
            return false;
        }
        return i == 2 || requiresCompatShadow();
    }

    private boolean hasFill() {
        Paint.Style style = this.drawableState.paintStyle;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.drawableState.paintStyle;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > 0.0f;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private boolean isCornerSpringAnimationRunning() {
        for (nwt0 nwt0Var : this.cornerSpringAnimations) {
            if (nwt0Var != null && nwt0Var.f) {
                return true;
            }
        }
        return false;
    }

    private void maybeDrawCompatShadow(Canvas canvas) {
        if (hasCompatShadow()) {
            canvas.save();
            prepareCanvasForShadow(canvas);
            if (!this.shadowBitmapDrawingEnable) {
                drawCompatShadow(canvas);
                canvas.restore();
                return;
            }
            Rect bounds = getBounds();
            int width = (int) (this.pathBounds.width() - bounds.width());
            int height = (int) (this.pathBounds.height() - bounds.height());
            if (width < 0 || height < 0) {
                w511.o(b64.s(width, height, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "), this.pathBounds);
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(b64.b(this.drawableState.shadowCompatRadius, 2, (int) this.pathBounds.width(), width), b64.b(this.drawableState.shadowCompatRadius, 2, (int) this.pathBounds.height(), height), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            int i = bounds.left;
            int i2 = this.drawableState.shadowCompatRadius;
            float f = (i - i2) - width;
            float f2 = (bounds.top - i2) - height;
            canvas2.translate(-f, -f2);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int modulateAlpha(int i, int i2) {
        return ((i2 + (i2 >>> 7)) * i) >>> 8;
    }

    private void prepareCanvasForShadow(Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    private void setStateListShapeAppearanceModel(c cVar) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shapeAppearance != cVar) {
            materialShapeDrawableState.shapeAppearance = cVar;
            updateShape(getState(), true);
            invalidateSelf();
        }
    }

    private boolean shouldCalculatePath() {
        return hasCompatShadow() || !isRoundRect();
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.fillColor == null || color2 == (colorForState2 = this.drawableState.fillColor.getColorForState(iArr, (color2 = this.fillPaint.getColor())))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.strokeColor == null || color == (colorForState = this.drawableState.strokeColor.getColorForState(iArr, (color = this.strokePaint.getColor())))) {
            return z;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateShape(int[] iArr, boolean z) {
        boolean z2;
        RectF boundsAsRectF = getBoundsAsRectF();
        if (!this.drawableState.shapeAppearance.f() || boundsAsRectF.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.cornerSpringForce == null);
        if (this.springAnimatedCornerSizes == null) {
            this.springAnimatedCornerSizes = new float[4];
        }
        b b = this.drawableState.shapeAppearance.b(iArr);
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
        }
        if (b.l(getBoundsAsRectF())) {
            z2 = true;
            this.isRoundRectCornerMorph = z2;
            if (!z2) {
                this.pathDirty = true;
                this.strokePathDirty = true;
            }
            while (i < 4) {
                this.pathProvider.getClass();
                float a = (i != 1 ? i != 2 ? i != 3 ? b.f : b.e : b.h : b.g).a(boundsAsRectF);
                if (z3) {
                    this.springAnimatedCornerSizes[i] = a;
                }
                nwt0 nwt0Var = this.cornerSpringAnimations[i];
                if (nwt0Var != null) {
                    nwt0Var.i(a);
                    if (z3) {
                        this.cornerSpringAnimations[i].j();
                    }
                }
                i++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.isRoundRectCornerMorph = z2;
        if (!z2) {
        }
        while (i < 4) {
        }
        if (z3) {
        }
    }

    private void updateStrokeShapeAppearanceModels() {
        b shapeAppearanceModel = getShapeAppearanceModel();
        ghr0 ghr0Var = this.strokeInsetCornerSizeUnaryOperator;
        b.a m = shapeAppearanceModel.m();
        m.e = ghr0Var.b(shapeAppearanceModel.e);
        m.f = ghr0Var.b(shapeAppearanceModel.f);
        m.h = ghr0Var.b(shapeAppearanceModel.h);
        m.g = ghr0Var.b(shapeAppearanceModel.g);
        this.strokeShapeAppearanceModel = m.a();
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr == null) {
            this.springAnimatedStrokeCornerSizes = null;
            return;
        }
        if (this.springAnimatedStrokeCornerSizes == null) {
            this.springAnimatedStrokeCornerSizes = new float[fArr.length];
        }
        float strokeInsetLength = getStrokeInsetLength();
        int i = 0;
        while (true) {
            float[] fArr2 = this.springAnimatedCornerSizes;
            if (i >= fArr2.length) {
                return;
            }
            this.springAnimatedStrokeCornerSizes[i] = Math.max(0.0f, fArr2[i] - strokeInsetLength);
            i++;
        }
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        this.tintFilter = calculateTintFilter(materialShapeDrawableState.tintList, materialShapeDrawableState.tintMode, this.fillPaint, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.drawableState;
        this.strokeTintFilter = calculateTintFilter(materialShapeDrawableState2.strokeTintList, materialShapeDrawableState2.tintMode, this.strokePaint, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.drawableState;
        if (materialShapeDrawableState3.useTintColorForShadow) {
            this.shadowRenderer.a(materialShapeDrawableState3.tintList.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.tintFilter) && Objects.equals(porterDuffColorFilter2, this.strokeTintFilter)) ? false : true;
    }

    private void updateZ() {
        float z = getZ();
        this.drawableState.shadowCompatRadius = (int) Math.ceil(0.75f * z);
        this.drawableState.shadowCompatOffset = (int) Math.ceil(z * 0.25f);
        updateTintFilter();
        if (shouldCalculatePath()) {
            invalidateSelf();
        } else {
            invalidateSelfIgnoreShape();
        }
    }

    public final void calculatePathForSize(RectF rectF, Path path) {
        this.pathProvider.b(this.drawableState.shapeAppearance.c(), this.springAnimatedCornerSizes, this.drawableState.interpolation, rectF, this.pathShadowListener, path);
    }

    public float calculateRoundRectCornerSize() {
        float calculateRoundRectCornerSize = calculateRoundRectCornerSize(getBoundsAsRectF(), this.drawableState.shapeAppearance.c(), this.springAnimatedCornerSizes);
        return calculateRoundRectCornerSize >= 0.0f ? calculateRoundRectCornerSize * this.drawableState.interpolation : calculateRoundRectCornerSize;
    }

    public int compositeElevationOverlayIfNeeded(int i) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        yqn yqnVar = this.drawableState.elevationOverlayProvider;
        return yqnVar != null ? yqnVar.a(parentAbsoluteElevation, i) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.alpha));
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        this.strokePaint.setStrokeWidth(this.drawableState.strokeWidth);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.alpha));
        boolean shouldCalculatePath = shouldCalculatePath();
        if (hasFill()) {
            if (this.pathDirty) {
                if (shouldCalculatePath) {
                    calculatePath(getBoundsAsRectF(), this.path);
                }
                this.pathDirty = false;
            }
            maybeDrawCompatShadow(canvas);
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            if (this.strokePathDirty) {
                updateStrokeShapeAppearanceModels();
                if (shouldCalculatePath) {
                    calculateStrokePath();
                }
                this.strokePathDirty = false;
            }
            drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    public void drawStrokeShape(Canvas canvas) {
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, getBoundsInsetByStroke());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawableState.alpha;
    }

    public float getBottomLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[2] : this.drawableState.shapeAppearance.c().h.a(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[1] : this.drawableState.shapeAppearance.c().g.a(getBoundsAsRectF());
    }

    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public float getCornerSizeDiffX() {
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF boundsAsRectF = getBoundsAsRectF();
        jhr0 jhr0Var = this.pathProvider;
        b shapeAppearanceModel = getShapeAppearanceModel();
        jhr0Var.getClass();
        float a = shapeAppearanceModel.e.a(boundsAsRectF);
        jhr0 jhr0Var2 = this.pathProvider;
        b shapeAppearanceModel2 = getShapeAppearanceModel();
        jhr0Var2.getClass();
        float a2 = shapeAppearanceModel2.h.a(boundsAsRectF) + a;
        jhr0 jhr0Var3 = this.pathProvider;
        b shapeAppearanceModel3 = getShapeAppearanceModel();
        jhr0Var3.getClass();
        float a3 = a2 - shapeAppearanceModel3.g.a(boundsAsRectF);
        jhr0 jhr0Var4 = this.pathProvider;
        b shapeAppearanceModel4 = getShapeAppearanceModel();
        jhr0Var4.getClass();
        return (a3 - shapeAppearanceModel4.f.a(boundsAsRectF)) / 2.0f;
    }

    public owt0 getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    public float getElevation() {
        return this.drawableState.elevation;
    }

    public ColorStateList getFillColor() {
        return this.drawableState.fillColor;
    }

    public float getInterpolation() {
        return this.drawableState.interpolation;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.drawableState.shadowCompatMode == 2) {
            return;
        }
        RectF boundsAsRectF = getBoundsAsRectF();
        if (boundsAsRectF.isEmpty()) {
            return;
        }
        float calculateRoundRectCornerSize = calculateRoundRectCornerSize(boundsAsRectF, this.drawableState.shapeAppearance.c(), this.springAnimatedCornerSizes);
        if (calculateRoundRectCornerSize >= 0.0f) {
            outline.setRoundRect(getBounds(), calculateRoundRectCornerSize * this.drawableState.interpolation);
            return;
        }
        if (this.pathDirty) {
            calculatePath(boundsAsRectF, this.path);
            this.pathDirty = false;
        }
        Path path = this.path;
        if (Build.VERSION.SDK_INT >= 30) {
            ubm.a(outline, path);
        } else {
            try {
                tbm.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.drawableState.padding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.parentAbsoluteElevation;
    }

    public Path getPath() {
        return this.path;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, Path path) {
        calculatePathForSize(new RectF(0.0f, 0.0f, i, i2), path);
    }

    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.scale;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.shadowCompatMode;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (Math.sin(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)) * materialShapeDrawableState.shadowCompatOffset);
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (Math.cos(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)) * materialShapeDrawableState.shadowCompatOffset);
    }

    public int getShadowRadius() {
        return this.drawableState.shadowCompatRadius;
    }

    public int getShadowVerticalOffset() {
        return this.drawableState.shadowCompatOffset;
    }

    @Override // defpackage.uir0
    public b getShapeAppearanceModel() {
        return this.drawableState.shapeAppearance.c();
    }

    @Deprecated
    public dir0 getShapedViewModel() {
        b shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof dir0) {
            return (dir0) shapeAppearanceModel;
        }
        return null;
    }

    public c getStateListShapeAppearanceModel() {
        fhr0 fhr0Var = this.drawableState.shapeAppearance;
        if (fhr0Var instanceof c) {
            return (c) fhr0Var;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        return this.drawableState.strokeColor;
    }

    public ColorStateList getStrokeTintList() {
        return this.drawableState.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.drawableState.strokeWidth;
    }

    public ColorStateList getTintList() {
        return this.drawableState.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[3] : this.drawableState.shapeAppearance.c().e.a(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[0] : this.drawableState.shapeAppearance.c().f.a(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.drawableState.translationZ;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.transparentRegion.set(getBounds());
        calculatePath(getBoundsAsRectF(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region.Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public void initializeElevationOverlay(Context context) {
        this.drawableState.elevationOverlayProvider = new yqn(context);
        updateZ();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        yqn yqnVar = this.drawableState.elevationOverlayProvider;
        return yqnVar != null && yqnVar.a;
    }

    public boolean isElevationOverlayInitialized() {
        return this.drawableState.elevationOverlayProvider != null;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    public boolean isRoundRect() {
        if (this.drawableState.shapeAppearance.b(getState()).l(getBoundsAsRectF())) {
            return this.springAnimatedCornerSizes == null || this.isRoundRectCornerMorph;
        }
        return false;
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.drawableState.shadowCompatMode;
        return i == 0 || i == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.drawableState.tintList;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.drawableState.strokeTintList;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.drawableState.strokeColor;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.drawableState.fillColor;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.drawableState.shapeAppearance.f();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.drawableState = new MaterialShapeDrawableState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.onBoundsChange(rect);
        if (!this.drawableState.shapeAppearance.f() || rect.isEmpty()) {
            return;
        }
        updateShape(getState(), true ^ isCornerSpringAnimationRunning());
    }

    @Override // android.graphics.drawable.Drawable, defpackage.amy0
    public boolean onStateChange(int[] iArr) {
        if (this.drawableState.shapeAppearance.f()) {
            updateShape(iArr);
        }
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        if (isRoundRect()) {
            return false;
        }
        this.path.isConvex();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.alpha != i) {
            materialShapeDrawableState.alpha = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.colorFilter = colorFilter;
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.drawableState.shapeAppearance.a(f));
    }

    public void setCornerSpringForce(owt0 owt0Var) {
        if (this.cornerSpringForce == owt0Var) {
            return;
        }
        this.cornerSpringForce = owt0Var;
        int i = 0;
        while (true) {
            nwt0[] nwt0VarArr = this.cornerSpringAnimations;
            if (i >= nwt0VarArr.length) {
                updateShape(getState(), true);
                invalidateSelf();
                return;
            }
            if (nwt0VarArr[i] == null) {
                nwt0VarArr[i] = new nwt0(this, CORNER_SIZES_IN_PX[i]);
            }
            nwt0 nwt0Var = this.cornerSpringAnimations[i];
            owt0 owt0Var2 = new owt0();
            owt0Var2.a((float) owt0Var.b);
            double d = owt0Var.a;
            owt0Var2.b((float) (d * d));
            nwt0Var.u = owt0Var2;
            i++;
        }
    }

    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.pathProvider.l = z;
    }

    public void setElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.elevation != f) {
            materialShapeDrawableState.elevation = f;
            updateZ();
        }
    }

    public void setFillColor(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.fillColor != colorStateList) {
            materialShapeDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.interpolation != f) {
            materialShapeDrawableState.interpolation = f;
            this.pathDirty = true;
            this.strokePathDirty = true;
            invalidateSelf();
        }
    }

    public void setOnCornerSizeChangeListener(x710 x710Var) {
        this.onCornerSizeChangeListener = x710Var;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.padding == null) {
            materialShapeDrawableState.padding = new Rect();
        }
        this.drawableState.padding.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.drawableState.paintStyle = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.parentAbsoluteElevation != f) {
            materialShapeDrawableState.parentAbsoluteElevation = f;
            updateZ();
        }
    }

    public void setScale(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.scale != f) {
            materialShapeDrawableState.scale = f;
            invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean z) {
        this.shadowBitmapDrawingEnable = z;
    }

    public void setShadowColor(int i) {
        this.shadowRenderer.a(i);
        this.drawableState.useTintColorForShadow = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatRotation != i) {
            materialShapeDrawableState.shadowCompatRotation = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatMode != i) {
            materialShapeDrawableState.shadowCompatMode = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation(i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.drawableState.shadowCompatRadius = i;
    }

    public void setShadowVerticalOffset(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatOffset != i) {
            materialShapeDrawableState.shadowCompatOffset = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShapeAppearance(fhr0 fhr0Var) {
        if (fhr0Var instanceof b) {
            setShapeAppearanceModel((b) fhr0Var);
        } else {
            setStateListShapeAppearanceModel((c) fhr0Var);
        }
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(b bVar) {
        this.drawableState.shapeAppearance = bVar;
        this.springAnimatedCornerSizes = null;
        this.springAnimatedStrokeCornerSizes = null;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(dir0 dir0Var) {
        setShapeAppearanceModel(dir0Var);
    }

    public void setStroke(float f, int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.strokeColor != colorStateList) {
            materialShapeDrawableState.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.strokeTintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f) {
        this.drawableState.strokeWidth = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.tintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.tintMode != mode) {
            materialShapeDrawableState.tintMode = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.translationZ != f) {
            materialShapeDrawableState.translationZ = f;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.useTintColorForShadow != z) {
            materialShapeDrawableState.useTintColorForShadow = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    public void setStroke(float f, ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    public void setStrokeTint(int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    public void setCornerSize(xre xreVar) {
        setShapeAppearanceModel(this.drawableState.shapeAppearance.e(xreVar));
    }

    public void drawShape(Canvas canvas, Paint paint, Path path, RectF rectF) {
        drawShape(canvas, paint, path, this.drawableState.shapeAppearance.c(), this.springAnimatedCornerSizes, rectF);
    }

    private float calculateRoundRectCornerSize(RectF rectF, b bVar, float[] fArr) {
        if (fArr == null) {
            if (bVar.l(rectF)) {
                return bVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.isRoundRectCornerMorph) {
            return fArr[0];
        }
        return -1.0f;
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f) {
        return createWithElevationOverlay(context, f, null);
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    public static class MaterialShapeDrawableState extends Drawable.ConstantState {
        int alpha;
        ColorFilter colorFilter;
        float elevation;
        yqn elevationOverlayProvider;
        ColorStateList fillColor;
        float interpolation;
        Rect padding;
        Paint.Style paintStyle;
        float parentAbsoluteElevation;
        float scale;
        int shadowCompatMode;
        int shadowCompatOffset;
        int shadowCompatRadius;
        int shadowCompatRotation;
        fhr0 shapeAppearance;
        ColorStateList strokeColor;
        ColorStateList strokeTintList;
        float strokeWidth;
        ColorStateList tintList;
        PorterDuff.Mode tintMode;
        float translationZ;
        boolean useTintColorForShadow;

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = materialShapeDrawableState.shapeAppearance;
            this.elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
            this.strokeWidth = materialShapeDrawableState.strokeWidth;
            this.colorFilter = materialShapeDrawableState.colorFilter;
            this.fillColor = materialShapeDrawableState.fillColor;
            this.strokeColor = materialShapeDrawableState.strokeColor;
            this.tintMode = materialShapeDrawableState.tintMode;
            this.tintList = materialShapeDrawableState.tintList;
            this.alpha = materialShapeDrawableState.alpha;
            this.scale = materialShapeDrawableState.scale;
            this.shadowCompatOffset = materialShapeDrawableState.shadowCompatOffset;
            this.shadowCompatMode = materialShapeDrawableState.shadowCompatMode;
            this.useTintColorForShadow = materialShapeDrawableState.useTintColorForShadow;
            this.interpolation = materialShapeDrawableState.interpolation;
            this.parentAbsoluteElevation = materialShapeDrawableState.parentAbsoluteElevation;
            this.elevation = materialShapeDrawableState.elevation;
            this.translationZ = materialShapeDrawableState.translationZ;
            this.shadowCompatRadius = materialShapeDrawableState.shadowCompatRadius;
            this.shadowCompatRotation = materialShapeDrawableState.shadowCompatRotation;
            this.strokeTintList = materialShapeDrawableState.strokeTintList;
            this.paintStyle = materialShapeDrawableState.paintStyle;
            if (materialShapeDrawableState.padding != null) {
                this.padding = new Rect(materialShapeDrawableState.padding);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.pathDirty = true;
            materialShapeDrawable.strokePathDirty = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(fhr0 fhr0Var, yqn yqnVar) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = fhr0Var;
            this.elevationOverlayProvider = yqnVar;
        }
    }

    @Deprecated
    public MaterialShapeDrawable(dir0 dir0Var) {
        this((b) dir0Var);
    }

    public MaterialShapeDrawable(b bVar) {
        this(new MaterialShapeDrawableState(bVar, null));
    }

    public MaterialShapeDrawable(fhr0 fhr0Var) {
        this(new MaterialShapeDrawableState(fhr0Var, null));
    }

    public MaterialShapeDrawable() {
        this(new b());
    }

    private void updateShape(int[] iArr) {
        updateShape(iArr, false);
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(b.j(context, attributeSet, i, i2).a());
    }
}
