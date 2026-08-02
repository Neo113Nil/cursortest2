package xsna;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes13.dex */
public final class bm10 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;

    @NonNull
    public final zl10 a;

    @NonNull
    public final Rect b;

    @NonNull
    public final MaterialShapeDrawable c;

    @NonNull
    public final MaterialShapeDrawable d;
    public int e;
    public int f;
    public int g;
    public int h;

    @Nullable
    public Drawable i;

    @Nullable
    public Drawable j;

    @Nullable
    public ColorStateList k;

    @Nullable
    public ColorStateList l;

    @Nullable
    public com.google.android.material.shape.a m;

    @Nullable
    public ColorStateList n;

    @Nullable
    public RippleDrawable o;

    @Nullable
    public LayerDrawable p;

    @Nullable
    public MaterialShapeDrawable q;
    public boolean r;
    public boolean s;

    @Nullable
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public float x;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public bm10(@NonNull zl10 zl10Var, int i) {
        int i2 = zl10.p;
        this.b = new Rect();
        this.r = false;
        this.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a = zl10Var;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(zl10Var.getContext(), null, i, i2);
        this.c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(zl10Var.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        com.google.android.material.shape.a shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        a.C0123a c0123a = new a.C0123a(shapeAppearanceModel);
        TypedArray obtainStyledAttributes = zl10Var.getContext().obtainStyledAttributes(null, R$styleable.CardView, i, R$style.CardView);
        if (obtainStyledAttributes.hasValue(R$styleable.CardView_cardCornerRadius)) {
            c0123a.c(obtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        this.d = new MaterialShapeDrawable();
        h(c0123a.a());
        this.u = tb30.d(zl10Var.getContext(), R$attr.motionEasingLinearInterpolator, rq2.a);
        this.v = tb30.c(R$attr.motionDurationShort2, 300, zl10Var.getContext());
        this.w = tb30.c(R$attr.motionDurationShort1, 300, zl10Var.getContext());
        obtainStyledAttributes.recycle();
    }

    public static float b(wuj wujVar, float f) {
        return wujVar instanceof wog0 ? (float) ((1.0d - y) * f) : wujVar instanceof upk ? f / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float a() {
        wuj wujVar = this.m.a;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        return Math.max(Math.max(b(wujVar, materialShapeDrawable.getTopLeftCornerResolvedSize()), b(this.m.b, materialShapeDrawable.getTopRightCornerResolvedSize())), Math.max(b(this.m.c, materialShapeDrawable.getBottomRightCornerResolvedSize()), b(this.m.d, materialShapeDrawable.getBottomLeftCornerResolvedSize())));
    }

    @NonNull
    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new MaterialShapeDrawable(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R$id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    @NonNull
    public final am10 d(Drawable drawable) {
        int i;
        int i2;
        zl10 zl10Var = this.a;
        if (zl10Var.getUseCompatPadding()) {
            float maxCardElevation = zl10Var.getMaxCardElevation() * 1.5f;
            boolean i3 = i();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int ceil = (int) Math.ceil(maxCardElevation + (i3 ? a() : 0.0f));
            float maxCardElevation2 = zl10Var.getMaxCardElevation();
            if (i()) {
                f = a();
            }
            i = (int) Math.ceil(maxCardElevation2 + f);
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new am10(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.p != null) {
            zl10 zl10Var = this.a;
            if (zl10Var.getUseCompatPadding()) {
                float maxCardElevation = zl10Var.getMaxCardElevation() * 1.5f;
                boolean i7 = i();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i3 = (int) Math.ceil((maxCardElevation + (i7 ? a() : 0.0f)) * 2.0f);
                float maxCardElevation2 = zl10Var.getMaxCardElevation();
                if (i()) {
                    f = a();
                }
                i4 = (int) Math.ceil((maxCardElevation2 + f) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i8 = this.g;
            int i9 = (i8 & 8388613) == 8388613 ? ((i - this.e) - this.f) - i4 : this.e;
            int i10 = (i8 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - i3;
            int i11 = (i8 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - i4;
            int i12 = (i8 & 80) == 80 ? ((i2 - this.e) - this.f) - i3 : this.e;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (zl10Var.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.p.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                if (z2) {
                    f = 1.0f;
                }
                this.x = f;
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = ofFloat;
            ofFloat.addUpdateListener(new es6(this, 1));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(@Nullable Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.l);
            f(this.a.k, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R$id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(@NonNull com.google.android.material.shape.a aVar) {
        this.m = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        materialShapeDrawable.setShapeAppearanceModel(aVar);
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable2 = this.d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(aVar);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(aVar);
        }
    }

    public final boolean i() {
        zl10 zl10Var = this.a;
        return zl10Var.getPreventCornerOverlap() && this.c.isRoundRect() && zl10Var.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c = j() ? c() : this.d;
        this.i = c;
        if (drawable != c) {
            zl10 zl10Var = this.a;
            if (zl10Var.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) zl10Var.getForeground()).setDrawable(c);
            } else {
                zl10Var.setForeground(d(c));
            }
        }
    }

    public final void l() {
        zl10 zl10Var = this.a;
        boolean preventCornerOverlap = zl10Var.getPreventCornerOverlap();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float a = ((!preventCornerOverlap || this.c.isRoundRect()) && !i()) ? 0.0f : a();
        if (zl10Var.getPreventCornerOverlap() && zl10Var.getUseCompatPadding()) {
            f = (float) ((1.0d - y) * zl10Var.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        zl10Var.d.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.h.o(zl10Var.f);
    }

    public final void m() {
        boolean z2 = this.r;
        zl10 zl10Var = this.a;
        if (!z2) {
            zl10Var.setBackgroundInternal(d(this.c));
        }
        zl10Var.setForeground(d(this.i));
    }
}
