package org.msgpack.value;

/* loaded from: classes8.dex */
public enum ValueType {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, false);

    private final boolean numberType;
    private final boolean rawType;

    ValueType(boolean z, boolean z2) {
        this.numberType = z;
        this.rawType = z2;
    }

    public final boolean h() {
        return this.rawType;
    }
}
