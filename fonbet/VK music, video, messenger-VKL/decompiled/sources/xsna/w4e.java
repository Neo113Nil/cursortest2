package xsna;

import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: ClipsFavoritesFoldersPickerItem.kt */
/* loaded from: classes16.dex */
public final class w4e implements hfz {
    public final FavoriteFolderId b;
    public final List<Image> c;
    public final String d;
    public final boolean e;
    public final a.f f;
    public final boolean g;

    public w4e(FavoriteFolderId favoriteFolderId, List list, String str, boolean z, a.f fVar, boolean z2) {
        this.b = favoriteFolderId;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = fVar;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4e)) {
            return false;
        }
        w4e w4eVar = (w4e) obj;
        return epx.f(this.b, w4eVar.b) && epx.f(this.c, w4eVar.c) && epx.f(this.d, w4eVar.d) && this.e == w4eVar.e && this.f.equals(w4eVar.f) && this.g == w4eVar.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + qoy.b(urd0.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id=");
        sb.append(this.b);
        sb.append(", coverImages=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", isSelected=");
        sb.append(this.e);
        sb.append(", clickAction=");
        sb.append(this.f);
        sb.append(", isDisabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
