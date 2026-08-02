package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoAlbum;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kfc0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FragmentImpl c;

    public /* synthetic */ kfc0(int i, FragmentImpl fragmentImpl) {
        this.b = i;
        this.c = fragmentImpl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        FragmentImpl fragmentImpl = this.c;
        switch (i2) {
            case 0:
                ((PostingFragment) fragmentImpl).h0.R7();
                break;
            default:
                VideoAlbumFragment videoAlbumFragment = (VideoAlbumFragment) fragmentImpl;
                int i3 = VideoAlbumFragment.i1;
                if (videoAlbumFragment.isResumed()) {
                    g7s0 B = fxc0.B();
                    FragmentActivity kn = videoAlbumFragment.kn();
                    VideoAlbum videoAlbum = videoAlbumFragment.d1;
                    B.v0(kn, videoAlbum.b, videoAlbum.f, new odc0(videoAlbumFragment, 26));
                    videoAlbumFragment.finish();
                    break;
                }
                break;
        }
    }
}
