package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sq20;
import defpackage.z330;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Mode;", "", "", "mode", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Companion", "z330", "UNKNOWN", "TAXI", "EATS", "GROCERY", "PHARMACY", "SHOP", "MARKET", "MARKET_VIEWER", "CITY", "DRIVE", "SCOOTERS", "CHARGERS", "DELIVERY", "MASSTRANSIT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Mode CHARGERS;
    public static final Mode CITY;
    public static final z330 Companion;
    public static final Mode DELIVERY;
    public static final Mode DRIVE;
    public static final Mode EATS;
    public static final Mode GROCERY;
    public static final Mode MARKET;
    public static final Mode MARKET_VIEWER;
    public static final Mode MASSTRANSIT;
    public static final Mode PHARMACY;
    public static final Mode SCOOTERS;
    public static final Mode SHOP;
    public static final Mode TAXI;
    public static final Mode UNKNOWN;
    private final String mode;

    static {
        Mode mode = new Mode("UNKNOWN", 0, "");
        UNKNOWN = mode;
        Mode mode2 = new Mode("TAXI", 1, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        TAXI = mode2;
        Mode mode3 = new Mode("EATS", 2, "eats");
        EATS = mode3;
        Mode mode4 = new Mode("GROCERY", 3, "grocery");
        GROCERY = mode4;
        Mode mode5 = new Mode("PHARMACY", 4, "pharmacy");
        PHARMACY = mode5;
        Mode mode6 = new Mode("SHOP", 5, "shop");
        SHOP = mode6;
        Mode mode7 = new Mode("MARKET", 6, "market");
        MARKET = mode7;
        Mode mode8 = new Mode("MARKET_VIEWER", 7, "market_viewer");
        MARKET_VIEWER = mode8;
        Mode mode9 = new Mode("CITY", 8, "city");
        CITY = mode9;
        Mode mode10 = new Mode("DRIVE", 9, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = mode10;
        Mode mode11 = new Mode("SCOOTERS", 10, "scooters");
        SCOOTERS = mode11;
        Mode mode12 = new Mode("CHARGERS", 11, "chargers");
        CHARGERS = mode12;
        Mode mode13 = new Mode("DELIVERY", 12, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        DELIVERY = mode13;
        Mode mode14 = new Mode("MASSTRANSIT", 13, "masstransit");
        MASSTRANSIT = mode14;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5, mode6, mode7, mode8, mode9, mode10, mode11, mode12, mode13, mode14};
        $VALUES = modeArr;
        $ENTRIES = kotlin.enums.a.a(modeArr);
        Companion = new z330();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sq20(27));
    }

    public Mode(String str, int i, String str2) {
        this.mode = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    /* renamed from: c, reason: from getter */
    public final String getMode() {
        return this.mode;
    }
}
