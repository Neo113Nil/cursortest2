package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.ImFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.drz;

/* compiled from: FolderDialogsListLoader.kt */
/* loaded from: classes18.dex */
public final class myr implements drz<xrm> {
    public final /* synthetic */ zrz a;

    public myr(int i, a1w a1wVar, int i2, b1s b1sVar, esz eszVar) {
        Object obj = new Object();
        fto0 fto0Var = new fto0();
        d000 pa2Var = BuildInfo.h() ? new pa2(lhg.a(i, "PaginationLoaderInfo folder_id ")) : new edi(15);
        nyr nyrVar = new nyr(i, obj, a1wVar);
        pyr pyrVar = new pyr(i, obj, a1wVar);
        rtm rtmVar = new rtm(a1wVar, obj, pa2Var);
        c40 c40Var = new c40(new lz0(rtmVar, 28), 16);
        io.reactivex.rxjava3.subjects.f<zsm> fVar = rtmVar.d;
        fVar.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(fVar, c40Var, kVar);
        d9b d9bVar = new d9b(rtmVar, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        qyr qyrVar = new qyr(b1sVar.a(), new io.reactivex.rxjava3.internal.operators.observable.c0(c0Var, lVar, d9bVar), i, a1wVar, pa2Var);
        sh6 sh6Var = new sh6(new dkg(qyrVar, 16), 20);
        io.reactivex.rxjava3.subjects.f<zsm> fVar2 = qyrVar.h;
        fVar2.getClass();
        ctm ctmVar = new ctm(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(fVar2, sh6Var, kVar), lVar, new nt1(qyrVar, 3)), fto0Var, nyrVar, new jyr(a1wVar, i), pa2Var);
        asu0.a.getClass();
        io.reactivex.rxjava3.core.w i3 = asu0.i();
        blk blkVar = new blk();
        kci kciVar = new kci();
        iy2 iy2Var = new iy2(21);
        io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) asu0.o0.getValue();
        c4g0 c4g0Var = new c4g0();
        ImFeatures imFeatures = ImFeatures.FIX_DOUBLE_GET_CONVERSATIONS;
        imFeatures.getClass();
        this.a = new zrz(nyrVar, blkVar, pyrVar, kciVar, fto0Var, ctmVar, iy2Var, i3, wVar, i2, pa2Var, c4g0Var, eszVar, com.vk.toggle.b.A.a(imFeatures));
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
