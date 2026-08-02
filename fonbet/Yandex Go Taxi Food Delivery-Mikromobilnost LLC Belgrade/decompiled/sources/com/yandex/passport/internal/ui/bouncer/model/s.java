package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes15.dex */
public final class s implements n0 {
    public final r1 a;

    public s(r1 r1Var) {
        this.a = r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(bouncerResult=" + this.a + ')';
    }
}
