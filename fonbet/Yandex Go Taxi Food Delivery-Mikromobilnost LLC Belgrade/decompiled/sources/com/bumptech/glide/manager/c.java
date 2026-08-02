package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import defpackage.g1o;
import defpackage.ris0;

/* loaded from: classes10.dex */
public final class c {
    public boolean a;
    public final ris0 b;
    public final g1o c;
    public final ConnectivityManager.NetworkCallback d = new SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1(this);

    public c(g1o g1oVar, ris0 ris0Var) {
        this.c = g1oVar;
        this.b = ris0Var;
    }
}
