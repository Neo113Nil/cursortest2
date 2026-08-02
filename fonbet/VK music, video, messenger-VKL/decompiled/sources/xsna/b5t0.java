package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b5t0 implements zzs {
    public final /* synthetic */ VideoPlaylistRootVh b;

    public /* synthetic */ b5t0(VideoPlaylistRootVh videoPlaylistRootVh) {
        this.b = videoPlaylistRootVh;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) obj3;
        int intValue = ((Integer) obj4).intValue();
        String str = uIBlockVideoAlbum.f;
        String str2 = uIBlockVideoAlbum.y.d;
        VideoPlaylistRootVh videoPlaylistRootVh = this.b;
        VideoPlaylistRootVh.p0(videoPlaylistRootVh, (VideoFile) obj, (List) obj2, str, str2, videoPlaylistRootVh.L, intValue, null, 64);
        return s3q0.a;
    }
}
