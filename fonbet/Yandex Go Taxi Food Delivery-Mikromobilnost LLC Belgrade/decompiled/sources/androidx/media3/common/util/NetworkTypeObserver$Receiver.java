package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import defpackage.c260;
import defpackage.tw21;

/* loaded from: classes10.dex */
final class NetworkTypeObserver$Receiver extends BroadcastReceiver {
    final /* synthetic */ c260 this$0;

    private NetworkTypeObserver$Receiver(c260 c260Var) {
        this.this$0 = c260Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceive$0(Context context) {
        c260 c260Var = this.this$0;
        c260Var.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (tw21.a >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (tw21.a < 31 || i != 5) {
            c260Var.c(i);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            NetworkTypeObserver$Api31$DisplayInfoCallback networkTypeObserver$Api31$DisplayInfoCallback = new NetworkTypeObserver$Api31$DisplayInfoCallback(c260Var);
            telephonyManager.registerTelephonyCallback(c260Var.a, networkTypeObserver$Api31$DisplayInfoCallback);
            telephonyManager.unregisterTelephonyCallback(networkTypeObserver$Api31$DisplayInfoCallback);
        } catch (RuntimeException unused2) {
            c260Var.c(5);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.this$0.a.execute(new a(context, 1, this));
    }
}
