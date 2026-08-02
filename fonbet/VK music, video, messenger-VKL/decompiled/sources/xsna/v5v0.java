package xsna;

import android.content.ContextWrapper;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkMusicGlobalEventManager.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class v5v0 extends FunctionReferenceImpl implements izs<yj40, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(yj40 yj40Var) {
        int i;
        CharSequence a;
        String obj;
        ContextWrapper c;
        ContextWrapper c2;
        ContextWrapper c3;
        ContextWrapper c4;
        yj40 yj40Var2 = yj40Var;
        w5v0 w5v0Var = (w5v0) this.receiver;
        w5v0Var.getClass();
        if (yj40Var2 instanceof fa50) {
            fa50 fa50Var = (fa50) yj40Var2;
            if (fa50Var.c && (c4 = w5v0Var.c()) != null) {
                int i2 = jnj.h(ob50.c(fa50Var.a)) ? R.string.music_player_snack_bar_track_added_in_kids_favorite : R.string.music_player_snack_bar_track_added_in_favorite;
                w7k0 b = w5v0Var.b();
                int a2 = w5v0Var.a();
                b.getClass();
                w7k0.a(i2, a2, c4);
            }
        } else if (yj40Var2 instanceof yd50) {
            yd50 yd50Var = (yd50) yj40Var2;
            if (yd50Var.d && (c3 = w5v0Var.c()) != null) {
                if (jnj.h(ob50.c(yd50Var.a))) {
                    w7k0.d(w5v0Var.b(), c3, R.string.music_player_snack_bar_track_remove_from_kids_favorite);
                } else {
                    w7k0 b2 = w5v0Var.b();
                    int a3 = w5v0Var.a();
                    bwg bwgVar = new bwg(w5v0Var, c3, yd50Var, 10);
                    b2.getClass();
                    w7k0.c(c3, R.string.music_player_snack_bar_track_remove_from_favorite, a3, bwgVar);
                }
            }
        } else if (yj40Var2 instanceof hb50) {
            hb50 hb50Var = (hb50) yj40Var2;
            ContextWrapper c5 = w5v0Var.c();
            if (c5 != null) {
                w7k0 b3 = w5v0Var.b();
                boolean b4 = hb50Var.b();
                boolean d = jnj.d(ob50.c(hb50Var.a));
                w7k0.e(b3, c5, (b4 && d) ? R.string.music_player_snack_bar_kids_track_removed_from_recommendations_and_my_music : b4 ? R.string.music_player_snack_bar_track_removed_from_recommendations_and_my_music : d ? R.string.music_kids_track_removed_from_recommendations : R.string.music_track_removed_from_recommendations, new dm(w5v0Var, hb50Var, c5, 4));
            }
        } else if (yj40Var2 instanceof gb50) {
            gb50 gb50Var = (gb50) yj40Var2;
            if (gb50Var.b() && (c2 = w5v0Var.c()) != null) {
                w7k0.d(w5v0Var.b(), c2, jnj.d(ob50.c(gb50Var.a)) ? R.string.music_kids_track_will_be_in_recommendations : R.string.music_track_will_be_in_recommendations);
            }
        } else if (yj40Var2 instanceof reb0) {
            ContextWrapper c6 = w5v0Var.c();
            if (c6 != null) {
                w7k0.d(w5v0Var.b(), c6, R.string.music_player_snack_bar_track_added_to_playlist);
            }
        } else if (yj40Var2 instanceof b9b0) {
            b9b0 b9b0Var = (b9b0) yj40Var2;
            ContextWrapper c7 = w5v0Var.c();
            if (c7 != null) {
                boolean z = b9b0Var.c;
                Playlist playlist = b9b0Var.a;
                if (z) {
                    w7k0.d(w5v0Var.b(), c7, (playlist.Eb() && jnj.d(xx1.j(playlist))) ? R.string.music_snackbar_album_follow_in_kids_collection : playlist.Eb() ? R.string.music_snackbar_album_follow : jnj.d(xx1.j(playlist)) ? R.string.music_snackbar_playlist_follow_in_kids_collection : R.string.music_snackbar_playlist_follow);
                } else {
                    w7k0.e(w5v0Var.b(), c7, (playlist.Eb() && jnj.d(xx1.j(playlist))) ? R.string.music_snackbar_album_unfollow_in_kids_collection : playlist.Eb() ? R.string.music_snackbar_album_unfollow : jnj.d(xx1.j(playlist)) ? R.string.music_snackbar_playlist_unfollow_in_kids_collection : R.string.music_snackbar_playlist_unfollow, new sy4(b9b0Var, w5v0Var, c7, 7));
                }
            }
        } else if (yj40Var2 instanceof gcb0) {
            ContextWrapper c8 = w5v0Var.c();
            if (c8 != null) {
                w7k0.d(w5v0Var.b(), c8, R.string.music_snackbar_playlist_deletion);
            }
        } else if (yj40Var2 instanceof fi40) {
            fi40 fi40Var = (fi40) yj40Var2;
            if (fi40Var.c() && (c = w5v0Var.c()) != null) {
                w7k0.d(w5v0Var.b(), c, fi40Var.b().Eb() ? R.string.music_snackbar_album_delete_from_downloads : R.string.music_snackbar_playlist_delete_from_downloads);
            }
        } else if (yj40Var2 instanceof a7b0) {
            ContextWrapper c9 = w5v0Var.c();
            if (c9 != null) {
                w7k0.d(w5v0Var.b(), c9, R.string.music_toast_add_to_play_next_playlist);
            }
        } else if (yj40Var2 instanceof lvp) {
            lvp lvpVar = (lvp) yj40Var2;
            ContextWrapper c10 = w5v0Var.c();
            if (c10 != null && (a = lvpVar.getMessage().a(c10)) != null && (obj = a.toString()) != null) {
                w7k0.f(w5v0Var.b(), c10, obj);
            }
        } else if (yj40Var2 instanceof xs20) {
            xs20 xs20Var = (xs20) yj40Var2;
            ContextWrapper c11 = w5v0Var.c();
            if (c11 != null) {
                String b5 = xs20Var.b();
                if (epx.f(b5, "playlist_mix")) {
                    i = R.string.music_snackbar_mix_by_playlist_not_found;
                } else if (epx.f(b5, "album_mix")) {
                    i = R.string.music_snackbar_mix_by_album_not_found;
                }
                w7k0.d(w5v0Var.b(), c11, i);
            }
        }
        return s3q0.a;
    }
}
