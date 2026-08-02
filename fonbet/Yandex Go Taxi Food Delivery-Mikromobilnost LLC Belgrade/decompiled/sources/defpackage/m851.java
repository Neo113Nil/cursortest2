package defpackage;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.inapp.google.internal.operation.decorator.a;

/* loaded from: classes8.dex */
public final class m851 implements gs5 {
    public final /* synthetic */ a a;
    public final /* synthetic */ y6f0 b;

    public m851(a aVar, y6f0 y6f0Var) {
        this.a = aVar;
        this.b = y6f0Var;
    }

    @Override // defpackage.gs5
    public final void onBillingServiceDisconnected() {
        pgz pgzVar = this.a.b;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WithConnectionEstablishmentOperationDecorator", "onBillingServiceDisconnected()");
        }
    }

    @Override // defpackage.gs5
    public final void onBillingSetupFinished(ns5 ns5Var) {
        pgz pgzVar = this.a.b;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WithConnectionEstablishmentOperationDecorator", "onBillingSetupFinished(" + ns5Var + ')');
        }
        ((x6f0) this.b).d(ns5Var);
    }
}
