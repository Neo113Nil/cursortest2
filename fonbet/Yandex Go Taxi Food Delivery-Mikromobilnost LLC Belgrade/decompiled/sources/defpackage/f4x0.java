package defpackage;

import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f4x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TAliceChatCapability.TChatNavigationEntry.EType.values().length];
        try {
            iArr[TAliceChatCapability.TChatNavigationEntry.EType.Unknown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TAliceChatCapability.TChatNavigationEntry.EType.Chat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TAliceChatCapability.TChatNavigationEntry.EType.ChatList.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TAliceChatCapability.TChatNavigationEntry.EType.Skill.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TAliceChatCapability.TChatNavigationEntry.EType.ChatFolder.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
