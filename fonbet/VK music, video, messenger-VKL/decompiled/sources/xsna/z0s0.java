package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;

/* compiled from: VideoAlbumEditorFragment.kt */
/* loaded from: classes7.dex */
public final class z0s0 extends rpj0<Integer> {
    public final /* synthetic */ VideoAlbumEditorFragment d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0s0(VideoAlbumEditorFragment videoAlbumEditorFragment, String str, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.d = videoAlbumEditorFragment;
        this.e = str;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        Integer num = (Integer) obj;
        VideoAlbum videoAlbum = new VideoAlbum(false);
        videoAlbum.e = 0;
        if (num != null) {
            videoAlbum.b = num.intValue();
        }
        VideoAlbumEditorFragment videoAlbumEditorFragment = this.d;
        UserId userId = videoAlbumEditorFragment.h0;
        videoAlbum.f = userId;
        if (userId.b == 0) {
            videoAlbum.f = o25.a().c();
        }
        videoAlbum.i = videoAlbumEditorFragment.a0.e;
        videoAlbum.c = this.e;
        videoAlbum.h = pvo0.a();
        com.vk.dto.video.VideoAlbum d = videoAlbum.d();
        wjs0.a(new ewr0(d));
        FragmentActivity kn = videoAlbumEditorFragment.kn();
        videoAlbumEditorFragment.Mf(-1, new Intent().putExtra("album", videoAlbum));
        if (videoAlbumEditorFragment.kn().isFinishing()) {
            ea0.a(kn, new hvr0(d, 1));
        } else {
            new w0s0(kn).a(d);
        }
    }
}
