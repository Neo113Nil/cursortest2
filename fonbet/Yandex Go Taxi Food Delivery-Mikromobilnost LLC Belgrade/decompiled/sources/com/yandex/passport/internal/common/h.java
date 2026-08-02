package com.yandex.passport.internal.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.sls;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h {
    public final Context a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public NetworkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 c;

    public h(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NetworkWrapperImpl$isDefaultNetworkCallbackRegistered$1 networkWrapperImpl$isDefaultNetworkCallbackRegistered$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof NetworkWrapperImpl$isDefaultNetworkCallbackRegistered$1) {
                networkWrapperImpl$isDefaultNetworkCallbackRegistered$1 = (NetworkWrapperImpl$isDefaultNetworkCallbackRegistered$1) continuationImpl;
                int i2 = networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.L$0 = this;
                        aVar = this.b;
                        networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.L$1 = aVar;
                        networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.label = 1;
                        if (aVar.a(networkWrapperImpl$isDefaultNetworkCallbackRegistered$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.L$1;
                        h hVar = (h) networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r5;
                        this = hVar;
                    }
                    if (this.c != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (this.c != null) {
            }
            return Boolean.valueOf(z);
        } finally {
            aVar.d(null);
        }
        networkWrapperImpl$isDefaultNetworkCallbackRegistered$1 = new NetworkWrapperImpl$isDefaultNetworkCallbackRegistered$1(this, continuationImpl);
        Object obj2 = networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkWrapperImpl$isDefaultNetworkCallbackRegistered$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x0050, B:13:0x005a, B:14:0x0066, B:17:0x00b9, B:22:0x006b, B:24:0x0077, B:27:0x007f, B:30:0x0093, B:32:0x0099, B:34:0x00a3, B:35:0x00aa, B:36:0x00ac, B:39:0x00b3, B:42:0x008d, B:29:0x0084), top: B:10:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x0050, B:13:0x005a, B:14:0x0066, B:17:0x00b9, B:22:0x006b, B:24:0x0077, B:27:0x007f, B:30:0x0093, B:32:0x0099, B:34:0x00a3, B:35:0x00aa, B:36:0x00ac, B:39:0x00b3, B:42:0x008d, B:29:0x0084), top: B:10:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.net.ConnectivityManager] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.ConnectivityManager$NetworkCallback, com.yandex.passport.internal.common.NetworkWrapperImpl$registerDefaultNetworkCallback$2$callback$1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r6v10, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.usecase.vpn.a aVar, ContinuationImpl continuationImpl) {
        NetworkWrapperImpl$registerDefaultNetworkCallback$1 networkWrapperImpl$registerDefaultNetworkCallback$1;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        final com.yandex.passport.internal.usecase.vpn.a aVar3;
        Object failure;
        try {
            if (continuationImpl instanceof NetworkWrapperImpl$registerDefaultNetworkCallback$1) {
                networkWrapperImpl$registerDefaultNetworkCallback$1 = (NetworkWrapperImpl$registerDefaultNetworkCallback$1) continuationImpl;
                int i2 = networkWrapperImpl$registerDefaultNetworkCallback$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    networkWrapperImpl$registerDefaultNetworkCallback$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = networkWrapperImpl$registerDefaultNetworkCallback$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = networkWrapperImpl$registerDefaultNetworkCallback$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        networkWrapperImpl$registerDefaultNetworkCallback$1.L$0 = this;
                        networkWrapperImpl$registerDefaultNetworkCallback$1.L$1 = aVar;
                        aVar2 = this.b;
                        networkWrapperImpl$registerDefaultNetworkCallback$1.L$2 = aVar2;
                        networkWrapperImpl$registerDefaultNetworkCallback$1.label = 1;
                        aVar3 = aVar;
                        if (aVar2.a(networkWrapperImpl$registerDefaultNetworkCallback$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) networkWrapperImpl$registerDefaultNetworkCallback$1.L$2;
                        ?? r6 = (sls) networkWrapperImpl$registerDefaultNetworkCallback$1.L$1;
                        h hVar = (h) networkWrapperImpl$registerDefaultNetworkCallback$1.L$0;
                        kotlin.b.b(obj);
                        aVar2 = r5;
                        this = hVar;
                        aVar3 = r6;
                    }
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "registerDefaultNetworkCallback", 8);
                    }
                    if (this.c != null) {
                        Object systemService = this.a.getSystemService("connectivity");
                        ?? r0 = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : 0;
                        if (r0 == 0) {
                            z = false;
                        } else {
                            ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.passport.internal.common.NetworkWrapperImpl$registerDefaultNetworkCallback$2$callback$1
                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onAvailable(Network network) {
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "NetworkWrapper onAvailable=" + network, 8);
                                    }
                                    sls.this.invoke();
                                }

                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "NetworkWrapper onCapabilitiesChanged=" + network, 8);
                                    }
                                    sls.this.invoke();
                                }

                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onLost(Network network) {
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "NetworkWrapper onLost=" + network, 8);
                                    }
                                    sls.this.invoke();
                                }

                                @Override // android.net.ConnectivityManager.NetworkCallback
                                public void onUnavailable() {
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "NetworkWrapper onUnavailable", 8);
                                    }
                                    sls.this.invoke();
                                }
                            };
                            try {
                                r0.registerDefaultNetworkCallback(r1);
                                this.c = r1;
                                failure = Boolean.TRUE;
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            Throwable a = Result.a(failure);
                            if (a != null) {
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to register vpn network callback", a);
                                }
                                this.c = null;
                            }
                            Boolean bool = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                                failure = bool;
                            }
                            z = ((Boolean) failure).booleanValue();
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    aVar2.d(null);
                    return valueOf;
                }
            }
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            if (this.c != null) {
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            aVar2.d(null);
            return valueOf2;
        } catch (Throwable th2) {
            aVar2.d(null);
            throw th2;
        }
        networkWrapperImpl$registerDefaultNetworkCallback$1 = new NetworkWrapperImpl$registerDefaultNetworkCallback$1(this, continuationImpl);
        Object obj2 = networkWrapperImpl$registerDefaultNetworkCallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkWrapperImpl$registerDefaultNetworkCallback$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:11:0x004a, B:13:0x0054, B:14:0x0060, B:17:0x00ac, B:22:0x0065, B:24:0x0071, B:29:0x0088, B:31:0x008e, B:33:0x0098, B:34:0x009f, B:37:0x00a6, B:40:0x0082, B:28:0x0079), top: B:10:0x004a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:11:0x004a, B:13:0x0054, B:14:0x0060, B:17:0x00ac, B:22:0x0065, B:24:0x0071, B:29:0x0088, B:31:0x008e, B:33:0x0098, B:34:0x009f, B:37:0x00a6, B:40:0x0082, B:28:0x0079), top: B:10:0x004a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v13, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        NetworkWrapperImpl$unregisterDefaultNetworkCallback$1 networkWrapperImpl$unregisterDefaultNetworkCallback$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        NetworkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1;
        Object failure;
        try {
            if (continuationImpl instanceof NetworkWrapperImpl$unregisterDefaultNetworkCallback$1) {
                networkWrapperImpl$unregisterDefaultNetworkCallback$1 = (NetworkWrapperImpl$unregisterDefaultNetworkCallback$1) continuationImpl;
                int i2 = networkWrapperImpl$unregisterDefaultNetworkCallback$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    networkWrapperImpl$unregisterDefaultNetworkCallback$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = networkWrapperImpl$unregisterDefaultNetworkCallback$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = networkWrapperImpl$unregisterDefaultNetworkCallback$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        networkWrapperImpl$unregisterDefaultNetworkCallback$1.L$0 = this;
                        aVar = this.b;
                        networkWrapperImpl$unregisterDefaultNetworkCallback$1.L$1 = aVar;
                        networkWrapperImpl$unregisterDefaultNetworkCallback$1.label = 1;
                        if (aVar.a(networkWrapperImpl$unregisterDefaultNetworkCallback$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (g050) networkWrapperImpl$unregisterDefaultNetworkCallback$1.L$1;
                        h hVar = (h) networkWrapperImpl$unregisterDefaultNetworkCallback$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r5;
                        this = hVar;
                    }
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "unregisterDefaultNetworkCallback", 8);
                    }
                    networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 = this.c;
                    if (networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 == null) {
                        Object systemService = this.a.getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        if (connectivityManager == null) {
                            z = false;
                        } else {
                            try {
                                connectivityManager.unregisterNetworkCallback(networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1);
                                this.c = null;
                                failure = Boolean.TRUE;
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            Throwable a = Result.a(failure);
                            if (a != null) {
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to unregister vpn network callback", a);
                                }
                            }
                            Boolean bool = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                                failure = bool;
                            }
                            z = ((Boolean) failure).booleanValue();
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    aVar.d(null);
                    return valueOf;
                }
            }
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 = this.c;
            if (networkWrapperImpl$registerDefaultNetworkCallback$2$callback$1 == null) {
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            aVar.d(null);
            return valueOf2;
        } catch (Throwable th2) {
            aVar.d(null);
            throw th2;
        }
        networkWrapperImpl$unregisterDefaultNetworkCallback$1 = new NetworkWrapperImpl$unregisterDefaultNetworkCallback$1(this, continuationImpl);
        Object obj2 = networkWrapperImpl$unregisterDefaultNetworkCallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkWrapperImpl$unregisterDefaultNetworkCallback$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }
}
