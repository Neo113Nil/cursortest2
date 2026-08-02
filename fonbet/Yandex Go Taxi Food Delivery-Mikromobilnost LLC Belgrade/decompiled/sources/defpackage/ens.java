package defpackage;

import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationFragment;

/* loaded from: classes3.dex */
public final class ens implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final g7g c;

    public /* synthetic */ ens(n3w n3wVar, g7g g7gVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = g7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new FundCreationFragment((jns) n3wVar.a, (udm0) g7gVar.get());
            default:
                return new FundOperationFragment((jps) n3wVar.a, (udm0) g7gVar.get());
        }
    }
}
