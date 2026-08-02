package com.yandex.xplat.xflags;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/xflags/FlagsConfigurationSource;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "global", "experiment", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlagsConfigurationSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlagsConfigurationSource[] $VALUES;
    public static final FlagsConfigurationSource experiment;
    public static final FlagsConfigurationSource global;
    private final String value;

    static {
        FlagsConfigurationSource flagsConfigurationSource = new FlagsConfigurationSource("global", 0, "global");
        global = flagsConfigurationSource;
        FlagsConfigurationSource flagsConfigurationSource2 = new FlagsConfigurationSource("experiment", 1, "experiment");
        experiment = flagsConfigurationSource2;
        FlagsConfigurationSource[] flagsConfigurationSourceArr = {flagsConfigurationSource, flagsConfigurationSource2};
        $VALUES = flagsConfigurationSourceArr;
        $ENTRIES = kotlin.enums.a.a(flagsConfigurationSourceArr);
    }

    public FlagsConfigurationSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static FlagsConfigurationSource valueOf(String str) {
        return (FlagsConfigurationSource) Enum.valueOf(FlagsConfigurationSource.class, str);
    }

    public static FlagsConfigurationSource[] values() {
        return (FlagsConfigurationSource[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
