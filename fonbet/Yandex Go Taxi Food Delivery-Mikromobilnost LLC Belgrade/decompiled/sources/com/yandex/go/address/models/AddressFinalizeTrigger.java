package com.yandex.go.address.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pn0;
import defpackage.qu0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/address/models/AddressFinalizeTrigger;", "", "Companion", "qu0", "TARIFF_CHANGED", "REQUIREMENTS_CHANGED", "UNKNOWN", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressFinalizeTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressFinalizeTrigger[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final qu0 Companion;
    public static final AddressFinalizeTrigger REQUIREMENTS_CHANGED;
    public static final AddressFinalizeTrigger TARIFF_CHANGED;
    public static final AddressFinalizeTrigger UNKNOWN;

    static {
        AddressFinalizeTrigger addressFinalizeTrigger = new AddressFinalizeTrigger("TARIFF_CHANGED", 0);
        TARIFF_CHANGED = addressFinalizeTrigger;
        AddressFinalizeTrigger addressFinalizeTrigger2 = new AddressFinalizeTrigger("REQUIREMENTS_CHANGED", 1);
        REQUIREMENTS_CHANGED = addressFinalizeTrigger2;
        AddressFinalizeTrigger addressFinalizeTrigger3 = new AddressFinalizeTrigger("UNKNOWN", 2);
        UNKNOWN = addressFinalizeTrigger3;
        AddressFinalizeTrigger[] addressFinalizeTriggerArr = {addressFinalizeTrigger, addressFinalizeTrigger2, addressFinalizeTrigger3};
        $VALUES = addressFinalizeTriggerArr;
        $ENTRIES = kotlin.enums.a.a(addressFinalizeTriggerArr);
        Companion = new qu0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(10));
    }

    public static AddressFinalizeTrigger valueOf(String str) {
        return (AddressFinalizeTrigger) Enum.valueOf(AddressFinalizeTrigger.class, str);
    }

    public static AddressFinalizeTrigger[] values() {
        return (AddressFinalizeTrigger[]) $VALUES.clone();
    }
}
