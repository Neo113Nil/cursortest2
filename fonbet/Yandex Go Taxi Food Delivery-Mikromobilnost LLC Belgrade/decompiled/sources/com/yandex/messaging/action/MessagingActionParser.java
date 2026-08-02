package com.yandex.messaging.action;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.SavedMessages;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import defpackage.ny61;
import defpackage.p8b;
import defpackage.u6b;
import defpackage.vng;
import defpackage.z83;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingActionParser;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessagingActionParser {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d7, code lost:
    
        if (r1.equals("com.yandex.messenger.Sharing.OPEN") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ed, code lost:
    
        if (r1.equals("com.yandex.messenger.ChatList.OPEN") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        if (r1.equals("com.yandex.messenger.SEND") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01da, code lost:
    
        r0 = defpackage.bcb1.r(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01de, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e5, code lost:
    
        return new com.yandex.messaging.action.MessagingAction.Sharing(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        if (r1.equals("com.yandex.alicenger.ChatList.OPEN") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f2, code lost:
    
        return com.yandex.messaging.action.MessagingAction.OpenChatList.a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MessagingAction a(Bundle bundle) {
        ChatRequest privateChat;
        String string = bundle.getString("ACTION_STRING");
        ChatRequest chatRequest = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (string == null) {
            ny61.g("actionString should be defined");
            return null;
        }
        int hashCode = string.hashCode();
        int i = 2;
        MessagingAction.NoAction noAction = MessagingAction.NoAction.a;
        switch (hashCode) {
            case -1656886624:
                if (string.equals("com.yandex.messenger.ChannelParticipants.OPEN")) {
                    String string2 = bundle.getString("Chat.CHAT_ID");
                    if (string2 != null) {
                        return new MessagingAction.ChannelParticipants(string2);
                    }
                    z83.i();
                    return noAction;
                }
                return null;
            case -1644268425:
                break;
            case -1593113049:
                break;
            case -1462712463:
                if (string.equals("com.yandex.messenger.Chat.OPEN_FROM_SHORTCUT")) {
                    String string3 = bundle.getString("Chat.CHAT_ID");
                    if (string3 != null) {
                        privateChat = p8b.a(string3);
                    } else {
                        String string4 = bundle.getString("Chat.USER_ID");
                        if (string4 != null) {
                            privateChat = new PrivateChat(string4, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                        }
                    }
                    return new MessagingAction.OpenChatFromShortcut(privateChat);
                }
                return null;
            case -1377718232:
                if (string.equals("com.yandex.messenger.Meeting.OPEN")) {
                    return new MessagingAction.OpenMeeting(bundle.getString("Meeting.MEETING_ID", ""));
                }
                return null;
            case -759561078:
                if (string.equals("com.yandex.messenger.Settings.OPEN")) {
                    return MessagingAction.OpenSettings.a;
                }
                return null;
            case -650353974:
                break;
            case -605266232:
                if (string.equals("com.yandex.messenger.LastUnread.OPEN")) {
                    return MessagingAction.OpenLastUnread.a;
                }
                return null;
            case -556530573:
                break;
            case -116013099:
                if (string.equals("com.yandex.messenger.ContactInfo.OPEN")) {
                    String string5 = bundle.getString("Chat.USER_ID");
                    if (string5 != null) {
                        return new MessagingAction.ContactInfo(string5);
                    }
                    String string6 = bundle.getString("user_guid");
                    if (string6 != null) {
                        return new MessagingAction.ContactInfo(string6);
                    }
                    return noAction;
                }
                return null;
            case 0:
                if (string.equals("")) {
                    return noAction;
                }
                return null;
            case 242899189:
                if (string.equals("com.yandex.messenger.Chat.OPEN")) {
                    ChatRequest chatRequest2 = (ChatRequest) vng.u(bundle, ChatRequest.class, "Chat.REQUEST_ID");
                    if (chatRequest2 == null) {
                        String string7 = bundle.getString("Chat.CHAT_ID");
                        String string8 = bundle.getString("Chat.BOT_ID");
                        if (string7 != null || string8 == null) {
                            if (string7 != null) {
                                chatRequest = p8b.a(string7);
                            } else {
                                String string9 = bundle.getString("Chat.INVITE_HASH");
                                if (string9 != null) {
                                    chatRequest = new InviteChat(string9);
                                } else {
                                    String string10 = bundle.getString("Chat.ALIAS");
                                    if (string10 != null) {
                                        chatRequest = new ChatAlias(string10);
                                    }
                                }
                            }
                            if (chatRequest == null) {
                                chatRequest = SavedMessages.INSTANCE;
                            }
                            ChatRequest chatRequest3 = chatRequest;
                            String string11 = bundle.getString("Chat.TEXT");
                            String string12 = bundle.getString("Chat.PAYLOAD");
                            ServerMessageRef serverMessageRef = (ServerMessageRef) vng.u(bundle, ServerMessageRef.class, "Chat.SERVER_MESSAGE_REF");
                            boolean z = bundle.getBoolean("Chat.INVITE");
                            boolean z2 = bundle.getBoolean("Chat.JOIN");
                            String string13 = bundle.getString("Chat.BOT_REQUEST");
                            boolean z3 = bundle.getBoolean("Chat.OPEN_SEARCH");
                            boolean z4 = bundle.getBoolean("Chat.OPENED_FROM_NOTIFICATION");
                            u6b u6bVar = ChatOpenTarget.Companion;
                            String string14 = bundle.getString("Chat.CHAT_OPEN_TARGET");
                            u6bVar.getClass();
                            return new MessagingAction.OpenChat(chatRequest3, string11, string12, serverMessageRef, z, z2, string13, z3, u6b.a(string14), z4, bundle.getString("Chat.SUPPORT_CONTEXT"), false, bundle.getBoolean("Chat.PERSONAL_INVITE_LINK"), null, 26624);
                        }
                        chatRequest2 = new PrivateChat(string8, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
                    }
                    chatRequest = chatRequest2;
                    if (chatRequest == null) {
                    }
                    ChatRequest chatRequest32 = chatRequest;
                    String string112 = bundle.getString("Chat.TEXT");
                    String string122 = bundle.getString("Chat.PAYLOAD");
                    ServerMessageRef serverMessageRef2 = (ServerMessageRef) vng.u(bundle, ServerMessageRef.class, "Chat.SERVER_MESSAGE_REF");
                    boolean z5 = bundle.getBoolean("Chat.INVITE");
                    boolean z22 = bundle.getBoolean("Chat.JOIN");
                    String string132 = bundle.getString("Chat.BOT_REQUEST");
                    boolean z32 = bundle.getBoolean("Chat.OPEN_SEARCH");
                    boolean z42 = bundle.getBoolean("Chat.OPENED_FROM_NOTIFICATION");
                    u6b u6bVar2 = ChatOpenTarget.Companion;
                    String string142 = bundle.getString("Chat.CHAT_OPEN_TARGET");
                    u6bVar2.getClass();
                    return new MessagingAction.OpenChat(chatRequest32, string112, string122, serverMessageRef2, z5, z22, string132, z32, u6b.a(string142), z42, bundle.getString("Chat.SUPPORT_CONTEXT"), false, bundle.getBoolean("Chat.PERSONAL_INVITE_LINK"), null, 26624);
                }
                return null;
            case 732632113:
                if (string.equals("com.yandex.messenger.CallList.OPEN")) {
                    return new MessagingAction.OpenCallList(bundle.getBoolean("CallList.CLEAR_NAVIGATION_STACK", false));
                }
                return null;
            case 811453031:
                if (string.equals("com.yandex.messenger.ChatInfo.OPEN")) {
                    String string15 = bundle.getString("Chat.CHAT_ID");
                    if (string15 != null) {
                        return new MessagingAction.ChatInfo(string15);
                    }
                    z83.i();
                    return noAction;
                }
                return null;
            case 1396468191:
                if (string.equals("com.yandex.messenger.NotificationSettings.OPEN")) {
                    return MessagingAction.NotificationSettings.a;
                }
                return null;
            case 1451091322:
                if (string.equals("com.yandex.messenger.Profile.OPEN")) {
                    return MessagingAction.Profile.a;
                }
                return null;
            case 1615052370:
                if (string.equals("com.yandex.messenger.ChannelInfo.OPEN")) {
                    String string16 = bundle.getString("Chat.CHAT_ID");
                    if (string16 != null) {
                        return new MessagingAction.ChannelInfo(string16);
                    }
                    z83.i();
                    return noAction;
                }
                return null;
            case 2099328095:
                if (string.equals("com.yandex.messenger.TelemessengerOnboarding.OPEN")) {
                    return MessagingAction.OpenTelemessengerOnboarding.a;
                }
                return null;
        }
    }
}
