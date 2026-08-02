package com.yandex.div2;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.tls;
import defpackage.yok;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div2/DivEvaluableType;", "", "", "value", "Ljava/lang/String;", "Converter", "yok", "STRING", BaseDatabaseHelper.TYPE_INTEGER, "NUMBER", "BOOLEAN", "DATETIME", "COLOR", "URL", "DICT", "ARRAY", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivEvaluableType {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");

    private final String value;
    public static final yok Converter = new yok();
    public static final tls TO_STRING = DivEvaluableType$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivEvaluableType$Converter$FROM_STRING$1.w;

    DivEvaluableType(String str) {
        this.value = str;
    }
}
