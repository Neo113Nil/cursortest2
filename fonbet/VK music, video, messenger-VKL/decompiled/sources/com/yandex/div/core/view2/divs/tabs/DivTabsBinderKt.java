package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivTabs;
import com.yandex.div2.v9;
import com.yandex.div2.y3;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes7.dex */
public final class DivTabsBinderKt {

    /* compiled from: DivTabsBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe(y3 y3Var, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, izs<Object, s3q0> izsVar) {
        expressionSubscriber.addSubscription(y3Var.c.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var.d.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var.f.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var.a.observe(expressionResolver, izsVar));
        izsVar.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFixedHeightChange(List<DivTabs.a> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, izs<Object, s3q0> izsVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v9 height = ((DivTabs.a) it.next()).a.b().getHeight();
            if (height instanceof v9.a) {
                v9.a aVar = (v9.a) height;
                expressionSubscriber.addSubscription(aVar.b.a.observe(expressionResolver, izsVar));
                expressionSubscriber.addSubscription(aVar.b.b.observe(expressionResolver, izsVar));
            }
        }
    }

    public static final void observeStyle(final TabView tabView, DivTabs.TabTitleStyle tabTitleStyle, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<Long> expression = tabTitleStyle.j;
        Expression<DivFontWeight> expression2 = tabTitleStyle.l;
        TextViewExtensionsKt.observeFontSize(tabView, expression, tabTitleStyle.k, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLetterSpacing(tabView, tabTitleStyle.r, tabTitleStyle.j, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLineHeight(tabView, tabTitleStyle.s, tabTitleStyle.k, null, null, expressionResolver, expressionSubscriber);
        final y3 y3Var = tabTitleStyle.t;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
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
                y3 y3Var2 = y3.this;
                Expression<Long> expression3 = y3Var2.e;
                if (expression3 == null && y3Var2.b == null) {
                    tabView.setTabPadding(BaseDivViewExtensionsKt.dpToPx(y3Var2.c.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(y3.this.f.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(y3.this.d.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(y3.this.a.evaluate(expressionResolver), displayMetrics));
                    return;
                }
                TabView tabView2 = tabView;
                int dpToPx = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics);
                int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(y3.this.f.evaluate(expressionResolver), displayMetrics);
                Expression<Long> expression4 = y3.this.b;
                tabView2.setTabPadding(dpToPx, dpToPx2, BaseDivViewExtensionsKt.dpToPx(expression4 != null ? expression4.evaluate(expressionResolver) : null, displayMetrics), BaseDivViewExtensionsKt.dpToPx(y3.this.a.evaluate(expressionResolver), displayMetrics));
            }
        };
        Expression<Long> expression3 = y3Var.f;
        Expression<Long> expression4 = y3Var.b;
        expressionSubscriber.addSubscription(expression3.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(y3Var.a.observe(expressionResolver, izsVar));
        Expression<Long> expression5 = y3Var.e;
        if (expression5 == null && expression4 == null) {
            expressionSubscriber.addSubscription(y3Var.c.observe(expressionResolver, izsVar));
            expressionSubscriber.addSubscription(y3Var.d.observe(expressionResolver, izsVar));
        } else {
            expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, izsVar) : null);
            expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, izsVar) : null);
        }
        izsVar.invoke(null);
        Expression<DivFontWeight> expression6 = tabTitleStyle.o;
        if (expression6 == null) {
            expression6 = expression2;
        }
        observeStyle$addToSubscriber(expression6, expressionSubscriber, expressionResolver, new izs<DivFontWeight, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivFontWeight divFontWeight) {
                invoke2(divFontWeight);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivFontWeight divFontWeight) {
                DivTypefaceType typefaceType;
                TabView tabView2 = TabView.this;
                typefaceType = DivTabsBinderKt.toTypefaceType(divFontWeight);
                tabView2.setInactiveTypefaceType(typefaceType);
            }
        });
        Expression<DivFontWeight> expression7 = tabTitleStyle.c;
        if (expression7 != null) {
            expression2 = expression7;
        }
        observeStyle$addToSubscriber(expression2, expressionSubscriber, expressionResolver, new izs<DivFontWeight, s3q0>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivFontWeight divFontWeight) {
                invoke2(divFontWeight);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivFontWeight divFontWeight) {
                DivTypefaceType typefaceType;
                TabView tabView2 = TabView.this;
                typefaceType = DivTabsBinderKt.toTypefaceType(divFontWeight);
                tabView2.setActiveTypefaceType(typefaceType);
            }
        });
    }

    private static final void observeStyle$addToSubscriber(Expression<DivFontWeight> expression, ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, izs<? super DivFontWeight, s3q0> izsVar) {
        expressionSubscriber.addSubscription(expression.observeAndGet(expressionResolver, izsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTypefaceType toTypefaceType(DivFontWeight divFontWeight) {
        int i = WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (i == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (i == 3) {
            return DivTypefaceType.LIGHT;
        }
        if (i == 4) {
            return DivTypefaceType.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTabsAdapter tryReuse(DivTabsAdapter divTabsAdapter, DivTabs divTabs, ExpressionResolver expressionResolver) {
        if (divTabsAdapter != null && divTabsAdapter.isDynamicHeight() == divTabs.j.evaluate(expressionResolver).booleanValue()) {
            return divTabsAdapter;
        }
        return null;
    }
}
