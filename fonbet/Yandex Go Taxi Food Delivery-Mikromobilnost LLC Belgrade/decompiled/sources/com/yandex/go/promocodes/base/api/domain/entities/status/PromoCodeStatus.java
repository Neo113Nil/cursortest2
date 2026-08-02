package com.yandex.go.promocodes.base.api.domain.entities.status;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/api/domain/entities/status/PromoCodeStatus;", "", "VALID", "INVALID", "RESTRICTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoCodeStatus[] $VALUES;
    public static final PromoCodeStatus INVALID;
    public static final PromoCodeStatus RESTRICTED;
    public static final PromoCodeStatus VALID;

    static {
        PromoCodeStatus promoCodeStatus = new PromoCodeStatus("VALID", 0);
        VALID = promoCodeStatus;
        PromoCodeStatus promoCodeStatus2 = new PromoCodeStatus("INVALID", 1);
        INVALID = promoCodeStatus2;
        PromoCodeStatus promoCodeStatus3 = new PromoCodeStatus("RESTRICTED", 2);
        RESTRICTED = promoCodeStatus3;
        PromoCodeStatus[] promoCodeStatusArr = {promoCodeStatus, promoCodeStatus2, promoCodeStatus3};
        $VALUES = promoCodeStatusArr;
        $ENTRIES = a.a(promoCodeStatusArr);
    }

    public static PromoCodeStatus valueOf(String str) {
        return (PromoCodeStatus) Enum.valueOf(PromoCodeStatus.class, str);
    }

    public static PromoCodeStatus[] values() {
        return (PromoCodeStatus[]) $VALUES.clone();
    }
}
