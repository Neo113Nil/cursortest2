package com.yandex.fintechsdk.entities.environment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/fintechsdk/entities/environment/DefaultEnvironment;", "", "TESTING", "PRODUCTION", "entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultEnvironment[] $VALUES;
    public static final DefaultEnvironment PRODUCTION;
    public static final DefaultEnvironment TESTING;

    static {
        DefaultEnvironment defaultEnvironment = new DefaultEnvironment("TESTING", 0);
        TESTING = defaultEnvironment;
        DefaultEnvironment defaultEnvironment2 = new DefaultEnvironment("PRODUCTION", 1);
        PRODUCTION = defaultEnvironment2;
        DefaultEnvironment[] defaultEnvironmentArr = {defaultEnvironment, defaultEnvironment2};
        $VALUES = defaultEnvironmentArr;
        $ENTRIES = a.a(defaultEnvironmentArr);
    }

    public static DefaultEnvironment valueOf(String str) {
        return (DefaultEnvironment) Enum.valueOf(DefaultEnvironment.class, str);
    }

    public static DefaultEnvironment[] values() {
        return (DefaultEnvironment[]) $VALUES.clone();
    }
}
