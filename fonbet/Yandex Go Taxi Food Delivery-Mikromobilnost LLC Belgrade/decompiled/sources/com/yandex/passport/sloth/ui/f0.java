package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class f0 implements h0 {
    public final com.yandex.passport.sloth.u a;

    public f0(com.yandex.passport.sloth.u uVar) {
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && jl40.l(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSlothEvent(event=" + this.a + ')';
    }
}
