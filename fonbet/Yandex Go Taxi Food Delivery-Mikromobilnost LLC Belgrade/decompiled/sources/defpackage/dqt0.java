package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class dqt0 implements cqt0 {
    public final Scenario a;

    public dqt0(Scenario scenario) {
        this.a = scenario;
    }

    @Override // defpackage.cqt0
    public final Object a(ContinuationImpl continuationImpl) {
        Scenario scenario = this.a;
        Scenario.Payment payment = scenario instanceof Scenario.Payment ? (Scenario.Payment) scenario : null;
        boolean z = false;
        if (payment != null && payment.isAnonym()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
