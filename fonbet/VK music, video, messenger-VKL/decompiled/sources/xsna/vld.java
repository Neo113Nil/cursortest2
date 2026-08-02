package xsna;

import android.content.DialogInterface;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vld implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ vld(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                dialogInterface.dismiss();
                break;
            default:
                int i2 = DisplayMusicPlaylistFragment.b0;
                dialogInterface.dismiss();
                break;
        }
    }
}
