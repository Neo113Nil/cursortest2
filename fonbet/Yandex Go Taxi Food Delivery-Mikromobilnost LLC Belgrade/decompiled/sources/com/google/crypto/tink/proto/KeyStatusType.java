package com.google.crypto.tink.proto;

import defpackage.eqw;
import defpackage.gqw;
import defpackage.ny61;
import defpackage.wms;

/* loaded from: classes.dex */
public enum KeyStatusType implements eqw {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final gqw internalValueMap = new wms(3);
    private final int value;

    KeyStatusType(int i) {
        this.value = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ny61.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
