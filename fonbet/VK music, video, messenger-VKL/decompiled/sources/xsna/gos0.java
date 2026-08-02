package xsna;

import com.vk.libvideo.design.view.video.VideoView;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gos0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gos0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = VideoGrowthComponentImpl.k;
                return new tos0();
            case 1:
                return new i1t0(true, bo.h());
            case 2:
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                return new pz9();
            case 3:
                return tlo0.Companion.serializer();
            case 4:
                return com.vk.toggle.d.r();
            default:
                r55 r55Var = r55.a;
                Object i = r55.i();
                tou0 tou0Var = i instanceof tou0 ? (tou0) i : null;
                if (tou0Var != null) {
                    return tou0Var.a();
                }
                return null;
        }
    }
}
