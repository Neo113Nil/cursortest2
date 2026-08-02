package defpackage;

import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class bx6 {
    public static String a(ChatData chatData) {
        String currentProfileId;
        String[] members;
        Object obj = null;
        if (!ChatNamespaces.a(chatData.getChatId()) || (currentProfileId = chatData.getCurrentProfileId()) == null || (members = chatData.getMembers()) == null) {
            return null;
        }
        Iterator it = j73.d0(members).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!jl40.l((String) next, currentProfileId)) {
                obj = next;
                break;
            }
        }
        return (String) obj;
    }
}
