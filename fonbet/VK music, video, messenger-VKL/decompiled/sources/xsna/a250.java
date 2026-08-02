package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Playlist;

/* compiled from: MusicPlaylistCellVh.kt */
/* loaded from: classes16.dex */
public final class a250 implements VkCell.f {
    public final Playlist a;
    public final boolean b;
    public final boolean c;

    public a250(Playlist playlist, boolean z, boolean z2) {
        this.a = playlist;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a250)) {
            return false;
        }
        a250 a250Var = (a250) obj;
        return epx.f(this.a, a250Var.a) && this.b == a250Var.b && this.c == a250Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlaylistRightExtraViewParams(playlist=");
        sb.append(this.a);
        sb.append(", isDownloadingVisible=");
        sb.append(this.b);
        sb.append(", isMenuVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
