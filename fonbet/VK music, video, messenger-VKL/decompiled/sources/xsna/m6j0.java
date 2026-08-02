package xsna;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShapeableImageView.java */
/* loaded from: classes13.dex */
public class m6j0 extends AppCompatImageView implements l6j0 {
    public static final int t = R$style.Widget_MaterialComponents_ShapeableImageView;
    public final com.google.android.material.shape.b b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final Paint f;
    public final Path g;

    @Nullable
    public ColorStateList h;

    @Nullable
    public MaterialShapeDrawable i;
    public com.google.android.material.shape.a j;
    public float k;
    public final Path l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;

    /* compiled from: ShapeableImageView.java */
    @TargetApi(21)
    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            m6j0 m6j0Var = m6j0.this;
            if (m6j0Var.j == null) {
                return;
            }
            if (m6j0Var.i == null) {
                m6j0Var.i = new MaterialShapeDrawable(m6j0Var.j);
            }
            RectF rectF = m6j0Var.c;
            Rect rect = this.a;
            rectF.round(rect);
            m6j0Var.i.setBounds(rect);
            m6j0Var.i.getOutline(outline);
        }
    }

    public m6j0(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean U() {
        return getLayoutDirection() == 1;
    }

    public final void V(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.c;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        com.google.android.material.shape.a aVar = this.j;
        com.google.android.material.shape.b bVar = this.b;
        Path path = this.g;
        bVar.a(aVar, 1.0f, rectF, null, path);
        Path path2 = this.l;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.d;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.p;
    }

    public final int getContentPaddingEnd() {
        int i = this.r;
        return i != Integer.MIN_VALUE ? i : U() ? this.m : this.o;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.q != Integer.MIN_VALUE || this.r != Integer.MIN_VALUE) {
            if (U() && (i2 = this.r) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!U() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.m;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.q != Integer.MIN_VALUE || this.r != Integer.MIN_VALUE) {
            if (U() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!U() && (i = this.r) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.o;
    }

    public final int getContentPaddingStart() {
        int i = this.q;
        return i != Integer.MIN_VALUE ? i : U() ? this.o : this.m;
    }

    public int getContentPaddingTop() {
        return this.n;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.j;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.h;
    }

    public float getStrokeWidth() {
        return this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.l, this.f);
        if (this.h == null) {
            return;
        }
        float f = this.k;
        Paint paint = this.e;
        paint.setStrokeWidth(f);
        int colorForState = this.h.getColorForState(getDrawableState(), this.h.getDefaultColor());
        if (this.k <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.g, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.s && isLayoutDirectionResolved()) {
            this.s = true;
            if (!isPaddingRelative() && this.q == Integer.MIN_VALUE && this.r == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        V(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        this.j = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.i;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        V(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(anj.b(i, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.k != f) {
            this.k = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m6j0(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(zm10.a(context, attributeSet, 0, r0), attributeSet, 0);
        int i2 = t;
        this.b = b.a.a;
        this.g = new Path();
        this.s = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.c = new RectF();
        this.d = new RectF();
        this.l = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, 0, i2);
        setLayerType(2, null);
        this.h = qm10.a(context2, obtainStyledAttributes, R$styleable.ShapeableImageView_strokeColor);
        this.k = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPadding, 0);
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.p = dimensionPixelSize;
        this.m = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.n = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.p = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.q = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.r = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.j = com.google.android.material.shape.a.c(context2, attributeSet, 0, i2).a();
        setOutlineProvider(new a());
    }
}
