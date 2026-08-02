package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;

/* compiled from: ClipsShareRemoteStorageMapper.kt */
/* loaded from: classes17.dex */
public final class p3f {

    /* compiled from: ClipsShareRemoteStorageMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesConversationPeerTypeDto.values().length];
            try {
                iArr[MessagesConversationPeerTypeDto.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesConversationPeerTypeDto.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagesConversationPeerTypeDto.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessagesConversationPeerTypeDto.GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessagesConversationPeerTypeDto.CONTACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
