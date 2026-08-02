package xsna;

import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistPermissions;
import java.util.ArrayList;
import xsna.vab0;

/* compiled from: VkPlaylistMenuItemsFactory.kt */
/* loaded from: classes3.dex */
public final class mdv0 implements abb0 {
    public final Playlist a;
    public final u2b0 b;

    public mdv0(Playlist playlist, u2b0 u2b0Var) {
        this.a = playlist;
        this.b = u2b0Var;
    }

    @Override // xsna.abb0
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Playlist playlist = this.a;
        if (!jnj.d(playlist.O) && playlist.v > 0) {
            if (playlist.Eb()) {
                arrayList.add(vab0.b.d.b);
            } else {
                arrayList.add(vab0.b.l.b);
            }
        }
        if (xx1.e(playlist.Bb(o25.a().c()))) {
            arrayList.add(vab0.b.h.b);
        }
        boolean z = true;
        if (xx1.d(playlist)) {
            PlaylistPermissions playlistPermissions = playlist.B;
            if (!((playlistPermissions != null ? playlistPermissions.g : false) && (xx1.w(xx1.m(playlist)) || xx1.e(xx1.m(playlist))))) {
                if (jnj.h(playlist.O)) {
                    arrayList.add(vab0.b.m.b);
                } else {
                    arrayList.add(vab0.b.n.b);
                }
            }
        } else if (xx1.b(playlist)) {
            if (jnj.h(playlist.O)) {
                arrayList.add(vab0.b.a.b);
            } else {
                arrayList.add(vab0.b.c.b);
            }
        }
        if (sp.f(this.b) && !playlist.Fb() && playlist.v > 0) {
            arrayList.add(vab0.b.k.b);
        }
        if (xx1.t(playlist)) {
            arrayList.add(vab0.b.j.b);
        } else if (xx1.s(playlist)) {
            arrayList.add(vab0.b.i.b);
        }
        if ((playlist.Fb() || playlist.v <= 0 || xx1.x(playlist) || xx1.u(playlist)) ? false : true) {
            if (playlist.S4()) {
                arrayList.add(vab0.b.o.b);
            } else {
                arrayList.add(vab0.b.g.b);
            }
        }
        if (!playlist.Fb()) {
            PlaylistPermissions playlistPermissions2 = playlist.B;
            if (playlistPermissions2 != null ? playlistPermissions2.e : false) {
                arrayList.add(vab0.b.q.b);
                arrayList.add(vab0.b.p.b);
                arrayList.add(vab0.b.e.b);
            }
        }
        if (xx1.d(playlist)) {
            PlaylistPermissions playlistPermissions3 = playlist.B;
            if (!(playlistPermissions3 != null ? playlistPermissions3.g : false) || (!xx1.w(xx1.m(playlist)) && !xx1.e(xx1.m(playlist)))) {
                z = false;
            }
            if (z) {
                arrayList.add(vab0.b.f.b);
            }
        }
        return arrayList;
    }
}
