package xsna;

import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import kotlin.collections.builders.SetBuilder;

/* compiled from: ClipEditSdkMviStore.kt */
/* loaded from: classes17.dex */
public final class ftc implements btc, mm50<ClipEditSdkMviState, usc, ysc> {
    public final /* synthetic */ mm50<ClipEditSdkMviState, usc, ysc> b;

    public ftc(final tsc tscVar, final ClipEditSdkItem clipEditSdkItem, final eml emlVar, final SetBuilder setBuilder, irk0 irk0Var, final gzs gzsVar) {
        ql50 ql50Var = new ql50(new aqw(), 5);
        j18 j18Var = new j18() { // from class: xsna.ctc
            @Override // xsna.gzs
            public final Object invoke() {
                return new xsc(ClipEditSdkItem.this, setBuilder, gzsVar);
            }
        };
        wb0 wb0Var = new wb0() { // from class: xsna.dtc
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new vsc(sj50Var, setBuilder);
            }
        };
        tti ttiVar = new tti(new com.vk.movika.tools.controls.seekbar.t(irk0Var, 2));
        this.b = ql50Var.a(new an50(j18Var, wb0Var, gtc.b, new t5o0() { // from class: xsna.etc
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new ntc(tsc.this, new cbb(emlVar), nn50Var);
            }
        }, ttiVar));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ClipEditSdkMviState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super ysc, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(usc uscVar) {
        this.b.b(uscVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final Object e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final ClipEditSdkMviState getCurrentState() {
        return this.b.getCurrentState();
    }
}
