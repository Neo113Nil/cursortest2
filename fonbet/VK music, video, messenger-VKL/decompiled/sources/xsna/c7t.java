package xsna;

import com.vk.external.miniapp.net.app.WebPhoto;

/* compiled from: GameForYouInfoModel.kt */
/* loaded from: classes17.dex */
public final class c7t extends uet {
    public final sbt d;
    public final WebPhoto e;
    public final String f;
    public final String g;
    public final String h;

    public c7t(sbt sbtVar, WebPhoto webPhoto, String str, String str2, String str3) {
        super(sbtVar.a.b, sbtVar.c, sbtVar.d);
        this.d = sbtVar;
        this.e = webPhoto;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7t)) {
            return false;
        }
        c7t c7tVar = (c7t) obj;
        return epx.f(this.d, c7tVar.d) && epx.f(this.e, c7tVar.e) && epx.f(this.f, c7tVar.f) && epx.f(this.g, c7tVar.g) && epx.f(this.h, c7tVar.h);
    }

    public final int hashCode() {
        int a = urd0.a((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f);
        String str = this.g;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameForYouInfoModel(extendedApp=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", description=");
        sb.append(this.g);
        sb.append(", buttonText=");
        return ho8.a(sb, this.h, ')');
    }
}
