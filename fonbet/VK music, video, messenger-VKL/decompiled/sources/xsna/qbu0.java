package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VkAuthAppCredentials.kt */
/* loaded from: classes6.dex */
public final class qbu0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List<f65> j;

    public qbu0(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbu0)) {
            return false;
        }
        qbu0 qbu0Var = (qbu0) obj;
        return epx.f(this.a, qbu0Var.a) && this.b == qbu0Var.b && epx.f(this.c, qbu0Var.c) && epx.f(this.d, qbu0Var.d) && epx.f(this.e, qbu0Var.e) && epx.f(this.f, qbu0Var.f) && epx.f(this.g, qbu0Var.g) && epx.f(this.h, qbu0Var.h) && epx.f(this.i, qbu0Var.i) && epx.f(this.j, qbu0Var.j);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<f65> list = this.j;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthAppCredentials(token=");
        sb.append(this.a);
        sb.append(", ttlSeconds=");
        sb.append(this.b);
        sb.append(", uuid=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        sb.append(this.e);
        sb.append(", phone=");
        sb.append(this.f);
        sb.append(", photo50=");
        sb.append(this.g);
        sb.append(", photo100=");
        sb.append(this.h);
        sb.append(", photo200=");
        sb.append(this.i);
        sb.append(", serviceInfo=");
        return ms9.a(')', sb, this.j);
    }
}
