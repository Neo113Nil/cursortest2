package com.google.crypto.tink.proto;

import defpackage.eqw;
import defpackage.gqw;
import defpackage.ny61;
import defpackage.wms;

/* loaded from: classes.dex */
public enum OutputPrefixType implements eqw {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final gqw internalValueMap = new wms(5);
    private final int value;

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ny61.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
