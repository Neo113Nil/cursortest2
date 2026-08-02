package com.yandex.go.taxi.order.search.domain.entity.mapper;

import android.content.Context;
import android.view.View;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.zone.model.ZoneMode;
import defpackage.jl40;
import defpackage.mqg0;
import defpackage.n20;
import defpackage.n380;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p0c0;
import defpackage.q5z;
import defpackage.s0c0;
import defpackage.sxp0;
import defpackage.txp0;
import defpackage.xqg0;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final n20 b;
    public final j c;
    public final com.yandex.go.taxi.order.search.factory.a d;
    public final s0c0 e;

    public a(Context context, n20 n20Var, j jVar, com.yandex.go.taxi.order.search.factory.a aVar, s0c0 s0c0Var) {
        this.a = context;
        this.b = n20Var;
        this.c = jVar;
        this.d = aVar;
        this.e = s0c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x006c, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SearchState searchState, n380 n380Var, ContinuationImpl continuationImpl) {
        SearchViewsStateMapper$map$1 searchViewsStateMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Iterator it;
        Object obj;
        o2y0 o2y0Var;
        p0c0 p0c0Var;
        Object a;
        SearchState searchState2;
        p0c0 p0c0Var2;
        View view;
        int color;
        if (continuationImpl instanceof SearchViewsStateMapper$map$1) {
            searchViewsStateMapper$map$1 = (SearchViewsStateMapper$map$1) continuationImpl;
            int i2 = searchViewsStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchViewsStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchViewsStateMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchViewsStateMapper$map$1.label;
                if (i != 0) {
                    b.b(obj2);
                    SearchState.Companion.getClass();
                    if (searchState == SearchState.A) {
                        return sxp0.a;
                    }
                    n20 n20Var = this.b;
                    searchViewsStateMapper$map$1.L$0 = searchState;
                    searchViewsStateMapper$map$1.L$1 = n380Var;
                    searchViewsStateMapper$map$1.label = 1;
                    obj2 = ((com.yandex.go.taxi.order.provider.a) n20Var).k(searchViewsStateMapper$map$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p0c0Var2 = (p0c0) searchViewsStateMapper$map$1.L$3;
                        searchState2 = (SearchState) searchViewsStateMapper$map$1.L$0;
                        b.b(obj2);
                        view = (View) obj2;
                        if (view instanceof PinV1Component) {
                            color = this.a.getColor(mqg0.component_gray_450);
                        } else {
                            Integer S = q5z.S(p0c0Var2 != null ? p0c0Var2.a : null);
                            color = S != null ? S.intValue() : this.a.getColor(xqg0.source_pin_main_color);
                        }
                        return new txp0(searchState2.c, view, color);
                    }
                    n380Var = (n380) searchViewsStateMapper$map$1.L$1;
                    searchState = (SearchState) searchViewsStateMapper$map$1.L$0;
                    b.b(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((o2y0) obj).b().a, searchState.a)) {
                        break;
                    }
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null) {
                    ZoneMode e = this.c.e(o2y0Var.b().M(), o2y0Var.b().x(), o2y0Var.b().b.V);
                    s0c0 s0c0Var = this.e;
                    String str = e.a;
                    if (str == null) {
                        str = "";
                    }
                    p0c0Var = ((f) s0c0Var).e(str);
                } else {
                    p0c0Var = null;
                }
                com.yandex.go.taxi.order.search.factory.a aVar = this.d;
                searchViewsStateMapper$map$1.L$0 = searchState;
                searchViewsStateMapper$map$1.L$1 = null;
                searchViewsStateMapper$map$1.L$2 = null;
                searchViewsStateMapper$map$1.L$3 = p0c0Var;
                searchViewsStateMapper$map$1.label = 2;
                a = aVar.a(searchState, p0c0Var, n380Var, searchViewsStateMapper$map$1);
                if (a != coroutineSingletons) {
                    searchState2 = searchState;
                    p0c0Var2 = p0c0Var;
                    obj2 = a;
                    view = (View) obj2;
                    if (view instanceof PinV1Component) {
                    }
                    return new txp0(searchState2.c, view, color);
                }
                return coroutineSingletons;
            }
        }
        searchViewsStateMapper$map$1 = new SearchViewsStateMapper$map$1(this, continuationImpl);
        Object obj22 = searchViewsStateMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchViewsStateMapper$map$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj;
        if (o2y0Var == null) {
        }
        com.yandex.go.taxi.order.search.factory.a aVar2 = this.d;
        searchViewsStateMapper$map$1.L$0 = searchState;
        searchViewsStateMapper$map$1.L$1 = null;
        searchViewsStateMapper$map$1.L$2 = null;
        searchViewsStateMapper$map$1.L$3 = p0c0Var;
        searchViewsStateMapper$map$1.label = 2;
        a = aVar2.a(searchState, p0c0Var, n380Var, searchViewsStateMapper$map$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
