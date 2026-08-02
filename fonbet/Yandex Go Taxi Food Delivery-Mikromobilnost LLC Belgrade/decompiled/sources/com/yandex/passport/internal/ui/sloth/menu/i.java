package com.yandex.passport.internal.ui.sloth.menu;

import android.os.Bundle;
import android.os.Message;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;

/* loaded from: classes2.dex */
public final class i implements com.yandex.passport.internal.provider.communication.o {
    @Override // com.yandex.passport.internal.provider.communication.o
    public final Object a(Message message) {
        Object obj = message.obj;
        Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
        String string = bundle != null ? bundle.getString(UserIdCommunicationService.HOST_COMMAND) : null;
        return string == null ? "ERROR: Unsupported message type" : string;
    }
}
