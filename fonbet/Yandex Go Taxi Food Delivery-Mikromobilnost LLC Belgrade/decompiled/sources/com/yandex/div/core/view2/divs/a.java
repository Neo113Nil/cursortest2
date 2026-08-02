package com.yandex.div.core.view2.divs;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.c;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibilityAction;
import defpackage.a4l;
import defpackage.afk;
import defpackage.aw5;
import defpackage.bvf0;
import defpackage.cjk;
import defpackage.cxk;
import defpackage.d5k;
import defpackage.e5k;
import defpackage.egk;
import defpackage.f1k;
import defpackage.f5k;
import defpackage.f9l;
import defpackage.g5k;
import defpackage.h090;
import defpackage.h8;
import defpackage.hgk;
import defpackage.hi91;
import defpackage.i4l;
import defpackage.j73;
import defpackage.jnk;
import defpackage.jzv;
import defpackage.kvo;
import defpackage.kz;
import defpackage.lml;
import defpackage.m05;
import defpackage.m810;
import defpackage.msk;
import defpackage.ner;
import defpackage.ngh0;
import defpackage.nml;
import defpackage.nnk;
import defpackage.ny61;
import defpackage.o05;
import defpackage.pdk;
import defpackage.q94;
import defpackage.qje;
import defpackage.rcc;
import defpackage.rvo;
import defpackage.sls;
import defpackage.sqk;
import defpackage.t9l;
import defpackage.tje;
import defpackage.tls;
import defpackage.ugk;
import defpackage.uml;
import defpackage.uvo;
import defpackage.v3k;
import defpackage.w511;
import defpackage.wls;
import defpackage.y83;
import defpackage.ycc;
import defpackage.z3l;
import defpackage.z4k;
import defpackage.zgv;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final void A(final TextView textView, final Expression expression, final Expression expression2, Expression expression3, Expression expression4, final rvo rvoVar, uvo uvoVar) {
        if (qje.k(expression, expression3) && qje.k(expression2, expression4)) {
            return;
        }
        d(textView, expression, expression2, rvoVar);
        if (expression != null) {
            if ((expression instanceof kvo) && (expression2 instanceof kvo)) {
                return;
            }
            tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    a.d(textView, expression, expression2, rvoVar);
                    return zy11.a;
                }
            };
            uvoVar.addSubscription(expression.c(rvoVar, tlsVar));
            uvoVar.addSubscription(expression2.c(rvoVar, tlsVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(final TextView textView, final Expression expression, final Expression expression2, final Expression expression3, final Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, egk egkVar, final nml nmlVar, final rvo rvoVar) {
        rvo rvoVar2;
        f1k f1kVar;
        if (egkVar != null && qje.k(expression, expression5) && qje.k(expression2, expression6) && qje.k(expression3, expression7) && qje.k(expression4, expression8)) {
            return;
        }
        h(textView, expression, expression2, expression3, nmlVar, rvoVar);
        if (qje.B(expression) && qje.B(expression2) && qje.B(expression3)) {
            rvoVar2 = rvoVar;
        } else {
            tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTypeface$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    a.h(textView, expression, expression2, expression3, nmlVar, rvoVar);
                    return zy11.a;
                }
            };
            rvoVar2 = rvoVar;
            if (expression != null) {
                ((uvo) textView).addSubscription(expression.c(rvoVar2, tlsVar));
            }
            if (expression2 != null) {
                ((uvo) textView).addSubscription(expression2.c(rvoVar2, tlsVar));
            }
            if (expression3 != null) {
                ((uvo) textView).addSubscription(expression3.c(rvoVar2, tlsVar));
            }
        }
        if (qje.B(expression4)) {
            return;
        }
        uvo uvoVar = (uvo) textView;
        if (expression4 != null) {
            final rvo rvoVar3 = rvoVar2;
            f1kVar = expression4.c(rvoVar3, new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontVariationSettings$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Integer num;
                    TextView textView2 = textView;
                    Expression expression9 = expression2;
                    Expression expression10 = expression3;
                    Expression expression11 = expression4;
                    rvo rvoVar4 = rvoVar3;
                    String str = null;
                    DivFontWeight divFontWeight = expression9 != null ? (DivFontWeight) expression9.a(rvoVar4) : null;
                    if (expression10 != null) {
                        long longValue = ((Number) expression10.a(rvoVar4)).longValue();
                        long j = longValue >> 31;
                        num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                    } else {
                        num = null;
                    }
                    JSONObject jSONObject = expression11 != null ? (JSONObject) expression11.a(rvoVar4) : null;
                    boolean z = (divFontWeight == null && num == null) ? false : true;
                    int x = qje.x(divFontWeight, num);
                    if (jSONObject != null && jSONObject.length() != 0) {
                        if (z && !jSONObject.has("wght")) {
                            jSONObject.put("wght", x);
                        }
                        ListBuilder a = rcc.a();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj2 = jSONObject.get(next);
                            if (obj2 instanceof Number) {
                                a.add("'" + next + "' " + ((Number) obj2));
                            }
                        }
                        str = kotlin.collections.a.X(a.j(), Extension.FIX_SPACE, null, null, null, 62);
                    } else if (z) {
                        str = "'wght' " + Integer.valueOf(x);
                    }
                    textView2.setFontVariationSettings(str);
                    return zy11.a;
                }
            });
        } else {
            f1kVar = null;
        }
        uvoVar.addSubscription(f1kVar);
    }

    public static final boolean C(View view) {
        do {
            ViewParent parent = view.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view == null || view.getParent() == null) {
                return false;
            }
        } while (!view.performLongClick());
        return true;
    }

    public static final int D(Long l, DisplayMetrics displayMetrics) {
        Integer num;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return m810.b(E(num, displayMetrics));
    }

    public static final float E(Number number, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, number != null ? number.floatValue() : 0.0f, displayMetrics);
    }

    public static final int F(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i = o05.a[divSizeUnit.ordinal()];
        if (i == 1) {
            return o(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return D(Long.valueOf(j), displayMetrics);
        }
        if (i == 3) {
            long j2 = j >> 31;
            return (j2 == 0 || j2 == -1) ? (int) j : j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        w511.b();
        return 0;
    }

    public static final int G(jnk jnkVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        Expression expression = jnkVar.a;
        Expression expression2 = jnkVar.b;
        int i = o05.a[((DivSizeUnit) expression.a(rvoVar)).ordinal()];
        if (i == 1) {
            return p((Number) expression2.a(rvoVar), displayMetrics);
        }
        if (i == 2) {
            return m810.b(E((Number) expression2.a(rvoVar), displayMetrics));
        }
        if (i == 3) {
            return (int) ((Number) expression2.a(rvoVar)).doubleValue();
        }
        w511.b();
        return 0;
    }

    public static final int H(sqk sqkVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        Expression expression = sqkVar.a;
        Expression expression2 = sqkVar.b;
        int i = o05.a[((DivSizeUnit) expression.a(rvoVar)).ordinal()];
        if (i == 1) {
            return o((Long) expression2.a(rvoVar), displayMetrics);
        }
        if (i == 2) {
            return D((Long) expression2.a(rvoVar), displayMetrics);
        }
        if (i != 3) {
            w511.b();
            return 0;
        }
        long longValue = ((Number) expression2.a(rvoVar)).longValue();
        long j = longValue >> 31;
        return (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final int I(t9l t9lVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        Expression expression = t9lVar.b;
        int i = o05.a[((DivSizeUnit) t9lVar.a.a(rvoVar)).ordinal()];
        if (i == 1) {
            return o((Long) expression.a(rvoVar), displayMetrics);
        }
        if (i == 2) {
            return D((Long) expression.a(rvoVar), displayMetrics);
        }
        if (i != 3) {
            w511.b();
            return 0;
        }
        long longValue = ((Number) expression.a(rvoVar)).longValue();
        long j = longValue >> 31;
        return (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float J(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i = o05.a[divSizeUnit.ordinal()];
        if (i == 1) {
            return q(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return E(Long.valueOf(j), displayMetrics);
        }
        if (i == 3) {
            return j;
        }
        w511.b();
        return 0.0f;
    }

    public static final float K(sqk sqkVar, DisplayMetrics displayMetrics, rvo rvoVar) {
        return J(((Number) sqkVar.b.a(rvoVar)).longValue(), (DivSizeUnit) sqkVar.a.a(rvoVar), displayMetrics);
    }

    public static final void L(final ViewGroup viewGroup, final Div2View div2View, final List list, List list2) {
        Collection collection;
        final com.yandex.div.core.view2.i G = div2View.getDiv2Component().G();
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                collection = EmptyList.a;
                if (!hasNext) {
                    break;
                }
                egk d = ((cxk) it.next()).a.d();
                Collection l = d.l();
                if (l != null) {
                    collection = l;
                }
                ycc.r(kotlin.collections.a.m0(uml.d(d), collection), arrayList);
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((f9l) it2.next()).b());
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                cxk cxkVar = (cxk) it3.next();
                List d2 = uml.d(cxkVar.a.d());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : d2) {
                    if (!hashSet.contains(((DivVisibilityAction) obj).c)) {
                        arrayList2.add(obj);
                    }
                }
                Collection l2 = cxkVar.a.d().l();
                if (l2 == null) {
                    l2 = collection;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : l2) {
                    if (!hashSet.contains(((nnk) obj2).d)) {
                        arrayList3.add(obj2);
                    }
                }
                G.k(div2View, cxkVar.b, null, cxkVar.a, arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                ViewGroup viewGroup2 = viewGroup;
                List list4 = list;
                h8 h8Var = new h8(3, viewGroup2);
                Iterator it4 = list4.iterator();
                while (h8Var.hasNext() && it4.hasNext()) {
                    Pair pair = new Pair(h8Var.next(), it4.next());
                    View view2 = (View) pair.getFirst();
                    cxk cxkVar2 = (cxk) pair.getSecond();
                    com.yandex.div.core.view2.i.l(G, div2View, cxkVar2.b, view2, cxkVar2.a);
                }
            }
        });
    }

    public static final void M(tls tlsVar, View view) {
        if (!((Boolean) ((BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1) tlsVar).invoke(view)).booleanValue() || !(view instanceof ViewGroup)) {
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
            } else {
                M(tlsVar, childAt);
                i = i2;
            }
        }
    }

    public static final int N(Long l, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        Integer num;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return O(num, displayMetrics, divSizeUnit);
    }

    public static final int O(Number number, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        int i = o05.a[divSizeUnit.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return 0;
                }
                i2 = 0;
            }
        }
        return m810.b(TypedValue.applyDimension(i2, number != null ? number.floatValue() : 0.0f, displayMetrics));
    }

    public static final boolean P(AspectImageView aspectImageView) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = aspectImageView.getLayoutParams();
        return layoutParams != null && ((i = layoutParams.width) == -2 || i == -3) && ((i2 = layoutParams.height) == -2 || i2 == -3);
    }

    public static final void a(View view, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        int b = uml.b(divAlignmentHorizontal, divAlignmentVertical);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != b) {
                divLayoutParams.setGravity(b);
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
        }
        boolean z = divAlignmentVertical == DivAlignmentVertical.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
        if (divLayoutParams2 == null || divLayoutParams2.getIsBaselineAligned() == z) {
            return;
        }
        divLayoutParams2.setBaselineAligned(z);
        view.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ViewGroup viewGroup, boolean z) {
        msk mskVar = viewGroup instanceof msk ? (msk) viewGroup : null;
        if (mskVar != null) {
            mskVar.setNeedClipping(z);
        }
        ViewParent parent = viewGroup.getParent();
        if (z || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final View view, final aw5 aw5Var, v3k v3kVar, List list, final List list2, final List list3, final List list4, final List list5, final List list6, final List list7, final pdk pdkVar, final Expression expression) {
        final List singletonList;
        final c o = aw5Var.a.getDiv2Component().o();
        List list8 = list;
        if (list8 == null || list8.isEmpty()) {
            singletonList = v3kVar != null ? Collections.singletonList(v3kVar) : null;
        } else {
            singletonList = list;
        }
        o.getClass();
        rvo rvoVar = aw5Var.b;
        final sls slsVar = new sls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v13, types: [android.view.View$OnHoverListener, android.view.View$OnTouchListener] */
            /* JADX WARN: Type inference failed for: r12v14 */
            /* JADX WARN: Type inference failed for: r12v15 */
            /* JADX WARN: Type inference failed for: r12v17 */
            /* JADX WARN: Type inference failed for: r12v18 */
            @Override // defpackage.sls
            public final Object invoke() {
                Object obj;
                final Expression expression2;
                final c cVar;
                Object obj2;
                final aw5 aw5Var2;
                final View view2;
                c cVar2;
                int i;
                View view3;
                Expression expression3;
                int i2;
                int i3;
                Object obj3;
                pdk pdkVar2;
                DivGestureListener divGestureListener;
                final aw5 aw5Var3;
                c cVar3;
                Object obj4;
                ?? r12;
                final View view4;
                wls wlsVar;
                List<v3k> list9 = singletonList;
                List<v3k> list10 = EmptyList.a;
                List<v3k> list11 = list9 == null ? list10 : list9;
                List<v3k> list12 = list3;
                final List<v3k> list13 = list12 == null ? list10 : list12;
                List<v3k> list14 = list2;
                final List<v3k> list15 = list14 == null ? list10 : list14;
                List<v3k> list16 = list4;
                if (list16 == null) {
                    list16 = list10;
                }
                List<v3k> list17 = list5;
                List<v3k> list18 = list17 == null ? list10 : list17;
                List<v3k> list19 = list6;
                List<v3k> list20 = list19 == null ? list10 : list19;
                List<v3k> list21 = list7;
                if (list21 != null) {
                    list10 = list21;
                }
                final c cVar4 = o;
                final aw5 aw5Var4 = aw5Var;
                final View view5 = view;
                pdk pdkVar3 = pdkVar;
                final Expression expression4 = expression;
                cVar4.getClass();
                boolean z = cVar4.c;
                boolean z2 = cVar4.d;
                List<v3k> list22 = list15;
                int i4 = 0;
                DivGestureListener divGestureListener2 = new DivGestureListener(!list22.isEmpty() || bvf0.L(view5));
                boolean isEmpty = list11.isEmpty();
                if (list15.isEmpty()) {
                    if (!z || isEmpty) {
                        view5.setOnLongClickListener(null);
                        view5.setLongClickable(false);
                    } else if (bvf0.L(view5)) {
                        view5.setOnLongClickListener(new e5k(cVar4.e, i4));
                        view5.setTag(ngh0.div_penetrating_longtap_tag, Boolean.TRUE);
                    } else {
                        view5.setOnLongClickListener(null);
                        view5.setLongClickable(false);
                        view5.setTag(ngh0.div_penetrating_longtap_tag, null);
                    }
                    cVar = cVar4;
                    expression2 = expression4;
                } else {
                    final Div2View div2View = aw5Var4.a;
                    final rvo rvoVar2 = aw5Var4.b;
                    if (z) {
                        view5.setTag(ngh0.div_penetrating_longtap_tag, Boolean.TRUE);
                    }
                    Iterator<T> it = list15.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        List list23 = ((v3k) obj).e;
                        if (list23 != null && !list23.isEmpty() && !z2) {
                            break;
                        }
                    }
                    final v3k v3kVar2 = (v3k) obj;
                    if (v3kVar2 == null) {
                        expression2 = expression4;
                        view5.setOnLongClickListener(new View.OnLongClickListener() { // from class: b5k
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view6) {
                                bvf0.e(view6, expression4, div2View.getInputFocusTracker(), rvoVar2);
                                cVar4.a.d(aw5Var4, view5, list15, "long_click");
                                return true;
                            }
                        });
                    } else {
                        expression2 = expression4;
                        List list24 = v3kVar2.e;
                        if (list24 != null) {
                            Div2View div2View2 = aw5Var4.a;
                            view5.getContext();
                            final h090 h090Var = new h090(view5);
                            h090Var.b(new f5k(cVar4, aw5Var4, list24));
                            div2View2.clearSubscriptions();
                            div2View2.subscribe(new g5k(h090Var));
                            final List<v3k> list25 = list15;
                            cVar = cVar4;
                            list15 = list25;
                            view5.setOnLongClickListener(new View.OnLongClickListener() { // from class: c5k
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view6) {
                                    UUID.randomUUID().toString();
                                    y4k y4kVar = c.this.b;
                                    v3k v3kVar3 = v3kVar2;
                                    rvo rvoVar3 = rvoVar2;
                                    y4kVar.b(v3kVar3, rvoVar3);
                                    bvf0.e(view6, expression2, div2View.getInputFocusTracker(), rvoVar3);
                                    h090Var.a().onClick(view5);
                                    for (v3k v3kVar4 : list25) {
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                    cVar = cVar4;
                }
                if (list13.isEmpty()) {
                    divGestureListener2.setOnDoubleTapListener(null);
                    aw5Var2 = aw5Var4;
                    expression3 = expression2;
                    i = 1;
                    view3 = view5;
                } else {
                    final Div2View div2View3 = aw5Var4.a;
                    final rvo rvoVar3 = aw5Var4.b;
                    Iterator<T> it2 = list13.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        List list26 = ((v3k) obj2).e;
                        if (list26 != null && !list26.isEmpty() && !z2) {
                            break;
                        }
                    }
                    final v3k v3kVar3 = (v3k) obj2;
                    if (v3kVar3 == null) {
                        aw5Var2 = aw5Var4;
                        view2 = view5;
                        final c cVar5 = cVar;
                        final Expression expression5 = expression2;
                        i = 1;
                        cVar2 = cVar5;
                        divGestureListener2.setOnDoubleTapListener(new sls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$menuAction$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                bvf0.e(view2, expression5, div2View3.getInputFocusTracker(), rvoVar3);
                                cVar5.a.d(aw5Var2, view2, list13, "double_click");
                                return zy11.a;
                            }
                        });
                    } else {
                        aw5Var2 = aw5Var4;
                        view2 = view5;
                        cVar2 = cVar;
                        i = 1;
                        List list27 = v3kVar3.e;
                        if (list27 != null) {
                            Div2View div2View4 = aw5Var2.a;
                            view2.getContext();
                            final h090 h090Var2 = new h090(view2);
                            h090Var2.b(new f5k(cVar2, aw5Var2, list27));
                            div2View4.clearSubscriptions();
                            div2View4.subscribe(new g5k(h090Var2));
                            cVar = cVar2;
                            sls slsVar2 = new sls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    c.this.getClass();
                                    rvo rvoVar4 = rvoVar3;
                                    c.this.b.b(v3kVar3, rvoVar4);
                                    bvf0.e(view2, expression2, div2View3.getInputFocusTracker(), rvoVar3);
                                    h090 h090Var3 = h090Var2;
                                    h090Var3.getClass();
                                    new zgv(25, h090Var3).onClick(view2);
                                    return zy11.a;
                                }
                            };
                            view3 = view2;
                            expression3 = expression2;
                            divGestureListener2.setOnDoubleTapListener(slsVar2);
                        }
                    }
                    cVar = cVar2;
                    view3 = view2;
                    expression3 = expression2;
                }
                int i5 = (list22.isEmpty() && list13.isEmpty()) ? 0 : i;
                Div2View div2View5 = aw5Var2.a;
                rvo rvoVar4 = aw5Var2.b;
                if (!list11.isEmpty()) {
                    i2 = 0;
                    Iterator<T> it3 = list11.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = i;
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        i3 = i;
                        List list28 = ((v3k) obj3).e;
                        if (list28 != null && !list28.isEmpty() && !z2) {
                            break;
                        }
                        i = i3;
                    }
                    v3k v3kVar4 = (v3k) obj3;
                    if (v3kVar4 == null) {
                        pdkVar2 = pdkVar3;
                        aw5 aw5Var5 = aw5Var2;
                        obj4 = null;
                        divGestureListener = divGestureListener2;
                        c cVar6 = cVar;
                        d5k d5kVar = new d5k(aw5Var5, rvoVar4, view3, div2View5, cVar6, expression3, list11);
                        aw5Var3 = aw5Var5;
                        cVar3 = cVar6;
                        c.b(view3, divGestureListener, d5kVar);
                    } else {
                        pdkVar2 = pdkVar3;
                        divGestureListener = divGestureListener2;
                        Expression expression6 = expression3;
                        aw5Var3 = aw5Var2;
                        Object obj5 = null;
                        cVar3 = cVar;
                        List list29 = v3kVar4.e;
                        obj4 = obj5;
                        if (list29 != null) {
                            Div2View div2View6 = aw5Var3.a;
                            view3.getContext();
                            h090 h090Var3 = new h090(view3);
                            h090Var3.b(new f5k(cVar3, aw5Var3, list29));
                            div2View6.clearSubscriptions();
                            div2View6.subscribe(new g5k(h090Var3));
                            cVar = cVar3;
                            c.b(view3, divGestureListener, new d5k(cVar, div2View5, rvoVar4, view3, v3kVar4, expression6, h090Var3));
                            r12 = obj5;
                        }
                    }
                    cVar = cVar3;
                    r12 = obj4;
                } else if (i5 != 0) {
                    c.b(view3, divGestureListener2, new q94(i, expression3, div2View5, rvoVar4));
                    i3 = i;
                    pdkVar2 = pdkVar3;
                    divGestureListener = divGestureListener2;
                    aw5Var3 = aw5Var2;
                    r12 = 0;
                    i2 = 0;
                } else {
                    divGestureListener2.setOnSingleTapListener(null);
                    view3.setOnClickListener(null);
                    i2 = 0;
                    view3.setClickable(false);
                    i3 = i;
                    pdkVar2 = pdkVar3;
                    divGestureListener = divGestureListener2;
                    aw5Var3 = aw5Var2;
                    r12 = 0;
                }
                List[] listArr = new List[3];
                listArr[i2] = list11;
                listArr[i3] = list15;
                listArr[2] = list13;
                wls n = a.n(view3, aw5Var3, !tje.b(listArr) ? pdkVar2 : r12, divGestureListener);
                if (list20.isEmpty() && list10.isEmpty()) {
                    wlsVar = r12;
                    view4 = view3;
                } else {
                    final List<v3k> list30 = list10;
                    final View view6 = view3;
                    final List<v3k> list31 = list20;
                    final aw5 aw5Var6 = aw5Var3;
                    final c cVar7 = cVar;
                    wls wlsVar2 = new wls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$createPressTouchListener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            int action = ((MotionEvent) obj7).getAction();
                            boolean z3 = true;
                            if (action == 0) {
                                c.this.a.d(aw5Var6, view6, list31, "press");
                            } else if (action == 1 || action == 3) {
                                c.this.a.d(aw5Var6, view6, list30, "release");
                            } else {
                                z3 = false;
                            }
                            return Boolean.valueOf(z3);
                        }
                    };
                    aw5Var3 = aw5Var6;
                    view4 = view6;
                    wlsVar = wlsVar2;
                }
                if (list16.isEmpty() && list18.isEmpty()) {
                    view4.setOnHoverListener(r12);
                } else {
                    final List<v3k> list32 = list16;
                    final List<v3k> list33 = list18;
                    final c cVar8 = cVar;
                    view4.setOnHoverListener(new View.OnHoverListener() { // from class: a5k
                        @Override // android.view.View.OnHoverListener
                        public final boolean onHover(View view7, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            c cVar9 = c.this;
                            aw5 aw5Var7 = aw5Var3;
                            View view8 = view4;
                            if (action == 9) {
                                cVar9.a.d(aw5Var7, view8, list32, "hover");
                                return false;
                            }
                            if (action != 10) {
                                return false;
                            }
                            cVar9.a.d(aw5Var7, view8, list33, "unhover");
                            return false;
                        }
                    });
                }
                wls[] wlsVarArr = new wls[2];
                wlsVarArr[i2] = n;
                wlsVarArr[i3] = wlsVar;
                List A = j73.A(wlsVarArr);
                if (A.isEmpty()) {
                    view4.setOnTouchListener(r12);
                } else {
                    view4.setOnTouchListener(new z4k(i2, A));
                }
                return zy11.a;
            }
        };
        bvf0.f(view, singletonList, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls.this.invoke();
                return zy11.a;
            }
        });
        bvf0.f(view, list2, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls.this.invoke();
                return zy11.a;
            }
        });
        bvf0.f(view, list3, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls.this.invoke();
                return zy11.a;
            }
        });
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls.this.invoke();
                return zy11.a;
            }
        };
        if (view instanceof uvo) {
            ((uvo) view).addSubscription(expression.c(rvoVar, tlsVar));
        }
        slsVar.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(TextView textView, Expression expression, Expression expression2, rvo rvoVar) {
        ((ner) textView).setFixedLineHeight(expression != null ? N(Long.valueOf(((Number) expression.a(rvoVar)).longValue()), textView.getResources().getDisplayMetrics(), (DivSizeUnit) expression2.a(rvoVar)) : -1);
    }

    public static final void e(View view, DivEdgeInsets divEdgeInsets, rvo rvoVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (divEdgeInsets != null) {
            DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.g.a(rvoVar);
            i = N((Long) divEdgeInsets.c.a(rvoVar), displayMetrics, divSizeUnit);
            i2 = N((Long) divEdgeInsets.f.a(rvoVar), displayMetrics, divSizeUnit);
            i3 = N((Long) divEdgeInsets.d.a(rvoVar), displayMetrics, divSizeUnit);
            i4 = N((Long) divEdgeInsets.a.a(rvoVar), displayMetrics, divSizeUnit);
            Expression expression = divEdgeInsets.e;
            Integer valueOf = expression != null ? Integer.valueOf(N((Long) expression.a(rvoVar), displayMetrics, divSizeUnit)) : null;
            Expression expression2 = divEdgeInsets.b;
            num = expression2 != null ? Integer.valueOf(N((Long) expression2.a(rvoVar), displayMetrics, divSizeUnit)) : null;
            r3 = valueOf;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4 && ((r3 == null || marginLayoutParams.getMarginStart() == r3.intValue()) && (num == null || marginLayoutParams.getMarginEnd() == num.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i4;
        if (r3 == null && num == null) {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i3;
        } else {
            marginLayoutParams.setMarginStart(r3 != null ? r3.intValue() : 0);
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void f(View view, DivEdgeInsets divEdgeInsets, rvo rvoVar) {
        if (divEdgeInsets == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        Expression expression = divEdgeInsets.a;
        Expression expression2 = divEdgeInsets.f;
        Expression expression3 = divEdgeInsets.b;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.g.a(rvoVar);
        Expression expression4 = divEdgeInsets.e;
        if (expression4 == null && expression3 == null) {
            view.setPadding(F(((Number) divEdgeInsets.c.a(rvoVar)).longValue(), divSizeUnit, displayMetrics), F(((Number) expression2.a(rvoVar)).longValue(), divSizeUnit, displayMetrics), F(((Number) divEdgeInsets.d.a(rvoVar)).longValue(), divSizeUnit, displayMetrics), F(((Number) expression.a(rvoVar)).longValue(), divSizeUnit, displayMetrics));
        } else {
            view.setPaddingRelative(expression4 != null ? F(((Number) expression4.a(rvoVar)).longValue(), divSizeUnit, displayMetrics) : 0, F(((Number) expression2.a(rvoVar)).longValue(), divSizeUnit, displayMetrics), expression3 != null ? F(((Number) expression3.a(rvoVar)).longValue(), divSizeUnit, displayMetrics) : 0, F(((Number) expression.a(rvoVar)).longValue(), divSizeUnit, displayMetrics));
        }
    }

    public static final void g(egk egkVar, rvo rvoVar, View view) {
        zy11 zy11Var;
        Expression expression;
        DivTransform m = egkVar.m();
        if (m == null || (expression = m.c) == null) {
            zy11Var = null;
        } else {
            view.setRotation((float) ((Number) expression.a(rvoVar)).doubleValue());
            zy11Var = zy11.a;
        }
        if (zy11Var == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.add(view, new kz(view, view, m, rvoVar, 2));
        } else {
            view.setPivotX(w(view, view.getWidth(), m.a, rvoVar));
            view.setPivotY(w(view, view.getHeight(), m.b, rvoVar));
        }
    }

    public static final void h(TextView textView, Expression expression, Expression expression2, Expression expression3, nml nmlVar, rvo rvoVar) {
        Integer num = null;
        lml a = nmlVar.a(expression != null ? (String) expression.a(rvoVar) : null);
        DivFontWeight divFontWeight = expression2 != null ? (DivFontWeight) expression2.a(rvoVar) : null;
        if (expression3 != null) {
            long longValue = ((Number) expression3.a(rvoVar)).longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        Typeface d = a.d(qje.x(divFontWeight, num));
        if (d == null) {
            d = Typeface.DEFAULT;
        }
        textView.setTypeface(d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final View view, afk afkVar, afk afkVar2, rvo rvoVar) {
        Expression expression;
        Expression expression2;
        if (view instanceof y83) {
            f1k f1kVar = null;
            if (qje.k(afkVar != null ? afkVar.a : null, afkVar2 != null ? afkVar2.a : null)) {
                return;
            }
            y83 y83Var = (y83) view;
            Double d = (afkVar == null || (expression2 = afkVar.a) == null) ? null : (Double) expression2.a(rvoVar);
            y83Var.setAspectRatio(d != null ? (float) d.doubleValue() : 0.0f);
            if (qje.B(afkVar != null ? afkVar.a : null) || !(view instanceof uvo)) {
                return;
            }
            uvo uvoVar = (uvo) view;
            if (afkVar != null && (expression = afkVar.a) != null) {
                f1kVar = expression.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindAspectRatio$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ((y83) view).setAspectRatio((float) ((Number) obj).doubleValue());
                        return zy11.a;
                    }
                });
            }
            uvoVar.addSubscription(f1kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final ViewGroup viewGroup, Expression expression, Expression expression2, rvo rvoVar) {
        if (qje.k(expression, expression2)) {
            return;
        }
        b(viewGroup, ((Boolean) expression.a(rvoVar)).booleanValue());
        if (expression instanceof kvo) {
            return;
        }
        msk mskVar = viewGroup instanceof msk ? (msk) viewGroup : null;
        if (mskVar != null) {
            mskVar.addSubscription(expression.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindClipChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    a.b(viewGroup, ((Boolean) obj).booleanValue());
                    return zy11.a;
                }
            }));
        }
    }

    public static final void k(DivCollectionItemBuilder divCollectionItemBuilder, rvo rvoVar, tls tlsVar) {
        rvo f;
        divCollectionItemBuilder.a.c(rvoVar, tlsVar);
        JSONArray jSONArray = (JSONArray) divCollectionItemBuilder.a.a(rvoVar);
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i < length) {
                Object obj = jSONArray.get(i);
                if (obj != null && (f = com.yandex.div.internal.core.a.f(divCollectionItemBuilder, obj, i, rvoVar)) != null) {
                    rvoVar = f;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        Iterator it = divCollectionItemBuilder.c.iterator();
        while (it.hasNext()) {
            ((cjk) it.next()).c.c(rvoVar, tlsVar);
        }
    }

    public static final void l(View view, aw5 aw5Var, hgk hgkVar) {
        M(new BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1(hgkVar, aw5Var), view);
    }

    public static final void m(View view, jzv jzvVar) {
        View view2;
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        jzvVar.getClass();
        WeakReference weakReference = jzv.d;
        if (weakReference == null || (view2 = (View) weakReference.get()) == null) {
            return;
        }
        view2.clearFocus();
        hi91.a(view2);
    }

    public static final wls n(View view, aw5 aw5Var, pdk pdkVar, DivGestureListener divGestureListener) {
        GestureDetector gestureDetector;
        wls a = pdkVar != null ? com.yandex.div.core.view2.animations.h.a(pdkVar, aw5Var.b, view) : null;
        if (divGestureListener != null) {
            if (((divGestureListener.getOnSingleTapListener() == null && divGestureListener.getOnDoubleTapListener() == null) ? null : divGestureListener) != null) {
                gestureDetector = new GestureDetector(aw5Var.a.getContext(), divGestureListener, new Handler(Looper.getMainLooper()));
                if (a == null || gestureDetector != null) {
                    return new BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1(a, gestureDetector);
                }
                return null;
            }
        }
        gestureDetector = null;
        if (a == null) {
        }
        return new BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1(a, gestureDetector);
    }

    public static final int o(Long l, DisplayMetrics displayMetrics) {
        Integer num;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return p(num, displayMetrics);
    }

    public static final int p(Number number, DisplayMetrics displayMetrics) {
        return m810.b(q(number, displayMetrics));
    }

    public static final float q(Number number, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, number != null ? number.floatValue() : 0.0f, displayMetrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(View view, Canvas canvas) {
        com.yandex.div.core.view2.divs.widgets.a divBorderDrawer;
        int save = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            ugk ugkVar = view instanceof ugk ? (ugk) view : null;
            if (ugkVar != null && (divBorderDrawer = ugkVar.getDivBorderDrawer()) != null) {
                divBorderDrawer.d(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final msk s(View view) {
        if (view instanceof msk) {
            return (msk) view;
        }
        DivViewWrapper divViewWrapper = view instanceof DivViewWrapper ? (DivViewWrapper) view : null;
        if (divViewWrapper != null) {
            KeyEvent.Callback child = divViewWrapper.getChild();
            if (child instanceof msk) {
                return (msk) child;
            }
        }
        return null;
    }

    public static final int t(View view) {
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (height < 0) {
            return 0;
        }
        return height;
    }

    public static final int u(View view) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        if (width < 0) {
            return 0;
        }
        return width;
    }

    public static final aw5 v(View view) {
        msk s = s(view);
        if (s != null) {
            return s.getBindingContext();
        }
        return null;
    }

    public static final float w(View view, int i, z3l z3lVar, rvo rvoVar) {
        Object c = z3lVar.c();
        if (!(c instanceof a4l)) {
            return c instanceof i4l ? (((float) ((Number) ((i4l) c).a.a(rvoVar)).doubleValue()) / 100.0f) * i : i / 2.0f;
        }
        a4l a4lVar = (a4l) c;
        float longValue = ((Number) a4lVar.b.a(rvoVar)).longValue();
        int i2 = m05.a[((DivSizeUnit) a4lVar.a.a(rvoVar)).ordinal()];
        if (i2 == 1) {
            return q(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        if (i2 == 2) {
            return longValue;
        }
        if (i2 == 3) {
            return E(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        w511.b();
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(final TextView textView, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, egk egkVar, nml nmlVar, rvo rvoVar) {
        uvo uvoVar = (uvo) textView;
        y(textView, expression, expression2, expression10, expression11, rvoVar, uvoVar);
        z(textView, expression3, expression, expression12, expression10, rvoVar, uvoVar);
        if (!qje.k(expression4, expression13)) {
            textView.setTextColor(((Number) expression4.a(rvoVar)).intValue());
            if (!(expression4 instanceof kvo)) {
                ((uvo) textView).addSubscription(expression4.c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTextColor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        textView.setTextColor(((Number) obj).intValue());
                        return zy11.a;
                    }
                }));
            }
        }
        A(textView, expression5, expression2, expression14, expression11, rvoVar, uvoVar);
        B(textView, expression6, expression7, expression8, expression9, expression15, expression16, expression17, expression18, egkVar, nmlVar, rvoVar);
    }

    public static final void y(final TextView textView, final Expression expression, final Expression expression2, Expression expression3, Expression expression4, final rvo rvoVar, uvo uvoVar) {
        if (qje.k(expression, expression3) && qje.k(expression2, expression4)) {
            return;
        }
        int i = o05.a[((DivSizeUnit) expression2.a(rvoVar)).ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                }
                i2 = 0;
            }
        }
        textView.setTextSize(i2, ((Number) expression.a(rvoVar)).longValue());
        if ((expression instanceof kvo) && (expression2 instanceof kvo)) {
            return;
        }
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontSize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TextView textView2 = textView;
                Expression expression5 = expression;
                int i3 = o05.a[((DivSizeUnit) expression2.a(rvoVar)).ordinal()];
                int i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        i4 = 0;
                    }
                }
                textView2.setTextSize(i4, ((Number) expression5.a(r3)).longValue());
                return zy11.a;
            }
        };
        uvoVar.addSubscription(expression.c(rvoVar, tlsVar));
        uvoVar.addSubscription(expression2.c(rvoVar, tlsVar));
    }

    public static final void z(final TextView textView, final Expression expression, final Expression expression2, Expression expression3, Expression expression4, final rvo rvoVar, uvo uvoVar) {
        if (qje.k(expression, expression3) && qje.k(expression2, expression4)) {
            return;
        }
        textView.setLetterSpacing(((float) ((Number) expression.a(rvoVar)).doubleValue()) / ((Number) expression2.a(rvoVar)).floatValue());
        if ((expression instanceof kvo) && (expression2 instanceof kvo)) {
            return;
        }
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLetterSpacing$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                TextView textView2 = textView;
                Expression expression5 = expression;
                Expression expression6 = expression2;
                rvo rvoVar2 = rvoVar;
                textView2.setLetterSpacing(((float) ((Number) expression5.a(rvoVar2)).doubleValue()) / ((Number) expression6.a(rvoVar2)).floatValue());
                return zy11.a;
            }
        };
        uvoVar.addSubscription(expression2.c(rvoVar, tlsVar));
        uvoVar.addSubscription(expression.c(rvoVar, tlsVar));
    }
}
