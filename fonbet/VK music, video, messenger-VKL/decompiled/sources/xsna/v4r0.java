package xsna;

import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v4r0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ v4r0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((p5e) izsVar).invoke(obj);
                break;
            case 1:
                int i2 = VideoContainerActivity.B;
                ((VideoContainerActivity.a) izsVar).invoke(obj);
                break;
            case 2:
                ((u2k0) izsVar).invoke(obj);
                break;
            case 3:
                ((ym1) izsVar).invoke(obj);
                break;
            case 4:
                ((kyq0) izsVar).invoke(obj);
                break;
            case 5:
                ((ixu0) izsVar).invoke(obj);
                break;
            case 6:
                int i3 = VoipSelectEffectInCallFragment.Q;
                ((hfv0) izsVar).invoke(obj);
                break;
            default:
                ((hfv0) izsVar).invoke(obj);
                break;
        }
    }
}
