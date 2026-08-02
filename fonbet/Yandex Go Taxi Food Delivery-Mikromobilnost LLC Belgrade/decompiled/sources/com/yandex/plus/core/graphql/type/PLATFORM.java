package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.r490;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/plus/core/graphql/type/PLATFORM;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "r490", "ANDROID", "IOS", "WEB_DESKTOP", "WEB_TOUCH", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PLATFORM {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PLATFORM[] $VALUES;
    public static final PLATFORM ANDROID;
    public static final r490 Companion;
    public static final PLATFORM IOS;
    public static final PLATFORM UNKNOWN__;
    public static final PLATFORM WEB_DESKTOP;
    public static final PLATFORM WEB_TOUCH;
    private static final p4o type;
    private final String rawValue;

    static {
        PLATFORM platform = new PLATFORM("ANDROID", 0, "ANDROID");
        ANDROID = platform;
        PLATFORM platform2 = new PLATFORM("IOS", 1, "IOS");
        IOS = platform2;
        PLATFORM platform3 = new PLATFORM("WEB_DESKTOP", 2, "WEB_DESKTOP");
        WEB_DESKTOP = platform3;
        PLATFORM platform4 = new PLATFORM("WEB_TOUCH", 3, "WEB_TOUCH");
        WEB_TOUCH = platform4;
        PLATFORM platform5 = new PLATFORM("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = platform5;
        PLATFORM[] platformArr = {platform, platform2, platform3, platform4, platform5};
        $VALUES = platformArr;
        $ENTRIES = a.a(platformArr);
        Companion = new r490();
        scc.g("ANDROID", "IOS", "WEB_DESKTOP", "WEB_TOUCH");
        type = new p4o("PLATFORM");
    }

    public PLATFORM(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static PLATFORM valueOf(String str) {
        return (PLATFORM) Enum.valueOf(PLATFORM.class, str);
    }

    public static PLATFORM[] values() {
        return (PLATFORM[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
