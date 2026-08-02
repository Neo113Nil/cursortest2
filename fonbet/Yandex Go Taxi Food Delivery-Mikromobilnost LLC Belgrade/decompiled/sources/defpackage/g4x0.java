package defpackage;

import com.yandex.quark.webchat.navigation.NavigationEntry$Type;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;

/* loaded from: classes4.dex */
public abstract class g4x0 {
    public static final h750 a(TAliceChatCapability.TChatNavigationEntry tChatNavigationEntry) {
        NavigationEntry$Type navigationEntry$Type;
        String id = tChatNavigationEntry.getId();
        int i = f4x0.a[tChatNavigationEntry.getType().ordinal()];
        if (i == 1) {
            navigationEntry$Type = NavigationEntry$Type.UNKNOWN;
        } else if (i == 2) {
            navigationEntry$Type = NavigationEntry$Type.CHAT;
        } else if (i == 3) {
            navigationEntry$Type = NavigationEntry$Type.CHAT_LIST;
        } else if (i == 4) {
            navigationEntry$Type = NavigationEntry$Type.SKILL;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            navigationEntry$Type = NavigationEntry$Type.CHAT_FOLDER;
        }
        return new h750(id, navigationEntry$Type, tChatNavigationEntry.getTitle(), tChatNavigationEntry.getCanNavigateBack());
    }
}
