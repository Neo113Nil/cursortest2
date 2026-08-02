package xsna;

import android.content.DialogInterface;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ofn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ofn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = DisplayMusicPlaylistFragment.b0;
                k840.a.d().H();
                ((com.vk.music.playlist.display.domain.b) obj).C(a.InterfaceC1338a.C1339a.b);
                dialogInterface.dismiss();
                break;
            default:
                int i4 = a5g0.k1;
                ((com.google.android.material.bottomsheet.b) ((a5g0) obj).s).o().X(3);
                break;
        }
    }
}
