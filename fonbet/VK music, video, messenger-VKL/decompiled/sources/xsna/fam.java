package xsna;

import android.net.Uri;

/* compiled from: DialogBackgroundData.kt */
/* loaded from: classes2.dex */
public final class fam {
    public final String a;
    public final String b;
    public final Uri c;
    public final Uri d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final boolean i;

    public /* synthetic */ fam(String str, String str2, Uri uri, Uri uri2) {
        this(str, str2, uri, uri2, 0, 0L, "", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fam)) {
            return false;
        }
        fam famVar = (fam) obj;
        return epx.f(this.a, famVar.a) && epx.f(this.b, famVar.b) && epx.f(this.c, famVar.c) && epx.f(this.d, famVar.d) && this.e == famVar.e && this.f == famVar.f && epx.f(this.g, famVar.g) && epx.f(this.h, famVar.h) && this.i == famVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + urd0.a(urd0.a(bh10.a(shy.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackgroundData(name=");
        sb.append(this.a);
        sb.append(", hash=");
        sb.append(this.b);
        sb.append(", lightUri=");
        sb.append(this.c);
        sb.append(", darkUri=");
        sb.append(this.d);
        sb.append(", sort=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", lightThemeData=");
        sb.append(this.g);
        sb.append(", darkThemeData=");
        sb.append(this.h);
        sb.append(", isHidden=");
        return defpackage.q0.a(sb, this.i, ')');
    }

    public fam(String str, String str2, Uri uri, Uri uri2, int i, long j, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = uri2;
        this.e = i;
        this.f = j;
        this.g = str3;
        this.h = str4;
        this.i = z;
    }
}
