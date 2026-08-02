package xsna;

import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q5g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ q5g(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                return s3q0.a;
            default:
                SmartCropFragmentInternalComponent.a aVar = SmartCropFragmentInternalComponent.g;
                SmartCropState smartCropState = (SmartCropState) gzsVar.invoke();
                return smartCropState == null ? new SmartCropState(null, null, null, null, null, 0L, false, null, false, false, null, 2047, null) : smartCropState;
        }
    }
}
