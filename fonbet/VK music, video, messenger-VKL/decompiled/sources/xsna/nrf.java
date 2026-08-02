package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import xsna.npf;
import xsna.xn50;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final class nrf implements izs<Integer, s3q0> {
    public final /* synthetic */ ClipsWrapperFragment b;

    public nrf(ClipsWrapperFragment clipsWrapperFragment) {
        this.b = clipsWrapperFragment;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Integer num) {
        npf.b bVar = new npf.b(num.intValue());
        ClipsWrapperFragment clipsWrapperFragment = this.b;
        clipsWrapperFragment.getClass();
        xn50.a.c(clipsWrapperFragment, bVar);
        return s3q0.a;
    }
}
