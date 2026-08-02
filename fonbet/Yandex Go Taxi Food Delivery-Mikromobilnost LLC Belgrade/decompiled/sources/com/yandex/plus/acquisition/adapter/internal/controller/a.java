package com.yandex.plus.acquisition.adapter.internal.controller;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c0d0;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a a;
    public final /* synthetic */ c0d0 b;
    public final /* synthetic */ PlusAcquisitionPaymentAnalytics$Params c;
    public final /* synthetic */ Map w;
    public final /* synthetic */ b x;

    public /* synthetic */ a(com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar, c0d0 c0d0Var, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, Map map, b bVar) {
        this.a = aVar;
        this.b = c0d0Var;
        this.c = plusAcquisitionPaymentAnalytics$Params;
        this.w = map;
        this.x = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.a.invoke(new ButtonSectionController$proxyController$2$1$1$1(this.b, (PlusAcquisitionSmartOffer) obj, this.c, this.w, this.x, null));
        return zy11.a;
    }
}
