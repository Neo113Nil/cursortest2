package defpackage;

import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.a;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;

/* loaded from: classes3.dex */
public final class ln01 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;

    public /* synthetic */ ln01(n3w n3wVar, int i) {
        this.a = i;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new kn01((qh01) n3wVar.a);
            case 1:
                return new TransferReceiverNameFragment((a) n3wVar.a);
            case 2:
                return new TransferRequisiteFragment((dr01) n3wVar.a);
            case 3:
                return new TransferTargetsFragment((st01) n3wVar.a);
            case 4:
                ((qa60) ((h9g) ((tw51) n3wVar.a)).c0.get()).getClass();
                return null;
            case 5:
                return new ry41(i5m.a(n3wVar));
            default:
                return new b1m0(2, (jsi0) n3wVar.a);
        }
    }
}
