package com.yandex.paymentsdk.opentelemetry;

import android.net.NetworkRequest;
import defpackage.hlt0;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class OpenTelemetryTracerImpl$spanBuilder$sb$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kotlinx.coroutines.channels.a aVar;
        hlt0 hlt0Var = (hlt0) obj;
        b bVar = (b) this.receiver;
        com.yandex.paymentsdk.opentelemetry.queue.a aVar2 = bVar.d;
        bVar.a = hlt0Var;
        com.yandex.paymentsdk.opentelemetry.queue.b bVar2 = bVar.e;
        if (!bVar2.c) {
            bVar2.f.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bVar2.g);
            bVar2.c = true;
        }
        aVar2.d();
        if (!aVar2.i && (aVar = aVar2.d) != null) {
            aVar.d(hlt0Var);
            ni9 ni9Var = oi9.b;
        }
        return zy11.a;
    }
}
