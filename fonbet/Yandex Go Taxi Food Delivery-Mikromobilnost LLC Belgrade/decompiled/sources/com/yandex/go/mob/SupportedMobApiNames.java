package com.yandex.go.mob;

import defpackage.k4o;
import defpackage.ol20;
import defpackage.ulw0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/mob/SupportedMobApiNames;", "", "Lol20;", "apiName", "Lol20;", "a", "()Lol20;", "Companion", "ulw0", "NATIVE_MSNGR_TOOLS", "NATIVE_MSNGR_PUSH", "AM_MOBILEPROXY", "WEB_MSNGR_YNDX", "WEB_MSNGR_WEB", "TAXI_V4", "XIVA_PUSH", "NATIVE_MSNGR_IMAGES", "TAXI", "NATIVE_MSNGR_FANOUT", "METRICA", "WEB_MSNGR", "TC", "WEBAM", "YX_MOBILE_ADS", "MEDIAADV", "NATIVE_MSNGR_REGISTRY", "BILLING_INTERNATIONAL", "NATIVE_MSNGR_FILES", "PLUS", "LEGAL", TariffOrderFlow.ORDER_FLOW_TAXI_KEY}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportedMobApiNames {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedMobApiNames[] $VALUES;
    public static final SupportedMobApiNames AM_MOBILEPROXY;
    public static final SupportedMobApiNames BILLING_INTERNATIONAL;
    public static final ulw0 Companion;
    public static final SupportedMobApiNames LEGAL;
    public static final SupportedMobApiNames MEDIAADV;
    public static final SupportedMobApiNames METRICA;
    public static final SupportedMobApiNames NATIVE_MSNGR_FANOUT;
    public static final SupportedMobApiNames NATIVE_MSNGR_FILES;
    public static final SupportedMobApiNames NATIVE_MSNGR_IMAGES;
    public static final SupportedMobApiNames NATIVE_MSNGR_PUSH;
    public static final SupportedMobApiNames NATIVE_MSNGR_REGISTRY;
    public static final SupportedMobApiNames NATIVE_MSNGR_TOOLS;
    public static final SupportedMobApiNames PLUS;
    public static final SupportedMobApiNames TAXI;
    public static final SupportedMobApiNames TAXI_V4;
    public static final SupportedMobApiNames TC;
    public static final SupportedMobApiNames WEBAM;
    public static final SupportedMobApiNames WEB_MSNGR;
    public static final SupportedMobApiNames WEB_MSNGR_WEB;
    public static final SupportedMobApiNames WEB_MSNGR_YNDX;
    public static final SupportedMobApiNames XIVA_PUSH;
    public static final SupportedMobApiNames YX_MOBILE_ADS;
    private final ol20 apiName;

    static {
        SupportedMobApiNames supportedMobApiNames = new SupportedMobApiNames("NATIVE_MSNGR_TOOLS", 0, new ol20("NATIVE_MSNGR_TOOLS"));
        NATIVE_MSNGR_TOOLS = supportedMobApiNames;
        SupportedMobApiNames supportedMobApiNames2 = new SupportedMobApiNames("NATIVE_MSNGR_PUSH", 1, new ol20("NATIVE_MSNGR_PUSH"));
        NATIVE_MSNGR_PUSH = supportedMobApiNames2;
        SupportedMobApiNames supportedMobApiNames3 = new SupportedMobApiNames("AM_MOBILEPROXY", 2, new ol20("AM_MOBILEPROXY"));
        AM_MOBILEPROXY = supportedMobApiNames3;
        SupportedMobApiNames supportedMobApiNames4 = new SupportedMobApiNames("WEB_MSNGR_YNDX", 3, new ol20("WEB_MSNGR_YNDX"));
        WEB_MSNGR_YNDX = supportedMobApiNames4;
        SupportedMobApiNames supportedMobApiNames5 = new SupportedMobApiNames("WEB_MSNGR_WEB", 4, new ol20("WEB_MSNGR_WEB"));
        WEB_MSNGR_WEB = supportedMobApiNames5;
        SupportedMobApiNames supportedMobApiNames6 = new SupportedMobApiNames("TAXI_V4", 5, new ol20("TAXI_V4"));
        TAXI_V4 = supportedMobApiNames6;
        SupportedMobApiNames supportedMobApiNames7 = new SupportedMobApiNames("XIVA_PUSH", 6, new ol20("XIVA_PUSH"));
        XIVA_PUSH = supportedMobApiNames7;
        SupportedMobApiNames supportedMobApiNames8 = new SupportedMobApiNames("NATIVE_MSNGR_IMAGES", 7, new ol20("NATIVE_MSNGR_IMAGES"));
        NATIVE_MSNGR_IMAGES = supportedMobApiNames8;
        SupportedMobApiNames supportedMobApiNames9 = new SupportedMobApiNames("TAXI", 8, new ol20("TAXI"));
        TAXI = supportedMobApiNames9;
        SupportedMobApiNames supportedMobApiNames10 = new SupportedMobApiNames("NATIVE_MSNGR_FANOUT", 9, new ol20("NATIVE_MSNGR_FANOUT"));
        NATIVE_MSNGR_FANOUT = supportedMobApiNames10;
        SupportedMobApiNames supportedMobApiNames11 = new SupportedMobApiNames("METRICA", 10, new ol20("METRICA"));
        METRICA = supportedMobApiNames11;
        SupportedMobApiNames supportedMobApiNames12 = new SupportedMobApiNames("WEB_MSNGR", 11, new ol20("WEB_MSNGR"));
        WEB_MSNGR = supportedMobApiNames12;
        SupportedMobApiNames supportedMobApiNames13 = new SupportedMobApiNames("TC", 12, new ol20("TC"));
        TC = supportedMobApiNames13;
        SupportedMobApiNames supportedMobApiNames14 = new SupportedMobApiNames("WEBAM", 13, new ol20("WEBAM"));
        WEBAM = supportedMobApiNames14;
        SupportedMobApiNames supportedMobApiNames15 = new SupportedMobApiNames("YX_MOBILE_ADS", 14, new ol20("YX_MOBILE_ADS"));
        YX_MOBILE_ADS = supportedMobApiNames15;
        SupportedMobApiNames supportedMobApiNames16 = new SupportedMobApiNames("MEDIAADV", 15, new ol20("MEDIAADV"));
        MEDIAADV = supportedMobApiNames16;
        SupportedMobApiNames supportedMobApiNames17 = new SupportedMobApiNames("NATIVE_MSNGR_REGISTRY", 16, new ol20("NATIVE_MSNGR_REGISTRY"));
        NATIVE_MSNGR_REGISTRY = supportedMobApiNames17;
        SupportedMobApiNames supportedMobApiNames18 = new SupportedMobApiNames("BILLING_INTERNATIONAL", 17, new ol20("BILLING_INTERNATIONAL"));
        BILLING_INTERNATIONAL = supportedMobApiNames18;
        SupportedMobApiNames supportedMobApiNames19 = new SupportedMobApiNames("NATIVE_MSNGR_FILES", 18, new ol20("NATIVE_MSNGR_FILES"));
        NATIVE_MSNGR_FILES = supportedMobApiNames19;
        SupportedMobApiNames supportedMobApiNames20 = new SupportedMobApiNames("PLUS", 19, new ol20("PLUS"));
        PLUS = supportedMobApiNames20;
        SupportedMobApiNames supportedMobApiNames21 = new SupportedMobApiNames("LEGAL", 20, new ol20("LEGAL"));
        LEGAL = supportedMobApiNames21;
        SupportedMobApiNames[] supportedMobApiNamesArr = {supportedMobApiNames, supportedMobApiNames2, supportedMobApiNames3, supportedMobApiNames4, supportedMobApiNames5, supportedMobApiNames6, supportedMobApiNames7, supportedMobApiNames8, supportedMobApiNames9, supportedMobApiNames10, supportedMobApiNames11, supportedMobApiNames12, supportedMobApiNames13, supportedMobApiNames14, supportedMobApiNames15, supportedMobApiNames16, supportedMobApiNames17, supportedMobApiNames18, supportedMobApiNames19, supportedMobApiNames20, supportedMobApiNames21};
        $VALUES = supportedMobApiNamesArr;
        $ENTRIES = a.a(supportedMobApiNamesArr);
        Companion = new ulw0();
    }

    public SupportedMobApiNames(String str, int i, ol20 ol20Var) {
        this.apiName = ol20Var;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static SupportedMobApiNames valueOf(String str) {
        return (SupportedMobApiNames) Enum.valueOf(SupportedMobApiNames.class, str);
    }

    public static SupportedMobApiNames[] values() {
        return (SupportedMobApiNames[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ol20 getApiName() {
        return this.apiName;
    }
}
