package com.yandex.plus.adapter.auth.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/adapter/auth/api/PlusAuthAdapter$Environment", "", "Lcom/yandex/plus/adapter/auth/api/PlusAuthAdapter$Environment;", "TESTING", "PRODUCTION", "plus-adapter-auth-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusAuthAdapter$Environment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusAuthAdapter$Environment[] $VALUES;
    public static final PlusAuthAdapter$Environment PRODUCTION;
    public static final PlusAuthAdapter$Environment TESTING;

    static {
        PlusAuthAdapter$Environment plusAuthAdapter$Environment = new PlusAuthAdapter$Environment("TESTING", 0);
        TESTING = plusAuthAdapter$Environment;
        PlusAuthAdapter$Environment plusAuthAdapter$Environment2 = new PlusAuthAdapter$Environment("PRODUCTION", 1);
        PRODUCTION = plusAuthAdapter$Environment2;
        PlusAuthAdapter$Environment[] plusAuthAdapter$EnvironmentArr = {plusAuthAdapter$Environment, plusAuthAdapter$Environment2};
        $VALUES = plusAuthAdapter$EnvironmentArr;
        $ENTRIES = a.a(plusAuthAdapter$EnvironmentArr);
    }

    public static PlusAuthAdapter$Environment valueOf(String str) {
        return (PlusAuthAdapter$Environment) Enum.valueOf(PlusAuthAdapter$Environment.class, str);
    }

    public static PlusAuthAdapter$Environment[] values() {
        return (PlusAuthAdapter$Environment[]) $VALUES.clone();
    }
}
