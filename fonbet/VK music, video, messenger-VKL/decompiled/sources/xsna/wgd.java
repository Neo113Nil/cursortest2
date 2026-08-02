package xsna;

import android.content.DialogInterface;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wgd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wgd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = ClipsAudioFragment.Y;
                ((ClipsAudioFragment) obj).dismiss();
                break;
            case 1:
                int i4 = MarketEditAlbumCoverFragment.d0;
                ((MarketEditAlbumCoverFragment) obj).finish();
                break;
            default:
                ((gzs) obj).invoke();
                break;
        }
    }
}
