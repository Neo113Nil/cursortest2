package xsna;

import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class u9d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u9d(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 3);
                qgi0.o(tgi0Var, this.c);
                return s3q0.a;
            default:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, new SmartCropState.CropVideoProgress(null, this.c, System.currentTimeMillis(), null, 9, null), false, false, null, 1919);
        }
    }
}
