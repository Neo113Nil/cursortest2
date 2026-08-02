package com.yandex.mob.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/mob/domain/InitialUseCase$Result", "", "Lcom/yandex/mob/domain/InitialUseCase$Result;", "FirstLaunch", "ExistingUser", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InitialUseCase$Result {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InitialUseCase$Result[] $VALUES;
    public static final InitialUseCase$Result ExistingUser;
    public static final InitialUseCase$Result FirstLaunch;

    static {
        InitialUseCase$Result initialUseCase$Result = new InitialUseCase$Result("FirstLaunch", 0);
        FirstLaunch = initialUseCase$Result;
        InitialUseCase$Result initialUseCase$Result2 = new InitialUseCase$Result("ExistingUser", 1);
        ExistingUser = initialUseCase$Result2;
        InitialUseCase$Result[] initialUseCase$ResultArr = {initialUseCase$Result, initialUseCase$Result2};
        $VALUES = initialUseCase$ResultArr;
        $ENTRIES = kotlin.enums.a.a(initialUseCase$ResultArr);
    }

    public static InitialUseCase$Result valueOf(String str) {
        return (InitialUseCase$Result) Enum.valueOf(InitialUseCase$Result.class, str);
    }

    public static InitialUseCase$Result[] values() {
        return (InitialUseCase$Result[]) $VALUES.clone();
    }
}
