package com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners.b;
import defpackage.abe;
import defpackage.aj31;
import defpackage.ar10;
import defpackage.ds31;
import defpackage.fp51;
import defpackage.k7c;
import defpackage.rzq0;
import defpackage.s4s;
import defpackage.tje;
import defpackage.uyj;
import defpackage.yr31;
import defpackage.z22;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a extends yr31 {
    public final com.yandex.fintechsdk.data.personalization.impl.internal.a A;
    public final abe B;
    public final aj31 C;
    public final fp51 D;
    public final z22 b;
    public final b c;
    public final s4s w;
    public final IntentArgs x;
    public final ar10 y;
    public final com.yandex.fintechsdk.data.payment.impl.internal.order.a z;

    public a(z22 z22Var, b bVar, s4s s4sVar, IntentArgs intentArgs, ar10 ar10Var, com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar, com.yandex.fintechsdk.data.personalization.impl.internal.a aVar2, abe abeVar, aj31 aj31Var, fp51 fp51Var) {
        this.b = z22Var;
        this.c = bVar;
        this.w = s4sVar;
        this.x = intentArgs;
        this.y = ar10Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = abeVar;
        this.C = aj31Var;
        this.D = fp51Var;
        tje.N(ds31.a(this), uyj.a, null, new ApplinkPaymentViewModel$initListeners$1(this, null), 2);
        s4sVar.b = ((rzq0) s4sVar.a.a).a + Extension.DOT_CHAR + System.currentTimeMillis();
    }

    @Override // defpackage.yr31
    public final void V() {
        this.w.b = null;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.b).a(k7c.c);
    }
}
