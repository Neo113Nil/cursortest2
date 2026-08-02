package com.yandex.div2;

import defpackage.iuk;
import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/div2/DivInput$Autocapitalization", "", "Lcom/yandex/div2/DivInput$Autocapitalization;", "", "value", "Ljava/lang/String;", "Converter", "iuk", "AUTO", JCP.RAW_PREFIX, "WORDS", "SENTENCES", "ALL_CHARACTERS", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivInput$Autocapitalization {
    AUTO("auto"),
    NONE("none"),
    WORDS("words"),
    SENTENCES("sentences"),
    ALL_CHARACTERS("all_characters");

    private final String value;
    public static final iuk Converter = new iuk();
    public static final tls TO_STRING = DivInput$Autocapitalization$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivInput$Autocapitalization$Converter$FROM_STRING$1.w;

    DivInput$Autocapitalization(String str) {
        this.value = str;
    }
}
