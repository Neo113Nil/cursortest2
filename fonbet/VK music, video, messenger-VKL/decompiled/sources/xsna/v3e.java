package xsna;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFoldersListItem.kt */
/* loaded from: classes16.dex */
public final class v3e implements hfz {
    public final UserId b;
    public final FavoriteFolderId c;
    public final List<Image> d;
    public final tlo0.h e;
    public final tlo0 f;

    public v3e(UserId userId, FavoriteFolderId favoriteFolderId, List list, tlo0.h hVar, tlo0 tlo0Var) {
        this.b = userId;
        this.c = favoriteFolderId;
        this.d = list;
        this.e = hVar;
        this.f = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e)) {
            return false;
        }
        v3e v3eVar = (v3e) obj;
        return epx.f(this.b, v3eVar.b) && epx.f(this.c, v3eVar.c) && epx.f(this.d, v3eVar.d) && this.e.equals(v3eVar.e) && this.f.equals(v3eVar.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.hashCode());
    }

    public final int hashCode() {
        return this.f.hashCode() + u11.c(fw3.a((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d), 31, this.e.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(ownerId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", coverImages=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        return bt.a(sb, this.f, ')');
    }
}
