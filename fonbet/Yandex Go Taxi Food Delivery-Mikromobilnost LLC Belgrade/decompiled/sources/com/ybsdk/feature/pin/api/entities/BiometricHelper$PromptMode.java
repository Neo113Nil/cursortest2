package com.ybsdk.feature.pin.api.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/pin/api/entities/BiometricHelper$PromptMode", "", "Lcom/ybsdk/feature/pin/api/entities/BiometricHelper$PromptMode;", "<init>", "(Ljava/lang/String;I)V", "Encrypt", "Decrypt", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BiometricHelper$PromptMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricHelper$PromptMode[] $VALUES;
    public static final BiometricHelper$PromptMode Encrypt = new BiometricHelper$PromptMode("Encrypt", 0);
    public static final BiometricHelper$PromptMode Decrypt = new BiometricHelper$PromptMode("Decrypt", 1);

    private static final /* synthetic */ BiometricHelper$PromptMode[] $values() {
        return new BiometricHelper$PromptMode[]{Encrypt, Decrypt};
    }

    static {
        BiometricHelper$PromptMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BiometricHelper$PromptMode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BiometricHelper$PromptMode valueOf(String str) {
        return (BiometricHelper$PromptMode) Enum.valueOf(BiometricHelper$PromptMode.class, str);
    }

    public static BiometricHelper$PromptMode[] values() {
        return (BiometricHelper$PromptMode[]) $VALUES.clone();
    }
}
