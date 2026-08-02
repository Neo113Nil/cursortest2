package defpackage;

import com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo.a;

/* loaded from: classes12.dex */
public final class kt5 implements v7p {
    public final /* synthetic */ int a;
    public final oti b;

    public /* synthetic */ kt5(oti otiVar, int i) {
        this.a = i;
        this.b = otiVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        oti otiVar = this.b;
        switch (i) {
            case 0:
                return new a((phj) otiVar.get());
            default:
                return new com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.a((phj) otiVar.get());
        }
    }
}
