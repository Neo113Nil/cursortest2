package com.yandex.div2;

import defpackage.okl;
import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivTransitionSelector;", "", "", "value", "Ljava/lang/String;", "Converter", "okl", JCP.RAW_PREFIX, "DATA_CHANGE", "STATE_CHANGE", "ANY_CHANGE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");

    private final String value;
    public static final okl Converter = new okl();
    public static final tls TO_STRING = DivTransitionSelector$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivTransitionSelector$Converter$FROM_STRING$1.w;

    DivTransitionSelector(String str) {
        this.value = str;
    }
}
