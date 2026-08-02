package com.vungle.ads.internal;

import com.vungle.ads.internal.model.i3;
import xsna.epx;

/* loaded from: classes7.dex */
public final class y0 {
    public final com.vungle.ads.internal.model.h0 a;
    public final i3 b;
    public final com.vungle.ads.internal.presenter.z c;

    public y0(com.vungle.ads.internal.model.h0 h0Var, i3 i3Var, com.vungle.ads.internal.presenter.z zVar) {
        this.a = h0Var;
        this.b = i3Var;
        this.c = zVar;
    }

    public final com.vungle.ads.internal.model.h0 a() {
        return this.a;
    }

    public final i3 b() {
        return this.b;
    }

    public final com.vungle.ads.internal.presenter.z c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return epx.f(this.a, y0Var.a) && epx.f(this.b, y0Var.b) && epx.f(this.c, y0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        com.vungle.ads.internal.presenter.z zVar = this.c;
        return hashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("PendingData(adPayload=");
        a.append(this.a);
        a.append(", placement=");
        a.append(this.b);
        a.append(", presenterDelegate=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }
}
