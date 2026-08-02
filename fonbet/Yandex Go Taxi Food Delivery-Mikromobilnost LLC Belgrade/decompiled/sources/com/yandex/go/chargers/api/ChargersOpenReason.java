package com.yandex.go.chargers.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/api/ChargersOpenReason;", "", "DEEPLINK", "SHORTCUT", "DETAILED_ORDER", "MONOAPP", "SUPER_MAP", "DISCOUNTS_FROM_FEEDBACK", "SHOW_FEEDBACK", "go-client-android.features.chargers:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersOpenReason[] $VALUES;
    public static final ChargersOpenReason DEEPLINK;
    public static final ChargersOpenReason DETAILED_ORDER;
    public static final ChargersOpenReason DISCOUNTS_FROM_FEEDBACK;
    public static final ChargersOpenReason MONOAPP;
    public static final ChargersOpenReason SHORTCUT;
    public static final ChargersOpenReason SHOW_FEEDBACK;
    public static final ChargersOpenReason SUPER_MAP;

    static {
        ChargersOpenReason chargersOpenReason = new ChargersOpenReason("DEEPLINK", 0);
        DEEPLINK = chargersOpenReason;
        ChargersOpenReason chargersOpenReason2 = new ChargersOpenReason("SHORTCUT", 1);
        SHORTCUT = chargersOpenReason2;
        ChargersOpenReason chargersOpenReason3 = new ChargersOpenReason("DETAILED_ORDER", 2);
        DETAILED_ORDER = chargersOpenReason3;
        ChargersOpenReason chargersOpenReason4 = new ChargersOpenReason("MONOAPP", 3);
        MONOAPP = chargersOpenReason4;
        ChargersOpenReason chargersOpenReason5 = new ChargersOpenReason("SUPER_MAP", 4);
        SUPER_MAP = chargersOpenReason5;
        ChargersOpenReason chargersOpenReason6 = new ChargersOpenReason("DISCOUNTS_FROM_FEEDBACK", 5);
        DISCOUNTS_FROM_FEEDBACK = chargersOpenReason6;
        ChargersOpenReason chargersOpenReason7 = new ChargersOpenReason("SHOW_FEEDBACK", 6);
        SHOW_FEEDBACK = chargersOpenReason7;
        ChargersOpenReason[] chargersOpenReasonArr = {chargersOpenReason, chargersOpenReason2, chargersOpenReason3, chargersOpenReason4, chargersOpenReason5, chargersOpenReason6, chargersOpenReason7};
        $VALUES = chargersOpenReasonArr;
        $ENTRIES = a.a(chargersOpenReasonArr);
    }

    public static ChargersOpenReason valueOf(String str) {
        return (ChargersOpenReason) Enum.valueOf(ChargersOpenReason.class, str);
    }

    public static ChargersOpenReason[] values() {
        return (ChargersOpenReason[]) $VALUES.clone();
    }
}
