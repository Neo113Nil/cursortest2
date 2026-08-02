package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.pw21;

/* loaded from: classes10.dex */
class SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ c this$0;

    public SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1(c cVar) {
        this.this$0 = cVar;
    }

    private void postOnConnectivityChange(boolean z) {
        pw21.j().post(new b(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        postOnConnectivityChange(true);
    }

    public void onConnectivityChange(boolean z) {
        pw21.a();
        c cVar = this.this$0;
        boolean z2 = cVar.a;
        cVar.a = z;
        if (z2 != z) {
            cVar.b.a(z);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        postOnConnectivityChange(false);
    }
}
