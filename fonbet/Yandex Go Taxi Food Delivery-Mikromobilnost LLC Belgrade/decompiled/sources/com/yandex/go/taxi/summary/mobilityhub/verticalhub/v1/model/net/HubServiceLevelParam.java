package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.syu;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubServiceLevelParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubServiceLevelParam {
    public static final e0 Companion = new e0();
    public static final i3y[] p = {null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(14)), null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final HubPricesParam i;
    public final HubTariffUnavailableParam j;
    public final List k;
    public final HubRideTimeParam l;
    public final HubEstimatedWaitingParam m;
    public final HubPaidOptionsParam n;
    public final HubSummaryStyleParam o;

    public /* synthetic */ HubServiceLevelParam(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, HubPricesParam hubPricesParam, HubTariffUnavailableParam hubTariffUnavailableParam, List list, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParam hubEstimatedWaitingParam, HubPaidOptionsParam hubPaidOptionsParam, HubSummaryStyleParam hubSummaryStyleParam) {
        if (32767 != (i & 32767)) {
            qje.Z(i, 32767, HubServiceLevelParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = hubPricesParam;
        this.j = hubTariffUnavailableParam;
        this.k = list;
        this.l = hubRideTimeParam;
        this.m = hubEstimatedWaitingParam;
        this.n = hubPaidOptionsParam;
        this.o = hubSummaryStyleParam;
    }

    public HubServiceLevelParam(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, HubPricesParam hubPricesParam, HubTariffUnavailableParam hubTariffUnavailableParam, ArrayList arrayList, HubRideTimeParam hubRideTimeParam, HubEstimatedWaitingParam hubEstimatedWaitingParam, HubPaidOptionsParam hubPaidOptionsParam, HubSummaryStyleParam hubSummaryStyleParam) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = hubPricesParam;
        this.j = hubTariffUnavailableParam;
        this.k = arrayList;
        this.l = hubRideTimeParam;
        this.m = hubEstimatedWaitingParam;
        this.n = hubPaidOptionsParam;
        this.o = hubSummaryStyleParam;
    }
}
