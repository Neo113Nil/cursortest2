package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static Optional a() {
        return Absent.a;
    }

    public static Optional f(Object obj) {
        return new Present(obj);
    }

    public abstract Object b();

    public abstract boolean c();
}
