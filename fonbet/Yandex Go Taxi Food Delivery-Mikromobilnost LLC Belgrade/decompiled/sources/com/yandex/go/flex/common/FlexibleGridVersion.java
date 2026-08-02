package com.yandex.go.flex.common;

import defpackage.k4o;
import defpackage.pnr;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/flex/common/FlexibleGridVersion;", "", "", "rawValue", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Companion", "pnr", "LEGACY", "V2", "V3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlexibleGridVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlexibleGridVersion[] $VALUES;
    public static final pnr Companion;
    private static final FlexibleGridVersion DEFAULT;
    public static final FlexibleGridVersion LEGACY;
    public static final FlexibleGridVersion V2;
    public static final FlexibleGridVersion V3;
    private final String rawValue;

    static {
        FlexibleGridVersion flexibleGridVersion = new FlexibleGridVersion("LEGACY", 0, "legacy");
        LEGACY = flexibleGridVersion;
        FlexibleGridVersion flexibleGridVersion2 = new FlexibleGridVersion("V2", 1, "v2");
        V2 = flexibleGridVersion2;
        FlexibleGridVersion flexibleGridVersion3 = new FlexibleGridVersion("V3", 2, "v3");
        V3 = flexibleGridVersion3;
        FlexibleGridVersion[] flexibleGridVersionArr = {flexibleGridVersion, flexibleGridVersion2, flexibleGridVersion3};
        $VALUES = flexibleGridVersionArr;
        $ENTRIES = kotlin.enums.a.a(flexibleGridVersionArr);
        Companion = new pnr();
        DEFAULT = flexibleGridVersion;
    }

    public FlexibleGridVersion(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static FlexibleGridVersion valueOf(String str) {
        return (FlexibleGridVersion) Enum.valueOf(FlexibleGridVersion.class, str);
    }

    public static FlexibleGridVersion[] values() {
        return (FlexibleGridVersion[]) $VALUES.clone();
    }

    /* renamed from: c, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
