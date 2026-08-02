package com.yandex.messenger.websdk.internal.webview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/messenger/websdk/internal/webview/ChatWebViewController$IntentPage", "", "Lcom/yandex/messenger/websdk/internal/webview/ChatWebViewController$IntentPage;", "CHAT_LIST", "CHAT", "UNDEFINED", "PROFILE", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatWebViewController$IntentPage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatWebViewController$IntentPage[] $VALUES;
    public static final ChatWebViewController$IntentPage CHAT;
    public static final ChatWebViewController$IntentPage CHAT_LIST;
    public static final ChatWebViewController$IntentPage PROFILE;
    public static final ChatWebViewController$IntentPage UNDEFINED;

    static {
        ChatWebViewController$IntentPage chatWebViewController$IntentPage = new ChatWebViewController$IntentPage("CHAT_LIST", 0);
        CHAT_LIST = chatWebViewController$IntentPage;
        ChatWebViewController$IntentPage chatWebViewController$IntentPage2 = new ChatWebViewController$IntentPage("CHAT", 1);
        CHAT = chatWebViewController$IntentPage2;
        ChatWebViewController$IntentPage chatWebViewController$IntentPage3 = new ChatWebViewController$IntentPage("UNDEFINED", 2);
        UNDEFINED = chatWebViewController$IntentPage3;
        ChatWebViewController$IntentPage chatWebViewController$IntentPage4 = new ChatWebViewController$IntentPage("PROFILE", 3);
        PROFILE = chatWebViewController$IntentPage4;
        ChatWebViewController$IntentPage[] chatWebViewController$IntentPageArr = {chatWebViewController$IntentPage, chatWebViewController$IntentPage2, chatWebViewController$IntentPage3, chatWebViewController$IntentPage4};
        $VALUES = chatWebViewController$IntentPageArr;
        $ENTRIES = kotlin.enums.a.a(chatWebViewController$IntentPageArr);
    }

    public static ChatWebViewController$IntentPage valueOf(String str) {
        return (ChatWebViewController$IntentPage) Enum.valueOf(ChatWebViewController$IntentPage.class, str);
    }

    public static ChatWebViewController$IntentPage[] values() {
        return (ChatWebViewController$IntentPage[]) $VALUES.clone();
    }
}
