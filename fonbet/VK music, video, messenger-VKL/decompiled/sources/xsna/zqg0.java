package xsna;

import ru.rustore.sdk.review.model.ReviewInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zqg0 implements io.reactivex.rxjava3.core.a0, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zqg0(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        arg0 arg0Var = (arg0) this.b;
        lrg0 lrg0Var = (lrg0) this.c;
        ReviewInfo reviewInfo = (ReviewInfo) this.d;
        r100.a(arg0Var.f, "Launching review flow");
        kiz0 kiz0Var = lrg0Var.a;
        kiz0Var.getClass();
        euj0 euj0Var = new euj0(new ntj0(new ru.rustore.sdk.review.p(kiz0Var, reviewInfo)), new ru.rustore.sdk.review.v(kiz0Var, reviewInfo));
        bpn0 bpn0Var = adn.a;
        d5o0 a = tiy0.a(new gwj0(euj0Var, adn.a()));
        a.b(new vxb(arg0Var, yVar), null);
        a.b(null, new j1d(arg0Var, yVar));
    }
}
