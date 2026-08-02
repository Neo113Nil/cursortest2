package com.yandex.go.taxi.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/taxi/analytics/HubOpenReason;", "", "", "analyticName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TAP", "SWIPE", "DEEPLINK", "ROUTE_INPUT", "SUPERAPP_DISCOVERY_MAP", "STOP_MODAL", "UNKNOWN", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HubOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubOpenReason[] $VALUES;
    public static final HubOpenReason DEEPLINK;
    public static final HubOpenReason ROUTE_INPUT;
    public static final HubOpenReason STOP_MODAL;
    public static final HubOpenReason SUPERAPP_DISCOVERY_MAP;
    public static final HubOpenReason SWIPE;
    public static final HubOpenReason TAP;
    public static final HubOpenReason UNKNOWN;
    private final String analyticName;

    static {
        HubOpenReason hubOpenReason = new HubOpenReason("TAP", 0, "tap");
        TAP = hubOpenReason;
        HubOpenReason hubOpenReason2 = new HubOpenReason("SWIPE", 1, "swipe");
        SWIPE = hubOpenReason2;
        HubOpenReason hubOpenReason3 = new HubOpenReason("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = hubOpenReason3;
        HubOpenReason hubOpenReason4 = new HubOpenReason("ROUTE_INPUT", 3, "route_input");
        ROUTE_INPUT = hubOpenReason4;
        HubOpenReason hubOpenReason5 = new HubOpenReason("SUPERAPP_DISCOVERY_MAP", 4, "superapp_discovery_map");
        SUPERAPP_DISCOVERY_MAP = hubOpenReason5;
        HubOpenReason hubOpenReason6 = new HubOpenReason("STOP_MODAL", 5, "stop_modal");
        STOP_MODAL = hubOpenReason6;
        HubOpenReason hubOpenReason7 = new HubOpenReason("UNKNOWN", 6, "");
        UNKNOWN = hubOpenReason7;
        HubOpenReason[] hubOpenReasonArr = {hubOpenReason, hubOpenReason2, hubOpenReason3, hubOpenReason4, hubOpenReason5, hubOpenReason6, hubOpenReason7};
        $VALUES = hubOpenReasonArr;
        $ENTRIES = a.a(hubOpenReasonArr);
    }

    public HubOpenReason(String str, int i, String str2) {
        this.analyticName = str2;
    }

    public static HubOpenReason valueOf(String str) {
        return (HubOpenReason) Enum.valueOf(HubOpenReason.class, str);
    }

    public static HubOpenReason[] values() {
        return (HubOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticName() {
        return this.analyticName;
    }
}
