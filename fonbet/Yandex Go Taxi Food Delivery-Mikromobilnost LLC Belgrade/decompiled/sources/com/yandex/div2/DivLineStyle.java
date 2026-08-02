package com.yandex.div2;

import defpackage.tls;
import defpackage.tyk;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivLineStyle;", "", "", "value", "Ljava/lang/String;", "Converter", "tyk", JCP.RAW_PREFIX, "SINGLE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE("single");

    private final String value;
    public static final tyk Converter = new tyk();
    public static final tls TO_STRING = DivLineStyle$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivLineStyle$Converter$FROM_STRING$1.w;

    DivLineStyle(String str) {
        this.value = str;
    }
}
