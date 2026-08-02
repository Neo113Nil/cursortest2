package com.yandex.go.destination_picker;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/destination_picker/ChooseAddressMode;", "", "DESTINATION", "STOP", "OTHER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChooseAddressMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChooseAddressMode[] $VALUES;
    public static final ChooseAddressMode DESTINATION;
    public static final ChooseAddressMode OTHER;
    public static final ChooseAddressMode STOP;

    static {
        ChooseAddressMode chooseAddressMode = new ChooseAddressMode("DESTINATION", 0);
        DESTINATION = chooseAddressMode;
        ChooseAddressMode chooseAddressMode2 = new ChooseAddressMode("STOP", 1);
        STOP = chooseAddressMode2;
        ChooseAddressMode chooseAddressMode3 = new ChooseAddressMode("OTHER", 2);
        OTHER = chooseAddressMode3;
        ChooseAddressMode[] chooseAddressModeArr = {chooseAddressMode, chooseAddressMode2, chooseAddressMode3};
        $VALUES = chooseAddressModeArr;
        $ENTRIES = a.a(chooseAddressModeArr);
    }

    public static ChooseAddressMode valueOf(String str) {
        return (ChooseAddressMode) Enum.valueOf(ChooseAddressMode.class, str);
    }

    public static ChooseAddressMode[] values() {
        return (ChooseAddressMode[]) $VALUES.clone();
    }
}
