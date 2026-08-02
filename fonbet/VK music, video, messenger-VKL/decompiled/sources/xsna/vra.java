package xsna;

import android.content.Context;
import com.vk.dto.video.VideoAlbum;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;

/* compiled from: ChangeAlbumSubscription.kt */
/* loaded from: classes16.dex */
public final class vra {
    public static void a(Context context, VideoAlbum videoAlbum, String str, gzs gzsVar) {
        new x2j(context, context.getString(R.string.unsubscribe_video_playlist_title), new SchemeStat$EventItem(SchemeStat$EventItem.Type.ALBUM, Long.valueOf(videoAlbum.b), Long.valueOf(videoAlbum.c.b), null, null, null, 56, null), new ura(context, videoAlbum, str, gzsVar, 0)).c();
    }
}
