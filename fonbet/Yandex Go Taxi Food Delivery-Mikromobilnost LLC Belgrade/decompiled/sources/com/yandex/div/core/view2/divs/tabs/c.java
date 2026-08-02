package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.h9l;
import defpackage.kdl;
import defpackage.rdl;
import defpackage.rvo;
import defpackage.sqk;
import defpackage.tls;
import defpackage.uvo;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(DivEdgeInsets divEdgeInsets, rvo rvoVar, DivTabsLayout divTabsLayout, tls tlsVar) {
        divTabsLayout.addSubscription(divEdgeInsets.c.c(rvoVar, tlsVar));
        divTabsLayout.addSubscription(divEdgeInsets.d.c(rvoVar, tlsVar));
        divTabsLayout.addSubscription(divEdgeInsets.f.c(rvoVar, tlsVar));
        divTabsLayout.addSubscription(divEdgeInsets.a.c(rvoVar, tlsVar));
        ((DivTabsBinder$bind$1) tlsVar).invoke(null);
    }

    public static final void b(List list, rvo rvoVar, DivTabsLayout divTabsLayout, tls tlsVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DivSize height = ((kdl) it.next()).a.d().getHeight();
            if (height instanceof h9l) {
                sqk sqkVar = ((h9l) height).b;
                divTabsLayout.addSubscription(sqkVar.a.c(rvoVar, tlsVar));
                divTabsLayout.addSubscription(sqkVar.b.c(rvoVar, tlsVar));
            }
        }
    }

    public static final DivTypefaceType c(DivFontWeight divFontWeight) {
        int i = rdl.a[divFontWeight.ordinal()];
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
        w511.b();
        return null;
    }

    public static final void d(final TabView tabView, final DivTabs$TabTitleStyle divTabs$TabTitleStyle, final rvo rvoVar, uvo uvoVar) {
        Expression expression = divTabs$TabTitleStyle.k;
        Expression expression2 = divTabs$TabTitleStyle.m;
        com.yandex.div.core.view2.divs.a.y(tabView, expression, divTabs$TabTitleStyle.l, null, null, rvoVar, uvoVar);
        com.yandex.div.core.view2.divs.a.z(tabView, divTabs$TabTitleStyle.t, divTabs$TabTitleStyle.k, null, null, rvoVar, uvoVar);
        com.yandex.div.core.view2.divs.a.A(tabView, divTabs$TabTitleStyle.u, divTabs$TabTitleStyle.l, null, null, rvoVar, uvoVar);
        final DivEdgeInsets divEdgeInsets = divTabs$TabTitleStyle.v;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivEdgeInsets divEdgeInsets2 = DivEdgeInsets.this;
                Expression expression3 = divEdgeInsets2.e;
                if (expression3 == null && divEdgeInsets2.b == null) {
                    tabView.setTabPadding(com.yandex.div.core.view2.divs.a.o((Long) divEdgeInsets2.c.a(rvoVar), displayMetrics), com.yandex.div.core.view2.divs.a.o((Long) DivEdgeInsets.this.f.a(rvoVar), displayMetrics), com.yandex.div.core.view2.divs.a.o((Long) DivEdgeInsets.this.d.a(rvoVar), displayMetrics), com.yandex.div.core.view2.divs.a.o((Long) DivEdgeInsets.this.a.a(rvoVar), displayMetrics));
                } else {
                    TabView tabView2 = tabView;
                    int o = com.yandex.div.core.view2.divs.a.o(expression3 != null ? (Long) expression3.a(rvoVar) : null, displayMetrics);
                    int o2 = com.yandex.div.core.view2.divs.a.o((Long) DivEdgeInsets.this.f.a(rvoVar), displayMetrics);
                    Expression expression4 = DivEdgeInsets.this.b;
                    tabView2.setTabPadding(o, o2, com.yandex.div.core.view2.divs.a.o(expression4 != null ? (Long) expression4.a(rvoVar) : null, displayMetrics), com.yandex.div.core.view2.divs.a.o((Long) DivEdgeInsets.this.a.a(rvoVar), displayMetrics));
                }
                return zy11.a;
            }
        };
        Expression expression3 = divEdgeInsets.f;
        Expression expression4 = divEdgeInsets.b;
        uvoVar.addSubscription(expression3.c(rvoVar, tlsVar));
        uvoVar.addSubscription(divEdgeInsets.a.c(rvoVar, tlsVar));
        Expression expression5 = divEdgeInsets.e;
        if (expression5 == null && expression4 == null) {
            uvoVar.addSubscription(divEdgeInsets.c.c(rvoVar, tlsVar));
            uvoVar.addSubscription(divEdgeInsets.d.c(rvoVar, tlsVar));
        } else {
            uvoVar.addSubscription(expression5 != null ? expression5.c(rvoVar, tlsVar) : null);
            uvoVar.addSubscription(expression4 != null ? expression4.c(rvoVar, tlsVar) : null);
        }
        tlsVar.invoke(null);
        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyInactiveFontWeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivTabs$TabTitleStyle divTabs$TabTitleStyle2 = DivTabs$TabTitleStyle.this;
                Expression expression6 = divTabs$TabTitleStyle2.p;
                if (expression6 == null) {
                    expression6 = divTabs$TabTitleStyle2.m;
                }
                Expression expression7 = divTabs$TabTitleStyle2.q;
                Integer num = null;
                Long l = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                tabView.setInactiveTypefaceType(c.c((DivFontWeight) expression6.a(rvoVar)));
                TabView tabView2 = tabView;
                if (l != null) {
                    long longValue = l.longValue();
                    long j = longValue >> 31;
                    num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
                tabView2.setInactiveTypefaceWeight(num);
                return zy11.a;
            }
        };
        Expression expression6 = divTabs$TabTitleStyle.p;
        if (expression6 == null) {
            expression6 = expression2;
        }
        uvoVar.addSubscription(expression6.c(rvoVar, tlsVar2));
        Expression expression7 = divTabs$TabTitleStyle.q;
        if (expression7 != null) {
            uvoVar.addSubscription(expression7.c(rvoVar, tlsVar2));
        }
        tlsVar2.invoke(null);
        tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyActiveFontWeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivTabs$TabTitleStyle divTabs$TabTitleStyle2 = DivTabs$TabTitleStyle.this;
                Expression expression8 = divTabs$TabTitleStyle2.c;
                if (expression8 == null) {
                    expression8 = divTabs$TabTitleStyle2.m;
                }
                Expression expression9 = divTabs$TabTitleStyle2.d;
                Integer num = null;
                Long l = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                tabView.setActiveTypefaceType(c.c((DivFontWeight) expression8.a(rvoVar)));
                TabView tabView2 = tabView;
                if (l != null) {
                    long longValue = l.longValue();
                    long j = longValue >> 31;
                    num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
                tabView2.setActiveTypefaceWeight(num);
                return zy11.a;
            }
        };
        Expression expression8 = divTabs$TabTitleStyle.c;
        if (expression8 != null) {
            expression2 = expression8;
        }
        uvoVar.addSubscription(expression2.c(rvoVar, tlsVar3));
        Expression expression9 = divTabs$TabTitleStyle.d;
        if (expression9 != null) {
            uvoVar.addSubscription(expression9.c(rvoVar, tlsVar3));
        }
        tlsVar3.invoke(null);
    }
}
