package xsna;

import com.vk.clips.favorites.impl.ui.folders.picker.a;

/* compiled from: ClipsFavoritesFoldersPickerItem.kt */
/* loaded from: classes16.dex */
public final class v4e implements hfz {
    public final a.f b;
    public final boolean c;

    public v4e(a.f fVar, boolean z) {
        this.b = fVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4e)) {
            return false;
        }
        v4e v4eVar = (v4e) obj;
        return this.b.equals(v4eVar.b) && this.c == v4eVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateFolder(clickAction=");
        sb.append(this.b);
        sb.append(", isDisabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
