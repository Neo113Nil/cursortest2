package com.yandex.div.evaluable;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.kdo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/evaluable/EvaluableType;", "", "", "typeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "kdo", BaseDatabaseHelper.TYPE_INTEGER, "NUMBER", "BOOLEAN", "STRING", "DATETIME", "COLOR", "URL", "DICT", "ARRAY", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME("DateTime"),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");

    public static final kdo Companion = new kdo();
    private final String typeName;

    EvaluableType(String str) {
        this.typeName = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.typeName;
    }
}
