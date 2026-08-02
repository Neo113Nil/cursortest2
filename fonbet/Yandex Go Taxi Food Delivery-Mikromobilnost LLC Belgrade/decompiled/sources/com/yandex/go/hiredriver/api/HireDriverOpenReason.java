package com.yandex.go.hiredriver.api;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/hiredriver/api/HireDriverOpenReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MENU", "DEEPLINK", "go-client-android.features.hiredriver:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HireDriverOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HireDriverOpenReason[] $VALUES;
    public static final HireDriverOpenReason DEEPLINK;
    public static final HireDriverOpenReason MENU;
    private final String analyticsName;

    static {
        HireDriverOpenReason hireDriverOpenReason = new HireDriverOpenReason("MENU", 0, "menu");
        MENU = hireDriverOpenReason;
        HireDriverOpenReason hireDriverOpenReason2 = new HireDriverOpenReason("DEEPLINK", 1, Constants.DEEPLINK);
        DEEPLINK = hireDriverOpenReason2;
        HireDriverOpenReason[] hireDriverOpenReasonArr = {hireDriverOpenReason, hireDriverOpenReason2};
        $VALUES = hireDriverOpenReasonArr;
        $ENTRIES = a.a(hireDriverOpenReasonArr);
    }

    public HireDriverOpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static HireDriverOpenReason valueOf(String str) {
        return (HireDriverOpenReason) Enum.valueOf(HireDriverOpenReason.class, str);
    }

    public static HireDriverOpenReason[] values() {
        return (HireDriverOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
