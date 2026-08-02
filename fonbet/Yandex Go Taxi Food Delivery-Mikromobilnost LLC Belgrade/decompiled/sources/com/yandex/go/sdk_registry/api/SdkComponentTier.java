package com.yandex.go.sdk_registry.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/sdk_registry/api/SdkComponentTier;", "", "", "priority", CA20Status.STATUS_USER_I, "a", "()I", "TIER_1", "TIER_2", "TIER_3", "TIER_4", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkComponentTier {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkComponentTier[] $VALUES;
    public static final SdkComponentTier TIER_1;
    public static final SdkComponentTier TIER_2;
    public static final SdkComponentTier TIER_3;
    public static final SdkComponentTier TIER_4;
    private final int priority;

    static {
        SdkComponentTier sdkComponentTier = new SdkComponentTier("TIER_1", 0, 1);
        TIER_1 = sdkComponentTier;
        SdkComponentTier sdkComponentTier2 = new SdkComponentTier("TIER_2", 1, 2);
        TIER_2 = sdkComponentTier2;
        SdkComponentTier sdkComponentTier3 = new SdkComponentTier("TIER_3", 2, 3);
        TIER_3 = sdkComponentTier3;
        SdkComponentTier sdkComponentTier4 = new SdkComponentTier("TIER_4", 3, 4);
        TIER_4 = sdkComponentTier4;
        SdkComponentTier[] sdkComponentTierArr = {sdkComponentTier, sdkComponentTier2, sdkComponentTier3, sdkComponentTier4};
        $VALUES = sdkComponentTierArr;
        $ENTRIES = a.a(sdkComponentTierArr);
    }

    public SdkComponentTier(String str, int i, int i2) {
        this.priority = i2;
    }

    public static SdkComponentTier valueOf(String str) {
        return (SdkComponentTier) Enum.valueOf(SdkComponentTier.class, str);
    }

    public static SdkComponentTier[] values() {
        return (SdkComponentTier[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }
}
