package com.ybsdk.feature.rebind.payment.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/rebind/payment/api/RebindPaymentMethodStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "feature-rebind-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RebindPaymentMethodStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RebindPaymentMethodStatusDto[] $VALUES;
    public static final RebindPaymentMethodStatusDto PENDING = new RebindPaymentMethodStatusDto("PENDING", 0);
    public static final RebindPaymentMethodStatusDto REQUIRED_3DS = new RebindPaymentMethodStatusDto("REQUIRED_3DS", 1);
    public static final RebindPaymentMethodStatusDto FINISHED = new RebindPaymentMethodStatusDto(TlsConstants.TLS_FINISHED, 2);
    public static final RebindPaymentMethodStatusDto FAILED = new RebindPaymentMethodStatusDto("FAILED", 3);

    private static final /* synthetic */ RebindPaymentMethodStatusDto[] $values() {
        return new RebindPaymentMethodStatusDto[]{PENDING, REQUIRED_3DS, FINISHED, FAILED};
    }

    static {
        RebindPaymentMethodStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RebindPaymentMethodStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RebindPaymentMethodStatusDto valueOf(String str) {
        return (RebindPaymentMethodStatusDto) Enum.valueOf(RebindPaymentMethodStatusDto.class, str);
    }

    public static RebindPaymentMethodStatusDto[] values() {
        return (RebindPaymentMethodStatusDto[]) $VALUES.clone();
    }
}
