package xsna;

import com.vk.external.miniapp.net.app.WebPhoto;

/* compiled from: GameInfoModel.kt */
/* loaded from: classes17.dex */
public final class g7t extends uet {
    public final sbt d;
    public final WebPhoto e;
    public final String f;
    public final boolean g;

    public g7t(sbt sbtVar, WebPhoto webPhoto, String str, boolean z) {
        super(sbtVar.a.b, sbtVar.c, sbtVar.d);
        this.d = sbtVar;
        this.e = webPhoto;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7t)) {
            return false;
        }
        g7t g7tVar = (g7t) obj;
        return epx.f(this.d, g7tVar.d) && epx.f(this.e, g7tVar.e) && epx.f(this.f, g7tVar.f) && this.g == g7tVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + urd0.a((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameInfoModel(extendedApp=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", hasAchievementLabel=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
