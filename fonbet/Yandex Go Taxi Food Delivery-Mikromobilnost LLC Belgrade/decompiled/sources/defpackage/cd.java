package defpackage;

import java.util.List;
import java.util.TimeZone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class cd extends dd {
    public final String a;
    public final long b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final List f;
    public final boolean g;
    public final String h;
    public final TimeZone i;

    public cd(String str, long j, FormattedText formattedText, FormattedText formattedText2, String str2, List list, boolean z, String str3, TimeZone timeZone) {
        this.a = str;
        this.b = j;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = str2;
        this.f = list;
        this.g = z;
        this.h = str3;
        this.i = timeZone;
    }

    @Override // defpackage.dd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dd
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dd
    public final boolean c() {
        return false;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        FormattedText formattedText;
        return (evu0.J(this.a) || (formattedText = this.d) == null || !formattedText.d()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return jl40.l(this.a, cdVar.a) && this.b == cdVar.b && jl40.l(this.c, cdVar.c) && jl40.l(this.d, cdVar.d) && jl40.l(this.e, cdVar.e) && jl40.l(this.f, cdVar.f) && this.g == cdVar.g && jl40.l(this.h, cdVar.h) && jl40.l(this.i, cdVar.i);
    }

    public final int hashCode() {
        int e = unr0.e(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, false);
        FormattedText formattedText = this.c;
        int hashCode = (e + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.d;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.e;
        int b = unr0.b(unr0.e(unr0.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        TimeZone timeZone = this.i;
        return b + (timeZone != null ? timeZone.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Trackable(id=", this.a, ", uid=", this.b);
        l.append(", isOnDemand=false, title=");
        l.append(this.c);
        l.append(", content=");
        l.append(this.d);
        l.append(", imageTag=");
        l.append(this.e);
        l.append(", buttons=");
        l.append(this.f);
        l.append(", isDismissible=");
        l.append(this.g);
        l.append(", zoneName=");
        l.append(this.h);
        l.append(", timeZone=");
        l.append(this.i);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
