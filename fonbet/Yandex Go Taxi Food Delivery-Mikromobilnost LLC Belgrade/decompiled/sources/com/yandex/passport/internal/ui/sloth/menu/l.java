package com.yandex.passport.internal.ui.sloth.menu;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;
import defpackage.gwk0;

/* loaded from: classes2.dex */
public final class l extends com.yandex.passport.internal.provider.communication.a {
    public final Context d;

    public l(Context context, i iVar) {
        super(iVar);
        this.d = context;
    }

    @Override // com.yandex.passport.internal.provider.communication.a
    public final boolean a() {
        if (this.b == null) {
            this.b = gwk0.b();
        }
        UserIdCommunicationService.Companion.getClass();
        Context context = this.d;
        context.bindService(new Intent(context, (Class<?>) UserIdCommunicationService.class), this.c, 1);
        return true;
    }
}
