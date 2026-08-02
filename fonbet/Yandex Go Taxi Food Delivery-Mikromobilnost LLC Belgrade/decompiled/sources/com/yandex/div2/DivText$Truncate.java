package com.yandex.div2;

import defpackage.efl;
import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/div2/DivText$Truncate", "", "Lcom/yandex/div2/DivText$Truncate;", "", "value", "Ljava/lang/String;", "Converter", "efl", JCP.RAW_PREFIX, "START", "END", "MIDDLE", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DivText$Truncate {
    NONE("none"),
    START("start"),
    END("end"),
    MIDDLE("middle");

    private final String value;
    public static final efl Converter = new efl();
    public static final tls TO_STRING = DivText$Truncate$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivText$Truncate$Converter$FROM_STRING$1.w;

    DivText$Truncate(String str) {
        this.value = str;
    }
}
