package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class kz10 {
    public final z7b a;
    public final LinkedHashMap b = new LinkedHashMap();

    public kz10(z7b z7bVar) {
        this.a = z7bVar;
    }

    public final f5b a(ServerMessageRef serverMessageRef) {
        ChatId a = ChatId.Companion.a(serverMessageRef.getRequiredChatId());
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(a);
        if (obj == null) {
            obj = new f5b(p8b.a(a.a), this.a);
            linkedHashMap.put(a, obj);
        }
        return (f5b) obj;
    }
}
