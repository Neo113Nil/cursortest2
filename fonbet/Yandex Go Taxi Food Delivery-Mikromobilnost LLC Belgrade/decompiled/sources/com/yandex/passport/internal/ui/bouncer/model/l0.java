package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class l0 implements n0 {
    public final q1 a;

    public l0(q1 q1Var) {
        this.a = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.a.equals(((l0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerifyResult(bouncerResult=" + this.a + ')';
    }
}
