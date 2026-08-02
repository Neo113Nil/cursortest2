package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDescriptionsPartsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubDriveOfferParamV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubDriveOfferParamV2 {
    public static final s Companion = new s();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final HubRideTimeParam e;
    public final HubEstimatedWaitingParamV2 f;
    public final HubDescriptionsPartsParam g;
    public final String h;
    public final String i;
    public final HubPricesParam j;

    static {
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.b0 b0Var = HubPricesParam.Companion;
    }

    public /* synthetic */ HubDriveOfferParamV2(int i, String str, String str2, String str3, String str4, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParamV2 hubEstimatedWaitingParamV2, HubDescriptionsPartsParam hubDescriptionsPartsParam, String str5, String str6, HubPricesParam hubPricesParam) {
        if (1023 != (i & 1023)) {
            qje.Z(i, 1023, HubDriveOfferParamV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hubRideTimeParam;
        this.f = hubEstimatedWaitingParamV2;
        this.g = hubDescriptionsPartsParam;
        this.h = str5;
        this.i = str6;
        this.j = hubPricesParam;
    }

    public HubDriveOfferParamV2(String str, String str2, String str3, String str4, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParamV2 hubEstimatedWaitingParamV2, HubDescriptionsPartsParam hubDescriptionsPartsParam, String str5, String str6, HubPricesParam hubPricesParam) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hubRideTimeParam;
        this.f = hubEstimatedWaitingParamV2;
        this.g = hubDescriptionsPartsParam;
        this.h = str5;
        this.i = str6;
        this.j = hubPricesParam;
    }
}
