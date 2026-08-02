package xsna;

import xsna.uwk;

/* compiled from: ChannelsOnboardingVisibilityController.kt */
/* loaded from: classes16.dex */
public final class shb implements tph0 {
    public Object a;
    public Object b;

    public /* synthetic */ shb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // xsna.tph0
    public io.reactivex.rxjava3.core.x a(int i, String str) {
        lec lecVar = (lec) this.a;
        Integer num = (Integer) this.b;
        kec kecVar = (kec) lecVar.b;
        dz2 x = yfb.x(uwk.a.b(kecVar.a, num, str, Integer.valueOf(i), 100, 154));
        ahn.D(x);
        return rsg0.w0(x).l(new b9(new qm(lecVar, 9), 7));
    }
}
