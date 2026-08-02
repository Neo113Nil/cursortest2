package xsna;

import xsna.is60;

/* compiled from: GeoPostsViewState.kt */
/* loaded from: classes4.dex */
public final class xmt implements lm50 {
    public final q3p0 b;
    public final is60.a c;
    public final boolean d;

    public xmt(q3p0 q3p0Var, is60.a aVar, boolean z) {
        this.b = q3p0Var;
        this.c = aVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmt)) {
            return false;
        }
        xmt xmtVar = (xmt) obj;
        return epx.f(this.b, xmtVar.b) && epx.f(this.c, xmtVar.c) && this.d == xmtVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoPostsViewState(toolbarState=");
        sb.append(this.b);
        sb.append(", listViewState=");
        sb.append(this.c);
        sb.append(", isEmptyVisible=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
