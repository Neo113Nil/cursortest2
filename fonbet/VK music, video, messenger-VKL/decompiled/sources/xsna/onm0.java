package xsna;

import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import xsna.lgv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class onm0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ onm0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((qnm0) izsVar).invoke(obj);
                break;
            case 1:
                ((ksg0) izsVar).invoke(obj);
                break;
            case 2:
                ((i7h) izsVar).invoke(obj);
                break;
            case 3:
                ((q8i0) izsVar).invoke(obj);
                break;
            case 4:
                ((ksg0) izsVar).invoke(obj);
                break;
            case 5:
                ((q7a0) izsVar).invoke(obj);
                break;
            case 6:
                int i2 = VideoEmbedFragment.q0;
                ((ksg0) izsVar).invoke(obj);
                break;
            case 7:
                int i3 = VideoLiveFragment.i0;
                ((ksg0) izsVar).invoke(obj);
                break;
            case 8:
                ((q7a0) izsVar).invoke(obj);
                break;
            case 9:
                ((q7a0) izsVar).invoke(obj);
                break;
            case 10:
                ((ksg0) izsVar).invoke((Boolean) obj);
                break;
            case 11:
                ((lgv0.b) izsVar).invoke(obj);
                break;
            case 12:
                ((sc5) izsVar).invoke(obj);
                break;
            case 13:
                int i4 = VoipCallServiceFragment.Y;
                ((biw0) izsVar).invoke(obj);
                break;
            default:
                ((biw0) izsVar).invoke(obj);
                break;
        }
    }
}
