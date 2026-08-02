package xsna;

import org.json.JSONObject;

/* compiled from: CastMediaItem.kt */
/* loaded from: classes8.dex */
public final class d0a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;
    public final JSONObject h;

    public d0a(String str, String str2, String str3, String str4, String str5, long j, boolean z, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = z;
        this.h = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0a)) {
            return false;
        }
        d0a d0aVar = (d0a) obj;
        return epx.f(this.a, d0aVar.a) && epx.f(this.b, d0aVar.b) && epx.f(this.c, d0aVar.c) && epx.f(this.d, d0aVar.d) && epx.f(this.e, d0aVar.e) && this.f == d0aVar.f && this.g == d0aVar.g && epx.f(this.h, d0aVar.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int b = qoy.b(bh10.a(urd0.a(urd0.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        JSONObject jSONObject = this.h;
        return b + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("CastMediaItem(title=", this.a, ", description=", this.b, ", image=");
        n6j.b(a, this.c, ", videoUrl=", this.d, ", contentType=");
        a.append(this.e);
        a.append(", duration=");
        a.append(this.f);
        a.append(", isLive=");
        a.append(this.g);
        a.append(", customData=");
        a.append(this.h);
        a.append(")");
        return a.toString();
    }
}
