package xsna;

import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.core.ui.VKToolbar;
import com.vk.voip.OKVoipEngine;
import xsna.ds60;
import xsna.hwc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvc0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xvc0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return e43.l(hwc0.a.C3025a.b, new bwc0(ds60.a.C2747a.b), new bwc0(ds60.a.b.b));
            case 1:
                return new zi50();
            case 2:
                return iik0.d;
            case 3:
                int i = StoryAttachImageView.t;
                return s3q0.a;
            case 4:
                return new rsl0();
            case 5:
                return s3q0.a;
            case 6:
                int i2 = VKToolbar.W;
                return new mup0();
            case 7:
                return (lfv0) jfv0.r.getValue();
            case 8:
                return asu0.a.c();
            default:
                OKVoipEngine.b.getClass();
                return OKVoipEngine.A().getScreenshareState();
        }
    }
}
