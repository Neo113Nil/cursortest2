package com.yandex.div.data;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.flu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/div/data/StoredValue$Type", "", "Lcom/yandex/div/data/StoredValue$Type;", "", "value", "Ljava/lang/String;", "Converter", "flu0", "STRING", BaseDatabaseHelper.TYPE_INTEGER, "BOOLEAN", "NUMBER", "COLOR", "URL", "ARRAY", "DICT", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StoredValue$Type {
    STRING("string"),
    INTEGER("integer"),
    BOOLEAN("boolean"),
    NUMBER("number"),
    COLOR("color"),
    URL("url"),
    ARRAY("array"),
    DICT("dict");

    public static final flu0 Converter = new flu0();
    private final String value;

    StoredValue$Type(String str) {
        this.value = str;
    }
}
