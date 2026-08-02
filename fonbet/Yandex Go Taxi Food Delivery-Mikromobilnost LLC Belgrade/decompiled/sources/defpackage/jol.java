package defpackage;

import android.net.Uri;

/* loaded from: classes7.dex */
public final class jol {
    public final Uri a;
    public final String b;
    public final fol c;
    public final Long d;

    public jol(Uri uri, String str, fol folVar, Long l) {
        this.a = uri;
        this.b = str;
        this.c = folVar;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jol)) {
            return false;
        }
        jol jolVar = (jol) obj;
        return jl40.l(this.a, jolVar.a) && jl40.l(this.b, jolVar.b) && jl40.l(this.c, jolVar.c) && jl40.l(this.d, jolVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        fol folVar = this.c;
        int hashCode = (b + (folVar == null ? 0 : folVar.hashCode())) * 31;
        Long l = this.d;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivVideoSource(url=");
        sb.append(this.a);
        sb.append(", mimeType=");
        sb.append(this.b);
        sb.append(", resolution=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return qv10.q(sb, this.d, ')');
    }
}
