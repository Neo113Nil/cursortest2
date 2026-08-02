package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.ny61;
import defpackage.q2l;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R.\u00101\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "Lzy11;", "block", "withRecyclerView", "(Ltls;)V", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView$e;", "Landroid/view/View;", "decoratedDimensionGetter", "findMaxChildDimension", "(Lwls;)I", "child", "addView", "(Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView$h;", "viewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$h;)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "isWrapContentAlongCrossAxis$div_release", "()Z", "isWrapContentAlongCrossAxis", "", "getAccessibilityClassName", "()Ljava/lang/String;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "Lq2l;", "value", "pageTransformer", "Lq2l;", "getPageTransformer$div_release", "()Lq2l;", "setPageTransformer$div_release", "(Lq2l;)V", "getOrientation", "()I", "setOrientation", "(I)V", "orientation", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewPager2Wrapper extends FrameLayout {
    private q2l pageTransformer;
    private final ViewPager2 viewPager;

    public ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    private final int findMaxChildDimension(final wls decoratedDimensionGetter) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        withRecyclerView(new tls() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$findMaxChildDimension$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                RecyclerView recyclerView = (RecyclerView) obj;
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                wls wlsVar = decoratedDimensionGetter;
                int i = 0;
                while (true) {
                    if (!(i < recyclerView.getChildCount())) {
                        return zy11.a;
                    }
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null) {
                        ny61.s();
                        return null;
                    }
                    RecyclerView.e layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, ((Number) wlsVar.invoke(layoutManager, childAt)).intValue());
                    }
                    i = i2;
                }
            }
        });
        return ref$IntRef.element;
    }

    private final void withRecyclerView(tls block) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        block.invoke(recyclerView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View child) {
        super.addView(child);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    /* renamed from: getPageTransformer$div_release, reason: from getter */
    public final q2l getPageTransformer() {
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
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        measureChild(getViewPager(), widthMeasureSpec, heightMeasureSpec);
        int orientation = getOrientation();
        if (orientation == 0) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.b), 1073741824));
        } else {
            if (orientation != 1) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.b), 1073741824), heightMeasureSpec);
        }
    }

    public final void setOrientation(int i) {
        com.yandex.div.core.view2.divs.pager.a aVar = (com.yandex.div.core.view2.divs.pager.a) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i && aVar != null && aVar.H == i) {
            return;
        }
        getViewPager().setOrientation(i);
        if (aVar != null) {
            aVar.H = i;
        }
        withRecyclerView(ViewPager2Wrapper$orientation$1.w);
    }

    public final void setPageTransformer$div_release(q2l q2lVar) {
        this.pageTransformer = q2lVar;
        getViewPager().setPageTransformer(q2lVar);
    }

    public final void setRecycledViewPool(final RecyclerView.h viewPool) {
        withRecyclerView(new tls() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$setRecycledViewPool$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((RecyclerView) obj).setRecycledViewPool(RecyclerView.h.this);
                return zy11.a;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public ViewPager2Wrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ViewPager2Wrapper(Context context) {
        this(context, null, 0, 6, null);
    }
}
