package xsna;

/* compiled from: CommunityReplyStatusItemModel.kt */
/* loaded from: classes5.dex */
public final class fxh extends s4h {
    public final mp80 b;
    public final boolean c;

    public fxh(mp80 mp80Var, boolean z) {
        this.b = mp80Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxh)) {
            return false;
        }
        fxh fxhVar = (fxh) obj;
        return epx.f(this.b, fxhVar.b) && this.c == fxhVar.c;
    }

    public final int hashCode() {
        mp80 mp80Var = this.b;
        return Boolean.hashCode(this.c) + ((mp80Var == null ? 0 : mp80Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReplyStatusItemModel(onlineStatus=");
        sb.append(this.b);
        sb.append(", isSeparatorVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
