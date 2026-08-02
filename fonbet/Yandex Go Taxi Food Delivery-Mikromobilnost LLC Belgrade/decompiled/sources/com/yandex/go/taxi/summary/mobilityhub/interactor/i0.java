package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TextBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubButtonContainerDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2$TransportSelectorAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedMultimodalRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedTransportRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$SelectOffer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$AlternativeOfferItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferHeaderDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.c2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.s0;
import defpackage.a2v;
import defpackage.amp0;
import defpackage.atj0;
import defpackage.btj0;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.dxu;
import defpackage.fyu;
import defpackage.h73;
import defpackage.hpi0;
import defpackage.ip21;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jym;
import defpackage.kcz0;
import defpackage.ke31;
import defpackage.kf31;
import defpackage.khq0;
import defpackage.kz6;
import defpackage.lhq0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.qbl0;
import defpackage.rta1;
import defpackage.ru60;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.wiq0;
import defpackage.x1v;
import defpackage.ycc;
import defpackage.yw01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class i0 {
    public final String a;
    public final o7r0 b;
    public final fyu c;
    public final qbl0 d;
    public final com.yandex.go.route.interactor.b e;
    public final uze0 f;
    public final hpi0 g;
    public final kcz0 h;
    public final com.yandex.go.taxi.summary.mobilityhub.experiment.g i;
    public final lhq0 j;
    public final com.yandex.go.taxi.summary.mobilityhub.mapper.e k;
    public final n l;
    public final dxu m;
    public final jym n;
    public final amp0 o;
    public final wiq0 p;
    public final x1v q;
    public final a2v r;
    public ip21 s;

    public i0(String str, tt2 tt2Var, o7r0 o7r0Var, fyu fyuVar, qbl0 qbl0Var, com.yandex.go.route.interactor.b bVar, uze0 uze0Var, hpi0 hpi0Var, kcz0 kcz0Var, com.yandex.go.taxi.summary.mobilityhub.experiment.g gVar, lhq0 lhq0Var, com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar, n nVar, dxu dxuVar, jym jymVar, amp0 amp0Var, wiq0 wiq0Var, x1v x1vVar, a2v a2vVar) {
        this.a = str;
        this.b = o7r0Var;
        this.c = fyuVar;
        this.d = qbl0Var;
        this.e = bVar;
        this.f = uze0Var;
        this.g = hpi0Var;
        this.h = kcz0Var;
        this.i = gVar;
        this.j = lhq0Var;
        this.k = eVar;
        this.l = nVar;
        this.m = dxuVar;
        this.n = jymVar;
        this.o = amp0Var;
        this.p = wiq0Var;
        this.q = x1vVar;
        this.r = a2vVar;
    }

    public static final void a(i0 i0Var, tse tseVar, s0 s0Var, ArrayList arrayList) {
        i0Var.getClass();
        if (s0Var == null) {
            return;
        }
        arrayList.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$enqueueActionRouteResolving$1(i0Var, s0Var, null), 3));
        if (s0Var instanceof HubItemActionV2$DetailedMultimodalRoute) {
            ycc.r(i0Var.e(tseVar, ((HubItemActionV2$DetailedMultimodalRoute) s0Var).b), arrayList);
        }
    }

    public static final void b(i0 i0Var, List list) {
        Object obj;
        TransportSelectorPayloadDto transportSelectorPayloadDto;
        List list2;
        TransportSelectorPayloadDto transportSelectorPayloadDto2;
        List<TransportSelectorOptionDto> list3;
        fyu fyuVar = i0Var.c;
        List list4 = list;
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            HubFilterDtoV2 hubFilterDtoV2 = (HubFilterDtoV2) obj;
            if ((hubFilterDtoV2.h instanceof com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u) && hubFilterDtoV2.e) {
                break;
            }
        }
        HubFilterDtoV2 hubFilterDtoV22 = (HubFilterDtoV2) obj;
        fyuVar.c(hubFilterDtoV22 != null ? hubFilterDtoV22.a : null, true);
        HubFilterActionV2$TransportSelectorAction hubFilterActionV2$TransportSelectorAction = (HubFilterActionV2$TransportSelectorAction) kotlin.sequences.b.j(kotlin.sequences.b.g(new yw01(new h73(1, list4), new ke31(1)), kf31.a));
        Set linkedHashSet = new LinkedHashSet();
        if (hubFilterActionV2$TransportSelectorAction != null && (transportSelectorPayloadDto2 = hubFilterActionV2$TransportSelectorAction.a) != null && (list3 = transportSelectorPayloadDto2.e) != null) {
            for (TransportSelectorOptionDto transportSelectorOptionDto : list3) {
                if (transportSelectorOptionDto.d) {
                    linkedHashSet.add(transportSelectorOptionDto.a);
                }
            }
        }
        boolean z = linkedHashSet.size() == ((hubFilterActionV2$TransportSelectorAction == null || (transportSelectorPayloadDto = hubFilterActionV2$TransportSelectorAction.a) == null || (list2 = transportSelectorPayloadDto.e) == null) ? 0 : list2.size());
        if (hubFilterActionV2$TransportSelectorAction != null) {
            if (z) {
                linkedHashSet = EmptySet.a;
            }
            fyuVar.d(linkedHashSet, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x07f1, code lost:
    
        if (r4 != null) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x060c  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x05d2 -> B:85:0x022a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x05ea -> B:87:0x05e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0470 -> B:89:0x060a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i0 i0Var, List list, Map map, ContinuationImpl continuationImpl) {
        VerticalOffersStateInteractorV2$preselectDefaultOffer$1 verticalOffersStateInteractorV2$preselectDefaultOffer$1;
        int i;
        Object obj;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto;
        s0 s0Var;
        ArrayList arrayList;
        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV2;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer;
        VerticalOffersStateInteractorV2$preselectDefaultOffer$1 verticalOffersStateInteractorV2$preselectDefaultOffer$12;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto2;
        Iterator it;
        Map map2;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto3;
        Map map3;
        Iterator it2;
        Object obj2;
        zy11 zy11Var;
        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV22;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto4;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer2;
        atj0 atj0Var;
        String str;
        Integer num;
        String str2;
        atj0 atj0Var2;
        ?? r12;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto5;
        Iterator it3;
        CharSequence charSequence;
        Object obj3;
        Iterator it4;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer3;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto6;
        CoroutineSingletons coroutineSingletons;
        atj0 atj0Var3;
        String str3;
        Integer num2;
        String str4;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object obj4;
        ArrayList arrayList2;
        DefaultOfferBodyDtoV2$TextBodyDtoV2 defaultOfferBodyDtoV2$TextBodyDtoV2;
        CoroutineSingletons coroutineSingletons2;
        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto7;
        Object obj5;
        Object c;
        Object c2;
        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar2;
        zy11 zy11Var2;
        List list2;
        List list3;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2;
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar;
        Integer num3;
        CoroutineSingletons coroutineSingletons3;
        Map map4;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer4;
        List list4;
        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV23;
        btj0 btj0Var;
        btj0 btj0Var2;
        Object obj6;
        List list5;
        atj0 atj0Var4;
        List list6;
        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV24;
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar2;
        Map map5;
        Object obj7;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer5;
        Integer num4;
        String str5;
        String str6;
        Pair pair;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object c3;
        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV25;
        List list7;
        atj0 atj0Var5;
        CharSequence charSequence8;
        Object obj8;
        Object c4;
        CharSequence charSequence9;
        Object obj9;
        String str7;
        CharSequence charSequence10;
        Integer num5;
        atj0 atj0Var6;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer6;
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar3;
        DefaultOfferBodyDtoV2$TextBodyDtoV2 defaultOfferBodyDtoV2$TextBodyDtoV22;
        CharSequence charSequence11;
        Integer num6;
        CharSequence charSequence12;
        Object obj10;
        Integer num7;
        CharSequence charSequence13;
        DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 defaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
        DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 defaultOfferBodyDtoV2$TransportRouteBodyDtoV22;
        String str8;
        List list8;
        Iterator it5;
        Object obj11;
        TransportRouteSection transportRouteSection;
        String str9;
        Object i2;
        btj0 btj0Var3;
        List list9;
        Map map6;
        String str10;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer7;
        List list10;
        Iterator it6;
        Object obj12;
        TransportRouteSection transportRouteSection2;
        List list11;
        lhq0 lhq0Var = i0Var.j;
        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar3 = i0Var.k;
        if (continuationImpl instanceof VerticalOffersStateInteractorV2$preselectDefaultOffer$1) {
            verticalOffersStateInteractorV2$preselectDefaultOffer$1 = (VerticalOffersStateInteractorV2$preselectDefaultOffer$1) continuationImpl;
            int i3 = verticalOffersStateInteractorV2$preselectDefaultOffer$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = i3 - Integer.MIN_VALUE;
                Object obj13 = verticalOffersStateInteractorV2$preselectDefaultOffer$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalOffersStateInteractorV2$preselectDefaultOffer$1.label;
                zy11 zy11Var3 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj13);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj14 : list) {
                            if (obj14 instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                                arrayList5.add(obj14);
                            }
                        }
                        String str11 = lhq0Var.a.a;
                        Iterator it7 = arrayList5.iterator();
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV26 = null;
                        while (it7.hasNext()) {
                            HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV27 = (HubItemDtoV2$DefaultOfferItemDtoV2) it7.next();
                            s0 s0Var2 = hubItemDtoV2$DefaultOfferItemDtoV27.g;
                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer8 = s0Var2 instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var2 : null;
                            String str12 = hubItemActionV2$SelectOffer8 != null ? hubItemActionV2$SelectOffer8.a : null;
                            if (str12 == null || !str12.equals(str11)) {
                                List list12 = hubItemDtoV2$DefaultOfferItemDtoV27.f;
                                if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                                    Iterator it8 = list12.iterator();
                                    while (it8.hasNext()) {
                                        s0 s0Var3 = ((HubItemDtoV2$AlternativeOfferItemDto) it8.next()).e;
                                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer9 = s0Var3 instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var3 : null;
                                        if (jl40.l(hubItemActionV2$SelectOffer9 != null ? hubItemActionV2$SelectOffer9.a : null, str11)) {
                                        }
                                    }
                                }
                                if (hubItemDtoV2$DefaultOfferItemDtoV27.d) {
                                    if (str11 != null) {
                                        hubItemDtoV2$DefaultOfferItemDtoV26 = hubItemDtoV2$DefaultOfferItemDtoV27;
                                    }
                                }
                            }
                            hubItemDtoV2$DefaultOfferItemDtoV26 = hubItemDtoV2$DefaultOfferItemDtoV27;
                            if (hubItemDtoV2$DefaultOfferItemDtoV26 != null) {
                                List list13 = hubItemDtoV2$DefaultOfferItemDtoV26.f;
                                String str13 = lhq0Var.a.a;
                                if (str13 == null) {
                                    hubItemDtoV2$AlternativeOfferItemDto = null;
                                } else {
                                    Iterator it9 = list13.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            obj = it9.next();
                                            s0 s0Var4 = ((HubItemDtoV2$AlternativeOfferItemDto) obj).e;
                                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer10 = s0Var4 instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var4 : null;
                                            if (jl40.l(hubItemActionV2$SelectOffer10 != null ? hubItemActionV2$SelectOffer10.a : null, str13)) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    hubItemDtoV2$AlternativeOfferItemDto = (HubItemDtoV2$AlternativeOfferItemDto) obj;
                                }
                                if (hubItemDtoV2$AlternativeOfferItemDto == null || (s0Var = hubItemDtoV2$AlternativeOfferItemDto.e) == null) {
                                    s0Var = hubItemDtoV2$DefaultOfferItemDtoV26.g;
                                }
                                HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer11 = s0Var instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var : null;
                                if (hubItemActionV2$SelectOffer11 != null) {
                                    arrayList = new ArrayList();
                                    hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV26;
                                    hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer11;
                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                                    hubItemDtoV2$AlternativeOfferItemDto2 = hubItemDtoV2$AlternativeOfferItemDto;
                                    it = list13.iterator();
                                    map2 = map;
                                    if (it.hasNext()) {
                                        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto8 = (HubItemDtoV2$AlternativeOfferItemDto) it.next();
                                        s0 s0Var5 = hubItemDtoV2$AlternativeOfferItemDto8.e;
                                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer12 = s0Var5 instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var5 : null;
                                        if (hubItemActionV2$SelectOffer12 != null && (str6 = hubItemActionV2$SelectOffer12.e) != null && (atj0Var = (atj0) map2.get(hubItemActionV2$SelectOffer12)) != null) {
                                            Integer num8 = hubItemDtoV2$AlternativeOfferItemDto8.b;
                                            FormattedText formattedText = hubItemDtoV2$AlternativeOfferItemDto8.c.c;
                                            zy11Var = zy11Var3;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map2;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = hubItemDtoV2$AlternativeOfferItemDto2;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = arrayList;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = it;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = hubItemDtoV2$AlternativeOfferItemDto8;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = atj0Var;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = str6;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = num8;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = str6;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 1;
                                            Object c5 = eVar3.c(formattedText, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                            if (c5 != coroutineSingletons4) {
                                                hubItemDtoV2$AlternativeOfferItemDto4 = hubItemDtoV2$AlternativeOfferItemDto2;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1 = verticalOffersStateInteractorV2$preselectDefaultOffer$12;
                                                num = num8;
                                                map3 = map2;
                                                obj2 = c5;
                                                hubItemDtoV2$DefaultOfferItemDtoV22 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                hubItemDtoV2$AlternativeOfferItemDto3 = hubItemDtoV2$AlternativeOfferItemDto8;
                                                it2 = it;
                                                str2 = str6;
                                                hubItemActionV2$SelectOffer2 = hubItemActionV2$SelectOffer;
                                                str = str2;
                                                CharSequence charSequence14 = (CharSequence) obj2;
                                                FormattedText formattedText2 = hubItemDtoV2$AlternativeOfferItemDto3.c.d;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map3;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV22;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = hubItemDtoV2$AlternativeOfferItemDto4;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer2;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = arrayList;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = it2;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = hubItemDtoV2$AlternativeOfferItemDto3;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = atj0Var;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17 = str;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18 = num;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19 = str2;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20 = charSequence14;
                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 2;
                                                c2 = eVar3.c(formattedText2, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                coroutineSingletons4 = coroutineSingletons4;
                                                if (c2 != coroutineSingletons4) {
                                                    obj3 = c2;
                                                    charSequence = charSequence14;
                                                    Iterator it10 = it2;
                                                    hubItemDtoV2$AlternativeOfferItemDto5 = hubItemDtoV2$AlternativeOfferItemDto3;
                                                    atj0Var2 = atj0Var;
                                                    r12 = arrayList;
                                                    it3 = it10;
                                                    CharSequence charSequence15 = (CharSequence) obj3;
                                                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons4;
                                                    FormattedText formattedText3 = hubItemDtoV2$AlternativeOfferItemDto5.c.e;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map3;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV22;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = hubItemDtoV2$AlternativeOfferItemDto4;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer2;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = r12;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = it3;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = hubItemDtoV2$AlternativeOfferItemDto5;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = atj0Var2;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17 = str;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18 = num;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19 = str2;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20 = charSequence;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$21 = charSequence15;
                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 3;
                                                    eVar3 = eVar3;
                                                    c = eVar3.c(formattedText3, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                    CharSequence charSequence16 = charSequence;
                                                    coroutineSingletons2 = coroutineSingletons5;
                                                    if (c != coroutineSingletons2) {
                                                        String str14 = str2;
                                                        charSequence3 = charSequence15;
                                                        hubItemDtoV2$AlternativeOfferItemDto6 = hubItemDtoV2$AlternativeOfferItemDto4;
                                                        hubItemActionV2$SelectOffer3 = hubItemActionV2$SelectOffer2;
                                                        arrayList2 = r12;
                                                        it4 = it3;
                                                        str3 = str;
                                                        str4 = str14;
                                                        coroutineSingletons = coroutineSingletons2;
                                                        obj4 = c;
                                                        atj0Var3 = atj0Var2;
                                                        num2 = num;
                                                        charSequence2 = charSequence16;
                                                        CharSequence charSequence17 = (CharSequence) obj4;
                                                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar4 = hubItemDtoV2$AlternativeOfferItemDto5.d;
                                                        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar4 = eVar3;
                                                        defaultOfferBodyDtoV2$TextBodyDtoV2 = !(fVar4 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2) ? (DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar4 : null;
                                                        if (defaultOfferBodyDtoV2$TextBodyDtoV2 == null) {
                                                            FormattedText formattedText4 = defaultOfferBodyDtoV2$TextBodyDtoV2.a;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map3;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV22;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = hubItemDtoV2$AlternativeOfferItemDto6;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer3;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = arrayList2;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = it4;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = atj0Var3;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17 = str3;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18 = num2;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19 = str4;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20 = charSequence2;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$21 = charSequence3;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$22 = charSequence17;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$23 = null;
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 4;
                                                            eVar = eVar4;
                                                            Object c6 = eVar.c(formattedText4, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                            charSequence7 = charSequence17;
                                                            coroutineSingletons2 = coroutineSingletons;
                                                            if (c6 != coroutineSingletons2) {
                                                                hubItemDtoV2$AlternativeOfferItemDto7 = hubItemDtoV2$AlternativeOfferItemDto6;
                                                                obj5 = c6;
                                                                arrayList4 = arrayList2;
                                                                charSequence6 = (CharSequence) obj5;
                                                                charSequence4 = charSequence7;
                                                                charSequence5 = charSequence3;
                                                                hubItemDtoV2$AlternativeOfferItemDto6 = hubItemDtoV2$AlternativeOfferItemDto7;
                                                                arrayList3 = arrayList4;
                                                                pair = new Pair(str4, new btj0(atj0Var3, str3, charSequence2, charSequence5, charSequence4, charSequence6, num2));
                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                                                                hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV22;
                                                                it = it4;
                                                                arrayList = arrayList3;
                                                                hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer3;
                                                                hubItemDtoV2$AlternativeOfferItemDto2 = hubItemDtoV2$AlternativeOfferItemDto6;
                                                                map2 = map3;
                                                                if (pair != null) {
                                                                    arrayList.add(pair);
                                                                }
                                                                coroutineSingletons4 = coroutineSingletons2;
                                                                eVar3 = eVar;
                                                                zy11Var3 = zy11Var;
                                                                if (it.hasNext()) {
                                                                    eVar2 = eVar3;
                                                                    coroutineSingletons2 = coroutineSingletons4;
                                                                    zy11Var2 = zy11Var3;
                                                                    ArrayList<Pair> arrayList6 = arrayList;
                                                                    int n = tcc.n(arrayList6, 10);
                                                                    ArrayList arrayList7 = new ArrayList(n);
                                                                    ArrayList arrayList8 = new ArrayList(n);
                                                                    for (Pair pair2 : arrayList6) {
                                                                        arrayList7.add(pair2.c());
                                                                        arrayList8.add(pair2.f());
                                                                    }
                                                                    Pair pair3 = new Pair(arrayList7, arrayList8);
                                                                    list2 = (List) pair3.getFirst();
                                                                    list3 = (List) pair3.getSecond();
                                                                    if (hubItemDtoV2$AlternativeOfferItemDto2 == null || (hubItemDtoV2$DefaultOfferHeaderDtoV2 = hubItemDtoV2$AlternativeOfferItemDto2.c) == null) {
                                                                        hubItemDtoV2$DefaultOfferHeaderDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV2.c;
                                                                    }
                                                                    if (hubItemDtoV2$AlternativeOfferItemDto2 == null || (fVar = hubItemDtoV2$AlternativeOfferItemDto2.d) == null) {
                                                                        fVar = hubItemDtoV2$DefaultOfferItemDtoV2.e;
                                                                    }
                                                                    if (hubItemDtoV2$AlternativeOfferItemDto2 == null || (num3 = hubItemDtoV2$AlternativeOfferItemDto2.b) == null) {
                                                                        num3 = hubItemDtoV2$DefaultOfferItemDtoV2.b;
                                                                    }
                                                                    String str15 = hubItemActionV2$SelectOffer.e;
                                                                    if (str15 != null) {
                                                                        atj0 atj0Var7 = (atj0) map2.get(hubItemActionV2$SelectOffer);
                                                                        if (atj0Var7 != null) {
                                                                            FormattedText formattedText5 = hubItemDtoV2$DefaultOfferHeaderDtoV2.c;
                                                                            obj6 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map2;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = list2;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = fVar;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = num3;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = str15;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = atj0Var7;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 5;
                                                                            Object c7 = eVar2.c(formattedText5, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                            if (c7 != coroutineSingletons2) {
                                                                                list5 = list3;
                                                                                atj0Var4 = atj0Var7;
                                                                                list6 = list2;
                                                                                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar5 = fVar;
                                                                                hubItemDtoV2$DefaultOfferItemDtoV24 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                                fVar2 = fVar5;
                                                                                map5 = map2;
                                                                                obj7 = c7;
                                                                                hubItemActionV2$SelectOffer5 = hubItemActionV2$SelectOffer;
                                                                                num4 = num3;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1 = verticalOffersStateInteractorV2$preselectDefaultOffer$12;
                                                                                str5 = str15;
                                                                                CharSequence charSequence18 = (CharSequence) obj7;
                                                                                FormattedText formattedText6 = hubItemDtoV2$DefaultOfferHeaderDtoV2.d;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = obj6;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map5;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = obj6;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV24;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = obj6;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer5;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = list6;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = list5;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = fVar2;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = num4;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = str5;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = atj0Var4;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = charSequence18;
                                                                                verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 6;
                                                                                c3 = eVar2.c(formattedText6, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                                                if (c3 != coroutineSingletons2) {
                                                                                    hubItemDtoV2$DefaultOfferItemDtoV25 = hubItemDtoV2$DefaultOfferItemDtoV24;
                                                                                    list7 = list5;
                                                                                    atj0Var5 = atj0Var4;
                                                                                    charSequence8 = charSequence18;
                                                                                    obj8 = c3;
                                                                                    CharSequence charSequence19 = (CharSequence) obj8;
                                                                                    FormattedText formattedText7 = hubItemDtoV2$DefaultOfferHeaderDtoV2.e;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map5;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV25;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = null;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer5;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = list6;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = list7;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = null;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = fVar2;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = num4;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = str5;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = atj0Var5;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = charSequence8;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = charSequence19;
                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 7;
                                                                                    c4 = eVar2.c(formattedText7, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                                                    if (c4 != coroutineSingletons2) {
                                                                                        String str16 = str5;
                                                                                        charSequence9 = charSequence19;
                                                                                        obj9 = c4;
                                                                                        str7 = str16;
                                                                                        Integer num9 = num4;
                                                                                        charSequence10 = charSequence8;
                                                                                        num5 = num9;
                                                                                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar6 = fVar2;
                                                                                        atj0Var6 = atj0Var5;
                                                                                        list2 = list6;
                                                                                        hubItemActionV2$SelectOffer6 = hubItemActionV2$SelectOffer5;
                                                                                        fVar3 = fVar6;
                                                                                        CharSequence charSequence20 = (CharSequence) obj9;
                                                                                        defaultOfferBodyDtoV2$TextBodyDtoV22 = !(fVar3 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2) ? (DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar3 : null;
                                                                                        if (defaultOfferBodyDtoV2$TextBodyDtoV22 == null) {
                                                                                            FormattedText formattedText8 = defaultOfferBodyDtoV2$TextBodyDtoV22.a;
                                                                                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map5;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV25;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer6;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = list2;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = list7;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = fVar3;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = num5;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = str7;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = atj0Var6;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = charSequence10;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = charSequence9;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = charSequence20;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 8;
                                                                                            Object c8 = eVar2.c(formattedText8, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                                                                                            coroutineSingletons3 = coroutineSingletons6;
                                                                                            if (c8 == coroutineSingletons3) {
                                                                                                return coroutineSingletons3;
                                                                                            }
                                                                                            obj10 = c8;
                                                                                            num7 = num5;
                                                                                            charSequence13 = charSequence20;
                                                                                            num6 = num7;
                                                                                            charSequence12 = (CharSequence) obj10;
                                                                                            charSequence11 = charSequence13;
                                                                                            CharSequence charSequence21 = charSequence9;
                                                                                            CharSequence charSequence22 = charSequence10;
                                                                                            atj0 atj0Var8 = atj0Var6;
                                                                                            list3 = list7;
                                                                                            hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer6;
                                                                                            fVar = fVar3;
                                                                                            hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV25;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                                                                                            btj0Var2 = new btj0(atj0Var8, str7, charSequence22, charSequence21, charSequence11, charSequence12, num6);
                                                                                            map2 = map5;
                                                                                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer13 = hubItemActionV2$SelectOffer;
                                                                                            map4 = map2;
                                                                                            hubItemActionV2$SelectOffer4 = hubItemActionV2$SelectOffer13;
                                                                                            HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV28 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                                            list4 = list2;
                                                                                            hubItemDtoV2$DefaultOfferItemDtoV23 = hubItemDtoV2$DefaultOfferItemDtoV28;
                                                                                            btj0Var = btj0Var2;
                                                                                            defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 = fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 ? (DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar : null;
                                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 != null && (list10 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV2.a) != null) {
                                                                                                it6 = list10.iterator();
                                                                                                while (true) {
                                                                                                    if (it6.hasNext()) {
                                                                                                        obj12 = null;
                                                                                                    } else {
                                                                                                        obj12 = it6.next();
                                                                                                        if (((TransportRouteSection) obj12).a.length() > 0) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                transportRouteSection2 = (TransportRouteSection) obj12;
                                                                                                if (transportRouteSection2 != null) {
                                                                                                    str9 = transportRouteSection2.a;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar7 = hubItemDtoV2$DefaultOfferItemDtoV23.e;
                                                                                            defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 = fVar7 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 ? (DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar7 : null;
                                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 != null && (list8 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV22.a) != null) {
                                                                                                it5 = list8.iterator();
                                                                                                while (true) {
                                                                                                    if (it5.hasNext()) {
                                                                                                        obj11 = null;
                                                                                                    } else {
                                                                                                        obj11 = it5.next();
                                                                                                        if (((TransportRouteSection) obj11).a.length() > 0) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                transportRouteSection = (TransportRouteSection) obj11;
                                                                                                if (transportRouteSection != null) {
                                                                                                    str9 = transportRouteSection.a;
                                                                                                    str8 = str9;
                                                                                                    String str17 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                                                                                                    HubButtonContainerDto hubButtonContainerDto = hubItemActionV2$SelectOffer4.g;
                                                                                                    List list14 = hubItemActionV2$SelectOffer4.h;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                                                    verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                                                                                                    i2 = eVar2.i(str17, hubButtonContainerDto, map4, list4, list14, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                                                    if (i2 != coroutineSingletons3) {
                                                                                                        return coroutineSingletons3;
                                                                                                    }
                                                                                                    btj0Var3 = btj0Var;
                                                                                                    list9 = list3;
                                                                                                    map6 = map4;
                                                                                                    str10 = str8;
                                                                                                    hubItemActionV2$SelectOffer7 = hubItemActionV2$SelectOffer4;
                                                                                                    obj13 = i2;
                                                                                                    kz6 kz6Var = (kz6) obj13;
                                                                                                    String str18 = hubItemActionV2$SelectOffer7.a;
                                                                                                    HubOfferType hubOfferType = hubItemActionV2$SelectOffer7.b;
                                                                                                    String str19 = hubItemActionV2$SelectOffer7.c;
                                                                                                    String str20 = hubItemActionV2$SelectOffer7.e;
                                                                                                    atj0 atj0Var9 = (atj0) map6.get(hubItemActionV2$SelectOffer7);
                                                                                                    kz6 a = kz6Var == null ? kz6.a(kz6Var, rta1.f(kz6Var.c, str10), null, null, HProv.PP_PASSWD_TERM) : null;
                                                                                                    List list15 = hubItemActionV2$SelectOffer7.d;
                                                                                                    List list16 = hubItemActionV2$SelectOffer7.h;
                                                                                                    list11 = hubItemActionV2$SelectOffer7.f;
                                                                                                    if (list11 == null) {
                                                                                                        list11 = EmptyList.a;
                                                                                                    }
                                                                                                    i0Var.o.N(new khq0(str18, str19, hubOfferType, str20, atj0Var9, btj0Var3, list9, a, list15, list16, rta1.g(str10, com.yandex.go.taxi.summary.mobilityhub.mapper.e.s(list11, map6)), hubItemActionV2$SelectOffer7.i, hubItemActionV2$SelectOffer7.j, str10, hubItemActionV2$SelectOffer7.k));
                                                                                                    return zy11Var2;
                                                                                                }
                                                                                            }
                                                                                            str8 = null;
                                                                                            String str172 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                                                                                            HubButtonContainerDto hubButtonContainerDto2 = hubItemActionV2$SelectOffer4.g;
                                                                                            List list142 = hubItemActionV2$SelectOffer4.h;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                                                                                            i2 = eVar2.i(str172, hubButtonContainerDto2, map4, list4, list142, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                                            if (i2 != coroutineSingletons3) {
                                                                                            }
                                                                                        } else {
                                                                                            coroutineSingletons3 = coroutineSingletons2;
                                                                                            charSequence11 = charSequence20;
                                                                                            num6 = num5;
                                                                                            charSequence12 = null;
                                                                                            CharSequence charSequence212 = charSequence9;
                                                                                            CharSequence charSequence222 = charSequence10;
                                                                                            atj0 atj0Var82 = atj0Var6;
                                                                                            list3 = list7;
                                                                                            hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer6;
                                                                                            fVar = fVar3;
                                                                                            hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV25;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                                                                                            btj0Var2 = new btj0(atj0Var82, str7, charSequence222, charSequence212, charSequence11, charSequence12, num6);
                                                                                            map2 = map5;
                                                                                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer132 = hubItemActionV2$SelectOffer;
                                                                                            map4 = map2;
                                                                                            hubItemActionV2$SelectOffer4 = hubItemActionV2$SelectOffer132;
                                                                                            HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV282 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                                            list4 = list2;
                                                                                            hubItemDtoV2$DefaultOfferItemDtoV23 = hubItemDtoV2$DefaultOfferItemDtoV282;
                                                                                            btj0Var = btj0Var2;
                                                                                            if (fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                                            }
                                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 != null) {
                                                                                                it6 = list10.iterator();
                                                                                                while (true) {
                                                                                                    if (it6.hasNext()) {
                                                                                                    }
                                                                                                }
                                                                                                transportRouteSection2 = (TransportRouteSection) obj12;
                                                                                                if (transportRouteSection2 != null) {
                                                                                                }
                                                                                            }
                                                                                            com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar72 = hubItemDtoV2$DefaultOfferItemDtoV23.e;
                                                                                            if (fVar72 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                                            }
                                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 != null) {
                                                                                                it5 = list8.iterator();
                                                                                                while (true) {
                                                                                                    if (it5.hasNext()) {
                                                                                                    }
                                                                                                }
                                                                                                transportRouteSection = (TransportRouteSection) obj11;
                                                                                                if (transportRouteSection != null) {
                                                                                                }
                                                                                            }
                                                                                            str8 = null;
                                                                                            String str1722 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                                                                                            HubButtonContainerDto hubButtonContainerDto22 = hubItemActionV2$SelectOffer4.g;
                                                                                            List list1422 = hubItemActionV2$SelectOffer4.h;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                                                                                            i2 = eVar2.i(str1722, hubButtonContainerDto22, map4, list4, list1422, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                                            if (i2 != coroutineSingletons3) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            coroutineSingletons3 = coroutineSingletons2;
                                                                            btj0Var2 = null;
                                                                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer1322 = hubItemActionV2$SelectOffer;
                                                                            map4 = map2;
                                                                            hubItemActionV2$SelectOffer4 = hubItemActionV2$SelectOffer1322;
                                                                            HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV2822 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                            list4 = list2;
                                                                            hubItemDtoV2$DefaultOfferItemDtoV23 = hubItemDtoV2$DefaultOfferItemDtoV2822;
                                                                            btj0Var = btj0Var2;
                                                                            if (fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                            }
                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 != null) {
                                                                            }
                                                                            com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar722 = hubItemDtoV2$DefaultOfferItemDtoV23.e;
                                                                            if (fVar722 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                            }
                                                                            if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 != null) {
                                                                            }
                                                                            str8 = null;
                                                                            String str17222 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                                                                            HubButtonContainerDto hubButtonContainerDto222 = hubItemActionV2$SelectOffer4.g;
                                                                            List list14222 = hubItemActionV2$SelectOffer4.h;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                                                                            i2 = eVar2.i(str17222, hubButtonContainerDto222, map4, list4, list14222, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                            if (i2 != coroutineSingletons3) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        coroutineSingletons3 = coroutineSingletons2;
                                                                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer14 = hubItemActionV2$SelectOffer;
                                                                        map4 = map2;
                                                                        hubItemActionV2$SelectOffer4 = hubItemActionV2$SelectOffer14;
                                                                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV29 = hubItemDtoV2$DefaultOfferItemDtoV2;
                                                                        list4 = list2;
                                                                        hubItemDtoV2$DefaultOfferItemDtoV23 = hubItemDtoV2$DefaultOfferItemDtoV29;
                                                                        btj0Var = null;
                                                                        if (fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                        }
                                                                        if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 != null) {
                                                                        }
                                                                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar7222 = hubItemDtoV2$DefaultOfferItemDtoV23.e;
                                                                        if (fVar7222 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                                                                        }
                                                                        if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 != null) {
                                                                        }
                                                                        str8 = null;
                                                                        String str172222 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                                                                        HubButtonContainerDto hubButtonContainerDto2222 = hubItemActionV2$SelectOffer4.g;
                                                                        List list142222 = hubItemActionV2$SelectOffer4.h;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                                                                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                                                                        i2 = eVar2.i(str172222, hubButtonContainerDto2222, map4, list4, list142222, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                                                                        if (i2 != coroutineSingletons3) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            coroutineSingletons2 = coroutineSingletons;
                                                            eVar = eVar4;
                                                            charSequence4 = charSequence17;
                                                            charSequence5 = charSequence3;
                                                            charSequence6 = null;
                                                            arrayList3 = arrayList2;
                                                            pair = new Pair(str4, new btj0(atj0Var3, str3, charSequence2, charSequence5, charSequence4, charSequence6, num2));
                                                            verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                                                            hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV22;
                                                            it = it4;
                                                            arrayList = arrayList3;
                                                            hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer3;
                                                            hubItemDtoV2$AlternativeOfferItemDto2 = hubItemDtoV2$AlternativeOfferItemDto6;
                                                            map2 = map3;
                                                            if (pair != null) {
                                                            }
                                                            coroutineSingletons4 = coroutineSingletons2;
                                                            eVar3 = eVar;
                                                            zy11Var3 = zy11Var;
                                                            if (it.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                    return coroutineSingletons2;
                                                }
                                            }
                                            return coroutineSingletons4;
                                        }
                                        eVar = eVar3;
                                        coroutineSingletons2 = coroutineSingletons4;
                                        zy11Var = zy11Var3;
                                        pair = null;
                                        if (pair != null) {
                                        }
                                        coroutineSingletons4 = coroutineSingletons2;
                                        eVar3 = eVar;
                                        zy11Var3 = zy11Var;
                                        if (it.hasNext()) {
                                        }
                                    }
                                }
                            }
                            return zy11Var3;
                            break;
                        }
                        if (hubItemDtoV2$DefaultOfferItemDtoV26 != null) {
                        }
                        return zy11Var3;
                    case 1:
                        String str21 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19;
                        Integer num10 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18;
                        String str22 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17;
                        atj0 atj0Var10 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        hubItemDtoV2$AlternativeOfferItemDto3 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        Iterator it11 = (Iterator) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        ?? r9 = (Collection) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer15 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto9 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV210 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        map3 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        it2 = it11;
                        arrayList = r9;
                        obj2 = obj13;
                        zy11Var = zy11Var3;
                        hubItemDtoV2$DefaultOfferItemDtoV22 = hubItemDtoV2$DefaultOfferItemDtoV210;
                        hubItemDtoV2$AlternativeOfferItemDto4 = hubItemDtoV2$AlternativeOfferItemDto9;
                        hubItemActionV2$SelectOffer2 = hubItemActionV2$SelectOffer15;
                        atj0Var = atj0Var10;
                        str = str22;
                        num = num10;
                        str2 = str21;
                        CharSequence charSequence142 = (CharSequence) obj2;
                        FormattedText formattedText22 = hubItemDtoV2$AlternativeOfferItemDto3.c.d;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map3;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV22;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = hubItemDtoV2$AlternativeOfferItemDto4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = arrayList;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = it2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = hubItemDtoV2$AlternativeOfferItemDto3;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = atj0Var;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17 = str;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18 = num;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19 = str2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20 = charSequence142;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 2;
                        c2 = eVar3.c(formattedText22, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                        coroutineSingletons4 = coroutineSingletons4;
                        if (c2 != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    case 2:
                        CharSequence charSequence23 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20;
                        str2 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19;
                        num = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18;
                        str = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17;
                        atj0Var2 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto10 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        Iterator it12 = (Iterator) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        r12 = (Collection) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        hubItemActionV2$SelectOffer2 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        hubItemDtoV2$AlternativeOfferItemDto4 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV211 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        Map map7 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        hubItemDtoV2$AlternativeOfferItemDto5 = hubItemDtoV2$AlternativeOfferItemDto10;
                        it3 = it12;
                        charSequence = charSequence23;
                        obj3 = obj13;
                        zy11Var = zy11Var3;
                        hubItemDtoV2$DefaultOfferItemDtoV22 = hubItemDtoV2$DefaultOfferItemDtoV211;
                        map3 = map7;
                        CharSequence charSequence152 = (CharSequence) obj3;
                        CoroutineSingletons coroutineSingletons52 = coroutineSingletons4;
                        FormattedText formattedText32 = hubItemDtoV2$AlternativeOfferItemDto5.c.e;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map3;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV22;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = hubItemDtoV2$AlternativeOfferItemDto4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = r12;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = it3;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = hubItemDtoV2$AlternativeOfferItemDto5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = atj0Var2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$16 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17 = str;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18 = num;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19 = str2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20 = charSequence;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$21 = charSequence152;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 3;
                        eVar3 = eVar3;
                        c = eVar3.c(formattedText32, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                        CharSequence charSequence162 = charSequence;
                        coroutineSingletons2 = coroutineSingletons52;
                        if (c != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 3:
                        CharSequence charSequence24 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$21;
                        CharSequence charSequence25 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20;
                        String str23 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19;
                        Integer num11 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18;
                        String str24 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17;
                        atj0 atj0Var11 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        hubItemDtoV2$AlternativeOfferItemDto5 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        it4 = (Iterator) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        ?? r13 = (Collection) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        hubItemActionV2$SelectOffer3 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto11 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV212 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        Map map8 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        hubItemDtoV2$AlternativeOfferItemDto6 = hubItemDtoV2$AlternativeOfferItemDto11;
                        map3 = map8;
                        coroutineSingletons = coroutineSingletons4;
                        atj0Var3 = atj0Var11;
                        str3 = str24;
                        num2 = num11;
                        str4 = str23;
                        charSequence2 = charSequence25;
                        charSequence3 = charSequence24;
                        obj4 = obj13;
                        zy11Var = zy11Var3;
                        hubItemDtoV2$DefaultOfferItemDtoV22 = hubItemDtoV2$DefaultOfferItemDtoV212;
                        arrayList2 = r13;
                        CharSequence charSequence172 = (CharSequence) obj4;
                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar42 = hubItemDtoV2$AlternativeOfferItemDto5.d;
                        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar42 = eVar3;
                        if (!(fVar42 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2)) {
                        }
                        if (defaultOfferBodyDtoV2$TextBodyDtoV2 == null) {
                        }
                        break;
                    case 4:
                        CharSequence charSequence26 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$22;
                        charSequence3 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$21;
                        charSequence2 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$20;
                        str4 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$19;
                        num2 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$18;
                        str3 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$17;
                        atj0 atj0Var12 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        it4 = (Iterator) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        ?? r132 = (Collection) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        hubItemActionV2$SelectOffer3 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto12 = (HubItemDtoV2$AlternativeOfferItemDto) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4;
                        charSequence7 = charSequence26;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV213 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        Map map9 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        hubItemDtoV2$AlternativeOfferItemDto7 = hubItemDtoV2$AlternativeOfferItemDto12;
                        map3 = map9;
                        coroutineSingletons2 = coroutineSingletons4;
                        obj5 = obj13;
                        atj0Var3 = atj0Var12;
                        zy11Var = zy11Var3;
                        hubItemDtoV2$DefaultOfferItemDtoV22 = hubItemDtoV2$DefaultOfferItemDtoV213;
                        eVar = eVar3;
                        arrayList4 = r132;
                        charSequence6 = (CharSequence) obj5;
                        charSequence4 = charSequence7;
                        charSequence5 = charSequence3;
                        hubItemDtoV2$AlternativeOfferItemDto6 = hubItemDtoV2$AlternativeOfferItemDto7;
                        arrayList3 = arrayList4;
                        pair = new Pair(str4, new btj0(atj0Var3, str3, charSequence2, charSequence5, charSequence4, charSequence6, num2));
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                        hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV22;
                        it = it4;
                        arrayList = arrayList3;
                        hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer3;
                        hubItemDtoV2$AlternativeOfferItemDto2 = hubItemDtoV2$AlternativeOfferItemDto6;
                        map2 = map3;
                        if (pair != null) {
                        }
                        coroutineSingletons4 = coroutineSingletons2;
                        eVar3 = eVar;
                        zy11Var3 = zy11Var;
                        if (it.hasNext()) {
                        }
                        break;
                    case 5:
                        atj0 atj0Var13 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12;
                        String str25 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11;
                        Integer num12 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar8 = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9;
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV22 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        List list17 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7;
                        List list18 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6;
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer16 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV214 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        Map map10 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        coroutineSingletons2 = coroutineSingletons4;
                        hubItemDtoV2$DefaultOfferItemDtoV24 = hubItemDtoV2$DefaultOfferItemDtoV214;
                        map5 = map10;
                        obj6 = null;
                        hubItemActionV2$SelectOffer5 = hubItemActionV2$SelectOffer16;
                        list6 = list18;
                        eVar2 = eVar3;
                        list5 = list17;
                        hubItemDtoV2$DefaultOfferHeaderDtoV2 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
                        fVar2 = fVar8;
                        num4 = num12;
                        str5 = str25;
                        atj0Var4 = atj0Var13;
                        obj7 = obj13;
                        zy11Var2 = zy11Var3;
                        CharSequence charSequence182 = (CharSequence) obj7;
                        FormattedText formattedText62 = hubItemDtoV2$DefaultOfferHeaderDtoV2.d;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = obj6;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = obj6;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV24;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = obj6;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = list6;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = list5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = fVar2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = num4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = str5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = atj0Var4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = charSequence182;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 6;
                        c3 = eVar2.c(formattedText62, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                        if (c3 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 6:
                        CharSequence charSequence27 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        atj0 atj0Var14 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12;
                        str5 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11;
                        num4 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        fVar2 = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9;
                        hubItemDtoV2$DefaultOfferHeaderDtoV2 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8;
                        List list19 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7;
                        list6 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6;
                        hubItemActionV2$SelectOffer5 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        hubItemDtoV2$DefaultOfferItemDtoV25 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        map5 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        coroutineSingletons2 = coroutineSingletons4;
                        obj8 = obj13;
                        list7 = list19;
                        zy11Var2 = zy11Var3;
                        eVar2 = eVar3;
                        atj0Var5 = atj0Var14;
                        charSequence8 = charSequence27;
                        CharSequence charSequence192 = (CharSequence) obj8;
                        FormattedText formattedText72 = hubItemDtoV2$DefaultOfferHeaderDtoV2.e;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$0 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1 = map5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$2 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3 = hubItemDtoV2$DefaultOfferItemDtoV25;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$4 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5 = hubItemActionV2$SelectOffer5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6 = list6;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7 = list7;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$8 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9 = fVar2;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10 = num4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11 = str5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12 = atj0Var5;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13 = charSequence8;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14 = charSequence192;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$1.label = 7;
                        c4 = eVar2.c(formattedText72, verticalOffersStateInteractorV2$preselectDefaultOffer$1);
                        if (c4 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 7:
                        CharSequence charSequence28 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        CharSequence charSequence29 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        atj0 atj0Var15 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12;
                        String str26 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11;
                        Integer num13 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar9 = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9;
                        List list20 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7;
                        List list21 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6;
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer17 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        hubItemDtoV2$DefaultOfferItemDtoV25 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        map5 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        coroutineSingletons2 = coroutineSingletons4;
                        obj9 = obj13;
                        list7 = list20;
                        zy11Var2 = zy11Var3;
                        eVar2 = eVar3;
                        list2 = list21;
                        hubItemActionV2$SelectOffer6 = hubItemActionV2$SelectOffer17;
                        fVar3 = fVar9;
                        str7 = str26;
                        charSequence10 = charSequence29;
                        num5 = num13;
                        atj0Var6 = atj0Var15;
                        charSequence9 = charSequence28;
                        CharSequence charSequence202 = (CharSequence) obj9;
                        if (!(fVar3 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2)) {
                        }
                        if (defaultOfferBodyDtoV2$TextBodyDtoV22 == null) {
                        }
                        break;
                    case 8:
                        charSequence13 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$15;
                        charSequence9 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$14;
                        charSequence10 = (CharSequence) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$13;
                        atj0Var6 = (atj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12;
                        str7 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11;
                        Integer num14 = (Integer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$10;
                        fVar3 = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$9;
                        List list22 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7;
                        List list23 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$6;
                        hubItemActionV2$SelectOffer6 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV215 = (HubItemDtoV2$DefaultOfferItemDtoV2) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$3;
                        Map map11 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        num7 = num14;
                        obj10 = obj13;
                        eVar2 = eVar3;
                        zy11Var2 = zy11Var3;
                        list2 = list23;
                        map5 = map11;
                        coroutineSingletons3 = coroutineSingletons4;
                        list7 = list22;
                        hubItemDtoV2$DefaultOfferItemDtoV25 = hubItemDtoV2$DefaultOfferItemDtoV215;
                        num6 = num7;
                        charSequence12 = (CharSequence) obj10;
                        charSequence11 = charSequence13;
                        CharSequence charSequence2122 = charSequence9;
                        CharSequence charSequence2222 = charSequence10;
                        atj0 atj0Var822 = atj0Var6;
                        list3 = list7;
                        hubItemActionV2$SelectOffer = hubItemActionV2$SelectOffer6;
                        fVar = fVar3;
                        hubItemDtoV2$DefaultOfferItemDtoV2 = hubItemDtoV2$DefaultOfferItemDtoV25;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12 = verticalOffersStateInteractorV2$preselectDefaultOffer$1;
                        btj0Var2 = new btj0(atj0Var822, str7, charSequence2222, charSequence2122, charSequence11, charSequence12, num6);
                        map2 = map5;
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer13222 = hubItemActionV2$SelectOffer;
                        map4 = map2;
                        hubItemActionV2$SelectOffer4 = hubItemActionV2$SelectOffer13222;
                        HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV28222 = hubItemDtoV2$DefaultOfferItemDtoV2;
                        list4 = list2;
                        hubItemDtoV2$DefaultOfferItemDtoV23 = hubItemDtoV2$DefaultOfferItemDtoV28222;
                        btj0Var = btj0Var2;
                        if (fVar instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                        }
                        if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 != null) {
                        }
                        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f fVar72222 = hubItemDtoV2$DefaultOfferItemDtoV23.e;
                        if (fVar72222 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) {
                        }
                        if (defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 != null) {
                        }
                        str8 = null;
                        String str1722222 = hubItemDtoV2$DefaultOfferItemDtoV23.a;
                        HubButtonContainerDto hubButtonContainerDto22222 = hubItemActionV2$SelectOffer4.g;
                        List list1422222 = hubItemActionV2$SelectOffer4.h;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$0 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$1 = map4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$2 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$3 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$4 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$5 = hubItemActionV2$SelectOffer4;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$6 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$7 = list3;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$8 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$9 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$10 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$11 = btj0Var;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$12 = str8;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$13 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$14 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$15 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$16 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$17 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$18 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$19 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$20 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$21 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$22 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.L$23 = null;
                        verticalOffersStateInteractorV2$preselectDefaultOffer$12.label = 9;
                        i2 = eVar2.i(str1722222, hubButtonContainerDto22222, map4, list4, list1422222, verticalOffersStateInteractorV2$preselectDefaultOffer$12);
                        if (i2 != coroutineSingletons3) {
                        }
                        break;
                    case 9:
                        str10 = (String) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$12;
                        btj0 btj0Var4 = (btj0) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$11;
                        List list24 = (List) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$7;
                        hubItemActionV2$SelectOffer7 = (HubItemActionV2$SelectOffer) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$5;
                        map6 = (Map) verticalOffersStateInteractorV2$preselectDefaultOffer$1.L$1;
                        kotlin.b.b(obj13);
                        btj0Var3 = btj0Var4;
                        list9 = list24;
                        zy11Var2 = zy11Var3;
                        kz6 kz6Var2 = (kz6) obj13;
                        String str182 = hubItemActionV2$SelectOffer7.a;
                        HubOfferType hubOfferType2 = hubItemActionV2$SelectOffer7.b;
                        String str192 = hubItemActionV2$SelectOffer7.c;
                        String str202 = hubItemActionV2$SelectOffer7.e;
                        atj0 atj0Var92 = (atj0) map6.get(hubItemActionV2$SelectOffer7);
                        if (kz6Var2 == null) {
                        }
                        List list152 = hubItemActionV2$SelectOffer7.d;
                        List list162 = hubItemActionV2$SelectOffer7.h;
                        list11 = hubItemActionV2$SelectOffer7.f;
                        if (list11 == null) {
                        }
                        i0Var.o.N(new khq0(str182, str192, hubOfferType2, str202, atj0Var92, btj0Var3, list9, a, list152, list162, rta1.g(str10, com.yandex.go.taxi.summary.mobilityhub.mapper.e.s(list11, map6)), hubItemActionV2$SelectOffer7.i, hubItemActionV2$SelectOffer7.j, str10, hubItemActionV2$SelectOffer7.k));
                        return zy11Var2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        verticalOffersStateInteractorV2$preselectDefaultOffer$1 = new VerticalOffersStateInteractorV2$preselectDefaultOffer$1(i0Var, continuationImpl);
        Object obj132 = verticalOffersStateInteractorV2$preselectDefaultOffer$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalOffersStateInteractorV2$preselectDefaultOffer$1.label;
        zy11 zy11Var32 = zy11.a;
        switch (i) {
        }
    }

    public static final Object d(i0 i0Var, s0 s0Var, SuspendLambda suspendLambda) {
        i0Var.getClass();
        n nVar = i0Var.l;
        if (!(s0Var instanceof HubItemActionV2$SelectOffer)) {
            if (!(s0Var instanceof HubItemActionV2$DetailedTransportRoute)) {
                return null;
            }
            String str = ((HubItemActionV2$DetailedTransportRoute) s0Var).a;
            return nVar.d(str, cvu0.x(str, "ymapsbm1://route/pedestrian", false) ? HubOfferType.PEDESTRIAN : HubOfferType.TRANSPORT, suspendLambda);
        }
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer = (HubItemActionV2$SelectOffer) s0Var;
        String str2 = hubItemActionV2$SelectOffer.e;
        if (str2 == null) {
            return null;
        }
        HubOfferType hubOfferType = hubItemActionV2$SelectOffer.b;
        HubOfferType hubOfferType2 = HubOfferType.PEDESTRIAN;
        if (hubOfferType != hubOfferType2) {
            Object d = nVar.d(str2, hubOfferType, suspendLambda);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : (atj0) d;
        }
        if (!cvu0.x(str2, "ymapsbm1://route/pedestrian", false)) {
            hubOfferType2 = HubOfferType.TRANSPORT;
        }
        Object d2 = nVar.d(str2, hubOfferType2, suspendLambda);
        return d2 == CoroutineSingletons.COROUTINE_SUSPENDED ? d2 : (atj0) d2;
    }

    public final ArrayList e(tse tseVar, List list) {
        if (list == null) {
            list = EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new VerticalOffersStateInteractorV2$enqueueRoutePartsResolving$1$1(this, (c2) it.next(), null), 3));
        }
        return arrayList;
    }

    public final tpr f() {
        r0 c = bvf0.c(null);
        mth a = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.f).j.a();
        qbl0 qbl0Var = this.d;
        jqr jqrVar = new jqr(new m0(a, com.yandex.go.coroutines.b.d(qbl0Var.a(), new VerticalOffersStateInteractorV2$routeStatsFlow$$inlined$start$1(qbl0Var.b(), null)), new VerticalOffersStateInteractorV2$routeStatsFlow$1(3, null)), new VerticalOffersStateInteractorV2$offersStateFlow$routeStatsFlow$1(this, null), 3);
        m0 a2 = this.i.a();
        fyu fyuVar = this.c;
        jqr jqrVar2 = new jqr(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.l(jqrVar, a2, com.yandex.go.coroutines.b.d(new d0(new b0(new mth(fyuVar.d, 4))), new VerticalOffersStateInteractorV2$selectedMutualExclusiveFilterFlow$$inlined$start$1(fyuVar.a(), null)), com.yandex.go.coroutines.b.d(new h0(new f0(new mth(fyuVar.f, 4))), new VerticalOffersStateInteractorV2$selectedTransportTypeIdsFlow$$inlined$start$1(fyuVar.b(), null)), com.yandex.go.coroutines.b.d(this.g.b, new VerticalOffersStateInteractorV2$offersStateFlow$$inlined$start$1(zy11.a, null)), new VerticalOffersStateInteractorV2$offersStateFlow$1(this, null)), new VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1(null, this, c)), new VerticalOffersStateInteractorV2$offersStateFlow$$inlined$start$2(new ru60(null, null), null)), new VerticalOffersStateInteractorV2$offersStateFlow$3(2, this, i0.class, "reportRouteOptionsLoaded", "reportRouteOptionsLoaded(Lcom/yandex/go/taxi/summary/mobilityhub/model/OffersStateV2;)V", 4), 3);
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(jqrVar2, mdh.b);
    }
}
