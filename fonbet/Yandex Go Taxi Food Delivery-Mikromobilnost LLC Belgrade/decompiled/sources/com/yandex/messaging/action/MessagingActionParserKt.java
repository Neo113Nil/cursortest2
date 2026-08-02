package com.yandex.messaging.action;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import defpackage.bcb1;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"messaging-core-internal_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MessagingActionParserKt {
    public static final String a(MessagingAction messagingAction) {
        if (messagingAction.equals(MessagingAction.NoAction.a)) {
            return "";
        }
        if (messagingAction.equals(MessagingAction.OpenSettings.a)) {
            return "com.yandex.messenger.Settings.OPEN";
        }
        if (messagingAction.equals(MessagingAction.OpenLastUnread.a)) {
            return "com.yandex.messenger.LastUnread.OPEN";
        }
        if (messagingAction.equals(MessagingAction.OpenChatList.a)) {
            return "com.yandex.messenger.ChatList.OPEN";
        }
        if (messagingAction instanceof MessagingAction.OpenChat) {
            return "com.yandex.messenger.Chat.OPEN";
        }
        if (messagingAction instanceof MessagingAction.OpenChatFromShortcut) {
            return "com.yandex.messenger.Chat.OPEN_FROM_SHORTCUT";
        }
        if (messagingAction instanceof MessagingAction.Sharing) {
            return "com.yandex.messenger.Sharing.OPEN";
        }
        if (messagingAction.equals(MessagingAction.Profile.a)) {
            return "com.yandex.messenger.Profile.OPEN";
        }
        if (messagingAction.equals(MessagingAction.NotificationSettings.a)) {
            return "com.yandex.messenger.NotificationSettings.OPEN";
        }
        if (messagingAction instanceof MessagingAction.ChatInfo) {
            return "com.yandex.messenger.ChatInfo.OPEN";
        }
        if (messagingAction instanceof MessagingAction.ContactInfo) {
            return "com.yandex.messenger.ContactInfo.OPEN";
        }
        if (messagingAction instanceof MessagingAction.ChannelInfo) {
            return "com.yandex.messenger.ChannelInfo.OPEN";
        }
        if (messagingAction instanceof MessagingAction.ChannelParticipants) {
            return "com.yandex.messenger.ChannelParticipants.OPEN";
        }
        if (messagingAction instanceof MessagingAction.OpenCallList) {
            return "com.yandex.messenger.CallList.OPEN";
        }
        if (messagingAction instanceof MessagingAction.ResolveInviteLink) {
            return "com.yandex.messenger.ResolveInviteLink.OPEN";
        }
        if (messagingAction instanceof MessagingAction.OpenMeeting) {
            return "com.yandex.messenger.Meeting.OPEN";
        }
        if (messagingAction.equals(MessagingAction.OpenTelemessengerOnboarding.a)) {
            return "com.yandex.messenger.TelemessengerOnboarding.OPEN";
        }
        w511.b();
        return null;
    }

    public static final Bundle b(MessagingAction messagingAction) {
        Bundle bundle;
        Bundle bundle2;
        if (messagingAction instanceof MessagingAction.OpenChat) {
            MessagingAction.OpenChat openChat = (MessagingAction.OpenChat) messagingAction;
            bundle = new Bundle();
            bundle.putParcelable("Chat.REQUEST_ID", openChat.a);
            bundle.putString("Chat.TEXT", openChat.b);
            bundle.putString("Chat.PAYLOAD", openChat.c);
            bundle.putParcelable("Chat.SERVER_MESSAGE_REF", openChat.d);
            bundle.putBoolean("Chat.INVITE", openChat.e);
            bundle.putBoolean("Chat.JOIN", openChat.f);
            bundle.putString("Chat.BOT_REQUEST", openChat.g);
            bundle.putBoolean("Chat.OPEN_SEARCH", openChat.h);
            bundle.putBoolean("Chat.OPENED_FROM_NOTIFICATION", openChat.j);
            ChatOpenTarget chatOpenTarget = openChat.i;
            bundle.putString("Chat.CHAT_OPEN_TARGET", chatOpenTarget != null ? chatOpenTarget.getValue() : null);
            bundle.putString("Chat.SUPPORT_CONTEXT", openChat.k);
            bundle.putBoolean("Chat.PERSONAL_INVITE_LINK", openChat.m);
        } else if (messagingAction instanceof MessagingAction.OpenChatFromShortcut) {
            Bundle bundle3 = new Bundle();
            ChatRequest chatRequest = ((MessagingAction.OpenChatFromShortcut) messagingAction).a;
            if (chatRequest instanceof ExistingChatRequest) {
                bundle3.putString("Chat.CHAT_ID", ((ExistingChatRequest) chatRequest).id());
            } else if (chatRequest instanceof PrivateChatRequest) {
                bundle3.putString("Chat.USER_ID", ((PrivateChatRequest) chatRequest).addressee());
            }
            bundle = bundle3;
        } else if (messagingAction instanceof MessagingAction.Sharing) {
            bundle = bcb1.s(((MessagingAction.Sharing) messagingAction).a);
        } else if (messagingAction instanceof MessagingAction.ContactInfo) {
            bundle = new Bundle();
            bundle.putString("Chat.USER_ID", ((MessagingAction.ContactInfo) messagingAction).a);
        } else {
            if (messagingAction instanceof MessagingAction.ChatInfo) {
                String str = ((MessagingAction.ChatInfo) messagingAction).a;
                bundle2 = new Bundle();
                bundle2.putString("Chat.CHAT_ID", str);
            } else if (messagingAction instanceof MessagingAction.ChannelInfo) {
                String str2 = ((MessagingAction.ChannelInfo) messagingAction).a;
                bundle2 = new Bundle();
                bundle2.putString("Chat.CHAT_ID", str2);
            } else if (messagingAction instanceof MessagingAction.ChannelParticipants) {
                String str3 = ((MessagingAction.ChannelParticipants) messagingAction).a;
                bundle2 = new Bundle();
                bundle2.putString("Chat.CHAT_ID", str3);
            } else if (messagingAction instanceof MessagingAction.OpenCallList) {
                bundle = new Bundle();
                bundle.putBoolean("CallList.CLEAR_NAVIGATION_STACK", ((MessagingAction.OpenCallList) messagingAction).a);
            } else if (messagingAction instanceof MessagingAction.OpenMeeting) {
                bundle = new Bundle();
                bundle.putString("Meeting.MEETING_ID", ((MessagingAction.OpenMeeting) messagingAction).a);
            } else {
                bundle = new Bundle();
            }
            bundle = bundle2;
        }
        bundle.putString("ACTION_STRING", a(messagingAction));
        return bundle;
    }
}
