package com.yandex.messaging.internal.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.bgc;
import defpackage.hh31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.net.VpnMonitor$observeVpn$1", f = "VpnMonitor.kt", l = {80, MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class VpnMonitor$observeVpn$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnMonitor$observeVpn$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VpnMonitor$observeVpn$1 vpnMonitor$observeVpn$1 = new VpnMonitor$observeVpn$1(this.this$0, continuation);
        vpnMonitor$observeVpn$1.L$0 = obj;
        return vpnMonitor$observeVpn$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VpnMonitor$observeVpn$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.net.ConnectivityManager$NetworkCallback, com.yandex.messaging.internal.net.VpnMonitor$observeVpn$1$callback$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x6f0 x6f0Var;
        hh31 hh31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final y6f0 y6f0Var = (y6f0) this.L$0;
        final c cVar = this.this$0;
        ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.messaging.internal.net.VpnMonitor$observeVpn$1$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ((x6f0) y6f0.this).d(Boolean.valueOf(cVar.a()));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities caps) {
                ((x6f0) y6f0.this).d(Boolean.valueOf(cVar.a()));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ((x6f0) y6f0.this).d(Boolean.valueOf(cVar.a()));
            }
        };
        try {
            c cVar2 = this.this$0;
            cVar2.c.registerDefaultNetworkCallback(r1, cVar2.a);
            x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(Boolean.valueOf(this.this$0.a()));
            hh31Var = new hh31(x6f0Var, this.this$0, (VpnMonitor$observeVpn$1$callback$1) r1);
            this.label = 2;
        } catch (SecurityException unused) {
            x6f0 x6f0Var2 = (x6f0) y6f0Var;
            x6f0Var2.d(Boolean.FALSE);
            bgc bgcVar = new bgc(12);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var2, bgcVar, this) == coroutineSingletons) {
            }
        }
        return kotlinx.coroutines.channels.b.a(x6f0Var, hh31Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
