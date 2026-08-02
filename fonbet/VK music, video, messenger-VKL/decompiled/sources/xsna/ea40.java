package xsna;

import android.content.Context;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ar3;

/* compiled from: MusicArtistChooser.kt */
/* loaded from: classes3.dex */
public final class ea40 {
    public final wk40 a;

    public ea40(wk40 wk40Var) {
        this.a = wk40Var;
    }

    public final void a(Context context, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        ArrayList arrayList = new ArrayList();
        List list = musicTrack.t;
        arrayList.addAll(list != null ? list : EmptyList.b);
        List list2 = musicTrack.u;
        arrayList.addAll(list2 != null ? list2 : EmptyList.b);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Artist artist = (Artist) next;
            if (artist.Cb() || artist.Db()) {
                arrayList2.add(next);
            }
        }
        boolean equals = musicPlaybackLaunchContext.Gb().equals("kids_section");
        if (!arrayList2.isEmpty() && arrayList2.size() > 1) {
            new ar3.a(context, musicTrack, musicPlaybackLaunchContext, z).I0("ArtistListBottomSheet");
            return;
        }
        boolean isEmpty = arrayList2.isEmpty();
        wk40 wk40Var = this.a;
        if (isEmpty) {
            if (equals) {
                i0q0.f(new i3r(context, 2));
                return;
            } else {
                wk40Var.a(context, ob50.a(musicTrack));
                return;
            }
        }
        Artist artist2 = (Artist) j5g.Y(arrayList2);
        boolean Cb = artist2.Cb();
        int i = artist2.m;
        if (Cb && !jnj.j(i)) {
            wk40.d(this.a, context, artist2.b, musicPlaybackLaunchContext.t(), musicPlaybackLaunchContext.Gb(), null, 48);
        } else if (jnj.d(i)) {
            i0q0.f(new i3r(context, 2));
        } else {
            wk40Var.a(context, artist2.c);
        }
    }
}
