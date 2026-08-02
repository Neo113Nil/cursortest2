package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.n;
import com.yandex.div.core.view2.divs.o;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import defpackage.aw5;
import defpackage.crk;
import defpackage.cvu0;
import defpackage.egk;
import defpackage.fgk;
import defpackage.ipl;
import defpackage.jkl;
import defpackage.jl40;
import defpackage.kfk;
import defpackage.kkl;
import defpackage.kvo;
import defpackage.l6o;
import defpackage.lkl;
import defpackage.m3k;
import defpackage.mfk;
import defpackage.msk;
import defpackage.muk;
import defpackage.myk;
import defpackage.ngh0;
import defpackage.nkl;
import defpackage.omk;
import defpackage.qje;
import defpackage.rvo;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.ugk;
import defpackage.uvo;
import defpackage.uxh;
import defpackage.v3k;
import defpackage.vez0;
import defpackage.w511;
import defpackage.y5e;
import defpackage.ycl;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class e {
    public final mfk a;
    public final com.yandex.div.core.tooltip.b b;
    public final crk c;
    public final com.yandex.div.core.view2.d d;
    public final myk e;

    public e(mfk mfkVar, com.yandex.div.core.tooltip.b bVar, crk crkVar, com.yandex.div.core.view2.d dVar, myk mykVar) {
        this.a = mfkVar;
        this.b = bVar;
        this.c = crkVar;
        this.d = dVar;
        this.e = mykVar;
    }

    public static void a(View view, Div2View div2View, egk egkVar, rvo rvoVar, boolean z) {
        int i;
        nkl divTransitionHandler = div2View.getDivTransitionHandler();
        int i2 = fgk.a[((DivVisibility) egkVar.getVisibility().a(rvoVar)).ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 4;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i = 8;
        }
        if (i != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List n = egkVar.n();
        Transition transition = null;
        if (n == null || n.contains(DivTransitionTrigger.VISIBILITY_CHANGE)) {
            kkl kklVar = (kkl) kotlin.collections.a.b0(nkl.b(view, divTransitionHandler.b));
            if (kklVar == null && (kklVar = (kkl) kotlin.collections.a.b0(nkl.b(view, divTransitionHandler.c))) == null) {
                kklVar = null;
            }
            if (kklVar != null) {
                visibility = kklVar.a;
            }
            jkl e = div2View.getViewComponent().e();
            if ((visibility == 4 || visibility == 8) && i == 0) {
                DivAppearanceTransition y = egkVar.y();
                if (y != null) {
                    transition = e.c(y, 1, rvoVar);
                } else {
                    e.getClass();
                }
            } else if ((i == 4 || i == 8) && visibility == 0 && !z) {
                DivAppearanceTransition j = egkVar.j();
                if (j != null) {
                    transition = e.c(j, 2, rvoVar);
                } else {
                    e.getClass();
                }
            } else if (kklVar != null) {
                TransitionManager.b(div2View);
            }
            if (transition != null) {
                transition.d(view);
            }
        }
        if (transition != null) {
            divTransitionHandler.b.add(new lkl(transition, view, scc.i(new kkl(i)), new ArrayList()));
            if (!divTransitionHandler.d) {
                divTransitionHandler.d = true;
                divTransitionHandler.a.post(new uxh(22, divTransitionHandler));
            }
        } else {
            view.setVisibility(i);
        }
        div2View.trackChildrenVisibility();
    }

    public static void c(final View view, final egk egkVar, egk egkVar2, final rvo rvoVar, uvo uvoVar) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (vez0.q(egkVar.s(), egkVar2 != null ? egkVar2.s() : null)) {
            return;
        }
        a.f(view, egkVar.s(), rvoVar);
        if (vez0.M(egkVar.s())) {
            return;
        }
        y5e.y(uvoVar, egkVar.s(), rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a.f(view, egkVar.s(), rvoVar);
                return zy11.a;
            }
        });
    }

    public final void b(final View view, final aw5 aw5Var, egk egkVar, egk egkVar2, uvo uvoVar, boolean z, final Drawable drawable) {
        List list;
        DivFocus p;
        List list2;
        List list3;
        List background = egkVar.getBackground();
        List list4 = EmptyList.a;
        final List list5 = background == null ? list4 : background;
        if (egkVar2 == null || (list = egkVar2.getBackground()) == null) {
            list = list4;
        }
        DivFocus p2 = egkVar.p();
        List list6 = (p2 == null || (list3 = p2.a) == null) ? list4 : list3;
        if (egkVar2 != null && (p = egkVar2.p()) != null && (list2 = p.a) != null) {
            list4 = list2;
        }
        int i = 0;
        if (z && list5.size() == list.size()) {
            Iterator it = list5.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    if (!vez0.j((kfk) next, (kfk) list.get(i2))) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } else if (list6.size() == list4.size()) {
                    int i4 = 0;
                    for (Object obj : list6) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw null;
                        }
                        if (vez0.j((kfk) obj, (kfk) list4.get(i4))) {
                            i4 = i5;
                        }
                    }
                    return;
                }
            }
        }
        boolean isEmpty = list6.isEmpty();
        final mfk mfkVar = this.a;
        if (isEmpty) {
            Drawable d = mfk.d(view);
            if (list5.size() == list.size()) {
                Iterator it2 = list5.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i6 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (!vez0.j((kfk) next2, (kfk) list.get(i))) {
                            break;
                        } else {
                            i = i6;
                        }
                    } else if (jl40.l(drawable, d)) {
                        return;
                    }
                }
            }
            mfkVar.b(view, aw5Var, drawable, list5);
            List list7 = list5;
            if ((list7 instanceof Collection) && list7.isEmpty()) {
                return;
            }
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                if (!vez0.H((kfk) it3.next())) {
                    mfk.a(list5, aw5Var.b, uvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            mfk.this.b(view, aw5Var, drawable, list5);
                            return zy11.a;
                        }
                    });
                    return;
                }
            }
            return;
        }
        Drawable d2 = mfk.d(view);
        if (list5.size() == list.size()) {
            Iterator it4 = list5.iterator();
            int i7 = 0;
            while (true) {
                if (it4.hasNext()) {
                    Object next3 = it4.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        scc.m();
                        throw null;
                    }
                    if (!vez0.j((kfk) next3, (kfk) list.get(i7))) {
                        break;
                    } else {
                        i7 = i8;
                    }
                } else if (list6.size() == list4.size()) {
                    Iterator it5 = list6.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i9 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            if (!vez0.j((kfk) next4, (kfk) list4.get(i))) {
                                break;
                            } else {
                                i = i9;
                            }
                        } else if (jl40.l(drawable, d2)) {
                            return;
                        }
                    }
                }
            }
        }
        final List list8 = list5;
        final List list9 = list6;
        mfkVar.c(view, aw5Var, drawable, list8, list9);
        List list10 = list8;
        if (!(list10 instanceof Collection) || !list10.isEmpty()) {
            Iterator it6 = list10.iterator();
            while (it6.hasNext()) {
                if (!vez0.H((kfk) it6.next())) {
                    break;
                }
            }
        }
        List list11 = list9;
        if ((list11 instanceof Collection) && list11.isEmpty()) {
            return;
        }
        Iterator it7 = list11.iterator();
        while (it7.hasNext()) {
            if (!vez0.H((kfk) it7.next())) {
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindFocusBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        mfk.this.c(view, aw5Var, drawable, list8, list9);
                        return zy11.a;
                    }
                };
                rvo rvoVar = aw5Var.b;
                mfk.a(list8, rvoVar, uvoVar, tlsVar);
                mfk.a(list9, rvoVar, uvoVar, tlsVar);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0620, code lost:
    
        if (defpackage.vez0.o(r1 != null ? r1.b : r12, r10 != null ? r10.b : r12) != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x01f7, code lost:
    
        if (defpackage.cvu0.t(r3.a, r6 != null ? r6.a : null, false) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015e, code lost:
    
        if (defpackage.qje.k(r12.o(), r1 != null ? r1.o() : null) != false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d2  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.e] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [z3l] */
    /* JADX WARN: Type inference failed for: r10v29, types: [z3l] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.view.View$OnFocusChangeListener, com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v8, types: [f1k] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [uvo] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [z3l] */
    /* JADX WARN: Type inference failed for: r1v36, types: [z3l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z3l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [z3l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v40, types: [com.yandex.div.core.view2.d] */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76, types: [z3l] */
    /* JADX WARN: Type inference failed for: r3v77, types: [z3l] */
    /* JADX WARN: Type inference failed for: r3v78, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.yandex.div.core.view2.divs.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v32, types: [android.view.View$OnFocusChangeListener, com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final aw5 aw5Var, View view, m3k m3kVar, m3k m3kVar2) {
        final l6o l6oVar;
        final egk egkVar;
        DivLayoutProvider u;
        egk egkVar2;
        rvo rvoVar;
        egk egkVar3;
        ?? r18;
        boolean z;
        View view2;
        View view3;
        egk egkVar4;
        egk egkVar5;
        final egk egkVar6;
        final ?? r5;
        DivBorder divBorder;
        DivFocusBinder$FocusChangeListener divFocusBinder$FocusChangeListener;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        List list;
        List list2;
        DivFocusBinder$FocusChangeListener divFocusBinder$FocusChangeListener2;
        DivTransform divTransform;
        List[] listArr;
        final View view4;
        DivTransform m;
        DivTransform m2;
        DivTransform m3;
        DivTransform m4;
        List i;
        DivFocus p;
        DivFocus.a aVar;
        DivFocus.a aVar2;
        DivFocus p2;
        DivFocus.a aVar3;
        DivFocus.a aVar4;
        DivFocus p3;
        DivFocus.a aVar5;
        DivFocus.a aVar6;
        DivFocus p4;
        DivFocus.a aVar7;
        DivFocus.a aVar8;
        DivFocus p5;
        DivFocus.a aVar9;
        DivFocus.a aVar10;
        final ?? r0 = this;
        final ?? r52 = view;
        msk mskVar = (msk) r52;
        mskVar.closeAllSubscription();
        mskVar.setDiv(m3kVar);
        mskVar.setBindingContext(aw5Var);
        final egk d = m3kVar.d();
        egk d2 = m3kVar2 != null ? m3kVar2.d() : null;
        final rvo rvoVar2 = aw5Var.b;
        final Div2View div2View = aw5Var.a;
        ?? n = s8o.n(r52);
        r52.setDefaultFocusHighlightEnabled(false);
        if (!jl40.l(d.getId(), d2 != null ? d2.getId() : null)) {
            int a = div2View.getViewComponent().n().a(d.getId());
            r52.setTag(d.getId());
            r52.setId(a);
        }
        final myk mykVar = r0.e;
        l6o a2 = mykVar.a.a(div2View.get_divData(), div2View.getDataTag());
        final rvo rvoVar3 = aw5Var.b;
        if (r52.getLayoutParams() == null) {
            r52.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        if (vez0.r(d.getWidth(), d2 != null ? d2.getWidth() : null)) {
            myk.c(d.getWidth(), "width", d.getId(), r52.getResources().getDisplayMetrics(), rvoVar3, a2);
            l6oVar = a2;
        } else {
            l6oVar = a2;
            myk.b(r52, d, rvoVar3, l6oVar);
            if (!vez0.N(d.getWidth())) {
                y5e.E(n, d.getWidth(), rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindWidth$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        myk mykVar2 = myk.this;
                        View view5 = r52;
                        egk egkVar7 = d;
                        rvo rvoVar4 = rvoVar3;
                        l6o l6oVar2 = l6oVar;
                        mykVar2.getClass();
                        myk.b(view5, egkVar7, rvoVar4, l6oVar2);
                        return zy11.a;
                    }
                });
            }
        }
        if (vez0.r(d.getHeight(), d2 != null ? d2.getHeight() : null)) {
            myk.c(d.getHeight(), "height", d.getId(), r52.getResources().getDisplayMetrics(), rvoVar3, l6oVar);
        } else {
            myk.a(r52, d, rvoVar3, l6oVar);
            if (!vez0.N(d.getHeight())) {
                egkVar = d;
                y5e.E(n, d.getHeight(), rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindHeight$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        myk mykVar2 = myk.this;
                        View view5 = r52;
                        egk egkVar7 = d;
                        rvo rvoVar4 = rvoVar3;
                        l6o l6oVar2 = l6oVar;
                        mykVar2.getClass();
                        myk.a(view5, egkVar7, rvoVar4, l6oVar2);
                        return zy11.a;
                    }
                });
                if (!vez0.q(egkVar.e(), d2 == null ? d2.e() : null)) {
                    a.e(r52, egkVar.e(), rvoVar2);
                    if (!vez0.M(egkVar.e())) {
                        y5e.y(n, egkVar.e(), rvoVar2, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindMargins$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                a.e(r52, egkVar.e(), rvoVar2);
                                return zy11.a;
                            }
                        });
                    }
                }
                if (qje.k(egkVar.h(), d2 == null ? d2.h() : null)) {
                }
                Expression h = egkVar.h();
                DivAlignmentHorizontal divAlignmentHorizontal = h == null ? (DivAlignmentHorizontal) h.a(rvoVar2) : null;
                Expression o = egkVar.o();
                a.a(r52, divAlignmentHorizontal, o == null ? (DivAlignmentVertical) o.a(rvoVar2) : null);
                if (qje.B(egkVar.h()) || !qje.B(egkVar.o())) {
                    tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            View view5 = r52;
                            Expression h2 = egkVar.h();
                            DivAlignmentHorizontal divAlignmentHorizontal2 = h2 != null ? (DivAlignmentHorizontal) h2.a(rvoVar2) : null;
                            Expression o2 = egkVar.o();
                            a.a(view5, divAlignmentHorizontal2, o2 != null ? (DivAlignmentVertical) o2.a(rvoVar2) : null);
                            return zy11.a;
                        }
                    };
                    Expression h2 = egkVar.h();
                    n.addSubscription(h2 == null ? h2.c(rvoVar2, tlsVar) : null);
                    Expression o2 = egkVar.o();
                    n.addSubscription(o2 == null ? o2.c(rvoVar2, tlsVar) : null);
                }
                final ?? c = div2View.getViewComponent().c();
                u = egkVar.u();
                DivLayoutProvider u2 = d2 == null ? d2.u() : null;
                c.getClass();
                if (u != null) {
                    c.b(r52, u2);
                } else {
                    if (cvu0.t(u.b, u2 != null ? u2.b : null, false)) {
                    }
                    c.b(r52, u2);
                    Div2View div2View2 = c.b;
                    omk omkVar = div2View2.get_divData();
                    if (omkVar != null) {
                        final String str = u.b;
                        final String str2 = u.a;
                        final l6o a3 = c.a.a(omkVar, div2View2.getDataTag());
                        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                            egkVar2 = d2;
                            rvoVar = rvoVar2;
                            egkVar3 = egkVar;
                            r18 = 0;
                            a3.e(new Throwable("Neither width_variable_name nor height_variable_name found."));
                            view3 = r52;
                        } else {
                            LinkedHashMap linkedHashMap = c.e;
                            Object obj = linkedHashMap.get(omkVar);
                            if (obj == null) {
                                egkVar2 = d2;
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashMap.put(omkVar, linkedHashSet);
                                obj = linkedHashSet;
                            } else {
                                egkVar2 = d2;
                            }
                            ((Set) obj).add(u);
                            LinkedHashMap linkedHashMap2 = c.d;
                            Object obj2 = linkedHashMap2.get(omkVar);
                            if (obj2 == null) {
                                obj2 = new o();
                                linkedHashMap2.put(omkVar, obj2);
                            }
                            final o oVar = (o) obj2;
                            aw5 bindingContext = div2View2.getBindingContext();
                            if (oVar.b.isEmpty()) {
                                oVar.h(omkVar, bindingContext);
                            }
                            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: nyk
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view5, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                    View view6 = r52;
                                    DisplayMetrics displayMetrics = view6.getResources().getDisplayMetrics();
                                    n nVar = n.this;
                                    String str3 = str;
                                    o oVar2 = oVar;
                                    rvo rvoVar4 = rvoVar2;
                                    l6o l6oVar2 = a3;
                                    nVar.c(displayMetrics, str3, oVar2, i2, i4, i6, i8, rvoVar4, l6oVar2);
                                    nVar.c(view6.getResources().getDisplayMetrics(), str2, oVar2, i3, i5, i7, i9, rvoVar4, l6oVar2);
                                }
                            };
                            rvoVar = rvoVar2;
                            if (view.getWidth() > 0 || view.getHeight() > 0) {
                                egkVar3 = egkVar;
                                z = false;
                                onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
                                view2 = view;
                            } else {
                                view2 = view;
                                egkVar3 = egkVar;
                                z = false;
                            }
                            view2.addOnLayoutChangeListener(onLayoutChangeListener);
                            view2.setTag(ngh0.div_layout_provider_listener_id, onLayoutChangeListener);
                            view3 = view2;
                            r18 = z;
                            if (div2View2.isAttachedToWindow()) {
                                c.a();
                                view3 = view2;
                                r18 = z;
                            }
                        }
                        egkVar4 = egkVar2;
                        final ?? r4 = view3;
                        final rvo rvoVar4 = rvoVar;
                        egkVar5 = egkVar3;
                        r0.d.d(r4, egkVar5, egkVar4, rvoVar4, n);
                        if (!qje.k(egkVar5.a(), egkVar4 != null ? egkVar4.a() : null)) {
                            r4.setAlpha((float) ((Number) egkVar5.a().a(rvoVar4)).doubleValue());
                            ugk ugkVar = r4 instanceof ugk ? (ugk) r4 : null;
                            if (ugkVar != null) {
                                ugkVar.invalidateBorder();
                            }
                            if (!(egkVar5.a() instanceof kvo)) {
                                n.addSubscription(egkVar5.a().c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlpha$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        double doubleValue = ((Number) obj3).doubleValue();
                                        e eVar = e.this;
                                        View view5 = r4;
                                        eVar.getClass();
                                        view5.setAlpha((float) doubleValue);
                                        ugk ugkVar2 = view5 instanceof ugk ? (ugk) view5 : null;
                                        if (ugkVar2 != null) {
                                            ugkVar2.invalidateBorder();
                                        }
                                        return zy11.a;
                                    }
                                }));
                            }
                        }
                        r0.b(r4, aw5Var, egkVar5, egkVar4, n, true, null);
                        egkVar6 = egkVar5;
                        r5 = r4;
                        DivFocus p6 = egkVar6.p();
                        divBorder = p6 != null ? p6.b : null;
                        DivBorder A = egkVar6.A();
                        crk.a(aw5Var, (divBorder == null || crk.b(divBorder) || !r5.isFocused()) ? A : divBorder, r5);
                        View.OnFocusChangeListener onFocusChangeListener = r5.getOnFocusChangeListener();
                        divFocusBinder$FocusChangeListener = !(onFocusChangeListener instanceof DivFocusBinder$FocusChangeListener) ? (DivFocusBinder$FocusChangeListener) onFocusChangeListener : null;
                        final crk crkVar = r0.c;
                        if (divFocusBinder$FocusChangeListener == null || !crk.b(divBorder)) {
                            if (divFocusBinder$FocusChangeListener == null && divFocusBinder$FocusChangeListener.getFocusActions() == null && divFocusBinder$FocusChangeListener.getBlurActions() == null && crk.b(divBorder)) {
                                r5.setOnFocusChangeListener(null);
                            } else {
                                ?? r10 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                                    private List<v3k> blurActions;
                                    private DivBorder blurredBorder;
                                    private final aw5 context;
                                    private List<v3k> focusActions;
                                    private DivBorder focusedBorder;

                                    {
                                        this.context = aw5Var;
                                    }

                                    private final void applyBorder(View view5, DivBorder border) {
                                        crk crkVar2 = crk.this;
                                        aw5 aw5Var2 = this.context;
                                        crkVar2.getClass();
                                        crk.a(aw5Var2, border, view5);
                                    }

                                    private final void handle(List<v3k> list3, View view5, String str3) {
                                        crk.this.a.d(this.context, view5, list3, str3);
                                    }

                                    public final List<v3k> getBlurActions() {
                                        return this.blurActions;
                                    }

                                    public final DivBorder getBlurredBorder() {
                                        return this.blurredBorder;
                                    }

                                    public final List<v3k> getFocusActions() {
                                        return this.focusActions;
                                    }

                                    public final DivBorder getFocusedBorder() {
                                        return this.focusedBorder;
                                    }

                                    @Override // android.view.View.OnFocusChangeListener
                                    public void onFocusChange(View v, boolean hasFocus) {
                                        DivBorder divBorder2 = this.focusedBorder;
                                        if (hasFocus) {
                                            applyBorder(v, divBorder2);
                                            List<v3k> list3 = this.focusActions;
                                            if (list3 != null) {
                                                handle(list3, v, "focus");
                                                return;
                                            }
                                            return;
                                        }
                                        if (divBorder2 != null) {
                                            applyBorder(v, this.blurredBorder);
                                        }
                                        List<v3k> list4 = this.blurActions;
                                        if (list4 != null) {
                                            handle(list4, v, "blur");
                                        }
                                    }

                                    public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                                        this.focusActions = onFocus;
                                        this.blurActions = onBlur;
                                    }

                                    public final void setBorders(DivBorder focused, DivBorder blurred) {
                                        this.focusedBorder = focused;
                                        this.blurredBorder = blurred;
                                    }
                                };
                                r10.setBorders(divBorder, A);
                                if (divFocusBinder$FocusChangeListener != null) {
                                    r10.setActions(divFocusBinder$FocusChangeListener.getFocusActions(), divFocusBinder$FocusChangeListener.getBlurActions());
                                }
                                r5.setOnFocusChangeListener(r10);
                            }
                        }
                        c(r5, egkVar6, egkVar4, rvoVar4, n);
                        final ipl n2 = div2View.getViewComponent().n();
                        DivFocus p7 = egkVar6.p();
                        expression = (p7 != null || (aVar10 = p7.c) == null) ? null : aVar10.b;
                        if (!qje.k(expression, (egkVar4 != null || (p5 = egkVar4.p()) == null || (aVar9 = p5.c) == null) ? null : aVar9.b)) {
                            String str3 = expression != null ? (String) expression.a(rvoVar4) : null;
                            r5.setNextFocusForwardId(n2.a(str3));
                            r5.setAccessibilityTraversalBefore(n2.a(str3));
                            if (!qje.B(expression)) {
                                n.addSubscription(expression != null ? expression.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        String str4 = (String) obj3;
                                        r5.setNextFocusForwardId(n2.a(str4));
                                        r5.setAccessibilityTraversalBefore(n2.a(str4));
                                        return zy11.a;
                                    }
                                }) : null);
                            }
                        }
                        DivFocus p8 = egkVar6.p();
                        expression2 = (p8 != null || (aVar8 = p8.c) == null) ? null : aVar8.c;
                        if (!qje.k(expression2, (egkVar4 != null || (p4 = egkVar4.p()) == null || (aVar7 = p4.c) == null) ? null : aVar7.c)) {
                            r5.setNextFocusLeftId(n2.a(expression2 != null ? (String) expression2.a(rvoVar4) : null));
                            if (!qje.B(expression2)) {
                                n.addSubscription(expression2 != null ? expression2.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        r5.setNextFocusLeftId(n2.a((String) obj3));
                                        return zy11.a;
                                    }
                                }) : null);
                            }
                        }
                        DivFocus p9 = egkVar6.p();
                        expression3 = (p9 != null || (aVar6 = p9.c) == null) ? null : aVar6.d;
                        if (!qje.k(expression3, (egkVar4 != null || (p3 = egkVar4.p()) == null || (aVar5 = p3.c) == null) ? null : aVar5.d)) {
                            r5.setNextFocusRightId(n2.a(expression3 != null ? (String) expression3.a(rvoVar4) : null));
                            if (!qje.B(expression3)) {
                                n.addSubscription(expression3 != null ? expression3.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        r5.setNextFocusRightId(n2.a((String) obj3));
                                        return zy11.a;
                                    }
                                }) : null);
                            }
                        }
                        DivFocus p10 = egkVar6.p();
                        expression4 = (p10 != null || (aVar4 = p10.c) == null) ? null : aVar4.e;
                        if (!qje.k(expression4, (egkVar4 != null || (p2 = egkVar4.p()) == null || (aVar3 = p2.c) == null) ? null : aVar3.e)) {
                            r5.setNextFocusUpId(n2.a(expression4 != null ? (String) expression4.a(rvoVar4) : null));
                            if (!qje.B(expression4)) {
                                n.addSubscription(expression4 != null ? expression4.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        r5.setNextFocusUpId(n2.a((String) obj3));
                                        return zy11.a;
                                    }
                                }) : null);
                            }
                        }
                        DivFocus p11 = egkVar6.p();
                        expression5 = (p11 != null || (aVar2 = p11.c) == null) ? null : aVar2.a;
                        if (!qje.k(expression5, (egkVar4 != null || (p = egkVar4.p()) == null || (aVar = p.c) == null) ? null : aVar.a)) {
                            r5.setNextFocusDownId(n2.a(expression5 != null ? (String) expression5.a(rvoVar4) : null));
                            if (!qje.B(expression5)) {
                                n.addSubscription(expression5 != null ? expression5.c(rvoVar4, new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj3) {
                                        r5.setNextFocusDownId(n2.a((String) obj3));
                                        return zy11.a;
                                    }
                                }) : null);
                            }
                        }
                        DivFocus p12 = egkVar6.p();
                        list = p12 == null ? p12.e : null;
                        DivFocus p13 = egkVar6.p();
                        list2 = p13 == null ? p13.d : null;
                        View.OnFocusChangeListener onFocusChangeListener2 = r5.getOnFocusChangeListener();
                        divFocusBinder$FocusChangeListener2 = !(onFocusChangeListener2 instanceof DivFocusBinder$FocusChangeListener) ? (DivFocusBinder$FocusChangeListener) onFocusChangeListener2 : null;
                        if (divFocusBinder$FocusChangeListener2 == null) {
                            List[] listArr2 = new List[2];
                            listArr2[r18] = list;
                            listArr2[1] = list2;
                            if (tje.b(listArr2)) {
                                divTransform = null;
                                e eVar = r0;
                                view4 = r5;
                                if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
                                    a(r5, div2View, egkVar6, rvoVar4, egkVar4 == null ? true : r18);
                                    eVar = r0;
                                    view4 = r5;
                                    if (!(egkVar6.getVisibility() instanceof kvo)) {
                                        Expression visibility = egkVar6.getVisibility();
                                        tls tlsVar2 = new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindVisibility$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj3) {
                                                e eVar2 = e.this;
                                                View view5 = r5;
                                                Div2View div2View3 = div2View;
                                                egk egkVar7 = egkVar6;
                                                rvo rvoVar5 = rvoVar4;
                                                eVar2.getClass();
                                                e.a(view5, div2View3, egkVar7, rvoVar5, false);
                                                return zy11.a;
                                            }
                                        };
                                        eVar = this;
                                        egkVar6 = egkVar6;
                                        view4 = r5;
                                        n.addSubscription(visibility.c(rvoVar4, tlsVar2));
                                    }
                                }
                                m = egkVar6.m();
                                m2 = egkVar4 == null ? egkVar4.m() : divTransform;
                                if (m == null || m2 != null) {
                                    if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
                                        if (vez0.o(m != null ? m.a : divTransform, m2 != null ? m2.a : divTransform)) {
                                        }
                                    }
                                    a.g(egkVar6, rvoVar4, view4);
                                    m3 = egkVar6.m();
                                    if (m3 != null && (!qje.B(m3.c) || !vez0.K(m3.a) || !vez0.K(m3.b))) {
                                        m4 = egkVar6.m();
                                        tls tlsVar3 = new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindTransform$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj3) {
                                                a.g(egkVar6, rvoVar4, view4);
                                                return zy11.a;
                                            }
                                        };
                                        if (m4 != null) {
                                            Expression expression6 = m4.c;
                                            ?? r12 = divTransform;
                                            if (expression6 != null) {
                                                r12 = expression6.c(rvoVar4, tlsVar3);
                                            }
                                            n.addSubscription(r12);
                                            y5e.A(n, m4.a, rvoVar4, tlsVar3);
                                            y5e.A(n, m4.b, rvoVar4, tlsVar3);
                                        }
                                    }
                                }
                                i = egkVar6.i();
                                if (i != null) {
                                    eVar.b.getClass();
                                    view4.setTag(ngh0.div_tooltips_tag, i);
                                }
                                if (!(egkVar6 instanceof muk) || (egkVar6 instanceof ycl)) {
                                    return;
                                }
                                view4.setFocusable(egkVar6.p() == null ? r18 : true);
                                return;
                            }
                        }
                        if (divFocusBinder$FocusChangeListener2 != null && divFocusBinder$FocusChangeListener2.getFocusedBorder() == null) {
                            listArr = new List[2];
                            listArr[r18] = list;
                            listArr[1] = list2;
                            if (tje.b(listArr)) {
                                divTransform = null;
                                r5.setOnFocusChangeListener(null);
                                e eVar2 = r0;
                                view4 = r5;
                                if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
                                }
                                m = egkVar6.m();
                                if (egkVar4 == null) {
                                }
                                if (m == null) {
                                }
                                if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
                                }
                                a.g(egkVar6, rvoVar4, view4);
                                m3 = egkVar6.m();
                                if (m3 != null) {
                                    m4 = egkVar6.m();
                                    tls tlsVar32 = new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindTransform$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj3) {
                                            a.g(egkVar6, rvoVar4, view4);
                                            return zy11.a;
                                        }
                                    };
                                    if (m4 != null) {
                                    }
                                }
                                i = egkVar6.i();
                                if (i != null) {
                                }
                                if (egkVar6 instanceof muk) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        divTransform = null;
                        ?? r42 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                            private List<v3k> blurActions;
                            private DivBorder blurredBorder;
                            private final aw5 context;
                            private List<v3k> focusActions;
                            private DivBorder focusedBorder;

                            {
                                this.context = aw5Var;
                            }

                            private final void applyBorder(View view5, DivBorder border) {
                                crk crkVar2 = crk.this;
                                aw5 aw5Var2 = this.context;
                                crkVar2.getClass();
                                crk.a(aw5Var2, border, view5);
                            }

                            private final void handle(List<v3k> list3, View view5, String str32) {
                                crk.this.a.d(this.context, view5, list3, str32);
                            }

                            public final List<v3k> getBlurActions() {
                                return this.blurActions;
                            }

                            public final DivBorder getBlurredBorder() {
                                return this.blurredBorder;
                            }

                            public final List<v3k> getFocusActions() {
                                return this.focusActions;
                            }

                            public final DivBorder getFocusedBorder() {
                                return this.focusedBorder;
                            }

                            @Override // android.view.View.OnFocusChangeListener
                            public void onFocusChange(View v, boolean hasFocus) {
                                DivBorder divBorder2 = this.focusedBorder;
                                if (hasFocus) {
                                    applyBorder(v, divBorder2);
                                    List<v3k> list3 = this.focusActions;
                                    if (list3 != null) {
                                        handle(list3, v, "focus");
                                        return;
                                    }
                                    return;
                                }
                                if (divBorder2 != null) {
                                    applyBorder(v, this.blurredBorder);
                                }
                                List<v3k> list4 = this.blurActions;
                                if (list4 != null) {
                                    handle(list4, v, "blur");
                                }
                            }

                            public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                                this.focusActions = onFocus;
                                this.blurActions = onBlur;
                            }

                            public final void setBorders(DivBorder focused, DivBorder blurred) {
                                this.focusedBorder = focused;
                                this.blurredBorder = blurred;
                            }
                        };
                        if (divFocusBinder$FocusChangeListener2 != null) {
                            r42.setBorders(divFocusBinder$FocusChangeListener2.getFocusedBorder(), divFocusBinder$FocusChangeListener2.getBlurredBorder());
                        }
                        r42.setActions(list, list2);
                        r5.setOnFocusChangeListener(r42);
                        e eVar22 = r0;
                        view4 = r5;
                        if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
                        }
                        m = egkVar6.m();
                        if (egkVar4 == null) {
                        }
                        if (m == null) {
                        }
                        if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
                        }
                        a.g(egkVar6, rvoVar4, view4);
                        m3 = egkVar6.m();
                        if (m3 != null) {
                        }
                        i = egkVar6.i();
                        if (i != null) {
                        }
                        if (egkVar6 instanceof muk) {
                        }
                    }
                }
                egkVar2 = d2;
                rvoVar = rvoVar2;
                r18 = 0;
                egkVar3 = egkVar;
                view3 = r52;
                egkVar4 = egkVar2;
                final View r43 = view3;
                final rvo rvoVar42 = rvoVar;
                egkVar5 = egkVar3;
                r0.d.d(r43, egkVar5, egkVar4, rvoVar42, n);
                if (!qje.k(egkVar5.a(), egkVar4 != null ? egkVar4.a() : null)) {
                }
                r0.b(r43, aw5Var, egkVar5, egkVar4, n, true, null);
                egkVar6 = egkVar5;
                r5 = r43;
                DivFocus p62 = egkVar6.p();
                if (p62 != null) {
                }
                DivBorder A2 = egkVar6.A();
                if (divBorder == null) {
                    crk.a(aw5Var, (divBorder == null || crk.b(divBorder) || !r5.isFocused()) ? A2 : divBorder, r5);
                    View.OnFocusChangeListener onFocusChangeListener3 = r5.getOnFocusChangeListener();
                    if (!(onFocusChangeListener3 instanceof DivFocusBinder$FocusChangeListener)) {
                    }
                    final crk crkVar2 = r0.c;
                    if (divFocusBinder$FocusChangeListener == null) {
                    }
                    if (divFocusBinder$FocusChangeListener == null) {
                    }
                    ?? r102 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                        private List<v3k> blurActions;
                        private DivBorder blurredBorder;
                        private final aw5 context;
                        private List<v3k> focusActions;
                        private DivBorder focusedBorder;

                        {
                            this.context = aw5Var;
                        }

                        private final void applyBorder(View view5, DivBorder border) {
                            crk crkVar22 = crk.this;
                            aw5 aw5Var2 = this.context;
                            crkVar22.getClass();
                            crk.a(aw5Var2, border, view5);
                        }

                        private final void handle(List<v3k> list3, View view5, String str32) {
                            crk.this.a.d(this.context, view5, list3, str32);
                        }

                        public final List<v3k> getBlurActions() {
                            return this.blurActions;
                        }

                        public final DivBorder getBlurredBorder() {
                            return this.blurredBorder;
                        }

                        public final List<v3k> getFocusActions() {
                            return this.focusActions;
                        }

                        public final DivBorder getFocusedBorder() {
                            return this.focusedBorder;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public void onFocusChange(View v, boolean hasFocus) {
                            DivBorder divBorder2 = this.focusedBorder;
                            if (hasFocus) {
                                applyBorder(v, divBorder2);
                                List<v3k> list3 = this.focusActions;
                                if (list3 != null) {
                                    handle(list3, v, "focus");
                                    return;
                                }
                                return;
                            }
                            if (divBorder2 != null) {
                                applyBorder(v, this.blurredBorder);
                            }
                            List<v3k> list4 = this.blurActions;
                            if (list4 != null) {
                                handle(list4, v, "blur");
                            }
                        }

                        public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                            this.focusActions = onFocus;
                            this.blurActions = onBlur;
                        }

                        public final void setBorders(DivBorder focused, DivBorder blurred) {
                            this.focusedBorder = focused;
                            this.blurredBorder = blurred;
                        }
                    };
                    r102.setBorders(divBorder, A2);
                    if (divFocusBinder$FocusChangeListener != null) {
                    }
                    r5.setOnFocusChangeListener(r102);
                    c(r5, egkVar6, egkVar4, rvoVar42, n);
                    final ipl n22 = div2View.getViewComponent().n();
                    DivFocus p72 = egkVar6.p();
                    if (p72 != null) {
                    }
                    if (!qje.k(expression, (egkVar4 != null || (p5 = egkVar4.p()) == null || (aVar9 = p5.c) == null) ? null : aVar9.b)) {
                    }
                    DivFocus p82 = egkVar6.p();
                    if (p82 != null) {
                    }
                    if (!qje.k(expression2, (egkVar4 != null || (p4 = egkVar4.p()) == null || (aVar7 = p4.c) == null) ? null : aVar7.c)) {
                    }
                    DivFocus p92 = egkVar6.p();
                    if (p92 != null) {
                    }
                    if (!qje.k(expression3, (egkVar4 != null || (p3 = egkVar4.p()) == null || (aVar5 = p3.c) == null) ? null : aVar5.d)) {
                    }
                    DivFocus p102 = egkVar6.p();
                    if (p102 != null) {
                    }
                    if (!qje.k(expression4, (egkVar4 != null || (p2 = egkVar4.p()) == null || (aVar3 = p2.c) == null) ? null : aVar3.e)) {
                    }
                    DivFocus p112 = egkVar6.p();
                    if (p112 != null) {
                    }
                    if (!qje.k(expression5, (egkVar4 != null || (p = egkVar4.p()) == null || (aVar = p.c) == null) ? null : aVar.a)) {
                    }
                    DivFocus p122 = egkVar6.p();
                    if (p122 == null) {
                    }
                    DivFocus p132 = egkVar6.p();
                    if (p132 == null) {
                    }
                    View.OnFocusChangeListener onFocusChangeListener22 = r5.getOnFocusChangeListener();
                    if (!(onFocusChangeListener22 instanceof DivFocusBinder$FocusChangeListener)) {
                    }
                    if (divFocusBinder$FocusChangeListener2 == null) {
                    }
                    if (divFocusBinder$FocusChangeListener2 != null) {
                        listArr = new List[2];
                        listArr[r18] = list;
                        listArr[1] = list2;
                        if (tje.b(listArr)) {
                        }
                    }
                    divTransform = null;
                    ?? r422 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                        private List<v3k> blurActions;
                        private DivBorder blurredBorder;
                        private final aw5 context;
                        private List<v3k> focusActions;
                        private DivBorder focusedBorder;

                        {
                            this.context = aw5Var;
                        }

                        private final void applyBorder(View view5, DivBorder border) {
                            crk crkVar22 = crk.this;
                            aw5 aw5Var2 = this.context;
                            crkVar22.getClass();
                            crk.a(aw5Var2, border, view5);
                        }

                        private final void handle(List<v3k> list3, View view5, String str32) {
                            crk.this.a.d(this.context, view5, list3, str32);
                        }

                        public final List<v3k> getBlurActions() {
                            return this.blurActions;
                        }

                        public final DivBorder getBlurredBorder() {
                            return this.blurredBorder;
                        }

                        public final List<v3k> getFocusActions() {
                            return this.focusActions;
                        }

                        public final DivBorder getFocusedBorder() {
                            return this.focusedBorder;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public void onFocusChange(View v, boolean hasFocus) {
                            DivBorder divBorder2 = this.focusedBorder;
                            if (hasFocus) {
                                applyBorder(v, divBorder2);
                                List<v3k> list3 = this.focusActions;
                                if (list3 != null) {
                                    handle(list3, v, "focus");
                                    return;
                                }
                                return;
                            }
                            if (divBorder2 != null) {
                                applyBorder(v, this.blurredBorder);
                            }
                            List<v3k> list4 = this.blurActions;
                            if (list4 != null) {
                                handle(list4, v, "blur");
                            }
                        }

                        public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                            this.focusActions = onFocus;
                            this.blurActions = onBlur;
                        }

                        public final void setBorders(DivBorder focused, DivBorder blurred) {
                            this.focusedBorder = focused;
                            this.blurredBorder = blurred;
                        }
                    };
                    if (divFocusBinder$FocusChangeListener2 != null) {
                    }
                    r422.setActions(list, list2);
                    r5.setOnFocusChangeListener(r422);
                    e eVar222 = r0;
                    view4 = r5;
                    if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
                    }
                    m = egkVar6.m();
                    if (egkVar4 == null) {
                    }
                    if (m == null) {
                    }
                    if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
                    }
                    a.g(egkVar6, rvoVar42, view4);
                    m3 = egkVar6.m();
                    if (m3 != null) {
                    }
                    i = egkVar6.i();
                    if (i != null) {
                    }
                    if (egkVar6 instanceof muk) {
                    }
                }
                crk.a(aw5Var, (divBorder == null || crk.b(divBorder) || !r5.isFocused()) ? A2 : divBorder, r5);
                View.OnFocusChangeListener onFocusChangeListener32 = r5.getOnFocusChangeListener();
                if (!(onFocusChangeListener32 instanceof DivFocusBinder$FocusChangeListener)) {
                }
                final crk crkVar22 = r0.c;
                if (divFocusBinder$FocusChangeListener == null) {
                }
                if (divFocusBinder$FocusChangeListener == null) {
                }
                ?? r1022 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                    private List<v3k> blurActions;
                    private DivBorder blurredBorder;
                    private final aw5 context;
                    private List<v3k> focusActions;
                    private DivBorder focusedBorder;

                    {
                        this.context = aw5Var;
                    }

                    private final void applyBorder(View view5, DivBorder border) {
                        crk crkVar222 = crk.this;
                        aw5 aw5Var2 = this.context;
                        crkVar222.getClass();
                        crk.a(aw5Var2, border, view5);
                    }

                    private final void handle(List<v3k> list3, View view5, String str32) {
                        crk.this.a.d(this.context, view5, list3, str32);
                    }

                    public final List<v3k> getBlurActions() {
                        return this.blurActions;
                    }

                    public final DivBorder getBlurredBorder() {
                        return this.blurredBorder;
                    }

                    public final List<v3k> getFocusActions() {
                        return this.focusActions;
                    }

                    public final DivBorder getFocusedBorder() {
                        return this.focusedBorder;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View v, boolean hasFocus) {
                        DivBorder divBorder2 = this.focusedBorder;
                        if (hasFocus) {
                            applyBorder(v, divBorder2);
                            List<v3k> list3 = this.focusActions;
                            if (list3 != null) {
                                handle(list3, v, "focus");
                                return;
                            }
                            return;
                        }
                        if (divBorder2 != null) {
                            applyBorder(v, this.blurredBorder);
                        }
                        List<v3k> list4 = this.blurActions;
                        if (list4 != null) {
                            handle(list4, v, "blur");
                        }
                    }

                    public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                        this.focusActions = onFocus;
                        this.blurActions = onBlur;
                    }

                    public final void setBorders(DivBorder focused, DivBorder blurred) {
                        this.focusedBorder = focused;
                        this.blurredBorder = blurred;
                    }
                };
                r1022.setBorders(divBorder, A2);
                if (divFocusBinder$FocusChangeListener != null) {
                }
                r5.setOnFocusChangeListener(r1022);
                c(r5, egkVar6, egkVar4, rvoVar42, n);
                final ipl n222 = div2View.getViewComponent().n();
                DivFocus p722 = egkVar6.p();
                if (p722 != null) {
                }
                if (!qje.k(expression, (egkVar4 != null || (p5 = egkVar4.p()) == null || (aVar9 = p5.c) == null) ? null : aVar9.b)) {
                }
                DivFocus p822 = egkVar6.p();
                if (p822 != null) {
                }
                if (!qje.k(expression2, (egkVar4 != null || (p4 = egkVar4.p()) == null || (aVar7 = p4.c) == null) ? null : aVar7.c)) {
                }
                DivFocus p922 = egkVar6.p();
                if (p922 != null) {
                }
                if (!qje.k(expression3, (egkVar4 != null || (p3 = egkVar4.p()) == null || (aVar5 = p3.c) == null) ? null : aVar5.d)) {
                }
                DivFocus p1022 = egkVar6.p();
                if (p1022 != null) {
                }
                if (!qje.k(expression4, (egkVar4 != null || (p2 = egkVar4.p()) == null || (aVar3 = p2.c) == null) ? null : aVar3.e)) {
                }
                DivFocus p1122 = egkVar6.p();
                if (p1122 != null) {
                }
                if (!qje.k(expression5, (egkVar4 != null || (p = egkVar4.p()) == null || (aVar = p.c) == null) ? null : aVar.a)) {
                }
                DivFocus p1222 = egkVar6.p();
                if (p1222 == null) {
                }
                DivFocus p1322 = egkVar6.p();
                if (p1322 == null) {
                }
                View.OnFocusChangeListener onFocusChangeListener222 = r5.getOnFocusChangeListener();
                if (!(onFocusChangeListener222 instanceof DivFocusBinder$FocusChangeListener)) {
                }
                if (divFocusBinder$FocusChangeListener2 == null) {
                }
                if (divFocusBinder$FocusChangeListener2 != null) {
                }
                divTransform = null;
                ?? r4222 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
                    private List<v3k> blurActions;
                    private DivBorder blurredBorder;
                    private final aw5 context;
                    private List<v3k> focusActions;
                    private DivBorder focusedBorder;

                    {
                        this.context = aw5Var;
                    }

                    private final void applyBorder(View view5, DivBorder border) {
                        crk crkVar222 = crk.this;
                        aw5 aw5Var2 = this.context;
                        crkVar222.getClass();
                        crk.a(aw5Var2, border, view5);
                    }

                    private final void handle(List<v3k> list3, View view5, String str32) {
                        crk.this.a.d(this.context, view5, list3, str32);
                    }

                    public final List<v3k> getBlurActions() {
                        return this.blurActions;
                    }

                    public final DivBorder getBlurredBorder() {
                        return this.blurredBorder;
                    }

                    public final List<v3k> getFocusActions() {
                        return this.focusActions;
                    }

                    public final DivBorder getFocusedBorder() {
                        return this.focusedBorder;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View v, boolean hasFocus) {
                        DivBorder divBorder2 = this.focusedBorder;
                        if (hasFocus) {
                            applyBorder(v, divBorder2);
                            List<v3k> list3 = this.focusActions;
                            if (list3 != null) {
                                handle(list3, v, "focus");
                                return;
                            }
                            return;
                        }
                        if (divBorder2 != null) {
                            applyBorder(v, this.blurredBorder);
                        }
                        List<v3k> list4 = this.blurActions;
                        if (list4 != null) {
                            handle(list4, v, "blur");
                        }
                    }

                    public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                        this.focusActions = onFocus;
                        this.blurActions = onBlur;
                    }

                    public final void setBorders(DivBorder focused, DivBorder blurred) {
                        this.focusedBorder = focused;
                        this.blurredBorder = blurred;
                    }
                };
                if (divFocusBinder$FocusChangeListener2 != null) {
                }
                r4222.setActions(list, list2);
                r5.setOnFocusChangeListener(r4222);
                e eVar2222 = r0;
                view4 = r5;
                if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
                }
                m = egkVar6.m();
                if (egkVar4 == null) {
                }
                if (m == null) {
                }
                if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
                }
                a.g(egkVar6, rvoVar42, view4);
                m3 = egkVar6.m();
                if (m3 != null) {
                }
                i = egkVar6.i();
                if (i != null) {
                }
                if (egkVar6 instanceof muk) {
                }
            }
        }
        egkVar = d;
        if (!vez0.q(egkVar.e(), d2 == null ? d2.e() : null)) {
        }
        if (qje.k(egkVar.h(), d2 == null ? d2.h() : null)) {
        }
        Expression h3 = egkVar.h();
        if (h3 == null) {
        }
        Expression o3 = egkVar.o();
        a.a(r52, divAlignmentHorizontal, o3 == null ? (DivAlignmentVertical) o3.a(rvoVar2) : null);
        if (qje.B(egkVar.h())) {
        }
        tls tlsVar4 = new tls() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj3) {
                View view5 = r52;
                Expression h22 = egkVar.h();
                DivAlignmentHorizontal divAlignmentHorizontal2 = h22 != null ? (DivAlignmentHorizontal) h22.a(rvoVar2) : null;
                Expression o22 = egkVar.o();
                a.a(view5, divAlignmentHorizontal2, o22 != null ? (DivAlignmentVertical) o22.a(rvoVar2) : null);
                return zy11.a;
            }
        };
        Expression h22 = egkVar.h();
        n.addSubscription(h22 == null ? h22.c(rvoVar2, tlsVar4) : null);
        Expression o22 = egkVar.o();
        n.addSubscription(o22 == null ? o22.c(rvoVar2, tlsVar4) : null);
        final n c2 = div2View.getViewComponent().c();
        u = egkVar.u();
        if (d2 == null) {
        }
        c2.getClass();
        if (u != null) {
        }
        egkVar2 = d2;
        rvoVar = rvoVar2;
        r18 = 0;
        egkVar3 = egkVar;
        view3 = r52;
        egkVar4 = egkVar2;
        final View r432 = view3;
        final rvo rvoVar422 = rvoVar;
        egkVar5 = egkVar3;
        r0.d.d(r432, egkVar5, egkVar4, rvoVar422, n);
        if (!qje.k(egkVar5.a(), egkVar4 != null ? egkVar4.a() : null)) {
        }
        r0.b(r432, aw5Var, egkVar5, egkVar4, n, true, null);
        egkVar6 = egkVar5;
        r5 = r432;
        DivFocus p622 = egkVar6.p();
        if (p622 != null) {
        }
        DivBorder A22 = egkVar6.A();
        crk.a(aw5Var, (divBorder == null || crk.b(divBorder) || !r5.isFocused()) ? A22 : divBorder, r5);
        View.OnFocusChangeListener onFocusChangeListener322 = r5.getOnFocusChangeListener();
        if (!(onFocusChangeListener322 instanceof DivFocusBinder$FocusChangeListener)) {
        }
        final crk crkVar222 = r0.c;
        if (divFocusBinder$FocusChangeListener == null) {
        }
        if (divFocusBinder$FocusChangeListener == null) {
        }
        ?? r10222 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
            private List<v3k> blurActions;
            private DivBorder blurredBorder;
            private final aw5 context;
            private List<v3k> focusActions;
            private DivBorder focusedBorder;

            {
                this.context = aw5Var;
            }

            private final void applyBorder(View view5, DivBorder border) {
                crk crkVar2222 = crk.this;
                aw5 aw5Var2 = this.context;
                crkVar2222.getClass();
                crk.a(aw5Var2, border, view5);
            }

            private final void handle(List<v3k> list3, View view5, String str32) {
                crk.this.a.d(this.context, view5, list3, str32);
            }

            public final List<v3k> getBlurActions() {
                return this.blurActions;
            }

            public final DivBorder getBlurredBorder() {
                return this.blurredBorder;
            }

            public final List<v3k> getFocusActions() {
                return this.focusActions;
            }

            public final DivBorder getFocusedBorder() {
                return this.focusedBorder;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View v, boolean hasFocus) {
                DivBorder divBorder2 = this.focusedBorder;
                if (hasFocus) {
                    applyBorder(v, divBorder2);
                    List<v3k> list3 = this.focusActions;
                    if (list3 != null) {
                        handle(list3, v, "focus");
                        return;
                    }
                    return;
                }
                if (divBorder2 != null) {
                    applyBorder(v, this.blurredBorder);
                }
                List<v3k> list4 = this.blurActions;
                if (list4 != null) {
                    handle(list4, v, "blur");
                }
            }

            public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                this.focusActions = onFocus;
                this.blurActions = onBlur;
            }

            public final void setBorders(DivBorder focused, DivBorder blurred) {
                this.focusedBorder = focused;
                this.blurredBorder = blurred;
            }
        };
        r10222.setBorders(divBorder, A22);
        if (divFocusBinder$FocusChangeListener != null) {
        }
        r5.setOnFocusChangeListener(r10222);
        c(r5, egkVar6, egkVar4, rvoVar422, n);
        final ipl n2222 = div2View.getViewComponent().n();
        DivFocus p7222 = egkVar6.p();
        if (p7222 != null) {
        }
        if (!qje.k(expression, (egkVar4 != null || (p5 = egkVar4.p()) == null || (aVar9 = p5.c) == null) ? null : aVar9.b)) {
        }
        DivFocus p8222 = egkVar6.p();
        if (p8222 != null) {
        }
        if (!qje.k(expression2, (egkVar4 != null || (p4 = egkVar4.p()) == null || (aVar7 = p4.c) == null) ? null : aVar7.c)) {
        }
        DivFocus p9222 = egkVar6.p();
        if (p9222 != null) {
        }
        if (!qje.k(expression3, (egkVar4 != null || (p3 = egkVar4.p()) == null || (aVar5 = p3.c) == null) ? null : aVar5.d)) {
        }
        DivFocus p10222 = egkVar6.p();
        if (p10222 != null) {
        }
        if (!qje.k(expression4, (egkVar4 != null || (p2 = egkVar4.p()) == null || (aVar3 = p2.c) == null) ? null : aVar3.e)) {
        }
        DivFocus p11222 = egkVar6.p();
        if (p11222 != null) {
        }
        if (!qje.k(expression5, (egkVar4 != null || (p = egkVar4.p()) == null || (aVar = p.c) == null) ? null : aVar.a)) {
        }
        DivFocus p12222 = egkVar6.p();
        if (p12222 == null) {
        }
        DivFocus p13222 = egkVar6.p();
        if (p13222 == null) {
        }
        View.OnFocusChangeListener onFocusChangeListener2222 = r5.getOnFocusChangeListener();
        if (!(onFocusChangeListener2222 instanceof DivFocusBinder$FocusChangeListener)) {
        }
        if (divFocusBinder$FocusChangeListener2 == null) {
        }
        if (divFocusBinder$FocusChangeListener2 != null) {
        }
        divTransform = null;
        ?? r42222 = new View.OnFocusChangeListener(aw5Var) { // from class: com.yandex.div.core.view2.divs.DivFocusBinder$FocusChangeListener
            private List<v3k> blurActions;
            private DivBorder blurredBorder;
            private final aw5 context;
            private List<v3k> focusActions;
            private DivBorder focusedBorder;

            {
                this.context = aw5Var;
            }

            private final void applyBorder(View view5, DivBorder border) {
                crk crkVar2222 = crk.this;
                aw5 aw5Var2 = this.context;
                crkVar2222.getClass();
                crk.a(aw5Var2, border, view5);
            }

            private final void handle(List<v3k> list3, View view5, String str32) {
                crk.this.a.d(this.context, view5, list3, str32);
            }

            public final List<v3k> getBlurActions() {
                return this.blurActions;
            }

            public final DivBorder getBlurredBorder() {
                return this.blurredBorder;
            }

            public final List<v3k> getFocusActions() {
                return this.focusActions;
            }

            public final DivBorder getFocusedBorder() {
                return this.focusedBorder;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View v, boolean hasFocus) {
                DivBorder divBorder2 = this.focusedBorder;
                if (hasFocus) {
                    applyBorder(v, divBorder2);
                    List<v3k> list3 = this.focusActions;
                    if (list3 != null) {
                        handle(list3, v, "focus");
                        return;
                    }
                    return;
                }
                if (divBorder2 != null) {
                    applyBorder(v, this.blurredBorder);
                }
                List<v3k> list4 = this.blurActions;
                if (list4 != null) {
                    handle(list4, v, "blur");
                }
            }

            public final void setActions(List<v3k> onFocus, List<v3k> onBlur) {
                this.focusActions = onFocus;
                this.blurActions = onBlur;
            }

            public final void setBorders(DivBorder focused, DivBorder blurred) {
                this.focusedBorder = focused;
                this.blurredBorder = blurred;
            }
        };
        if (divFocusBinder$FocusChangeListener2 != null) {
        }
        r42222.setActions(list, list2);
        r5.setOnFocusChangeListener(r42222);
        e eVar22222 = r0;
        view4 = r5;
        if (!qje.k(egkVar6.getVisibility(), egkVar4 == null ? egkVar4.getVisibility() : divTransform)) {
        }
        m = egkVar6.m();
        if (egkVar4 == null) {
        }
        if (m == null) {
        }
        if (qje.k(m == null ? m.c : divTransform, m2 == null ? m2.c : divTransform)) {
        }
        a.g(egkVar6, rvoVar422, view4);
        m3 = egkVar6.m();
        if (m3 != null) {
        }
        i = egkVar6.i();
        if (i != null) {
        }
        if (egkVar6 instanceof muk) {
        }
    }
}
