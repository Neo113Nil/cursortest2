package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.g;
import defpackage.dmt;
import defpackage.msb1;
import defpackage.s0k0;
import defpackage.sls;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.startup.launch.a;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class TrustApiFactory$getOrCreate$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        s0k0 s0k0Var = (s0k0) obj;
        final g gVar = (g) this.receiver;
        gVar.getClass();
        final int i = 0;
        final int i2 = 1;
        s0k0Var.d.add(new dmt(new sls() { // from class: ag11
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                g gVar2 = gVar;
                switch (i3) {
                    case 0:
                        return (a) gVar2.d.get();
                    default:
                        gVar2.c.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                }
            }
        }, new sls() { // from class: ag11
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                g gVar2 = gVar;
                switch (i3) {
                    case 0:
                        return (a) gVar2.d.get();
                    default:
                        gVar2.c.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                }
            }
        }, msb1.G));
        return s0k0Var;
    }
}
