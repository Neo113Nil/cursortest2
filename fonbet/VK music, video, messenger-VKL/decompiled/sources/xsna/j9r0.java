package xsna;

import java.util.ArrayList;

/* compiled from: VKAvatarBorder.kt */
/* loaded from: classes15.dex */
public final class j9r0 {
    public final int a;
    public final bgd b;
    public final r9r0 c;
    public final ArrayList d;
    public final bgd e;

    public j9r0(int i, bgd bgdVar, r9r0 r9r0Var, ArrayList arrayList, bgd bgdVar2) {
        this.a = i;
        this.b = bgdVar;
        this.c = r9r0Var;
        this.d = arrayList;
        this.e = bgdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9r0)) {
            return false;
        }
        j9r0 j9r0Var = (j9r0) obj;
        return this.a == j9r0Var.a && this.b.equals(j9r0Var.b) && epx.f(this.c, j9r0Var.c) && this.d.equals(j9r0Var.d) && epx.f(this.e, j9r0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        r9r0 r9r0Var = this.c;
        int a = qr.a(this.d, (hashCode + (r9r0Var == null ? 0 : r9r0Var.hashCode())) * 31, 31);
        bgd bgdVar = this.e;
        return a + (bgdVar != null ? bgdVar.hashCode() : 0);
    }

    public final String toString() {
        return "VKAvatarBorder(avatarSize=" + this.a + ", avatarCropPath=" + this.b + ", avatarFill=" + this.c + ", borderItems=" + this.d + ", cutout=" + this.e + ')';
    }
}
