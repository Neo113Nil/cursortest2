package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class q implements n0 {
    public final q1 a;

    public q(q1 q1Var) {
        this.a = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a.equals(((q) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FinishRegistration(bouncerResult=" + this.a + ", isRelogin=false)";
    }
}
