package xsna;

import xsna.is60;

/* compiled from: ReactionsFeedViewState.kt */
/* loaded from: classes4.dex */
public final class j5f0 implements lm50 {
    public final is60.a b;
    public final boolean c;

    public j5f0(is60.a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5f0)) {
            return false;
        }
        j5f0 j5f0Var = (j5f0) obj;
        return epx.f(this.b, j5f0Var.b) && this.c == j5f0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsFeedViewState(listViewState=");
        sb.append(this.b);
        sb.append(", isEmptyVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
