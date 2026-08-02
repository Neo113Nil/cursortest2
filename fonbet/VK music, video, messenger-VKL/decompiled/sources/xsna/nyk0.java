package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.api.promo.stats.VkVideoDownloadRestrictionStatDelegateComponent;
import com.vk.log.L;
import com.vk.video.ui.share.impl.di.VideoShareComponentImpl;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class nyk0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nyk0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new Exception();
            case 1:
                return new myb0();
            case 2:
                return s3q0.a;
            case 3:
                return e43.l(new brg0(), new s0h0(), new klv(), new g4y0());
            case 4:
                return Boolean.valueOf(fxc0.B().J().L1());
            case 5:
                qcy<Object>[] qcyVarArr = VideoShareComponentImpl.c;
                return new lgt0();
            case 6:
                rau0 rau0Var = rau0.b;
                return Boolean.TRUE;
            case 7:
                return VkCell.Right.ExtraAction.Mode.Companion.serializer();
            case 8:
                return ((VkVideoDownloadRestrictionStatDelegateComponent) ((k7m) m7m.f(i0w0.b)).a(fpf0.a(VkVideoDownloadRestrictionStatDelegateComponent.class))).V6();
            default:
                L.e("VoipViewModelAudioDumpDelegate", "Call audio dump record started");
                p4x0.e(R.string.voip_local_dump_started, new Object[0]);
                return s3q0.a;
        }
    }
}
