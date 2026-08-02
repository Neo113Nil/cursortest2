package com.yandex.go.promocodes.base.impl.discounts.domain.analytics;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/analytics/PromoState;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", Card.ACTIVE, "RESTRICTION", "INVALID", "NO_ACTIVE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoState[] $VALUES;
    public static final PromoState ACTIVE;
    public static final PromoState INVALID;
    public static final PromoState NO_ACTIVE;
    public static final PromoState RESTRICTION;
    private final String value;

    static {
        PromoState promoState = new PromoState(Card.ACTIVE, 0, ClidProvider.APP_ACTIVE);
        ACTIVE = promoState;
        PromoState promoState2 = new PromoState("RESTRICTION", 1, "restriction");
        RESTRICTION = promoState2;
        PromoState promoState3 = new PromoState("INVALID", 2, "invalid");
        INVALID = promoState3;
        PromoState promoState4 = new PromoState("NO_ACTIVE", 3, "no_active");
        NO_ACTIVE = promoState4;
        PromoState[] promoStateArr = {promoState, promoState2, promoState3, promoState4};
        $VALUES = promoStateArr;
        $ENTRIES = a.a(promoStateArr);
    }

    public PromoState(String str, int i, String str2) {
        this.value = str2;
    }

    public static PromoState valueOf(String str) {
        return (PromoState) Enum.valueOf(PromoState.class, str);
    }

    public static PromoState[] values() {
        return (PromoState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
