package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import flex.engine.a;
import java.util.ArrayList;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final /* synthetic */ class hcb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ hcb(ryl rylVar, long j) {
        this.a = 27;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [udb] */
    private final Object b(Object obj) {
        long j = this.b;
        ull0 T0 = ((oll0) obj).T0("SELECT * FROM chats_view WHERE chat_internal_id = ?");
        try {
            T0.b(1, j);
            int r = eja1.r(T0, "chat_internal_id");
            int r2 = eja1.r(T0, "chat_id");
            int r3 = eja1.r(T0, "namespace");
            int r4 = eja1.r(T0, "url");
            int r5 = eja1.r(T0, "unseen");
            int r6 = eja1.r(T0, "addressee_id");
            int r7 = eja1.r(T0, "average_response_time");
            int r8 = eja1.r(T0, "first_unseen_row");
            int r9 = eja1.r(T0, "flags");
            int r10 = eja1.r(T0, "rights");
            int r11 = eja1.r(T0, "mute");
            int r12 = eja1.r(T0, "mute_mentions");
            int r13 = eja1.r(T0, "is_member");
            int r14 = eja1.r(T0, "is_blocked");
            int r15 = eja1.r(T0, "is_subscriber");
            int r16 = eja1.r(T0, "participants_count");
            int r17 = eja1.r(T0, "can_call");
            int r18 = eja1.r(T0, "is_admin");
            int r19 = eja1.r(T0, "is_phone_required_for_write");
            int r20 = eja1.r(T0, "current_profile_id");
            int r21 = eja1.r(T0, "is_transient");
            int r22 = eja1.r(T0, "sort_time");
            int r23 = eja1.r(T0, "display_name");
            int r24 = eja1.r(T0, "is_pinned");
            int r25 = eja1.r(T0, "is_hidden");
            int r26 = eja1.r(T0, "min_message_timestamp");
            int r27 = eja1.r(T0, "last_seq_no");
            int r28 = eja1.r(T0, "last_message_timestamp");
            int r29 = eja1.r(T0, "events");
            int r30 = eja1.r(T0, "has_guests");
            if (T0.q()) {
                r31 = new udb(T0.getLong(r), T0.Y1(r2), T0.isNull(r3) ? null : Integer.valueOf((int) T0.getLong(r3)), T0.isNull(r4) ? null : T0.Y1(r4), (int) T0.getLong(r5), T0.isNull(r6) ? null : T0.Y1(r6), T0.isNull(r7) ? null : Long.valueOf(T0.getLong(r7)), T0.isNull(r8) ? null : Integer.valueOf((int) T0.getLong(r8)), T0.getLong(r9), (int) T0.getLong(r10), ((int) T0.getLong(r11)) != 0, ((int) T0.getLong(r12)) != 0, ((int) T0.getLong(r13)) != 0, ((int) T0.getLong(r14)) != 0, ((int) T0.getLong(r15)) != 0, (int) T0.getLong(r16), ((int) T0.getLong(r17)) != 0, ((int) T0.getLong(r18)) != 0, ((int) T0.getLong(r19)) != 0, T0.isNull(r20) ? null : T0.Y1(r20), ((int) T0.getLong(r21)) != 0, T0.getLong(r22), T0.Y1(r23), ((int) T0.getLong(r24)) != 0, ((int) T0.getLong(r25)) != 0, T0.getLong(r26), T0.getLong(r27), T0.getLong(r28), T0.getLong(r29), ((int) T0.getLong(r30)) != 0);
            }
            return r31;
        } finally {
            T0.close();
        }
    }

    private final Object d(Object obj) {
        ugs ugsVar;
        Boolean bool;
        Boolean bool2;
        long j = this.b;
        ull0 T0 = ((oll0) obj).T0("SELECT\n                chats.chat_internal_id AS chatInternalId,\n                chats.chat_id AS chatId,\n                chats.create_time AS createTime,\n                chats.addressee_id AS addresseeId,\n                chats.name AS name,\n                chats.avatar_id AS avatarId,\n                IFNULL(chats.seen_marker, -1) AS seenMarker,\n                chats.owner_last_seen_sequence_number AS ownerLastSeenSequenceNumber,\n                chats.owner_seen_marker_version AS ownerSeenMarkerVersion,\n                chats.flags AS flags,\n                chats.other_seen_marker AS otherSeenMarker,\n                chats.version AS version,\n                chats.invite_hash AS inviteHash,\n                chats.current_profile_id AS currentProfileId,\n                chats.is_transient AS isTransient,\n                coalesce(chats.last_seq_no, 0) AS lastSeqNo,\n                chats.parent_internal_id AS parentInternalId,\n                chats.parent_message_timestamp AS parentMessageTimestamp,\n                chats.min_message_timestamp AS minMessageTimestamp,\n                users.shown_name AS addresseeShownName,\n                users.avatar_url AS addresseeAvatarUrl,\n                users.website AS addresseeWebsite,\n                users.average_response_time AS addresseeResponseTime,\n                users.robot AS chatWithBot,\n                users.is_support_bot AS chatWithSupportBot,\n                MAX(IFNULL(messages_view.message_history_id, -1), IFNULL(chats.last_timestamp, -1)) AS lastMessageTime,\n                messages_view.author AS lastMessageAuthor,\n                MAX(IFNULL(messages_view.message_sequence_number, 0), IFNULL(chats.last_seq_no, 0)) AS lastMessageSeqNo,\n                chat_muting.mute AS mute,\n                chat_muting.mute_mentions AS muteMentions,\n                chat_muting.version AS muteVersion,\n                chats.has_guests AS hasGuests\n           FROM chats\n           LEFT JOIN users ON chats.addressee_id=users.user_id\n           LEFT JOIN chat_muting ON chats.chat_id=chat_muting.chat_id\n           LEFT JOIN messages_view ON chats.chat_internal_id=messages_view.chat_internal_id\n                AND messages_view.message_history_id >= chats.min_message_timestamp\n           WHERE chats.chat_internal_id = ?\n           ORDER BY messages_view.message_history_id DESC LIMIT 1");
        try {
            T0.b(1, j);
            if (T0.q()) {
                long j2 = T0.getLong(0);
                String Y1 = T0.Y1(1);
                double d = T0.getDouble(2);
                String Y12 = T0.isNull(3) ? null : T0.Y1(3);
                String Y13 = T0.isNull(4) ? null : T0.Y1(4);
                String Y14 = T0.isNull(5) ? null : T0.Y1(5);
                long j3 = T0.getLong(6);
                int i = (int) T0.getLong(7);
                long j4 = T0.getLong(8);
                long j5 = T0.getLong(9);
                long j6 = T0.getLong(10);
                long j7 = T0.getLong(11);
                String Y15 = T0.isNull(12) ? null : T0.Y1(12);
                String Y16 = T0.isNull(13) ? null : T0.Y1(13);
                boolean z = ((int) T0.getLong(14)) != 0;
                long j8 = T0.getLong(15);
                Long valueOf = T0.isNull(16) ? null : Long.valueOf(T0.getLong(16));
                Long valueOf2 = T0.isNull(17) ? null : Long.valueOf(T0.getLong(17));
                long j9 = T0.getLong(18);
                String Y17 = T0.isNull(19) ? null : T0.Y1(19);
                String Y18 = T0.isNull(20) ? null : T0.Y1(20);
                String Y19 = T0.isNull(21) ? null : T0.Y1(21);
                Long valueOf3 = T0.isNull(22) ? null : Long.valueOf(T0.getLong(22));
                Integer valueOf4 = T0.isNull(23) ? null : Integer.valueOf((int) T0.getLong(23));
                if (valueOf4 != null) {
                    bool = Boolean.valueOf(valueOf4.intValue() != 0);
                } else {
                    bool = null;
                }
                Integer valueOf5 = T0.isNull(24) ? null : Integer.valueOf((int) T0.getLong(24));
                if (valueOf5 != null) {
                    bool2 = Boolean.valueOf(valueOf5.intValue() != 0);
                } else {
                    bool2 = null;
                }
                ugsVar = new ugs(j2, Y1, d, Y12, Y13, Y14, j3, i, j4, j5, j6, j7, Y15, Y16, z, j8, valueOf, valueOf2, j9, Y17, Y18, Y19, valueOf3, bool, bool2, T0.isNull(25) ? null : Long.valueOf(T0.getLong(25)), T0.isNull(26) ? null : T0.Y1(26), (int) T0.getLong(27), T0.getLong(28), T0.getLong(29), T0.getLong(30), ((int) T0.getLong(31)) != 0);
            } else {
                ugsVar = null;
            }
            T0.close();
            return ugsVar;
        } catch (Throwable th) {
            T0.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (((r8 - r0.a.getTime()) / 1000.0d) > ((defpackage.tyl) r0.b).a) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r2.j0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r6 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.j0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r2.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r6 = true;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        long j;
        t2b t2bVar;
        p2b p2bVar;
        int i = this.a;
        boolean z2 = false;
        boolean z3 = false;
        z2 = false;
        long j2 = this.b;
        switch (i) {
            case 0:
                ull0 T0 = ((oll0) obj).T0("SELECT translation_lang FROM chat_translations WHERE chat_internal_id=?");
                try {
                    T0.b(1, j2);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 1:
                ull0 T02 = ((oll0) obj).T0("SELECT COUNT(77) FROM chat_translations WHERE chat_internal_id = ?");
                try {
                    T02.b(1, j2);
                    if (T02.q()) {
                        if (((int) T02.getLong(0)) != 0) {
                            z = true;
                            T02.close();
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    T02.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 2:
                ull0 T03 = ((oll0) obj).T0("SELECT chat_id FROM chats WHERE chat_internal_id=?");
                try {
                    T03.b(1, j2);
                    if (T03.q()) {
                        return T03.Y1(0);
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <kotlin.String>.");
                } finally {
                }
            case 3:
                ull0 T04 = ((oll0) obj).T0("SELECT other_seen_marker FROM chats WHERE chat_internal_id = ?");
                try {
                    T04.b(1, j2);
                    j = T04.q() ? T04.getLong(0) : 0L;
                    T04.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 4:
                ull0 T05 = ((oll0) obj).T0("SELECT * FROM chats WHERE chat_internal_id = ?");
                try {
                    T05.b(1, j2);
                    int r = eja1.r(T05, "chat_internal_id");
                    int r2 = eja1.r(T05, "chat_id");
                    int r3 = eja1.r(T05, "create_time");
                    int r4 = eja1.r(T05, "addressee_id");
                    int r5 = eja1.r(T05, "name");
                    int r6 = eja1.r(T05, "avatar_id");
                    int r7 = eja1.r(T05, "seen_marker");
                    int r8 = eja1.r(T05, "owner_last_seen_sequence_number");
                    int r9 = eja1.r(T05, "owner_seen_marker_version");
                    int r10 = eja1.r(T05, "flags");
                    int r11 = eja1.r(T05, "other_seen_marker");
                    int r12 = eja1.r(T05, "version");
                    int r13 = eja1.r(T05, "full_info_version");
                    int r14 = eja1.r(T05, "invite_hash");
                    int r15 = eja1.r(T05, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
                    int r16 = eja1.r(T05, "alias");
                    int r17 = eja1.r(T05, "current_profile_id");
                    int r18 = eja1.r(T05, "is_transient");
                    int r19 = eja1.r(T05, "min_message_timestamp");
                    int r20 = eja1.r(T05, "parent_internal_id");
                    int r21 = eja1.r(T05, "parent_message_timestamp");
                    int r22 = eja1.r(T05, "last_timestamp");
                    int r23 = eja1.r(T05, "last_seq_no");
                    int r24 = eja1.r(T05, "partner_id");
                    int r25 = eja1.r(T05, "has_guests");
                    if (T05.q()) {
                        t2bVar = new t2b(T05.getLong(r), T05.Y1(r2), T05.getDouble(r3), T05.isNull(r4) ? null : T05.Y1(r4), T05.isNull(r5) ? null : T05.Y1(r5), T05.isNull(r6) ? null : T05.Y1(r6), T05.isNull(r7) ? null : Long.valueOf(T05.getLong(r7)), T05.getLong(r8), T05.getLong(r9), T05.getLong(r10), T05.isNull(r11) ? null : Long.valueOf(T05.getLong(r11)), T05.getLong(r12), T05.getLong(r13), T05.isNull(r14) ? null : T05.Y1(r14), T05.isNull(r15) ? null : T05.Y1(r15), T05.isNull(r16) ? null : T05.Y1(r16), T05.isNull(r17) ? null : T05.Y1(r17), ((int) T05.getLong(r18)) != 0, T05.isNull(r19) ? null : Long.valueOf(T05.getLong(r19)), T05.isNull(r20) ? null : Long.valueOf(T05.getLong(r20)), T05.isNull(r21) ? null : Long.valueOf(T05.getLong(r21)), T05.isNull(r22) ? null : Long.valueOf(T05.getLong(r22)), T05.isNull(r23) ? null : Long.valueOf(T05.getLong(r23)), T05.isNull(r24) ? null : T05.Y1(r24), ((int) T05.getLong(r25)) != 0);
                    } else {
                        t2bVar = null;
                    }
                    return t2bVar;
                } finally {
                }
            case 5:
                ull0 T06 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats WHERE parent_internal_id=?");
                try {
                    T06.b(1, j2);
                    ArrayList arrayList = new ArrayList();
                    while (T06.q()) {
                        arrayList.add(Long.valueOf(T06.getLong(0)));
                    }
                    return (Long[]) arrayList.toArray(new Long[0]);
                } finally {
                }
            case 6:
                ull0 T07 = ((oll0) obj).T0("SELECT flags FROM chats WHERE chat_internal_id=?");
                try {
                    T07.b(1, j2);
                    return (!T07.q() || T07.isNull(0)) ? null : Long.valueOf(T07.getLong(0));
                } finally {
                }
            case 7:
                ull0 T08 = ((oll0) obj).T0("SELECT owner_seen_marker_version FROM chats WHERE chat_internal_id=?");
                try {
                    T08.b(1, j2);
                    j = T08.q() ? T08.getLong(0) : 0L;
                    T08.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 8:
                ull0 T09 = ((oll0) obj).T0("SELECT invite_hash FROM chats WHERE chat_internal_id=?");
                try {
                    T09.b(1, j2);
                    return (!T09.q() || T09.isNull(0)) ? null : T09.Y1(0);
                } finally {
                }
            case 9:
                ull0 T010 = ((oll0) obj).T0("SELECT alias FROM chats WHERE chat_internal_id=?");
                try {
                    T010.b(1, j2);
                    return (!T010.q() || T010.isNull(0)) ? null : T010.Y1(0);
                } finally {
                }
            case 10:
                ull0 T011 = ((oll0) obj).T0("SELECT min_message_timestamp FROM chats WHERE chat_internal_id=?");
                try {
                    T011.b(1, j2);
                    return (!T011.q() || T011.isNull(0)) ? null : Long.valueOf(T011.getLong(0));
                } finally {
                }
            case 11:
                ull0 T012 = ((oll0) obj).T0("\n            SELECT chat_internal_id, chat_id, addressee_id, flags, current_profile_id, is_transient,\n            parent_internal_id, parent_message_timestamp\n            FROM chats WHERE chat_internal_id = ?\n            ");
                try {
                    T012.b(1, j2);
                    if (T012.q()) {
                        p2bVar = new p2b(T012.getLong(0), T012.Y1(1), T012.isNull(2) ? null : T012.Y1(2), T012.getLong(3), T012.isNull(4) ? null : T012.Y1(4), ((int) T012.getLong(5)) != 0, T012.isNull(6) ? null : Long.valueOf(T012.getLong(6)), T012.isNull(7) ? null : Long.valueOf(T012.getLong(7)));
                    } else {
                        p2bVar = null;
                    }
                    return p2bVar;
                } finally {
                }
            case 12:
                ull0 T013 = ((oll0) obj).T0("SELECT seen_marker FROM chats WHERE chat_internal_id=?");
                try {
                    T013.b(1, j2);
                    return (!T013.q() || T013.isNull(0)) ? null : Long.valueOf(T013.getLong(0));
                } finally {
                }
            case 13:
                ull0 T014 = ((oll0) obj).T0("SELECT partner_id FROM chats WHERE chat_internal_id=?");
                try {
                    T014.b(1, j2);
                    return (!T014.q() || T014.isNull(0)) ? null : T014.Y1(0);
                } finally {
                }
            case 14:
                ull0 T015 = ((oll0) obj).T0("SELECT last_timestamp FROM chats WHERE chat_internal_id=?");
                try {
                    T015.b(1, j2);
                    return (!T015.q() || T015.isNull(0)) ? null : Long.valueOf(T015.getLong(0));
                } finally {
                }
            case 15:
                ull0 T016 = ((oll0) obj).T0("SELECT avatar_id FROM chats WHERE chat_internal_id=?");
                try {
                    T016.b(1, j2);
                    return (!T016.q() || T016.isNull(0)) ? null : T016.Y1(0);
                } finally {
                }
            case 16:
                ull0 T017 = ((oll0) obj).T0("SELECT seen_marker,\n                     owner_seen_marker_version\n              FROM chats WHERE chat_internal_id = ?");
                try {
                    T017.b(1, j2);
                    if (T017.q()) {
                        return new q2b(T017.getLong(1), T017.isNull(0) ? null : Long.valueOf(T017.getLong(0)));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ChatEntity.SeenMarkerVersionField>.");
                } finally {
                }
            case 17:
                ull0 T018 = ((oll0) obj).T0("SELECT name FROM chats WHERE chat_internal_id=?");
                try {
                    T018.b(1, j2);
                    return (!T018.q() || T018.isNull(0)) ? null : T018.Y1(0);
                } finally {
                }
            case 18:
                ull0 T019 = ((oll0) obj).T0("SELECT last_seq_no FROM chats WHERE chat_internal_id = ?");
                try {
                    T019.b(1, j2);
                    j = T019.q() ? T019.getLong(0) : 0L;
                    T019.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 19:
                ull0 T020 = ((oll0) obj).T0("SELECT is_transient FROM chats WHERE chat_internal_id = ?");
                try {
                    T020.b(1, j2);
                    if (T020.q()) {
                        if (((int) T020.getLong(0)) != 0) {
                            z2 = true;
                        }
                    }
                    T020.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 20:
                ull0 T021 = ((oll0) obj).T0("SELECT addressee_id FROM chats WHERE chat_internal_id=?");
                try {
                    T021.b(1, j2);
                    return (!T021.q() || T021.isNull(0)) ? null : T021.Y1(0);
                } finally {
                }
            case 21:
                ull0 T022 = ((oll0) obj).T0("SELECT addressee_id FROM chats_view WHERE chat_internal_id = ?");
                try {
                    T022.b(1, j2);
                    return (!T022.q() || T022.isNull(0)) ? null : T022.Y1(0);
                } finally {
                }
            case 22:
                ull0 T023 = ((oll0) obj).T0("\n        SELECT\n            COUNT(CASE WHEN unseen > 0 THEN 1 ELSE NULL END) as unread_chats_count,\n            COUNT(CASE WHEN unseen > 0 AND mute = 1 THEN 1 ELSE NULL END) as unread_muted_chats_count\n        FROM chats_view\n        LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id = chat_organization_cross_ref.chat_internal_id\n        WHERE is_hidden = 0 AND (is_member = 1 OR is_subscriber = 1) AND is_blocked <> 1 AND coalesce(chat_organization_cross_ref.organization_id, 0) = ?\n    ");
                try {
                    T023.b(1, j2);
                    if (T023.q()) {
                        return new sdb((int) T023.getLong(0), (int) T023.getLong(1));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.yandex.messaging.core.db.chats.ChatViewEntity.ChatUnseenReadInfo>.");
                } finally {
                }
            case 23:
                ull0 T024 = ((oll0) obj).T0("\n        SELECT SUM(unseen), coalesce(chat_organization_cross_ref.organization_id, 0) as org_id FROM chats_view\n        LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n        WHERE org_id = ? AND (is_member = 1 OR is_subscriber = 1) AND is_blocked <> 1 AND mute <> 1 AND is_hidden=0\n        LIMIT 1\n    ");
                try {
                    T024.b(1, j2);
                    int i2 = T024.q() ? (int) T024.getLong(0) : 0;
                    T024.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 24:
                return b(obj);
            case 25:
                ull0 T025 = ((oll0) obj).T0("SELECT chat_id, flags, unseen FROM chats_view WHERE chat_internal_id = ?");
                try {
                    T025.b(1, j2);
                    return T025.q() ? new tdb(T025.Y1(0), T025.getLong(1), (int) T025.getLong(2)) : null;
                } finally {
                }
            case 26:
                ((mnq0) obj).a(qkq0.a, new pkq0(Handle.Cursor, this.b, SelectionHandleAnchor.Middle, true));
                return zy11.a;
            case 27:
                uyl uylVar = (uyl) ((Map.Entry) obj).getValue();
                dk91 dk91Var = uylVar.b;
                a aVar = uylVar.c;
                if (dk91Var instanceof tyl) {
                    break;
                } else if (!(dk91Var instanceof syl)) {
                    w511.b();
                    return null;
                }
                break;
            case 28:
                return d(obj);
            default:
                oll0 oll0Var = (oll0) obj;
                ull0 T026 = oll0Var.T0("UPDATE internal_id SET next_internal_id = ?");
                try {
                    T026.b(1, j2);
                    T026.q();
                    int x = jx81.x(oll0Var);
                    T026.close();
                    return Integer.valueOf(x);
                } finally {
                }
        }
    }

    public /* synthetic */ hcb(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
