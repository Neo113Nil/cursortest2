package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class y implements z {
    public final h0 a;
    public final boolean b;

    public y(h0 h0Var, boolean z) {
        this.a = h0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && this.b == yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPopupSize(properties=");
        sb.append(this.a);
        sb.append(", animate=");
        return unr0.u(sb, this.b, ')');
    }
}
