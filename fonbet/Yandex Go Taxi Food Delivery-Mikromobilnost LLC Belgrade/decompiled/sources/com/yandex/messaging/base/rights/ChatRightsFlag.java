package com.yandex.messaging.base.rights;

import defpackage.by4;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.s8b;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/yandex/messaging/base/rights/ChatRightsFlag;", "Lby4;", "Ls8b;", "", "", "flagName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "ordinalValue", CA20Status.STATUS_USER_I, "p", "()I", "Join", "Leave", "Read", "Write", "Change", "Invite", "AddUsers", "ChangeRole", "ListMembers", "RemoveUsers", "MarkAsImportant", "PinMessage", "DeleteMessage", "ChangeRights", "EditMessage", "WriteThreads", "ManageMeetings", "Translate", "SendStickers", "SendReactions", "SendAttachments", "DownloadFiles", "MakeExtCall", "Share", "GuestDownloadFilesToggle", "CreateInviteLink", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatRightsFlag implements by4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatRightsFlag[] $VALUES;
    public static final ChatRightsFlag AddUsers;
    public static final ChatRightsFlag Change;
    public static final ChatRightsFlag ChangeRights;
    public static final ChatRightsFlag ChangeRole;
    public static final ChatRightsFlag CreateInviteLink;

    @jxi
    public static final ChatRightsFlag DeleteMessage;
    public static final ChatRightsFlag DownloadFiles;
    public static final ChatRightsFlag EditMessage;
    public static final ChatRightsFlag GuestDownloadFilesToggle;
    public static final ChatRightsFlag Invite;
    public static final ChatRightsFlag Join;
    public static final ChatRightsFlag Leave;
    public static final ChatRightsFlag ListMembers;
    public static final ChatRightsFlag MakeExtCall;
    public static final ChatRightsFlag ManageMeetings;
    public static final ChatRightsFlag MarkAsImportant;
    public static final ChatRightsFlag PinMessage;
    public static final ChatRightsFlag Read;
    public static final ChatRightsFlag RemoveUsers;
    public static final ChatRightsFlag SendAttachments;
    public static final ChatRightsFlag SendReactions;
    public static final ChatRightsFlag SendStickers;
    public static final ChatRightsFlag Share;
    public static final ChatRightsFlag Translate;
    public static final ChatRightsFlag Write;
    public static final ChatRightsFlag WriteThreads;
    private final String flagName;
    private final int ordinalValue = ordinal();

    static {
        ChatRightsFlag chatRightsFlag = new ChatRightsFlag("Join", 0, "join");
        Join = chatRightsFlag;
        ChatRightsFlag chatRightsFlag2 = new ChatRightsFlag("Leave", 1, "leave");
        Leave = chatRightsFlag2;
        ChatRightsFlag chatRightsFlag3 = new ChatRightsFlag("Read", 2, "read");
        Read = chatRightsFlag3;
        ChatRightsFlag chatRightsFlag4 = new ChatRightsFlag("Write", 3, "write");
        Write = chatRightsFlag4;
        ChatRightsFlag chatRightsFlag5 = new ChatRightsFlag("Change", 4, "change");
        Change = chatRightsFlag5;
        ChatRightsFlag chatRightsFlag6 = new ChatRightsFlag("Invite", 5, "invite");
        Invite = chatRightsFlag6;
        ChatRightsFlag chatRightsFlag7 = new ChatRightsFlag("AddUsers", 6, "add_users");
        AddUsers = chatRightsFlag7;
        ChatRightsFlag chatRightsFlag8 = new ChatRightsFlag("ChangeRole", 7, "change_role");
        ChangeRole = chatRightsFlag8;
        ChatRightsFlag chatRightsFlag9 = new ChatRightsFlag("ListMembers", 8, "list_members");
        ListMembers = chatRightsFlag9;
        ChatRightsFlag chatRightsFlag10 = new ChatRightsFlag("RemoveUsers", 9, "remove_users");
        RemoveUsers = chatRightsFlag10;
        ChatRightsFlag chatRightsFlag11 = new ChatRightsFlag("MarkAsImportant", 10, "mark_as_important");
        MarkAsImportant = chatRightsFlag11;
        ChatRightsFlag chatRightsFlag12 = new ChatRightsFlag("PinMessage", 11, "pin_message");
        PinMessage = chatRightsFlag12;
        ChatRightsFlag chatRightsFlag13 = new ChatRightsFlag("DeleteMessage", 12, "delete_message");
        DeleteMessage = chatRightsFlag13;
        ChatRightsFlag chatRightsFlag14 = new ChatRightsFlag("ChangeRights", 13, "change_rights");
        ChangeRights = chatRightsFlag14;
        ChatRightsFlag chatRightsFlag15 = new ChatRightsFlag("EditMessage", 14, "edit_message");
        EditMessage = chatRightsFlag15;
        ChatRightsFlag chatRightsFlag16 = new ChatRightsFlag("WriteThreads", 15, "write_to_thread");
        WriteThreads = chatRightsFlag16;
        ChatRightsFlag chatRightsFlag17 = new ChatRightsFlag("ManageMeetings", 16, "manage_meetings");
        ManageMeetings = chatRightsFlag17;
        ChatRightsFlag chatRightsFlag18 = new ChatRightsFlag("Translate", 17, "translate");
        Translate = chatRightsFlag18;
        ChatRightsFlag chatRightsFlag19 = new ChatRightsFlag("SendStickers", 18, "send_stickers");
        SendStickers = chatRightsFlag19;
        ChatRightsFlag chatRightsFlag20 = new ChatRightsFlag("SendReactions", 19, "send_reactions");
        SendReactions = chatRightsFlag20;
        ChatRightsFlag chatRightsFlag21 = new ChatRightsFlag("SendAttachments", 20, "send_attachments");
        SendAttachments = chatRightsFlag21;
        ChatRightsFlag chatRightsFlag22 = new ChatRightsFlag("DownloadFiles", 21, "download_files");
        DownloadFiles = chatRightsFlag22;
        ChatRightsFlag chatRightsFlag23 = new ChatRightsFlag("MakeExtCall", 22, "make_ext_call");
        MakeExtCall = chatRightsFlag23;
        ChatRightsFlag chatRightsFlag24 = new ChatRightsFlag("Share", 23, "share");
        Share = chatRightsFlag24;
        ChatRightsFlag chatRightsFlag25 = new ChatRightsFlag("GuestDownloadFilesToggle", 24, "guest_download_files_toggle");
        GuestDownloadFilesToggle = chatRightsFlag25;
        ChatRightsFlag chatRightsFlag26 = new ChatRightsFlag("CreateInviteLink", 25, "create_invite_link");
        CreateInviteLink = chatRightsFlag26;
        ChatRightsFlag[] chatRightsFlagArr = {chatRightsFlag, chatRightsFlag2, chatRightsFlag3, chatRightsFlag4, chatRightsFlag5, chatRightsFlag6, chatRightsFlag7, chatRightsFlag8, chatRightsFlag9, chatRightsFlag10, chatRightsFlag11, chatRightsFlag12, chatRightsFlag13, chatRightsFlag14, chatRightsFlag15, chatRightsFlag16, chatRightsFlag17, chatRightsFlag18, chatRightsFlag19, chatRightsFlag20, chatRightsFlag21, chatRightsFlag22, chatRightsFlag23, chatRightsFlag24, chatRightsFlag25, chatRightsFlag26};
        $VALUES = chatRightsFlagArr;
        $ENTRIES = a.a(chatRightsFlagArr);
    }

    public ChatRightsFlag(String str, int i, String str2) {
        this.flagName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChatRightsFlag valueOf(String str) {
        return (ChatRightsFlag) Enum.valueOf(ChatRightsFlag.class, str);
    }

    public static ChatRightsFlag[] values() {
        return (ChatRightsFlag[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getFlagName() {
        return this.flagName;
    }

    public final Boolean c(s8b s8bVar) {
        return Boolean.valueOf(((1 << ordinal()) & s8bVar.b) > 0);
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return c((s8b) obj);
    }

    @Override // defpackage.by4
    /* renamed from: p, reason: from getter */
    public final int getOrdinalValue() {
        return this.ordinalValue;
    }
}
