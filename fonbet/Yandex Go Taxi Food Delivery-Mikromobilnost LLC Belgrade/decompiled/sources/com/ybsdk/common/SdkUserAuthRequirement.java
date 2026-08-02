package com.ybsdk.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/common/SdkUserAuthRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "IS_AUTHORIZED", "HAS_ANY_BANK_SESSION", "IS_NORMAL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SdkUserAuthRequirement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkUserAuthRequirement[] $VALUES;
    public static final SdkUserAuthRequirement IS_AUTHORIZED = new SdkUserAuthRequirement("IS_AUTHORIZED", 0);
    public static final SdkUserAuthRequirement HAS_ANY_BANK_SESSION = new SdkUserAuthRequirement("HAS_ANY_BANK_SESSION", 1);
    public static final SdkUserAuthRequirement IS_NORMAL = new SdkUserAuthRequirement("IS_NORMAL", 2);

    private static final /* synthetic */ SdkUserAuthRequirement[] $values() {
        return new SdkUserAuthRequirement[]{IS_AUTHORIZED, HAS_ANY_BANK_SESSION, IS_NORMAL};
    }

    static {
        SdkUserAuthRequirement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SdkUserAuthRequirement(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SdkUserAuthRequirement valueOf(String str) {
        return (SdkUserAuthRequirement) Enum.valueOf(SdkUserAuthRequirement.class, str);
    }

    public static SdkUserAuthRequirement[] values() {
        return (SdkUserAuthRequirement[]) $VALUES.clone();
    }
}
