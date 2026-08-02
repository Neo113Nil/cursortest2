package com.yandex.plus.home.analytics.evgen;

import defpackage.i22;
import defpackage.m4d0;
import defpackage.p42;
import defpackage.sls;
import defpackage.zho;

/* loaded from: classes8.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final p42 d;
    public final i22 e;
    public final p42 f;
    public final p42 g;
    public final p42 h;
    public final String i;
    public final String j;
    public m4d0 k;
    public sls l;

    public b(String str, String str2, String str3, p42 p42Var, i22 i22Var, p42 p42Var2, p42 p42Var3, p42 p42Var4, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = p42Var;
        this.e = i22Var;
        this.f = p42Var2;
        this.g = p42Var3;
        this.h = p42Var4;
        this.i = str4;
        this.j = str5;
    }

    public final a a() {
        return new a(this.a, this.b, this.c, this.e, new EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$1(0, this, b.class, "getTestIds", "getTestIds()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$2(0, this, b.class, "getTriggeredTestIds", "getTriggeredTestIds()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$3(0, this, b.class, "getPuid", "getPuid()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$4(0, this, b.class, "getEvgenPlusState", "getEvgenPlusState()LEvgenPlusState;", 0), new EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$5(0, this, b.class, "getBalance", "getBalance()D", 0), this.g);
    }

    public final zho b() {
        return new zho(this.a, this.b, this.c, this.d, this.e, new EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$1(0, this, b.class, "getTestIds", "getTestIds()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$2(0, this, b.class, "getTriggeredTestIds", "getTriggeredTestIds()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$3(0, this, b.class, "getPuid", "getPuid()Ljava/lang/String;", 0), new EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$4(0, this, b.class, "getUserStatusType", "getUserStatusType()LUserStatusType;", 0), this.h, this.i, this.j);
    }
}
