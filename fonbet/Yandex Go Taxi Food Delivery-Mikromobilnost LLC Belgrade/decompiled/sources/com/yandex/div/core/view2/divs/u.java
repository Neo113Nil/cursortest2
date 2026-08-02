package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import defpackage.aw5;
import defpackage.cbl;
import defpackage.cxk;
import defpackage.dbl;
import defpackage.egk;
import defpackage.ekl;
import defpackage.f3l;
import defpackage.ffx;
import defpackage.fg90;
import defpackage.fkl;
import defpackage.fu11;
import defpackage.gkl;
import defpackage.gy01;
import defpackage.hgk;
import defpackage.i2k;
import defpackage.ibl;
import defpackage.il11;
import defpackage.j73;
import defpackage.jkl;
import defpackage.jl40;
import defpackage.jll;
import defpackage.l6o;
import defpackage.lx80;
import defpackage.m3k;
import defpackage.m6o;
import defpackage.msk;
import defpackage.n2k0;
import defpackage.ngd0;
import defpackage.nkl;
import defpackage.ny61;
import defpackage.o400;
import defpackage.obl;
import defpackage.oo2;
import defpackage.oyr;
import defpackage.pdk;
import defpackage.qjk;
import defpackage.qkl;
import defpackage.qrq0;
import defpackage.r8;
import defpackage.rvo;
import defpackage.rzo;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.u2k;
import defpackage.uml;
import defpackage.uyj;
import defpackage.wfx;
import defpackage.xi91;
import defpackage.yvf0;
import defpackage.z2k;
import defpackage.z2l;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class u extends r8 {
    public final f3l A;
    public final z2l B;
    public final com.yandex.div.core.view2.i C;
    public final m6o D;
    public final il11 E;
    public final com.yandex.div.core.expression.local.a F;
    public final e c;
    public final com.yandex.div.core.view2.f w;
    public final yvf0 x;
    public final ibl y;
    public final com.yandex.div.core.c z;

    public u(e eVar, com.yandex.div.core.view2.f fVar, yvf0 yvf0Var, ibl iblVar, com.yandex.div.core.c cVar, f3l f3lVar, z2l z2lVar, com.yandex.div.core.view2.i iVar, m6o m6oVar, il11 il11Var, com.yandex.div.core.expression.local.a aVar) {
        super(4, eVar);
        this.c = eVar;
        this.w = fVar;
        this.x = yvf0Var;
        this.y = iblVar;
        this.z = cVar;
        this.A = f3lVar;
        this.B = z2lVar;
        this.C = iVar;
        this.D = m6oVar;
        this.E = il11Var;
        this.F = aVar;
    }

    public static Pair Ig(ViewGroup viewGroup, List list, qrq0 qrq0Var, boolean z, boolean z2) {
        msk s;
        m3k div;
        String id;
        rvo rvoVar;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            return new Pair(viewGroup, qrq0Var);
        }
        boolean z3 = true;
        boolean z4 = z || !((i2 = layoutParams.width) == -2 || i2 == -3);
        if (!z2 && ((i = layoutParams.height) == -2 || i == -3)) {
            z3 = false;
        }
        if ((!z4 || !z3) && (s = a.s(viewGroup)) != null && (div = s.getDiv()) != null && (id = div.d().getId()) != null) {
            aw5 bindingContext = s.getBindingContext();
            if (bindingContext == null || (rvoVar = bindingContext.b) == null) {
                return new Pair(viewGroup, qrq0Var);
            }
            qrq0 v = j73.v(new gy01[]{new gy01(id, list, rvoVar)});
            if (qrq0Var != null) {
                v = kotlin.sequences.b.p(v, qrq0Var);
            }
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            return viewGroup2 == null ? new Pair(viewGroup, v) : Ig(viewGroup2, list, v, z4, z3);
        }
        return new Pair(viewGroup, qrq0Var);
    }

    public static TransitionSet Jg(cbl cblVar, cbl cblVar2, View view, View view2, rvo rvoVar, rvo rvoVar2) {
        List<pdk> list;
        pdk pdkVar = cblVar.a;
        pdk pdkVar2 = cblVar2.b;
        if (pdkVar == null && pdkVar2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        List<pdk> list2 = EmptyList.a;
        if (pdkVar != null && view != null) {
            if (pdkVar.e.a(rvoVar) != DivAnimation$Name.SET) {
                list = Collections.singletonList(pdkVar);
            } else {
                list = pdkVar.d;
                if (list == null) {
                    list = list2;
                }
            }
            for (pdk pdkVar3 : list) {
                lx80 b = xi91.b(pdkVar3, true, rvoVar);
                if (b != null) {
                    b.y.add(view);
                    b.c = ((Number) pdkVar3.a.a(rvoVar)).longValue();
                    b.b = ((Number) pdkVar3.g.a(rvoVar)).longValue();
                    b.w = uml.e((DivAnimationInterpolator) pdkVar3.c.a(rvoVar));
                    transitionSet.Z(b);
                }
            }
        }
        if (pdkVar2 != null && rvoVar2 != null) {
            if (pdkVar2.e.a(rvoVar2) != DivAnimation$Name.SET) {
                list2 = Collections.singletonList(pdkVar2);
            } else {
                List list3 = pdkVar2.d;
                if (list3 != null) {
                    list2 = list3;
                }
            }
            for (pdk pdkVar4 : list2) {
                lx80 b2 = xi91.b(pdkVar4, false, rvoVar2);
                if (b2 != null) {
                    b2.y.add(view2);
                    b2.c = ((Number) pdkVar4.a.a(rvoVar2)).longValue();
                    b2.b = ((Number) pdkVar4.g.a(rvoVar2)).longValue();
                    b2.w = uml.e((DivAnimationInterpolator) pdkVar4.c.a(rvoVar2));
                    transitionSet.Z(b2);
                }
            }
        }
        if (view2 != null) {
            ffx.u(view2);
        }
        return transitionSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x02fa, code lost:
    
        if (defpackage.uml.a(r8, r3) == r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        if (defpackage.jl40.l(r5, r0 != null ? r0.f : null) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0273, code lost:
    
        if (r8 == null) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hg(aw5 aw5Var, DivStateLayout divStateLayout, u2k u2kVar, com.yandex.div.core.state.b bVar) {
        Object obj;
        Object obj2;
        u2k u2kVar2;
        cbl cblVar;
        String str;
        m3k m3kVar;
        m3k m3kVar2;
        m3k m3kVar3;
        rvo rvoVar;
        Div2View div2View;
        dbl dblVar;
        DivStateLayout divStateLayout2;
        cbl cblVar2;
        aw5 aw5Var2;
        egk egkVar;
        dbl dblVar2;
        View view;
        final rvo rvoVar2;
        yvf0 yvf0Var;
        cbl cblVar3;
        cbl cblVar4;
        final Div2View div2View2;
        rvo rvoVar3;
        m3k m3kVar4;
        com.yandex.div.core.state.b bVar2;
        final View view2;
        boolean z;
        boolean z2;
        u uVar;
        dbl dblVar3;
        com.yandex.div.core.state.b bVar3;
        final u uVar2;
        egk d;
        String id;
        ArrayList arrayList;
        View view3;
        m3k m3kVar5;
        View view4;
        Object obj3;
        Pair pair;
        boolean z3;
        m3k m3kVar6;
        rvo rvoVar4;
        cbl cblVar5;
        cbl cblVar6;
        View view5;
        m3k m3kVar7;
        View view6;
        TransitionSet transitionSet;
        rvo rvoVar5;
        obl oblVar;
        cbl cblVar7;
        qrq0 qrq0Var;
        cbl cblVar8;
        m3k m3kVar8;
        qrq0 qrq0Var2;
        rvo rvoVar6;
        jll jllVar;
        egk d2;
        DivChangeTransition k;
        View view7;
        n2k0 currentRebindReusableList$div_release;
        DivAlignmentHorizontal k2;
        DivAlignmentVertical l;
        dbl dblVar4;
        final u uVar3 = this;
        final com.yandex.div.core.state.b bVar4 = bVar;
        final Div2View div2View3 = aw5Var.a;
        dbl dblVar5 = u2kVar.c;
        u2k div = divStateLayout.getDiv();
        aw5 bindingContext = divStateLayout.getBindingContext();
        rvo rvoVar7 = bindingContext != null ? bindingContext.b : null;
        rvo rvoVar8 = aw5Var.b;
        sls slsVar = new sls() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                l6o a = u.this.D.a(div2View3.get_divData(), div2View3.getDataTag());
                String b = bVar4.b();
                ParsingException parsingException = fg90.a;
                a.e(new ParsingException(ParsingExceptionReason.MISSING_VALUE, oyr.p("Value for key 'id' at path '", b, "' is missing"), null, null, null, 28));
                return zy11.a;
            }
        };
        String str2 = dblVar5.p;
        List list = dblVar5.I;
        if (str2 == null && (str2 = dblVar5.x) == null) {
            slsVar.invoke();
            str2 = "";
        }
        String str3 = str2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (jl40.l(((cbl) obj).d, divStateLayout.getStateId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        cbl cblVar9 = (cbl) obj;
        if (cblVar9 == null) {
            cblVar9 = uml.f(dblVar5, rvoVar8);
        }
        cbl cblVar10 = cblVar9;
        String b = uVar3.y.b(dblVar5, div2View3, rvoVar8, bVar4.e() + '/' + str3);
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (jl40.l(((cbl) obj2).d, b)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        cbl cblVar11 = (cbl) obj2;
        if (cblVar11 == null) {
            cblVar11 = uml.f(dblVar5, rvoVar8);
        }
        cbl cblVar12 = cblVar11;
        if (cblVar10 != null) {
            m3k m3kVar9 = cblVar10.c;
            if (cblVar12 == null) {
                return;
            }
            m3k m3kVar10 = cblVar12.c;
            m3k activeStateDiv = divStateLayout.getActiveStateDiv();
            if (div != u2kVar) {
                uVar3.c.d(aw5Var, divStateLayout, u2kVar, activeStateDiv);
                dbl dblVar6 = div != null ? div.c : null;
                cblVar = cblVar10;
                str = str3;
                m3kVar = m3kVar9;
                m3kVar2 = m3kVar10;
                m3kVar3 = activeStateDiv;
                u2kVar2 = div;
                rvoVar = rvoVar7;
                div2View = div2View3;
                cblVar2 = cblVar12;
                a.c(divStateLayout, aw5Var, dblVar5.b, dblVar5.d, dblVar5.z, dblVar5.q, dblVar5.w, dblVar5.v, dblVar5.D, dblVar5.C, dblVar5.c, dblVar5.k);
                final DivStateLayout divStateLayout3 = divStateLayout;
                final aw5 aw5Var3 = aw5Var;
                final rvo rvoVar9 = aw5Var3.b;
                Expression expression = dblVar5.e;
                Expression expression2 = dblVar5.f;
                if (jl40.l(expression, dblVar6 != null ? dblVar6.e : null)) {
                }
                if (expression == null || (k2 = (DivAlignmentHorizontal) expression.a(rvoVar9)) == null) {
                    ViewParent parent = divStateLayout3.getParent();
                    msk mskVar = parent instanceof msk ? (msk) parent : null;
                    m3k div2 = mskVar != null ? mskVar.getDiv() : null;
                    i2k i2kVar = div2 instanceof i2k ? (i2k) div2 : null;
                    DivContentAlignmentHorizontal divContentAlignmentHorizontal = i2kVar == null ? null : (DivContentAlignmentHorizontal) i2kVar.c.o.a(rvoVar9);
                    k2 = divContentAlignmentHorizontal != null ? uml.k(divContentAlignmentHorizontal) : null;
                }
                if (expression2 == null || (l = (DivAlignmentVertical) expression2.a(rvoVar9)) == null) {
                    ViewParent parent2 = divStateLayout3.getParent();
                    msk mskVar2 = parent2 instanceof msk ? (msk) parent2 : null;
                    m3k div3 = mskVar2 != null ? mskVar2.getDiv() : null;
                    i2k i2kVar2 = div3 instanceof i2k ? (i2k) div3 : null;
                    DivContentAlignmentVertical divContentAlignmentVertical = i2kVar2 == null ? null : (DivContentAlignmentVertical) i2kVar2.c.p.a(rvoVar9);
                    l = divContentAlignmentVertical != null ? uml.l(divContentAlignmentVertical) : null;
                }
                a.a(divStateLayout3, k2, l);
                String str4 = dblVar5.H;
                if (str4 == null) {
                    dblVar4 = dblVar6;
                    dblVar = dblVar5;
                    bVar4 = bVar;
                } else {
                    dblVar4 = dblVar6;
                    oo2 oo2Var = new oo2(divStateLayout3, dblVar5, bVar, aw5Var3, uVar3);
                    dblVar = dblVar5;
                    bVar4 = bVar;
                    aw5Var3 = aw5Var3;
                    divStateLayout3 = divStateLayout3;
                    uVar3 = uVar3;
                    divStateLayout3.addSubscription(uVar3.E.a(aw5Var3, str4, oo2Var));
                }
                a.j(divStateLayout3, dblVar.l, dblVar4 != null ? dblVar4.l : null, rvoVar9);
                final List list3 = cblVar2.e;
                sls slsVar2 = list3 != null ? new sls() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        u.this.z.e(aw5Var3.a, rvoVar9, divStateLayout3, list3);
                        return zy11.a;
                    }
                } : null;
                aw5Var2 = aw5Var3;
                divStateLayout2 = divStateLayout3;
                divStateLayout2.setSwipeOutCallback(slsVar2);
            } else {
                u2kVar2 = div;
                cblVar = cblVar10;
                str = str3;
                m3kVar = m3kVar9;
                m3kVar2 = m3kVar10;
                m3kVar3 = activeStateDiv;
                rvoVar = rvoVar7;
                div2View = div2View3;
                dblVar = dblVar5;
                divStateLayout2 = divStateLayout;
                cblVar2 = cblVar12;
                aw5Var2 = aw5Var;
            }
            dbl dblVar7 = u2kVar2 != null ? u2kVar2.c : null;
            ngd0 ngd0Var = ngd0.G;
            rvo rvoVar10 = aw5Var2.b;
            final m3k m3kVar11 = cblVar2.c;
            String str5 = cblVar2.d;
            egk d3 = m3kVar11 != null ? m3kVar11.d() : null;
            com.yandex.div.core.state.b a = com.yandex.div.core.state.a.a(bVar4, str, cblVar2, str5);
            View childAt = divStateLayout2.getChildCount() != 0 ? divStateLayout2.getChildAt(0) : null;
            View a2 = (m3kVar11 == null || (currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.a(m3kVar11);
            boolean l2 = jl40.l(divStateLayout2.getStateId(), str5);
            com.yandex.div.core.view2.f fVar = uVar3.w;
            yvf0 yvf0Var2 = uVar3.x;
            cbl cblVar13 = cblVar2;
            if (l2) {
                egkVar = d3;
                dblVar2 = dblVar;
                view = childAt;
                rvoVar2 = rvoVar10;
                yvf0Var = yvf0Var2;
                cblVar3 = cblVar;
                cblVar4 = cblVar13;
                div2View2 = div2View;
                rvoVar3 = rvoVar;
                if (egkVar != null) {
                    if (view == null || rvoVar3 == null) {
                        m3kVar4 = m3kVar3;
                    } else {
                        m3kVar4 = m3kVar3;
                        if (qjk.b(m3kVar4, m3kVar11, rvoVar3, rvoVar2)) {
                            z = true;
                            if (!z) {
                                z2 = z;
                                a2 = view;
                            } else if (a2 == null) {
                                a2 = fVar.o(m3kVar11, rvoVar2);
                                z2 = z;
                                a2.setLayoutParams(new DivLayoutParams(-1, -2));
                            } else {
                                z2 = z;
                            }
                            if (!z2) {
                                ngd0Var.p();
                                if (fu11.a.a()) {
                                    rzo.S(divStateLayout2, div2View2);
                                    divStateLayout2.removeAllViews();
                                } else {
                                    sjh sjhVar = uyj.a;
                                    tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, divStateLayout2, div2View2));
                                }
                                divStateLayout2.addView(a2);
                            }
                            if (a2 != null) {
                                ((hgk) yvf0Var.get()).b(aw5Var2, a2, m3kVar11, a);
                            }
                            bVar2 = a;
                            view2 = a2;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    if (!z2) {
                    }
                    if (a2 != null) {
                    }
                    bVar2 = a;
                    view2 = a2;
                } else {
                    m3kVar4 = m3kVar3;
                    ngd0Var.p();
                    if (fu11.a.a()) {
                        rzo.S(divStateLayout2, div2View2);
                        divStateLayout2.removeAllViews();
                    } else {
                        sjh sjhVar2 = uyj.a;
                        tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, divStateLayout2, div2View2));
                    }
                    bVar2 = a;
                    view2 = null;
                }
            } else {
                if (m3kVar11 != null) {
                    if (a2 == null) {
                        view7 = fVar.o(m3kVar11, rvoVar10);
                        view7.setLayoutParams(new DivLayoutParams(-1, -2));
                    } else {
                        view7 = a2;
                    }
                    view4 = view7;
                } else {
                    view4 = null;
                }
                m3k m3kVar12 = m3kVar;
                if (childAt == null) {
                    obj3 = null;
                } else if (m3kVar12 == null || (d2 = m3kVar12.d()) == null || (k = d2.k()) == null) {
                    obj3 = null;
                    pair = null;
                } else {
                    obj3 = null;
                    pair = Ig(divStateLayout2, Collections.singletonList(new fkl(k)), null, false, false);
                }
                pair = new Pair(divStateLayout2, obj3);
                ViewGroup viewGroup = (ViewGroup) pair.getFirst();
                qrq0 qrq0Var3 = (qrq0) pair.getSecond();
                rvo rvoVar11 = rvoVar;
                if (rvoVar11 == null) {
                    View view8 = childAt;
                    transitionSet = Jg(cblVar13, cblVar, view4, view8, rvoVar10, null);
                    egkVar = d3;
                    dblVar2 = dblVar;
                    yvf0Var = yvf0Var2;
                    cblVar4 = cblVar13;
                    cblVar3 = cblVar;
                    view = view8;
                    rvoVar2 = rvoVar10;
                    rvoVar3 = rvoVar11;
                    view6 = view4;
                } else {
                    egkVar = d3;
                    View view9 = childAt;
                    rvoVar2 = rvoVar10;
                    cblVar3 = cblVar;
                    View view10 = view4;
                    cblVar4 = cblVar13;
                    int i = qkl.a[((DivTransitionSelector) dblVar.M.a(rvoVar2)).ordinal()];
                    dbl dblVar8 = dblVar;
                    if (i == 2 || i == 3) {
                        if (m3kVar12 != null) {
                            z3 = true;
                            if (uml.a(m3kVar12, rvoVar11)) {
                                m3kVar7 = m3kVar12;
                                m3kVar6 = m3kVar2;
                                jkl e = div2View.getViewComponent().e();
                                obl h = div2View.getViewComponent().h();
                                if (cblVar4 != cblVar3) {
                                    DivStateBinder$toTransitionSequence$2 divStateBinder$toTransitionSequence$2 = DivStateBinder$toTransitionSequence$2.w;
                                    if (m3kVar7 != null) {
                                        rvoVar5 = rvoVar2;
                                        final boolean z4 = false;
                                        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$toTransitionSequence$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj4) {
                                                String id2;
                                                cxk cxkVar = (cxk) obj4;
                                                boolean z5 = z4;
                                                m3k m3kVar13 = cxkVar.a;
                                                rvo rvoVar12 = cxkVar.b;
                                                egk d4 = m3kVar13.d();
                                                List n = d4.n();
                                                if ((n != null ? n.contains(DivTransitionTrigger.STATE_CHANGE) : true) && (id2 = d4.getId()) != null) {
                                                    if (z5) {
                                                        DivAppearanceTransition y = d4.y();
                                                        if (y != null) {
                                                            return new gy01(id2, Collections.singletonList(new ekl(y, 1)), rvoVar12);
                                                        }
                                                    } else {
                                                        DivChangeTransition k3 = d4.k();
                                                        fkl fklVar = k3 != null ? new fkl(k3) : null;
                                                        DivAppearanceTransition j = d4.j();
                                                        ekl eklVar = j != null ? new ekl(j, 2) : null;
                                                        if (fklVar != null || eklVar != null) {
                                                            return new gy01(id2, j73.A(new gkl[]{fklVar, eklVar}), rvoVar12);
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                        };
                                        cblVar7 = cblVar4;
                                        oblVar = h;
                                        qrq0Var = qrq0Var3;
                                        dblVar2 = dblVar8;
                                        yvf0Var = yvf0Var2;
                                        m3kVar8 = m3kVar6;
                                        cblVar8 = cblVar3;
                                        qrq0Var2 = new jll(m3kVar7, rvoVar11, divStateBinder$toTransitionSequence$2, null, tlsVar);
                                    } else {
                                        rvoVar5 = rvoVar2;
                                        oblVar = h;
                                        cblVar7 = cblVar4;
                                        yvf0Var = yvf0Var2;
                                        qrq0Var = qrq0Var3;
                                        dblVar2 = dblVar8;
                                        cblVar8 = cblVar3;
                                        m3kVar8 = m3kVar6;
                                        qrq0Var2 = null;
                                    }
                                    if (qrq0Var != null) {
                                        qrq0Var2 = qrq0Var2 == null ? qrq0Var : kotlin.sequences.b.p(qrq0Var, qrq0Var2);
                                    }
                                    if (m3kVar8 != null) {
                                        final boolean z5 = true;
                                        rvoVar6 = rvoVar5;
                                        jllVar = new jll(m3kVar8, rvoVar6, divStateBinder$toTransitionSequence$2, null, new tls() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$toTransitionSequence$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj4) {
                                                String id2;
                                                cxk cxkVar = (cxk) obj4;
                                                boolean z52 = z5;
                                                m3k m3kVar13 = cxkVar.a;
                                                rvo rvoVar12 = cxkVar.b;
                                                egk d4 = m3kVar13.d();
                                                List n = d4.n();
                                                if ((n != null ? n.contains(DivTransitionTrigger.STATE_CHANGE) : true) && (id2 = d4.getId()) != null) {
                                                    if (z52) {
                                                        DivAppearanceTransition y = d4.y();
                                                        if (y != null) {
                                                            return new gy01(id2, Collections.singletonList(new ekl(y, 1)), rvoVar12);
                                                        }
                                                    } else {
                                                        DivChangeTransition k3 = d4.k();
                                                        fkl fklVar = k3 != null ? new fkl(k3) : null;
                                                        DivAppearanceTransition j = d4.j();
                                                        ekl eklVar = j != null ? new ekl(j, 2) : null;
                                                        if (fklVar != null || eklVar != null) {
                                                            return new gy01(id2, j73.A(new gkl[]{fklVar, eklVar}), rvoVar12);
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                        });
                                    } else {
                                        rvoVar6 = rvoVar5;
                                        jllVar = null;
                                    }
                                    transitionSet = e.b(qrq0Var2, jllVar);
                                    oblVar.a(transitionSet);
                                    rvoVar3 = rvoVar11;
                                    rvoVar2 = rvoVar6;
                                    view = view9;
                                    view6 = view10;
                                    cblVar3 = cblVar8;
                                    cblVar4 = cblVar7;
                                } else {
                                    yvf0Var = yvf0Var2;
                                    dblVar2 = dblVar8;
                                    rvoVar3 = rvoVar11;
                                    view = view9;
                                    view6 = view10;
                                    transitionSet = null;
                                }
                            }
                        } else {
                            z3 = true;
                        }
                        m3kVar6 = m3kVar2;
                        if (m3kVar6 != null) {
                            m3kVar7 = m3kVar12;
                        }
                        yvf0Var = yvf0Var2;
                        dblVar2 = dblVar8;
                        rvoVar4 = rvoVar2;
                        cblVar5 = cblVar3;
                        cblVar6 = cblVar4;
                        rvoVar3 = rvoVar11;
                        view5 = view9;
                    } else {
                        cblVar5 = cblVar3;
                        cblVar6 = cblVar4;
                        yvf0Var = yvf0Var2;
                        dblVar2 = dblVar8;
                        rvoVar4 = rvoVar2;
                        view5 = view9;
                        rvoVar3 = rvoVar11;
                    }
                    view6 = view10;
                    transitionSet = Jg(cblVar6, cblVar5, view6, view5, rvoVar4, rvoVar3);
                    View view11 = view5;
                    cblVar3 = cblVar5;
                    view = view11;
                    rvoVar2 = rvoVar4;
                    cblVar4 = cblVar6;
                }
                if (transitionSet != null) {
                    TransitionManager.b(viewGroup);
                    com.yandex.div.core.view2.animations.c.b(transitionSet, viewGroup);
                    TransitionManager.a(transitionSet, viewGroup);
                }
                ngd0Var.p();
                if (fu11.a.a()) {
                    div2View2 = div2View;
                    rzo.S(divStateLayout2, div2View2);
                    divStateLayout2.removeAllViews();
                } else {
                    div2View2 = div2View;
                    sjh sjhVar3 = uyj.a;
                    tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, divStateLayout2, div2View2));
                }
                if (view6 != null) {
                    divStateLayout2.addView(view6);
                    if (m3kVar11 != null) {
                        ((hgk) yvf0Var.get()).b(aw5Var2, view6, m3kVar11, a);
                    }
                }
                if (view != null) {
                    nkl divTransitionHandler = div2View2.getDivTransitionHandler();
                    divTransitionHandler.d = false;
                    divTransitionHandler.a(viewGroup, false);
                }
                bVar2 = a;
                view2 = view6;
                m3kVar4 = m3kVar3;
            }
            if (view != null) {
                view.startAnimation(new AnimationSet(false));
                dblVar3 = dblVar2;
                if (!jl40.l(dblVar7, dblVar3) || cblVar4 != cblVar3) {
                    div2View2.unbindViewFromDiv$div_release(view);
                    if (m3kVar4 != null && rvoVar3 != null) {
                        uVar = this;
                        com.yandex.div.core.view2.i.l(uVar.C, div2View2, rvoVar3, null, m3kVar4);
                        uVar.Kg(view, div2View2, rvoVar3);
                    }
                }
                uVar = this;
            } else {
                uVar = this;
                dblVar3 = dblVar2;
            }
            if (view2 == null || egkVar == null || (egkVar.w() == null && egkVar.b() == null)) {
                bVar3 = bVar2;
                uVar2 = uVar;
            } else {
                div2View2.bindViewToDiv$div_release(view2, m3kVar11);
                bVar3 = bVar2;
                uVar2 = this;
                view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindState$$inlined$doOnNextLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view12, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view12.removeOnLayoutChangeListener(this);
                        com.yandex.div.core.view2.i.l(u.this.C, div2View2, rvoVar2, view2, m3kVar11);
                    }
                });
            }
            if (m3kVar4 != null && (d = m3kVar4.d()) != null && (id = d.getId()) != null) {
                f3l f3lVar = uVar2.A;
                List a3 = f3lVar.a.a(div2View2.getDataTag(), id);
                if (a3 == null) {
                    arrayList = null;
                } else {
                    List<m3k> list4 = a3;
                    arrayList = new ArrayList(tcc.n(list4, 10));
                    for (m3k m3kVar13 : list4) {
                        z2k z2kVar = (z2k) f3lVar.b.get();
                        com.yandex.div.core.state.b currentRootPath$div_release = div2View2.getCurrentRootPath$div_release();
                        f3l f3lVar2 = f3lVar;
                        View a4 = z2kVar.a(m3kVar13, aw5Var2, currentRootPath$div_release);
                        z2kVar.b.b(aw5Var2, a4, m3kVar13, currentRootPath$div_release);
                        arrayList.add(a4);
                        f3lVar = f3lVar2;
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() > 1) {
                        int i2 = wfx.a;
                    } else {
                        view3 = (View) kotlin.collections.a.R(arrayList);
                        List a5 = uVar2.B.a(div2View2.getDataTag(), id);
                        m3kVar5 = a5 == null ? (m3k) kotlin.collections.a.R(a5) : null;
                        if (view3 != null && m3kVar5 != null) {
                            ngd0Var.p();
                            if (fu11.a.a()) {
                                sjh sjhVar4 = uyj.a;
                                tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, divStateLayout2, div2View2));
                            } else {
                                rzo.S(divStateLayout2, div2View2);
                                divStateLayout2.removeAllViews();
                            }
                            divStateLayout2.addView(view3);
                            if (uml.g(m3kVar5.d())) {
                                div2View2.bindViewToDiv$div_release(view3, m3kVar5);
                            }
                            ((hgk) yvf0Var.get()).b(aw5Var2, view3, m3kVar5, bVar3);
                        }
                    }
                }
                view3 = null;
                List a52 = uVar2.B.a(div2View2.getDataTag(), id);
                if (a52 == null) {
                }
                if (view3 != null) {
                    ngd0Var.p();
                    if (fu11.a.a()) {
                    }
                    divStateLayout2.addView(view3);
                    if (uml.g(m3kVar5.d())) {
                    }
                    ((hgk) yvf0Var.get()).b(aw5Var2, view3, m3kVar5, bVar3);
                }
            }
            divStateLayout2.setActiveStateDiv$div_release(m3kVar11);
            divStateLayout2.setPath(bVar3);
            if (view != null) {
                com.yandex.div.core.expression.local.a aVar = uVar2.F;
                aVar.getClass();
                com.yandex.div.core.expression.a i3 = div2View2.getRuntimeStore().i(rvoVar2);
                if (i3 == null) {
                    return;
                }
                aVar.e(dblVar3, div2View2, bVar, i3);
            }
        }
    }

    public final void Kg(View view, Div2View div2View, rvo rvoVar) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            m3k unbindViewFromDiv$div_release = div2View.unbindViewFromDiv$div_release(childAt);
            if (unbindViewFromDiv$div_release != null) {
                com.yandex.div.core.view2.i.l(this.C, div2View, rvoVar, null, unbindViewFromDiv$div_release);
            }
            Kg(childAt, div2View, rvoVar);
            i = i2;
        }
    }
}
