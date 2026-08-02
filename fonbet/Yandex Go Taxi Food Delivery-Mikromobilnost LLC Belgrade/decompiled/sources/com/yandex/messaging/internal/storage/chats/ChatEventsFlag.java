package com.yandex.messaging.internal.storage.chats;

import defpackage.k4o;
import defpackage.kgx;
import defpackage.u2b;
import defpackage.vbi0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00000\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/internal/storage/chats/ChatEventsFlag;", "Lvbi0;", "Lu2b;", "", "", "", "flagName", "Ljava/lang/String;", "getFlagName", "()Ljava/lang/String;", "Open", "Sync", "Focus", "InlineSuggest", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatEventsFlag implements vbi0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatEventsFlag[] $VALUES;
    public static final ChatEventsFlag Focus;
    public static final ChatEventsFlag InlineSuggest;
    public static final ChatEventsFlag Open;
    public static final ChatEventsFlag Sync;
    private final String flagName;

    static {
        ChatEventsFlag chatEventsFlag = new ChatEventsFlag("Open", 0, OpenList.STR_OPEN);
        Open = chatEventsFlag;
        ChatEventsFlag chatEventsFlag2 = new ChatEventsFlag("Sync", 1, "sync");
        Sync = chatEventsFlag2;
        ChatEventsFlag chatEventsFlag3 = new ChatEventsFlag("Focus", 2, "focus");
        Focus = chatEventsFlag3;
        ChatEventsFlag chatEventsFlag4 = new ChatEventsFlag("InlineSuggest", 3, "inline_suggest");
        InlineSuggest = chatEventsFlag4;
        ChatEventsFlag[] chatEventsFlagArr = {chatEventsFlag, chatEventsFlag2, chatEventsFlag3, chatEventsFlag4};
        $VALUES = chatEventsFlagArr;
        $ENTRIES = a.a(chatEventsFlagArr);
    }

    public ChatEventsFlag(String str, int i, String str2) {
        this.flagName = str2;
    }

    public static ChatEventsFlag valueOf(String str) {
        return (ChatEventsFlag) Enum.valueOf(ChatEventsFlag.class, str);
    }

    public static ChatEventsFlag[] values() {
        return (ChatEventsFlag[]) $VALUES.clone();
    }

    public final Boolean a(u2b u2bVar) {
        return Boolean.valueOf(((1 << ordinal()) & u2bVar.a) > 0);
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a((u2b) obj);
    }
}
