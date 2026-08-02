package xsna;

import java.util.List;

/* compiled from: EmailCreationResponse.kt */
/* loaded from: classes6.dex */
public final class gcp {
    public final boolean a;
    public final String b;
    public final List<String> c;

    public gcp(String str, List list, boolean z) {
        this.a = z;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcp)) {
            return false;
        }
        gcp gcpVar = (gcp) obj;
        return this.a == gcpVar.a && epx.f(this.b, gcpVar.b) && epx.f(this.c, gcpVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailCreationResponse(status=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", suggestions=");
        return ms9.a(')', sb, this.c);
    }
}
