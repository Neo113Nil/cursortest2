package xsna;

import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class viz0 implements yads.ng1, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ Object b;

    public /* synthetic */ viz0(Object obj) {
        this.b = obj;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a((yads.q20) this.b);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        pey peyVar = (pey) this.b;
        Long l = MiniAppPiPOverlayService.f;
        return ((Boolean) peyVar.invoke(obj)).booleanValue();
    }
}
