package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeUiState$ButtonStatus", "", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeUiState$ButtonStatus;", "", BackendConfig.Restrictions.ENABLED, "Z", "a", "()Z", ResultType.RESULT_TYPE_LOADING, "b", "ENABLED", "LOADING", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsAddPromoCodeUiState$ButtonStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsAddPromoCodeUiState$ButtonStatus[] $VALUES;
    public static final DiscountsAddPromoCodeUiState$ButtonStatus DISABLED;
    public static final DiscountsAddPromoCodeUiState$ButtonStatus ENABLED;
    public static final DiscountsAddPromoCodeUiState$ButtonStatus LOADING;
    private final boolean enabled;
    private final boolean loading;

    static {
        DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus = new DiscountsAddPromoCodeUiState$ButtonStatus("ENABLED", 0, true, false);
        ENABLED = discountsAddPromoCodeUiState$ButtonStatus;
        DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus2 = new DiscountsAddPromoCodeUiState$ButtonStatus("LOADING", 1, false, true);
        LOADING = discountsAddPromoCodeUiState$ButtonStatus2;
        DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus3 = new DiscountsAddPromoCodeUiState$ButtonStatus("DISABLED", 2, false, false);
        DISABLED = discountsAddPromoCodeUiState$ButtonStatus3;
        DiscountsAddPromoCodeUiState$ButtonStatus[] discountsAddPromoCodeUiState$ButtonStatusArr = {discountsAddPromoCodeUiState$ButtonStatus, discountsAddPromoCodeUiState$ButtonStatus2, discountsAddPromoCodeUiState$ButtonStatus3};
        $VALUES = discountsAddPromoCodeUiState$ButtonStatusArr;
        $ENTRIES = kotlin.enums.a.a(discountsAddPromoCodeUiState$ButtonStatusArr);
    }

    public DiscountsAddPromoCodeUiState$ButtonStatus(String str, int i, boolean z, boolean z2) {
        this.enabled = z;
        this.loading = z2;
    }

    public static DiscountsAddPromoCodeUiState$ButtonStatus valueOf(String str) {
        return (DiscountsAddPromoCodeUiState$ButtonStatus) Enum.valueOf(DiscountsAddPromoCodeUiState$ButtonStatus.class, str);
    }

    public static DiscountsAddPromoCodeUiState$ButtonStatus[] values() {
        return (DiscountsAddPromoCodeUiState$ButtonStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }
}
