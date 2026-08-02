package com.yandex.go.superapp.impl.signals;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ktm;
import defpackage.zfn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/superapp/impl/signals/EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment", "", "Lcom/yandex/go/superapp/impl/signals/EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment;", "Companion", "zfn", "EATS_SDK", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zfn Companion;
    public static final EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment DEFAULT;
    public static final EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment EATS_SDK;

    static {
        EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment = new EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment("EATS_SDK", 0);
        EATS_SDK = eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment;
        EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment2 = new EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment("DEFAULT", 1);
        DEFAULT = eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment2;
        EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment[] eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironmentArr = {eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment, eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment2};
        $VALUES = eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(eatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironmentArr);
        Companion = new zfn();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(28));
    }

    public static EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment valueOf(String str) {
        return (EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment) Enum.valueOf(EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment.class, str);
    }

    public static EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment[] values() {
        return (EatsSdkLaunchEnvironmentSignalFactory$LaunchEnvironment[]) $VALUES.clone();
    }
}
