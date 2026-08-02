package com.yandex.go.mob;

import defpackage.k4o;
import defpackage.ksu;
import defpackage.ol20;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/yandex/go/mob/HostMobSupportedApiNames;", "", "Lol20;", "apiName", "Lol20;", "a", "()Lol20;", "Companion", "ksu", "BILLING", "TC", "AM_MOBILEPROXY", "LEGAL", "METRICA", "PLUS", "TAXI", "TAXI_V4", "WEBAM", "WEB_MSNGR", "WEB_MSNGR_YNDX", "WEB_MSNGR_WEB", "NATIVE_MSNGR_REGISTRY", "NATIVE_MSNGR_FANOUT", "NATIVE_MSNGR_FILES", "NATIVE_MSNGR_IMAGES", "NATIVE_MSNGR_PUSH", "NATIVE_MSNGR_TOOLS", "BILLING_INTERNATIONAL", "MEDIAADV", "XIVA_PUSH", "YX_MOBILE_ADS", "WEB_FINTECH_BNPL", "WEB_FINTECH_SHOP", "EATS_AUTHPROXY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HostMobSupportedApiNames {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HostMobSupportedApiNames[] $VALUES;
    public static final HostMobSupportedApiNames AM_MOBILEPROXY;
    public static final HostMobSupportedApiNames BILLING;
    public static final HostMobSupportedApiNames BILLING_INTERNATIONAL;
    public static final ksu Companion;
    public static final HostMobSupportedApiNames EATS_AUTHPROXY;
    public static final HostMobSupportedApiNames LEGAL;
    public static final HostMobSupportedApiNames MEDIAADV;
    public static final HostMobSupportedApiNames METRICA;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_FANOUT;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_FILES;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_IMAGES;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_PUSH;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_REGISTRY;
    public static final HostMobSupportedApiNames NATIVE_MSNGR_TOOLS;
    public static final HostMobSupportedApiNames PLUS;
    public static final HostMobSupportedApiNames TAXI;
    public static final HostMobSupportedApiNames TAXI_V4;
    public static final HostMobSupportedApiNames TC;
    public static final HostMobSupportedApiNames WEBAM;
    public static final HostMobSupportedApiNames WEB_FINTECH_BNPL;
    public static final HostMobSupportedApiNames WEB_FINTECH_SHOP;
    public static final HostMobSupportedApiNames WEB_MSNGR;
    public static final HostMobSupportedApiNames WEB_MSNGR_WEB;
    public static final HostMobSupportedApiNames WEB_MSNGR_YNDX;
    public static final HostMobSupportedApiNames XIVA_PUSH;
    public static final HostMobSupportedApiNames YX_MOBILE_ADS;
    private final ol20 apiName;

    static {
        HostMobSupportedApiNames hostMobSupportedApiNames = new HostMobSupportedApiNames("BILLING", 0, new ol20("BILLING"));
        BILLING = hostMobSupportedApiNames;
        HostMobSupportedApiNames hostMobSupportedApiNames2 = new HostMobSupportedApiNames("TC", 1, new ol20("TC"));
        TC = hostMobSupportedApiNames2;
        HostMobSupportedApiNames hostMobSupportedApiNames3 = new HostMobSupportedApiNames("AM_MOBILEPROXY", 2, new ol20("AM_MOBILEPROXY"));
        AM_MOBILEPROXY = hostMobSupportedApiNames3;
        HostMobSupportedApiNames hostMobSupportedApiNames4 = new HostMobSupportedApiNames("LEGAL", 3, new ol20("LEGAL"));
        LEGAL = hostMobSupportedApiNames4;
        HostMobSupportedApiNames hostMobSupportedApiNames5 = new HostMobSupportedApiNames("METRICA", 4, new ol20("METRICA"));
        METRICA = hostMobSupportedApiNames5;
        HostMobSupportedApiNames hostMobSupportedApiNames6 = new HostMobSupportedApiNames("PLUS", 5, new ol20("PLUS"));
        PLUS = hostMobSupportedApiNames6;
        HostMobSupportedApiNames hostMobSupportedApiNames7 = new HostMobSupportedApiNames("TAXI", 6, new ol20("TAXI"));
        TAXI = hostMobSupportedApiNames7;
        HostMobSupportedApiNames hostMobSupportedApiNames8 = new HostMobSupportedApiNames("TAXI_V4", 7, new ol20("TAXI_V4"));
        TAXI_V4 = hostMobSupportedApiNames8;
        HostMobSupportedApiNames hostMobSupportedApiNames9 = new HostMobSupportedApiNames("WEBAM", 8, new ol20("WEBAM"));
        WEBAM = hostMobSupportedApiNames9;
        HostMobSupportedApiNames hostMobSupportedApiNames10 = new HostMobSupportedApiNames("WEB_MSNGR", 9, new ol20("WEB_MSNGR"));
        WEB_MSNGR = hostMobSupportedApiNames10;
        HostMobSupportedApiNames hostMobSupportedApiNames11 = new HostMobSupportedApiNames("WEB_MSNGR_YNDX", 10, new ol20("WEB_MSNGR_YNDX"));
        WEB_MSNGR_YNDX = hostMobSupportedApiNames11;
        HostMobSupportedApiNames hostMobSupportedApiNames12 = new HostMobSupportedApiNames("WEB_MSNGR_WEB", 11, new ol20("WEB_MSNGR_WEB"));
        WEB_MSNGR_WEB = hostMobSupportedApiNames12;
        HostMobSupportedApiNames hostMobSupportedApiNames13 = new HostMobSupportedApiNames("NATIVE_MSNGR_REGISTRY", 12, new ol20("NATIVE_MSNGR_REGISTRY"));
        NATIVE_MSNGR_REGISTRY = hostMobSupportedApiNames13;
        HostMobSupportedApiNames hostMobSupportedApiNames14 = new HostMobSupportedApiNames("NATIVE_MSNGR_FANOUT", 13, new ol20("NATIVE_MSNGR_FANOUT"));
        NATIVE_MSNGR_FANOUT = hostMobSupportedApiNames14;
        HostMobSupportedApiNames hostMobSupportedApiNames15 = new HostMobSupportedApiNames("NATIVE_MSNGR_FILES", 14, new ol20("NATIVE_MSNGR_FILES"));
        NATIVE_MSNGR_FILES = hostMobSupportedApiNames15;
        HostMobSupportedApiNames hostMobSupportedApiNames16 = new HostMobSupportedApiNames("NATIVE_MSNGR_IMAGES", 15, new ol20("NATIVE_MSNGR_IMAGES"));
        NATIVE_MSNGR_IMAGES = hostMobSupportedApiNames16;
        HostMobSupportedApiNames hostMobSupportedApiNames17 = new HostMobSupportedApiNames("NATIVE_MSNGR_PUSH", 16, new ol20("NATIVE_MSNGR_PUSH"));
        NATIVE_MSNGR_PUSH = hostMobSupportedApiNames17;
        HostMobSupportedApiNames hostMobSupportedApiNames18 = new HostMobSupportedApiNames("NATIVE_MSNGR_TOOLS", 17, new ol20("NATIVE_MSNGR_TOOLS"));
        NATIVE_MSNGR_TOOLS = hostMobSupportedApiNames18;
        HostMobSupportedApiNames hostMobSupportedApiNames19 = new HostMobSupportedApiNames("BILLING_INTERNATIONAL", 18, new ol20("BILLING_INTERNATIONAL"));
        BILLING_INTERNATIONAL = hostMobSupportedApiNames19;
        HostMobSupportedApiNames hostMobSupportedApiNames20 = new HostMobSupportedApiNames("MEDIAADV", 19, new ol20("MEDIAADV"));
        MEDIAADV = hostMobSupportedApiNames20;
        HostMobSupportedApiNames hostMobSupportedApiNames21 = new HostMobSupportedApiNames("XIVA_PUSH", 20, new ol20("XIVA_PUSH"));
        XIVA_PUSH = hostMobSupportedApiNames21;
        HostMobSupportedApiNames hostMobSupportedApiNames22 = new HostMobSupportedApiNames("YX_MOBILE_ADS", 21, new ol20("YX_MOBILE_ADS"));
        YX_MOBILE_ADS = hostMobSupportedApiNames22;
        HostMobSupportedApiNames hostMobSupportedApiNames23 = new HostMobSupportedApiNames("WEB_FINTECH_BNPL", 22, new ol20("WEB_FINTECH_BNPL"));
        WEB_FINTECH_BNPL = hostMobSupportedApiNames23;
        HostMobSupportedApiNames hostMobSupportedApiNames24 = new HostMobSupportedApiNames("WEB_FINTECH_SHOP", 23, new ol20("WEB_FINTECH_SHOP"));
        WEB_FINTECH_SHOP = hostMobSupportedApiNames24;
        HostMobSupportedApiNames hostMobSupportedApiNames25 = new HostMobSupportedApiNames("EATS_AUTHPROXY", 24, new ol20("EATS_AUTHPROXY"));
        EATS_AUTHPROXY = hostMobSupportedApiNames25;
        HostMobSupportedApiNames[] hostMobSupportedApiNamesArr = {hostMobSupportedApiNames, hostMobSupportedApiNames2, hostMobSupportedApiNames3, hostMobSupportedApiNames4, hostMobSupportedApiNames5, hostMobSupportedApiNames6, hostMobSupportedApiNames7, hostMobSupportedApiNames8, hostMobSupportedApiNames9, hostMobSupportedApiNames10, hostMobSupportedApiNames11, hostMobSupportedApiNames12, hostMobSupportedApiNames13, hostMobSupportedApiNames14, hostMobSupportedApiNames15, hostMobSupportedApiNames16, hostMobSupportedApiNames17, hostMobSupportedApiNames18, hostMobSupportedApiNames19, hostMobSupportedApiNames20, hostMobSupportedApiNames21, hostMobSupportedApiNames22, hostMobSupportedApiNames23, hostMobSupportedApiNames24, hostMobSupportedApiNames25};
        $VALUES = hostMobSupportedApiNamesArr;
        $ENTRIES = a.a(hostMobSupportedApiNamesArr);
        Companion = new ksu();
    }

    public HostMobSupportedApiNames(String str, int i, ol20 ol20Var) {
        this.apiName = ol20Var;
    }

    public static HostMobSupportedApiNames valueOf(String str) {
        return (HostMobSupportedApiNames) Enum.valueOf(HostMobSupportedApiNames.class, str);
    }

    public static HostMobSupportedApiNames[] values() {
        return (HostMobSupportedApiNames[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ol20 getApiName() {
        return this.apiName;
    }
}
