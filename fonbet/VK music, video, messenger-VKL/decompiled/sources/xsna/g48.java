package xsna;

/* compiled from: InviteFriendsSelectionInfo.kt */
/* loaded from: classes14.dex */
public final class g48 {
    public final xrx a;
    public final arx b;

    public g48(xrx xrxVar, arx arxVar) {
        this.a = xrxVar;
        this.b = arxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g48)) {
            return false;
        }
        g48 g48Var = (g48) obj;
        return epx.f(this.a, g48Var.a) && epx.f(this.b, g48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomBarModel(selectionInfo=" + this.a + ", buttonInfo=" + this.b + ')';
    }

    public g48() {
        this(new xrx(0), new arx(0));
    }
}
