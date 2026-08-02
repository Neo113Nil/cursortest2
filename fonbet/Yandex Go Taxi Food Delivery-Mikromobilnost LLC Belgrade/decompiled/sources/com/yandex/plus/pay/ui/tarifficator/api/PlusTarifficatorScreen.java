package com.yandex.plus.pay.ui.tarifficator.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/ui/tarifficator/api/PlusTarifficatorScreen;", "", "UPSALE", "FAMILY", "CONTACTS", "SUCCESS", "ERROR", "pay-sdk-ui-tarifficator-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusTarifficatorScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusTarifficatorScreen[] $VALUES;
    public static final PlusTarifficatorScreen CONTACTS;
    public static final PlusTarifficatorScreen ERROR;
    public static final PlusTarifficatorScreen FAMILY;
    public static final PlusTarifficatorScreen SUCCESS;
    public static final PlusTarifficatorScreen UPSALE;

    static {
        PlusTarifficatorScreen plusTarifficatorScreen = new PlusTarifficatorScreen("UPSALE", 0);
        UPSALE = plusTarifficatorScreen;
        PlusTarifficatorScreen plusTarifficatorScreen2 = new PlusTarifficatorScreen("FAMILY", 1);
        FAMILY = plusTarifficatorScreen2;
        PlusTarifficatorScreen plusTarifficatorScreen3 = new PlusTarifficatorScreen("CONTACTS", 2);
        CONTACTS = plusTarifficatorScreen3;
        PlusTarifficatorScreen plusTarifficatorScreen4 = new PlusTarifficatorScreen("SUCCESS", 3);
        SUCCESS = plusTarifficatorScreen4;
        PlusTarifficatorScreen plusTarifficatorScreen5 = new PlusTarifficatorScreen("ERROR", 4);
        ERROR = plusTarifficatorScreen5;
        PlusTarifficatorScreen[] plusTarifficatorScreenArr = {plusTarifficatorScreen, plusTarifficatorScreen2, plusTarifficatorScreen3, plusTarifficatorScreen4, plusTarifficatorScreen5};
        $VALUES = plusTarifficatorScreenArr;
        $ENTRIES = a.a(plusTarifficatorScreenArr);
    }

    public static PlusTarifficatorScreen valueOf(String str) {
        return (PlusTarifficatorScreen) Enum.valueOf(PlusTarifficatorScreen.class, str);
    }

    public static PlusTarifficatorScreen[] values() {
        return (PlusTarifficatorScreen[]) $VALUES.clone();
    }
}
