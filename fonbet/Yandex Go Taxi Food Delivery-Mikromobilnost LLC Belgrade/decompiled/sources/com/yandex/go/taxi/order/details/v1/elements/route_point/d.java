package com.yandex.go.taxi.order.details.v1.elements.route_point;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.details.v1.ui.f;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddRoutePointElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.a22;
import defpackage.avj0;
import defpackage.b7j;
import defpackage.bvf0;
import defpackage.f7j;
import defpackage.g7j;
import defpackage.gw00;
import defpackage.ibk0;
import defpackage.kyh0;
import defpackage.mak0;
import defpackage.mdh;
import defpackage.mrg0;
import defpackage.n4h0;
import defpackage.nak0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.qje;
import defpackage.s9k0;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ugu0;
import defpackage.uyj;
import defpackage.vng;
import defpackage.w6j;
import defpackage.x6j;
import defpackage.xng0;
import defpackage.y6j;
import defpackage.z6j;
import defpackage.zuj0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class d {
    public final sgu0 a;
    public final tt2 b;
    public final zuj0 c;
    public final a22 d;
    public final e e;
    public final Context f;

    public d(y6j y6jVar, sgu0 sgu0Var, tt2 tt2Var, zuj0 zuj0Var, a22 a22Var, e eVar, Context context) {
        this.a = sgu0Var;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = a22Var;
        this.e = eVar;
        this.f = context;
    }

    public static ibk0 d(z6j z6jVar) {
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = z6jVar.a;
        int i = detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? -1 : b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState.ordinal()];
        return i != 1 ? i != 2 ? s9k0.a : new nak0("CHANGE_ROUTE_POINT".toLowerCase(Locale.ROOT)) : new mak0("ADD_ROUTE_POINT".toLowerCase(Locale.ROOT));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (r2 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z6j z6jVar, w6j w6jVar, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1 detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1;
        Object obj;
        int i;
        z6j z6jVar2;
        OrderDetailsCardResponse.CardIcon cardIcon;
        Object obj2;
        CharSequence charSequence;
        String str;
        int c;
        Object c2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        z6j z6jVar3;
        int i2;
        CharSequence charSequence2;
        int i3;
        w6j w6jVar2 = w6jVar;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1) {
            detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1 = (DetailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1) continuationImpl;
            int i4 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label;
                int i5 = 2;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    FormattedText formattedText = w6jVar2.a;
                    z6jVar2 = z6jVar;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0 = z6jVar2;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1 = w6jVar2;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = 1;
                    obj3 = e.s(this.e, formattedText, detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$4;
                            i2 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$3;
                            i5 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$1;
                            int i6 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$0;
                            UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$3;
                            charSequence2 = (CharSequence) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2;
                            z6jVar3 = (z6j) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0;
                            kotlin.b.b(obj3);
                            c = i6;
                            uiStateDrawableWrapper = uiStateDrawableWrapper2;
                            return new g7j(Collections.singletonList(new f7j(d(z6jVar3), new DetailsCardListItem.a(c, i5, i2 == 0, i3 != 0, (f) obj3, 4), charSequence2, null, uiStateDrawableWrapper, false, true)));
                        }
                        CharSequence charSequence3 = (CharSequence) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2;
                        w6j w6jVar3 = (w6j) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1;
                        z6j z6jVar4 = (z6j) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0;
                        kotlin.b.b(obj3);
                        charSequence = charSequence3;
                        w6jVar2 = w6jVar3;
                        z6jVar2 = z6jVar4;
                        UiStateDrawableWrapper g = pkf.g((Drawable) obj3, w6jVar2.b.b, null);
                        c = ((avj0) this.c).c(mrg0.go_design_s_space);
                        i1 i1Var = w6jVar2.c;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0 = z6jVar2;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1 = null;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2 = charSequence;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$3 = g;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$0 = c;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$1 = 2;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$2 = 0;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$3 = 1;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$4 = 1;
                        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = 3;
                        c2 = c(z6jVar2, i1Var, detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1);
                        if (c2 != obj) {
                            uiStateDrawableWrapper = g;
                            z6jVar3 = z6jVar2;
                            i2 = 1;
                            charSequence2 = charSequence;
                            obj3 = c2;
                            i3 = 1;
                            return new g7j(Collections.singletonList(new f7j(d(z6jVar3), new DetailsCardListItem.a(c, i5, i2 == 0, i3 != 0, (f) obj3, 4), charSequence2, null, uiStateDrawableWrapper, false, true)));
                        }
                        return obj;
                    }
                    w6jVar2 = (w6j) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1;
                    z6jVar2 = (z6j) detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0;
                    kotlin.b.b(obj3);
                }
                CharSequence charSequence4 = (CharSequence) obj3;
                cardIcon = w6jVar2.b;
                detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0 = z6jVar2;
                detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1 = w6jVar2;
                detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2 = charSequence4;
                detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = 2;
                if (cardIcon != null || (str = cardIcon.b) == null) {
                    obj2 = null;
                } else {
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj2 = tje.k0(mdh.b, new DetailsCardRoutePointsStyleMapper$loadLeadIcon$2(this, str, null), detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1);
                }
                if (obj2 != obj) {
                    Object obj4 = obj2;
                    charSequence = charSequence4;
                    obj3 = obj4;
                    UiStateDrawableWrapper g2 = pkf.g((Drawable) obj3, w6jVar2.b.b, null);
                    c = ((avj0) this.c).c(mrg0.go_design_s_space);
                    i1 i1Var2 = w6jVar2.c;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0 = z6jVar2;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2 = charSequence;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$3 = g2;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$0 = c;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$1 = 2;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$2 = 0;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$3 = 1;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.I$4 = 1;
                    detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = 3;
                    c2 = c(z6jVar2, i1Var2, detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1);
                    if (c2 != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1 = new DetailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1(this, continuationImpl);
        Object obj32 = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label;
        int i52 = 2;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj32;
        cardIcon = w6jVar2.b;
        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$0 = z6jVar2;
        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$1 = w6jVar2;
        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.L$2 = charSequence42;
        detailsCardRoutePointsStyleMapper$addRoutePointRemoteStyle$1.label = 2;
        if (cardIcon != null) {
        }
        obj2 = null;
        if (obj2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ae -> B:10:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(z6j z6jVar, List list, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1 detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1;
        int i;
        int d;
        Iterator it;
        Map map;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1) {
            detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1 = (DetailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.label;
                Map map2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = z6jVar.b;
                    if (list2 != null) {
                        ArrayList P0 = kotlin.collections.a.P0(list2, list);
                        d = gw00.d(tcc.n(P0, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        it = P0.iterator();
                        map = linkedHashMap;
                        if (it.hasNext()) {
                        }
                    }
                    MapBuilder mapBuilder = new MapBuilder();
                    if (map2 != null) {
                    }
                    return mapBuilder.j();
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.I$0;
                OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement = (OrderDetailsCardResponse$CardElement$RoutePointElement) detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$8;
                map = (Map) detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$7;
                it = (Iterator) detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$5;
                Map map3 = (Map) detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$4;
                kotlin.b.b(obj);
                Pair pair = new Pair((x6j) obj, orderDetailsCardResponse$CardElement$RoutePointElement);
                map.put(pair.c(), pair.f());
                map = map3;
                if (it.hasNext()) {
                    orderDetailsCardResponse$CardElement$RoutePointElement = (OrderDetailsCardResponse$CardElement$RoutePointElement) ((Pair) it.next()).getSecond();
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$3 = null;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$4 = map;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$5 = it;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$6 = null;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$7 = map;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.L$8 = orderDetailsCardResponse$CardElement$RoutePointElement;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.I$0 = d;
                    detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.label = 1;
                    obj = bvf0.n(new DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2(orderDetailsCardResponse$CardElement$RoutePointElement, null), detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map3 = map;
                    Pair pair2 = new Pair((x6j) obj, orderDetailsCardResponse$CardElement$RoutePointElement);
                    map.put(pair2.c(), pair2.f());
                    map = map3;
                    if (it.hasNext()) {
                        map2 = map;
                        MapBuilder mapBuilder2 = new MapBuilder();
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                x6j x6jVar = (x6j) entry.getKey();
                                OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement2 = (OrderDetailsCardResponse$CardElement$RoutePointElement) entry.getValue();
                                if (x6jVar != null) {
                                    mapBuilder2.put(x6jVar, orderDetailsCardResponse$CardElement$RoutePointElement2);
                                }
                            }
                        }
                        return mapBuilder2.j();
                    }
                }
            }
        }
        detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1 = new DetailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1(this, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$ensureRemoteModelsMappedToActual$1.label;
        Map map22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(z6j z6jVar, i1 i1Var, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$getInteractionMode$1 detailsCardRoutePointsStyleMapper$getInteractionMode$1;
        int i;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$getInteractionMode$1) {
            detailsCardRoutePointsStyleMapper$getInteractionMode$1 = (DetailsCardRoutePointsStyleMapper$getInteractionMode$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$getInteractionMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$getInteractionMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$getInteractionMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$getInteractionMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$Button)) {
                        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = z6jVar.a;
                        int i3 = detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? -1 : b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState.ordinal()];
                        int i4 = 2;
                        if (i3 != 1 && i3 != 2) {
                            i4 = 8;
                        }
                        return new com.yandex.go.taxi.order.details.v1.ui.e(i4);
                    }
                    FormattedText formattedText = ((OrderDetailsCardResponse$AccessoryResponse$Button) i1Var).a;
                    detailsCardRoutePointsStyleMapper$getInteractionMode$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$getInteractionMode$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$getInteractionMode$1.label = 1;
                    obj = e.s(this.e, formattedText, detailsCardRoutePointsStyleMapper$getInteractionMode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                int i5 = xng0.textMain;
                avj0 avj0Var = (avj0) this.c;
                return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj, qje.t(i5, avj0Var.a), qje.t(xng0.controlMinor, avj0Var.a), Collections.singletonList(new Integer(avj0Var.c(mrg0.go_design_m_space))));
            }
        }
        detailsCardRoutePointsStyleMapper$getInteractionMode$1 = new DetailsCardRoutePointsStyleMapper$getInteractionMode$1(this, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleMapper$getInteractionMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$getInteractionMode$1.label;
        if (i != 0) {
        }
        int i52 = xng0.textMain;
        avj0 avj0Var2 = (avj0) this.c;
        return new com.yandex.go.taxi.order.details.v1.ui.a((CharSequence) obj2, qje.t(i52, avj0Var2.a), qje.t(xng0.controlMinor, avj0Var2.a), Collections.singletonList(new Integer(avj0Var2.c(mrg0.go_design_m_space))));
    }

    public final Object e(String str, ContinuationImpl continuationImpl) {
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        if (str == null) {
            str = "";
        }
        return e.s(this.e, ru.yandex.taxi.common_models.net.b.b(bVar, str, new Integer(13), "textMinor", null, null, 56), continuationImpl);
    }

    public final Object f(String str, ContinuationImpl continuationImpl) {
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        if (str == null) {
            str = "";
        }
        return e.s(this.e, ru.yandex.taxi.common_models.net.b.b(bVar, str, new Integer(16), "textMain", null, null, 56), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(z6j z6jVar, OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$handleAddPointsStyle$1 detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1;
        Object obj;
        int i;
        w6j w6jVar;
        Object j;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$handleAddPointsStyle$1) {
            detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1 = (DetailsCardRoutePointsStyleMapper$handleAddPointsStyle$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$0 = z6jVar;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$1 = orderDetailsCardResponse$CardElement$AddRoutePointElement;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label = 1;
                    obj2 = bvf0.n(new DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2(orderDetailsCardResponse$CardElement$AddRoutePointElement, null), detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    orderDetailsCardResponse$CardElement$AddRoutePointElement = (OrderDetailsCardResponse$CardElement$AddRoutePointElement) detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$1;
                    z6jVar = (z6j) detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$0;
                    kotlin.b.b(obj2);
                }
                w6jVar = (w6j) obj2;
                if (w6jVar != null || orderDetailsCardResponse$CardElement$AddRoutePointElement == null) {
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label = 3;
                    j = j(z6jVar, detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1);
                    if (j != obj) {
                        return j;
                    }
                } else {
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label = 2;
                    Object a = a(z6jVar, w6jVar, detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1);
                    if (a != obj) {
                        return a;
                    }
                }
                return obj;
            }
        }
        detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1 = new DetailsCardRoutePointsStyleMapper$handleAddPointsStyle$1(this, continuationImpl);
        Object obj22 = detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label;
        if (i != 0) {
        }
        w6jVar = (w6j) obj22;
        if (w6jVar != null) {
        }
        detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$0 = null;
        detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$1 = null;
        detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.L$2 = null;
        detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1.label = 3;
        j = j(z6jVar, detailsCardRoutePointsStyleMapper$handleAddPointsStyle$1);
        if (j != obj) {
            return obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(z6j z6jVar, List list, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$handleEditPointsStyle$1 detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1;
        int i;
        Map map;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$handleEditPointsStyle$1) {
            detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1 = (DetailsCardRoutePointsStyleMapper$handleEditPointsStyle$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$0 = z6jVar;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label = 1;
                    obj = b(z6jVar, list, detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z6jVar = (z6j) detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                if (map.isEmpty()) {
                    Set keySet = map.keySet();
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label = 2;
                    Object m = m(z6jVar, keySet, detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1);
                    if (m != obj2) {
                        return m;
                    }
                } else {
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label = 3;
                    Object l = l(z6jVar, detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1);
                    if (l != obj2) {
                        return l;
                    }
                }
                return obj2;
            }
        }
        detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1 = new DetailsCardRoutePointsStyleMapper$handleEditPointsStyle$1(this, continuationImpl);
        Object obj3 = detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$handleEditPointsStyle$1.label;
        if (i != 0) {
        }
        map = (Map) obj3;
        if (map.isEmpty()) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(z6j z6jVar, List list, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1 detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1;
        int i;
        Map map;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1) {
            detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1 = (DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$0 = z6jVar;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label = 1;
                    obj = b(z6jVar, list, detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z6jVar = (z6j) detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$0;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                if (map.isEmpty()) {
                    Set keySet = map.keySet();
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label = 2;
                    Object m = m(z6jVar, keySet, detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1);
                    if (m != obj2) {
                        return m;
                    }
                } else {
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label = 3;
                    Object l = l(z6jVar, detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1);
                    if (l != obj2) {
                        return l;
                    }
                }
                return obj2;
            }
        }
        detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1 = new DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1(this, continuationImpl);
        Object obj3 = detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1.label;
        if (i != 0) {
        }
        map = (Map) obj3;
        if (map.isEmpty()) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(z6j z6jVar, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$internalStyle$1 detailsCardRoutePointsStyleMapper$internalStyle$1;
        int i;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$internalStyle$1) {
            detailsCardRoutePointsStyleMapper$internalStyle$1 = (DetailsCardRoutePointsStyleMapper$internalStyle$1) continuationImpl;
            int i2 = detailsCardRoutePointsStyleMapper$internalStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$internalStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$internalStyle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$internalStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    detailsCardRoutePointsStyleMapper$internalStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$internalStyle$1.label = 1;
                    obj = o(z6jVar, detailsCardRoutePointsStyleMapper$internalStyle$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new g7j(Collections.singletonList(obj));
            }
        }
        detailsCardRoutePointsStyleMapper$internalStyle$1 = new DetailsCardRoutePointsStyleMapper$internalStyle$1(this, continuationImpl);
        Object obj3 = detailsCardRoutePointsStyleMapper$internalStyle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$internalStyle$1.label;
        if (i != 0) {
        }
        return new g7j(Collections.singletonList(obj3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(OrderDetailsCardResponse.CardIcon cardIcon, int i, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1 detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1;
        int i2;
        String str;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1) {
            detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1 = (DetailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1) continuationImpl;
            int i3 = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.I$0 = i;
                    detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.label = 1;
                    if (cardIcon == null || (str = cardIcon.b) == null) {
                        obj = null;
                    } else {
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new DetailsCardRoutePointsStyleMapper$loadLeadIcon$2(this, str, null), detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1);
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.I$0;
                    kotlin.b.b(obj);
                }
                Drawable drawable = (Drawable) obj;
                return drawable != null ? new BitmapDrawable(this.f.getResources(), ((ugu0) this.a).a(i + 1)) : drawable;
            }
        }
        detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1 = new DetailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1(this, continuationImpl);
        Object obj2 = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = detailsCardRoutePointsStyleMapper$loadLeadIconWithIndexedFallback$1.label;
        if (i2 != 0) {
        }
        Drawable drawable2 = (Drawable) obj2;
        if (drawable2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0261, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0217 -> B:12:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(z6j z6jVar, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$pointsInternalStyle$1 detailsCardRoutePointsStyleMapper$pointsInternalStyle$1;
        int i;
        String str;
        z6j z6jVar2;
        Collection arrayList;
        Iterator it;
        int i2;
        List list;
        Collection collection;
        int i3;
        z6j z6jVar3;
        CharSequence charSequence;
        Collection collection2;
        Iterator it2;
        Object obj;
        Object c;
        String str2;
        Collection collection3;
        int i4;
        String str3;
        Object obj2;
        Object e;
        Collection collection4;
        boolean z;
        zuj0 zuj0Var = this.d.a;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$pointsInternalStyle$1) {
            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1 = (DetailsCardRoutePointsStyleMapper$pointsInternalStyle$1) continuationImpl;
            int i5 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label;
                if (i != 0) {
                    str = null;
                    kotlin.b.b(obj3);
                    z6jVar2 = z6jVar;
                    List list2 = z6jVar2.b;
                    if (list2 != null) {
                        List list3 = list2;
                        arrayList = new ArrayList(tcc.n(list3, 10));
                        it = list3.iterator();
                        i2 = 0;
                        if (it.hasNext()) {
                        }
                    }
                    list = EmptyList.a;
                    return new g7j(list);
                }
                if (i == 1) {
                    int i6 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1;
                    int i7 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0;
                    arrayList = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8;
                    str3 = (String) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7;
                    it = (Iterator) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4;
                    Collection collection5 = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3;
                    z6j z6jVar4 = (z6j) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0;
                    kotlin.b.b(obj3);
                    z6jVar3 = z6jVar4;
                    str2 = null;
                    collection3 = collection5;
                    i4 = i7;
                    i2 = i6;
                    obj2 = obj3;
                    CharSequence charSequence2 = (CharSequence) obj2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0 = z6jVar3;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$1 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$2 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3 = collection3;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4 = it;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$5 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$6 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8 = charSequence2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9 = arrayList;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0 = i4;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1 = i2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = 2;
                    e = e(str3, detailsCardRoutePointsStyleMapper$pointsInternalStyle$1);
                    if (e != obj4) {
                    }
                    return obj4;
                }
                if (i == 2) {
                    int i8 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1;
                    int i9 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0;
                    Collection collection6 = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9;
                    CharSequence charSequence3 = (CharSequence) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8;
                    Iterator it3 = (Iterator) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4;
                    Collection collection7 = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3;
                    z6j z6jVar5 = (z6j) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0;
                    kotlin.b.b(obj3);
                    i3 = i9;
                    collection = collection6;
                    it2 = it3;
                    collection2 = collection7;
                    z6jVar3 = z6jVar5;
                    i2 = i8;
                    charSequence = charSequence3;
                    obj = obj3;
                    CharSequence charSequence4 = (CharSequence) obj;
                    UiStateDrawableWrapper g = pkf.g(new BitmapDrawable(this.f.getResources(), ((ugu0) this.a).a(i2 + 1)), "internalIcon_" + i2, null);
                    int u = tje.u(20, ((avj0) this.c).a);
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0 = z6jVar3;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3 = collection2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4 = it2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$5 = null;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$6 = null;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7 = null;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8 = charSequence;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9 = charSequence4;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$10 = g;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$11 = collection;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0 = i3;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1 = i2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$2 = 1;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$3 = 1;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$4 = 0;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$5 = 2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$6 = u;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = 3;
                    c = c(z6jVar3, null, detailsCardRoutePointsStyleMapper$pointsInternalStyle$1);
                    if (c != obj4) {
                    }
                    return obj4;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$6;
                int i11 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$5;
                int i12 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$3;
                int i13 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$2;
                i3 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0;
                Collection collection8 = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$11;
                UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$10;
                CharSequence charSequence5 = (CharSequence) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9;
                charSequence = (CharSequence) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8;
                Iterator it4 = (Iterator) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4;
                Collection collection9 = (Collection) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3;
                z6j z6jVar6 = (z6j) detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0;
                kotlin.b.b(obj3);
                Iterator it5 = it4;
                UiStateDrawableWrapper uiStateDrawableWrapper2 = uiStateDrawableWrapper;
                CharSequence charSequence6 = charSequence5;
                int i14 = i11;
                Collection collection10 = collection8;
                int i15 = i10;
                Collection collection11 = collection9;
                int i16 = i12;
                int i17 = i13;
                z6jVar3 = z6jVar6;
                Object obj5 = obj3;
                CharSequence charSequence7 = charSequence;
                f fVar = (f) obj5;
                int i18 = i17;
                boolean z2 = i16 == 0;
                if (i18 == 0) {
                    collection4 = collection10;
                    z = true;
                } else {
                    collection4 = collection10;
                    z = false;
                }
                collection4.add(new f7j(d(z6jVar3), new DetailsCardListItem.a(i15, i14, z2, z, fVar, 4), charSequence7, charSequence6, uiStateDrawableWrapper2, false, false));
                z6jVar2 = z6jVar3;
                i2 = i3;
                arrayList = collection11;
                it = it5;
                str = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    i4 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str4 = (String) next;
                    DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = z6jVar2.a;
                    int i19 = detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? -1 : b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState.ordinal()];
                    String h = i19 == 2 ? ((avj0) zuj0Var).h(kyh0.order_edit_route_point) : i19 != 3 ? str : ((avj0) zuj0Var).h(kyh0.route_point);
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0 = z6jVar2;
                    str2 = str;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$1 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$2 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3 = arrayList;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4 = it;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$5 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$6 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7 = h;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8 = arrayList;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$10 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$11 = str2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0 = i4;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1 = i2;
                    detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = 1;
                    Object f = f(str4, detailsCardRoutePointsStyleMapper$pointsInternalStyle$1);
                    if (f != obj4) {
                        z6jVar3 = z6jVar2;
                        obj2 = f;
                        str3 = h;
                        collection3 = arrayList;
                        CharSequence charSequence22 = (CharSequence) obj2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0 = z6jVar3;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$1 = str2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$2 = str2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3 = collection3;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4 = it;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$5 = str2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$6 = str2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7 = str2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8 = charSequence22;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9 = arrayList;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0 = i4;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1 = i2;
                        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = 2;
                        e = e(str3, detailsCardRoutePointsStyleMapper$pointsInternalStyle$1);
                        if (e != obj4) {
                            collection = arrayList;
                            it2 = it;
                            i3 = i4;
                            collection2 = collection3;
                            charSequence = charSequence22;
                            obj = e;
                            CharSequence charSequence42 = (CharSequence) obj;
                            UiStateDrawableWrapper g2 = pkf.g(new BitmapDrawable(this.f.getResources(), ((ugu0) this.a).a(i2 + 1)), "internalIcon_" + i2, null);
                            int u2 = tje.u(20, ((avj0) this.c).a);
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$0 = z6jVar3;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$1 = null;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$2 = null;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$3 = collection2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$4 = it2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$5 = null;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$6 = null;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$7 = null;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$8 = charSequence;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$9 = charSequence42;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$10 = g2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.L$11 = collection;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$0 = i3;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$1 = i2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$2 = 1;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$3 = 1;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$4 = 0;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$5 = 2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.I$6 = u2;
                            detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label = 3;
                            c = c(z6jVar3, null, detailsCardRoutePointsStyleMapper$pointsInternalStyle$1);
                            if (c != obj4) {
                                uiStateDrawableWrapper2 = g2;
                                it5 = it2;
                                obj5 = c;
                                charSequence6 = charSequence42;
                                i15 = u2;
                                i14 = 2;
                                collection10 = collection;
                                i16 = 1;
                                collection11 = collection2;
                                i17 = 1;
                                CharSequence charSequence72 = charSequence;
                                f fVar2 = (f) obj5;
                                int i182 = i17;
                                if (i16 == 0) {
                                }
                                if (i182 == 0) {
                                }
                                collection4.add(new f7j(d(z6jVar3), new DetailsCardListItem.a(i15, i14, z2, z, fVar2, 4), charSequence72, charSequence6, uiStateDrawableWrapper2, false, false));
                                z6jVar2 = z6jVar3;
                                i2 = i3;
                                arrayList = collection11;
                                it = it5;
                                str = null;
                                if (it.hasNext()) {
                                    list = (List) arrayList;
                                }
                            }
                        }
                    }
                    return obj4;
                }
            }
        }
        detailsCardRoutePointsStyleMapper$pointsInternalStyle$1 = new DetailsCardRoutePointsStyleMapper$pointsInternalStyle$1(this, continuationImpl);
        Object obj32 = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$pointsInternalStyle$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009b -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(z6j z6jVar, Set set, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$pointsRemoteStyle$1 detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$pointsRemoteStyle$1) {
            detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1 = (DetailsCardRoutePointsStyleMapper$pointsRemoteStyle$1) continuationImpl;
            int i3 = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                    it = set2.iterator();
                    collection = arrayList;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.I$0;
                    collection = (Collection) detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$8;
                    it = (Iterator) detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$5;
                    Collection collection2 = (Collection) detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$4;
                    z6j z6jVar2 = (z6j) detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$0;
                    kotlin.b.b(obj);
                    int i5 = i4;
                    z6jVar = z6jVar2;
                    collection.add((f7j) obj);
                    collection = collection2;
                    i2 = i5;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$0 = z6jVar;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$1 = null;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$2 = null;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$3 = null;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$4 = collection;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$5 = it;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$6 = null;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$7 = null;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.L$8 = collection;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.I$0 = i5;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.I$1 = i2;
                        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.label = 1;
                        obj = n((x6j) next, z6jVar, i2, detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        collection2 = collection;
                        collection.add((f7j) obj);
                        collection = collection2;
                        i2 = i5;
                        if (it.hasNext()) {
                            return new g7j((List) collection);
                        }
                    }
                }
            }
        }
        detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1 = new DetailsCardRoutePointsStyleMapper$pointsRemoteStyle$1(this, continuationImpl);
        Object obj3 = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$pointsRemoteStyle$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(x6j x6jVar, z6j z6jVar, int i, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$routePointRemoteStyle$1 detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1;
        Object obj;
        int i2;
        z6j z6jVar2;
        x6j x6jVar2;
        int i3;
        Object s;
        CharSequence charSequence;
        z6j z6jVar3;
        Object k;
        CharSequence charSequence2;
        z6j z6jVar4;
        int c;
        Object c2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        CharSequence charSequence3;
        int i4;
        int i5;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$routePointRemoteStyle$1) {
            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1 = (DetailsCardRoutePointsStyleMapper$routePointRemoteStyle$1) continuationImpl;
            int i6 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label;
                e eVar = this.e;
                int i7 = 2;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = x6jVar.a;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = x6jVar;
                    z6jVar2 = z6jVar;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar2;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 1;
                    obj2 = e.s(eVar, formattedText, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                    if (obj2 != obj) {
                        x6jVar2 = x6jVar;
                        i3 = i;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0;
                        charSequence = (CharSequence) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2;
                        z6jVar3 = (z6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1;
                        x6jVar2 = (x6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence4 = (CharSequence) obj2;
                        OrderDetailsCardResponse.CardIcon cardIcon = x6jVar2.c;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = x6jVar2;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar3;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3 = charSequence4;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
                        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 3;
                        k = k(cardIcon, i3, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                        if (k != obj) {
                            z6j z6jVar5 = z6jVar3;
                            charSequence2 = charSequence4;
                            obj2 = k;
                            z6jVar4 = z6jVar5;
                            UiStateDrawableWrapper g = pkf.g((Drawable) obj2, "internalIcon_" + i3, null);
                            c = ((avj0) this.c).c(mrg0.go_design_s_space);
                            i1 i1Var = x6jVar2.d;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = null;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar4;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3 = charSequence2;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$4 = g;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$1 = c;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$2 = 2;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$3 = 0;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$4 = 1;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$5 = 1;
                            detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 4;
                            c2 = c(z6jVar4, i1Var, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                            if (c2 != obj) {
                            }
                        }
                        return obj;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$5;
                        i4 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$4;
                        i7 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$2;
                        int i8 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$1;
                        UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$4;
                        charSequence2 = (CharSequence) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3;
                        charSequence3 = (CharSequence) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2;
                        z6jVar4 = (z6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1;
                        kotlin.b.b(obj2);
                        c = i8;
                        uiStateDrawableWrapper = uiStateDrawableWrapper2;
                        return new f7j(d(z6jVar4), new DetailsCardListItem.a(c, i7, i4 == 0, i5 == 0, (f) obj2, 4), charSequence3, charSequence2, uiStateDrawableWrapper, false, true);
                    }
                    i3 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0;
                    CharSequence charSequence5 = (CharSequence) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3;
                    CharSequence charSequence6 = (CharSequence) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2;
                    z6jVar4 = (z6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1;
                    x6jVar2 = (x6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0;
                    kotlin.b.b(obj2);
                    charSequence2 = charSequence5;
                    charSequence = charSequence6;
                    UiStateDrawableWrapper g2 = pkf.g((Drawable) obj2, "internalIcon_" + i3, null);
                    c = ((avj0) this.c).c(mrg0.go_design_s_space);
                    i1 i1Var2 = x6jVar2.d;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = null;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar4;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3 = charSequence2;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$4 = g2;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$1 = c;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$2 = 2;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$3 = 0;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$4 = 1;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$5 = 1;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 4;
                    c2 = c(z6jVar4, i1Var2, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                    if (c2 != obj) {
                        uiStateDrawableWrapper = g2;
                        charSequence3 = charSequence;
                        i4 = 1;
                        obj2 = c2;
                        i5 = 1;
                        return new f7j(d(z6jVar4), new DetailsCardListItem.a(c, i7, i4 == 0, i5 == 0, (f) obj2, 4), charSequence3, charSequence2, uiStateDrawableWrapper, false, true);
                    }
                    return obj;
                }
                i3 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0;
                z6jVar2 = (z6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1;
                x6jVar2 = (x6j) detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0;
                kotlin.b.b(obj2);
                CharSequence charSequence7 = (CharSequence) obj2;
                FormattedText formattedText2 = x6jVar2.b;
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = x6jVar2;
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar2;
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence7;
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
                detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 2;
                s = e.s(eVar, formattedText2, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                if (s != obj) {
                    z6j z6jVar6 = z6jVar2;
                    charSequence = charSequence7;
                    obj2 = s;
                    z6jVar3 = z6jVar6;
                    CharSequence charSequence42 = (CharSequence) obj2;
                    OrderDetailsCardResponse.CardIcon cardIcon2 = x6jVar2.c;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = x6jVar2;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar3;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$3 = charSequence42;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
                    detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 3;
                    k = k(cardIcon2, i3, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
                    if (k != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1 = new DetailsCardRoutePointsStyleMapper$routePointRemoteStyle$1(this, continuationImpl);
        Object obj22 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label;
        e eVar2 = this.e;
        int i72 = 2;
        if (i2 != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj22;
        FormattedText formattedText22 = x6jVar2.b;
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$0 = x6jVar2;
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$1 = z6jVar2;
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.L$2 = charSequence72;
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.I$0 = i3;
        detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1.label = 2;
        s = e.s(eVar2, formattedText22, detailsCardRoutePointsStyleMapper$routePointRemoteStyle$1);
        if (s != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        if (r2 == r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(z6j z6jVar, ContinuationImpl continuationImpl) {
        DetailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1 detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1;
        Object obj;
        int i;
        String str;
        String h;
        Object e;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object c;
        z6j z6jVar2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        int i2;
        int i3;
        CharSequence charSequence3;
        int i4;
        z6j z6jVar3 = z6jVar;
        zuj0 zuj0Var = this.d.a;
        if (continuationImpl instanceof DetailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1) {
            detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1 = (DetailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1) continuationImpl;
            int i5 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label;
                int i6 = 2;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = z6jVar3.a;
                    if ((detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? -1 : b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState.ordinal()]) == 1) {
                        str = ((avj0) zuj0Var).h(kyh0.order_add_route_point);
                    } else {
                        List list = z6jVar3.b;
                        str = list != null ? (String) kotlin.collections.a.R(list) : null;
                        if (str == null) {
                            str = "";
                        }
                    }
                    DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState2 = z6jVar3.a;
                    int i7 = detailsCardRoutePointsStyleInteractor$RoutePointsState2 != null ? b7j.a[detailsCardRoutePointsStyleInteractor$RoutePointsState2.ordinal()] : -1;
                    h = i7 != 2 ? i7 != 3 ? null : ((avj0) zuj0Var).h(kyh0.route_point) : ((avj0) zuj0Var).h(kyh0.order_edit_route_point);
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0 = z6jVar3;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2 = h;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = 1;
                    obj2 = f(str, detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$4;
                            i3 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$3;
                            i6 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$1;
                            int i8 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$0;
                            UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$5;
                            charSequence2 = (CharSequence) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$4;
                            charSequence3 = (CharSequence) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3;
                            z6jVar2 = (z6j) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0;
                            kotlin.b.b(obj2);
                            i2 = i8;
                            uiStateDrawableWrapper = uiStateDrawableWrapper2;
                            return new f7j(d(z6jVar2), new DetailsCardListItem.a(i2, i6, i3 == 0, i4 != 0, (f) obj2, 4), charSequence3, charSequence2, uiStateDrawableWrapper, false, false);
                        }
                        CharSequence charSequence4 = (CharSequence) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3;
                        z6j z6jVar4 = (z6j) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence = charSequence4;
                        z6jVar3 = z6jVar4;
                        charSequence2 = (CharSequence) obj2;
                        int i9 = n4h0.ic_order_card_add_route_point;
                        avj0 avj0Var = (avj0) this.c;
                        UiStateDrawableWrapper g = pkf.g(vng.t(i9, avj0Var.a), "", null);
                        int u = tje.u(20, avj0Var.a);
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0 = z6jVar3;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$1 = null;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2 = null;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3 = charSequence;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$4 = charSequence2;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$5 = g;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$0 = u;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$1 = 2;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$2 = 0;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$3 = 1;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$4 = 1;
                        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = 3;
                        c = c(z6jVar3, null, detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1);
                        if (c != obj) {
                            z6jVar2 = z6jVar3;
                            uiStateDrawableWrapper = g;
                            i2 = u;
                            i3 = 1;
                            obj2 = c;
                            charSequence3 = charSequence;
                            i4 = 1;
                            return new f7j(d(z6jVar2), new DetailsCardListItem.a(i2, i6, i3 == 0, i4 != 0, (f) obj2, 4), charSequence3, charSequence2, uiStateDrawableWrapper, false, false);
                        }
                        return obj;
                    }
                    String str2 = (String) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2;
                    z6j z6jVar5 = (z6j) detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0;
                    kotlin.b.b(obj2);
                    h = str2;
                    z6jVar3 = z6jVar5;
                }
                CharSequence charSequence5 = (CharSequence) obj2;
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0 = z6jVar3;
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$1 = null;
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2 = null;
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3 = charSequence5;
                detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = 2;
                e = e(h, detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1);
                if (e != obj) {
                    charSequence = charSequence5;
                    obj2 = e;
                    charSequence2 = (CharSequence) obj2;
                    int i92 = n4h0.ic_order_card_add_route_point;
                    avj0 avj0Var2 = (avj0) this.c;
                    UiStateDrawableWrapper g2 = pkf.g(vng.t(i92, avj0Var2.a), "", null);
                    int u2 = tje.u(20, avj0Var2.a);
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0 = z6jVar3;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$1 = null;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2 = null;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3 = charSequence;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$4 = charSequence2;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$5 = g2;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$0 = u2;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$1 = 2;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$2 = 0;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$3 = 1;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.I$4 = 1;
                    detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = 3;
                    c = c(z6jVar3, null, detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1);
                    if (c != obj) {
                    }
                }
                return obj;
            }
        }
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1 = new DetailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1(this, continuationImpl);
        Object obj22 = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label;
        int i62 = 2;
        if (i != 0) {
        }
        CharSequence charSequence52 = (CharSequence) obj22;
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$0 = z6jVar3;
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$1 = null;
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$2 = null;
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.L$3 = charSequence52;
        detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1.label = 2;
        e = e(h, detailsCardRoutePointsStyleMapper$singleRoutePointInternalStyle$1);
        if (e != obj) {
        }
        return obj;
    }
}
