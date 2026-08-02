package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class i0 implements n0 {
    public final g1 a;

    public i0(g1 g1Var) {
        this.a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && jl40.l(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SortAccounts(bouncerParameters=" + this.a + ')';
    }
}
