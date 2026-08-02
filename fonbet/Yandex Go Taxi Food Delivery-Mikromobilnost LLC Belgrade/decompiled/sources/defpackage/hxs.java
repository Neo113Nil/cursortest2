package defpackage;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;

/* loaded from: classes11.dex */
public interface hxs {
    void a(String str, AnalyticsSourceScreen analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod transferEvents$TransferPaymentInitiatedChosenMethod, String str2, String str3, String str4, String str5, String str6, String str7);

    void b(String str, AnalyticsPaymentStatus analyticsPaymentStatus, AnalyticsSourceScreen analyticsSourceScreen, String str2, String str3, String str4, String str5, String str6, String str7, TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15);
}
