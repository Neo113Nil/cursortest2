package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: LoadPlaylistState.kt */
/* loaded from: classes3.dex */
public final class hqz implements jqz {
    public final Playlist a;
    public final List<MusicTrack> b;
    public final LinkedHashMap c;

    public hqz(Playlist playlist, List list, LinkedHashMap linkedHashMap) {
        this.a = playlist;
        this.b = list;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqz)) {
            return false;
        }
        hqz hqzVar = (hqz) obj;
        return this.a.equals(hqzVar.a) && epx.f(this.b, hqzVar.b) && this.c.equals(hqzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Offline(playlist=" + this.a + ", tracks=" + this.b + ", albumParts=" + this.c + ')';
    }
}
