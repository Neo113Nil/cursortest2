package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zau;
import defpackage.b25;
import defpackage.cvw;
import defpackage.d25;
import defpackage.do91;
import defpackage.h3s0;
import defpackage.ny61;
import defpackage.om2;
import defpackage.t4e;
import defpackage.yx60;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes11.dex */
public final class NonGmsServiceBrokerClient implements om2, ServiceConnection {
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final t4e zaf;
    private final Handler zag;
    private final yx60 zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ComponentName componentName, t4e t4eVar, yx60 yx60Var) {
        this.zaj = false;
        this.zak = null;
        this.zae = context;
        this.zag = new zau(looper);
        this.zaf = t4eVar;
        this.zah = yx60Var;
        if (str != null && str2 != null) {
            if (componentName == null) {
                componentName = null;
                this.zab = str;
                this.zac = str2;
                this.zad = componentName;
                return;
            }
            ny61.f("Must specify either package or component, but not both");
            throw null;
        }
    }

    private final void zad() {
        if (Thread.currentThread() == this.zag.getLooper().getThread()) {
            return;
        }
        ny61.r("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // defpackage.om2
    public final void connect(b25 b25Var) {
        zad();
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, 4225);
            this.zaj = bindService;
            if (bindService) {
                return;
            }
            this.zai = null;
            this.zah.onConnectionFailed(new ConnectionResult(16));
        } catch (SecurityException e) {
            this.zaj = false;
            this.zai = null;
            throw e;
        }
    }

    @Override // defpackage.om2
    public final void disconnect() {
        zad();
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @Override // defpackage.om2
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // defpackage.om2
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public IBinder getBinder() {
        zad();
        return this.zai;
    }

    @Override // defpackage.om2
    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        cvw.l(this.zad);
        return this.zad.getPackageName();
    }

    @Override // defpackage.om2
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    @Override // defpackage.om2
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // defpackage.om2
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // defpackage.om2
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.EMPTY_SET;
    }

    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override // defpackage.om2
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // defpackage.om2
    public final boolean isConnected() {
        zad();
        return this.zai != null;
    }

    @Override // defpackage.om2
    public final boolean isConnecting() {
        zad();
        return this.zaj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zag.post(new do91(20, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zag.post(new h3s0(23, this));
    }

    @Override // defpackage.om2
    public final void onUserSignOut(d25 d25Var) {
    }

    @Override // defpackage.om2
    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    @Override // defpackage.om2
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // defpackage.om2
    public final boolean requiresSignIn() {
        return false;
    }

    public final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        this.zaf.onConnected(new Bundle());
    }

    public final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        this.zaf.onConnectionSuspended(1);
    }

    public final void zac(String str) {
        this.zal = str;
    }

    @Override // defpackage.om2
    public final void disconnect(String str) {
        zad();
        this.zak = str;
        disconnect();
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, ComponentName componentName, t4e t4eVar, yx60 yx60Var) {
        this(context, looper, null, null, componentName, t4eVar, yx60Var);
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, t4e t4eVar, yx60 yx60Var) {
        this(context, looper, str, str2, null, t4eVar, yx60Var);
    }
}
