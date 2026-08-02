package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import defpackage.ds31;
import defpackage.e9g0;
import defpackage.f9g0;
import defpackage.g9g0;
import defpackage.h9g0;
import defpackage.pz40;
import defpackage.qca1;
import defpackage.tje;
import defpackage.tls;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final void a(String str, QrPaymentsSecondFactorScreenProvider$Request qrPaymentsSecondFactorScreenProvider$Request) {
        b bVar = this.a;
        e9g0 c = qca1.c((h9g0) bVar.X());
        if (c == null) {
            return;
        }
        tje.N(ds31.a(bVar), null, null, new QrPaymentsMainViewModel$onAuthorizationRequired$1(bVar, c, str, qrPaymentsSecondFactorScreenProvider$Request, null), 3);
    }

    public final void b(tls tlsVar) {
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        b bVar = this.a;
        e9g0 c = qca1.c((h9g0) bVar.X());
        if (c == null) {
            return;
        }
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            g9g0Var = ((h9g0) value).a;
            if (g9g0Var instanceof f9g0) {
                g9g0Var = (f9g0) tlsVar.invoke(c);
            }
        } while (!r0Var.k(value, new h9g0(g9g0Var)));
    }
}
