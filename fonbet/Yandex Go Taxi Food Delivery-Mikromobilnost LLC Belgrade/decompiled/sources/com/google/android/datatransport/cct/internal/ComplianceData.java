package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import defpackage.u0p;

/* loaded from: classes.dex */
public abstract class ComplianceData {

    /* loaded from: classes10.dex */
    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<ProductIdOrigin> valueMap;
        private final int value;

        static {
            ProductIdOrigin productIdOrigin = NOT_SET;
            ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            SparseArray<ProductIdOrigin> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        ProductIdOrigin(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class a {
    }

    public abstract u0p a();

    public abstract ProductIdOrigin b();
}
