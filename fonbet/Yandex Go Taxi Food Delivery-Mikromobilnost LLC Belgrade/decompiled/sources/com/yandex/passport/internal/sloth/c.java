package com.yandex.passport.internal.sloth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.ny61;
import defpackage.w511;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final a a() {
        Object failure;
        Object failure2;
        int code;
        Object failure3;
        Object systemService = this.a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return new a(ConnectionType.CONNECTION_UNDEFINED.getCode(), false, BaseTransport.UNDEFINED, null);
        }
        try {
            failure = connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Network network = (Network) failure;
        if (network == null) {
            return new a(ConnectionType.CONNECTION_UNDEFINED.getCode(), false, BaseTransport.UNDEFINED, null);
        }
        try {
            failure2 = connectivityManager.getNetworkCapabilities(network);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        NetworkCapabilities networkCapabilities = (NetworkCapabilities) failure2;
        if (networkCapabilities == null) {
            return new a(ConnectionType.CONNECTION_UNDEFINED.getCode(), false, BaseTransport.UNDEFINED, null);
        }
        boolean hasTransport = networkCapabilities.hasTransport(4);
        BaseTransport baseTransport = networkCapabilities.hasTransport(1) ? BaseTransport.WIFI : networkCapabilities.hasTransport(0) ? BaseTransport.CELLULAR : networkCapabilities.hasTransport(3) ? BaseTransport.ETHERNET : networkCapabilities.hasTransport(2) ? BaseTransport.BLUETOOTH : networkCapabilities.hasTransport(5) ? BaseTransport.WIFI_AWARE : networkCapabilities.hasTransport(6) ? BaseTransport.LOWPAN : BaseTransport.UNDEFINED;
        if (hasTransport) {
            code = ConnectionType.CONNECTION_VPN.getCode();
        } else {
            switch (b.a[baseTransport.ordinal()]) {
                case 1:
                    code = ConnectionType.CONNECTION_WIFI.getCode();
                    break;
                case 2:
                    code = ConnectionType.CONNECTION_CELL.getCode();
                    break;
                case 3:
                    code = ConnectionType.CONNECTION_ETHERNET.getCode();
                    break;
                case 4:
                    code = ConnectionType.CONNECTION_BLUETOOTH.getCode();
                    break;
                case 5:
                    code = ConnectionType.CONNECTION_WIFI_AWARE.getCode();
                    break;
                case 6:
                    code = ConnectionType.CONNECTION_LOWPAN.getCode();
                    break;
                case 7:
                    code = ConnectionType.CONNECTION_UNDEFINED.getCode();
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        try {
            failure3 = Long.valueOf(network.getNetworkHandle());
        } catch (Throwable th3) {
            failure3 = new Result.Failure(th3);
        }
        return new a(code, hasTransport, baseTransport, (Long) (failure3 instanceof Result.Failure ? null : failure3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ConnectionTypeImpl$getConnectionType$1 connectionTypeImpl$getConnectionType$1;
        int i;
        if (continuationImpl instanceof ConnectionTypeImpl$getConnectionType$1) {
            connectionTypeImpl$getConnectionType$1 = (ConnectionTypeImpl$getConnectionType$1) continuationImpl;
            int i2 = connectionTypeImpl$getConnectionType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectionTypeImpl$getConnectionType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = connectionTypeImpl$getConnectionType$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = connectionTypeImpl$getConnectionType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    connectionTypeImpl$getConnectionType$1.label = 1;
                    obj = a();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new Integer(((a) obj).a);
            }
        }
        connectionTypeImpl$getConnectionType$1 = new ConnectionTypeImpl$getConnectionType$1(this, continuationImpl);
        Object obj3 = connectionTypeImpl$getConnectionType$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectionTypeImpl$getConnectionType$1.label;
        if (i != 0) {
        }
        return new Integer(((a) obj3).a);
    }
}
