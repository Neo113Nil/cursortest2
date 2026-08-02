package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.masks.Mask;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipVirtualBackgroundControllerImpl.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class e5x0 extends FunctionReferenceImpl implements izs<Mask, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Mask mask) {
        Mask mask2 = mask;
        h5x0 h5x0Var = (h5x0) this.receiver;
        if (epx.f(h5x0Var.p, mask2)) {
            MasksWrap masksWrap = h5x0Var.g;
            int i = MasksWrap.e0;
            masksWrap.I(true);
        }
        if (h5x0Var.h().c().equals(mask2.Db())) {
            h5x0Var.h().b();
        }
        return s3q0.a;
    }
}
