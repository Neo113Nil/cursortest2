package com.yandex.div2;

import defpackage.fil;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/div2/DivTooltip$Position", "", "Lcom/yandex/div2/DivTooltip$Position;", "", "value", "Ljava/lang/String;", "Converter", "fil", "LEFT", "TOP_LEFT", "TOP", "TOP_RIGHT", "RIGHT", "BOTTOM_RIGHT", "BOTTOM", "BOTTOM_LEFT", "CENTER", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivTooltip$Position {
    LEFT("left"),
    TOP_LEFT("top-left"),
    TOP("top"),
    TOP_RIGHT("top-right"),
    RIGHT("right"),
    BOTTOM_RIGHT("bottom-right"),
    BOTTOM("bottom"),
    BOTTOM_LEFT("bottom-left"),
    CENTER("center");

    private final String value;
    public static final fil Converter = new fil();
    public static final tls TO_STRING = DivTooltip$Position$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivTooltip$Position$Converter$FROM_STRING$1.w;

    DivTooltip$Position(String str) {
        this.value = str;
    }
}
