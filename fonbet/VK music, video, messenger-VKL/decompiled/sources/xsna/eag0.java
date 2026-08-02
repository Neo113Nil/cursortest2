package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: ResolvingResult.kt */
/* loaded from: classes6.dex */
public final class eag0 {
    public final WebApiApplication a;
    public final nex0 b;
    public final long c;

    public eag0(WebApiApplication webApiApplication, nex0 nex0Var, long j) {
        this.a = webApiApplication;
        this.b = nex0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eag0)) {
            return false;
        }
        eag0 eag0Var = (eag0) obj;
        return epx.f(this.a, eag0Var.a) && epx.f(this.b, eag0Var.b) && this.c == eag0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (((int) this.a.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolvingResult(app=");
        sb.append(this.a);
        sb.append(", embeddedUrl=");
        sb.append(this.b);
        sb.append(", groupId=");
        return vu5.a(')', this.c, sb);
    }
}
