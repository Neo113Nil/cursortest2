package xsna;

import java.util.ArrayList;

/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class m6l implements izs<uu20, s3q0> {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50<wow<uu20>> c;

    public m6l(int i, wh50<wow<uu20>> wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(uu20 uu20Var) {
        wh50<wow<uu20>> wh50Var = this.c;
        ArrayList arrayList = new ArrayList(new wow(r6l.b(wh50Var)));
        int i = this.b;
        arrayList.set(i, uu20Var);
        wh50Var.setValue(new wow<>(arrayList));
        return s3q0.a;
    }
}
