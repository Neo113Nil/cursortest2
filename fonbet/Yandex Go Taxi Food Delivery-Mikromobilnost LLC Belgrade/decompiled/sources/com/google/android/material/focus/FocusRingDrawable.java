package com.google.android.material.focus;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.eng0;
import defpackage.fhr0;
import defpackage.jhr0;
import defpackage.org0;
import defpackage.s6;
import defpackage.z2i0;
import defpackage.z610;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public class FocusRingDrawable extends DrawableWrapper {
    private static final int ANIMATION_DURATION = 300;
    private static final boolean DEBUG_COLORS = false;
    private static final Drawable EMPTY_DRAWABLE = new ColorDrawable(0);
    private static final int[] FOCUSED_STATE_SET = {R.attr.state_focused, R.attr.state_window_focused};
    private static final TimeInterpolator INTERPOLATOR = new OvershootInterpolator(4.0f);
    private static final FloatProperty<FocusRingDrawable> PROPERTY_INTERPOLATION = new FloatProperty<FocusRingDrawable>("interpolation") { // from class: com.google.android.material.focus.FocusRingDrawable.1
        @Override // android.util.Property
        public Float get(FocusRingDrawable focusRingDrawable) {
            return Float.valueOf(focusRingDrawable.interpolation);
        }

        @Override // android.util.FloatProperty
        public void setValue(FocusRingDrawable focusRingDrawable, float f) {
            focusRingDrawable.interpolation = f;
            focusRingDrawable.invalidateSelf();
        }
    };
    private ObjectAnimator animator;
    private boolean focused;
    private float interpolation;
    private WeakReference<MaterialShapeDrawable> materialShapeDrawable;
    private final Matrix matrix;
    private boolean mutated;
    private final Paint paint;
    private final jhr0 pathProvider;
    private boolean previousStateSetEmpty;
    private float shapeAppearanceCornerSize;
    private final Path shapeAppearancePath;
    private FocusRingState state;
    private final Path tmpPath;
    private final Rect tmpRect;
    private final RectF tmpRectF;

    private FocusRingDrawable(FocusRingState focusRingState, Resources resources) {
        super(null);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = jhr0.c();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState2 = new FocusRingState(focusRingState);
        this.state = focusRingState2;
        Drawable.ConstantState constantState = focusRingState2.wrappedState;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        updateLocalState();
    }

    private void calculateBounds(RectF rectF) {
        if (this.state.ringCustomBounds != null) {
            rectF.set(this.state.ringCustomBounds);
            return;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(this.materialShapeDrawable.get().getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        rippleDrawable.getHotspotBounds(this.tmpRect);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            this.tmpRect.inset(Math.max(0, (this.tmpRect.width() / 2) - radius), Math.max(0, (this.tmpRect.height() / 2) - radius));
        }
        rectF.set(this.tmpRect);
    }

    private float calculateInnerInset() {
        return ((this.state.ringInnerStrokeWidth / 2.0f) * this.interpolation) + this.state.ringInset + this.state.ringInnerInset;
    }

    private float calculateInnerRadius(float f) {
        return Math.max(0.0f, f - (this.state.ringOuterStrokeWidth / 2.0f));
    }

    private float calculateOuterInset() {
        return ((this.state.ringOuterStrokeWidth / 2.0f) * this.interpolation) + this.state.ringInset;
    }

    private float calculateOuterRadius() {
        int radius;
        if (!Float.isNaN(this.state.ringRadius)) {
            return this.state.ringRadius;
        }
        float f = this.shapeAppearanceCornerSize;
        if (f >= 0.0f) {
            return f;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null && weakReference.get() != null) {
            float calculateRoundRectCornerSize = this.materialShapeDrawable.get().calculateRoundRectCornerSize();
            if (calculateRoundRectCornerSize >= 0.0f) {
                return Math.max(0.0f, calculateRoundRectCornerSize - (this.state.ringOuterStrokeWidth / 2.0f));
            }
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
            return 0.0f;
        }
        return radius;
    }

    private void calculateShapeAppearanceRoundRectOrPath() {
        if (this.state.ringShapeAppearance != null) {
            updateShapeAppearanceCornerSizeOrPath(this.state.ringShapeAppearance);
        } else {
            if (updateFocusRingShapeAppearanceFromWrappedDrawable()) {
                return;
            }
            this.shapeAppearanceCornerSize = -1.0f;
            this.shapeAppearancePath.reset();
        }
    }

    private ObjectAnimator createAnimator() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, PROPERTY_INTERPOLATION, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(INTERPOLATOR);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.focus.FocusRingDrawable.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                FocusRingDrawable.this.interpolation = 1.0f;
                FocusRingDrawable.this.invalidateSelf();
            }
        });
        return ofFloat;
    }

    private void drawPath(Canvas canvas, Path path, float f, float f2, int i) {
        calculateBounds(this.tmpRectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / this.tmpRectF.width());
        float height = 1.0f - (f3 / this.tmpRectF.height());
        this.matrix.reset();
        this.matrix.postScale(width, height, this.tmpRectF.centerX(), this.tmpRectF.centerY());
        path.transform(this.matrix, this.tmpPath);
        this.paint.setStrokeWidth(f2 * this.interpolation);
        this.paint.setColor(i);
        canvas.drawPath(this.tmpPath, this.paint);
    }

    private void drawRoundRect(Canvas canvas, float f, float f2, float f3, int i) {
        calculateBounds(this.tmpRectF);
        this.tmpRectF.inset(f2, f2);
        this.paint.setStrokeWidth(f3 * this.interpolation);
        this.paint.setColor(i);
        canvas.drawRoundRect(this.tmpRectF, f, f, this.paint);
    }

    public static FocusRingDrawable find(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static FocusRingDrawable findAndMutate(Drawable drawable) {
        if (drawable == null || find(drawable) == null) {
            return null;
        }
        drawable.mutate();
        return find(drawable);
    }

    private float[] getCornerRadiiOrNull(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadii();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private float getCornerRadius(GradientDrawable gradientDrawable) {
        try {
            return gradientDrawable.getCornerRadius();
        } catch (NullPointerException unused) {
            return -1.0f;
        }
    }

    private Path getNonEmptyPath() {
        if (!this.shapeAppearancePath.isEmpty()) {
            return this.shapeAppearancePath;
        }
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        Path path = this.materialShapeDrawable.get().getPath();
        if (path.isEmpty()) {
            return null;
        }
        return path;
    }

    private int getResIdIfReference(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private int getValueDataIfAttr(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    private void inflateChildDrawable(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.state.wrappedState = drawable.getConstantState();
        } else {
            Drawable drawable2 = EMPTY_DRAWABLE;
            setDrawable(drawable2);
            this.state.wrappedState = drawable2.getConstantState();
        }
    }

    private void init(Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(z2i0.FocusRingDrawable);
        updateStateFromTypedArrayWithThemeAttrsAndDefaults(obtainStyledAttributes, theme);
        obtainStyledAttributes.recycle();
        updateLocalState();
    }

    public static FocusRingDrawable layer(Context context, LayerDrawable layerDrawable, MaterialShapeDrawable materialShapeDrawable) {
        if (!shouldUseFocusRing(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, EMPTY_DRAWABLE);
        if (materialShapeDrawable != null) {
            focusRingDrawable.setFocusRingMaterialShapeDrawable(materialShapeDrawable);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private void maybeAnimate(boolean z) {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        if (!z) {
            this.interpolation = 1.0f;
            return;
        }
        ObjectAnimator createAnimator = createAnimator();
        this.animator = createAnimator;
        createAnimator.start();
    }

    private int maybeResolveColor(int i, Resources.Theme theme, int i2, TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private float maybeResolveDimension(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    private static boolean shouldUseFocusRing(Context context) {
        return z610.c(context.getTheme(), eng0.focusRingsEnabled, false);
    }

    private fhr0 toShapeAppearance(GradientDrawable gradientDrawable) {
        float[] cornerRadiiOrNull = getCornerRadiiOrNull(gradientDrawable);
        if (cornerRadiiOrNull != null) {
            b.a aVar = new b.a();
            aVar.j(Math.min(cornerRadiiOrNull[0], cornerRadiiOrNull[1]));
            aVar.l(Math.min(cornerRadiiOrNull[2], cornerRadiiOrNull[3]));
            aVar.h(Math.min(cornerRadiiOrNull[4], cornerRadiiOrNull[5]));
            aVar.f(Math.min(cornerRadiiOrNull[6], cornerRadiiOrNull[7]));
            return aVar.a();
        }
        float cornerRadius = getCornerRadius(gradientDrawable);
        if (cornerRadius <= 0.0f) {
            return null;
        }
        b.a aVar2 = new b.a();
        aVar2.c(cornerRadius);
        return aVar2.a();
    }

    private void updateLocalState() {
        this.paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.state.ringOuterStrokeWidth)) {
            return;
        }
        this.paint.setStrokeWidth(this.state.ringOuterStrokeWidth);
    }

    private void updateShapeAppearanceCornerSizeOrPath(fhr0 fhr0Var) {
        calculateBounds(this.tmpRectF);
        b b = fhr0Var.b(FOCUSED_STATE_SET);
        if (!b.l(this.tmpRectF)) {
            this.pathProvider.b(b, null, 1.0f, this.tmpRectF, null, this.shapeAppearancePath);
            this.shapeAppearanceCornerSize = -1.0f;
        } else {
            float calculateOuterInset = calculateOuterInset();
            this.tmpRectF.inset(calculateOuterInset, calculateOuterInset);
            this.shapeAppearanceCornerSize = b.e.a(this.tmpRectF);
            this.shapeAppearancePath.reset();
        }
    }

    private void updateStateFromTypedArrayWithThemeAttrsAndDefaults(TypedArray typedArray, Resources.Theme theme) {
        TypedValue b;
        if (this.state.ringEnabledAttr != Integer.MIN_VALUE && (b = z610.b(theme, this.state.ringEnabledAttr)) != null) {
            this.state.ringEnabled = b.data != 0;
            this.state.ringEnabledInflated = true;
        }
        if (!this.state.ringEnabledInflated) {
            FocusRingState focusRingState = this.state;
            focusRingState.ringEnabled = z610.c(theme, eng0.focusRingsEnabled, focusRingState.ringEnabled);
        }
        if (this.state.ringEnabled) {
            FocusRingState focusRingState2 = this.state;
            focusRingState2.ringOuterColor = maybeResolveColor(focusRingState2.ringOuterColor, theme, this.state.ringOuterColorAttr, typedArray, z2i0.FocusRingDrawable_focusRingsOuterStrokeColor, ModalContentViewContainer.BASE_SHADOW_COLOR);
            FocusRingState focusRingState3 = this.state;
            focusRingState3.ringInnerColor = maybeResolveColor(focusRingState3.ringInnerColor, theme, this.state.ringInnerColorAttr, typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeColor, -1);
            FocusRingState focusRingState4 = this.state;
            focusRingState4.ringOuterStrokeWidth = maybeResolveDimension(focusRingState4.ringOuterStrokeWidth, theme, this.state.ringOuterStrokeWidthAttr, typedArray, z2i0.FocusRingDrawable_focusRingsOuterStrokeWidth, org0.mtrl_focus_ring_outer_stroke_width);
            FocusRingState focusRingState5 = this.state;
            focusRingState5.ringInnerStrokeWidth = maybeResolveDimension(focusRingState5.ringInnerStrokeWidth, theme, this.state.ringInnerStrokeWidthAttr, typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeWidth, org0.mtrl_focus_ring_inner_stroke_width);
            FocusRingState focusRingState6 = this.state;
            focusRingState6.ringRadius = maybeResolveDimension(focusRingState6.ringRadius, theme, this.state.ringRadiusAttr, typedArray, z2i0.FocusRingDrawable_focusRingsRadius, 0);
            FocusRingState focusRingState7 = this.state;
            focusRingState7.ringInset = maybeResolveDimension(focusRingState7.ringInset, theme, this.state.ringInsetAttr, typedArray, z2i0.FocusRingDrawable_focusRingsInset, 0);
            if (Float.isNaN(this.state.ringInset)) {
                this.state.ringInset = 0.0f;
            }
            FocusRingState focusRingState8 = this.state;
            focusRingState8.ringInnerInset = maybeResolveDimension(focusRingState8.ringInnerInset, theme, this.state.ringInnerInsetAttr, typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeInset, org0.mtrl_focus_ring_inner_stroke_inset);
            int i = this.state.ringShapeAppearanceResId;
            FocusRingState focusRingState9 = this.state;
            if (i != Integer.MIN_VALUE) {
                focusRingState9.ringShapeAppearance = b.i(theme.obtainStyledAttributes(focusRingState9.ringShapeAppearanceResId, z2i0.ShapeAppearance), new s6(0.0f)).a();
                return;
            }
            TypedValue b2 = z610.b(theme, focusRingState9.ringShapeAppearanceAttr != Integer.MIN_VALUE ? this.state.ringShapeAppearanceAttr : eng0.focusRingsShapeAppearance);
            if (b2 != null) {
                this.state.ringShapeAppearance = b.i(theme.obtainStyledAttributes(b2.resourceId, z2i0.ShapeAppearance), new s6(0.0f)).a();
            }
        }
    }

    private void updateStateFromTypedArrayWithoutThemeAttrsOrDefaults(TypedArray typedArray) {
        this.state.ringEnabledAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsEnabled);
        if (this.state.ringEnabledAttr == Integer.MIN_VALUE && typedArray.hasValue(z2i0.FocusRingDrawable_focusRingsEnabled)) {
            FocusRingState focusRingState = this.state;
            focusRingState.ringEnabled = typedArray.getBoolean(z2i0.FocusRingDrawable_focusRingsEnabled, focusRingState.ringEnabled);
            this.state.ringEnabledInflated = true;
        }
        this.state.ringOuterColorAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsOuterStrokeColor);
        if (this.state.ringOuterColorAttr == Integer.MIN_VALUE) {
            this.state.ringOuterColor = typedArray.getColor(z2i0.FocusRingDrawable_focusRingsOuterStrokeColor, Integer.MIN_VALUE);
        }
        this.state.ringInnerColorAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeColor);
        if (this.state.ringInnerColorAttr == Integer.MIN_VALUE) {
            this.state.ringInnerColor = typedArray.getColor(z2i0.FocusRingDrawable_focusRingsInnerStrokeColor, Integer.MIN_VALUE);
        }
        this.state.ringOuterStrokeWidthAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsOuterStrokeWidth);
        if (this.state.ringOuterStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringOuterStrokeWidth = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsOuterStrokeWidth, Float.NaN);
        }
        this.state.ringInnerStrokeWidthAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeWidth);
        if (this.state.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringInnerStrokeWidth = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.state.ringInnerStrokeWidthAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeWidth);
        if (this.state.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            this.state.ringInnerStrokeWidth = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.state.ringRadiusAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsRadius);
        if (this.state.ringRadiusAttr == Integer.MIN_VALUE) {
            this.state.ringRadius = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsRadius, Float.NaN);
        }
        this.state.ringInsetAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsInset);
        if (this.state.ringInsetAttr == Integer.MIN_VALUE) {
            this.state.ringInset = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsInset, Float.NaN);
        }
        this.state.ringInnerInsetAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsInnerStrokeInset);
        if (this.state.ringInnerInsetAttr == Integer.MIN_VALUE) {
            this.state.ringInnerInset = typedArray.getDimension(z2i0.FocusRingDrawable_focusRingsInnerStrokeInset, Float.NaN);
        }
        this.state.ringShapeAppearanceAttr = getValueDataIfAttr(typedArray, z2i0.FocusRingDrawable_focusRingsShapeAppearance);
        this.state.ringShapeAppearanceResId = getResIdIfReference(typedArray, z2i0.FocusRingDrawable_focusRingsShapeAppearance);
    }

    public static Drawable wrap(Context context, Drawable drawable) {
        return !shouldUseFocusRing(context) ? drawable : new FocusRingDrawable(context, drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        init(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.state.ringEnabled && this.focused) {
            float calculateOuterInset = calculateOuterInset();
            float calculateInnerInset = calculateInnerInset();
            Path nonEmptyPath = getNonEmptyPath();
            if (nonEmptyPath != null) {
                drawPath(canvas, nonEmptyPath, calculateInnerInset, this.state.ringInnerStrokeWidth, this.state.ringInnerColor);
                drawPath(canvas, nonEmptyPath, calculateOuterInset, this.state.ringOuterStrokeWidth, this.state.ringOuterColor);
            } else {
                float calculateOuterRadius = calculateOuterRadius();
                drawRoundRect(canvas, calculateInnerRadius(calculateOuterRadius), calculateInnerInset, this.state.ringInnerStrokeWidth, this.state.ringInnerColor);
                drawRoundRect(canvas, calculateOuterRadius, calculateOuterInset, this.state.ringOuterStrokeWidth, this.state.ringOuterColor);
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (!this.state.canConstantState()) {
            return null;
        }
        this.state.mChangingConfigurations = getChangingConfigurations();
        return this.state;
    }

    public Rect getFocusRingBounds() {
        return this.state.ringCustomBounds;
    }

    public float getFocusRingInnerInset() {
        return this.state.ringInnerInset;
    }

    public int getFocusRingInnerStrokeColor() {
        return this.state.ringInnerColor;
    }

    public float getFocusRingInnerStrokeWidth() {
        return this.state.ringInnerStrokeWidth;
    }

    public float getFocusRingInset() {
        return this.state.ringInset;
    }

    public MaterialShapeDrawable getFocusRingMaterialShapeDrawable() {
        WeakReference<MaterialShapeDrawable> weakReference = this.materialShapeDrawable;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getFocusRingOuterStrokeColor() {
        return this.state.ringOuterColor;
    }

    public float getFocusRingOuterStrokeWidth() {
        return this.state.ringOuterStrokeWidth;
    }

    public float getFocusRingRadius() {
        return this.state.ringRadius;
    }

    public fhr0 getFocusRingShapeAppearance() {
        return this.state.ringShapeAppearance;
    }

    public int[] getFocusRingStateSet() {
        return this.state.ringStateSet;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.state.ringEnabled;
        } catch (NoSuchMethodError unused) {
            return this.state.ringEnabled;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, z2i0.FocusRingDrawable, 0, 0) : resources.obtainAttributes(attributeSet, z2i0.FocusRingDrawable);
        updateStateFromTypedArrayWithoutThemeAttrsOrDefaults(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        inflateChildDrawable(resources, xmlPullParser, attributeSet, theme);
    }

    public boolean isFocusRingEnabled() {
        return this.state.ringEnabled;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || this.state.ringEnabled;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.animator = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.state = new FocusRingState(this.state);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.state.wrappedState = drawable.getConstantState();
            }
            this.mutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.state.ringEnabled) {
            calculateShapeAppearanceRoundRectOrPath();
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (!this.state.ringEnabled) {
            this.focused = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(this.state.ringStateSet, iArr);
        boolean z = this.focused != stateSetMatches;
        this.focused = stateSetMatches;
        if (z && iArr.length > 0 && !this.previousStateSetEmpty) {
            maybeAnimate(stateSetMatches);
        }
        this.previousStateSetEmpty = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public void setFocusRingBounds(int i, int i2, int i3, int i4) {
        if (this.state.ringCustomBounds == null) {
            this.state.ringCustomBounds = new Rect();
        }
        this.state.ringCustomBounds.set(i, i2, i3, i4);
    }

    public void setFocusRingEnabled(boolean z) {
        this.state.ringEnabled = z;
    }

    public void setFocusRingInnerInset(float f) {
        this.state.ringInnerInset = f;
    }

    public void setFocusRingInnerStrokeColor(int i) {
        this.state.ringInnerColor = i;
    }

    public void setFocusRingInnerStrokeWidth(float f) {
        this.state.ringInnerStrokeWidth = f;
    }

    public void setFocusRingInset(float f) {
        this.state.ringInset = f;
    }

    public void setFocusRingMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.materialShapeDrawable = new WeakReference<>(materialShapeDrawable);
    }

    public void setFocusRingOuterStrokeColor(int i) {
        this.state.ringOuterColor = i;
    }

    public void setFocusRingOuterStrokeWidth(float f) {
        this.state.ringOuterStrokeWidth = f;
    }

    public void setFocusRingRadius(float f) {
        this.state.ringRadius = f;
    }

    public void setFocusRingShapeAppearance(fhr0 fhr0Var) {
        this.state.ringShapeAppearance = fhr0Var;
    }

    public void setFocusRingStateSet(int[] iArr) {
        this.state.ringStateSet = iArr;
    }

    public boolean updateFocusRingShapeAppearanceFromWrappedDrawable() {
        fhr0 shapeAppearance = toShapeAppearance(getDrawable());
        if (shapeAppearance == null) {
            return false;
        }
        updateShapeAppearanceCornerSizeOrPath(shapeAppearance);
        return true;
    }

    public static final class FocusRingState extends Drawable.ConstantState {
        int mChangingConfigurations;
        private Rect ringCustomBounds;
        private boolean ringEnabled;
        private int ringEnabledAttr;
        private boolean ringEnabledInflated;
        private int ringInnerColor;
        private int ringInnerColorAttr;
        private float ringInnerInset;
        private int ringInnerInsetAttr;
        private float ringInnerStrokeWidth;
        private int ringInnerStrokeWidthAttr;
        private float ringInset;
        private int ringInsetAttr;
        private int ringOuterColor;
        private int ringOuterColorAttr;
        private float ringOuterStrokeWidth;
        private int ringOuterStrokeWidthAttr;
        private float ringRadius;
        private int ringRadiusAttr;
        private fhr0 ringShapeAppearance;
        private int ringShapeAppearanceAttr;
        private int ringShapeAppearanceResId;
        private int[] ringStateSet;
        Drawable.ConstantState wrappedState;

        public FocusRingState(FocusRingState focusRingState) {
            this.mChangingConfigurations = 0;
            this.ringEnabled = false;
            this.ringEnabledAttr = Integer.MIN_VALUE;
            this.ringEnabledInflated = false;
            this.ringOuterColor = Integer.MIN_VALUE;
            this.ringOuterColorAttr = Integer.MIN_VALUE;
            this.ringInnerColor = Integer.MIN_VALUE;
            this.ringInnerColorAttr = Integer.MIN_VALUE;
            this.ringOuterStrokeWidth = Float.NaN;
            this.ringOuterStrokeWidthAttr = Integer.MIN_VALUE;
            this.ringInnerStrokeWidth = Float.NaN;
            this.ringInnerStrokeWidthAttr = Integer.MIN_VALUE;
            this.ringRadius = Float.NaN;
            this.ringRadiusAttr = Integer.MIN_VALUE;
            this.ringInset = Float.NaN;
            this.ringInsetAttr = Integer.MIN_VALUE;
            this.ringInnerInset = Float.NaN;
            this.ringInnerInsetAttr = Integer.MIN_VALUE;
            this.ringShapeAppearance = null;
            this.ringShapeAppearanceResId = Integer.MIN_VALUE;
            this.ringShapeAppearanceAttr = Integer.MIN_VALUE;
            this.ringCustomBounds = null;
            this.ringStateSet = FocusRingDrawable.FOCUSED_STATE_SET;
            if (focusRingState != null) {
                this.wrappedState = focusRingState.wrappedState;
                this.mChangingConfigurations = focusRingState.mChangingConfigurations;
                this.ringEnabled = focusRingState.ringEnabled;
                this.ringEnabledAttr = focusRingState.ringEnabledAttr;
                this.ringEnabledInflated = focusRingState.ringEnabledInflated;
                this.ringOuterColor = focusRingState.ringOuterColor;
                this.ringOuterColorAttr = focusRingState.ringOuterColorAttr;
                this.ringInnerColor = focusRingState.ringInnerColor;
                this.ringInnerColorAttr = focusRingState.ringInnerColorAttr;
                this.ringOuterStrokeWidth = focusRingState.ringOuterStrokeWidth;
                this.ringOuterStrokeWidthAttr = focusRingState.ringOuterStrokeWidthAttr;
                this.ringInnerStrokeWidth = focusRingState.ringInnerStrokeWidth;
                this.ringInnerStrokeWidthAttr = focusRingState.ringInnerStrokeWidthAttr;
                this.ringRadius = focusRingState.ringRadius;
                this.ringRadiusAttr = focusRingState.ringRadiusAttr;
                this.ringInset = focusRingState.ringInset;
                this.ringInsetAttr = focusRingState.ringInsetAttr;
                this.ringInnerInset = focusRingState.ringInnerInset;
                this.ringInnerInsetAttr = focusRingState.ringInnerInsetAttr;
                this.ringShapeAppearanceResId = focusRingState.ringShapeAppearanceResId;
                this.ringShapeAppearanceAttr = focusRingState.ringShapeAppearanceAttr;
                fhr0 fhr0Var = focusRingState.ringShapeAppearance;
                if (fhr0Var instanceof b) {
                    this.ringShapeAppearance = ((b) fhr0Var).m().a();
                } else if (fhr0Var instanceof c) {
                    this.ringShapeAppearance = ((c) fhr0Var).j().b();
                } else {
                    this.ringShapeAppearance = fhr0Var;
                }
                if (focusRingState.ringCustomBounds != null) {
                    this.ringCustomBounds = new Rect(focusRingState.ringCustomBounds);
                }
                int[] iArr = focusRingState.ringStateSet;
                this.ringStateSet = Arrays.copyOf(iArr, iArr.length);
            }
        }

        public boolean canConstantState() {
            return this.wrappedState != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.wrappedState;
            return this.mChangingConfigurations | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new FocusRingDrawable(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources);
        }
    }

    public static FocusRingDrawable layer(Context context, LayerDrawable layerDrawable) {
        return layer(context, layerDrawable, null);
    }

    public void setFocusRingBounds(Rect rect) {
        this.state.ringCustomBounds = rect;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws IOException, XmlPullParserException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    private fhr0 toShapeAppearance(ShapeDrawable shapeDrawable) {
        Outline outline = new Outline();
        shapeDrawable.getOutline(outline);
        if (outline.getRadius() <= 0.0f) {
            return null;
        }
        b.a aVar = new b.a();
        aVar.c(outline.getRadius());
        return aVar.a();
    }

    public FocusRingDrawable() {
        super(null);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = jhr0.c();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        this.state = new FocusRingState(null);
    }

    private fhr0 toShapeAppearance(Drawable drawable) {
        if (drawable instanceof ShapeDrawable) {
            return toShapeAppearance((ShapeDrawable) drawable);
        }
        if (drawable instanceof GradientDrawable) {
            return toShapeAppearance((GradientDrawable) drawable);
        }
        return null;
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = jhr0.c();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState = new FocusRingState(null);
        this.state = focusRingState;
        if (drawable != null) {
            focusRingState.wrappedState = drawable.getConstantState();
        }
        init(context.getTheme());
    }
}
