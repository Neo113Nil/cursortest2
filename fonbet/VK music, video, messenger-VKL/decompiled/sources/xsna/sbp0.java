package xsna;

import xsna.mno0;
import xsna.rmw;

/* compiled from: TopshelfCardTitleState.kt */
/* loaded from: classes2.dex */
public final class sbp0 {
    public final mno0.i a;
    public final rmw b;
    public final int c;

    public sbp0(mno0.i iVar, rmw.d dVar, int i) {
        this.a = iVar;
        this.b = dVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbp0)) {
            return false;
        }
        sbp0 sbp0Var = (sbp0) obj;
        return this.a.equals(sbp0Var.a) && epx.f(this.b, sbp0Var.b) && this.c == sbp0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        rmw rmwVar = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (rmwVar == null ? 0 : rmwVar.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardTitleState(text=");
        sb.append(this.a);
        sb.append(", picture=");
        sb.append(this.b);
        sb.append(", pictureContentDescription=null, maxLines=");
        return vu5.b(sb, this.c, ')');
    }
}
