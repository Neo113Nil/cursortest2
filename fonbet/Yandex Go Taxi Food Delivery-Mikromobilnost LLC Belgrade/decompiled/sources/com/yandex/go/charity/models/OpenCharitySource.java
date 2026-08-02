package com.yandex.go.charity.models;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/charity/models/OpenCharitySource;", "", "", "sourceName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MENU", "EATSKIT", "DEEPLINK", "SCOOTERS_BANNER", "SCOOTERS_OFFER_CARD", "SCOOTERS_FINISH_CARD", "go-client-android.features.charity:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenCharitySource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpenCharitySource[] $VALUES;
    public static final OpenCharitySource DEEPLINK;
    public static final OpenCharitySource EATSKIT;
    public static final OpenCharitySource MENU;
    public static final OpenCharitySource SCOOTERS_BANNER;
    public static final OpenCharitySource SCOOTERS_FINISH_CARD;
    public static final OpenCharitySource SCOOTERS_OFFER_CARD;
    private final String sourceName;

    static {
        OpenCharitySource openCharitySource = new OpenCharitySource("MENU", 0, "burger");
        MENU = openCharitySource;
        OpenCharitySource openCharitySource2 = new OpenCharitySource("EATSKIT", 1, "eatskit");
        EATSKIT = openCharitySource2;
        OpenCharitySource openCharitySource3 = new OpenCharitySource("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = openCharitySource3;
        OpenCharitySource openCharitySource4 = new OpenCharitySource("SCOOTERS_BANNER", 3, "scooters_banner");
        SCOOTERS_BANNER = openCharitySource4;
        OpenCharitySource openCharitySource5 = new OpenCharitySource("SCOOTERS_OFFER_CARD", 4, "scooters_tariff");
        SCOOTERS_OFFER_CARD = openCharitySource5;
        OpenCharitySource openCharitySource6 = new OpenCharitySource("SCOOTERS_FINISH_CARD", 5, "scooters_finalscreen");
        SCOOTERS_FINISH_CARD = openCharitySource6;
        OpenCharitySource[] openCharitySourceArr = {openCharitySource, openCharitySource2, openCharitySource3, openCharitySource4, openCharitySource5, openCharitySource6};
        $VALUES = openCharitySourceArr;
        $ENTRIES = a.a(openCharitySourceArr);
    }

    public OpenCharitySource(String str, int i, String str2) {
        this.sourceName = str2;
    }

    public static OpenCharitySource valueOf(String str) {
        return (OpenCharitySource) Enum.valueOf(OpenCharitySource.class, str);
    }

    public static OpenCharitySource[] values() {
        return (OpenCharitySource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }
}
