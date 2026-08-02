package xsna;

import android.graphics.drawable.Drawable;
import java.util.List;

/* compiled from: DiscoverMediaPreviewUiModel.kt */
/* loaded from: classes4.dex */
public final class q4n {
    public final String a;
    public final String b;
    public final Drawable c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final List<ean> h;
    public final String i;

    public q4n(String str, String str2, l3n l3nVar, boolean z, boolean z2, String str3, String str4, List list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = l3nVar;
        this.d = z;
        this.e = z2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4n)) {
            return false;
        }
        q4n q4nVar = (q4n) obj;
        return epx.f(this.a, q4nVar.a) && epx.f(this.b, q4nVar.b) && epx.f(this.c, q4nVar.c) && this.d == q4nVar.d && this.e == q4nVar.e && epx.f(this.f, q4nVar.f) && epx.f(this.g, q4nVar.g) && epx.f(this.h, q4nVar.h) && epx.f(this.i, q4nVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.c;
        int b = qoy.b(qoy.b((hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return this.i.hashCode() + fw3.a((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(imageUrl=");
        sb.append(this.a);
        sb.append(", thumbHash=");
        sb.append(this.b);
        sb.append(", foregroundDrawable=");
        sb.append(this.c);
        sb.append(", shouldShowText=");
        sb.append(this.d);
        sb.append(", isSmallCell=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", tags=");
        sb.append(this.h);
        sb.append(", contentDescription=");
        return ho8.a(sb, this.i, ')');
    }
}
