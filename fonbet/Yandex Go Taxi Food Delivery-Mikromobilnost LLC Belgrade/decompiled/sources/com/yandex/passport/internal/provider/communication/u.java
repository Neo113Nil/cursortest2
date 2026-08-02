package com.yandex.passport.internal.provider.communication;

import android.content.Context;
import android.content.Intent;
import defpackage.gwk0;

/* loaded from: classes8.dex */
public final class u extends a {
    public final Context d;

    public u(Context context, r rVar) {
        super(rVar);
        this.d = context;
    }

    @Override // com.yandex.passport.internal.provider.communication.a
    public final boolean a() {
        if (this.b != null) {
            return false;
        }
        this.b = gwk0.b();
        HostCommunicationService.Companion.getClass();
        Context context = this.d;
        context.bindService(new Intent(context, (Class<?>) HostCommunicationService.class), this.c, 1);
        return true;
    }
}
