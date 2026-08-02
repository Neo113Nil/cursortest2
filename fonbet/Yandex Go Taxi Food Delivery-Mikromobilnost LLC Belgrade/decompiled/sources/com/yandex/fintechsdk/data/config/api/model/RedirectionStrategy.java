package com.yandex.fintechsdk.data.config.api.model;

import defpackage.k4o;
import defpackage.omi0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/data/config/api/model/RedirectionStrategy;", "", "Companion", "omi0", "AM", "NATIVE", "UNKNOWN", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RedirectionStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RedirectionStrategy[] $VALUES;
    public static final RedirectionStrategy AM;
    public static final omi0 Companion;
    public static final RedirectionStrategy NATIVE;
    public static final RedirectionStrategy UNKNOWN;

    static {
        RedirectionStrategy redirectionStrategy = new RedirectionStrategy("AM", 0);
        AM = redirectionStrategy;
        RedirectionStrategy redirectionStrategy2 = new RedirectionStrategy("NATIVE", 1);
        NATIVE = redirectionStrategy2;
        RedirectionStrategy redirectionStrategy3 = new RedirectionStrategy("UNKNOWN", 2);
        UNKNOWN = redirectionStrategy3;
        RedirectionStrategy[] redirectionStrategyArr = {redirectionStrategy, redirectionStrategy2, redirectionStrategy3};
        $VALUES = redirectionStrategyArr;
        $ENTRIES = a.a(redirectionStrategyArr);
        Companion = new omi0();
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static RedirectionStrategy valueOf(String str) {
        return (RedirectionStrategy) Enum.valueOf(RedirectionStrategy.class, str);
    }

    public static RedirectionStrategy[] values() {
        return (RedirectionStrategy[]) $VALUES.clone();
    }
}
