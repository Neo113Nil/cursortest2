package com.yandex.go.address.search.common.deeplink;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.route.interactor.c;
import defpackage.atd0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w4v0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final po21 b;
    public final atd0 c;

    public a(c cVar, po21 po21Var, atd0 atd0Var, tt2 tt2Var) {
        this.a = cVar;
        this.b = po21Var;
        this.c = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, ContinuationImpl continuationImpl) {
        SuggestDeeplinkModelMapper$map$1 suggestDeeplinkModelMapper$map$1;
        Object obj;
        int i;
        String str;
        PointType pointType;
        String str2;
        Object b;
        pv0 pv0Var;
        String str3;
        String str4;
        if (continuationImpl instanceof SuggestDeeplinkModelMapper$map$1) {
            suggestDeeplinkModelMapper$map$1 = (SuggestDeeplinkModelMapper$map$1) continuationImpl;
            int i2 = suggestDeeplinkModelMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestDeeplinkModelMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = suggestDeeplinkModelMapper$map$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestDeeplinkModelMapper$map$1.label;
                if (i != 0) {
                    b.b(obj2);
                    String queryParameter = uri.getQueryParameter("focus");
                    String queryParameter2 = uri.getQueryParameter("point_a");
                    String queryParameter3 = uri.getQueryParameter("point_b");
                    PointType pointType2 = "a".equals(queryParameter) ? PointType.SOURCE : PointType.DESTINATION;
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    suggestDeeplinkModelMapper$map$1.L$0 = null;
                    suggestDeeplinkModelMapper$map$1.L$1 = null;
                    suggestDeeplinkModelMapper$map$1.L$2 = queryParameter2;
                    suggestDeeplinkModelMapper$map$1.L$3 = queryParameter3;
                    suggestDeeplinkModelMapper$map$1.L$4 = pointType2;
                    suggestDeeplinkModelMapper$map$1.label = 1;
                    Object b2 = b(routePointType, queryParameter2, suggestDeeplinkModelMapper$map$1);
                    if (b2 != obj) {
                        str = queryParameter3;
                        pointType = pointType2;
                        obj2 = b2;
                        str2 = queryParameter2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0 pv0Var2 = (pv0) suggestDeeplinkModelMapper$map$1.L$5;
                    pointType = (PointType) suggestDeeplinkModelMapper$map$1.L$4;
                    str3 = (String) suggestDeeplinkModelMapper$map$1.L$3;
                    str4 = (String) suggestDeeplinkModelMapper$map$1.L$2;
                    b.b(obj2);
                    pv0Var = pv0Var2;
                    pv0 pv0Var3 = (pv0) obj2;
                    return new w4v0(pointType, pv0Var != null ? str4 : null, pv0Var, pv0Var3 != null ? str3 : null, pv0Var3);
                }
                pointType = (PointType) suggestDeeplinkModelMapper$map$1.L$4;
                str = (String) suggestDeeplinkModelMapper$map$1.L$3;
                str2 = (String) suggestDeeplinkModelMapper$map$1.L$2;
                b.b(obj2);
                pv0 pv0Var4 = (pv0) obj2;
                RoutePointType routePointType2 = RoutePointType.POINT_B;
                suggestDeeplinkModelMapper$map$1.L$0 = null;
                suggestDeeplinkModelMapper$map$1.L$1 = null;
                suggestDeeplinkModelMapper$map$1.L$2 = str2;
                suggestDeeplinkModelMapper$map$1.L$3 = str;
                suggestDeeplinkModelMapper$map$1.L$4 = pointType;
                suggestDeeplinkModelMapper$map$1.L$5 = pv0Var4;
                suggestDeeplinkModelMapper$map$1.label = 2;
                b = b(routePointType2, str, suggestDeeplinkModelMapper$map$1);
                if (b != obj) {
                    pv0Var = pv0Var4;
                    str3 = str;
                    str4 = str2;
                    obj2 = b;
                    pv0 pv0Var32 = (pv0) obj2;
                    return new w4v0(pointType, pv0Var != null ? str4 : null, pv0Var, pv0Var32 != null ? str3 : null, pv0Var32);
                }
                return obj;
            }
        }
        suggestDeeplinkModelMapper$map$1 = new SuggestDeeplinkModelMapper$map$1(this, continuationImpl);
        Object obj22 = suggestDeeplinkModelMapper$map$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestDeeplinkModelMapper$map$1.label;
        if (i != 0) {
        }
        pv0 pv0Var42 = (pv0) obj22;
        RoutePointType routePointType22 = RoutePointType.POINT_B;
        suggestDeeplinkModelMapper$map$1.L$0 = null;
        suggestDeeplinkModelMapper$map$1.L$1 = null;
        suggestDeeplinkModelMapper$map$1.L$2 = str2;
        suggestDeeplinkModelMapper$map$1.L$3 = str;
        suggestDeeplinkModelMapper$map$1.L$4 = pointType;
        suggestDeeplinkModelMapper$map$1.L$5 = pv0Var42;
        suggestDeeplinkModelMapper$map$1.label = 2;
        b = b(routePointType22, str, suggestDeeplinkModelMapper$map$1);
        if (b != obj) {
        }
        return obj;
    }

    public final Object b(RoutePointType routePointType, String str, Continuation continuation) {
        if (jl40.l(str, "<pin_location>")) {
            Address g = this.a.g();
            pv0 pv0Var = new pv0(g != null ? g.copy() : PlainAddress.a, null, null, null, null, null, null, null, 1022);
            pv0Var.k = true;
            return pv0Var;
        }
        if (!jl40.l(str, "<current_location>")) {
            return null;
        }
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SuggestDeeplinkModelMapper$takeCurrentLocation$2(this, routePointType, null), continuation);
    }
}
