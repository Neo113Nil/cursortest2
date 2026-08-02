package xsna;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class ckl implements hfz {
    public final String b;
    public final boolean c;

    public ckl(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckl)) {
            return false;
        }
        ckl cklVar = (ckl) obj;
        return epx.f(this.b, cklVar.b) && this.c == cklVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultPayButtonItem(text=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
