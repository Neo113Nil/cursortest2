package defpackage;

import com.yandex.delivery.mapper.model.TimelineItemStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gj31 {
    public final String a;
    public final String b;
    public final TimelineItemStatus c;
    public final String d;
    public final String e;
    public final qfc f;
    public final String g;
    public final qfc h;

    public gj31(String str, String str2, TimelineItemStatus timelineItemStatus, String str3, String str4, qfc qfcVar, String str5, qfc qfcVar2) {
        this.a = str;
        this.b = str2;
        this.c = timelineItemStatus;
        this.d = str3;
        this.e = str4;
        this.f = qfcVar;
        this.g = str5;
        this.h = qfcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj31)) {
            return false;
        }
        gj31 gj31Var = (gj31) obj;
        return jl40.l(this.a, gj31Var.a) && jl40.l(this.b, gj31Var.b) && this.c == gj31Var.c && jl40.l(this.d, gj31Var.d) && jl40.l(this.e, gj31Var.e) && jl40.l(this.f, gj31Var.f) && jl40.l(this.g, gj31Var.g) && jl40.l(this.h, gj31Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int b = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        qfc qfcVar = this.f;
        int hashCode3 = (b + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qfc qfcVar2 = this.h;
        return hashCode4 + (qfcVar2 != null ? qfcVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("VerticalTimelineItemModel(leadTitle=", this.a, ", leadSubtitle=", this.b, ", status=");
        v.append(this.c);
        v.append(", iconTag=");
        v.append(this.d);
        v.append(", title=");
        v.append(this.e);
        v.append(", titleColor=");
        v.append(this.f);
        v.append(", subtitle=");
        v.append(this.g);
        v.append(", subtitleColor=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
