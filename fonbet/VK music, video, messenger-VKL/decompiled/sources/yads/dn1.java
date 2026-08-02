package yads;

import android.net.Uri;
import android.os.Bundle;
import xsna.bz60;

/* loaded from: classes10.dex */
public final class dn1 implements xq {
    public static final dn1 d = new dn1(new cn1());
    public static final wq e = new bz60(15);
    public final Uri b;
    public final String c;

    public dn1(cn1 cn1Var) {
        this.b = cn1Var.a;
        this.c = cn1Var.b;
    }

    public static dn1 a(Bundle bundle) {
        cn1 cn1Var = new cn1();
        cn1Var.a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        cn1Var.b = bundle.getString(Integer.toString(1, 36));
        cn1Var.c = bundle.getBundle(Integer.toString(2, 36));
        return new dn1(cn1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return mc3.a(this.b, dn1Var.b) && mc3.a(this.c, dn1Var.c);
    }

    public final int hashCode() {
        Uri uri = this.b;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
