package defpackage;

import android.content.Context;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes15.dex */
public final class pe10 extends n15 {
    @Override // defpackage.n15
    public final String f(MessageData messageData) {
        MediaMessageData mediaMessageData = (MediaMessageData) messageData;
        return (String) mediaMessageData.a(new oe10(((Context) this.b).getResources(), mediaMessageData, this));
    }
}
