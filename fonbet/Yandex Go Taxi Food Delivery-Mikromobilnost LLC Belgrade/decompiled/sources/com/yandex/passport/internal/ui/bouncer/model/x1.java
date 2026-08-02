package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class x1 implements c2 {
    public final boolean a;
    public final boolean b;

    public x1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.a == x1Var.a && this.b == x1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(canCancel=");
        sb.append(this.a);
        sb.append(", showBackground=");
        return unr0.u(sb, this.b, ')');
    }
}
