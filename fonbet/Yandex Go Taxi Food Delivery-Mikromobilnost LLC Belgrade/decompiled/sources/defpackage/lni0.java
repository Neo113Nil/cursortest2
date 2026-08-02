package defpackage;

import defpackage.lni0;
import kotlin.a;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class lni0 {
    public final nni0 a;
    public final c b;
    public final h c;
    public final i3y d = a.a(new sls() { // from class: com.yandex.go.promocodes.referral.impl.provider.a
        @Override // defpackage.sls
        public final Object invoke() {
            lni0 lni0Var = lni0.this;
            return new m0(new c(lni0Var.b.b(), lni0Var), new e(((k) lni0Var.a).a()), new ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow$2$1(3, null));
        }
    });

    public lni0(nni0 nni0Var, c cVar, h hVar) {
        this.a = nni0Var;
        this.b = cVar;
        this.c = hVar;
    }
}
