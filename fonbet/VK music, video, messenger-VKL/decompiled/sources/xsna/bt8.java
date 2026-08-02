package xsna;

import android.view.View;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedVideosAdapter;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((dt8) obj).p.dismiss();
                break;
            case 1:
                ((hvg) obj).h5();
                break;
            case 2:
                ((gzs) obj).invoke();
                break;
            case 3:
                int i2 = m760.A;
                ((m760) obj).Dn(DialogResultState.OUTSIDE);
                break;
            case 4:
                ((xwd0) obj).h6();
                break;
            case 5:
                ((izs) obj).invoke(view);
                break;
            case 6:
                VideoAlbumEditorFragment videoAlbumEditorFragment = (VideoAlbumEditorFragment) obj;
                int i3 = VideoAlbumEditorFragment.l0;
                if (!fxc0.B().J().U1()) {
                    fxc0.B().Y().r(videoAlbumEditorFragment.a0, new jbs(videoAlbumEditorFragment));
                    break;
                } else {
                    ydt0 Y = fxc0.B().Y();
                    videoAlbumEditorFragment.requireContext();
                    Y.getClass();
                    break;
                }
            default:
                ((VideoRelatedVideosAdapter) obj).o.invoke();
                break;
        }
    }
}
