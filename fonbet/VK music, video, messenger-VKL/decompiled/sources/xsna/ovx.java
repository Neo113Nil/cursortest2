package xsna;

/* compiled from: ItemViewState.kt */
/* loaded from: classes7.dex */
public final class ovx {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ovx(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovx)) {
            return false;
        }
        ovx ovxVar = (ovx) obj;
        return epx.f(this.a, ovxVar.a) && epx.f(this.b, ovxVar.b) && this.c == ovxVar.c && this.d == ovxVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + shy.a(this.c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemViewState(avatarUrl=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", index=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
