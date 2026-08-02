package xsna;

import com.vk.external.miniapp.net.app.WebImage;

/* compiled from: GamePromoBannerModel.kt */
/* loaded from: classes17.dex */
public final class w7t {
    public final sbt a;
    public final uet b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final WebImage g;
    public final String h;
    public final String i;

    public w7t(sbt sbtVar, uet uetVar, String str, String str2, String str3, String str4, WebImage webImage, String str5, String str6) {
        this.a = sbtVar;
        this.b = uetVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = webImage;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7t)) {
            return false;
        }
        w7t w7tVar = (w7t) obj;
        return epx.f(this.a, w7tVar.a) && epx.f(this.b, w7tVar.b) && epx.f(this.c, w7tVar.c) && epx.f(this.d, w7tVar.d) && epx.f(this.e, w7tVar.e) && epx.f(this.f, w7tVar.f) && epx.f(this.g, w7tVar.g) && epx.f(this.h, w7tVar.h) && epx.f(this.i, w7tVar.i);
    }

    public final int hashCode() {
        sbt sbtVar = this.a;
        int hashCode = (sbtVar == null ? 0 : sbtVar.hashCode()) * 31;
        uet uetVar = this.b;
        int hashCode2 = (hashCode + (uetVar == null ? 0 : uetVar.hashCode())) * 31;
        String str = this.c;
        int a = urd0.a(urd0.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int a2 = fw3.a((a + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g.b);
        String str3 = this.h;
        return this.i.hashCode() + ((a2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamePromoBannerModel(extendedApp=");
        sb.append(this.a);
        sb.append(", trackedApp=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", webViewUrl=");
        sb.append(this.f);
        sb.append(", backgroundImages=");
        sb.append(this.g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.i, ')');
    }
}
