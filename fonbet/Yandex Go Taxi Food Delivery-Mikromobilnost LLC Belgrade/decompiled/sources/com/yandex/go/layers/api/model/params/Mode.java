package com.yandex.go.layers.api.model.params;

import com.adjust.sdk.Constants;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.a430;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.um20;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/yandex/go/layers/api/model/params/Mode;", "", "", "serializedName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "wireName", "f", "analyticsName", "b", "Companion", "a430", "NORMAL", "SDC", "BOATS", "EATS", "GROCERY", "DRIVE", "MASSTRANSIT", "NAVIGATOR", "SCOOTERS", "CHARGERS", "RESTAURANTS", "CITY", "ULTIMA", "CONTACTS", "SHUTTLE", "INTERCITY", "INTERCITY_SHUTTLE_STOP_POINT", "DELIVERY_NDD", "DELIVERY_INTERCITY", "ROVER", "ORGANIZATIONS", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Mode BOATS;
    public static final Mode CHARGERS;
    public static final Mode CITY;
    public static final Mode CONTACTS;
    public static final a430 Companion;
    public static final Mode DELIVERY_INTERCITY;
    public static final Mode DELIVERY_NDD;
    public static final Mode DRIVE;
    public static final Mode EATS;
    public static final Mode GROCERY;
    public static final Mode INTERCITY;
    public static final Mode INTERCITY_SHUTTLE_STOP_POINT;
    public static final Mode MASSTRANSIT;
    public static final Mode NAVIGATOR;
    public static final Mode NORMAL;
    public static final Mode ORGANIZATIONS;
    public static final Mode RESTAURANTS;
    public static final Mode ROVER;
    public static final Mode SCOOTERS;
    public static final Mode SDC;
    public static final Mode SHUTTLE;
    public static final Mode ULTIMA;
    public static final Mode UNKNOWN;
    private final String analyticsName;
    private final String serializedName;
    private final String wireName;

    static {
        Mode mode = new Mode("NORMAL", 0, Constants.NORMAL, 6);
        NORMAL = mode;
        Mode mode2 = new Mode("SDC", 1, "sdc", 6);
        SDC = mode2;
        Mode mode3 = new Mode("BOATS", 2, "boats", 6);
        BOATS = mode3;
        Mode mode4 = new Mode("EATS", 3, "eats", 6);
        EATS = mode4;
        Mode mode5 = new Mode("GROCERY", 4, "grocery", 6);
        GROCERY = mode5;
        Mode mode6 = new Mode("DRIVE", 5, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, 6);
        DRIVE = mode6;
        Mode mode7 = new Mode("MASSTRANSIT", 6, "masstransit", 6);
        MASSTRANSIT = mode7;
        Mode mode8 = new Mode("NAVIGATOR", 7, "navigator", 6);
        NAVIGATOR = mode8;
        Mode mode9 = new Mode("SCOOTERS", 8, "scooters", 6);
        SCOOTERS = mode9;
        Mode mode10 = new Mode("CHARGERS", 9, "chargers", 6);
        CHARGERS = mode10;
        Mode mode11 = new Mode("RESTAURANTS", 10, "restaurants", 6);
        RESTAURANTS = mode11;
        Mode mode12 = new Mode("CITY", 11, "city", 6);
        CITY = mode12;
        Mode mode13 = new Mode("ULTIMA", 12, "ultima", 6);
        ULTIMA = mode13;
        Mode mode14 = new Mode("CONTACTS", 13, ContactsFragment.WEBVIEW_NAME, 6);
        CONTACTS = mode14;
        Mode mode15 = new Mode("SHUTTLE", 14, TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY, 6);
        SHUTTLE = mode15;
        Mode mode16 = new Mode("INTERCITY", 15, "intercity", 6);
        INTERCITY = mode16;
        Mode mode17 = new Mode("INTERCITY_SHUTTLE_STOP_POINT", 16, "intercity_shuttle_choose_point", 4);
        INTERCITY_SHUTTLE_STOP_POINT = mode17;
        Mode mode18 = new Mode("DELIVERY_NDD", 17, "delivery_ndd", 6);
        DELIVERY_NDD = mode18;
        Mode mode19 = new Mode("DELIVERY_INTERCITY", 18, "delivery_intercity", 6);
        DELIVERY_INTERCITY = mode19;
        Mode mode20 = new Mode("ROVER", 19, "rover", 6);
        ROVER = mode20;
        Mode mode21 = new Mode("ORGANIZATIONS", 20, "organizations", 6);
        ORGANIZATIONS = mode21;
        Mode mode22 = new Mode("UNKNOWN", 21, "unknown", 6);
        UNKNOWN = mode22;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5, mode6, mode7, mode8, mode9, mode10, mode11, mode12, mode13, mode14, mode15, mode16, mode17, mode18, mode19, mode20, mode21, mode22};
        $VALUES = modeArr;
        $ENTRIES = kotlin.enums.a.a(modeArr);
        Companion = new a430();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(16));
    }

    public Mode(String str, int i, String str2, int i2) {
        String upperCase = (i2 & 2) != 0 ? str2.toUpperCase(Locale.ROOT) : "INTERCITY_SHUTTLE_STOP_POINT";
        String lowerCase = upperCase.toLowerCase(Locale.ROOT);
        this.serializedName = str2;
        this.wireName = upperCase;
        this.analyticsName = lowerCase;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* renamed from: c, reason: from getter */
    public final String getSerializedName() {
        return this.serializedName;
    }

    /* renamed from: f, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }

    public final boolean g(String str) {
        return jl40.l(str, this.wireName);
    }
}
