package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.c7;
import com.yandex.div2.g7;
import com.yandex.div2.j7;

/* compiled from: DivPagerPageTransformer.kt */
/* loaded from: classes7.dex */
public final class DivPagerPageTransformer implements ViewPager2.i {
    private final boolean isHorizontal;
    private final DivPagerPageOffsetProvider offsetProvider;
    private final c7 pageTransformation;
    private final SparseArray<Float> pageTranslations;
    private final int parentSize;
    private final RecyclerView recyclerView;
    private final ExpressionResolver resolver;

    public DivPagerPageTransformer(RecyclerView recyclerView, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, int i, c7 c7Var, DivPagerPageOffsetProvider divPagerPageOffsetProvider, boolean z) {
        this.recyclerView = recyclerView;
        this.resolver = expressionResolver;
        this.pageTranslations = sparseArray;
        this.parentSize = i;
        this.pageTransformation = c7Var;
        this.offsetProvider = divPagerPageOffsetProvider;
        this.isHorizontal = z;
    }

    private final void apply(j7 j7Var, View view, float f) {
        applyAlphaAndScale(view, f, j7Var.a, j7Var.b, j7Var.c, j7Var.d, j7Var.e);
        applyOffset$default(this, view, f, false, 2, null);
    }

    private final void applyAlphaAndScale(View view, float f, Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        float f2 = f >= -1.0f ? f : -1.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float interpolation = 1 - DivUtilKt.getAndroidInterpolator(expression.evaluate(this.resolver)).getInterpolation(Math.abs(f2));
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            applyPageAlpha(view, interpolation, expression2.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression3.evaluate(this.resolver).doubleValue());
        } else {
            applyPageAlpha(view, interpolation, expression4.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression5.evaluate(this.resolver).doubleValue());
        }
    }

    private final void applyEvaluatedOffset(View view, int i, float f) {
        this.pageTranslations.put(i, Float.valueOf(f));
        if (this.isHorizontal) {
            view.setTranslationX(f);
        } else {
            view.setTranslationY(f);
        }
    }

    private final void applyOffset(View view, float f, boolean z) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        float f2 = -(z ? this.parentSize * f : this.offsetProvider.getPageOffset(f, childAdapterPosition, this.pageTransformation instanceof c7.a));
        if (this.isHorizontal && ViewsKt.isLayoutRtl(this.recyclerView)) {
            f2 = -f2;
        }
        applyEvaluatedOffset(view, childAdapterPosition, f2);
    }

    public static /* synthetic */ void applyOffset$default(DivPagerPageTransformer divPagerPageTransformer, View view, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        divPagerPageTransformer.applyOffset(view, f, z);
    }

    private final void applyPageAlpha(View view, float f, double d) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        view.setAlpha((float) getInterpolation(divPagerAdapter.getItemsToShow().get(childAdapterPosition).getDiv().b().a().evaluate(this.resolver).doubleValue(), d, f));
    }

    private final void applyPageScale(View view, float f, double d) {
        if (d == 1.0d) {
            return;
        }
        float interpolation = (float) getInterpolation(1.0d, d, f);
        view.setScaleX(interpolation);
        view.setScaleY(interpolation);
    }

    private final double getInterpolation(double d, double d2, float f) {
        return (Math.abs(d2 - d) * f) + Math.min(d, d2);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void transformPage(View view, float f) {
        c7 c7Var = this.pageTransformation;
        Object a = c7Var != null ? c7Var.a() : null;
        if (a instanceof j7) {
            apply((j7) a, view, f);
        } else if (a instanceof g7) {
            apply((g7) a, view, f);
        } else {
            applyOffset$default(this, view, f, false, 2, null);
        }
    }

    private final void apply(g7 g7Var, View view, float f) {
        applyAlphaAndScale(view, f, g7Var.a, g7Var.b, g7Var.c, g7Var.d, g7Var.e);
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !g7Var.f.evaluate(this.resolver).booleanValue())) {
            applyOffset(view, f, true);
            view.setTranslationZ(-Math.abs(f));
        } else {
            applyOffset$default(this, view, f, false, 2, null);
            view.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
