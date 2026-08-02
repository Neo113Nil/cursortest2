package xsna;

import xsna.zjv;

/* compiled from: OtelCronethttpInterceptor.kt */
/* loaded from: classes2.dex */
public final class kz80 implements ojv {
    public final wdp0 a;

    public kz80(wdp0 wdp0Var) {
        this.a = wdp0Var;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        Object i;
        i = vhk0.i(this.a, "Cronet", (r5 & 2) == 0, new xdf(2), new hs00(aVar, 14));
        return (mkv) i;
    }
}
