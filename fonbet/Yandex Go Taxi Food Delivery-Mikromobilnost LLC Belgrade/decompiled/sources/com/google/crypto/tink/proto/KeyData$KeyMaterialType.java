package com.google.crypto.tink.proto;

import defpackage.eqw;
import defpackage.gqw;
import defpackage.ny61;
import defpackage.vms;

/* loaded from: classes.dex */
public enum KeyData$KeyMaterialType implements eqw {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final gqw internalValueMap = new vms(3);
    private final int value;

    KeyData$KeyMaterialType(int i) {
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
