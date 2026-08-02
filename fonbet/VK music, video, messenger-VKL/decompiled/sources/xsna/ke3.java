package xsna;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: AppsCatalogSectionsResponse.kt */
/* loaded from: classes6.dex */
public final class ke3 {
    public final ArrayList a;
    public final Object b;
    public final int c;
    public final String d;
    public final String e;

    static {
        EmptyList emptyList = EmptyList.b;
    }

    public ke3(ArrayList arrayList, Map map, int i, String str, String str2) {
        this.a = arrayList;
        this.b = map;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return this.a.equals(ke3Var.a) && this.b.equals(ke3Var.b) && this.c == ke3Var.c && epx.f(this.d, ke3Var.d) && epx.f(this.e, ke3Var.e);
    }

    public final int hashCode() {
        int a = shy.a(this.c, vul0.a(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCatalogSectionsResponse(sections=");
        sb.append(this.a);
        sb.append(", apps=");
        sb.append(this.b);
        sb.append(", total=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", activeFeatures=");
        return ho8.a(sb, this.e, ')');
    }
}
