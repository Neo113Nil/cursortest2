package xsna;

import java.util.List;

/* compiled from: CommunityProfileAuthorHeaderReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class a8p0 {
    public final List<String> a;
    public final int b;

    public a8p0(List<String> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8p0)) {
            return false;
        }
        a8p0 a8p0Var = (a8p0) obj;
        return epx.f(this.a, a8p0Var.a) && this.b == a8p0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarStoriesComposeInput(avatarAlbumPhotoUrls=");
        sb.append(this.a);
        sb.append(", failedStoriesCount=");
        return vu5.b(sb, this.b, ')');
    }
}
