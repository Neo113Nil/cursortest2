package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
/* loaded from: classes3.dex */
public final class s0p implements VkCell.f {
    public final MusicTrack a;
    public final boolean b;

    public s0p(MusicTrack musicTrack, boolean z) {
        this.a = musicTrack;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0p)) {
            return false;
        }
        s0p s0pVar = (s0p) obj;
        return epx.f(this.a, s0pVar.a) && this.b == s0pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditPlaylistTrackActionParams(item=");
        sb.append(this.a);
        sb.append(", isRemoved=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
