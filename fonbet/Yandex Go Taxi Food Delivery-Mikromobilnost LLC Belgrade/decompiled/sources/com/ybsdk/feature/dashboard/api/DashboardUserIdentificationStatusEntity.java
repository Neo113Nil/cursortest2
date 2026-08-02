package com.ybsdk.feature.dashboard.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/dashboard/api/DashboardUserIdentificationStatusEntity;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_REGISTERED", "ANONYMOUS", "IDENTIFIED", "KYC", "KYC_EDS", "feature-dashboard-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardUserIdentificationStatusEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DashboardUserIdentificationStatusEntity[] $VALUES;
    public static final DashboardUserIdentificationStatusEntity NOT_REGISTERED = new DashboardUserIdentificationStatusEntity("NOT_REGISTERED", 0);
    public static final DashboardUserIdentificationStatusEntity ANONYMOUS = new DashboardUserIdentificationStatusEntity("ANONYMOUS", 1);
    public static final DashboardUserIdentificationStatusEntity IDENTIFIED = new DashboardUserIdentificationStatusEntity("IDENTIFIED", 2);
    public static final DashboardUserIdentificationStatusEntity KYC = new DashboardUserIdentificationStatusEntity("KYC", 3);
    public static final DashboardUserIdentificationStatusEntity KYC_EDS = new DashboardUserIdentificationStatusEntity("KYC_EDS", 4);

    private static final /* synthetic */ DashboardUserIdentificationStatusEntity[] $values() {
        return new DashboardUserIdentificationStatusEntity[]{NOT_REGISTERED, ANONYMOUS, IDENTIFIED, KYC, KYC_EDS};
    }

    static {
        DashboardUserIdentificationStatusEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DashboardUserIdentificationStatusEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DashboardUserIdentificationStatusEntity valueOf(String str) {
        return (DashboardUserIdentificationStatusEntity) Enum.valueOf(DashboardUserIdentificationStatusEntity.class, str);
    }

    public static DashboardUserIdentificationStatusEntity[] values() {
        return (DashboardUserIdentificationStatusEntity[]) $VALUES.clone();
    }
}
