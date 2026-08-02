package com.ybsdk.feature.card.internal.presentation.carddetails;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/card/internal/presentation/carddetails/CardDetailsViewModel$CardDetailsTooltipAnchorView", "", "Lcom/ybsdk/feature/card/internal/presentation/carddetails/CardDetailsViewModel$CardDetailsTooltipAnchorView;", "<init>", "(Ljava/lang/String;I)V", "CARD_NUMBER", "EXPIRE_DATE", "CVV", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardDetailsViewModel$CardDetailsTooltipAnchorView {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardDetailsViewModel$CardDetailsTooltipAnchorView[] $VALUES;
    public static final CardDetailsViewModel$CardDetailsTooltipAnchorView CARD_NUMBER = new CardDetailsViewModel$CardDetailsTooltipAnchorView("CARD_NUMBER", 0);
    public static final CardDetailsViewModel$CardDetailsTooltipAnchorView EXPIRE_DATE = new CardDetailsViewModel$CardDetailsTooltipAnchorView("EXPIRE_DATE", 1);
    public static final CardDetailsViewModel$CardDetailsTooltipAnchorView CVV = new CardDetailsViewModel$CardDetailsTooltipAnchorView("CVV", 2);

    private static final /* synthetic */ CardDetailsViewModel$CardDetailsTooltipAnchorView[] $values() {
        return new CardDetailsViewModel$CardDetailsTooltipAnchorView[]{CARD_NUMBER, EXPIRE_DATE, CVV};
    }

    static {
        CardDetailsViewModel$CardDetailsTooltipAnchorView[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardDetailsViewModel$CardDetailsTooltipAnchorView(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardDetailsViewModel$CardDetailsTooltipAnchorView valueOf(String str) {
        return (CardDetailsViewModel$CardDetailsTooltipAnchorView) Enum.valueOf(CardDetailsViewModel$CardDetailsTooltipAnchorView.class, str);
    }

    public static CardDetailsViewModel$CardDetailsTooltipAnchorView[] values() {
        return (CardDetailsViewModel$CardDetailsTooltipAnchorView[]) $VALUES.clone();
    }
}
