package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import java.util.List;

/* compiled from: LegoAuthorHeaderScreenState.kt */
/* loaded from: classes5.dex */
public final class s1z {
    public final AuthorHeaderConfig a;
    public final w590 b;
    public final List<String> c;
    public final int d;

    public s1z(AuthorHeaderConfig authorHeaderConfig, w590 w590Var, List<String> list, int i) {
        this.a = authorHeaderConfig;
        this.b = w590Var;
        this.c = list;
        this.d = i;
    }

    public static s1z a(s1z s1zVar, w590 w590Var, int i, int i2) {
        AuthorHeaderConfig authorHeaderConfig = s1zVar.a;
        if ((i2 & 2) != 0) {
            w590Var = s1zVar.b;
        }
        List<String> list = s1zVar.c;
        if ((i2 & 8) != 0) {
            i = s1zVar.d;
        }
        s1zVar.getClass();
        return new s1z(authorHeaderConfig, w590Var, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1z)) {
            return false;
        }
        s1z s1zVar = (s1z) obj;
        return epx.f(this.a, s1zVar.a) && epx.f(this.b, s1zVar.b) && epx.f(this.c, s1zVar.c) && this.d == s1zVar.d;
    }

    public final int hashCode() {
        AuthorHeaderConfig authorHeaderConfig = this.a;
        return Integer.hashCode(this.d) + fw3.a((this.b.hashCode() + ((authorHeaderConfig == null ? 0 : authorHeaderConfig.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegoAuthorHeaderScreenState(headerConfig=");
        sb.append(this.a);
        sb.append(", topBarState=");
        sb.append(this.b);
        sb.append(", avatarAlbumUrls=");
        sb.append(this.c);
        sb.append(", toolbarOverlayHeightPx=");
        return vu5.b(sb, this.d, ')');
    }
}
