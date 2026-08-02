package xsna;

import xsna.is60;

/* compiled from: PostViewState.kt */
/* loaded from: classes4.dex */
public final class v9c0 implements lm50 {
    public final p3p0 b;
    public final is60.a c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public v9c0(p3p0 p3p0Var, is60.a aVar, boolean z, boolean z2, boolean z3) {
        this.b = p3p0Var;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c0)) {
            return false;
        }
        v9c0 v9c0Var = (v9c0) obj;
        return epx.f(this.b, v9c0Var.b) && epx.f(this.c, v9c0Var.c) && this.d == v9c0Var.d && this.e == v9c0Var.e && this.f == v9c0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + (Integer.hashCode(this.b.a) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostViewState(toolbarState=");
        sb.append(this.b);
        sb.append(", listViewState=");
        sb.append(this.c);
        sb.append(", isEmptyVisible=");
        sb.append(this.d);
        sb.append(", isToolbarSeparatorVisible=");
        sb.append(this.e);
        sb.append(", isArchiveSubtitleVisible=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
