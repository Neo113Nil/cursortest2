package xsna;

import java.util.ArrayList;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class fsi0 {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;
    public final boolean e;

    public fsi0(String str, String str2, int i, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = arrayList;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi0)) {
            return false;
        }
        fsi0 fsi0Var = (fsi0) obj;
        return epx.f(this.a, fsi0Var.a) && epx.f(this.b, fsi0Var.b) && this.c == fsi0Var.c && this.d.equals(fsi0Var.d) && this.e == fsi0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qr.a(this.d, shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesSectionData(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", itemIds=");
        sb.append(this.d);
        sb.append(", isListViewType=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
