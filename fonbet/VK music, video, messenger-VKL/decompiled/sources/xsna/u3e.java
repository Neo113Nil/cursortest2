package xsna;

import com.vk.clips.favorites.impl.ui.folders.list.a;

/* compiled from: ClipsFavoriteFoldersListItem.kt */
/* loaded from: classes16.dex */
public final class u3e implements hfz {
    public final a.b b;
    public final boolean c;

    public u3e(a.b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3e)) {
            return false;
        }
        u3e u3eVar = (u3e) obj;
        return this.b.equals(u3eVar.b) && this.c == u3eVar.c;
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
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
