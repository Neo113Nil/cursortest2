package xsna;

import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.common.ClipVideoFile;
import xsna.an50;

/* compiled from: ClipCoauthorDecisionStore.kt */
/* loaded from: classes16.dex */
public final class rnc implements qnc, mm50<ClipCoauthorDecisionState, fnc, pnc> {
    public final /* synthetic */ mm50<ClipCoauthorDecisionState, fnc, pnc> b;

    public rnc(snc sncVar) {
        co50 co50Var = sncVar.e;
        gzs<ClipCoauthorDecisionState> gzsVar = sncVar.a;
        ClipVideoFile clipVideoFile = sncVar.b;
        ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = sncVar.c;
        this.b = co50Var.a(an50.a.b(new rn8(new ync(gzsVar, clipCoauthorsDecisionLaunchType, clipVideoFile, 0)), new wn8(new yf1(clipVideoFile, sncVar.d, clipCoauthorsDecisionLaunchType, 1), 0), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ClipCoauthorDecisionState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super pnc, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(fnc fncVar) {
        this.b.b(fncVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final ClipCoauthorDecisionState e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final ClipCoauthorDecisionState getCurrentState() {
        return this.b.getCurrentState();
    }
}
