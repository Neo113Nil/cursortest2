package com.yandex.go.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.eit;
import defpackage.h6r;
import defpackage.jst;
import defpackage.lux;
import defpackage.qke;
import defpackage.t4z;
import defpackage.wfi0;
import defpackage.wwg;
import defpackage.yvw;
import defpackage.zxs0;
import defpackage.zzf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/go/broadcast/LocalTimeChangedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "t4z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalTimeChangedReceiver extends BroadcastReceiver {
    public static final t4z Companion = new t4z();

    public static final LocalTimeChangedReceiver registerReceiver(Context context, wfi0 wfi0Var) {
        Companion.getClass();
        LocalTimeChangedReceiver localTimeChangedReceiver = new LocalTimeChangedReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
        ((eit) wfi0Var).getClass();
        qke.z(context, localTimeChangedReceiver, intentFilter, 2);
        return localTimeChangedReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIME_SET".equals(intent != null ? intent.getAction() : null)) {
            jst.e.getClass();
            zzf zzfVar = (zzf) ((h6r) wwg.e(context, h6r.class));
            new zxs0((lux) zzfVar.a0.get(), new yvw((com.yandex.go.taxi.tariffs.internal.repository.a) zzfVar.Mf.get())).v();
        }
    }
}
