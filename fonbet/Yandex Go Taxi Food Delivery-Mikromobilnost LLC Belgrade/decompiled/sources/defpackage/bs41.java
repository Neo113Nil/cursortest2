package defpackage;

import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bs41 implements es41 {
    public final MapBuilder a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final mp41 e;

    public bs41(MapBuilder mapBuilder, boolean z, boolean z2, String str, mp41 mp41Var) {
        this.a = mapBuilder;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = mp41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs41)) {
            return false;
        }
        bs41 bs41Var = (bs41) obj;
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList) && this.a.equals(bs41Var.a) && this.b == bs41Var.b && this.c == bs41Var.c && this.d.equals(bs41Var.d) && jl40.l(this.e, bs41Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.e(unr0.e((this.a.hashCode() + 31) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadTargetUrl(extraCookies=");
        sb.append(EmptyList.a);
        sb.append(", extraHeaders=");
        sb.append(this.a);
        sb.append(", isCachingEnabled=");
        nnm.v(", isDomStorageEnabled=", ", url=", sb, this.b, this.c);
        sb.append(this.d);
        sb.append(", webViewFacade=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
