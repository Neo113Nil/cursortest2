package com.yandex.div2;

import defpackage.kll;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/div2/DivTrigger$Mode", "", "Lcom/yandex/div2/DivTrigger$Mode;", "", "value", "Ljava/lang/String;", "Converter", "kll", "ON_CONDITION", "ON_VARIABLE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivTrigger$Mode {
    ON_CONDITION("on_condition"),
    ON_VARIABLE("on_variable");

    private final String value;
    public static final kll Converter = new kll();
    public static final tls TO_STRING = DivTrigger$Mode$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivTrigger$Mode$Converter$FROM_STRING$1.w;

    DivTrigger$Mode(String str) {
        this.value = str;
    }
}
