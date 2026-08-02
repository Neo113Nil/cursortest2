package xsna;

import com.vk.profile.community.members.impl.ui.MembersState;
import xsna.an50;

/* compiled from: MembersStore.kt */
/* loaded from: classes5.dex */
public final class l220 implements j220, mm50<MembersState, com.vk.profile.community.members.impl.ui.a, com.vk.profile.community.members.impl.ui.b> {
    public final /* synthetic */ mm50<MembersState, com.vk.profile.community.members.impl.ui.a, com.vk.profile.community.members.impl.ui.b> b;

    public l220(co50 co50Var, a220 a220Var) {
        qn8 qn8Var = new qn8(new tcn(a220Var, 19));
        wn8 wn8Var = new wn8(a220Var, 1);
        final w110 w110Var = new w110(a220Var, 2);
        omf0 omf0Var = new omf0() { // from class: xsna.vn8
            @Override // xsna.gzs
            public final Object invoke() {
                mmf0 mmf0Var = new mmf0();
                w110.this.invoke(mmf0Var);
                etp etpVar = mmf0Var.b;
                if (etpVar != null) {
                    return new ejl(mmf0Var.a, etpVar);
                }
                throw new IllegalArgumentException("You have forgotten to configure [reduce] block in subReducer DSL");
            }
        };
        final e2s e2sVar = new e2s(a220Var, 10);
        this.b = co50Var.a(an50.a.a(qn8Var, wn8Var, omf0Var, new t5o0() { // from class: xsna.sn8
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                s5o0 s5o0Var = new s5o0();
                e2s.this.invoke(s5o0Var);
                vg3 vg3Var = s5o0Var.c;
                if (vg3Var != null) {
                    return new edl(nn50Var, s5o0Var.a, vg3Var, s5o0Var.b);
                }
                throw new IllegalArgumentException("You have forgotten to configure [execute] block in executor DSL");
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super MembersState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.profile.community.members.impl.ui.b, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.profile.community.members.impl.ui.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final MembersState e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final MembersState getCurrentState() {
        return this.b.getCurrentState();
    }
}
