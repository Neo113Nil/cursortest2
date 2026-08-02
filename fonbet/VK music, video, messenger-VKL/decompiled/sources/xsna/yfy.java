package xsna;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class yfy extends rf6 {
    public final ewp0 b;
    public final boolean c;
    public final so40 d;

    public yfy() {
        throw null;
    }

    public yfy(ewp0 ewp0Var, boolean z, so40 so40Var) {
        this.b = ewp0Var;
        this.c = z;
        this.d = so40Var;
    }

    @Override // xsna.rf6
    public final int a() {
        return -7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfy)) {
            return false;
        }
        yfy yfyVar = (yfy) obj;
        return epx.f(this.b, yfyVar.b) && this.c == yfyVar.c && epx.f(this.d, yfyVar.d);
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(0, qoy.b(this.b.hashCode() * 31, 31, this.c), 961);
    }

    public final String toString() {
        return "KeyboardHeaderUgcItem(ugcPack=" + this.b + ", canEdit=" + this.c + ", promoCount=0, ref=null, contextUserProvider=" + this.d + ')';
    }
}
