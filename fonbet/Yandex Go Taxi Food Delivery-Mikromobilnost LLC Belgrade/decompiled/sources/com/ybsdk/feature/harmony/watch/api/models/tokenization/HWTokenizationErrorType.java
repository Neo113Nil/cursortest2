package com.ybsdk.feature.harmony.watch.api.models.tokenization;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/harmony/watch/api/models/tokenization/HWTokenizationErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Initialization", "SetupNotComplete", "RejectedByIssuer", "Authentication", "Internal", "DeviceNotSecure", "NotRegistered", "NoData", "InvalidTokenSession", "RequestError", "NoAppCertificate", "InvalidCardData", "CardExpired", "CardNotSupported", "ConflictData", "ProvisionLimit", "NoCardInformation", "Connectivity", "CardIsFrozen", "DeviceViolation", "WipeError", "MetadataError", "Unknown", "feature-harmony-watch-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HWTokenizationErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HWTokenizationErrorType[] $VALUES;
    public static final HWTokenizationErrorType Initialization = new HWTokenizationErrorType("Initialization", 0);
    public static final HWTokenizationErrorType SetupNotComplete = new HWTokenizationErrorType("SetupNotComplete", 1);
    public static final HWTokenizationErrorType RejectedByIssuer = new HWTokenizationErrorType("RejectedByIssuer", 2);
    public static final HWTokenizationErrorType Authentication = new HWTokenizationErrorType("Authentication", 3);
    public static final HWTokenizationErrorType Internal = new HWTokenizationErrorType("Internal", 4);
    public static final HWTokenizationErrorType DeviceNotSecure = new HWTokenizationErrorType("DeviceNotSecure", 5);
    public static final HWTokenizationErrorType NotRegistered = new HWTokenizationErrorType("NotRegistered", 6);
    public static final HWTokenizationErrorType NoData = new HWTokenizationErrorType("NoData", 7);
    public static final HWTokenizationErrorType InvalidTokenSession = new HWTokenizationErrorType("InvalidTokenSession", 8);
    public static final HWTokenizationErrorType RequestError = new HWTokenizationErrorType("RequestError", 9);
    public static final HWTokenizationErrorType NoAppCertificate = new HWTokenizationErrorType("NoAppCertificate", 10);
    public static final HWTokenizationErrorType InvalidCardData = new HWTokenizationErrorType("InvalidCardData", 11);
    public static final HWTokenizationErrorType CardExpired = new HWTokenizationErrorType("CardExpired", 12);
    public static final HWTokenizationErrorType CardNotSupported = new HWTokenizationErrorType("CardNotSupported", 13);
    public static final HWTokenizationErrorType ConflictData = new HWTokenizationErrorType("ConflictData", 14);
    public static final HWTokenizationErrorType ProvisionLimit = new HWTokenizationErrorType("ProvisionLimit", 15);
    public static final HWTokenizationErrorType NoCardInformation = new HWTokenizationErrorType("NoCardInformation", 16);
    public static final HWTokenizationErrorType Connectivity = new HWTokenizationErrorType("Connectivity", 17);
    public static final HWTokenizationErrorType CardIsFrozen = new HWTokenizationErrorType("CardIsFrozen", 18);
    public static final HWTokenizationErrorType DeviceViolation = new HWTokenizationErrorType("DeviceViolation", 19);
    public static final HWTokenizationErrorType WipeError = new HWTokenizationErrorType("WipeError", 20);
    public static final HWTokenizationErrorType MetadataError = new HWTokenizationErrorType("MetadataError", 21);
    public static final HWTokenizationErrorType Unknown = new HWTokenizationErrorType("Unknown", 22);

    private static final /* synthetic */ HWTokenizationErrorType[] $values() {
        return new HWTokenizationErrorType[]{Initialization, SetupNotComplete, RejectedByIssuer, Authentication, Internal, DeviceNotSecure, NotRegistered, NoData, InvalidTokenSession, RequestError, NoAppCertificate, InvalidCardData, CardExpired, CardNotSupported, ConflictData, ProvisionLimit, NoCardInformation, Connectivity, CardIsFrozen, DeviceViolation, WipeError, MetadataError, Unknown};
    }

    static {
        HWTokenizationErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HWTokenizationErrorType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HWTokenizationErrorType valueOf(String str) {
        return (HWTokenizationErrorType) Enum.valueOf(HWTokenizationErrorType.class, str);
    }

    public static HWTokenizationErrorType[] values() {
        return (HWTokenizationErrorType[]) $VALUES.clone();
    }
}
