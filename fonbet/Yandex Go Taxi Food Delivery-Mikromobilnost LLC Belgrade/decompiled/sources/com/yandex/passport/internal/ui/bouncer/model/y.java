package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class y implements n0 {
    public final g1 a;

    public y(g1 g1Var) {
        this.a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && jl40.l(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Route(bouncerParameters=" + this.a + ')';
    }
}
