package com.twilio.audioswitch.wired;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.l851;
import defpackage.n9f0;
import defpackage.ogz;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/twilio/audioswitch/wired/WiredHeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Logz;", "logger", "<init>", "(Landroid/content/Context;Logz;)V", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Ll851;", "deviceListener", "start", "(Ll851;)V", "stop", "()V", "Ll851;", "getDeviceListener$audioswitch_release", "()Ll851;", "setDeviceListener$audioswitch_release", "Landroid/content/Context;", "Logz;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes11.dex */
public final class WiredHeadsetReceiver extends BroadcastReceiver {
    private final Context context;
    private l851 deviceListener;
    private final ogz logger;

    public WiredHeadsetReceiver(Context context, ogz ogzVar) {
        this.context = context;
        this.logger = ogzVar;
    }

    public final l851 getDeviceListener$audioswitch_release() {
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getIntExtra(ClidProvider.STATE, 0) == 1) {
            intent.getStringExtra("name");
            ((n9f0) this.logger).getClass();
        } else {
            intent.getStringExtra("name");
            ((n9f0) this.logger).getClass();
        }
    }

    public final void setDeviceListener$audioswitch_release(l851 l851Var) {
    }

    public final void start(l851 deviceListener) {
        this.context.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public final void stop() {
        this.context.unregisterReceiver(this);
    }
}
