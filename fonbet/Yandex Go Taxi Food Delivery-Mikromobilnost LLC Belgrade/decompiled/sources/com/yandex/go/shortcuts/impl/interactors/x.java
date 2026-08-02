package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.dto.response.Screen;
import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import com.yandex.go.shortcuts.dto.response.VerticalStack;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import defpackage.d1q0;
import defpackage.gw00;
import defpackage.h73;
import defpackage.jst;
import defpackage.k7d0;
import defpackage.kx00;
import defpackage.l4q0;
import defpackage.n3q0;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.t3s0;
import defpackage.taf0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zj11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes13.dex */
public final class x {
    public final com.yandex.go.shortcuts.impl.view.adapter.model.a a;

    public x(com.yandex.go.shortcuts.impl.view.adapter.model.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x020d, code lost:
    
        if (r12.a(r5, r1) != r14) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cc, code lost:
    
        if (r6.a(r5, r1) == r14) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a3, code lost:
    
        if (r6.a(r5, r1) == r14) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0306 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(x xVar, srq0 srq0Var, ProductsCommon$Section productsCommon$Section, ProductsCommon$Section productsCommon$Section2, Map map, Map map2, Layout layout, Screen screen, Map map3, BaseContinuationImpl baseContinuationImpl) {
        ProductsScreenResponseMapper$appendModels$1 productsScreenResponseMapper$appendModels$1;
        ProductMode$Taxi.SectionHeader sectionHeader;
        ProductsCommon$Section productsCommon$Section3;
        Layout layout2;
        Map map4;
        Map map5;
        Screen screen2;
        srq0 srq0Var2;
        Map map6;
        SectionTypedHeader sectionTypedHeader;
        com.yandex.go.shortcuts.impl.view.adapter.model.a aVar = xVar.a;
        if (baseContinuationImpl instanceof ProductsScreenResponseMapper$appendModels$1) {
            productsScreenResponseMapper$appendModels$1 = (ProductsScreenResponseMapper$appendModels$1) baseContinuationImpl;
            int i = productsScreenResponseMapper$appendModels$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productsScreenResponseMapper$appendModels$1.label = i - Integer.MIN_VALUE;
                Object obj = productsScreenResponseMapper$appendModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (productsScreenResponseMapper$appendModels$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        if (productsCommon$Section != null) {
                            t3s0 q = aVar.q(productsCommon$Section, productsCommon$Section2);
                            productsScreenResponseMapper$appendModels$1.L$0 = srq0Var;
                            productsScreenResponseMapper$appendModels$1.L$1 = null;
                            productsScreenResponseMapper$appendModels$1.L$2 = productsCommon$Section2;
                            productsScreenResponseMapper$appendModels$1.L$3 = map;
                            productsScreenResponseMapper$appendModels$1.L$4 = map2;
                            productsScreenResponseMapper$appendModels$1.L$5 = layout;
                            productsScreenResponseMapper$appendModels$1.L$6 = screen;
                            productsScreenResponseMapper$appendModels$1.L$7 = map3;
                            productsScreenResponseMapper$appendModels$1.label = 1;
                            break;
                        }
                        sectionHeader = productsCommon$Section2.e;
                        if (sectionHeader != null) {
                            d1q0 p = aVar.p(sectionHeader, productsCommon$Section2.b());
                            productsScreenResponseMapper$appendModels$1.L$0 = srq0Var;
                            productsScreenResponseMapper$appendModels$1.L$1 = null;
                            productsScreenResponseMapper$appendModels$1.L$2 = productsCommon$Section2;
                            productsScreenResponseMapper$appendModels$1.L$3 = map;
                            productsScreenResponseMapper$appendModels$1.L$4 = map2;
                            productsScreenResponseMapper$appendModels$1.L$5 = layout;
                            productsScreenResponseMapper$appendModels$1.L$6 = screen;
                            productsScreenResponseMapper$appendModels$1.L$7 = map3;
                            productsScreenResponseMapper$appendModels$1.L$8 = null;
                            productsScreenResponseMapper$appendModels$1.label = 2;
                            break;
                        }
                        Layout layout3 = layout;
                        productsCommon$Section3 = productsCommon$Section2;
                        layout2 = layout3;
                        Map map7 = map2;
                        map4 = map;
                        map5 = map7;
                        screen2 = screen;
                        srq0Var2 = srq0Var;
                        map6 = map3;
                        sectionTypedHeader = productsCommon$Section3.f;
                        if (sectionTypedHeader != null && sectionTypedHeader.b.b.a.length() > 0) {
                            String b = productsCommon$Section3.b();
                            aVar.getClass();
                            l4q0 r = com.yandex.go.shortcuts.impl.view.adapter.model.a.r(sectionTypedHeader, b);
                            productsScreenResponseMapper$appendModels$1.L$0 = srq0Var2;
                            productsScreenResponseMapper$appendModels$1.L$1 = null;
                            productsScreenResponseMapper$appendModels$1.L$2 = productsCommon$Section3;
                            productsScreenResponseMapper$appendModels$1.L$3 = map4;
                            productsScreenResponseMapper$appendModels$1.L$4 = map5;
                            productsScreenResponseMapper$appendModels$1.L$5 = layout2;
                            productsScreenResponseMapper$appendModels$1.L$6 = screen2;
                            productsScreenResponseMapper$appendModels$1.L$7 = map6;
                            productsScreenResponseMapper$appendModels$1.L$8 = null;
                            productsScreenResponseMapper$appendModels$1.label = 3;
                            break;
                        }
                        switch (taf0.a[productsCommon$Section3.a.ordinal()]) {
                            case 1:
                                aVar.getClass();
                                ArrayList i2 = com.yandex.go.shortcuts.impl.view.adapter.model.a.i(map4, productsCommon$Section3);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 4;
                                Object c = srq0Var2.c(i2, productsScreenResponseMapper$appendModels$1);
                                return c == coroutineSingletons ? coroutineSingletons : c;
                            case 2:
                                aVar.getClass();
                                n3q0 o = com.yandex.go.shortcuts.impl.view.adapter.model.a.o(map5, productsCommon$Section3);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 5;
                                CoroutineSingletons a = srq0Var2.a(o, productsScreenResponseMapper$appendModels$1);
                                if (a != coroutineSingletons) {
                                    return a;
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                aVar.getClass();
                                ArrayList i3 = com.yandex.go.shortcuts.impl.view.adapter.model.a.i(map5, productsCommon$Section3);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 6;
                                Object c2 = srq0Var2.c(i3, productsScreenResponseMapper$appendModels$1);
                                if (c2 != coroutineSingletons) {
                                    return c2;
                                }
                                break;
                            case 7:
                                zj11 u = aVar.u(layout2, screen2.b.c, productsCommon$Section3.c);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 7;
                                CoroutineSingletons a2 = srq0Var2.a(u, productsScreenResponseMapper$appendModels$1);
                                if (a2 != coroutineSingletons) {
                                    return a2;
                                }
                                break;
                            case 8:
                                kx00 j = aVar.j(map6, productsCommon$Section3);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 8;
                                CoroutineSingletons a3 = srq0Var2.a(j, productsScreenResponseMapper$appendModels$1);
                                if (a3 != coroutineSingletons) {
                                    return a3;
                                }
                                break;
                            case 9:
                                aVar.getClass();
                                ArrayList h = com.yandex.go.shortcuts.impl.view.adapter.model.a.h(map6, productsCommon$Section3);
                                productsScreenResponseMapper$appendModels$1.L$0 = null;
                                productsScreenResponseMapper$appendModels$1.L$1 = null;
                                productsScreenResponseMapper$appendModels$1.L$2 = null;
                                productsScreenResponseMapper$appendModels$1.L$3 = null;
                                productsScreenResponseMapper$appendModels$1.L$4 = null;
                                productsScreenResponseMapper$appendModels$1.L$5 = null;
                                productsScreenResponseMapper$appendModels$1.L$6 = null;
                                productsScreenResponseMapper$appendModels$1.L$7 = null;
                                productsScreenResponseMapper$appendModels$1.L$8 = null;
                                productsScreenResponseMapper$appendModels$1.label = 9;
                                Object c3 = srq0Var2.c(h, productsScreenResponseMapper$appendModels$1);
                                if (c3 != coroutineSingletons) {
                                    return c3;
                                }
                                break;
                            case 10:
                                jst.e.q("Unsupported section found");
                                return zy11.a;
                            default:
                                w511.b();
                                return null;
                        }
                    case 1:
                        map3 = (Map) productsScreenResponseMapper$appendModels$1.L$7;
                        screen = (Screen) productsScreenResponseMapper$appendModels$1.L$6;
                        layout = (Layout) productsScreenResponseMapper$appendModels$1.L$5;
                        map2 = (Map) productsScreenResponseMapper$appendModels$1.L$4;
                        map = (Map) productsScreenResponseMapper$appendModels$1.L$3;
                        ProductsCommon$Section productsCommon$Section4 = (ProductsCommon$Section) productsScreenResponseMapper$appendModels$1.L$2;
                        srq0 srq0Var3 = (srq0) productsScreenResponseMapper$appendModels$1.L$0;
                        kotlin.b.b(obj);
                        productsCommon$Section2 = productsCommon$Section4;
                        srq0Var = srq0Var3;
                        sectionHeader = productsCommon$Section2.e;
                        if (sectionHeader != null) {
                        }
                        Layout layout32 = layout;
                        productsCommon$Section3 = productsCommon$Section2;
                        layout2 = layout32;
                        Map map72 = map2;
                        map4 = map;
                        map5 = map72;
                        screen2 = screen;
                        srq0Var2 = srq0Var;
                        map6 = map3;
                        sectionTypedHeader = productsCommon$Section3.f;
                        if (sectionTypedHeader != null) {
                            String b2 = productsCommon$Section3.b();
                            aVar.getClass();
                            l4q0 r2 = com.yandex.go.shortcuts.impl.view.adapter.model.a.r(sectionTypedHeader, b2);
                            productsScreenResponseMapper$appendModels$1.L$0 = srq0Var2;
                            productsScreenResponseMapper$appendModels$1.L$1 = null;
                            productsScreenResponseMapper$appendModels$1.L$2 = productsCommon$Section3;
                            productsScreenResponseMapper$appendModels$1.L$3 = map4;
                            productsScreenResponseMapper$appendModels$1.L$4 = map5;
                            productsScreenResponseMapper$appendModels$1.L$5 = layout2;
                            productsScreenResponseMapper$appendModels$1.L$6 = screen2;
                            productsScreenResponseMapper$appendModels$1.L$7 = map6;
                            productsScreenResponseMapper$appendModels$1.L$8 = null;
                            productsScreenResponseMapper$appendModels$1.label = 3;
                            break;
                        }
                        switch (taf0.a[productsCommon$Section3.a.ordinal()]) {
                        }
                    case 2:
                        map6 = (Map) productsScreenResponseMapper$appendModels$1.L$7;
                        screen2 = (Screen) productsScreenResponseMapper$appendModels$1.L$6;
                        layout2 = (Layout) productsScreenResponseMapper$appendModels$1.L$5;
                        map5 = (Map) productsScreenResponseMapper$appendModels$1.L$4;
                        map4 = (Map) productsScreenResponseMapper$appendModels$1.L$3;
                        productsCommon$Section3 = (ProductsCommon$Section) productsScreenResponseMapper$appendModels$1.L$2;
                        srq0Var2 = (srq0) productsScreenResponseMapper$appendModels$1.L$0;
                        kotlin.b.b(obj);
                        sectionTypedHeader = productsCommon$Section3.f;
                        if (sectionTypedHeader != null) {
                        }
                        switch (taf0.a[productsCommon$Section3.a.ordinal()]) {
                        }
                    case 3:
                        map6 = (Map) productsScreenResponseMapper$appendModels$1.L$7;
                        screen2 = (Screen) productsScreenResponseMapper$appendModels$1.L$6;
                        layout2 = (Layout) productsScreenResponseMapper$appendModels$1.L$5;
                        map5 = (Map) productsScreenResponseMapper$appendModels$1.L$4;
                        map4 = (Map) productsScreenResponseMapper$appendModels$1.L$3;
                        productsCommon$Section3 = (ProductsCommon$Section) productsScreenResponseMapper$appendModels$1.L$2;
                        srq0Var2 = (srq0) productsScreenResponseMapper$appendModels$1.L$0;
                        kotlin.b.b(obj);
                        switch (taf0.a[productsCommon$Section3.a.ordinal()]) {
                        }
                    case 4:
                        kotlin.b.b(obj);
                        return obj;
                    case 5:
                        kotlin.b.b(obj);
                        return obj;
                    case 6:
                        kotlin.b.b(obj);
                        return obj;
                    case 7:
                        kotlin.b.b(obj);
                        return obj;
                    case 8:
                        kotlin.b.b(obj);
                        return obj;
                    case 9:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        productsScreenResponseMapper$appendModels$1 = new ProductsScreenResponseMapper$appendModels$1(xVar, baseContinuationImpl);
        Object obj2 = productsScreenResponseMapper$appendModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (productsScreenResponseMapper$appendModels$1.label) {
        }
    }

    public final List b(ProductsScreenResponse productsScreenResponse) {
        Screen screen = productsScreenResponse.e;
        Layout layout = screen.a;
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.HEADER;
        com.yandex.go.shortcuts.impl.view.adapter.model.a aVar = this.a;
        Map l = aVar.l(productsScreenResponse, baseShortcutModel$Source);
        Map l2 = aVar.l(productsScreenResponse, BaseShortcutModel$Source.ITEMS);
        List<VerticalStack> list = productsScreenResponse.e.b.d;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (VerticalStack verticalStack : list) {
            Pair pair = new Pair(verticalStack.a, aVar.s(verticalStack, layout));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return kotlin.sequences.b.s(kotlin.sequences.b.g(new h73(2, new ProductsScreenResponseMapper$mapResponseToModels$models$1(screen, l, l2, this, layout, linkedHashMap, null)), new k7d0(this, layout)));
    }
}
