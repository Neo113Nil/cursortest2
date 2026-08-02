package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e implements n0 {
    public final g1 a;

    public e(g1 g1Var) {
        this.a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeFinished(bouncerParameters=" + this.a + ", result=true)";
    }
}
