package xsna;

import com.vk.libvideo.ui.VideoHideView;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import xsna.hxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xvr0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ xvr0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((i0b0) izsVar).invoke(obj);
                break;
            case 1:
                int i2 = VideoHideView.A;
                ((i0b0) izsVar).invoke(obj);
                break;
            case 2:
                ((i0b0) izsVar).invoke(obj);
                break;
            case 3:
                ((z7t0) izsVar).invoke(obj);
                break;
            case 4:
                ((z7t0) izsVar).invoke(obj);
                break;
            case 5:
                ((g2h0) izsVar).invoke(obj);
                break;
            case 6:
                ((z7t0) izsVar).invoke(obj);
                break;
            case 7:
                int i3 = VoipQrCodeScannerFragment.W;
                ((z7t0) izsVar).invoke(obj);
                break;
            case 8:
                ((hxw0.a) izsVar).invoke(obj);
                break;
            default:
                int i4 = VoipSelectEffectInCallFragment.Q;
                ((g2h0) izsVar).invoke(obj);
                break;
        }
    }
}
