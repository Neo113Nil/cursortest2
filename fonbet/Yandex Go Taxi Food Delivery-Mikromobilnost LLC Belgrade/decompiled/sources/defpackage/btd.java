package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class btd {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public btd(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btd)) {
            return false;
        }
        btd btdVar = (btd) obj;
        return this.a.equals(btdVar.a) && this.b.equals(btdVar.b) && this.c.equals(btdVar.c) && this.d.equals(btdVar.d) && this.e.equals(btdVar.e) && this.f.equals(btdVar.f) && this.g.equals(btdVar.g) && this.h.equals(btdVar.h) && this.i.equals(btdVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset(titleText=");
        sb.append(this.a);
        sb.append(", subtitleText=");
        sb.append(this.b);
        sb.append(", benefits=");
        sb.append(this.c);
        sb.append(", acceptButtonText=");
        sb.append(this.d);
        sb.append(", buttonText=");
        sb.append(this.e);
        sb.append(", buttonAdditionalText=");
        sb.append(this.f);
        sb.append(", rejectButtonText=");
        sb.append(this.g);
        sb.append(", mainImageMobile=");
        sb.append(this.h);
        sb.append(", mainImageTV=");
        return b64.p(sb, this.i, ')');
    }
}
