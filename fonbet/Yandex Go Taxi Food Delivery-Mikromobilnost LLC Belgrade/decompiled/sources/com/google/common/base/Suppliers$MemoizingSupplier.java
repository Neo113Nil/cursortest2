package com.google.common.base;

import defpackage.rhw0;
import defpackage.x4e;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
final class Suppliers$MemoizingSupplier<T> implements rhw0, Serializable {
    private static final long serialVersionUID = 0;
    public transient Object a = new Object();
    public volatile transient boolean b;
    public transient Object c;
    final rhw0 delegate;

    public Suppliers$MemoizingSupplier(rhw0 rhw0Var) {
        this.delegate = rhw0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    @Override // defpackage.rhw0
    public final Object get() {
        if (!this.b) {
            synchronized (this.a) {
                try {
                    if (!this.b) {
                        Object obj = this.delegate.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        return x4e.h(new StringBuilder("Suppliers.memoize("), this.b ? x4e.h(new StringBuilder("<supplier that returned "), this.c, ">") : this.delegate, Extension.C_BRAKE);
    }
}
