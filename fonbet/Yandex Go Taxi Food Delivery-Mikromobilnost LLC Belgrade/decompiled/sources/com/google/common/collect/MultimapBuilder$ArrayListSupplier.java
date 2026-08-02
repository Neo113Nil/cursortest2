package com.google.common.collect;

import defpackage.rhw0;
import defpackage.y5e;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes11.dex */
final class MultimapBuilder$ArrayListSupplier<V> implements rhw0, Serializable {
    private final int expectedValuesPerKey;

    public MultimapBuilder$ArrayListSupplier() {
        y5e.i(2, "expectedValuesPerKey");
        this.expectedValuesPerKey = 2;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
