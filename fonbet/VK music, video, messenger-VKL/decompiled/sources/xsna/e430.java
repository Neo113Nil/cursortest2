package xsna;

/* compiled from: ModerationBlockedItemMVI.kt */
/* loaded from: classes18.dex */
public final class e430 implements km50 {
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public e430(String str, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
    }

    public static e430 a(e430 e430Var, String str, CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = e430Var.b;
        }
        if ((i & 2) != 0) {
            charSequence = e430Var.c;
        }
        if ((i & 4) != 0) {
            charSequence2 = e430Var.d;
        }
        if ((i & 8) != 0) {
            z = e430Var.e;
        }
        e430Var.getClass();
        return new e430(str, charSequence, charSequence2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e430)) {
            return false;
        }
        e430 e430Var = (e430) obj;
        return epx.f(this.b, e430Var.b) && epx.f(this.c, e430Var.c) && epx.f(this.d, e430Var.d) && this.e == e430Var.e;
    }

    public final int hashCode() {
        String str = this.b;
        return Boolean.hashCode(this.e) + u11.c(u11.c((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModerationBlockedItemState(imageUrl=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append((Object) this.c);
        sb.append(", infoLink=");
        sb.append((Object) this.d);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
