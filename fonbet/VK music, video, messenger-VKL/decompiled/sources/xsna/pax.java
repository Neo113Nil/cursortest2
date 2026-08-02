package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import xsna.epx;
import xsna.p3h;

/* compiled from: IntentSource.kt */
/* loaded from: classes18.dex */
public final class pax implements c6x {
    public static final pax a = new pax();

    @Override // xsna.c6x
    public final void a(final p3h p3hVar) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        context.registerReceiver(new BroadcastReceiver() { // from class: com.vk.design.inspector.source.IntentSource$createReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (intent != null && epx.f(intent.getAction(), "com.vk.design.inspector.BLINK")) {
                    p3h.this.invoke();
                }
            }
        }, new IntentFilter("com.vk.design.inspector.BLINK"), 2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pax);
    }

    public final int hashCode() {
        return 742161263;
    }

    public final String toString() {
        return "IntentSource";
    }
}
