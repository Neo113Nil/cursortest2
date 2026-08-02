package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/card/internal/presentation/singlecard/SingleCardViewModel$SingleCardDetailsTooltipAnchorView", "", "Lcom/ybsdk/feature/card/internal/presentation/singlecard/SingleCardViewModel$SingleCardDetailsTooltipAnchorView;", "<init>", "(Ljava/lang/String;I)V", "CARD_NUMBER", "EXPIRE_DATE", "CVV", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCardViewModel$SingleCardDetailsTooltipAnchorView {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SingleCardViewModel$SingleCardDetailsTooltipAnchorView[] $VALUES;
    public static final SingleCardViewModel$SingleCardDetailsTooltipAnchorView CARD_NUMBER = new SingleCardViewModel$SingleCardDetailsTooltipAnchorView("CARD_NUMBER", 0);
    public static final SingleCardViewModel$SingleCardDetailsTooltipAnchorView EXPIRE_DATE = new SingleCardViewModel$SingleCardDetailsTooltipAnchorView("EXPIRE_DATE", 1);
    public static final SingleCardViewModel$SingleCardDetailsTooltipAnchorView CVV = new SingleCardViewModel$SingleCardDetailsTooltipAnchorView("CVV", 2);

    private static final /* synthetic */ SingleCardViewModel$SingleCardDetailsTooltipAnchorView[] $values() {
        return new SingleCardViewModel$SingleCardDetailsTooltipAnchorView[]{CARD_NUMBER, EXPIRE_DATE, CVV};
    }

    static {
        SingleCardViewModel$SingleCardDetailsTooltipAnchorView[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SingleCardViewModel$SingleCardDetailsTooltipAnchorView(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SingleCardViewModel$SingleCardDetailsTooltipAnchorView valueOf(String str) {
        return (SingleCardViewModel$SingleCardDetailsTooltipAnchorView) Enum.valueOf(SingleCardViewModel$SingleCardDetailsTooltipAnchorView.class, str);
    }

    public static SingleCardViewModel$SingleCardDetailsTooltipAnchorView[] values() {
        return (SingleCardViewModel$SingleCardDetailsTooltipAnchorView[]) $VALUES.clone();
    }
}
