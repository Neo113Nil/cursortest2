package com.yandex.pulse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadSystemException;
import android.os.Message;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.bfh;
import defpackage.u941;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 32\u00020\u0001:\u000234B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u0011\u00100\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0011\u00102\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b1\u0010+¨\u00065"}, d2 = {"Lcom/yandex/pulse/PowerStateChangeDetector;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Lcom/yandex/pulse/PowerStateChangeDetector$Observer;", "observer", "", "skipNotificationOnRegister", "<init>", "(Landroid/content/Context;Lcom/yandex/pulse/PowerStateChangeDetector$Observer;Z)V", "Lzy11;", "updatePowerStateAndChargingSource", "()V", "Landroid/content/Intent;", "batteryStatus", "(Landroid/content/Intent;)Z", "Landroid/os/Message;", "m", "handleMessage", "(Landroid/os/Message;)V", "notifyObserver", "register", "unregister", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "Lcom/yandex/pulse/PowerStateChangeDetector$Observer;", "Z", "Lu941;", "handlerCallback", "Lu941;", "Lcom/yandex/pulse/utils/WeakHandler;", "handler", "Lcom/yandex/pulse/utils/WeakHandler;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "", "<set-?>", "lastKnownPowerState", CA20Status.STATUS_USER_I, "getLastKnownPowerState", "()I", "lastKnownChargingSource", "getLastKnownChargingSource", "registered", "getActualPowerState", "actualPowerState", "getActualChargingSource", "actualChargingSource", "Companion", "Observer", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PowerStateChangeDetector extends BroadcastReceiver {
    public static final int CHARGING_SOURCE_AC = 1;
    public static final int CHARGING_SOURCE_UNKNOWN = -1;
    public static final int CHARGING_SOURCE_USB = 0;
    public static final int CHARGING_SOURCE_WIRELESS = 2;
    private static final int NOTIFY_OBSERVER_ID = 0;
    public static final int POWER_STATE_CHARGING = 2;
    public static final int POWER_STATE_DISCHARGING = 0;
    public static final int POWER_STATE_FULL = 3;
    public static final int POWER_STATE_NOT_CHARGING = 1;
    public static final int POWER_STATE_UNKNOWN = -1;
    private final Context context;
    private final WeakHandler handler;
    private final u941 handlerCallback;
    private final IntentFilter intentFilter;
    private int lastKnownChargingSource;
    private int lastKnownPowerState;
    private final Observer observer;
    private boolean registered;
    private final boolean skipNotificationOnRegister;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/pulse/PowerStateChangeDetector$Observer;", "", "", "powerState", "chargingSource", "Lzy11;", "onPowerStateChanged", "(II)V", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Observer {
        void onPowerStateChanged(int powerState, int chargingSource);
    }

    public PowerStateChangeDetector(Context context, Observer observer, boolean z) {
        this.context = context;
        this.observer = observer;
        this.skipNotificationOnRegister = z;
        bfh bfhVar = new bfh(4, this);
        this.handlerCallback = bfhVar;
        this.handler = new WeakHandler(bfhVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        this.intentFilter = intentFilter;
        this.lastKnownPowerState = -1;
        this.lastKnownChargingSource = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMessage(Message m) {
        if (m.what == 0) {
            notifyObserver();
        }
    }

    private final void notifyObserver() {
        if (this.registered) {
            this.observer.onPowerStateChanged(this.lastKnownPowerState, this.lastKnownChargingSource);
        }
    }

    private final boolean updatePowerStateAndChargingSource(Intent batteryStatus) {
        int i;
        int i2;
        int intExtra = batteryStatus.getIntExtra(ACSPConstants.STATUS, -1);
        if (intExtra != 2) {
            i2 = 3;
            if (intExtra == 3) {
                i = -1;
                i2 = 0;
            } else if (intExtra == 4) {
                i = -1;
                i2 = 1;
            } else if (intExtra != 5) {
                i2 = -1;
                i = -1;
            } else {
                i = -1;
            }
        } else {
            int intExtra2 = batteryStatus.getIntExtra("plugged", -1);
            if (intExtra2 == 1) {
                i = 1;
            } else if (intExtra2 != 2) {
                i = intExtra2 != 4 ? -1 : 2;
            } else {
                i = 0;
            }
            i2 = 2;
        }
        int i3 = this.lastKnownPowerState;
        if (i2 != i3) {
            if (i2 == -1) {
                this.lastKnownChargingSource = -1;
                return false;
            }
            this.lastKnownPowerState = i2;
            this.lastKnownChargingSource = i;
            return true;
        }
        if (i3 != 2 || i == this.lastKnownChargingSource || i == -1) {
            return false;
        }
        this.lastKnownChargingSource = i;
        return true;
    }

    /* renamed from: getActualChargingSource, reason: from getter */
    public final int getLastKnownChargingSource() {
        return this.lastKnownChargingSource;
    }

    public final int getActualPowerState() {
        updatePowerStateAndChargingSource();
        return this.lastKnownPowerState;
    }

    public final int getLastKnownChargingSource() {
        return this.lastKnownChargingSource;
    }

    public final int getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (updatePowerStateAndChargingSource(intent)) {
            this.handler.sendEmptyMessage(0);
        }
    }

    public final void register() {
        Intent intent;
        if (this.registered) {
            return;
        }
        try {
            intent = this.context.registerReceiver(this, this.intentFilter);
        } catch (IllegalArgumentException unused) {
            intent = null;
        }
        this.registered = true;
        if (intent == null || !updatePowerStateAndChargingSource(intent) || this.skipNotificationOnRegister) {
            return;
        }
        this.handler.sendEmptyMessage(0);
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

    private final void updatePowerStateAndChargingSource() {
        Intent intent = null;
        try {
            intent = this.context.registerReceiver(null, this.intentFilter);
        } catch (IllegalArgumentException unused) {
        }
        if (intent != null) {
            updatePowerStateAndChargingSource(intent);
        }
    }
}
