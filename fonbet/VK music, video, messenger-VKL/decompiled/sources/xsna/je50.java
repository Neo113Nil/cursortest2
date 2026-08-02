package xsna;

import android.content.Context;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: MusicUI.kt */
/* loaded from: classes3.dex */
public final class je50 {
    public static String a(Context context, Playlist playlist) {
        return playlist.Eb() ? context.getString(R.string.music_title_album) : context.getString(R.string.music_title_playlist);
    }

    public static void b(Context context, Playlist playlist, gzs gzsVar) {
        String string = (playlist.S4() && jnj.h(playlist.O)) ? context.getString(R.string.music_alert_remove_entity_with_cache_from_collection, cqm0.m(a(context, playlist))) : playlist.S4() ? context.getString(R.string.music_alert_remove_entity_with_cache, cqm0.m(a(context, playlist))) : (playlist.Eb() && jnj.h(playlist.O)) ? context.getString(R.string.music_alert_unfollow_album_from_collection_message) : playlist.Eb() ? context.getString(R.string.music_alert_unfollow_album_message) : xx1.w(playlist) ? context.getString(R.string.music_alert_remove_playlist_message) : jnj.h(playlist.O) ? context.getString(R.string.music_alert_unfollow_playlist_from_collection_message) : context.getString(R.string.music_alert_unfollow_playlist_message);
        String string2 = playlist.S4() ? context.getString(R.string.music_alert_remove_entity_title, a(context, playlist)) : context.getString(R.string.music_remove_confirmation);
        h7u0.a aVar = new h7u0.a(context);
        aVar.h0(string2);
        aVar.a.f = string;
        aVar.c0(R.string.delete, new wgd(gzsVar, 2));
        aVar.W(R.string.cancel, new ie50(0));
        aVar.m();
    }
}
