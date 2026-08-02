package defpackage;

import android.net.Uri;

/* loaded from: classes13.dex */
public final class l790 implements n790 {
    public final Uri a;
    public final Integer b;

    public l790(Uri uri, Integer num) {
        this.a = uri;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l790)) {
            return false;
        }
        l790 l790Var = (l790) obj;
        return this.a.equals(l790Var.a) && jl40.l(this.b, l790Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Url(url=");
        sb.append(this.a);
        sb.append(", httpErrorCode=");
        return vfc.o(sb, this.b, ')');
    }
}
