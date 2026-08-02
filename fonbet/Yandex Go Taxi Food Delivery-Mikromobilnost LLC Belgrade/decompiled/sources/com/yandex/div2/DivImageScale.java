package com.yandex.div2;

import defpackage.stk;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivImageScale;", "", "", "value", "Ljava/lang/String;", "Converter", "stk", "FILL", "NO_SCALE", "FIT", "STRETCH", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivImageScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");

    private final String value;
    public static final stk Converter = new stk();
    public static final tls TO_STRING = DivImageScale$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivImageScale$Converter$FROM_STRING$1.w;

    DivImageScale(String str) {
        this.value = str;
    }
}
