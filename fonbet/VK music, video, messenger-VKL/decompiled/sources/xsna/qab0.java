package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.share.api.ShareItemType;
import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: PlaylistLink.kt */
/* loaded from: classes14.dex */
public final class qab0 implements kss0 {
    public final Object a;

    public qab0(Lazy<? extends com.vk.video.ui.share.api.b> lazy) {
        this.a = lazy;
    }

    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("/(?:video/)?playlist/([-0-9]+)_([-0-9]+)", peq0Var, null, null, 14);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        Uri uri = peq0Var.a;
        VideoAlbum videoAlbum = new VideoAlbum(peq0Var.b(2), new UserId(peq0Var.c(1)), context.getString(R.string.album), null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null);
        com.vk.video.ui.share.api.b bVar = (com.vk.video.ui.share.api.b) this.a.getValue();
        if (bVar != null) {
            bVar.a(ShareItemType.VIDEO_PLAYLIST, uri.toString(), peq0Var.c(2), peq0Var.c(1));
        }
        Activity h = e3m.h(context);
        if (h != null) {
            ydt0Var.C(h, videoAlbum, launchContext.d, uri.toString(), launchContext.s);
        }
        return null;
    }
}
