package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/xplat/payment/sdk/Acquirer;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "kassa", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Acquirer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Acquirer[] $VALUES;
    public static final Acquirer kassa;
    private final String value = "kassa";

    static {
        Acquirer acquirer = new Acquirer();
        kassa = acquirer;
        Acquirer[] acquirerArr = {acquirer};
        $VALUES = acquirerArr;
        $ENTRIES = a.a(acquirerArr);
    }

    public static Acquirer valueOf(String str) {
        return (Acquirer) Enum.valueOf(Acquirer.class, str);
    }

    public static Acquirer[] values() {
        return (Acquirer[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
