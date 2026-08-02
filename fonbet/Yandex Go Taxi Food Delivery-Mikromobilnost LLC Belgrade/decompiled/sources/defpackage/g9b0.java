package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g9b0 {
    public final String a;
    public final String b;
    public final String c;
    public final Set d;
    public final d9b0 e;
    public final e9b0 f;
    public final f9b0 g;

    public g9b0(String str, String str2, String str3, Set set, d9b0 d9b0Var, e9b0 e9b0Var, f9b0 f9b0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = set;
        this.e = d9b0Var;
        this.f = e9b0Var;
        this.g = f9b0Var;
    }

    public final boolean a() {
        return (this.f == null && this.d.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof g9b0) {
                g9b0 g9b0Var = (g9b0) obj;
                if (jl40.l(this.a, g9b0Var.a) && this.b.equals(g9b0Var.b)) {
                    String str = g9b0Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.d.equals(g9b0Var.d) && this.e.equals(g9b0Var.e) && jl40.l(this.f, g9b0Var.f) && this.g.equals(g9b0Var.g)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.e.hashCode() + g8e.e(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        e9b0 e9b0Var = this.f;
        return this.g.hashCode() + ((hashCode + (e9b0Var != null ? e9b0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String a = h9b0.a(this.b);
        String str = this.c;
        String a2 = str == null ? "null" : h9b0.a(str);
        StringBuilder v = b64.v("View(logId=", this.a, ", categoryId=", a, ", parentCategoryId=");
        v.append(a2);
        v.append(", children=");
        v.append(this.d);
        v.append(", content=");
        v.append(this.e);
        v.append(", expandedCategoryHeader=");
        v.append(this.f);
        v.append(", selectedStateSettings=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
