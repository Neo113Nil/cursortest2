package com.yandex.go.network.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import defpackage.bm50;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.network.connectivity.NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1", f = "NetworkConnectivityRestoredRepositoryImpl.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
final class NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1 networkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1 = new NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1(this.this$0, continuation);
        networkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1.L$0 = obj;
        return networkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback(this.this$0, y6f0Var) { // from class: com.yandex.go.network.connectivity.NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1
                final /* synthetic */ y6f0 $$this$callbackFlow;
                private volatile boolean wasNetworkConnected;

                {
                    NetworkCapabilities networkCapabilities;
                    this.$$this$callbackFlow = y6f0Var;
                    Object systemService = r3.a.getSystemService("connectivity");
                    ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                    boolean z = false;
                    if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                        if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                            z = true;
                        }
                    }
                    this.wasNetworkConnected = z;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    boolean z = networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
                    networkCapabilities.hasCapability(16);
                    networkCapabilities.hasCapability(12);
                    networkCapabilities.hasTransport(1);
                    networkCapabilities.hasTransport(0);
                    networkCapabilities.hasTransport(4);
                    hst hstVar = jst.e;
                    if (z && !this.wasNetworkConnected) {
                        ((x6f0) this.$$this$callbackFlow).d(zy11.a);
                    }
                    this.wasNetworkConnected = z;
                }
            };
            ConnectivityManager connectivityManager = (ConnectivityManager) this.this$0.b.getValue();
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build(), networkCallback);
            }
            bm50 bm50Var = new bm50(1, this.this$0, networkCallback);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bm50Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
