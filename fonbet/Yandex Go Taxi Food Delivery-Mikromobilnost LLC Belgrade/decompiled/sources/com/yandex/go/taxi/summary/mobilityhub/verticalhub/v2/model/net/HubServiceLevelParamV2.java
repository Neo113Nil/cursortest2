package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPaidOptionsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubSummaryStyleParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubTariffUnavailableParam;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubServiceLevelParamV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/e1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubServiceLevelParamV2 {
    public static final e1 Companion = new e1();
    public static final i3y[] q = {null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(15)), null, null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final HubPricesParam i;
    public final HubTariffUnavailableParam j;
    public final List k;
    public final HubRideTimeParam l;
    public final HubEstimatedWaitingParamV2 m;
    public final HubPaidOptionsParam n;
    public final HubSummaryStyleParam o;
    public final kotlinx.serialization.json.b p;

    public /* synthetic */ HubServiceLevelParamV2(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, HubPricesParam hubPricesParam, HubTariffUnavailableParam hubTariffUnavailableParam, List list, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParamV2 hubEstimatedWaitingParamV2, HubPaidOptionsParam hubPaidOptionsParam, HubSummaryStyleParam hubSummaryStyleParam, kotlinx.serialization.json.b bVar) {
        if (32767 != (i & 32767)) {
            qje.Z(i, 32767, HubServiceLevelParamV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
        this.h = bool2;
        this.i = hubPricesParam;
        this.j = hubTariffUnavailableParam;
        this.k = list;
        this.l = hubRideTimeParam;
        this.m = hubEstimatedWaitingParamV2;
        this.n = hubPaidOptionsParam;
        this.o = hubSummaryStyleParam;
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = bVar;
        }
    }

    public HubServiceLevelParamV2(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, HubPricesParam hubPricesParam, HubTariffUnavailableParam hubTariffUnavailableParam, ArrayList arrayList, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParamV2 hubEstimatedWaitingParamV2, HubPaidOptionsParam hubPaidOptionsParam, HubSummaryStyleParam hubSummaryStyleParam, kotlinx.serialization.json.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
        this.h = bool2;
        this.i = hubPricesParam;
        this.j = hubTariffUnavailableParam;
        this.k = arrayList;
        this.l = hubRideTimeParam;
        this.m = hubEstimatedWaitingParamV2;
        this.n = hubPaidOptionsParam;
        this.o = hubSummaryStyleParam;
        this.p = bVar;
    }
}
