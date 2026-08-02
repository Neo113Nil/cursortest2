package xsna;

import java.util.UUID;

/* compiled from: CommunityProfileLinksViewState.kt */
/* loaded from: classes3.dex */
public final class j9z {
    public final UUID a;
    public final String b;
    public final String c;
    public final String d;

    public j9z(String str, String str2, String str3, UUID uuid) {
        this.a = uuid;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9z)) {
            return false;
        }
        j9z j9zVar = (j9z) obj;
        return epx.f(this.a, j9zVar.a) && epx.f(this.b, j9zVar.b) && epx.f(this.c, j9zVar.c) && epx.f(this.d, j9zVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkItem(uid=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        return ho8.a(sb, this.d, ')');
    }
}
