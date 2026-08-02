package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.util.Map;

/* loaded from: classes6.dex */
public final class dd30 implements ed30 {
    public final String a;
    public final BitmapDrawable b;
    public final CharSequence c;
    public final CharSequence d;
    public final eq30 e;
    public final fs30 f;
    public final fs30 g;
    public final long h;
    public final fs30 i;
    public final Map j;

    public dd30(String str, BitmapDrawable bitmapDrawable, CharSequence charSequence, CharSequence charSequence2, eq30 eq30Var, fs30 fs30Var, fs30 fs30Var2, long j, fs30 fs30Var3, Map map) {
        this.a = str;
        this.b = bitmapDrawable;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = eq30Var;
        this.f = fs30Var;
        this.g = fs30Var2;
        this.h = j;
        this.i = fs30Var3;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd30)) {
            return false;
        }
        dd30 dd30Var = (dd30) obj;
        return jl40.l(this.a, dd30Var.a) && jl40.l(this.b, dd30Var.b) && jl40.l(this.c, dd30Var.c) && jl40.l(this.d, dd30Var.d) && jl40.l(this.e, dd30Var.e) && jl40.l(this.f, dd30Var.f) && jl40.l(this.g, dd30Var.g) && e3n.d(this.h, dd30Var.h) && jl40.l(this.i, dd30Var.i) && jl40.l(this.j, dd30Var.j);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        BitmapDrawable bitmapDrawable = this.b;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.e(smw0.b(smw0.b((hashCode + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31, 31, this.c), 31, this.d), 31, false)) * 31)) * 31)) * 31;
        o430 o430Var = e3n.b;
        int c = qv10.c(hashCode2, 31, this.h);
        fs30 fs30Var = this.i;
        return unr0.d((c + (fs30Var != null ? fs30Var.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        String p = e3n.p(this.h);
        StringBuilder sb = new StringBuilder("Ready(routeId=");
        sb.append(this.a);
        sb.append(", bgColor=null, leadIcon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", updateAnimation=false, trail=");
        sb.append(this.e);
        sb.append(", showCallback=");
        sb.append(this.f);
        sb.append(", delayedShowCallback=");
        sb.append(this.g);
        sb.append(", delayForCallback=");
        sb.append(p);
        sb.append(", clickCallback=");
        sb.append(this.i);
        sb.append(", metaInfo=");
        sb.append(this.j);
        sb.append(", analyticsPayload=null)");
        return sb.toString();
    }
}
