package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import kotlin.NoWhenBranchMatchedException;
import xsna.htc;
import xsna.zsc;

/* compiled from: ClipEditSdkMviTaskExecutor.kt */
/* loaded from: classes17.dex */
public final class ntc extends uvj<ClipEditSdkMviState, on50, htc, htc, zsc, ysc> {
    public final tsc g;

    public ntc(tsc tscVar, cbb cbbVar, nn50 nn50Var) {
        super(cbbVar, nn50Var);
        this.g = tscVar;
    }

    public static final void t(ntc ntcVar, boolean z) {
        ntcVar.getClass();
        ntcVar.e(new zsc.o(z));
        ntcVar.e(new zsc.k(oad.a((ClipEditSdkMviState) ntcVar.b.getCurrentState())));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        htc htcVar = (htc) hn50Var;
        boolean z = htcVar instanceof htc.e;
        hpj hpjVar = this.f;
        if (z) {
            return s(myc0.h(hpjVar, null, null, new jtc(this, null), 3));
        }
        if (htcVar instanceof htc.a) {
            return m(myc0.h(hpjVar, null, null, new ktc(this, (htc.a) htcVar, null), 3));
        }
        if (htcVar instanceof htc.c) {
            return m(myc0.h(hpjVar, null, null, new itc(this, null), 3));
        }
        if (htcVar instanceof htc.b) {
            return m(myc0.h(hpjVar, null, null, new ltc(this, null), 3));
        }
        if (htcVar instanceof htc.d) {
            return m(myc0.h(hpjVar, null, null, new mtc(this, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
