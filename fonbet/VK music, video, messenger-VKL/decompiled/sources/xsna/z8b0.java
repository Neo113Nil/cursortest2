package xsna;

import android.content.Context;
import com.vk.dto.music.Playlist;
import xsna.tlo0;

/* compiled from: ErrorEvents.kt */
/* loaded from: classes3.dex */
public final class z8b0 implements lvp {
    public final tlo0.f a;
    public final Playlist b;

    public z8b0(int i, Playlist playlist) {
        this.a = tq.h(tlo0.Companion, i);
        this.b = playlist;
    }

    @Override // xsna.yj40
    public final String a() {
        StringBuilder sb = new StringBuilder("playlist id=");
        Playlist playlist = this.b;
        sb.append(playlist.b);
        sb.append(" ownerId=");
        sb.append(playlist.c.b);
        sb.append(": ");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        tlo0.f fVar = this.a;
        fVar.getClass();
        sb.append((Object) tlo0.b.a(fVar, context));
        return sb.toString();
    }

    @Override // xsna.lvp
    public final tlo0 getMessage() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistErrorEvent";
    }
}
