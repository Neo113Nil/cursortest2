package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.ImFeatures;
import kotlin.Pair;
import xsna.drz;

/* compiled from: DialogsListLoader.kt */
/* loaded from: classes18.dex */
public final class ysm implements drz<xrm> {
    public final /* synthetic */ zrz a;

    public ysm(a1w a1wVar, int i, esz eszVar) {
        Object obj = new Object();
        fto0 fto0Var = new fto0();
        d000 pa2Var = BuildInfo.h() ? new pa2("PaginationLoaderInfo") : new edi(15);
        kuz kuzVar = new kuz(a1wVar, obj);
        evf0 evf0Var = new evf0(a1wVar, obj);
        rtm rtmVar = new rtm(a1wVar, obj, pa2Var);
        c40 c40Var = new c40(new lz0(rtmVar, 28), 16);
        io.reactivex.rxjava3.subjects.f<zsm> fVar = rtmVar.d;
        fVar.getClass();
        ctm ctmVar = new ctm(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(fVar, c40Var, io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new d9b(rtmVar, 1)), fto0Var, kuzVar, new inm(a1wVar), pa2Var);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        Pair pair = new Pair(asu0.i(), asu0Var.c());
        io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) pair.d();
        io.reactivex.rxjava3.core.w wVar2 = (io.reactivex.rxjava3.core.w) pair.g();
        blk blkVar = new blk();
        kci kciVar = new kci();
        nm0 nm0Var = new nm0(11);
        c4g0 c4g0Var = new c4g0();
        ImFeatures imFeatures = ImFeatures.FIX_DOUBLE_GET_CONVERSATIONS;
        imFeatures.getClass();
        this.a = new zrz(kuzVar, blkVar, evf0Var, kciVar, fto0Var, ctmVar, nm0Var, wVar, wVar2, i, pa2Var, c4g0Var, eszVar, com.vk.toggle.b.A.a(imFeatures));
    }

    @Override // xsna.drz
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // xsna.drz
    public final void b(String str) {
        this.a.b(str);
    }

    @Override // xsna.drz
    public final io.reactivex.rxjava3.core.q<drz.a<xrm>> getState() {
        return this.a.getState();
    }

    @Override // xsna.drz
    public final void onDestroy() {
        this.a.onDestroy();
    }
}
