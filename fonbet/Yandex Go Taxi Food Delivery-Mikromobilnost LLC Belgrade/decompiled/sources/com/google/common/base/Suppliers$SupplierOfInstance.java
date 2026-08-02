package com.google.common.base;

import defpackage.rhw0;
import defpackage.x4e;
import java.io.Serializable;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class Suppliers$SupplierOfInstance<T> implements rhw0, Serializable {
    private static final long serialVersionUID = 0;
    final T instance;

    /* JADX WARN: Multi-variable type inference failed */
    public Suppliers$SupplierOfInstance(Object obj) {
        this.instance = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return Objects.equals(this.instance, ((Suppliers$SupplierOfInstance) obj).instance);
        }
        return false;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        return this.instance;
    }

    public final int hashCode() {
        return Objects.hash(this.instance);
    }

    public final String toString() {
        return x4e.h(new StringBuilder("Suppliers.ofInstance("), this.instance, Extension.C_BRAKE);
    }
}
