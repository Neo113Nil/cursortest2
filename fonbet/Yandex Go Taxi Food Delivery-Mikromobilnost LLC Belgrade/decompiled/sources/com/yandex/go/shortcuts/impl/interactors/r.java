package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.shortcuts.dto.request.OfferSupportedFeature;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.impl.repository.ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1;
import com.yandex.go.shortcuts.models.OfferType;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.kaf0;
import defpackage.ksq0;
import defpackage.lng;
import defpackage.mdh;
import defpackage.n4i;
import defpackage.o4i;
import defpackage.ofp0;
import defpackage.p3s0;
import defpackage.pf10;
import defpackage.qmp;
import defpackage.qy2;
import defpackage.rcc;
import defpackage.sjh;
import defpackage.tlw0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uaf0;
import defpackage.uc4;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.w511;
import defpackage.waf0;
import defpackage.wqe;
import defpackage.yaf0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class r {
    public final qmp a;
    public final com.yandex.go.shortcuts.impl.repository.s b;
    public final p3s0 c;
    public final tt2 d;

    public r(qmp qmpVar, com.yandex.go.shortcuts.impl.repository.s sVar, p3s0 p3s0Var, tt2 tt2Var) {
        this.a = qmpVar;
        this.b = sVar;
        this.c = p3s0Var;
        this.d = tt2Var;
    }

    public final tpr a(List list, yaf0 yaf0Var, uc4 uc4Var, kaf0 kaf0Var) {
        List m0;
        boolean z;
        List m02;
        ((ul51) this.a).getClass();
        wqe wqeVar = (wqe) this.c;
        lng lngVar = wqeVar.a;
        qy2 qy2Var = wqeVar.d;
        o4i o4iVar = wqeVar.f;
        tlw0 tlw0Var = wqeVar.c;
        boolean a = wqeVar.a(yaf0Var);
        List list2 = EmptyList.a;
        if (a) {
            List o0 = ((n4i) o4iVar.a.c()).b ? kotlin.collections.a.o0(list2, new OfferSupportedFeature(OfferType.DELIVERY_DASHBOARD, null, 6)) : list2;
            if (jl40.l(yaf0Var, yaf0.c)) {
                yaf0Var.getClass();
                if (yaf0Var instanceof uaf0) {
                    z = ((uaf0) yaf0Var).f;
                } else {
                    if (!(yaf0Var instanceof waf0)) {
                        w511.b();
                        return null;
                    }
                    z = true;
                }
                if (!z) {
                    m0 = kotlin.collections.a.m0(o0, ProductsParam.j);
                }
            }
            m0 = qy2Var.a() ? kotlin.collections.a.m0(o0, ProductsParam.k) : kotlin.collections.a.m0(o0, ProductsParam.i);
        } else {
            m0 = list2;
        }
        if (wqeVar.a(yaf0Var)) {
            Collection collection = ProductsParam.l;
            if (((n4i) o4iVar.a.c()).b) {
                collection = kotlin.collections.a.o0(collection, new ProductsParam.SupportedAction(ActionType.DELIVERY_DASHBOARD, null, null));
            }
            ListBuilder a2 = rcc.a();
            a2.add("masstransit");
            if (qy2Var.a()) {
                a2.add(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
            }
            if (qy2Var.c()) {
                if (!com.yandex.go.superapp.order.multi.old.provider.g.f(wqeVar.e.a(), ServiceType.SCOOTERS)) {
                    a2.add("scooters");
                }
            }
            ListBuilder j = a2.j();
            ListBuilder a3 = rcc.a();
            a3.add(new ProductsParam.SupportedAction(ActionType.DISCOVERY, j, null));
            a3.add(new ProductsParam.SupportedAction(ActionType.CITY_MODE, j, null));
            if (qy2Var.c()) {
                a3.add(new ProductsParam.SupportedAction(ActionType.SCOOTERS_QR_SCAN, null, null));
            }
            m02 = kotlin.collections.a.m0(collection, a3.j());
        } else {
            m02 = list2;
        }
        if (wqeVar.a(yaf0Var)) {
            list2 = ProductsParam.m;
        }
        float floatValue = ((Number) lngVar.c.getValue()).floatValue();
        float floatValue2 = ((Number) lngVar.d.getValue()).floatValue();
        List singletonList = Collections.singletonList((ProductsParam.SupportedGrid) tlw0Var.b.getValue());
        List list3 = (List) tlw0Var.c.getValue();
        jsq0 jsq0Var = ksq0.a;
        ProductsParam.Shortcuts shortcuts = new ProductsParam.Shortcuts(m0, m02, list2, floatValue, floatValue2, singletonList, new jsq0(list3), new jsq0((List) tlw0Var.d.getValue()));
        pf10 pf10Var = new pf10(ofp0.c, ofp0.b, ofp0.a);
        com.yandex.go.shortcuts.impl.repository.s sVar = this.b;
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(sVar.l.a(false), new ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1(null, sVar, list, yaf0Var, uc4Var))), new ProductsRequestInteractor$makeRequest$1(kaf0Var, shortcuts, pf10Var, null));
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(I, mdh.b);
    }
}
