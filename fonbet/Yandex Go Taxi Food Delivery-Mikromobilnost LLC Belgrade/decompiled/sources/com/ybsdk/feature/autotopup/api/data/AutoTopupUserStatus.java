package com.ybsdk.feature.autotopup.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/data/AutoTopupUserStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_REGISTERED", "ANONYMOUS", "IDENTIFIED", "KYC", "KYC_EDS", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupUserStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupUserStatus[] $VALUES;
    public static final AutoTopupUserStatus NOT_REGISTERED = new AutoTopupUserStatus("NOT_REGISTERED", 0);
    public static final AutoTopupUserStatus ANONYMOUS = new AutoTopupUserStatus("ANONYMOUS", 1);
    public static final AutoTopupUserStatus IDENTIFIED = new AutoTopupUserStatus("IDENTIFIED", 2);
    public static final AutoTopupUserStatus KYC = new AutoTopupUserStatus("KYC", 3);
    public static final AutoTopupUserStatus KYC_EDS = new AutoTopupUserStatus("KYC_EDS", 4);

    private static final /* synthetic */ AutoTopupUserStatus[] $values() {
        return new AutoTopupUserStatus[]{NOT_REGISTERED, ANONYMOUS, IDENTIFIED, KYC, KYC_EDS};
    }

    static {
        AutoTopupUserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupUserStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupUserStatus valueOf(String str) {
        return (AutoTopupUserStatus) Enum.valueOf(AutoTopupUserStatus.class, str);
    }

    public static AutoTopupUserStatus[] values() {
        return (AutoTopupUserStatus[]) $VALUES.clone();
    }
}
