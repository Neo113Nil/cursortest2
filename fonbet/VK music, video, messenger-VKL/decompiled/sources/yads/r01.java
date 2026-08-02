package yads;

import android.text.TextUtils;
import com.ironsource.X3;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class r01 {
    public final String a;
    public final String b;

    public r01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r01.class == obj.getClass()) {
            r01 r01Var = (r01) obj;
            if (TextUtils.equals(this.a, r01Var.a) && TextUtils.equals(this.b, r01Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return i5s.a(sb, this.b, X3.j.e);
    }
}
