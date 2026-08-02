package com.yandex.div2;

import com.adjust.sdk.Constants;
import defpackage.qdk;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivAnimationDirection;", "", "", "value", "Ljava/lang/String;", "Converter", "qdk", "NORMAL", "REVERSE", "ALTERNATE", "ALTERNATE_REVERSE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivAnimationDirection {
    NORMAL(Constants.NORMAL),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");

    private final String value;
    public static final qdk Converter = new qdk();
    public static final tls TO_STRING = DivAnimationDirection$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivAnimationDirection$Converter$FROM_STRING$1.w;

    DivAnimationDirection(String str) {
        this.value = str;
    }
}
