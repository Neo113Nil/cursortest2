package com.yandex.div.evaluable;

import xsna.zcl;

/* compiled from: EvaluableType.kt */
/* loaded from: classes7.dex */
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

    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* compiled from: EvaluableType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    EvaluableType(String str) {
        this.typeName = str;
    }

    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeName;
    }
}
