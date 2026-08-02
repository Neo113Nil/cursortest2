package com.yandex.go.broadcast;

import android.content.Context;
import android.content.IntentFilter;
import defpackage.eit;
import defpackage.qke;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;
import defpackage.wfi0;

/* loaded from: classes.dex */
public final class a implements vw60 {
    public final Context a;
    public final tse b;
    public final wfi0 c;

    public a(Context context, tse tseVar, wfi0 wfi0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = wfi0Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        LocalTimeChangedReceiver.Companion.getClass();
        LocalTimeChangedReceiver localTimeChangedReceiver = new LocalTimeChangedReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
        ((eit) this.c).getClass();
        qke.z(this.a, localTimeChangedReceiver, intentFilter, 2);
        tje.N(this.b, null, null, new ActivityBroadcastsLifecycleListener$onActivityCreate$1(this, localTimeChangedReceiver, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ActivityBroadcastsLifecycleListener";
    }
}
