package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivPager;
import com.yandex.div2.a;
import xsna.gzs;
import xsna.ikn;
import xsna.zcl;

/* compiled from: DivPagerViewHolder.kt */
/* loaded from: classes7.dex */
public final class DivPagerViewHolder extends DivCollectionViewHolder {
    public static final Companion Companion = new Companion(null);
    private final gzs<DivPager.ItemAlignment> crossAxisAlignment;
    private final gzs<Boolean> isHorizontal;
    private final DivPagerPageLayout pageLayout;
    private final BindingContext parentContext;

    /* compiled from: DivPagerViewHolder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(BindingContext bindingContext, DivPagerPageLayout divPagerPageLayout, DivBinder divBinder, DivViewCreator divViewCreator, gzs<Boolean> gzsVar, gzs<? extends DivPager.ItemAlignment> gzsVar2) {
        super(divPagerPageLayout, bindingContext, divBinder, divViewCreator);
        this.parentContext = bindingContext;
        this.pageLayout = divPagerPageLayout;
        this.isHorizontal = gzsVar;
        this.crossAxisAlignment = gzsVar2;
        final View view = this.itemView;
        final ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                a oldDiv;
                BindingContext bindingContext2;
                BindingContext bindingContext3;
                oldDiv = DivPagerViewHolder.this.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                bindingContext2 = DivPagerViewHolder.this.parentContext;
                DivVisibilityActionTracker visibilityActionTracker = bindingContext2.getDivView().getDiv2Component$div_release().getVisibilityActionTracker();
                bindingContext3 = DivPagerViewHolder.this.parentContext;
                visibilityActionTracker.startTrackingViewsHierarchy(bindingContext3, view2, oldDiv);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }
        };
        view.addOnAttachStateChangeListener(r2);
        new Disposable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                view.removeOnAttachStateChangeListener(r2);
            }
        };
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, ikn iknVar, ExpressionResolver expressionResolver) {
        Enum invoke;
        Expression v = this.isHorizontal.invoke().booleanValue() ? iknVar.v() : iknVar.j();
        if (v == null || (invoke = (Enum) v.evaluate(expressionResolver)) == null) {
            invoke = this.crossAxisAlignment.invoke();
        }
        int i = 17;
        if (this.isHorizontal.invoke().booleanValue()) {
            if (invoke != DivPager.ItemAlignment.CENTER && invoke != DivAlignmentVertical.CENTER) {
                i = (invoke == DivPager.ItemAlignment.END || invoke == DivAlignmentVertical.BOTTOM) ? 80 : 48;
            }
        } else if (invoke != DivPager.ItemAlignment.CENTER && invoke != DivAlignmentHorizontal.CENTER) {
            i = (invoke == DivPager.ItemAlignment.END || invoke == DivAlignmentHorizontal.END) ? 8388613 : invoke == DivAlignmentHorizontal.LEFT ? 3 : invoke == DivAlignmentHorizontal.RIGHT ? 5 : 8388611;
        }
        divLayoutParams.setGravity(i);
        this.pageLayout.requestLayout();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(BindingContext bindingContext, a aVar, int i, DivStatePath divStatePath) {
        super.bind(bindingContext, aVar, i, divStatePath);
        View child = this.pageLayout.getChild();
        Object layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, aVar.b(), bindingContext.getExpressionResolver());
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivPagerViewHolder", "Pager holder reuse failed");
        }
    }
}
