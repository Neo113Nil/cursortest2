package xsna;

import com.vk.messagetemplates.impl.details.TemplateDetailsState;

/* compiled from: TemplatesDetailsStore.kt */
/* loaded from: classes3.dex */
public final class e9o0 implements r8o0, bn50<TemplateDetailsState, TemplateDetailsState, com.vk.messagetemplates.impl.details.a, com.vk.messagetemplates.impl.details.b> {
    public final /* synthetic */ cn50 b;

    public e9o0(Integer num, final ezv ezvVar) {
        this.b = new cn50(up2.d(new icn0(num, 2), new wb0() { // from class: xsna.d9o0
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new com.vk.messagetemplates.impl.details.c(sj50Var, ezv.this);
            }
        }, svj.b));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super TemplateDetailsState, s3q0> izsVar) {
        return this.b.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.messagetemplates.impl.details.b, s3q0> izsVar) {
        return this.b.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(lj50 lj50Var) {
        this.b.b((com.vk.messagetemplates.impl.details.a) lj50Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final Object e() {
        return (TemplateDetailsState) this.b.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final lm50 getCurrentState() {
        return (TemplateDetailsState) this.b.b.getCurrentState();
    }
}
