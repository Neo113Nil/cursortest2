package com.yandex.passport.user_id.models;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class e {
    public final h a;
    public final boolean b;

    public e(h hVar, boolean z) {
        this.a = hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && this.b == eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserIdState(uiState=");
        sb.append(this.a);
        sb.append(", ready=");
        return unr0.u(sb, this.b, ')');
    }

    public e() {
        this(0);
    }

    public /* synthetic */ e(int i) {
        this(f.a, false);
    }
}
