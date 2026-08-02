package com.ybsdk.network.dto.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodSetStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditPaymentMethodSetStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditPaymentMethodSetStatus[] $VALUES;
    public static final CreditPaymentMethodSetStatus PENDING = new CreditPaymentMethodSetStatus("PENDING", 0);
    public static final CreditPaymentMethodSetStatus REQUIRED_3DS = new CreditPaymentMethodSetStatus("REQUIRED_3DS", 1);
    public static final CreditPaymentMethodSetStatus FINISHED = new CreditPaymentMethodSetStatus(TlsConstants.TLS_FINISHED, 2);
    public static final CreditPaymentMethodSetStatus FAILED = new CreditPaymentMethodSetStatus("FAILED", 3);

    private static final /* synthetic */ CreditPaymentMethodSetStatus[] $values() {
        return new CreditPaymentMethodSetStatus[]{PENDING, REQUIRED_3DS, FINISHED, FAILED};
    }

    static {
        CreditPaymentMethodSetStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CreditPaymentMethodSetStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditPaymentMethodSetStatus valueOf(String str) {
        return (CreditPaymentMethodSetStatus) Enum.valueOf(CreditPaymentMethodSetStatus.class, str);
    }

    public static CreditPaymentMethodSetStatus[] values() {
        return (CreditPaymentMethodSetStatus[]) $VALUES.clone();
    }
}
