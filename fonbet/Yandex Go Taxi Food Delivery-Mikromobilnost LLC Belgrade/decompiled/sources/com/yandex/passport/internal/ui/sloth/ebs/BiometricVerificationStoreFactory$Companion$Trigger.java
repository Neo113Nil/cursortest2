package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationStoreFactory$Companion$Trigger", "", "Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationStoreFactory$Companion$Trigger;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AM", "WEBAM", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricVerificationStoreFactory$Companion$Trigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricVerificationStoreFactory$Companion$Trigger[] $VALUES;
    public static final BiometricVerificationStoreFactory$Companion$Trigger AM;
    public static final BiometricVerificationStoreFactory$Companion$Trigger WEBAM;
    private final String value;

    static {
        BiometricVerificationStoreFactory$Companion$Trigger biometricVerificationStoreFactory$Companion$Trigger = new BiometricVerificationStoreFactory$Companion$Trigger("AM", 0, "am");
        AM = biometricVerificationStoreFactory$Companion$Trigger;
        BiometricVerificationStoreFactory$Companion$Trigger biometricVerificationStoreFactory$Companion$Trigger2 = new BiometricVerificationStoreFactory$Companion$Trigger("WEBAM", 1, "webam");
        WEBAM = biometricVerificationStoreFactory$Companion$Trigger2;
        BiometricVerificationStoreFactory$Companion$Trigger[] biometricVerificationStoreFactory$Companion$TriggerArr = {biometricVerificationStoreFactory$Companion$Trigger, biometricVerificationStoreFactory$Companion$Trigger2};
        $VALUES = biometricVerificationStoreFactory$Companion$TriggerArr;
        $ENTRIES = kotlin.enums.a.a(biometricVerificationStoreFactory$Companion$TriggerArr);
    }

    public BiometricVerificationStoreFactory$Companion$Trigger(String str, int i, String str2) {
        this.value = str2;
    }

    public static BiometricVerificationStoreFactory$Companion$Trigger valueOf(String str) {
        return (BiometricVerificationStoreFactory$Companion$Trigger) Enum.valueOf(BiometricVerificationStoreFactory$Companion$Trigger.class, str);
    }

    public static BiometricVerificationStoreFactory$Companion$Trigger[] values() {
        return (BiometricVerificationStoreFactory$Companion$Trigger[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
