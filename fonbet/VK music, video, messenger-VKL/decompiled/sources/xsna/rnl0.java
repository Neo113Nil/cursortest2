package xsna;

import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;

/* compiled from: StorefrontServicesFeature.kt */
/* loaded from: classes18.dex */
public final class rnl0 implements ool0, mm50<mol0, wml0, lnl0> {
    public final /* synthetic */ mm50<mol0, wml0, lnl0> b;

    public rnl0(final StorefrontServicesArgs storefrontServicesArgs, final boolean z, final jnl0 jnl0Var) {
        this.b = up2.d(new avj0(storefrontServicesArgs, 5), new wb0() { // from class: xsna.qnl0
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                StorefrontServicesArgs storefrontServicesArgs2 = StorefrontServicesArgs.this;
                boolean z2 = z;
                jnl0 jnl0Var2 = jnl0Var;
                return new bnl0(sj50Var, new dol0(storefrontServicesArgs2, z2, jnl0Var2), jnl0Var2);
            }
        }, new tti(new log(13)));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super mol0, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super lnl0, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(wml0 wml0Var) {
        this.b.b(wml0Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final mol0 getCurrentState() {
        return this.b.getCurrentState();
    }
}
