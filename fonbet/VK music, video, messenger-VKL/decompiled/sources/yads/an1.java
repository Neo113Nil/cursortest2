package yads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class an1 {
    public final Uri a;
    public final String b;
    public final xm1 c;
    public final List d;
    public final String e;
    public final s51 f;
    public final Object g;

    public an1(Uri uri, String str, xm1 xm1Var, List list, String str2, s51 s51Var, Object obj) {
        this.a = uri;
        this.b = str;
        this.c = xm1Var;
        this.d = list;
        this.e = str2;
        this.f = s51Var;
        o51 f = s51.f();
        if (s51Var.size() > 0) {
            ((en1) s51Var.get(0)).a();
            throw null;
        }
        f.a();
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return this.a.equals(an1Var.a) && mc3.a(this.b, an1Var.b) && mc3.a(this.c, an1Var.c) && mc3.a((Object) null, (Object) null) && this.d.equals(an1Var.d) && mc3.a(this.e, an1Var.e) && this.f.equals(an1Var.f) && mc3.a(this.g, an1Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xm1 xm1Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (xm1Var == null ? 0 : xm1Var.hashCode())) * 961)) * 31;
        String str2 = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.g;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
