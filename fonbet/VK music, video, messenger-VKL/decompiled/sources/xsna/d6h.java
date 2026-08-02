package xsna;

/* compiled from: CommunityInviteLinkPreview.kt */
/* loaded from: classes5.dex */
public final class d6h {
    public final String a;
    public final String b;

    public d6h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6h)) {
            return false;
        }
        d6h d6hVar = (d6h) obj;
        return epx.f(this.a, d6hVar.a) && epx.f(this.b, d6hVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityInviteLinkUserProfile(photo=");
        sb.append(this.a);
        sb.append(", firstName=");
        return ho8.a(sb, this.b, ')');
    }
}
