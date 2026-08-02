package xsna;

import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsArgs;

/* compiled from: StorefrontAlbumsFeature.kt */
/* loaded from: classes18.dex */
public final class bkl0 implements vkl0, mm50<ukl0, sjl0, xjl0> {
    public final /* synthetic */ mm50<ukl0, sjl0, xjl0> b;

    public bkl0(final StorefrontAlbumsArgs storefrontAlbumsArgs, final mzp0 mzp0Var, final fkl0 fkl0Var, final wjl0 wjl0Var) {
        this.b = new ql50((aqw) null, 7).a(new an50(new yjl0(), dkl0.b, ekl0.b, new t5o0() { // from class: xsna.zjl0
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new gpl0(fkl0.this, mzp0Var, wjl0Var, nn50Var);
            }
        }, new cm20() { // from class: xsna.akl0
            @Override // xsna.izs
            /* renamed from: i */
            public final rl50 invoke(sl50 sl50Var) {
                return new vjl0(StorefrontAlbumsArgs.this.b, sl50Var);
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ukl0, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super xjl0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(sjl0 sjl0Var) {
        this.b.b(sjl0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final ukl0 getCurrentState() {
        return this.b.getCurrentState();
    }
}
