package com.ybsdk.feature.dashboard.internal.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/domain/entities/NextPageLoadingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "FINISH", "ERROR", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NextPageLoadingStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NextPageLoadingStatus[] $VALUES;
    public static final NextPageLoadingStatus IN_PROGRESS = new NextPageLoadingStatus("IN_PROGRESS", 0);
    public static final NextPageLoadingStatus FINISH = new NextPageLoadingStatus("FINISH", 1);
    public static final NextPageLoadingStatus ERROR = new NextPageLoadingStatus("ERROR", 2);

    private static final /* synthetic */ NextPageLoadingStatus[] $values() {
        return new NextPageLoadingStatus[]{IN_PROGRESS, FINISH, ERROR};
    }

    static {
        NextPageLoadingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NextPageLoadingStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NextPageLoadingStatus valueOf(String str) {
        return (NextPageLoadingStatus) Enum.valueOf(NextPageLoadingStatus.class, str);
    }

    public static NextPageLoadingStatus[] values() {
        return (NextPageLoadingStatus[]) $VALUES.clone();
    }
}
