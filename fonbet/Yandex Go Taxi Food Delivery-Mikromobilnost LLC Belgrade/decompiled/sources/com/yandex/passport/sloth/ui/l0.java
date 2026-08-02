package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class l0 implements m0 {
    public final com.yandex.passport.sloth.ui.error.d a;

    public l0(com.yandex.passport.sloth.ui.error.d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && jl40.l(this.a, ((l0) obj).a);
    }

    public final int hashCode() {
        com.yandex.passport.sloth.ui.error.d dVar = this.a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "SetZeroPageState(state=" + this.a + ')';
    }
}
