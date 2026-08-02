package com.yandex.go.promocodes.referral.api.net.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.moi0;
import defpackage.vci0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralService;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "moi0", "TAXI", "GROCERY", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReferralService {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReferralService[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final moi0 Companion;
    public static final ReferralService GROCERY;
    public static final ReferralService TAXI;
    public static final ReferralService UNKNOWN;
    private final String analyticsName;

    static {
        ReferralService referralService = new ReferralService("TAXI", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        TAXI = referralService;
        ReferralService referralService2 = new ReferralService("GROCERY", 1, "grocery");
        GROCERY = referralService2;
        ReferralService referralService3 = new ReferralService("UNKNOWN", 2, "null");
        UNKNOWN = referralService3;
        ReferralService[] referralServiceArr = {referralService, referralService2, referralService3};
        $VALUES = referralServiceArr;
        $ENTRIES = kotlin.enums.a.a(referralServiceArr);
        Companion = new moi0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(5));
    }

    public ReferralService(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ReferralService valueOf(String str) {
        return (ReferralService) Enum.valueOf(ReferralService.class, str);
    }

    public static ReferralService[] values() {
        return (ReferralService[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
