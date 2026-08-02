package defpackage;

import android.graphics.Typeface;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class n8e0 {
    public static final n8e0 k;
    public final String a;
    public final String b;
    public final Typeface c;
    public final String d;
    public final m8e0 e;
    public final List f;
    public final int g;
    public final int h;
    public final List i;
    public final j8e0 j;

    static {
        k8e0 k8e0Var = new k8e0(null, 7);
        j8e0 j8e0Var = new j8e0(null, 3);
        EmptyList emptyList = EmptyList.a;
        k = new n8e0("", "", null, "", k8e0Var, emptyList, 0, 0, emptyList, j8e0Var);
    }

    public n8e0(String str, String str2, Typeface typeface, String str3, m8e0 m8e0Var, List list, int i, int i2, List list2, j8e0 j8e0Var) {
        this.a = str;
        this.b = str2;
        this.c = typeface;
        this.d = str3;
        this.e = m8e0Var;
        this.f = list;
        this.g = i;
        this.h = i2;
        this.i = list2;
        this.j = j8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8e0)) {
            return false;
        }
        n8e0 n8e0Var = (n8e0) obj;
        return jl40.l(this.a, n8e0Var.a) && jl40.l(this.b, n8e0Var.b) && jl40.l(this.c, n8e0Var.c) && jl40.l(this.d, n8e0Var.d) && jl40.l(this.e, n8e0Var.e) && jl40.l(this.f, n8e0Var.f) && this.g == n8e0Var.g && this.h == n8e0Var.h && jl40.l(this.i, n8e0Var.i) && jl40.l(this.j, n8e0Var.j);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Typeface typeface = this.c;
        return this.j.hashCode() + unr0.c(oyr.b(this.h, oyr.b(this.g, unr0.c((this.e.hashCode() + unr0.b((b + (typeface == null ? 0 : typeface.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("PopupDialogModalUiState(id=", this.a, ", title=", this.b, ", titleTypeface=");
        v.append(this.c);
        v.append(", subtitle=");
        v.append(this.d);
        v.append(", image=");
        v.append(this.e);
        v.append(", bullets=");
        v.append(this.f);
        v.append(", maxShowCount=");
        vfc.u(this.g, this.h, ", daysShowInterval=", ", controlItems=", v);
        v.append(this.i);
        v.append(", headerAppearance=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
