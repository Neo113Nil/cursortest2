package com.yandex.messaging.links;

import android.net.Uri;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import defpackage.clb1;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.p8b;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.u6b;
import defpackage.w610;
import java.util.Locale;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class a {
    public final sls a;

    public a(sls slsVar) {
        this.a = slsVar;
        scc.g(new MessagingLinkParser$messengerHandlers$1(1, this, a.class, "tryHandleSettings", "tryHandleSettings(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$2(1, this, a.class, "tryHandleUserByParams", "tryHandleUserByParams(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$3(1, this, a.class, "tryHandleChatListForMessenger", "tryHandleChatListForMessenger(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$4(1, this, a.class, "tryHandleChatOpenLastUnread", "tryHandleChatOpenLastUnread(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$5(1, this, a.class, "tryHandleChatOpenByParams", "tryHandleChatOpenByParams(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$6(1, this, a.class, "tryHandleChatInvite", "tryHandleChatInvite(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$7(1, this, a.class, "tryHandleChatInviteByHash", "tryHandleChatInviteByHash(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$8(1, this, a.class, "tryHandleJoinByFragment", "tryHandleJoinByFragment(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$messengerHandlers$9(1, this, a.class, "tryHandleJoinByPath", "tryHandleJoinByPath(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0));
        scc.g(new MessagingLinkParser$httpHandlers$1(1, this, a.class, "tryHandlePersonalInviteByPath", "tryHandlePersonalInviteByPath(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$2(1, this, a.class, "tryHandleTemporaryPersonalInviteLink", "tryHandleTemporaryPersonalInviteLink(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$3(1, this, a.class, "tryHandleSettings", "tryHandleSettings(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$4(1, this, a.class, "tryHandleSettingsByFragment", "tryHandleSettingsByFragment(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$5(1, this, a.class, "tryHandleEmptyMessengerPath", "tryHandleEmptyMessengerPath(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$6(1, this, a.class, "tryHandleChatList", "tryHandleChatList(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$7(1, this, a.class, "tryHandleJoinByFragment", "tryHandleJoinByFragment(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$8(1, this, a.class, "tryHandleJoinByPath", "tryHandleJoinByPath(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$9(1, this, a.class, "tryHandleJoinThreadByPath", "tryHandleJoinThreadByPath(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$10(1, this, a.class, "tryHandleJoinThreadByFragment", "tryHandleJoinThreadByFragment(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$11(1, this, a.class, "tryHandleChatOpenByFragmentSlashes", "tryHandleChatOpenByFragmentSlashes(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$12(1, this, a.class, "tryHandleChatOpenByPathSlashes", "tryHandleChatOpenByPathSlashes(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$13(1, this, a.class, "tryHandleUserByFragmentSlashes", "tryHandleUserByFragmentSlashes(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$14(1, this, a.class, "tryHandleUserByPathSlashes", "tryHandleUserByPathSlashes(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$15(1, this, a.class, "tryHandleStaff", "tryHandleStaff(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$16(1, this, a.class, "tryHandleAlias", "tryHandleAlias(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$17(1, this, a.class, "tryHandleAliasFragment", "tryHandleAliasFragment(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$18(1, this, a.class, "tryHandleTelemostStaff", "tryHandleTelemostStaff(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$19(1, this, a.class, "tryHandleTelemostAlias", "tryHandleTelemostAlias(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$20(1, this, a.class, "tryHandleTelemostJoin", "tryHandleTelemostJoin(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0), new MessagingLinkParser$httpHandlers$21(1, this, a.class, "tryHandleTelemostJoinThread", "tryHandleTelemostJoinThread(Landroid/net/Uri;)Lcom/yandex/messaging/action/MessagingAction;", 0));
    }

    public static MessagingAction b(Uri uri, String str, tls tlsVar) {
        return c(uri.toString(), str, tlsVar);
    }

    public static MessagingAction c(String str, String str2, tls tlsVar) {
        w610 g = new Regex(str2).g(str);
        if (g != null) {
            return (MessagingAction) tlsVar.invoke(g);
        }
        return null;
    }

    public static String d(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return evu0.T(queryParameter, "\"", "\"");
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public static MessagingAction e(Uri uri, boolean z) {
        String d = d(uri, "chat_id");
        if (d == null) {
            return MessagingAction.NoAction.a;
        }
        ExistingChatRequest a = p8b.a(d);
        String d2 = d(uri, "text");
        String d3 = d(uri, "payload");
        u6b u6bVar = ChatOpenTarget.Companion;
        String d4 = d(uri, "target");
        u6bVar.getClass();
        return new MessagingAction.OpenChat(a, d2, d3, null, z, false, null, false, u6b.a(d4), false, d(uri, "context"), false, false, null, 31464);
    }

    public final String a(Uri uri) {
        String path;
        String host;
        String scheme = uri.getScheme();
        if (!jl40.l(scheme != null ? scheme.toLowerCase(Locale.US) : null, "messenger") ? (path = uri.getPath()) == null || ((!clb1.d((MessengerEnvironment) ((PropertyReference0) this.a).get()) || new Regex("/?").g(path) == null) && new Regex("(?:/?messenger|/?chat)?(?:/?#)?/?").g(path) == null) : (host = uri.getHost()) == null || new Regex("(?:/?messenger|/?chat)(?:/?#)?/?").g(host) == null) {
            uri = null;
        }
        if (uri != null) {
            return uri.getFragment();
        }
        return null;
    }
}
