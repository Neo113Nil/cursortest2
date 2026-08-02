package xsna;

import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import java.util.Iterator;
import java.util.List;

/* compiled from: UpdatePlaylistAttachCmd.kt */
/* loaded from: classes2.dex */
public final class z8q0 extends le6<s3q0> {
    public final Playlist b;

    public z8q0(Playlist playlist) {
        this.b = playlist;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Iterator it = ((List) w2wVar.I0().u(new qyi0(this, 10))).iterator();
        while (it.hasNext()) {
            w2wVar.S0().O((AttachPlaylist) it.next());
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8q0) && epx.f(this.b, ((z8q0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdatePlaylistAttachCmd(playlist=" + this.b + ')';
    }
}
