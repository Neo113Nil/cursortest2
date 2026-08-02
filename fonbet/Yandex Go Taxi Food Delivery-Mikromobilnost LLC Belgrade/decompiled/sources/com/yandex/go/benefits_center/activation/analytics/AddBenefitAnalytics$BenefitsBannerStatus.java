package com.yandex.go.benefits_center.activation.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/benefits_center/activation/analytics/AddBenefitAnalytics$BenefitsBannerStatus", "", "Lcom/yandex/go/benefits_center/activation/analytics/AddBenefitAnalytics$BenefitsBannerStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", CA20Status.STATUS_USER_DESCRIPTION_A, "Normal", "Unavailable", CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, CA20Status.STATUS_USER_DESCRIPTION_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddBenefitAnalytics$BenefitsBannerStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddBenefitAnalytics$BenefitsBannerStatus[] $VALUES;
    public static final AddBenefitAnalytics$BenefitsBannerStatus Active;
    public static final AddBenefitAnalytics$BenefitsBannerStatus Expired;
    public static final AddBenefitAnalytics$BenefitsBannerStatus Inactive;
    public static final AddBenefitAnalytics$BenefitsBannerStatus Normal;
    public static final AddBenefitAnalytics$BenefitsBannerStatus Unavailable;
    private final String eventValue;

    static {
        AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus = new AddBenefitAnalytics$BenefitsBannerStatus(CA20Status.STATUS_USER_DESCRIPTION_A, 0, ClidProvider.APP_ACTIVE);
        Active = addBenefitAnalytics$BenefitsBannerStatus;
        AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus2 = new AddBenefitAnalytics$BenefitsBannerStatus("Normal", 1, Constants.NORMAL);
        Normal = addBenefitAnalytics$BenefitsBannerStatus2;
        AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus3 = new AddBenefitAnalytics$BenefitsBannerStatus("Unavailable", 2, "unavailable");
        Unavailable = addBenefitAnalytics$BenefitsBannerStatus3;
        AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus4 = new AddBenefitAnalytics$BenefitsBannerStatus(CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, 3, "expired");
        Expired = addBenefitAnalytics$BenefitsBannerStatus4;
        AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus5 = new AddBenefitAnalytics$BenefitsBannerStatus(CA20Status.STATUS_USER_DESCRIPTION_I, 4, ClidProvider.APP_INACTIVE);
        Inactive = addBenefitAnalytics$BenefitsBannerStatus5;
        AddBenefitAnalytics$BenefitsBannerStatus[] addBenefitAnalytics$BenefitsBannerStatusArr = {addBenefitAnalytics$BenefitsBannerStatus, addBenefitAnalytics$BenefitsBannerStatus2, addBenefitAnalytics$BenefitsBannerStatus3, addBenefitAnalytics$BenefitsBannerStatus4, addBenefitAnalytics$BenefitsBannerStatus5};
        $VALUES = addBenefitAnalytics$BenefitsBannerStatusArr;
        $ENTRIES = a.a(addBenefitAnalytics$BenefitsBannerStatusArr);
    }

    public AddBenefitAnalytics$BenefitsBannerStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AddBenefitAnalytics$BenefitsBannerStatus valueOf(String str) {
        return (AddBenefitAnalytics$BenefitsBannerStatus) Enum.valueOf(AddBenefitAnalytics$BenefitsBannerStatus.class, str);
    }

    public static AddBenefitAnalytics$BenefitsBannerStatus[] values() {
        return (AddBenefitAnalytics$BenefitsBannerStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
