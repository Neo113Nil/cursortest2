package com.ybsdk.feature.pin.internal.screens.checkpin;

import com.ybsdk.feature.pin.api.entities.PinScenario;
import defpackage.aib;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0002\b\u000fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/checkpin/CheckType;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER", "SET_BIOMETRY", "CHANGE_PIN", "VALIDATE_PIN_ON_RETURN", "ENTER_PRO", "getAnalyticsScenario", "Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "isEnterOrValidateOnReturn", "", "isEnterOrValidateOnReturn$feature_pin_release", "canReturnOnPreviousScreen", "canReturnOnPreviousScreen$feature_pin_release", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckType[] $VALUES;
    public static final CheckType ENTER = new CheckType("ENTER", 0);
    public static final CheckType SET_BIOMETRY = new CheckType("SET_BIOMETRY", 1);
    public static final CheckType CHANGE_PIN = new CheckType("CHANGE_PIN", 2);
    public static final CheckType VALIDATE_PIN_ON_RETURN = new CheckType("VALIDATE_PIN_ON_RETURN", 3);
    public static final CheckType ENTER_PRO = new CheckType("ENTER_PRO", 4);

    private static final /* synthetic */ CheckType[] $values() {
        return new CheckType[]{ENTER, SET_BIOMETRY, CHANGE_PIN, VALIDATE_PIN_ON_RETURN, ENTER_PRO};
    }

    static {
        CheckType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CheckType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CheckType valueOf(String str) {
        return (CheckType) Enum.valueOf(CheckType.class, str);
    }

    public static CheckType[] values() {
        return (CheckType[]) $VALUES.clone();
    }

    public final boolean canReturnOnPreviousScreen$feature_pin_release() {
        int i = aib.a[ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        w511.b();
        return false;
    }

    public final PinScenario getAnalyticsScenario() {
        int i = aib.a[ordinal()];
        if (i == 1 || i == 2) {
            return PinScenario.ENTER_PIN;
        }
        if (i == 3) {
            return PinScenario.ENABLE_BIOMETRY;
        }
        if (i == 4) {
            return PinScenario.CHANGE_PIN;
        }
        if (i == 5) {
            return PinScenario.ENTER_PIN;
        }
        w511.b();
        return null;
    }

    public final boolean isEnterOrValidateOnReturn$feature_pin_release() {
        return this == ENTER || this == VALIDATE_PIN_ON_RETURN;
    }
}
