package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.GooglePayParams;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;

/* loaded from: classes12.dex */
public final class cvt implements bvt {
    public final avt a;
    public final Scenario b;

    public cvt(avt avtVar, Scenario scenario) {
        this.a = avtVar;
        this.b = scenario;
    }

    @Override // defpackage.bvt
    public final avt a() {
        return this.a;
    }

    @Override // defpackage.bvt
    public final String b() {
        GooglePayParams params;
        Scenario scenario = this.b;
        Scenario.GooglePlayBinding googlePlayBinding = scenario instanceof Scenario.GooglePlayBinding ? (Scenario.GooglePlayBinding) scenario : null;
        if (googlePlayBinding == null || (params = googlePlayBinding.getParams()) == null) {
            return null;
        }
        return params.getMerchantId();
    }

    @Override // defpackage.bvt
    public final mf1 c() {
        GooglePayParams params;
        Scenario scenario = this.b;
        Scenario.GooglePlayBinding googlePlayBinding = scenario instanceof Scenario.GooglePlayBinding ? (Scenario.GooglePlayBinding) scenario : null;
        if (googlePlayBinding == null || (params = googlePlayBinding.getParams()) == null) {
            return null;
        }
        return new mf1((byte) 0, 11, params.getPaymentDataRequest());
    }
}
