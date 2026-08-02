package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.a;
import com.yandex.div2.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.e43;
import xsna.e9e0;
import xsna.g5g;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.mq;
import xsna.s3q0;

/* compiled from: DivGridBinder.kt */
/* loaded from: classes7.dex */
public final class DivGridBinder extends DivViewBinder<a.e, b5, DivGridLayout> {
    private final e9e0<DivBinder> divBinder;
    private final DivPatchManager divPatchManager;
    private final e9e0<DivViewCreator> divViewCreator;

    public DivGridBinder(DivBaseBinder divBaseBinder, DivPatchManager divPatchManager, e9e0<DivBinder> e9e0Var, e9e0<DivViewCreator> e9e0Var2) {
        super(divBaseBinder);
        this.divPatchManager = divPatchManager;
        this.divBinder = e9e0Var;
        this.divViewCreator = e9e0Var2;
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i = 1;
        }
        if (divLayoutParams.getColumnSpan() != i) {
            divLayoutParams.setColumnSpan(i);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, ikn iknVar) {
        applyColumnSpan(view, expressionResolver, iknVar.e());
        applyRowSpan(view, expressionResolver, iknVar.h());
    }

    private final List<com.yandex.div2.a> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, com.yandex.div2.a aVar, int i) {
        Div2View divView = bindingContext.getDivView();
        String id = aVar.b().getId();
        if (id == null || divView.getComplexRebindInProgress$div_release()) {
            return Collections.singletonList(aVar);
        }
        Map<com.yandex.div2.a, View> createViewsForId = this.divPatchManager.createViewsForId(bindingContext, id);
        if (createViewsForId == null) {
            return Collections.singletonList(aVar);
        }
        viewGroup.removeViewAt(i);
        Iterator<Map.Entry<com.yandex.div2.a, View>> it = createViewsForId.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i2 + i, new DivLayoutParams(-2, -2));
            i2++;
        }
        return j5g.O0(createViewsForId.keySet());
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i = 1;
        }
        if (divLayoutParams.getRowSpan() != i) {
            divLayoutParams.setRowSpan(i);
            view.requestLayout();
        }
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, b5 b5Var, b5 b5Var2, DivStatePath divStatePath) {
        List<com.yandex.div2.a> list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<com.yandex.div2.a> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(b5Var);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath), expressionResolver), (b5Var2 == null || (list = b5Var2.y) == null) ? null : DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(final View view, final ikn iknVar, final ExpressionResolver expressionResolver) {
        applyGridLayoutParams(view, expressionResolver, iknVar);
        if (view instanceof ExpressionSubscriber) {
            izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                    invoke2(obj);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    DivGridBinder.this.applyGridLayoutParams(view, expressionResolver, iknVar);
                }
            };
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            Expression<Long> e = iknVar.e();
            expressionSubscriber.addSubscription(e != null ? e.observe(expressionResolver, izsVar) : null);
            Expression<Long> h = iknVar.h();
            expressionSubscriber.addSubscription(h != null ? h.observe(expressionResolver, izsVar) : null);
        }
    }

    private final List<com.yandex.div2.a> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends com.yandex.div2.a> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            List<com.yandex.div2.a> applyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (com.yandex.div2.a) obj, i2 + i3);
            i3 += applyPatchToChild.size() - 1;
            g5g.y(applyPatchToChild, arrayList);
            i2 = i4;
        }
        List<String> ids = DivPathUtils.INSTANCE.getIds(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            com.yandex.div2.a aVar = (com.yandex.div2.a) next;
            View childAt = divGridLayout.getChildAt(i);
            ikn b = aVar.b();
            this.divBinder.get().bind(bindingContext, childAt, aVar, divStatePath.appendDiv(ids.get(i)));
            bindLayoutParams(childAt, b, expressionResolver);
            if (DivUtilKt.getHasSightActions(b)) {
                divView.bindViewToDiv$div_release(childAt, aVar);
            } else {
                divView.unbindViewFromDiv$div_release(childAt);
            }
            i = i5;
        }
        return arrayList;
    }

    private final void observeContentAlignment(final DivGridLayout divGridLayout, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivGridLayout.this.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
            }
        };
        divGridLayout.addSubscription(expression.observe(expressionResolver, izsVar));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, izsVar));
    }

    public void bindView(BindingContext bindingContext, DivGridLayout divGridLayout, a.e eVar, DivStatePath divStatePath) {
        super.bindView(bindingContext, (BindingContext) divGridLayout, (DivGridLayout) eVar, divStatePath);
        b5 b5Var = eVar.c;
        a.e div = divGridLayout.getDiv();
        bindItems(divGridLayout, bindingContext, b5Var, div != null ? div.c : null, divStatePath);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivGridLayout divGridLayout, BindingContext bindingContext, b5 b5Var, b5 b5Var2) {
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, b5Var.b, b5Var.d, b5Var.A, b5Var.q, b5Var.w, b5Var.v, b5Var.E, b5Var.D, b5Var.c, b5Var.k);
        divGridLayout.addSubscription(b5Var.l.observeAndGet(bindingContext.getExpressionResolver(), new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bind$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                int i;
                DivGridLayout divGridLayout2 = DivGridLayout.this;
                long j2 = j >> 31;
                if (j2 == 0 || j2 == -1) {
                    i = (int) j;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(j, "Unable convert '", "' to Int");
                    }
                    i = j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout2.setColumnCount(i);
            }
        }));
        observeContentAlignment(divGridLayout, b5Var.n, b5Var.o, bindingContext.getExpressionResolver());
    }
}
