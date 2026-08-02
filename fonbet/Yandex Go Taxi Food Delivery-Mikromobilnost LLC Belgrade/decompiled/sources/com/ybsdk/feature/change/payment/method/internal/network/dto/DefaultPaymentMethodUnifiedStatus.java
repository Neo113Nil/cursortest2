package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultPaymentMethodUnifiedStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultPaymentMethodUnifiedStatus[] $VALUES;

    @Json(name = "PENDING")
    public static final DefaultPaymentMethodUnifiedStatus PENDING = new DefaultPaymentMethodUnifiedStatus("PENDING", 0);

    @Json(name = "REQUIRED_3DS")
    public static final DefaultPaymentMethodUnifiedStatus REQUIRED_3DS = new DefaultPaymentMethodUnifiedStatus("REQUIRED_3DS", 1);

    @Json(name = TlsConstants.TLS_FINISHED)
    public static final DefaultPaymentMethodUnifiedStatus FINISHED = new DefaultPaymentMethodUnifiedStatus(TlsConstants.TLS_FINISHED, 2);

    @Json(name = "FAILED")
    public static final DefaultPaymentMethodUnifiedStatus FAILED = new DefaultPaymentMethodUnifiedStatus("FAILED", 3);

    private static final /* synthetic */ DefaultPaymentMethodUnifiedStatus[] $values() {
        return new DefaultPaymentMethodUnifiedStatus[]{PENDING, REQUIRED_3DS, FINISHED, FAILED};
    }

    static {
        DefaultPaymentMethodUnifiedStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DefaultPaymentMethodUnifiedStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DefaultPaymentMethodUnifiedStatus valueOf(String str) {
        return (DefaultPaymentMethodUnifiedStatus) Enum.valueOf(DefaultPaymentMethodUnifiedStatus.class, str);
    }

    public static DefaultPaymentMethodUnifiedStatus[] values() {
        return (DefaultPaymentMethodUnifiedStatus[]) $VALUES.clone();
    }
}
