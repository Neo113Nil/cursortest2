package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ozg extends vzg {
    public final Uri a;
    public final boolean b;
    public final String c;

    public ozg(Uri uri, boolean z, String str) {
        this.a = uri;
        this.b = z;
        this.c = str;
    }

    public static ozg a(ozg ozgVar, Uri uri, String str, int i) {
        if ((i & 1) != 0) {
            uri = ozgVar.a;
        }
        boolean z = ozgVar.b;
        if ((i & 4) != 0) {
            str = ozgVar.c;
        }
        ozgVar.getClass();
        return new ozg(uri, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozg)) {
            return false;
        }
        ozg ozgVar = (ozg) obj;
        return this.a.equals(ozgVar.a) && this.b == ozgVar.b && jl40.l(this.c, ozgVar.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Home(url=");
        sb.append(this.a);
        sb.append(", isForceBuyPlus=");
        sb.append(this.b);
        sb.append(", message=");
        return b64.p(sb, this.c, ')');
    }
}
