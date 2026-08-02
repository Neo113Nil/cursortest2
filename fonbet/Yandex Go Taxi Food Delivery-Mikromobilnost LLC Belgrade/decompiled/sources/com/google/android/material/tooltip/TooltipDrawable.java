package com.google.android.material.tooltip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.amy0;
import defpackage.bmy0;
import defpackage.cv60;
import defpackage.dky0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.jx81;
import defpackage.lhc;
import defpackage.mj2;
import defpackage.org0;
import defpackage.tkn;
import defpackage.vez0;
import defpackage.yvy0;
import defpackage.yw00;
import defpackage.z2i0;
import defpackage.z610;

/* loaded from: classes11.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements amy0 {
    private static final int DEFAULT_STYLE = g2i0.Widget_MaterialComponents_Tooltip;
    private static final int DEFAULT_THEME_ATTR = eng0.tooltipStyle;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;
    private CharSequence text;
    private final bmy0 textDrawableHelper;
    private float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.fontMetrics = new Paint.FontMetrics();
        bmy0 bmy0Var = new bmy0(this);
        this.textDrawableHelper = bmy0Var;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                TooltipDrawable.this.updateLocationOnScreen(view);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = bmy0Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i;
        int i2 = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        Rect rect = this.displayFrame;
        if (i2 < 0) {
            i = ((rect.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((rect.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                return 0.0f;
            }
            i = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.a.getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    public static TooltipDrawable create(Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.loadFromAttributes(attributeSet, i, i2);
        return tooltipDrawable;
    }

    private tkn createMarkerEdge() {
        float f = -calculatePointerOffset();
        float width = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.arrowSize)) / 2.0d);
        return new cv60(new yw00(this.arrowSize), Math.min(Math.max(f, -width), width));
    }

    private void drawText(Canvas canvas) {
        if (this.text == null) {
            return;
        }
        int calculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(getBounds());
        bmy0 bmy0Var = this.textDrawableHelper;
        if (bmy0Var.g != null) {
            bmy0Var.a.drawableState = getState();
            bmy0 bmy0Var2 = this.textDrawableHelper;
            bmy0Var2.g.d(this.context, bmy0Var2.a, bmy0Var2.b);
            this.textDrawableHelper.a.setAlpha((int) (this.labelOpacity * 255.0f));
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), calculateTextOriginAndAlignment, this.textDrawableHelper.a);
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.a(charSequence.toString());
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        TypedArray d = yvy0.d(this.context, attributeSet, z2i0.Tooltip, i, i2, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(org0.mtrl_tooltip_arrowSize);
        boolean z = d.getBoolean(z2i0.Tooltip_showMarker, true);
        this.showMarker = z;
        if (z) {
            b.a m = getShapeAppearanceModel().m();
            m.k = createMarkerEdge();
            setShapeAppearanceModel(m.a());
        } else {
            this.arrowSize = 0;
        }
        setText(d.getText(z2i0.Tooltip_android_text));
        Context context = this.context;
        int i3 = z2i0.Tooltip_android_textAppearance;
        dky0 dky0Var = (!d.hasValue(i3) || (resourceId = d.getResourceId(i3, 0)) == 0) ? null : new dky0(context, resourceId);
        if (dky0Var != null && d.hasValue(z2i0.Tooltip_android_textColor)) {
            dky0Var.k = jx81.o(this.context, d, z2i0.Tooltip_android_textColor);
        }
        setTextAppearance(dky0Var);
        Context context2 = this.context;
        int T = vez0.T(context2, z610.f(context2, eng0.colorOnBackground, TooltipDrawable.class.getCanonicalName()));
        Context context3 = this.context;
        setFillColor(ColorStateList.valueOf(d.getColor(z2i0.Tooltip_backgroundTint, lhc.d(lhc.f(T, BlendingGradientView.BASE_ALPHA), lhc.f(vez0.T(context3, z610.f(context3, R.attr.colorBackground, TooltipDrawable.class.getCanonicalName())), 229)))));
        Context context4 = this.context;
        setStrokeColor(ColorStateList.valueOf(vez0.T(context4, z610.f(context4, eng0.colorSurface, TooltipDrawable.class.getCanonicalName()))));
        this.padding = d.getDimensionPixelSize(z2i0.Tooltip_android_padding, 0);
        this.minWidth = d.getDimensionPixelSize(z2i0.Tooltip_android_minWidth, 0);
        this.minHeight = d.getDimensionPixelSize(z2i0.Tooltip_android_minHeight, 0);
        this.layoutMargin = d.getDimensionPixelSize(z2i0.Tooltip_android_layout_margin, 0);
        d.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float calculatePointerOffset = calculatePointerOffset();
        float f = (float) (-((Math.sqrt(2.0d) * this.arrowSize) - this.arrowSize));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, (getBounds().width() * this.tooltipPivotX) + getBounds().left, (getBounds().height() * this.tooltipPivotY) + getBounds().top);
        canvas.translate(calculatePointerOffset, f);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.a.getTextSize(), this.minHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getText() {
        return this.text;
    }

    public dky0 getTextAppearance() {
        return this.textDrawableHelper.g;
    }

    public int getTextPadding() {
        return this.padding;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.showMarker) {
            b.a m = getShapeAppearanceModel().m();
            m.k = createMarkerEdge();
            setShapeAppearanceModel(m.a());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, defpackage.amy0
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // defpackage.amy0
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(int i) {
        this.layoutMargin = i;
        invalidateSelf();
    }

    public void setMinHeight(int i) {
        this.minHeight = i;
        invalidateSelf();
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        invalidateSelf();
    }

    public void setPivots(float f, float f2) {
        this.tooltipPivotX = f;
        this.tooltipPivotY = f2;
        invalidateSelf();
    }

    public void setRelativeToView(View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void setRevealFraction(float f) {
        this.tooltipScaleX = f;
        this.tooltipScaleY = f;
        this.labelOpacity = mj2.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.e = true;
        invalidateSelf();
    }

    public void setTextAppearance(dky0 dky0Var) {
        this.textDrawableHelper.c(dky0Var, this.context);
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(new dky0(this.context, i));
    }

    public void setTextPadding(int i) {
        this.padding = i;
        invalidateSelf();
    }

    public void setTextResource(int i) {
        setText(this.context.getResources().getString(i));
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }
}
