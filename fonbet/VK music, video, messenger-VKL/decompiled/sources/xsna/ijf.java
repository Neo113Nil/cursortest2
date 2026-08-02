package xsna;

import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import java.util.Set;

/* compiled from: ClipsUploadStore.kt */
/* loaded from: classes17.dex */
public final class ijf implements hjf, mm50<ClipsUploadState, lbf, qef> {
    public final /* synthetic */ mm50<ClipsUploadState, lbf, qef> b;

    public ijf(jjf jjfVar) {
        co50 co50Var = jjfVar.e;
        gzs<ClipsUploadState> gzsVar = jjfVar.a;
        hff hffVar = jjfVar.c;
        oap<ClipsUploadUiVkNavigator.ClipUploadDataFull, ClipsUploadUiVkNavigator.ClipUploadDataCompact> oapVar = jjfVar.b;
        Set<Object> set = jjfVar.d;
        this.b = co50Var.a(new an50(new qn8(new yw5(gzsVar, set, oapVar, 3)), new jsi(new u61(hffVar, 1)), new jui(new y90(14)), new sui(new fx(tci.c, hffVar, set, 2)), new tti(new zu3(hffVar, 4))));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ClipsUploadState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super qef, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(lbf lbfVar) {
        this.b.b(lbfVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final ClipsUploadState e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final ClipsUploadState getCurrentState() {
        return this.b.getCurrentState();
    }
}
