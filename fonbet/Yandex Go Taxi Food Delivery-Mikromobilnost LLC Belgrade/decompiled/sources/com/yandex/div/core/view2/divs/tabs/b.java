package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.e;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.f;
import com.yandex.div.core.view2.i;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.aw5;
import defpackage.cpl;
import defpackage.d5x0;
import defpackage.d6w;
import defpackage.dab1;
import defpackage.egk;
import defpackage.f1k;
import defpackage.g9l;
import defpackage.gtk;
import defpackage.h6x0;
import defpackage.hgk;
import defpackage.jkk;
import defpackage.jl40;
import defpackage.kb;
import defpackage.kdl;
import defpackage.ldl;
import defpackage.mdl;
import defpackage.ndl;
import defpackage.ngd0;
import defpackage.ngh0;
import defpackage.odl;
import defpackage.pdl;
import defpackage.qc20;
import defpackage.qdl;
import defpackage.r8;
import defpackage.rvo;
import defpackage.s8o;
import defpackage.sls;
import defpackage.sqk;
import defpackage.tcc;
import defpackage.tls;
import defpackage.udl;
import defpackage.uvo;
import defpackage.v8e;
import defpackage.vt31;
import defpackage.w2k;
import defpackage.w511;
import defpackage.y7l;
import defpackage.yvf0;
import defpackage.z2l;
import defpackage.zmk;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends r8 {
    public static final DivTabs$TabTitleStyle I = new DivTabs$TabTitleStyle(0);
    public final com.yandex.div.core.c A;
    public final gtk B;
    public final i C;
    public final z2l D;
    public final Context E;
    public final com.yandex.div.core.expression.local.a F;
    public final h6x0 G;
    public Long H;
    public final e c;
    public final f w;
    public final yvf0 x;
    public final vt31 y;
    public final qc20 z;

    public b(e eVar, f fVar, yvf0 yvf0Var, vt31 vt31Var, qc20 qc20Var, com.yandex.div.core.c cVar, gtk gtkVar, i iVar, z2l z2lVar, Context context, com.yandex.div.core.expression.local.a aVar, h6x0 h6x0Var) {
        super(4, eVar);
        this.c = eVar;
        this.w = fVar;
        this.x = yvf0Var;
        this.y = vt31Var;
        this.z = qc20Var;
        this.A = cVar;
        this.B = gtkVar;
        this.C = iVar;
        this.D = z2lVar;
        this.E = context;
        this.F = aVar;
        this.G = h6x0Var;
        vt31Var.c("DIV2.TAB_HEADER_VIEW", new d5x0(context), 12);
        vt31Var.c("DIV2.TAB_ITEM_VIEW", new cpl(18, this), 2);
    }

    public static void Ig(TabTitlesLayoutView tabTitlesLayoutView, rvo rvoVar, DivTabs$TabTitleStyle divTabs$TabTitleStyle) {
        BaseIndicatorTabLayout.AnimationType animationType;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        int intValue = ((Number) divTabs$TabTitleStyle.e.a(rvoVar)).intValue();
        int intValue2 = ((Number) divTabs$TabTitleStyle.a.a(rvoVar)).intValue();
        int intValue3 = ((Number) divTabs$TabTitleStyle.r.a(rvoVar)).intValue();
        Expression expression5 = divTabs$TabTitleStyle.n;
        tabTitlesLayoutView.setTabColors(intValue, intValue2, intValue3, expression5 != null ? ((Number) expression5.a(rvoVar)).intValue() : 0);
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        Expression expression6 = divTabs$TabTitleStyle.h;
        jkk jkkVar = divTabs$TabTitleStyle.i;
        float o = expression6 != null ? com.yandex.div.core.view2.divs.a.o((Long) expression6.a(rvoVar), displayMetrics) : jkkVar == null ? -1.0f : 0.0f;
        float o2 = (jkkVar == null || (expression4 = jkkVar.c) == null) ? o : com.yandex.div.core.view2.divs.a.o((Long) expression4.a(rvoVar), displayMetrics);
        float o3 = (jkkVar == null || (expression3 = jkkVar.d) == null) ? o : com.yandex.div.core.view2.divs.a.o((Long) expression3.a(rvoVar), displayMetrics);
        float o4 = (jkkVar == null || (expression2 = jkkVar.a) == null) ? o : com.yandex.div.core.view2.divs.a.o((Long) expression2.a(rvoVar), displayMetrics);
        if (jkkVar != null && (expression = jkkVar.b) != null) {
            o = com.yandex.div.core.view2.divs.a.o((Long) expression.a(rvoVar), displayMetrics);
        }
        tabTitlesLayoutView.setTabIndicatorCornersRadii(new float[]{o2, o2, o3, o3, o, o, o4, o4});
        tabTitlesLayoutView.setTabItemSpacing(com.yandex.div.core.view2.divs.a.o((Long) divTabs$TabTitleStyle.s.a(rvoVar), displayMetrics));
        int i = pdl.a[((DivTabs$TabTitleStyle.AnimationType) divTabs$TabTitleStyle.g.a(rvoVar)).ordinal()];
        if (i == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(((Number) divTabs$TabTitleStyle.f.a(rvoVar)).longValue());
        tabTitlesLayoutView.setTabTitleStyle(divTabs$TabTitleStyle);
    }

    @Override // defpackage.r8
    public final /* bridge */ /* synthetic */ void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
        Jg((DivTabsLayout) view, aw5Var, (mdl) egkVar);
    }

    public final void Hg(TabTitlesLayoutView tabTitlesLayoutView, rvo rvoVar, ldl ldlVar, aw5 aw5Var) {
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        sqk sqkVar = ldlVar.c;
        int F = com.yandex.div.core.view2.divs.a.F(((Number) sqkVar.b.a(rvoVar)).longValue(), (DivSizeUnit) sqkVar.a.a(rvoVar), displayMetrics);
        sqk sqkVar2 = ldlVar.a;
        int F2 = com.yandex.div.core.view2.divs.a.F(((Number) sqkVar2.b.a(rvoVar)).longValue(), (DivSizeUnit) sqkVar2.a.a(rvoVar), displayMetrics);
        aw5Var.a.addLoadReference(this.B.loadImage(((Uri) ldlVar.b.a(rvoVar)).toString(), new qdl(tabTitlesLayoutView, F, F2, aw5Var.a)), tabTitlesLayoutView);
    }

    public final void Jg(final DivTabsLayout divTabsLayout, aw5 aw5Var, final mdl mdlVar) {
        final b bVar;
        final DivTabsLayout divTabsLayout2;
        final aw5 aw5Var2;
        Expression expression;
        Expression expression2;
        Expression expression3;
        jkk jkkVar;
        Expression expression4;
        jkk jkkVar2;
        Expression expression5;
        jkk jkkVar3;
        Expression expression6;
        jkk jkkVar4;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        DivEdgeInsets divEdgeInsets;
        Expression expression13;
        DivEdgeInsets divEdgeInsets2;
        Expression expression14;
        Expression expression15;
        Expression expression16;
        final rvo rvoVar = aw5Var.b;
        divTabsLayout.setClipToPadding(false);
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$applyPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                com.yandex.div.core.view2.divs.a.f(DivTabsLayout.this.getTitleLayout(), mdlVar.E, rvoVar);
                return zy11.a;
            }
        };
        f1k f1kVar = null;
        tlsVar.invoke(null);
        DivEdgeInsets divEdgeInsets3 = mdlVar.E;
        divTabsLayout.addSubscription(divEdgeInsets3.c.c(rvoVar, tlsVar));
        divTabsLayout.addSubscription(divEdgeInsets3.d.c(rvoVar, tlsVar));
        Expression expression17 = divEdgeInsets3.f;
        divTabsLayout.addSubscription(expression17.c(rvoVar, tlsVar));
        Expression expression18 = divEdgeInsets3.a;
        divTabsLayout.addSubscription(expression18.c(rvoVar, tlsVar));
        final TabTitlesLayoutView<?> titleLayout = divTabsLayout.getTitleLayout();
        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                mdl mdlVar2 = mdl.this;
                DivTabs$TabTitleStyle divTabs$TabTitleStyle = mdlVar2.D;
                if (divTabs$TabTitleStyle == null) {
                    divTabs$TabTitleStyle = b.I;
                }
                DivEdgeInsets divEdgeInsets4 = divTabs$TabTitleStyle.v;
                DivEdgeInsets divEdgeInsets5 = mdlVar2.E;
                Expression expression19 = divTabs$TabTitleStyle.u;
                long longValue = ((Number) divEdgeInsets5.a.a(rvoVar)).longValue() + ((Number) divEdgeInsets5.f.a(rvoVar)).longValue() + ((Number) divEdgeInsets4.a.a(rvoVar)).longValue() + ((Number) divEdgeInsets4.f.a(rvoVar)).longValue() + (expression19 != null ? ((Number) expression19.a(rvoVar)).longValue() : (long) (((Number) divTabs$TabTitleStyle.k.a(rvoVar)).floatValue() * 1.3f));
                titleLayout.getLayoutParams().height = com.yandex.div.core.view2.divs.a.D(Long.valueOf(longValue), titleLayout.getResources().getDisplayMetrics());
                return zy11.a;
            }
        };
        tlsVar2.invoke(null);
        uvo n = s8o.n(titleLayout);
        final DivTabs$TabTitleStyle divTabs$TabTitleStyle = mdlVar.D;
        n.addSubscription((divTabs$TabTitleStyle == null || (expression16 = divTabs$TabTitleStyle.u) == null) ? null : expression16.c(rvoVar, tlsVar2));
        n.addSubscription((divTabs$TabTitleStyle == null || (expression15 = divTabs$TabTitleStyle.k) == null) ? null : expression15.c(rvoVar, tlsVar2));
        n.addSubscription((divTabs$TabTitleStyle == null || (divEdgeInsets2 = divTabs$TabTitleStyle.v) == null || (expression14 = divEdgeInsets2.f) == null) ? null : expression14.c(rvoVar, tlsVar2));
        if (divTabs$TabTitleStyle != null && (divEdgeInsets = divTabs$TabTitleStyle.v) != null && (expression13 = divEdgeInsets.a) != null) {
            f1kVar = expression13.c(rvoVar, tlsVar2);
        }
        n.addSubscription(f1kVar);
        n.addSubscription(expression17.c(rvoVar, tlsVar2));
        n.addSubscription(expression18.c(rvoVar, tlsVar2));
        Ig(divTabsLayout.getTitleLayout(), rvoVar, divTabs$TabTitleStyle == null ? I : divTabs$TabTitleStyle);
        tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                b bVar2 = b.this;
                TabTitlesLayoutView<?> titleLayout2 = divTabsLayout.getTitleLayout();
                rvo rvoVar2 = rvoVar;
                DivTabs$TabTitleStyle divTabs$TabTitleStyle2 = divTabs$TabTitleStyle;
                if (divTabs$TabTitleStyle2 == null) {
                    divTabs$TabTitleStyle2 = b.I;
                }
                bVar2.getClass();
                b.Ig(titleLayout2, rvoVar2, divTabs$TabTitleStyle2);
                return zy11.a;
            }
        };
        if (divTabs$TabTitleStyle != null && (expression12 = divTabs$TabTitleStyle.e) != null) {
            expression12.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression11 = divTabs$TabTitleStyle.a) != null) {
            expression11.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression10 = divTabs$TabTitleStyle.r) != null) {
            expression10.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression9 = divTabs$TabTitleStyle.n) != null) {
            expression9.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression8 = divTabs$TabTitleStyle.h) != null) {
            expression8.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (jkkVar4 = divTabs$TabTitleStyle.i) != null && (expression7 = jkkVar4.c) != null) {
            expression7.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (jkkVar3 = divTabs$TabTitleStyle.i) != null && (expression6 = jkkVar3.d) != null) {
            expression6.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (jkkVar2 = divTabs$TabTitleStyle.i) != null && (expression5 = jkkVar2.b) != null) {
            expression5.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (jkkVar = divTabs$TabTitleStyle.i) != null && (expression4 = jkkVar.a) != null) {
            expression4.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression3 = divTabs$TabTitleStyle.s) != null) {
            expression3.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression2 = divTabs$TabTitleStyle.g) != null) {
            expression2.c(rvoVar, tlsVar3);
        }
        if (divTabs$TabTitleStyle != null && (expression = divTabs$TabTitleStyle.f) != null) {
            expression.c(rvoVar, tlsVar3);
        }
        final ldl ldlVar = mdlVar.C;
        if (ldlVar == null) {
            bVar = this;
            divTabsLayout2 = divTabsLayout;
            aw5Var2 = aw5Var;
        } else {
            sqk sqkVar = ldlVar.a;
            sqk sqkVar2 = ldlVar.c;
            Hg(divTabsLayout.getTitleLayout(), rvoVar, ldlVar, aw5Var);
            bVar = this;
            divTabsLayout2 = divTabsLayout;
            aw5Var2 = aw5Var;
            tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeDividerStyle$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    b.this.Hg(divTabsLayout2.getTitleLayout(), rvoVar, ldlVar, aw5Var2);
                    return zy11.a;
                }
            };
            sqkVar2.b.c(rvoVar, tlsVar4);
            sqkVar2.a.c(rvoVar, tlsVar4);
            sqkVar.b.c(rvoVar, tlsVar4);
            sqkVar.a.c(rvoVar, tlsVar4);
            ldlVar.b.c(rvoVar, tlsVar4);
        }
        divTabsLayout2.getPagerLayout().setClipToPadding(false);
        c.a(mdlVar.A, rvoVar, divTabsLayout2, new DivTabsBinder$bind$1(divTabsLayout2, mdlVar, rvoVar));
        divTabsLayout2.addSubscription(mdlVar.z.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivTabsLayout.this.getDivider().setBackgroundColor(((Number) obj).intValue());
                return zy11.a;
            }
        }));
        divTabsLayout2.addSubscription(mdlVar.n.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$3
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivTabsLayout.this.getDivider().setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return zy11.a;
            }
        }));
        divTabsLayout2.getTitleLayout().setOnScrollChangedListener(new v8e(bVar, aw5Var2));
        divTabsLayout2.getTitleLayout().setFocusTracker(aw5Var2.a.getInputFocusTracker());
        divTabsLayout2.addSubscription(mdlVar.u.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$5
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivTabsLayout.this.getViewPager().setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? dab1.K : null);
                return zy11.a;
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Kg(final aw5 aw5Var, final DivTabsLayout divTabsLayout, w2k w2kVar, final com.yandex.div.core.state.b bVar) {
        zy11 zy11Var;
        boolean z;
        long longValue;
        Long l;
        w2k a;
        Div2View div2View = aw5Var.a;
        rvo rvoVar = aw5Var.b;
        w2k div = divTabsLayout.getDiv();
        if (div == w2kVar) {
            a divTabsAdapter = divTabsLayout.getDivTabsAdapter();
            if (divTabsAdapter != null && (a = divTabsAdapter.a(rvoVar, w2kVar, div2View)) != null) {
                divTabsLayout.setDiv(a);
                return;
            }
        } else {
            this.c.d(aw5Var, divTabsLayout, w2kVar, div);
            Jg(divTabsLayout, aw5Var, w2kVar.c);
        }
        mdl mdlVar = div != null ? div.c : null;
        final mdl mdlVar2 = w2kVar.c;
        List list = mdlVar2.q;
        final hgk hgkVar = (hgk) this.x.get();
        Expression expression = mdlVar2.y;
        Expression expression2 = mdlVar2.j;
        List list2 = list;
        final ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new g9l((kdl) it.next(), divTabsLayout.getResources().getDisplayMetrics(), rvoVar));
        }
        a divTabsAdapter2 = divTabsLayout.getDivTabsAdapter();
        if (divTabsAdapter2 != null) {
            if (divTabsAdapter2.e() != ((Boolean) expression2.a(rvoVar)).booleanValue()) {
                divTabsAdapter2 = null;
            }
            if (divTabsAdapter2 != null) {
                divTabsAdapter2.g(aw5Var);
                divTabsAdapter2.j(bVar);
                divTabsAdapter2.d().b(mdlVar2);
                divTabsAdapter2.b().a(mdlVar2);
                if (mdlVar == mdlVar2) {
                    divTabsAdapter2.f();
                } else {
                    divTabsAdapter2.h(new v8e(20, arrayList));
                }
                zy11Var = zy11.a;
                if (zy11Var == null) {
                    Lg(divTabsLayout, aw5Var, mdlVar2, hgkVar, bVar, arrayList, null);
                }
                c.b(list, rvoVar, divTabsLayout, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                        if (divTabsAdapter3 != null) {
                            divTabsAdapter3.f();
                        }
                        return zy11.a;
                    }
                });
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        long longValue2 = ((Number) obj).longValue();
                        b.this.H = Long.valueOf(longValue2);
                        a divTabsAdapter3 = divTabsLayout.getDivTabsAdapter();
                        if (divTabsAdapter3 != null) {
                            long j = longValue2 >> 31;
                            divTabsAdapter3.i((j == 0 || j == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        }
                        return zy11.a;
                    }
                };
                divTabsLayout.addSubscription(expression2.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                        if (divTabsAdapter3 == null || divTabsAdapter3.p != booleanValue) {
                            b bVar2 = this;
                            DivTabsLayout divTabsLayout2 = DivTabsLayout.this;
                            aw5 aw5Var2 = aw5Var;
                            mdl mdlVar3 = mdlVar2;
                            hgk hgkVar2 = hgkVar;
                            com.yandex.div.core.state.b bVar3 = bVar;
                            List<g9l> list3 = arrayList;
                            a divTabsAdapter4 = divTabsLayout2.getDivTabsAdapter();
                            bVar2.Lg(divTabsLayout2, aw5Var2, mdlVar3, hgkVar2, bVar3, list3, divTabsAdapter4 != null ? Integer.valueOf(divTabsAdapter4.d.getCurrentItem()) : null);
                        }
                        return zy11.a;
                    }
                }));
                divTabsLayout.addSubscription(expression.c(rvoVar, tlsVar));
                z = !jl40.l(div2View.getPrevDataTag(), zmk.b) || jl40.l(div2View.getDataTag(), div2View.getPrevDataTag());
                longValue = ((Number) expression.a(rvoVar)).longValue();
                if (z || (l = this.H) == null || l.longValue() != longValue) {
                    tlsVar.invoke(Long.valueOf(longValue));
                }
                divTabsLayout.addSubscription(mdlVar2.B.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                        if (divTabsAdapter3 != null) {
                            b bVar2 = this;
                            int size = mdlVar2.q.size() - 1;
                            bVar2.getClass();
                            divTabsAdapter3.d.setDisabledScrollPages(booleanValue ? new LinkedHashSet<>() : kotlin.collections.a.M0(new d6w(0, size, 1)));
                        }
                        return zy11.a;
                    }
                }));
            }
        }
        zy11Var = null;
        if (zy11Var == null) {
        }
        c.b(list, rvoVar, divTabsLayout, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter3 != null) {
                    divTabsAdapter3.f();
                }
                return zy11.a;
            }
        });
        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long longValue2 = ((Number) obj).longValue();
                b.this.H = Long.valueOf(longValue2);
                a divTabsAdapter3 = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter3 != null) {
                    long j = longValue2 >> 31;
                    divTabsAdapter3.i((j == 0 || j == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
                return zy11.a;
            }
        };
        divTabsLayout.addSubscription(expression2.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter3 == null || divTabsAdapter3.p != booleanValue) {
                    b bVar2 = this;
                    DivTabsLayout divTabsLayout2 = DivTabsLayout.this;
                    aw5 aw5Var2 = aw5Var;
                    mdl mdlVar3 = mdlVar2;
                    hgk hgkVar2 = hgkVar;
                    com.yandex.div.core.state.b bVar3 = bVar;
                    List<g9l> list3 = arrayList;
                    a divTabsAdapter4 = divTabsLayout2.getDivTabsAdapter();
                    bVar2.Lg(divTabsLayout2, aw5Var2, mdlVar3, hgkVar2, bVar3, list3, divTabsAdapter4 != null ? Integer.valueOf(divTabsAdapter4.d.getCurrentItem()) : null);
                }
                return zy11.a;
            }
        }));
        divTabsLayout.addSubscription(expression.c(rvoVar, tlsVar2));
        if (jl40.l(div2View.getPrevDataTag(), zmk.b)) {
        }
        longValue = ((Number) expression.a(rvoVar)).longValue();
        if (z) {
        }
        tlsVar2.invoke(Long.valueOf(longValue));
        divTabsLayout.addSubscription(mdlVar2.B.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a divTabsAdapter3 = DivTabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter3 != null) {
                    b bVar2 = this;
                    int size = mdlVar2.q.size() - 1;
                    bVar2.getClass();
                    divTabsAdapter3.d.setDisabledScrollPages(booleanValue ? new LinkedHashSet<>() : kotlin.collections.a.M0(new d6w(0, size, 1)));
                }
                return zy11.a;
            }
        }));
    }

    public final void Lg(DivTabsLayout divTabsLayout, aw5 aw5Var, mdl mdlVar, hgk hgkVar, com.yandex.div.core.state.b bVar, List list, Integer num) {
        int i;
        final udl udlVar = new udl(aw5Var, this.A, this.C, divTabsLayout, mdlVar);
        boolean booleanValue = ((Boolean) mdlVar.j.a(aw5Var.b)).booleanValue();
        y7l y7lVar = booleanValue ? new y7l(14) : new y7l(15);
        int currentItem = divTabsLayout.getViewPager().getCurrentItem();
        final int currentItem2 = divTabsLayout.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$setupNewAdapter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    udl.this.a(currentItem2);
                    return zy11.a;
                }
            });
        }
        a aVar = new a(this.y, divTabsLayout, new kb(ngh0.base_tabbed_title_container_scroller, ngh0.div_tabs_pager_container, ngh0.div_tabs_container_helper), y7lVar, booleanValue, aw5Var, this.z, this.w, hgkVar, udlVar, new ndl(aw5Var, bVar, this.G, this.F, mdlVar), bVar, this.D);
        aVar.h(new odl(list));
        if (num != null) {
            i = num.intValue();
        } else {
            long longValue = ((Number) mdlVar.y.a(aw5Var.b)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        aVar.i(i);
        divTabsLayout.setDivTabsAdapter(aVar);
    }
}
