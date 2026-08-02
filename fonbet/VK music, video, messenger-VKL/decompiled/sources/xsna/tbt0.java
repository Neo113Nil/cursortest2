package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tbt0 implements izs {
    public final /* synthetic */ VideoAlbum b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.vk.video.ui.discovery.minimizable.dialog.related_videos.d e;

    public /* synthetic */ tbt0(VideoAlbum videoAlbum, boolean z, boolean z2, com.vk.video.ui.discovery.minimizable.dialog.related_videos.d dVar) {
        this.b = videoAlbum;
        this.c = z;
        this.d = z2;
        this.e = dVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        VideoAlbum videoAlbum = this.b;
        if (booleanValue) {
            boolean z = this.c;
            videoAlbum.l = z;
            if (this.d) {
                this.e.j.b(new i.f(z));
            }
            wjs0.a(new jwr0(videoAlbum, !videoAlbum.l ? "albums_unsubscribe" : "albums_subscribe"));
        } else {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            j03.l(new VKApiException(context.getString(videoAlbum.l ? R.string.video_playlist_unsubscribe_fail : R.string.video_playlist_subscribe_fail)));
        }
        return s3q0.a;
    }
}
