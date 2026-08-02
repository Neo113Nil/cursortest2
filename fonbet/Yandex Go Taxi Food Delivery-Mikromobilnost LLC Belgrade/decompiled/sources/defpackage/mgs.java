package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;

/* loaded from: classes12.dex */
public final class mgs implements kgs {
    public final Merchant a;

    public mgs(Merchant merchant) {
        this.a = merchant;
    }

    @Override // defpackage.kgs
    public final String a(PayEnvironment payEnvironment) {
        return this.a.getServiceToken();
    }
}
