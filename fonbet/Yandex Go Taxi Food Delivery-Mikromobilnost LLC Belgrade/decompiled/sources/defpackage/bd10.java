package defpackage;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class bd10 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public bd10(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == bd10.class) {
            bd10 bd10Var = (bd10) obj;
            if (TextUtils.equals(this.a, bd10Var.a) && this.b == bd10Var.b && this.c == bd10Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((unr0.b(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
