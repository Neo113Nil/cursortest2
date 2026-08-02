package com.yandex.pulse.metrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.DeadSystemException;
import android.os.Message;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.bfh;
import defpackage.hgz;
import defpackage.jd20;
import defpackage.rp50;
import defpackage.sp50;
import defpackage.tp50;
import defpackage.u941;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 22\u00020\u0001:\u00043(4\u0004B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R$\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00101\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010'¨\u00065"}, d2 = {"Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Ltp50;", "observer", "<init>", "(Landroid/content/Context;Ltp50;)V", "Landroid/os/Message;", "m", "Lzy11;", "handleMessage", "(Landroid/os/Message;)V", "handleReceive", "()V", "handleSignal", "connectionTypeChanged", "register", "unregister", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "Ltp50;", "Lu941;", "handlerCallback", "Lu941;", "Lcom/yandex/pulse/utils/WeakHandler;", "handler", "Lcom/yandex/pulse/utils/WeakHandler;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "", "<set-?>", "lastConnectionType", CA20Status.STATUS_USER_I, "getLastConnectionType", "()I", "Lsp50;", "connectivityManagerDelegate", "Lsp50;", "", "registered", "Z", "shouldSignalObserver", "ignoreNextBroadcast", "getCurrentConnectionType", "currentConnectionType", "Companion", "rp50", "hgz", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NetworkChangeDetector extends BroadcastReceiver {
    public static final int CONNECTION_2G = 3;
    public static final int CONNECTION_3G = 4;
    public static final int CONNECTION_4G = 5;
    public static final int CONNECTION_BLUETOOTH = 7;
    public static final int CONNECTION_ETHERNET = 1;
    public static final int CONNECTION_LAST = 7;
    public static final int CONNECTION_NONE = 6;
    public static final int CONNECTION_UNKNOWN = 0;
    public static final int CONNECTION_WIFI = 2;
    public static final rp50 Companion = new rp50();
    private static final int RECEIVE_MESSAGE_ID = 0;
    private static final int SIGNAL_MESSAGE_ID = 1;
    private final sp50 connectivityManagerDelegate;
    private final Context context;
    private final WeakHandler handler;
    private final u941 handlerCallback;
    private boolean ignoreNextBroadcast;
    private final IntentFilter intentFilter;
    private int lastConnectionType;
    private final tp50 observer;
    private boolean registered;
    private final boolean shouldSignalObserver;

    public NetworkChangeDetector(Context context, tp50 tp50Var) {
        this.context = context;
        this.observer = tp50Var;
        bfh bfhVar = new bfh(3, this);
        this.handlerCallback = bfhVar;
        this.handler = new WeakHandler(bfhVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
        this.intentFilter = intentFilter;
        this.lastConnectionType = getCurrentConnectionType();
        this.connectivityManagerDelegate = new sp50(context);
        this.shouldSignalObserver = true;
    }

    private final void connectionTypeChanged() {
        int currentConnectionType = getCurrentConnectionType();
        if (this.lastConnectionType == currentConnectionType) {
            return;
        }
        this.lastConnectionType = currentConnectionType;
        ((jd20) this.observer).a.onConnectionTypeChanged(currentConnectionType);
    }

    private final int getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.connectivityManagerDelegate.a.getActiveNetworkInfo();
            return (activeNetworkInfo == null ? new hgz(false, -1, -1) : new hgz(true, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype())).a;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMessage(Message m) {
        int i = m.what;
        if (i == 0) {
            handleReceive();
        } else {
            if (i != 1) {
                return;
            }
            handleSignal();
        }
    }

    private final void handleReceive() {
        if (this.registered) {
            if (this.ignoreNextBroadcast) {
                this.ignoreNextBroadcast = false;
            } else {
                connectionTypeChanged();
            }
        }
    }

    private final void handleSignal() {
        if (this.registered) {
            connectionTypeChanged();
        }
    }

    public final int getLastConnectionType() {
        return this.lastConnectionType;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.handler.sendEmptyMessage(0);
    }

    public final void register() {
        Intent intent;
        if (this.registered) {
            return;
        }
        if (this.shouldSignalObserver) {
            this.handler.sendEmptyMessage(1);
        }
        try {
            intent = this.context.registerReceiver(this, this.intentFilter);
        } catch (IllegalArgumentException unused) {
            intent = null;
        }
        this.ignoreNextBroadcast = intent != null;
        this.registered = true;
    }

    public final void unregister() {
        if (this.registered) {
            try {
                this.context.unregisterReceiver(this);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadSystemException)) {
                    throw e;
                }
            }
            this.registered = false;
        }
    }
}
