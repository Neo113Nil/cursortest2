package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import xsna.lyr0;
import xsna.yfs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xat0 implements izs {
    public final /* synthetic */ yat0 b;
    public final /* synthetic */ yfs0.a c;
    public final /* synthetic */ io.reactivex.rxjava3.internal.operators.observable.s0 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ xat0(yat0 yat0Var, yfs0.a aVar, io.reactivex.rxjava3.internal.operators.observable.s0 s0Var, boolean z) {
        this.b = yat0Var;
        this.c = aVar;
        this.d = s0Var;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hfz aVar;
        lyr0.a aVar2 = (lyr0.a) obj;
        yfs0.a aVar3 = this.c;
        VideoFile videoFile = aVar3.a;
        VideoRecommendationVideosType videoRecommendationVideosType = aVar3.d;
        String str = aVar3.f;
        yat0 yat0Var = this.b;
        sat0 sat0Var = yat0Var.j;
        sat0Var.getClass();
        dnz dnzVar = new dnz(new csl0(sat0Var, this.e, 1), 26);
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = this.d;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = io.reactivex.rxjava3.core.q.m(io.reactivex.rxjava3.core.q.q(s0Var, s0Var.s0(dnzVar)), yat0Var.h, new e4t(new j21((byte) 0, 14), 20)).L(new xhb0(new c4q0(yat0Var, 6), 14), false).U(new xb20(new vat0(yat0Var, videoFile, videoRecommendationVideosType, aVar2, str), 24));
        vfs0 vfs0Var = new vfs0();
        if (!gsi0.b().c) {
            vfs0Var = null;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            String P = videoFile.P();
            if (P == null) {
                P = "";
            }
            aVar = new AboutVideoItem.w.a(P);
        } else {
            aVar = AboutVideoItem.w.c.b;
        }
        return U.d0(rl3.I(new hfz[]{AboutVideoItem.k.b, vfs0Var, aVar, gsi0.b().c ? new pfs0() : null}));
    }
}
