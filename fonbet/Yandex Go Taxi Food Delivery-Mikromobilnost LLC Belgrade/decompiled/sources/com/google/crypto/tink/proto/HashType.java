package com.google.crypto.tink.proto;

import defpackage.eqw;
import defpackage.gqw;
import defpackage.ny61;
import defpackage.wms;

/* loaded from: classes.dex */
public enum HashType implements eqw {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final gqw internalValueMap = new wms(1);
    private final int value;

    HashType(int i) {
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
