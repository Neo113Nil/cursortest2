package com.yandex.div.internal.core;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.a;
import com.yandex.div2.b5;
import com.yandex.div2.db;
import com.yandex.div2.e5;
import com.yandex.div2.e9;
import com.yandex.div2.fa;
import com.yandex.div2.g3;
import com.yandex.div2.ma;
import com.yandex.div2.o2;
import com.yandex.div2.rd;
import com.yandex.div2.y4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.gzs;
import xsna.pn00;

/* compiled from: DivCollectionExtensions.kt */
/* loaded from: classes7.dex */
public final class DivCollectionExtensionsKt {
    public static final List<DivItemBuilderResult> build(o2 o2Var, ExpressionResolver expressionResolver) {
        JSONArray evaluate = o2Var.a.evaluate(expressionResolver);
        int length = evaluate.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            DivItemBuilderResult buildItem = buildItem(o2Var, evaluate.get(i), i, expressionResolver);
            if (buildItem != null) {
                arrayList.add(buildItem);
            }
        }
        return arrayList;
    }

    private static final DivItemBuilderResult buildItem(o2 o2Var, Object obj, int i, ExpressionResolver expressionResolver) {
        Object obj2;
        ExpressionResolver itemResolver = getItemResolver(o2Var, obj, i, expressionResolver);
        if (itemResolver == null) {
            return null;
        }
        Iterator<T> it = o2Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((o2.a) obj2).c.evaluate(itemResolver).booleanValue()) {
                break;
            }
        }
        o2.a aVar = (o2.a) obj2;
        if (aVar == null) {
            return null;
        }
        a aVar2 = aVar.a;
        Expression<String> expression = aVar.b;
        return toItemBuilderResult(copy(aVar2, expression != null ? expression.evaluate(itemResolver) : null), itemResolver);
    }

    public static final List<DivItemBuilderResult> buildItems(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return buildItems(divContainer.B, divContainer.z, expressionResolver);
    }

    private static final a copy(a aVar, String str) {
        if (aVar instanceof a.f) {
            e5 e5Var = ((a.f) aVar).c;
            int i = e5.e0;
            return new a.f(new e5(e5Var.a, e5Var.b, e5Var.c, e5Var.d, e5Var.e, e5Var.f, e5Var.g, e5Var.h, e5Var.i, e5Var.j, e5Var.k, e5Var.l, e5Var.m, e5Var.n, e5Var.o, e5Var.p, e5Var.q, e5Var.r, e5Var.s, e5Var.t, e5Var.u, e5Var.v, e5Var.w, e5Var.x, e5Var.y, e5Var.z, str, e5Var.B, e5Var.C, e5Var.D, e5Var.E, e5Var.F, e5Var.G, e5Var.H, e5Var.I, e5Var.J, e5Var.K, e5Var.L, e5Var.M, e5Var.N, e5Var.O, e5Var.P, e5Var.Q, e5Var.R, e5Var.S, e5Var.T, e5Var.U, e5Var.V, e5Var.W, e5Var.X, e5Var.Y, e5Var.Z, e5Var.a0, e5Var.b0, e5Var.c0));
        }
        if (aVar instanceof a.d) {
            y4 y4Var = ((a.d) aVar).c;
            return new a.d(new y4(y4Var.a, y4Var.b, y4Var.c, y4Var.d, y4Var.e, y4Var.f, y4Var.g, y4Var.h, y4Var.i, y4Var.j, y4Var.k, y4Var.l, y4Var.m, y4Var.n, y4Var.o, y4Var.p, y4Var.q, y4Var.r, y4Var.s, y4Var.t, y4Var.u, y4Var.v, y4Var.w, y4Var.x, str, y4Var.z, y4Var.A, y4Var.B, y4Var.C, y4Var.D, y4Var.E, y4Var.F, y4Var.G, y4Var.H, y4Var.I, y4Var.J, y4Var.K, y4Var.L, y4Var.M, y4Var.N, y4Var.O, y4Var.P, y4Var.Q, y4Var.R, y4Var.S, y4Var.T, y4Var.U, y4Var.V, y4Var.W, y4Var.X));
        }
        if (aVar instanceof a.p) {
            DivText divText = ((a.p) aVar).c;
            return new a.p(new DivText(divText.a, divText.b, divText.c, divText.d, divText.e, divText.f, divText.g, divText.h, divText.i, divText.j, divText.k, divText.l, divText.m, divText.n, divText.o, divText.p, divText.q, divText.r, divText.s, divText.t, divText.u, divText.v, divText.w, divText.x, divText.y, divText.z, divText.A, divText.B, divText.C, divText.D, str, divText.F, divText.G, divText.H, divText.I, divText.J, divText.K, divText.L, divText.M, divText.N, divText.O, divText.P, divText.Q, divText.R, divText.S, divText.T, divText.U, divText.V, divText.W, divText.X, divText.Y, divText.Z, divText.a0, divText.b0, divText.c0, divText.d0, divText.e0, divText.f0, divText.g0, divText.h0, divText.i0, divText.j0, divText.k0, divText.l0, divText.m0, divText.n0, divText.o0, divText.p0, divText.q0));
        }
        if (aVar instanceof a.k) {
            DivSeparator divSeparator = ((a.k) aVar).c;
            return new a.k(new DivSeparator(divSeparator.a, divSeparator.b, divSeparator.c, divSeparator.d, divSeparator.e, divSeparator.f, divSeparator.g, divSeparator.h, divSeparator.i, divSeparator.j, divSeparator.k, divSeparator.l, divSeparator.m, divSeparator.n, divSeparator.o, divSeparator.p, divSeparator.q, divSeparator.r, divSeparator.s, divSeparator.t, divSeparator.u, str, divSeparator.w, divSeparator.x, divSeparator.y, divSeparator.z, divSeparator.A, divSeparator.B, divSeparator.C, divSeparator.D, divSeparator.E, divSeparator.F, divSeparator.G, divSeparator.H, divSeparator.I, divSeparator.J, divSeparator.K, divSeparator.L, divSeparator.M, divSeparator.N, divSeparator.O, divSeparator.P, divSeparator.Q));
        }
        ArrayList arrayList = null;
        if (aVar instanceof a.C2110a) {
            DivContainer divContainer = ((a.C2110a) aVar).c;
            List<a> list = divContainer.B;
            if (list != null) {
                List<a> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(copy$default((a) it.next(), null, 1, null));
                }
                arrayList = arrayList2;
            }
            return new a.C2110a(DivContainer.B(divContainer, str, arrayList, -150994945));
        }
        if (aVar instanceof a.e) {
            b5 b5Var = ((a.e) aVar).c;
            List<a> list3 = b5Var.y;
            if (list3 != null) {
                List<a> list4 = list3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(copy$default((a) it2.next(), null, 1, null));
                }
                arrayList = arrayList3;
            }
            return new a.e(b5.B(b5Var, str, arrayList, -25165825));
        }
        if (aVar instanceof a.c) {
            DivGallery divGallery = ((a.c) aVar).c;
            List<a> list5 = divGallery.u;
            if (list5 != null) {
                List<a> list6 = list5;
                ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
                Iterator<T> it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(copy$default((a) it3.next(), null, 1, null));
                }
                arrayList = arrayList4;
            }
            return new a.c(DivGallery.B(divGallery, str, arrayList, -1179649));
        }
        if (aVar instanceof a.i) {
            DivPager divPager = ((a.i) aVar).c;
            List<a> list7 = divPager.t;
            if (list7 != null) {
                List<a> list8 = list7;
                ArrayList arrayList5 = new ArrayList(c5g.u(list8, 10));
                Iterator<T> it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(copy$default((a) it4.next(), null, 1, null));
                }
                arrayList = arrayList5;
            }
            return new a.i(DivPager.B(divPager, str, arrayList, -557057));
        }
        if (aVar instanceof a.o) {
            DivTabs divTabs = ((a.o) aVar).c;
            List<DivTabs.a> list9 = divTabs.q;
            ArrayList arrayList6 = new ArrayList(c5g.u(list9, 10));
            for (DivTabs.a aVar2 : list9) {
                arrayList6.add(new DivTabs.a(copy$default(aVar2.a, null, 1, null), aVar2.b, aVar2.c));
            }
            return new a.o(DivTabs.B(divTabs, str, arrayList6, -98305));
        }
        if (aVar instanceof a.m) {
            ma maVar = ((a.m) aVar).c;
            List<ma.a> list10 = maVar.I;
            ArrayList arrayList7 = new ArrayList(c5g.u(list10, 10));
            for (ma.a aVar3 : list10) {
                a aVar4 = aVar3.c;
                arrayList7.add(new ma.a(aVar3.a, aVar3.b, aVar4 != null ? copy$default(aVar4, null, 1, null) : null, aVar3.d, aVar3.e));
            }
            return new a.m(ma.B(maVar, str, str, arrayList7, -8421377));
        }
        if (aVar instanceof a.b) {
            return new a.b(g3.B(((a.b) aVar).c, str, null, -32769));
        }
        if (aVar instanceof a.g) {
            DivIndicator divIndicator = ((a.g) aVar).c;
            return new a.g(new DivIndicator(divIndicator.a, divIndicator.b, divIndicator.c, divIndicator.d, divIndicator.e, divIndicator.f, divIndicator.g, divIndicator.h, divIndicator.i, divIndicator.j, divIndicator.k, divIndicator.l, divIndicator.m, divIndicator.n, divIndicator.o, divIndicator.p, divIndicator.q, str, divIndicator.s, divIndicator.t, divIndicator.u, divIndicator.v, divIndicator.w, divIndicator.x, divIndicator.y, divIndicator.z, divIndicator.A, divIndicator.B, divIndicator.C, divIndicator.D, divIndicator.E, divIndicator.F, divIndicator.G, divIndicator.H, divIndicator.I, divIndicator.J, divIndicator.K, divIndicator.L, divIndicator.M, divIndicator.N, divIndicator.O, divIndicator.P, divIndicator.Q, divIndicator.R));
        }
        if (aVar instanceof a.l) {
            fa faVar = ((a.l) aVar).c;
            return new a.l(new fa(faVar.a, faVar.b, faVar.c, faVar.d, faVar.e, faVar.f, faVar.g, faVar.h, faVar.i, faVar.j, faVar.k, faVar.l, faVar.m, str, faVar.o, faVar.p, faVar.q, faVar.r, faVar.s, faVar.t, faVar.u, faVar.v, faVar.w, faVar.x, faVar.y, faVar.z, faVar.A, faVar.B, faVar.C, faVar.D, faVar.E, faVar.F, faVar.G, faVar.H, faVar.I, faVar.J, faVar.K, faVar.L, faVar.M, faVar.N, faVar.O, faVar.P, faVar.Q, faVar.R, faVar.S, faVar.T, faVar.U));
        }
        if (aVar instanceof a.h) {
            DivInput divInput = ((a.h) aVar).c;
            return new a.h(new DivInput(divInput.a, divInput.b, divInput.c, divInput.d, divInput.e, divInput.f, divInput.g, divInput.h, divInput.i, divInput.j, divInput.k, divInput.l, divInput.m, divInput.n, divInput.o, divInput.p, divInput.q, divInput.r, divInput.s, divInput.t, divInput.u, divInput.v, divInput.w, divInput.x, divInput.y, divInput.z, str, divInput.B, divInput.C, divInput.D, divInput.E, divInput.F, divInput.G, divInput.H, divInput.I, divInput.J, divInput.K, divInput.L, divInput.M, divInput.N, divInput.O, divInput.P, divInput.Q, divInput.R, divInput.S, divInput.T, divInput.U, divInput.V, divInput.W, divInput.X, divInput.Y, divInput.Z, divInput.a0, divInput.b0, divInput.c0, divInput.d0, divInput.e0, divInput.f0, divInput.g0));
        }
        if (aVar instanceof a.j) {
            e9 e9Var = ((a.j) aVar).c;
            return new a.j(new e9(e9Var.a, e9Var.b, e9Var.c, e9Var.d, e9Var.e, e9Var.f, e9Var.g, e9Var.h, e9Var.i, e9Var.j, e9Var.k, e9Var.l, e9Var.m, e9Var.n, e9Var.o, e9Var.p, e9Var.q, e9Var.r, e9Var.s, e9Var.t, e9Var.u, str, e9Var.w, e9Var.x, e9Var.y, e9Var.z, e9Var.A, e9Var.B, e9Var.C, e9Var.D, e9Var.E, e9Var.F, e9Var.G, e9Var.H, e9Var.I, e9Var.J, e9Var.K, e9Var.L, e9Var.M, e9Var.N, e9Var.O, e9Var.P, e9Var.Q, e9Var.R, e9Var.S));
        }
        if (aVar instanceof a.q) {
            return new a.q(rd.B(((a.q) aVar).c, str));
        }
        if (aVar instanceof a.n) {
            return new a.n(db.B(((a.n) aVar).c, str));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ a copy$default(a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.b().getId();
        }
        return copy(aVar, str);
    }

    public static final ExpressionResolver getItemResolver(o2 o2Var, ExpressionResolver expressionResolver) {
        ExpressionResolver itemResolver;
        JSONArray evaluate = o2Var.a.evaluate(expressionResolver);
        int length = evaluate.length();
        for (int i = 0; i < length; i++) {
            Object obj = evaluate.get(i);
            if (obj != null && (itemResolver = getItemResolver(o2Var, obj, i, expressionResolver)) != null) {
                return itemResolver;
            }
        }
        return expressionResolver;
    }

    public static final List<a> getNonNullItems(DivContainer divContainer) {
        List<a> list = divContainer.B;
        return list == null ? EmptyList.b : list;
    }

    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(b5 b5Var, ExpressionResolver expressionResolver) {
        return toDivItemBuilderResult(getNonNullItems(b5Var), expressionResolver);
    }

    public static final List<DivItemBuilderResult> statesToDivItemBuilderResult(ma maVar, ExpressionResolver expressionResolver) {
        List<ma.a> list = maVar.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a aVar = ((ma.a) it.next()).c;
            DivItemBuilderResult itemBuilderResult = aVar != null ? toItemBuilderResult(aVar, expressionResolver) : null;
            if (itemBuilderResult != null) {
                arrayList.add(itemBuilderResult);
            }
        }
        return arrayList;
    }

    public static final List<DivItemBuilderResult> toDivItemBuilderResult(List<? extends a> list, ExpressionResolver expressionResolver) {
        List<? extends a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult((a) it.next(), expressionResolver));
        }
        return arrayList;
    }

    public static final DivItemBuilderResult toItemBuilderResult(a aVar, ExpressionResolver expressionResolver) {
        return new DivItemBuilderResult(aVar, expressionResolver);
    }

    public static final List<DivItemBuilderResult> buildItems(DivGallery divGallery, ExpressionResolver expressionResolver) {
        return buildItems(divGallery.u, divGallery.s, expressionResolver);
    }

    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(DivTabs divTabs, ExpressionResolver expressionResolver) {
        List<DivTabs.a> list = divTabs.q;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult(((DivTabs.a) it.next()).a, expressionResolver));
        }
        return arrayList;
    }

    public static final List<DivItemBuilderResult> buildItems(DivPager divPager, ExpressionResolver expressionResolver) {
        return buildItems(divPager.t, divPager.r, expressionResolver);
    }

    public static final List<a> getNonNullItems(g3 g3Var) {
        List<a> list = g3Var.q;
        return list == null ? EmptyList.b : list;
    }

    private static final List<DivItemBuilderResult> buildItems(List<? extends a> list, o2 o2Var, ExpressionResolver expressionResolver) {
        List<DivItemBuilderResult> build;
        if (o2Var != null && (build = build(o2Var, expressionResolver)) != null) {
            return build;
        }
        if (list != null) {
            return toDivItemBuilderResult(list, expressionResolver);
        }
        return EmptyList.b;
    }

    private static final ExpressionResolver getItemResolver(final o2 o2Var, Object obj, final int i, ExpressionResolver expressionResolver) {
        final ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        if (asImpl == null) {
            return expressionResolver;
        }
        final JSONObject validateItemBuilderDataElement = asImpl.validateItemBuilderDataElement(obj, i);
        if (validateItemBuilderDataElement == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(':');
        sb.append(i);
        final String sb2 = sb.toString();
        return asImpl.getRuntimeStore().getOrPutItemBuilderResolver(asImpl.getPath() + '/' + sb2, expressionResolver, new gzs<ExpressionResolver>() { // from class: com.yandex.div.internal.core.DivCollectionExtensionsKt$getItemResolver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final ExpressionResolver invoke() {
                return asImpl.withConstants$div_release(sb2, new ConstantsProvider(pn00.k(new Pair(o2.this.b, validateItemBuilderDataElement), new Pair("index", Long.valueOf(i)))));
            }
        });
    }

    public static final List<a> getNonNullItems(DivGallery divGallery) {
        List<a> list = divGallery.u;
        return list == null ? EmptyList.b : list;
    }

    public static final List<a> getNonNullItems(b5 b5Var) {
        List<a> list = b5Var.y;
        return list == null ? EmptyList.b : list;
    }

    public static final List<a> getNonNullItems(DivPager divPager) {
        List<a> list = divPager.t;
        return list == null ? EmptyList.b : list;
    }
}
