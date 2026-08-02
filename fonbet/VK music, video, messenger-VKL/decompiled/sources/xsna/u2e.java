package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsFavoriteFolder.kt */
/* loaded from: classes16.dex */
public final class u2e {
    public final FavoriteFolderId a;
    public final UserId b;
    public final List<Image> c;
    public final String d;
    public final int e;

    public u2e(FavoriteFolderId favoriteFolderId, UserId userId, List<Image> list, String str, int i) {
        this.a = favoriteFolderId;
        this.b = userId;
        this.c = list;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e)) {
            return false;
        }
        u2e u2eVar = (u2e) obj;
        return epx.f(this.a, u2eVar.a) && epx.f(this.b, u2eVar.b) && epx.f(this.c, u2eVar.c) && epx.f(this.d, u2eVar.d) && this.e == u2eVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(fw3.a(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFavoriteFolder(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", coverImages=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", count=");
        return vu5.b(sb, this.e, ')');
    }
}
