package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class l8s implements h8s {
    public final String a;
    public final FormattedText$FontStyle b;
    public final FormattedText$FontWeight c;
    public final Integer d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;

    public l8s(String str, FormattedText$FontStyle formattedText$FontStyle, FormattedText$FontWeight formattedText$FontWeight, Integer num, List list, String str2, String str3) {
        this.a = str;
        this.b = formattedText$FontStyle;
        this.c = formattedText$FontWeight;
        this.d = num;
        this.e = list;
        this.f = EmptyList.a;
        this.g = str2;
        this.h = str3;
    }

    public final String a() {
        return this.g;
    }

    public final List b() {
        return this.f;
    }

    public final Integer c() {
        return this.d;
    }

    public final FormattedText$FontStyle d() {
        return this.b;
    }

    public final FormattedText$FontWeight e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8s)) {
            return false;
        }
        l8s l8sVar = (l8s) obj;
        return jl40.l(this.a, l8sVar.a) && this.b == l8sVar.b && this.c == l8sVar.c && jl40.l(this.d, l8sVar.d) && jl40.l(this.e, l8sVar.e) && jl40.l(this.f, l8sVar.f) && jl40.l(this.g, l8sVar.g) && jl40.l(this.h, l8sVar.h);
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return this.a;
    }

    public final List h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        FormattedText$FontWeight formattedText$FontWeight = this.c;
        int hashCode2 = (hashCode + (formattedText$FontWeight == null ? 0 : formattedText$FontWeight.hashCode())) * 31;
        Integer num = this.d;
        int b = unr0.b(unr0.c(unr0.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", fontStyle=");
        sb.append(this.b);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", textDecoration=");
        sb.append(this.e);
        sb.append(", detailedTextDecoration=");
        sb.append(this.f);
        sb.append(", color=");
        sb.append(this.g);
        sb.append(", metaColor=");
        return b64.p(sb, this.h, ')');
    }

    public /* synthetic */ l8s(int i) {
        this("", FormattedText$FontStyle.NORMAL, null, null, EmptyList.a, "", null);
    }

    public l8s() {
        this(0);
    }
}
