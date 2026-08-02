package defpackage;

import android.net.Uri;
import java.util.List;
import yads.t31;

/* loaded from: classes7.dex */
public final class d981 {
    public final Uri a;
    public final List b;
    public final String c;
    public final t31 d;

    public d981(Uri uri, List list, String str, t31 t31Var) {
        this.a = uri;
        this.b = list;
        this.c = str;
        this.d = t31Var;
        p481 p481Var = t31.b;
        a181 a181Var = new a181();
        if (t31Var.size() <= 0) {
            a181Var.c();
        } else {
            b64.D(t31Var.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d981)) {
            return false;
        }
        d981 d981Var = (d981) obj;
        if (this.a.equals(d981Var.a)) {
            int i = rf71.a;
            if (this.b.equals(d981Var.b) && rf71.o(this.c, d981Var.c) && this.d.equals(d981Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 923521)) * 31;
        String str = this.c;
        return (this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
    }
}
