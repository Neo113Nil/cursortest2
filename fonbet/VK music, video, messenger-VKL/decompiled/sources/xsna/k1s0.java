package xsna;

import android.content.DialogInterface;
import com.vk.dto.common.VideoAlbum;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;

/* compiled from: VideoAlbumsFragment.java */
/* loaded from: classes7.dex */
public final class k1s0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ VideoAlbum b;
    public final /* synthetic */ int c;
    public final /* synthetic */ VideoAlbumsFragment d;

    public k1s0(VideoAlbumsFragment videoAlbumsFragment, VideoAlbum videoAlbum, int i) {
        this.d = videoAlbumsFragment;
        this.b = videoAlbum;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoAlbum videoAlbum = this.b;
        tm4 tm4Var = new tm4(videoAlbum.f, videoAlbum.b);
        VideoAlbumsFragment videoAlbumsFragment = this.d;
        jx2 jx2Var = new jx2(tm4Var, new l1s0(videoAlbumsFragment, videoAlbumsFragment.getActivity(), videoAlbum, this.c));
        jx2Var.g = videoAlbumsFragment.getActivity();
        jx2Var.a();
    }
}
