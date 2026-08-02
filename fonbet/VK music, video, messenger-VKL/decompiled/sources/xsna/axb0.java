package xsna;

import android.text.ClipboardManager;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import com.vk.dto.common.VideoAlbum;
import com.vk.video.ui.albums.fragments.VideoAlbumsFragment;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: PopupMenu.java */
/* loaded from: classes11.dex */
public final class axb0 implements f.a {
    public final /* synthetic */ cxb0 b;

    public axb0(cxb0 cxb0Var) {
        this.b = cxb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.f.a
    public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
        VideoAlbumsFragment.d.a aVar = this.b.d;
        if (aVar == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.edit_album) {
            VideoAlbumsFragment.d dVar = VideoAlbumsFragment.d.this;
            fxc0.B().Y().F(((VideoAlbum) dVar.m).d(), new jbs(VideoAlbumsFragment.this));
            return true;
        }
        if (itemId == R.id.remove_album) {
            VideoAlbumsFragment.d dVar2 = VideoAlbumsFragment.d.this;
            VideoAlbumsFragment videoAlbumsFragment = VideoAlbumsFragment.this;
            VideoAlbum videoAlbum = (VideoAlbum) dVar2.m;
            int adapterPosition = dVar2.getAdapterPosition();
            h7u0.a aVar2 = new h7u0.a(videoAlbumsFragment.getActivity());
            aVar2.g0(R.string.confirm);
            aVar2.U(R.string.delete_video_album_confirm);
            aVar2.c0(R.string.yes, new k1s0(videoAlbumsFragment, videoAlbum, adapterPosition));
            aVar2.W(R.string.no, null);
            aVar2.m();
            return true;
        }
        if (itemId != R.id.copy_link) {
            return true;
        }
        VideoAlbumsFragment.d dVar3 = VideoAlbumsFragment.d.this;
        VideoAlbumsFragment videoAlbumsFragment2 = VideoAlbumsFragment.this;
        VideoAlbum videoAlbum2 = (VideoAlbum) dVar3.m;
        ((ClipboardManager) videoAlbumsFragment2.getActivity().getSystemService("clipboard")).setText("https://" + a0a.d + "/videos" + videoAlbum2.f + "?section=album_" + videoAlbum2.b);
        cvk.u(R.string.link_copied, false);
        return true;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
    }
}
