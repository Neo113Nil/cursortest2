package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class q1 {
    public final boolean a;
    public final com.yandex.passport.sloth.ui.error.d b;

    public q1(boolean z, com.yandex.passport.sloth.ui.error.d dVar) {
        this.a = z;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a == q1Var.a && jl40.l(this.b, q1Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        com.yandex.passport.sloth.ui.error.d dVar = this.b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "State(isInitialUrlLoaded=" + this.a + ", zeroPageState=" + this.b + ')';
    }

    public q1() {
        this(0);
    }

    public /* synthetic */ q1(int i) {
        this(false, com.yandex.passport.sloth.ui.error.d.f);
    }
}
