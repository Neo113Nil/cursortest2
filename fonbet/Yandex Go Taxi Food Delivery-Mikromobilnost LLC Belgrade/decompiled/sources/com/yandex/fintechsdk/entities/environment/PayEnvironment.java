package com.yandex.fintechsdk.entities.environment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "", "TESTING", "SANDBOX", "PRODUCTION", "entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PayEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PayEnvironment[] $VALUES;
    public static final PayEnvironment PRODUCTION;
    public static final PayEnvironment SANDBOX;
    public static final PayEnvironment TESTING;

    static {
        PayEnvironment payEnvironment = new PayEnvironment("TESTING", 0);
        TESTING = payEnvironment;
        PayEnvironment payEnvironment2 = new PayEnvironment("SANDBOX", 1);
        SANDBOX = payEnvironment2;
        PayEnvironment payEnvironment3 = new PayEnvironment("PRODUCTION", 2);
        PRODUCTION = payEnvironment3;
        PayEnvironment[] payEnvironmentArr = {payEnvironment, payEnvironment2, payEnvironment3};
        $VALUES = payEnvironmentArr;
        $ENTRIES = a.a(payEnvironmentArr);
    }

    public static PayEnvironment valueOf(String str) {
        return (PayEnvironment) Enum.valueOf(PayEnvironment.class, str);
    }

    public static PayEnvironment[] values() {
        return (PayEnvironment[]) $VALUES.clone();
    }
}
