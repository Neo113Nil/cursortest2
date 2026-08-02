package xsna;

import android.content.DialogInterface;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yb5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yb5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                ((com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) obj).eo().b(f75.b);
                dialogInterface.dismiss();
                break;
            case 1:
                zkd zkdVar = ((rgd) obj).b.d.w;
                zkdVar.a.d(8, zkdVar.b, new oa(13));
                break;
            case 2:
                int i3 = DisplayMusicPlaylistFragment.b0;
                k840.a.d().S(true);
                ((com.vk.music.playlist.display.domain.b) obj).C(a.InterfaceC1338a.C1339a.b);
                dialogInterface.dismiss();
                break;
            default:
                gzs gzsVar = (gzs) obj;
                int i4 = VkFastLoginView.v;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
