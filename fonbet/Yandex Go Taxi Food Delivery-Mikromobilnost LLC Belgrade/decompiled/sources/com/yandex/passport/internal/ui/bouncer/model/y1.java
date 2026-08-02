package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class y1 implements c2 {
    public final LoginProperties a;
    public final List b;

    public y1(LoginProperties loginProperties, List list) {
        this.a = loginProperties;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.a.equals(y1Var.a) && jl40.l(this.b, y1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Roundabout(loginProperties=");
        sb.append(this.a);
        sb.append(", accounts=");
        return unr0.t(sb, this.b, ')');
    }
}
