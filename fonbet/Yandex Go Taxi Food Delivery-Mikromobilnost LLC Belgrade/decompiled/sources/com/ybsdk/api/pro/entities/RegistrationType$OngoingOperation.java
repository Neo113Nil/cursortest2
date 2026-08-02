package com.ybsdk.api.pro.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/pro/entities/RegistrationType$OngoingOperation", "", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "<init>", "(Ljava/lang/String;I)V", "REGISTRATION", "PRODUCT_OPENING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RegistrationType$OngoingOperation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegistrationType$OngoingOperation[] $VALUES;
    public static final RegistrationType$OngoingOperation REGISTRATION = new RegistrationType$OngoingOperation("REGISTRATION", 0);
    public static final RegistrationType$OngoingOperation PRODUCT_OPENING = new RegistrationType$OngoingOperation("PRODUCT_OPENING", 1);

    private static final /* synthetic */ RegistrationType$OngoingOperation[] $values() {
        return new RegistrationType$OngoingOperation[]{REGISTRATION, PRODUCT_OPENING};
    }

    static {
        RegistrationType$OngoingOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RegistrationType$OngoingOperation(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegistrationType$OngoingOperation valueOf(String str) {
        return (RegistrationType$OngoingOperation) Enum.valueOf(RegistrationType$OngoingOperation.class, str);
    }

    public static RegistrationType$OngoingOperation[] values() {
        return (RegistrationType$OngoingOperation[]) $VALUES.clone();
    }
}
