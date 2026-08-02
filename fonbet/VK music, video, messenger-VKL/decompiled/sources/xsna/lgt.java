package xsna;

import java.util.ArrayList;

/* compiled from: GamesWhatInsideModalInfoModels.kt */
/* loaded from: classes17.dex */
public final class lgt {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public lgt(String str, ArrayList arrayList, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgt)) {
            return false;
        }
        lgt lgtVar = (lgt) obj;
        return epx.f(this.a, lgtVar.a) && this.b.equals(lgtVar.b) && epx.f(this.c, lgtVar.c) && epx.f(this.d, lgtVar.d) && epx.f(this.e, lgtVar.e) && epx.f(this.f, lgtVar.f);
    }

    public final int hashCode() {
        int a = urd0.a(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesWhatInsideModalInfo(title=");
        sb.append(this.a);
        sb.append(", gifts=");
        sb.append(this.b);
        sb.append(", closeButtonLabel=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", rulesText=");
        sb.append(this.e);
        sb.append(", rulesLink=");
        return ho8.a(sb, this.f, ')');
    }
}
