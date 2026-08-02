package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.g;
import androidx.browser.customtabs.k;
import defpackage.ki11;
import defpackage.ny61;
import defpackage.qlf;
import defpackage.tlf;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private g mClient;
    private CustomTabsServiceConnection mConnection;
    private ConnectionCallback mConnectionCallback;
    private qlf mCustomTabsCallback;
    private k mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i);
    }

    public static void openTrustedWebActivity(Activity activity, ki11 ki11Var, Uri uri, Map<String, String> map, Uri uri2, int i) {
        openCustomTab(activity, ki11Var.a, uri, map, uri2, i);
    }

    public boolean bindCustomTabsService(Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
        if (packageNameToUse == null) {
            return false;
        }
        ServiceConnection serviceConnection = new ServiceConnection(this);
        this.mConnection = serviceConnection;
        serviceConnection.setApplicationContext(activity.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (packageNameToUse.isEmpty()) {
            ny61.g("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(packageNameToUse);
        return activity.bindService(intent, serviceConnection, 33);
    }

    public k getSession() {
        g gVar = this.mClient;
        if (gVar == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = gVar.b(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        k session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        try {
            return session.b.mayLaunchUrl(session.c, uri, session.a(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(g gVar) {
        this.mClient = gVar;
        gVar.getClass();
        try {
            gVar.a.warmup(0L);
        } catch (RemoteException unused) {
        }
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(qlf qlfVar) {
        this.mCustomTabsCallback = qlfVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.mConnection;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }

    public static void openCustomTab(Activity activity, tlf tlfVar, Uri uri, Map<String, String> map, Uri uri2, int i) {
        openCustomTab(activity, tlfVar.a, uri, map, uri2, i);
    }
}
