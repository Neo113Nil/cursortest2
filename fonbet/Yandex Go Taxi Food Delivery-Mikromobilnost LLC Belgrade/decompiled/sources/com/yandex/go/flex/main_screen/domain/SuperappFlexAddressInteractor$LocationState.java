package com.yandex.go.flex.main_screen.domain;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/flex/main_screen/domain/SuperappFlexAddressInteractor$LocationState", "", "Lcom/yandex/go/flex/main_screen/domain/SuperappFlexAddressInteractor$LocationState;", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LOCATION_DISABLED", "PERMISSION_DENIED", "OK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final class SuperappFlexAddressInteractor$LocationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappFlexAddressInteractor$LocationState[] $VALUES;
    public static final SuperappFlexAddressInteractor$LocationState LOCATION_DISABLED;
    public static final SuperappFlexAddressInteractor$LocationState OK;
    public static final SuperappFlexAddressInteractor$LocationState PERMISSION_DENIED;
    private final String rawValue;

    static {
        SuperappFlexAddressInteractor$LocationState superappFlexAddressInteractor$LocationState = new SuperappFlexAddressInteractor$LocationState("LOCATION_DISABLED", 0, "location_disabled");
        LOCATION_DISABLED = superappFlexAddressInteractor$LocationState;
        SuperappFlexAddressInteractor$LocationState superappFlexAddressInteractor$LocationState2 = new SuperappFlexAddressInteractor$LocationState("PERMISSION_DENIED", 1, "permission_denied");
        PERMISSION_DENIED = superappFlexAddressInteractor$LocationState2;
        SuperappFlexAddressInteractor$LocationState superappFlexAddressInteractor$LocationState3 = new SuperappFlexAddressInteractor$LocationState("OK", 2, WriteBlocks.OK);
        OK = superappFlexAddressInteractor$LocationState3;
        SuperappFlexAddressInteractor$LocationState[] superappFlexAddressInteractor$LocationStateArr = {superappFlexAddressInteractor$LocationState, superappFlexAddressInteractor$LocationState2, superappFlexAddressInteractor$LocationState3};
        $VALUES = superappFlexAddressInteractor$LocationStateArr;
        $ENTRIES = kotlin.enums.a.a(superappFlexAddressInteractor$LocationStateArr);
    }

    public SuperappFlexAddressInteractor$LocationState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SuperappFlexAddressInteractor$LocationState valueOf(String str) {
        return (SuperappFlexAddressInteractor$LocationState) Enum.valueOf(SuperappFlexAddressInteractor$LocationState.class, str);
    }

    public static SuperappFlexAddressInteractor$LocationState[] values() {
        return (SuperappFlexAddressInteractor$LocationState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
