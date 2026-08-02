package com.yandex.passport.internal.entities;

import defpackage.jxi;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/entities/ConfirmMethod;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BY_CALL", "BY_FLASH_CALL", "BY_SMS", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConfirmMethod[] $VALUES;

    @jxi
    public static final ConfirmMethod BY_CALL;
    public static final ConfirmMethod BY_FLASH_CALL;
    public static final ConfirmMethod BY_SMS;
    private final String value;

    static {
        ConfirmMethod confirmMethod = new ConfirmMethod("BY_CALL", 0, "by_call");
        BY_CALL = confirmMethod;
        ConfirmMethod confirmMethod2 = new ConfirmMethod("BY_FLASH_CALL", 1, "by_flash_call");
        BY_FLASH_CALL = confirmMethod2;
        ConfirmMethod confirmMethod3 = new ConfirmMethod("BY_SMS", 2, "by_sms");
        BY_SMS = confirmMethod3;
        ConfirmMethod[] confirmMethodArr = {confirmMethod, confirmMethod2, confirmMethod3};
        $VALUES = confirmMethodArr;
        $ENTRIES = kotlin.enums.a.a(confirmMethodArr);
    }

    public ConfirmMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static ConfirmMethod valueOf(String str) {
        return (ConfirmMethod) Enum.valueOf(ConfirmMethod.class, str);
    }

    public static ConfirmMethod[] values() {
        return (ConfirmMethod[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
