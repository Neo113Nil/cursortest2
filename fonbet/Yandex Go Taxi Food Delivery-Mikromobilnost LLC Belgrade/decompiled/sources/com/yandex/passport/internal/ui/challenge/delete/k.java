package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k implements m {
    public final r a;

    public k(r rVar) {
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && jl40.l(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        r rVar = this.a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "SetDeleteMode(deleteMode=" + this.a + ')';
    }
}
