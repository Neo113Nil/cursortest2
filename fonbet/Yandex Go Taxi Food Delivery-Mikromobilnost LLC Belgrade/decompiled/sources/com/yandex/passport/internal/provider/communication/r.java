package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;

/* loaded from: classes8.dex */
public final class r implements o {
    @Override // com.yandex.passport.internal.provider.communication.o
    public final Object a(Message message) {
        Object obj = message.obj;
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }
}
