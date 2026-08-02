package ru.mail.libverify.j0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TelephonyNetworkSpecifier;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.verify.core.utils.FileLog;
import xsna.anj;
import xsna.pqx0;
import xsna.s3q0;
import xsna.twy0;

/* loaded from: classes9.dex */
public final class g {
    private static ConnectivityManager a;
    private static final Set<String> b = Collections.synchronizedSet(new HashSet());
    private static final AtomicReference<Network> c = new AtomicReference<>(null);
    private static final AtomicBoolean d = new AtomicBoolean(false);
    private static final a e = new a();

    public static final class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            g.a().set(network);
            FileLog.d("ConnectivityHelper", "Network available " + network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            FileLog.d("ConnectivityHelper", "Receive onLinkPropertiesChanged");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            FileLog.d("ConnectivityHelper", "Network lost " + network);
            g.a().set(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            super.onUnavailable();
            g.a().set(null);
            FileLog.d("ConnectivityHelper", "Network unavailable");
        }
    }

    public static final AtomicReference<Network> a() {
        return c;
    }

    public static final void a(String str) {
        ConnectivityManager connectivityManager;
        Set<String> set = b;
        synchronized (set) {
            try {
                set.remove(str);
                if (set.isEmpty() && (connectivityManager = a) != null) {
                    connectivityManager.unregisterNetworkCallback(e);
                    d.set(false);
                    c.set(null);
                    FileLog.d("ConnectivityHelper", "Network listener has been removed");
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(Context context, String str) {
        SubscriptionManager subscriptionManager;
        int defaultDataSubscriptionId;
        SubscriptionInfo activeSubscriptionInfo;
        TelephonyNetworkSpecifier.Builder subscriptionId;
        TelephonyNetworkSpecifier build;
        try {
            Set<String> set = b;
            synchronized (set) {
                try {
                    if (set.contains(str)) {
                        return;
                    }
                    set.add(str);
                    AtomicBoolean atomicBoolean = d;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    a = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    builder.addCapability(12);
                    builder.addTransportType(0);
                    if (Build.VERSION.SDK_INT >= 30 && anj.a(context, "android.permission.READ_PHONE_STATE") == 0 && (subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service")) != null && (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) != -1 && (activeSubscriptionInfo = subscriptionManager.getActiveSubscriptionInfo(defaultDataSubscriptionId)) != null) {
                        pqx0.b();
                        subscriptionId = twy0.a().setSubscriptionId(activeSubscriptionInfo.getSubscriptionId());
                        build = subscriptionId.build();
                        builder.setNetworkSpecifier(build);
                    }
                    NetworkRequest build2 = builder.build();
                    ConnectivityManager connectivityManager = a;
                    if (connectivityManager != null) {
                        connectivityManager.requestNetwork(build2, e);
                        atomicBoolean.set(true);
                        FileLog.d("ConnectivityHelper", "Network listener registered");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            FileLog.e("ConnectivityHelper", th2, "Failed to register network listener.", new Object[0]);
        }
    }
}
