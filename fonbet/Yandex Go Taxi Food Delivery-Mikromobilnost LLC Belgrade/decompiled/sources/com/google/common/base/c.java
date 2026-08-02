package com.google.common.base;

import defpackage.rhw0;
import defpackage.xhw0;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c {
    public static rhw0 a(rhw0 rhw0Var) {
        return ((rhw0Var instanceof xhw0) || (rhw0Var instanceof Suppliers$MemoizingSupplier)) ? rhw0Var : rhw0Var instanceof Serializable ? new Suppliers$MemoizingSupplier(rhw0Var) : new xhw0(rhw0Var);
    }

    public static rhw0 b(Object obj) {
        return new Suppliers$SupplierOfInstance(obj);
    }
}
