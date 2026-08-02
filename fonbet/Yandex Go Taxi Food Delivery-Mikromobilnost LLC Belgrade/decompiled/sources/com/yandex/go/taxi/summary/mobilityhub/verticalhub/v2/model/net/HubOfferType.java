package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.p0v;
import defpackage.syu;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubOfferType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "p0v", "TAXI", "TRANSPORT", "SCOOTERS", "DRIVE", "PEDESTRIAN", "NAVIGATOR", "MULTIMODAL_TAXI_TRANSPORT", "MULTIMODAL", "SCOOTER_MULTIMODAL", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubOfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubOfferType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final p0v Companion;
    public static final HubOfferType DRIVE;
    public static final HubOfferType MULTIMODAL;
    public static final HubOfferType MULTIMODAL_TAXI_TRANSPORT;
    public static final HubOfferType NAVIGATOR;
    public static final HubOfferType PEDESTRIAN;
    public static final HubOfferType SCOOTERS;
    public static final HubOfferType SCOOTER_MULTIMODAL;
    public static final HubOfferType TAXI;
    public static final HubOfferType TRANSPORT;
    public static final HubOfferType UNKNOWN;
    private final String value;

    static {
        HubOfferType hubOfferType = new HubOfferType("TAXI", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        TAXI = hubOfferType;
        HubOfferType hubOfferType2 = new HubOfferType("TRANSPORT", 1, "transport");
        TRANSPORT = hubOfferType2;
        HubOfferType hubOfferType3 = new HubOfferType("SCOOTERS", 2, "scooters");
        SCOOTERS = hubOfferType3;
        HubOfferType hubOfferType4 = new HubOfferType("DRIVE", 3, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = hubOfferType4;
        HubOfferType hubOfferType5 = new HubOfferType("PEDESTRIAN", 4, "pedestrian");
        PEDESTRIAN = hubOfferType5;
        HubOfferType hubOfferType6 = new HubOfferType("NAVIGATOR", 5, "navigator");
        NAVIGATOR = hubOfferType6;
        HubOfferType hubOfferType7 = new HubOfferType("MULTIMODAL_TAXI_TRANSPORT", 6, "multimodal_taxi_transport");
        MULTIMODAL_TAXI_TRANSPORT = hubOfferType7;
        HubOfferType hubOfferType8 = new HubOfferType("MULTIMODAL", 7, "multimodal");
        MULTIMODAL = hubOfferType8;
        HubOfferType hubOfferType9 = new HubOfferType("SCOOTER_MULTIMODAL", 8, "scooter_multimodal");
        SCOOTER_MULTIMODAL = hubOfferType9;
        HubOfferType hubOfferType10 = new HubOfferType("UNKNOWN", 9, "unknown");
        UNKNOWN = hubOfferType10;
        HubOfferType[] hubOfferTypeArr = {hubOfferType, hubOfferType2, hubOfferType3, hubOfferType4, hubOfferType5, hubOfferType6, hubOfferType7, hubOfferType8, hubOfferType9, hubOfferType10};
        $VALUES = hubOfferTypeArr;
        $ENTRIES = kotlin.enums.a.a(hubOfferTypeArr);
        Companion = new p0v();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(3));
    }

    public HubOfferType(String str, int i, String str2) {
        this.value = str2;
    }

    public static HubOfferType valueOf(String str) {
        return (HubOfferType) Enum.valueOf(HubOfferType.class, str);
    }

    public static HubOfferType[] values() {
        return (HubOfferType[]) $VALUES.clone();
    }
}
