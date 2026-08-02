package defpackage;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class pyr {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public pyr(String str, String str2, String str3, int i) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        str3.getClass();
        this.c = str3;
        this.d = null;
        d6z.n(i != 0);
        this.e = i;
        this.f = null;
        this.g = null;
        this.h = a(str, str2, str3, null, null);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        return g8e.r(oyr.w(str, "-", str2, "-", str3), "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mSystemFont: " + this.f + ", mVariationSettings: " + this.g + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append("}");
                sb.append("mCertificatesArray: " + this.e);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public pyr(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = 0;
        this.f = str4;
        this.g = str5;
        this.h = a(str, str2, str3, str4, str5);
    }
}
