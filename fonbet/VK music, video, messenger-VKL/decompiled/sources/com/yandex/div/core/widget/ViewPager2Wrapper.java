package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerPageTransformer;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.izs;
import xsna.kxt0;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: ViewPager2Wrapper.kt */
/* loaded from: classes7.dex */
public class ViewPager2Wrapper extends FrameLayout {
    private DivPagerPageTransformer pageTransformer;
    private final ViewPager2 viewPager;

    public ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    private final int findMaxChildDimension(final wzs<? super RecyclerView.o, ? super View, Integer> wzsVar) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        withRecyclerView(new izs<RecyclerView, s3q0>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$findMaxChildDimension$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                wzs<RecyclerView.o, View, Integer> wzsVar2 = wzsVar;
                kxt0 kxt0Var = new kxt0(recyclerView);
                while (kxt0Var.hasNext()) {
                    View next = kxt0Var.next();
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, wzsVar2.invoke(layoutManager, next).intValue());
                    }
                }
            }
        });
        return ref$IntRef.element;
    }

    private final void withRecyclerView(izs<? super RecyclerView, s3q0> izsVar) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        izsVar.invoke(recyclerView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    public final DivPagerPageTransformer getPageTransformer$div_release() {
        return this.pageTransformer;
    }

    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final boolean isWrapContentAlongCrossAxis$div_release() {
        return (getOrientation() == 0 && getLayoutParams().height == -2) || (getOrientation() == 1 && getLayoutParams().width == -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(i, i2);
            return;
        }
        measureChild(getViewPager(), i, i2);
        int orientation = getOrientation();
        if (orientation == 0) {
            super.onMeasure(i, ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.INSTANCE)));
        } else {
            if (orientation != 1) {
                return;
            }
            super.onMeasure(ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.INSTANCE)), i2);
        }
    }

    public final void setOrientation(int i) {
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i && divPagerAdapter != null && divPagerAdapter.getOrientation() == i) {
            return;
        }
        getViewPager().setOrientation(i);
        if (divPagerAdapter != null) {
            divPagerAdapter.setOrientation(i);
        }
        withRecyclerView(new izs<RecyclerView, s3q0>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$orientation$1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                recyclerView.getRecycledViewPool().clear();
                kxt0 kxt0Var = new kxt0(recyclerView);
                while (kxt0Var.hasNext()) {
                    View next = kxt0Var.next();
                    next.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    next.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        });
    }

    public final void setPageTransformer$div_release(DivPagerPageTransformer divPagerPageTransformer) {
        this.pageTransformer = divPagerPageTransformer;
        getViewPager().setPageTransformer(divPagerPageTransformer);
    }

    public final void setRecycledViewPool(final RecyclerView.u uVar) {
        withRecyclerView(new izs<RecyclerView, s3q0>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$setRecycledViewPool$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                recyclerView.setRecycledViewPool(RecyclerView.u.this);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }
}
