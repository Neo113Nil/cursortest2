package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoAlbum;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;

/* compiled from: VideoAlbumsFragment.java */
/* loaded from: classes7.dex */
public final class l1s0 extends beg0 {
    public final /* synthetic */ VideoAlbum d;
    public final /* synthetic */ int e;
    public final /* synthetic */ VideoAlbumsFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1s0(VideoAlbumsFragment videoAlbumsFragment, FragmentActivity fragmentActivity, VideoAlbum videoAlbum, int i) {
        super(fragmentActivity);
        this.f = videoAlbumsFragment;
        this.d = videoAlbum;
        this.e = i;
    }

    @Override // xsna.beg0
    public final void r() {
        int i = VideoAlbumsFragment.P0;
        VideoAlbumsFragment videoAlbumsFragment = this.f;
        videoAlbumsFragment.v0.remove(this.d);
        videoAlbumsFragment.wo().notifyItemRemoved(this.e);
        videoAlbumsFragment.q();
    }
}
