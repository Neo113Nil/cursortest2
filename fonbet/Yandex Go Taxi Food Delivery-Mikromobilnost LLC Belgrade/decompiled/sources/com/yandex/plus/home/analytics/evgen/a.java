package com.yandex.plus.home.analytics.evgen;

import defpackage.EvgenPlusState;
import defpackage.i22;
import defpackage.p42;
import defpackage.sls;
import defpackage.yvi0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final i22 d;
    public final sls e;
    public final sls f;
    public final sls g;
    public final sls h;
    public final sls i;
    public final p42 j;

    public a(String str, String str2, String str3, i22 i22Var, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5, p42 p42Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i22Var;
        this.e = slsVar;
        this.f = slsVar2;
        this.g = slsVar3;
        this.h = slsVar4;
        this.i = slsVar5;
        this.j = p42Var;
    }

    public final yvi0 a() {
        String str = (String) this.d.invoke();
        String str2 = (String) ((EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$1) this.e).invoke();
        String str3 = (String) ((EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$2) this.f).invoke();
        String str4 = (String) ((EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$3) this.g).invoke();
        EvgenPlusState evgenPlusState = (EvgenPlusState) ((EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$4) this.h).invoke();
        double doubleValue = ((Number) ((EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$5) this.i).invoke()).doubleValue();
        Map map = (Map) this.j.invoke();
        yvi0 yvi0Var = new yvi0();
        Pair pair = new Pair("client_app_package", this.a);
        Pair pair2 = new Pair("client_app_version", this.b);
        String str5 = this.c;
        yvi0Var.a = kotlin.collections.b.i(pair, pair2, new Pair(Constants.KEY_SERVICE, str5), new Pair("sdk_version", "110.0.2"), new Pair("testids", str2), new Pair("puid", str4), new Pair("log_session_id", str), new Pair("triggered_testids", str3), new Pair("client_id", str5), new Pair("plus_sdk_version", "110.0.2"), new Pair("plus_sdk_type", "web"), new Pair("plus_state", evgenPlusState.getEventValue()), new Pair("balance", Double.valueOf(doubleValue)), new Pair("add_params", map));
        return yvi0Var;
    }
}
