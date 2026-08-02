package com.ybsdk.feature.savings.internal.network.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/PlusSubscriptionStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", Card.ACTIVE, "FROZEN", "UNSUBSCRIBED", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlusSubscriptionStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusSubscriptionStatusDto[] $VALUES;
    public static final PlusSubscriptionStatusDto ACTIVE = new PlusSubscriptionStatusDto(Card.ACTIVE, 0);
    public static final PlusSubscriptionStatusDto FROZEN = new PlusSubscriptionStatusDto("FROZEN", 1);
    public static final PlusSubscriptionStatusDto UNSUBSCRIBED = new PlusSubscriptionStatusDto("UNSUBSCRIBED", 2);

    private static final /* synthetic */ PlusSubscriptionStatusDto[] $values() {
        return new PlusSubscriptionStatusDto[]{ACTIVE, FROZEN, UNSUBSCRIBED};
    }

    static {
        PlusSubscriptionStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PlusSubscriptionStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PlusSubscriptionStatusDto valueOf(String str) {
        return (PlusSubscriptionStatusDto) Enum.valueOf(PlusSubscriptionStatusDto.class, str);
    }

    public static PlusSubscriptionStatusDto[] values() {
        return (PlusSubscriptionStatusDto[]) $VALUES.clone();
    }
}
