package xsna;

/* compiled from: RecommendedChannelHeaderItem.kt */
/* loaded from: classes16.dex */
public final class fcf0 implements hfz {
    public final CharSequence b;
    public final boolean c;

    public fcf0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcf0)) {
            return false;
        }
        fcf0 fcf0Var = (fcf0) obj;
        return epx.f(this.b, fcf0Var.b) && this.c == fcf0Var.c;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483643;
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        return Boolean.hashCode(this.c) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedChannelHeaderItem(buttonText=");
        sb.append((Object) this.b);
        sb.append(", isCollapsed=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
