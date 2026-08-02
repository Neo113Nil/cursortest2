package com.yandex.passport.internal.core.announcing;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes8.dex */
public final class d {
    public final Context a;

    public d(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        com.yandex.passport.legacy.a.a("sendAnnounce: " + aVar);
        Intent d = aVar.d();
        Context context = this.a;
        d.setPackage(context.getPackageName());
        context.sendBroadcast(d);
    }
}
