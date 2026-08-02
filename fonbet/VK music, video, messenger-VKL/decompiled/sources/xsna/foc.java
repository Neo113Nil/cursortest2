package xsna;

import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.dto.common.ClipVideoFile;
import xsna.an50;

/* compiled from: ClipCoauthorListStore.kt */
/* loaded from: classes16.dex */
public final class foc implements eoc, mm50<ClipCoauthorListState, coc, doc> {
    public final /* synthetic */ mm50<ClipCoauthorListState, coc, doc> b;

    public foc(goc gocVar) {
        co50 co50Var = gocVar.f;
        gzs<ClipCoauthorListState> gzsVar = gocVar.a;
        ClipVideoFile clipVideoFile = gocVar.b;
        h7v h7vVar = gocVar.c;
        this.b = co50Var.a(an50.a.b(new rn8(new hoc(gzsVar, clipVideoFile, h7vVar, gocVar.e, 0)), new wn8(new lh(8, h7vVar, gocVar.d), 0), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ClipCoauthorListState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super doc, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(coc cocVar) {
        this.b.b(cocVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final ClipCoauthorListState e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final ClipCoauthorListState getCurrentState() {
        return this.b.getCurrentState();
    }
}
