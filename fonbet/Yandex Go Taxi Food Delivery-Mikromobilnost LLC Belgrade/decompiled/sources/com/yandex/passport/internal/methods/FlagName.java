package com.yandex.passport.internal.methods;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/internal/methods/FlagName;", "", "COMPOSE_MANAGING_DEVICES_SCREEN", "PARTIAL_BINDING_SERVICE_IMPL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FlagName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlagName[] $VALUES;
    public static final FlagName COMPOSE_MANAGING_DEVICES_SCREEN;
    public static final FlagName PARTIAL_BINDING_SERVICE_IMPL;

    static {
        FlagName flagName = new FlagName("COMPOSE_MANAGING_DEVICES_SCREEN", 0);
        COMPOSE_MANAGING_DEVICES_SCREEN = flagName;
        FlagName flagName2 = new FlagName("PARTIAL_BINDING_SERVICE_IMPL", 1);
        PARTIAL_BINDING_SERVICE_IMPL = flagName2;
        FlagName[] flagNameArr = {flagName, flagName2};
        $VALUES = flagNameArr;
        $ENTRIES = kotlin.enums.a.a(flagNameArr);
    }

    public static FlagName valueOf(String str) {
        return (FlagName) Enum.valueOf(FlagName.class, str);
    }

    public static FlagName[] values() {
        return (FlagName[]) $VALUES.clone();
    }
}
