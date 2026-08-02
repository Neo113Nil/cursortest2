package xsna;

import android.os.SystemClock;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.core.database.models.OfflinePlaylistType;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.nu70;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm20 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jm20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        JSONObject e5;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                km20 km20Var = (km20) obj;
                bpn0 bpn0Var = km20Var.c;
                sin0 sin0Var = km20Var.b;
                int i2 = nu70.b;
                nu70 a = nu70.a.a();
                if (a == null) {
                    ((com.vk.music.pref.a) bpn0Var.getValue()).k0();
                } else {
                    LinkedHashMap p = a.p();
                    for (ud50 ud50Var : p4g.q(p.values())) {
                        MusicTrack musicTrack = ud50Var.d;
                        String valueOf = String.valueOf(ud50Var.b);
                        String Fb = musicTrack.Fb();
                        String str = musicTrack.r;
                        String str2 = musicTrack.y;
                        Integer valueOf2 = Integer.valueOf(ud50Var.e);
                        String str3 = musicTrack.d;
                        String str4 = musicTrack.e;
                        String str5 = musicTrack.h;
                        List<Artist> list = musicTrack.t;
                        String jSONArray = list != null ? kvf.a(list).toString() : null;
                        List<Artist> list2 = musicTrack.u;
                        String jSONArray2 = list2 != null ? kvf.a(list2).toString() : null;
                        Thumb Jb = musicTrack.Jb();
                        sin0Var.execSQL("\n                INSERT INTO audio_track (\n                    id, uid, mid, access_key, track_code, \n                    downloading_state, title, subtitle, artist_name_fallback, \n                    main_artists, featured_artists, thumb, storage, url, manifest_url, \n                    duration, date, is_explicit, lyrics_id, is_focus_track, \n                    main_color, content_restriction, json_raw\n                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n            ", new Object[]{null, valueOf, Fb, str, str2, valueOf2, str3, str4, str5, jSONArray, jSONArray2, (Jb == null || (e5 = Jb.e5()) == null) ? null : e5.toString(), null, musicTrack.i, ud50Var.f, Integer.valueOf(musicTrack.f), Long.valueOf(musicTrack.z), Integer.valueOf(musicTrack.s ? 1 : 0), Integer.valueOf(musicTrack.n), Integer.valueOf(musicTrack.B ? 1 : 0), musicTrack.S, Integer.valueOf(musicTrack.g), musicTrack.e5().toString()});
                        bpn0Var = bpn0Var;
                    }
                    bpn0 bpn0Var2 = bpn0Var;
                    LinkedHashMap n = a.n();
                    for (vbb0 vbb0Var : p4g.q(n.values())) {
                        Playlist playlist = vbb0Var.d;
                        String valueOf3 = String.valueOf(vbb0Var.b);
                        String str6 = vbb0Var.c;
                        String valueOf4 = String.valueOf(playlist.c.b);
                        String str7 = playlist.x;
                        String str8 = playlist.F;
                        Integer valueOf5 = Integer.valueOf(vbb0Var.e);
                        OfflinePlaylistType.Companion.getClass();
                        Integer valueOf6 = Integer.valueOf((playlist.Eb() ? OfflinePlaylistType.ALBUM : OfflinePlaylistType.PLAYLIST).h());
                        String str9 = playlist.h;
                        String str10 = playlist.i;
                        String str11 = playlist.j;
                        Integer valueOf7 = Integer.valueOf(playlist.l);
                        List<Genre> list3 = playlist.n;
                        sin0Var.execSQL("\n                INSERT INTO playlist (\n                    id, uid, pid, owner_id, access_key, track_code,\n                    downloading_state, type, title, subtitle, description,\n                    year, genres, content_restriction, is_explicit, \n                    is_curator, is_exclusive, json_raw\n                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n            ", new Object[]{null, valueOf3, str6, valueOf4, str7, str8, valueOf5, valueOf6, str9, str10, str11, valueOf7, list3 != null ? kvf.a(list3).toString() : null, Integer.valueOf(playlist.I), Boolean.valueOf(playlist.k), Boolean.valueOf(playlist.J), Boolean.valueOf(playlist.M), playlist.e5().toString()});
                    }
                    Iterator it = a.o(p, n).iterator();
                    while (it.hasNext()) {
                        vfb0 vfb0Var = (vfb0) it.next();
                        sin0Var.execSQL("\n                INSERT INTO playlists_to_tracks (\n                    uid, music_track_id, playlist_id\n                ) VALUES (?, ?, ?)\n            ", new String[]{String.valueOf(vfb0Var.a), vfb0Var.b, vfb0Var.c});
                    }
                    ((com.vk.music.pref.a) bpn0Var2.getValue()).k0();
                }
                return s3q0.a;
            case 1:
                int i3 = com.vk.newsfeed.posting.geo_picker.presentation.e.t1;
                xn50.a.c((com.vk.newsfeed.posting.geo_picker.presentation.e) obj, new a.d.C1412a(SystemClock.elapsedRealtime()));
                return s3q0.a;
            default:
                return Integer.valueOf(((ncl0) obj).c1());
        }
    }
}
