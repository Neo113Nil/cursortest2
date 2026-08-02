package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import defpackage.afk;
import defpackage.ajk;
import defpackage.aok;
import defpackage.aw5;
import defpackage.cxk;
import defpackage.egk;
import defpackage.f3l;
import defpackage.hgk;
import defpackage.i9l;
import defpackage.j9l;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.l6o;
import defpackage.m3k;
import defpackage.m6o;
import defpackage.msk;
import defpackage.ny61;
import defpackage.psk;
import defpackage.qje;
import defpackage.qjk;
import defpackage.r8;
import defpackage.rvo;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.uml;
import defpackage.unr0;
import defpackage.uvo;
import defpackage.v3k;
import defpackage.vez0;
import defpackage.vjk;
import defpackage.wwg;
import defpackage.xjk;
import defpackage.y5e;
import defpackage.ycc;
import defpackage.ym11;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class f extends r8 {
    public final Rect A;
    public final e c;
    public final yvf0 w;
    public final f3l x;
    public final yvf0 y;
    public final m6o z;

    public f(e eVar, yvf0 yvf0Var, f3l f3lVar, yvf0 yvf0Var2, m6o m6oVar) {
        super(4, eVar);
        this.c = eVar;
        this.w = yvf0Var;
        this.x = f3lVar;
        this.y = yvf0Var2;
        this.z = m6oVar;
        this.A = new Rect();
    }

    public static final Rect Hg(f fVar, DivEdgeInsets divEdgeInsets, Resources resources, rvo rvoVar) {
        Rect rect = fVar.A;
        if (divEdgeInsets == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        Expression expression = divEdgeInsets.b;
        Expression expression2 = divEdgeInsets.e;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.g.a(rvoVar);
        if (expression2 == null && expression == null) {
            rect.left = a.N((Long) divEdgeInsets.c.a(rvoVar), displayMetrics, divSizeUnit);
            rect.right = a.N((Long) divEdgeInsets.d.a(rvoVar), displayMetrics, divSizeUnit);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                rect.left = a.N(expression2 != null ? (Long) expression2.a(rvoVar) : null, displayMetrics, divSizeUnit);
                rect.right = a.N(expression != null ? (Long) expression.a(rvoVar) : null, displayMetrics, divSizeUnit);
            } else {
                rect.left = a.N(expression != null ? (Long) expression.a(rvoVar) : null, displayMetrics, divSizeUnit);
                rect.right = a.N(expression2 != null ? (Long) expression2.a(rvoVar) : null, displayMetrics, divSizeUnit);
            }
        }
        rect.top = a.N((Long) divEdgeInsets.f.a(rvoVar), displayMetrics, divSizeUnit);
        rect.bottom = a.N((Long) divEdgeInsets.a.a(rvoVar), displayMetrics, divSizeUnit);
        return rect;
    }

    public static void Ig(View view, DivContainer divContainer, egk egkVar, rvo rvoVar, rvo rvoVar2) {
        Expression h = egkVar.h();
        DivAlignmentVertical divAlignmentVertical = null;
        DivAlignmentHorizontal k = h != null ? (DivAlignmentHorizontal) h.a(rvoVar2) : uml.j(divContainer, rvoVar) ? null : uml.k((DivContentAlignmentHorizontal) divContainer.o.a(rvoVar));
        Expression o = egkVar.o();
        if (o != null) {
            divAlignmentVertical = (DivAlignmentVertical) o.a(rvoVar2);
        } else if (!uml.j(divContainer, rvoVar)) {
            divAlignmentVertical = uml.l((DivContentAlignmentVertical) divContainer.p.a(rvoVar));
        }
        a.a(view, k, divAlignmentVertical);
    }

    public static void Mg(DivContainer divContainer, rvo rvoVar, l6o l6oVar) {
        long longValue = ((Number) divContainer.A.a(rvoVar)).longValue();
        if ((Pg(divContainer.P, rvoVar) & 2) == 0 || longValue == 0) {
            return;
        }
        l6oVar.f(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    public static void Ng(DivSize divSize, egk egkVar, l6o l6oVar, String str, String str2) {
        if (divSize instanceof i9l) {
            String id = egkVar.getId();
            l6oVar.f(new Throwable(String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, id != null ? unr0.l('\'', " with id='", id) : "", str2}, 3))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static int Pg(vjk vjkVar, rvo rvoVar) {
        if (vjkVar == null) {
            return 0;
        }
        boolean booleanValue = ((Boolean) vjkVar.c.a(rvoVar)).booleanValue();
        ?? r0 = booleanValue;
        if (((Boolean) vjkVar.d.a(rvoVar)).booleanValue()) {
            r0 = (booleanValue ? 1 : 0) | 2;
        }
        return ((Boolean) vjkVar.b.a(rvoVar)).booleanValue() ? r0 | 4 : r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0229, code lost:
    
        if (defpackage.qje.k(r4.o(), r28.o()) != false) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Jg(ViewGroup viewGroup, aw5 aw5Var, DivContainer divContainer, DivContainer divContainer2, List list, List list2, com.yandex.div.core.state.b bVar, l6o l6oVar) {
        Div2View div2View;
        List list3;
        Iterator it;
        List J0;
        final rvo rvoVar;
        uvo uvoVar;
        f fVar = this;
        aw5 aw5Var2 = aw5Var;
        final DivContainer divContainer3 = divContainer;
        Div2View div2View2 = aw5Var2.a;
        tje.j0(viewGroup, div2View2, list, fVar.w);
        rvo rvoVar2 = aw5Var2.b;
        if (!(viewGroup instanceof DivFrameLayout)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                egk d = ((cxk) it2.next()).a.d();
                if (viewGroup instanceof DivWrapLayout) {
                    if (divContainer3.I.a(rvoVar2) == DivContainer.Orientation.HORIZONTAL) {
                        Ng(d.getHeight(), d, l6oVar, "wrap layout mode", "cross");
                    } else {
                        Ng(d.getWidth(), d, l6oVar, "wrap layout mode", "cross");
                    }
                } else if (viewGroup instanceof DivLinearLayout) {
                    if (divContainer3.I.a(rvoVar2) == DivContainer.Orientation.HORIZONTAL) {
                        if (divContainer3.c0 instanceof j9l) {
                            Ng(d.getWidth(), d, l6oVar, "wrap_content size", "main");
                        }
                    } else if (divContainer3.v instanceof j9l) {
                        afk afkVar = divContainer3.i;
                        if (afkVar != null) {
                            div2View = div2View2;
                            if (((float) ((Number) afkVar.a.a(rvoVar2)).doubleValue()) != 0.0f) {
                                div2View2 = div2View;
                            }
                        } else {
                            div2View = div2View2;
                        }
                        Ng(d.getHeight(), d, l6oVar, "wrap_content size", "main");
                        div2View2 = div2View;
                    }
                }
                div2View = div2View2;
                div2View2 = div2View;
            }
        }
        Div2View div2View3 = div2View2;
        DivCollectionItemBuilder divCollectionItemBuilder = divContainer3.z;
        Expression expression = divContainer3.p;
        Expression expression2 = divContainer3.o;
        if (divCollectionItemBuilder != null) {
            list3 = list;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i3 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                cxk cxkVar = (cxk) next;
                m3k m3kVar = cxkVar.a;
                int i4 = i + i2;
                String id = m3kVar.d().getId();
                if (id == null) {
                    J0 = Collections.singletonList(m3kVar);
                    it = it3;
                } else {
                    it = it3;
                    LinkedHashMap b = fVar.x.b(aw5Var2, id);
                    if (b == null) {
                        J0 = Collections.singletonList(m3kVar);
                    } else {
                        viewGroup.removeViewAt(i4);
                        Iterator it4 = b.entrySet().iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            viewGroup.addView((View) ((Map.Entry) it4.next()).getValue(), i5 + i4);
                            i5++;
                            b = b;
                        }
                        J0 = kotlin.collections.a.J0(b.keySet());
                    }
                }
                List list4 = J0;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                for (Iterator it5 = list4.iterator(); it5.hasNext(); it5 = it5) {
                    arrayList2.add(new cxk((m3k) it5.next(), cxkVar.b));
                }
                i2 += arrayList2.size() - 1;
                ycc.r(arrayList2, arrayList);
                it3 = it;
                i = i3;
            }
            list3 = arrayList;
        }
        ArrayList i6 = com.yandex.div.core.state.a.i(list3);
        int i7 = 0;
        for (Object obj : list3) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar2 = (cxk) obj;
            final View childAt = viewGroup.getChildAt(i7);
            m3k m3kVar2 = cxkVar2.a;
            rvo rvoVar3 = cxkVar2.b;
            com.yandex.div.core.state.b a = bVar.a((String) i6.get(i7));
            msk mskVar = childAt instanceof msk ? (msk) childAt : null;
            m3k div = mskVar != null ? mskVar.getDiv() : null;
            com.yandex.div.core.expression.a a2 = div2View3.getRuntimeStore().a(a, m3kVar2, rvoVar3, rvoVar2);
            rvo rvoVar4 = rvoVar2;
            ((hgk) fVar.y.get()).b(aw5Var2.a(rvoVar3), childAt, m3kVar2, a);
            final egk d2 = m3kVar2.d();
            egk d3 = div != null ? div.d() : null;
            final rvo rvoVar5 = aw5Var2.b;
            if (a2 == null || (rvoVar = a2.a) == null) {
                rvoVar = rvoVar3;
            }
            uvo n = s8o.n(childAt);
            if (div2View3.getComplexRebindInProgress$div_release() || d3 == null) {
                uvoVar = n;
            } else {
                uvoVar = n;
                if (qje.k(expression2, divContainer2 != null ? divContainer2.o : null)) {
                    if (qje.k(expression, divContainer2 != null ? divContainer2.p : null)) {
                        egk egkVar = d3;
                        if (qje.k(d2.h(), egkVar.h())) {
                        }
                    }
                }
            }
            Ig(childAt, divContainer3, d2, rvoVar5, rvoVar);
            if (!(expression2 instanceof kvo) || !(expression instanceof kvo) || !qje.B(d2.h()) || !qje.B(d2.o())) {
                uvo uvoVar2 = uvoVar;
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        f fVar2 = f.this;
                        View view = childAt;
                        DivContainer divContainer4 = divContainer3;
                        egk egkVar2 = d2;
                        rvo rvoVar6 = rvoVar5;
                        rvo rvoVar7 = rvoVar;
                        fVar2.getClass();
                        f.Ig(view, divContainer4, egkVar2, rvoVar6, rvoVar7);
                        return zy11.a;
                    }
                };
                uvoVar2.addSubscription(expression2.c(rvoVar5, tlsVar));
                uvoVar2.addSubscription(expression.c(rvoVar5, tlsVar));
                Expression h = d2.h();
                uvoVar2.addSubscription(h != null ? h.c(rvoVar, tlsVar) : null);
                Expression o = d2.o();
                uvoVar2.addSubscription(o != null ? o.c(rvoVar, tlsVar) : null);
            }
            if (uml.g(m3kVar2.d())) {
                div2View3.bindViewToDiv$div_release(childAt, m3kVar2);
            } else {
                div2View3.unbindViewFromDiv$div_release(childAt);
            }
            fVar = this;
            aw5Var2 = aw5Var;
            divContainer3 = divContainer;
            i7 = i8;
            rvoVar2 = rvoVar4;
        }
        ((ajk) viewGroup).setItems(list3);
        a.L(viewGroup, div2View3, list3, list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x015c, code lost:
    
        if (defpackage.qje.B(r2 != null ? r2.b : null) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0318, code lost:
    
        if (defpackage.qje.k(r2, r24 != null ? r24.p : null) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0386, code lost:
    
        if (defpackage.qje.k(r1 != null ? r1.b : null, r2 != null ? r2.b : null) != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0388, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x050a, code lost:
    
        if (defpackage.qje.k(r1 != null ? r1.b : null, r0 != null ? r0.b : null) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x050c, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (defpackage.qje.k(r11, r24 != null ? r24.p : null) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0539, code lost:
    
        if (defpackage.qje.B(r1 != null ? r1.b : null) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03b4, code lost:
    
        if (defpackage.qje.B(r1 != null ? r1.b : null) != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        if (defpackage.qje.k(r2 != null ? r2.b : null, r5 != null ? r5.b : null) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r12 = r24;
        r1 = r2;
        r2 = r6;
        r6 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028b  */
    @Override // defpackage.r8
    /* renamed from: Kg, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hc(ViewGroup viewGroup, aw5 aw5Var, final DivContainer divContainer, DivContainer divContainer2) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        rvo rvoVar;
        final f fVar = this;
        v3k v3kVar = divContainer.b;
        Expression expression11 = divContainer.p;
        Expression expression12 = divContainer.o;
        Expression expression13 = divContainer.A;
        Expression expression14 = divContainer.I;
        a.c(viewGroup, aw5Var, v3kVar, divContainer.d, divContainer.G, divContainer.r, divContainer.x, divContainer.w, divContainer.L, divContainer.K, divContainer.c, divContainer.l);
        final rvo rvoVar2 = aw5Var.b;
        Div2View div2View = aw5Var.a;
        l6o a = fVar.z.a(div2View.get_divData(), div2View.getDataTag());
        a.i(viewGroup, divContainer.i, divContainer2 != null ? divContainer2.i : null, rvoVar2);
        a.j(viewGroup, divContainer.m, divContainer2 != null ? divContainer2.m : null, rvoVar2);
        if (viewGroup instanceof DivLinearLayout) {
            final DivLinearLayout divLinearLayout = (DivLinearLayout) viewGroup;
            if (!qje.k(expression14, divContainer2 != null ? divContainer2.I : null)) {
                divLinearLayout.setOrientation(xjk.a[((DivContainer.Orientation) expression14.a(rvoVar2)).ordinal()] != 1 ? 1 : 0);
                if (!(expression14 instanceof kvo)) {
                    divLinearLayout.addSubscription(expression14.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivLinearLayout divLinearLayout2 = DivLinearLayout.this;
                            fVar.getClass();
                            divLinearLayout2.setOrientation(xjk.a[((DivContainer.Orientation) obj).ordinal()] == 1 ? 0 : 1);
                            return zy11.a;
                        }
                    }));
                }
            }
            if (qje.k(expression12, divContainer2 != null ? divContainer2.o : null)) {
                expression7 = expression11;
            } else {
                expression7 = expression11;
            }
            divLinearLayout.setGravity(uml.c((DivContentAlignmentHorizontal) expression12.a(rvoVar2), (DivContentAlignmentVertical) expression7.a(rvoVar2)));
            if (!(expression12 instanceof kvo) || !(expression7 instanceof kvo)) {
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Object a2 = DivContainer.this.o.a(rvoVar2);
                        divLinearLayout.setGravity(uml.c((DivContentAlignmentHorizontal) a2, (DivContentAlignmentVertical) DivContainer.this.p.a(rvoVar2)));
                        return zy11.a;
                    }
                };
                divLinearLayout.addSubscription(expression12.c(rvoVar2, tlsVar));
                divLinearLayout.addSubscription(expression7.c(rvoVar2, tlsVar));
            }
            vjk vjkVar = divContainer.P;
            vjk vjkVar2 = divContainer2 != null ? divContainer2.P : null;
            if (qje.k(vjkVar != null ? vjkVar.c : null, vjkVar2 != null ? vjkVar2.c : null)) {
                if (qje.k(vjkVar != null ? vjkVar.d : null, vjkVar2 != null ? vjkVar2.d : null)) {
                }
            }
            divLinearLayout.setShowDividers(Pg(vjkVar, rvoVar2));
            if (qje.B(vjkVar != null ? vjkVar.c : null)) {
                if (qje.B(vjkVar != null ? vjkVar.d : null)) {
                }
            }
            DivContainer divContainer3 = divContainer2;
            final vjk vjkVar3 = vjkVar;
            final rvo rvoVar3 = rvoVar2;
            DivContainer divContainer4 = divContainer;
            tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    vjk vjkVar4 = vjk.this;
                    DivLinearLayout divLinearLayout2 = divLinearLayout;
                    f fVar2 = fVar;
                    rvo rvoVar4 = rvoVar2;
                    fVar2.getClass();
                    divLinearLayout2.setShowDividers(f.Pg(vjkVar4, rvoVar4));
                    return zy11.a;
                }
            };
            divLinearLayout = divLinearLayout;
            fVar = fVar;
            divLinearLayout.addSubscription((vjkVar3 == null || (expression10 = vjkVar3.c) == null) ? null : expression10.c(rvoVar3, tlsVar2));
            divLinearLayout.addSubscription((vjkVar3 == null || (expression9 = vjkVar3.d) == null) ? null : expression9.c(rvoVar3, tlsVar2));
            divLinearLayout.addSubscription((vjkVar3 == null || (expression8 = vjkVar3.b) == null) ? null : expression8.c(rvoVar3, tlsVar2));
            vjk vjkVar4 = divContainer3 != null ? divContainer3.P : null;
            if (!vez0.l(vjkVar3 != null ? vjkVar3.e : null, vjkVar4 != null ? vjkVar4.e : null)) {
                aok aokVar = vjkVar3 != null ? vjkVar3.e : null;
                divLinearLayout.setDividerDrawable(aokVar != null ? uml.m(aokVar, divLinearLayout.getResources().getDisplayMetrics(), rvoVar3) : null);
                if (!vez0.I(vjkVar3 != null ? vjkVar3.e : null)) {
                    y5e.x(divLinearLayout, vjkVar3 != null ? vjkVar3.e : null, rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            vjk vjkVar5 = vjk.this;
                            aok aokVar2 = vjkVar5 != null ? vjkVar5.e : null;
                            DivLinearLayout divLinearLayout2 = divLinearLayout;
                            divLinearLayout2.setDividerDrawable(aokVar2 != null ? uml.m(aokVar2, divLinearLayout2.getResources().getDisplayMetrics(), rvoVar3) : null);
                            return zy11.a;
                        }
                    });
                }
            }
            vjk vjkVar5 = divContainer3 != null ? divContainer3.P : null;
            if (!vez0.q(vjkVar3 != null ? vjkVar3.a : null, vjkVar5 != null ? vjkVar5.a : null)) {
                Rect Hg = Hg(fVar, vjkVar3 != null ? vjkVar3.a : null, divLinearLayout.getResources(), rvoVar3);
                divLinearLayout.setDividerMargins(Hg.left, Hg.top, Hg.right, Hg.bottom);
                final DivEdgeInsets divEdgeInsets = vjkVar3 != null ? vjkVar3.a : null;
                if (divEdgeInsets != null && !vez0.M(divEdgeInsets)) {
                    final rvo rvoVar4 = rvoVar3;
                    tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            Rect Hg2 = f.Hg(fVar, DivEdgeInsets.this, divLinearLayout.getResources(), rvoVar4);
                            divLinearLayout.setDividerMargins(Hg2.left, Hg2.top, Hg2.right, Hg2.bottom);
                            return zy11.a;
                        }
                    };
                    rvoVar = rvoVar3;
                    Expression expression15 = divEdgeInsets.f;
                    Expression expression16 = divEdgeInsets.b;
                    divLinearLayout.addSubscription(expression15.c(rvoVar, tlsVar3));
                    divLinearLayout.addSubscription(divEdgeInsets.a.c(rvoVar, tlsVar3));
                    Expression expression17 = divEdgeInsets.e;
                    if (expression17 == null && expression16 == null) {
                        divLinearLayout.addSubscription(divEdgeInsets.c.c(rvoVar, tlsVar3));
                        divLinearLayout.addSubscription(divEdgeInsets.d.c(rvoVar, tlsVar3));
                    } else {
                        divLinearLayout.addSubscription(expression17 != null ? expression17.c(rvoVar, tlsVar3) : null);
                        divLinearLayout.addSubscription(expression16 != null ? expression16.c(rvoVar, tlsVar3) : null);
                    }
                    if (!qje.k(expression13, divContainer3 != null ? divContainer3.A : null)) {
                        divLinearLayout.setItemSpacing(a.o(Long.valueOf(((Number) expression13.a(rvoVar)).longValue()), divLinearLayout.getResources().getDisplayMetrics()));
                        if (!(expression13 instanceof kvo)) {
                            divLinearLayout.addSubscription(expression13.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$1
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj) {
                                    DivLinearLayout.this.setItemSpacing(a.o(Long.valueOf(((Number) obj).longValue()), DivLinearLayout.this.getResources().getDisplayMetrics()));
                                    return zy11.a;
                                }
                            }));
                        }
                    }
                    Mg(divContainer4, rvoVar, a);
                    return;
                }
            }
            rvoVar = rvoVar3;
            if (!qje.k(expression13, divContainer3 != null ? divContainer3.A : null)) {
            }
            Mg(divContainer4, rvoVar, a);
            return;
        }
        if (viewGroup instanceof DivWrapLayout) {
            final DivWrapLayout divWrapLayout = (DivWrapLayout) viewGroup;
            Expression expression18 = divContainer.F;
            if (!qje.k(expression14, divContainer2 != null ? divContainer2.I : null)) {
                divWrapLayout.setWrapDirection(xjk.a[((DivContainer.Orientation) expression14.a(rvoVar2)).ordinal()] != 1 ? 1 : 0);
                if (!(expression14 instanceof kvo)) {
                    divWrapLayout.addSubscription(expression14.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivWrapLayout divWrapLayout2 = DivWrapLayout.this;
                            fVar.getClass();
                            divWrapLayout2.setWrapDirection(xjk.a[((DivContainer.Orientation) obj).ordinal()] == 1 ? 0 : 1);
                            return zy11.a;
                        }
                    }));
                }
            }
            if (qje.k(expression12, divContainer2 != null ? divContainer2.o : null)) {
            }
            divWrapLayout.setGravity(uml.c((DivContentAlignmentHorizontal) expression12.a(rvoVar2), (DivContentAlignmentVertical) expression11.a(rvoVar2)));
            if (!(expression12 instanceof kvo) || !(expression11 instanceof kvo)) {
                tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Object a2 = DivContainer.this.o.a(rvoVar2);
                        divWrapLayout.setGravity(uml.c((DivContentAlignmentHorizontal) a2, (DivContentAlignmentVertical) DivContainer.this.p.a(rvoVar2)));
                        return zy11.a;
                    }
                };
                divWrapLayout.addSubscription(expression12.c(rvoVar2, tlsVar4));
                divWrapLayout.addSubscription(expression11.c(rvoVar2, tlsVar4));
            }
            final vjk vjkVar6 = divContainer.P;
            vjk vjkVar7 = divContainer2 != null ? divContainer2.P : null;
            if (qje.k(vjkVar6 != null ? vjkVar6.c : null, vjkVar7 != null ? vjkVar7.c : null)) {
                if (qje.k(vjkVar6 != null ? vjkVar6.d : null, vjkVar7 != null ? vjkVar7.d : null)) {
                }
            }
            divWrapLayout.setShowSeparators(Pg(vjkVar6, rvoVar2));
            if (qje.B(vjkVar6 != null ? vjkVar6.c : null)) {
                if (qje.B(vjkVar6 != null ? vjkVar6.d : null)) {
                }
            }
            final rvo rvoVar5 = rvoVar2;
            tls tlsVar5 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    vjk vjkVar8 = vjk.this;
                    DivWrapLayout divWrapLayout2 = divWrapLayout;
                    f fVar2 = fVar;
                    rvo rvoVar6 = rvoVar5;
                    fVar2.getClass();
                    divWrapLayout2.setShowSeparators(f.Pg(vjkVar8, rvoVar6));
                    return zy11.a;
                }
            };
            divWrapLayout = divWrapLayout;
            fVar = fVar;
            divWrapLayout.addSubscription((vjkVar6 == null || (expression3 = vjkVar6.c) == null) ? null : expression3.c(rvoVar5, tlsVar5));
            divWrapLayout.addSubscription((vjkVar6 == null || (expression2 = vjkVar6.d) == null) ? null : expression2.c(rvoVar5, tlsVar5));
            divWrapLayout.addSubscription((vjkVar6 == null || (expression = vjkVar6.b) == null) ? null : expression.c(rvoVar5, tlsVar5));
            vjk vjkVar8 = divContainer2 != null ? divContainer2.P : null;
            if (!vez0.l(vjkVar6 != null ? vjkVar6.e : null, vjkVar8 != null ? vjkVar8.e : null)) {
                aok aokVar2 = vjkVar6 != null ? vjkVar6.e : null;
                divWrapLayout.setSeparatorDrawable(aokVar2 != null ? uml.m(aokVar2, divWrapLayout.getResources().getDisplayMetrics(), rvoVar5) : null);
                if (!vez0.I(vjkVar6 != null ? vjkVar6.e : null)) {
                    y5e.x(divWrapLayout, vjkVar6 != null ? vjkVar6.e : null, rvoVar5, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            vjk vjkVar9 = vjk.this;
                            aok aokVar3 = vjkVar9 != null ? vjkVar9.e : null;
                            DivWrapLayout divWrapLayout2 = divWrapLayout;
                            divWrapLayout2.setSeparatorDrawable(aokVar3 != null ? uml.m(aokVar3, divWrapLayout2.getResources().getDisplayMetrics(), rvoVar5) : null);
                            return zy11.a;
                        }
                    });
                }
            }
            vjk vjkVar9 = divContainer2 != null ? divContainer2.P : null;
            if (!vez0.q(vjkVar6 != null ? vjkVar6.a : null, vjkVar9 != null ? vjkVar9.a : null)) {
                Rect Hg2 = Hg(fVar, vjkVar6 != null ? vjkVar6.a : null, divWrapLayout.getResources(), rvoVar5);
                divWrapLayout.setSeparatorMargins(Hg2.left, Hg2.top, Hg2.right, Hg2.bottom);
                final DivEdgeInsets divEdgeInsets2 = vjkVar6 != null ? vjkVar6.a : null;
                if (divEdgeInsets2 != null && !vez0.M(divEdgeInsets2)) {
                    final rvo rvoVar6 = rvoVar5;
                    tls tlsVar6 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            Rect Hg3 = f.Hg(fVar, DivEdgeInsets.this, divWrapLayout.getResources(), rvoVar6);
                            divWrapLayout.setSeparatorMargins(Hg3.left, Hg3.top, Hg3.right, Hg3.bottom);
                            return zy11.a;
                        }
                    };
                    Expression expression19 = divEdgeInsets2.f;
                    Expression expression20 = divEdgeInsets2.b;
                    divWrapLayout.addSubscription(expression19.c(rvoVar5, tlsVar6));
                    divWrapLayout.addSubscription(divEdgeInsets2.a.c(rvoVar5, tlsVar6));
                    Expression expression21 = divEdgeInsets2.e;
                    if (expression21 == null && expression20 == null) {
                        divWrapLayout.addSubscription(divEdgeInsets2.c.c(rvoVar5, tlsVar6));
                        divWrapLayout.addSubscription(divEdgeInsets2.d.c(rvoVar5, tlsVar6));
                    } else {
                        divWrapLayout.addSubscription(expression21 != null ? expression21.c(rvoVar5, tlsVar6) : null);
                        divWrapLayout.addSubscription(expression20 != null ? expression20.c(rvoVar5, tlsVar6) : null);
                    }
                }
            }
            final vjk vjkVar10 = divContainer.E;
            vjk vjkVar11 = divContainer2 != null ? divContainer2.E : null;
            if (qje.k(vjkVar10 != null ? vjkVar10.c : null, vjkVar11 != null ? vjkVar11.c : null)) {
                if (qje.k(vjkVar10 != null ? vjkVar10.d : null, vjkVar11 != null ? vjkVar11.d : null)) {
                }
            }
            divWrapLayout.setShowLineSeparators(Pg(vjkVar10, rvoVar5));
            if (qje.B(vjkVar10 != null ? vjkVar10.c : null)) {
                if (qje.B(vjkVar10 != null ? vjkVar10.d : null)) {
                }
            }
            final rvo rvoVar7 = rvoVar5;
            final DivWrapLayout divWrapLayout2 = divWrapLayout;
            tls tlsVar7 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    vjk vjkVar12 = vjk.this;
                    DivWrapLayout divWrapLayout3 = divWrapLayout2;
                    f fVar2 = this;
                    rvo rvoVar8 = rvoVar7;
                    fVar2.getClass();
                    divWrapLayout3.setShowLineSeparators(f.Pg(vjkVar12, rvoVar8));
                    return zy11.a;
                }
            };
            divWrapLayout = divWrapLayout2;
            final f fVar2 = this;
            divWrapLayout.addSubscription((vjkVar10 == null || (expression6 = vjkVar10.c) == null) ? null : expression6.c(rvoVar5, tlsVar7));
            divWrapLayout.addSubscription((vjkVar10 == null || (expression5 = vjkVar10.d) == null) ? null : expression5.c(rvoVar5, tlsVar7));
            divWrapLayout.addSubscription((vjkVar10 == null || (expression4 = vjkVar10.b) == null) ? null : expression4.c(rvoVar5, tlsVar7));
            vjk vjkVar12 = divContainer2 != null ? divContainer2.E : null;
            if (!vez0.l(vjkVar10 != null ? vjkVar10.e : null, vjkVar12 != null ? vjkVar12.e : null)) {
                aok aokVar3 = vjkVar10 != null ? vjkVar10.e : null;
                divWrapLayout.setLineSeparatorDrawable(aokVar3 != null ? uml.m(aokVar3, divWrapLayout.getResources().getDisplayMetrics(), rvoVar5) : null);
                if (!vez0.I(vjkVar10 != null ? vjkVar10.e : null)) {
                    y5e.x(divWrapLayout, vjkVar10 != null ? vjkVar10.e : null, rvoVar5, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            vjk vjkVar13 = vjk.this;
                            aok aokVar4 = vjkVar13 != null ? vjkVar13.e : null;
                            DivWrapLayout divWrapLayout3 = divWrapLayout;
                            divWrapLayout3.setLineSeparatorDrawable(aokVar4 != null ? uml.m(aokVar4, divWrapLayout3.getResources().getDisplayMetrics(), rvoVar5) : null);
                            return zy11.a;
                        }
                    });
                }
            }
            vjk vjkVar13 = divContainer2 != null ? divContainer2.E : null;
            if (!vez0.q(vjkVar10 != null ? vjkVar10.a : null, vjkVar13 != null ? vjkVar13.a : null)) {
                Rect Hg3 = Hg(fVar2, vjkVar10 != null ? vjkVar10.a : null, divWrapLayout.getResources(), rvoVar5);
                divWrapLayout.setLineSeparatorMargins(Hg3.left, Hg3.top, Hg3.right, Hg3.bottom);
                final DivEdgeInsets divEdgeInsets3 = vjkVar10 != null ? vjkVar10.a : null;
                if (divEdgeInsets3 != null && !vez0.M(divEdgeInsets3)) {
                    final rvo rvoVar8 = rvoVar5;
                    tls tlsVar8 = new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            Rect Hg4 = f.Hg(fVar2, DivEdgeInsets.this, divWrapLayout.getResources(), rvoVar8);
                            divWrapLayout.setLineSeparatorMargins(Hg4.left, Hg4.top, Hg4.right, Hg4.bottom);
                            return zy11.a;
                        }
                    };
                    Expression expression22 = divEdgeInsets3.f;
                    Expression expression23 = divEdgeInsets3.b;
                    divWrapLayout.addSubscription(expression22.c(rvoVar5, tlsVar8));
                    divWrapLayout.addSubscription(divEdgeInsets3.a.c(rvoVar5, tlsVar8));
                    Expression expression24 = divEdgeInsets3.e;
                    if (expression24 == null && expression23 == null) {
                        divWrapLayout.addSubscription(divEdgeInsets3.c.c(rvoVar5, tlsVar8));
                        divWrapLayout.addSubscription(divEdgeInsets3.d.c(rvoVar5, tlsVar8));
                    } else {
                        divWrapLayout.addSubscription(expression24 != null ? expression24.c(rvoVar5, tlsVar8) : null);
                        divWrapLayout.addSubscription(expression23 != null ? expression23.c(rvoVar5, tlsVar8) : null);
                    }
                }
            }
            if (!qje.k(expression13, divContainer2 != null ? divContainer2.A : null)) {
                divWrapLayout.setItemSpacing(a.o(Long.valueOf(((Number) expression13.a(rvoVar5)).longValue()), divWrapLayout.getResources().getDisplayMetrics()));
                if (!(expression13 instanceof kvo)) {
                    divWrapLayout.addSubscription(expression13.c(rvoVar5, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$2
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivWrapLayout.this.setItemSpacing(a.o(Long.valueOf(((Number) obj).longValue()), DivWrapLayout.this.getResources().getDisplayMetrics()));
                            return zy11.a;
                        }
                    }));
                }
            }
            if (!qje.k(expression18, divContainer2 != null ? divContainer2.F : null)) {
                final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
                divWrapLayout.setLineSpacing(a.o((Long) expression18.a(rvoVar5), displayMetrics));
                if (!(expression18 instanceof kvo)) {
                    divWrapLayout.addSubscription(expression18.c(rvoVar5, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSpacing$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DivWrapLayout.this.setLineSpacing(a.o(Long.valueOf(((Number) obj).longValue()), displayMetrics));
                            return zy11.a;
                        }
                    }));
                }
            }
            Mg(divContainer, rvoVar5, a);
            long longValue = ((Number) expression18.a(rvoVar5)).longValue();
            if ((Pg(divContainer.E, rvoVar5) & 2) == 0 || longValue == 0) {
                return;
            }
            a.f(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Lg(final ViewGroup viewGroup, final aw5 aw5Var, final DivContainer divContainer, DivContainer divContainer2, rvo rvoVar, final com.yandex.div.core.state.b bVar, boolean z) {
        List list;
        final l6o a;
        Div2View div2View = aw5Var.a;
        rvo rvoVar2 = aw5Var.b;
        List list2 = divContainer.B;
        final DivCollectionItemBuilder divCollectionItemBuilder = divContainer.z;
        List<cxk> c = com.yandex.div.internal.core.a.c(list2, divCollectionItemBuilder, rvoVar2);
        List items = ((ajk) viewGroup).getItems();
        if (items == null) {
            for (cxk cxkVar : c) {
                viewGroup.addView(((com.yandex.div.core.view2.f) this.w.get()).o(cxkVar.a, cxkVar.b));
            }
        } else if (divContainer != divContainer2) {
            if (!div2View.getComplexRebindInProgress$div_release()) {
                if (divContainer2 == null || !qjk.c(divContainer2, divContainer, rvoVar, rvoVar2) || !qjk.a(items, c)) {
                    Og(viewGroup, div2View, items, c);
                }
            }
            list = null;
            a = this.z.a(div2View.get_divData(), div2View.getDataTag());
            if (z && divCollectionItemBuilder != null) {
                a.k(divCollectionItemBuilder, rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindItemBuilder$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ArrayList a2 = com.yandex.div.internal.core.a.a(DivCollectionItemBuilder.this, aw5Var.b);
                        List items2 = ((ajk) viewGroup).getItems();
                        if (items2 == null) {
                            items2 = EmptyList.a;
                        }
                        List list3 = items2;
                        this.Og(viewGroup, aw5Var.a, list3, a2);
                        f fVar = this;
                        ViewGroup viewGroup2 = viewGroup;
                        aw5 aw5Var2 = aw5Var;
                        DivContainer divContainer3 = divContainer;
                        fVar.Jg(viewGroup2, aw5Var2, divContainer3, divContainer3, a2, list3, bVar, a);
                        return zy11.a;
                    }
                });
            }
            Jg(viewGroup, aw5Var, divContainer, divContainer2, c, list, bVar, a);
        }
        list = items;
        a = this.z.a(div2View.get_divData(), div2View.getDataTag());
        if (z) {
            a.k(divCollectionItemBuilder, rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindItemBuilder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ArrayList a2 = com.yandex.div.internal.core.a.a(DivCollectionItemBuilder.this, aw5Var.b);
                    List items2 = ((ajk) viewGroup).getItems();
                    if (items2 == null) {
                        items2 = EmptyList.a;
                    }
                    List list3 = items2;
                    this.Og(viewGroup, aw5Var.a, list3, a2);
                    f fVar = this;
                    ViewGroup viewGroup2 = viewGroup;
                    aw5 aw5Var2 = aw5Var;
                    DivContainer divContainer3 = divContainer;
                    fVar.Jg(viewGroup2, aw5Var2, divContainer3, divContainer3, a2, list3, bVar, a);
                    return zy11.a;
                }
            });
        }
        Jg(viewGroup, aw5Var, divContainer, divContainer2, c, list, bVar, a);
    }

    public final void Og(ViewGroup viewGroup, Div2View div2View, List list, List list2) {
        Iterable iterable;
        Object obj;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list3 = list;
        if (viewGroup.getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = viewGroup.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (i < viewGroup.getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < viewGroup.getChildCount())) {
                        iterable = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = viewGroup.getChildAt(i);
                    if (childAt2 == null) {
                        ny61.s();
                        return;
                    } else {
                        arrayList.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                iterable = Collections.singletonList(childAt);
            }
        } else {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        Iterator it = list3.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(tcc.n(list3, 10), tcc.n(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((cxk) it.next()).a, (View) it2.next());
            arrayList2.add(zy11.a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        int i3 = 0;
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Number) it4.next()).intValue();
                    cxk cxkVar = (cxk) list2.get(intValue);
                    Iterator it5 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it5.next();
                            if (uml.h((m3k) obj).equals(uml.h(cxkVar.a))) {
                                break;
                            }
                        }
                    }
                    View view = (View) ym11.c(linkedHashMap).remove((m3k) obj);
                    if (view == null) {
                        view = ((com.yandex.div.core.view2.f) this.w.get()).o(cxkVar.a, cxkVar.b);
                    }
                    viewGroup.addView(view, intValue);
                }
                Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    wwg.Y(div2View.getReleaseViewVisitor$div_release(), (View) it6.next());
                }
                return;
            }
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar2 = (cxk) next;
            Iterator it7 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next2 = it7.next();
                m3k m3kVar = (m3k) next2;
                if (uml.i(m3kVar)) {
                    z = uml.h(cxkVar2.a).equals(uml.h(m3kVar));
                } else {
                    m3k m3kVar2 = cxkVar2.a;
                    rvo rvoVar = cxkVar2.b;
                    if (uml.h(m3kVar).equals(uml.h(m3kVar2))) {
                        egk d = m3kVar.d();
                        egk d2 = m3kVar2.d();
                        if ((d instanceof psk) && (d2 instanceof psk)) {
                            z = jl40.l(((psk) d).B.a(rvoVar), ((psk) d2).B.a(rvoVar));
                        } else if (d.getBackground() == d2.getBackground()) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    obj2 = next2;
                    break;
                }
            }
            View view2 = (View) ym11.c(linkedHashMap).remove((m3k) obj2);
            if (view2 != null) {
                viewGroup.addView(view2);
            } else {
                arrayList3.add(Integer.valueOf(i3));
            }
            i3 = i4;
        }
    }
}
