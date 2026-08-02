package com.ybsdk.feature.change.payment.method.internal.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/data/DefaultPaymentMethodUnifiedStatusEntity;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "REQUIRED_3DS", TlsConstants.TLS_FINISHED, "FAILED", "CANCEL", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultPaymentMethodUnifiedStatusEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultPaymentMethodUnifiedStatusEntity[] $VALUES;
    public static final DefaultPaymentMethodUnifiedStatusEntity PENDING = new DefaultPaymentMethodUnifiedStatusEntity("PENDING", 0);
    public static final DefaultPaymentMethodUnifiedStatusEntity REQUIRED_3DS = new DefaultPaymentMethodUnifiedStatusEntity("REQUIRED_3DS", 1);
    public static final DefaultPaymentMethodUnifiedStatusEntity FINISHED = new DefaultPaymentMethodUnifiedStatusEntity(TlsConstants.TLS_FINISHED, 2);
    public static final DefaultPaymentMethodUnifiedStatusEntity FAILED = new DefaultPaymentMethodUnifiedStatusEntity("FAILED", 3);
    public static final DefaultPaymentMethodUnifiedStatusEntity CANCEL = new DefaultPaymentMethodUnifiedStatusEntity("CANCEL", 4);

    private static final /* synthetic */ DefaultPaymentMethodUnifiedStatusEntity[] $values() {
        return new DefaultPaymentMethodUnifiedStatusEntity[]{PENDING, REQUIRED_3DS, FINISHED, FAILED, CANCEL};
    }

    static {
        DefaultPaymentMethodUnifiedStatusEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DefaultPaymentMethodUnifiedStatusEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DefaultPaymentMethodUnifiedStatusEntity valueOf(String str) {
        return (DefaultPaymentMethodUnifiedStatusEntity) Enum.valueOf(DefaultPaymentMethodUnifiedStatusEntity.class, str);
    }

    public static DefaultPaymentMethodUnifiedStatusEntity[] values() {
        return (DefaultPaymentMethodUnifiedStatusEntity[]) $VALUES.clone();
    }
}
