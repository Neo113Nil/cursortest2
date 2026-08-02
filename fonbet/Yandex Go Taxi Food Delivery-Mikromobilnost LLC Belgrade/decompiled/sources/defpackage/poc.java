package defpackage;

import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;

/* loaded from: classes15.dex */
public final class poc extends n15 {
    @Override // defpackage.n15
    public final String f(MessageData messageData) {
        if (!(messageData instanceof PollMessageData)) {
            return "";
        }
        String str = ((PollMessageData) messageData).title;
        return "📊 ".concat(str != null ? str : "");
    }
}
