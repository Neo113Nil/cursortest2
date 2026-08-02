package com.yandex.div2;

import defpackage.r1l;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/div2/DivPager$ItemAlignment", "", "Lcom/yandex/div2/DivPager$ItemAlignment;", "", "value", "Ljava/lang/String;", "Converter", "r1l", "START", "CENTER", "END", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivPager$ItemAlignment {
    START("start"),
    CENTER("center"),
    END("end");

    private final String value;
    public static final r1l Converter = new r1l();
    public static final tls TO_STRING = DivPager$ItemAlignment$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivPager$ItemAlignment$Converter$FROM_STRING$1.w;

    DivPager$ItemAlignment(String str) {
        this.value = str;
    }
}
