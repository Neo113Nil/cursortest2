package com.ybsdk.common.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/common/entities/UserIdentificationStatusEntity;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_REGISTERED", "ANONYMOUS", "IDENTIFIED", "KYC", "KYC_EDS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserIdentificationStatusEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserIdentificationStatusEntity[] $VALUES;
    public static final UserIdentificationStatusEntity NOT_REGISTERED = new UserIdentificationStatusEntity("NOT_REGISTERED", 0);
    public static final UserIdentificationStatusEntity ANONYMOUS = new UserIdentificationStatusEntity("ANONYMOUS", 1);
    public static final UserIdentificationStatusEntity IDENTIFIED = new UserIdentificationStatusEntity("IDENTIFIED", 2);
    public static final UserIdentificationStatusEntity KYC = new UserIdentificationStatusEntity("KYC", 3);
    public static final UserIdentificationStatusEntity KYC_EDS = new UserIdentificationStatusEntity("KYC_EDS", 4);

    private static final /* synthetic */ UserIdentificationStatusEntity[] $values() {
        return new UserIdentificationStatusEntity[]{NOT_REGISTERED, ANONYMOUS, IDENTIFIED, KYC, KYC_EDS};
    }

    static {
        UserIdentificationStatusEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserIdentificationStatusEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static UserIdentificationStatusEntity valueOf(String str) {
        return (UserIdentificationStatusEntity) Enum.valueOf(UserIdentificationStatusEntity.class, str);
    }

    public static UserIdentificationStatusEntity[] values() {
        return (UserIdentificationStatusEntity[]) $VALUES.clone();
    }
}
