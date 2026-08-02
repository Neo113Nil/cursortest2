package com.ybsdk.di.modules.features;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/di/modules/features/DashboardOrigins;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PayDashboard", "ProDashboard", "SplitDashboard", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DashboardOrigins {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DashboardOrigins[] $VALUES;
    public static final DashboardOrigins PayDashboard;
    public static final DashboardOrigins ProDashboard;
    public static final DashboardOrigins SplitDashboard;
    private final String value;

    static {
        DashboardOrigins dashboardOrigins = new DashboardOrigins("PayDashboard", 0, "pay_dashboard");
        PayDashboard = dashboardOrigins;
        DashboardOrigins dashboardOrigins2 = new DashboardOrigins("ProDashboard", 1, "pro_dashboard");
        ProDashboard = dashboardOrigins2;
        DashboardOrigins dashboardOrigins3 = new DashboardOrigins("SplitDashboard", 2, "split_dashboard");
        SplitDashboard = dashboardOrigins3;
        DashboardOrigins[] dashboardOriginsArr = {dashboardOrigins, dashboardOrigins2, dashboardOrigins3};
        $VALUES = dashboardOriginsArr;
        $ENTRIES = kotlin.enums.a.a(dashboardOriginsArr);
    }

    public DashboardOrigins(String str, int i, String str2) {
        this.value = str2;
    }

    public static DashboardOrigins valueOf(String str) {
        return (DashboardOrigins) Enum.valueOf(DashboardOrigins.class, str);
    }

    public static DashboardOrigins[] values() {
        return (DashboardOrigins[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
