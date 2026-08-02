package com.yandex.go.rida.bids.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/rida/bids/state/BidsBoostButtonUiState$BoostStyle", "", "Lcom/yandex/go/rida/bids/state/BidsBoostButtonUiState$BoostStyle;", "DEFAULT", "FORCED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BidsBoostButtonUiState$BoostStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BidsBoostButtonUiState$BoostStyle[] $VALUES;
    public static final BidsBoostButtonUiState$BoostStyle DEFAULT;
    public static final BidsBoostButtonUiState$BoostStyle FORCED;

    static {
        BidsBoostButtonUiState$BoostStyle bidsBoostButtonUiState$BoostStyle = new BidsBoostButtonUiState$BoostStyle("DEFAULT", 0);
        DEFAULT = bidsBoostButtonUiState$BoostStyle;
        BidsBoostButtonUiState$BoostStyle bidsBoostButtonUiState$BoostStyle2 = new BidsBoostButtonUiState$BoostStyle("FORCED", 1);
        FORCED = bidsBoostButtonUiState$BoostStyle2;
        BidsBoostButtonUiState$BoostStyle[] bidsBoostButtonUiState$BoostStyleArr = {bidsBoostButtonUiState$BoostStyle, bidsBoostButtonUiState$BoostStyle2};
        $VALUES = bidsBoostButtonUiState$BoostStyleArr;
        $ENTRIES = a.a(bidsBoostButtonUiState$BoostStyleArr);
    }

    public static BidsBoostButtonUiState$BoostStyle valueOf(String str) {
        return (BidsBoostButtonUiState$BoostStyle) Enum.valueOf(BidsBoostButtonUiState$BoostStyle.class, str);
    }

    public static BidsBoostButtonUiState$BoostStyle[] values() {
        return (BidsBoostButtonUiState$BoostStyle[]) $VALUES.clone();
    }
}
