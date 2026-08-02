package com.yandex.plus.core.analytics.logging;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/plus/core/analytics/logging/PlusLogTag;", "", "SDK", "UI", "JS", "URL", "SUBSCRIPTION", "BILLING", "DIAGNOSTICS", "TREASURY", "BDUI", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusLogTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusLogTag[] $VALUES;
    public static final PlusLogTag BDUI;
    public static final PlusLogTag BILLING;
    public static final PlusLogTag DIAGNOSTICS;
    public static final PlusLogTag JS;
    public static final PlusLogTag SDK;
    public static final PlusLogTag SUBSCRIPTION;
    public static final PlusLogTag TREASURY;
    public static final PlusLogTag UI;
    public static final PlusLogTag URL;

    static {
        PlusLogTag plusLogTag = new PlusLogTag("SDK", 0);
        SDK = plusLogTag;
        PlusLogTag plusLogTag2 = new PlusLogTag("UI", 1);
        UI = plusLogTag2;
        PlusLogTag plusLogTag3 = new PlusLogTag("JS", 2);
        JS = plusLogTag3;
        PlusLogTag plusLogTag4 = new PlusLogTag("URL", 3);
        URL = plusLogTag4;
        PlusLogTag plusLogTag5 = new PlusLogTag("SUBSCRIPTION", 4);
        SUBSCRIPTION = plusLogTag5;
        PlusLogTag plusLogTag6 = new PlusLogTag("BILLING", 5);
        BILLING = plusLogTag6;
        PlusLogTag plusLogTag7 = new PlusLogTag("DIAGNOSTICS", 6);
        DIAGNOSTICS = plusLogTag7;
        PlusLogTag plusLogTag8 = new PlusLogTag("TREASURY", 7);
        TREASURY = plusLogTag8;
        PlusLogTag plusLogTag9 = new PlusLogTag("BDUI", 8);
        BDUI = plusLogTag9;
        PlusLogTag[] plusLogTagArr = {plusLogTag, plusLogTag2, plusLogTag3, plusLogTag4, plusLogTag5, plusLogTag6, plusLogTag7, plusLogTag8, plusLogTag9};
        $VALUES = plusLogTagArr;
        $ENTRIES = a.a(plusLogTagArr);
    }

    public static PlusLogTag valueOf(String str) {
        return (PlusLogTag) Enum.valueOf(PlusLogTag.class, str);
    }

    public static PlusLogTag[] values() {
        return (PlusLogTag[]) $VALUES.clone();
    }
}
