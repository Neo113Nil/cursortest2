package com.yandex.passport.internal.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.yandex.passport.internal.flags.presentation.l;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lcom/yandex/passport/sloth/ui/c;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.utils.ConnectivityManagerUtilsKt$observeConnectivity$1", f = "connectivityManagerUtils.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ConnectivityManagerUtilsKt$observeConnectivity$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $scope;
    final /* synthetic */ ConnectivityManager $this_observeConnectivity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityManagerUtilsKt$observeConnectivity$1(ConnectivityManager connectivityManager, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.$this_observeConnectivity = connectivityManager;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectivityManagerUtilsKt$observeConnectivity$1 connectivityManagerUtilsKt$observeConnectivity$1 = new ConnectivityManagerUtilsKt$observeConnectivity$1(this.$this_observeConnectivity, this.$scope, continuation);
        connectivityManagerUtilsKt$observeConnectivity$1.L$0 = obj;
        return connectivityManagerUtilsKt$observeConnectivity$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectivityManagerUtilsKt$observeConnectivity$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final y6f0 y6f0Var = (y6f0) this.L$0;
            final ConnectivityManager connectivityManager = this.$this_observeConnectivity;
            final tse tseVar = this.$scope;
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.passport.internal.utils.ConnectivityManagerUtilsKt$observeConnectivity$1$callback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    b.c(y6f0.this, b.d(connectivityManager), tseVar);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    b.c(y6f0.this, b.d(connectivityManager), tseVar);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    b.c(y6f0.this, b.d(connectivityManager), tseVar);
                }
            };
            try {
                this.$this_observeConnectivity.registerNetworkCallback(new NetworkRequest.Builder().build(), networkCallback);
                b.a(networkCallback.hashCode(), "registerNetworkCallback");
            } catch (Exception e) {
                b.b(networkCallback.hashCode(), e, "registerNetworkCallback");
            }
            b.c(y6f0Var, b.d(this.$this_observeConnectivity), this.$scope);
            l lVar = new l(8, this.$this_observeConnectivity, networkCallback);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, lVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
