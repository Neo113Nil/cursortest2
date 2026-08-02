package com.yandex.browser.rtm;

import com.adjust.sdk.AdjustConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/browser/rtm/Environment;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DEVELOPMENT", "TESTING", "PRESTABLE", "PRODUCTION", "PREPRODUCTION", "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Environment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment DEVELOPMENT;
    public static final Environment PREPRODUCTION;
    public static final Environment PRESTABLE;
    public static final Environment PRODUCTION;
    public static final Environment TESTING;
    private final String tag;

    static {
        Environment environment = new Environment("DEVELOPMENT", 0, "development");
        DEVELOPMENT = environment;
        Environment environment2 = new Environment("TESTING", 1, "testing");
        TESTING = environment2;
        Environment environment3 = new Environment("PRESTABLE", 2, "prestable");
        PRESTABLE = environment3;
        Environment environment4 = new Environment("PRODUCTION", 3, AdjustConfig.ENVIRONMENT_PRODUCTION);
        PRODUCTION = environment4;
        Environment environment5 = new Environment("PREPRODUCTION", 4, "pre-production");
        PREPRODUCTION = environment5;
        Environment[] environmentArr = {environment, environment2, environment3, environment4, environment5};
        $VALUES = environmentArr;
        $ENTRIES = a.a(environmentArr);
    }

    public Environment(String str, int i, String str2) {
        this.tag = str2;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
