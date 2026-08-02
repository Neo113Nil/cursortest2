package defpackage;

import android.content.Context;
import androidx.compose.ui.semantics.f;
import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final /* synthetic */ class b5a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ b5a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [udb] */
    private final Object b(Object obj) {
        String str = this.b;
        ull0 T0 = ((oll0) obj).T0("SELECT * FROM chats_view WHERE chat_id = ?");
        try {
            T0.g1(1, str);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [udb] */
    private final Object d(Object obj) {
        String str = this.b;
        ull0 T0 = ((oll0) obj).T0("SELECT * FROM chats_view WHERE addressee_id = ?");
        try {
            T0.g1(1, str);
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

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        r5b r5bVar;
        x5b x5bVar;
        boolean z;
        boolean z2;
        boolean z3;
        p2b p2bVar;
        o2b o2bVar;
        t2b t2bVar;
        p2b p2bVar2;
        Boolean bool;
        int i = this.a;
        int i2 = 6;
        int i3 = 3;
        int i4 = 2;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((fsa) obj).a.r(new b5a(str, i2));
                return zy11Var;
            case 1:
                ((c9a) obj).a.r(new b5a(str, i4));
                return zy11Var;
            case 2:
                ((a9a) obj).J(str);
                return zy11Var;
            case 3:
                ((a9a) obj).J(str);
                return zy11Var;
            case 4:
                ((c9a) obj).a.r(new b5a(str, i4));
                return zy11Var;
            case 5:
                f9a f9aVar = ((d9a) obj).a;
                j6a j6aVar = (j6a) f9aVar.G;
                j6aVar.getClass();
                Context context = j6aVar.a;
                j6aVar.a(new ChargersNotification(context, "ChargersNotification", context.getString(kyh0.chargers_subscription_notification_success), null, new d6a(f1h0.ic_success_change), j6aVar.b, 0, 64, null), null);
                f9aVar.r(new b5a(str, i3));
                return zy11Var;
            case 6:
                ((bsa) obj).n1(ChargersQrOpenReason.RETURN_CHARGER, str);
                return zy11Var;
            case 7:
                T0 = ((oll0) obj).T0("SELECT * FROM chat_miniapp WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    int r = eja1.r(T0, "chat_id");
                    int r2 = eja1.r(T0, "miniapp_url");
                    int r3 = eja1.r(T0, "trusted");
                    if (T0.q()) {
                        r5bVar = new r5b(T0.Y1(r), T0.isNull(r2) ? null : T0.Y1(r2), ((int) T0.getLong(r3)) != 0);
                    } else {
                        r5bVar = null;
                    }
                    return r5bVar;
                } finally {
                }
            case 8:
                T0 = ((oll0) obj).T0("DELETE FROM chat_muting WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 9:
                T0 = ((oll0) obj).T0("SELECT * FROM chat_muting WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    int r4 = eja1.r(T0, "chat_id");
                    int r5 = eja1.r(T0, "mute");
                    int r6 = eja1.r(T0, "mute_mentions");
                    int r7 = eja1.r(T0, "version");
                    if (T0.q()) {
                        x5bVar = new x5b(T0.Y1(r4), ((int) T0.getLong(r5)) != 0, ((int) T0.getLong(r6)) != 0, T0.isNull(r7) ? null : Long.valueOf(T0.getLong(r7)));
                    } else {
                        x5bVar = null;
                    }
                    return x5bVar;
                } finally {
                }
            case 10:
                T0 = ((oll0) obj).T0("SELECT approved_by_me FROM chat_preferences WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        z = false;
                        if (((int) T0.getLong(0)) != 0) {
                            z2 = true;
                            T0.close();
                            return Boolean.valueOf(z2);
                        }
                    } else {
                        z = false;
                    }
                    z2 = z;
                    T0.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 11:
                T0 = ((oll0) obj).T0("SELECT COUNT(chat_id) FROM chats WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z3 = true;
                            T0.close();
                            return Boolean.valueOf(z3);
                        }
                    }
                    z3 = false;
                    T0.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 12:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats WHERE addressee_id=?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 13:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats WHERE chat_id=?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("\n        SELECT chat_internal_id, chat_id, addressee_id, flags, current_profile_id, is_transient,\n            NULL as parent_internal_id, NULL as parent_message_timestamp\n            FROM chats WHERE addressee_id = ?\n            ");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        p2bVar = new p2b(T0.getLong(0), T0.Y1(1), T0.isNull(2) ? null : T0.Y1(2), T0.getLong(3), T0.isNull(4) ? null : T0.Y1(4), ((int) T0.getLong(5)) != 0, T0.isNull(6) ? null : Long.valueOf(T0.getLong(6)), T0.isNull(7) ? null : Long.valueOf(T0.getLong(7)));
                    } else {
                        p2bVar = null;
                    }
                    return p2bVar;
                } finally {
                }
            case 15:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id, version, full_info_version FROM chats WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        o2bVar = new o2b(T0.isNull(0) ? null : Long.valueOf(T0.getLong(0)), T0.getLong(1), T0.getLong(2));
                    } else {
                        o2bVar = null;
                    }
                    return o2bVar;
                } finally {
                }
            case 16:
                T0 = ((oll0) obj).T0("SELECT version FROM chats WHERE chat_id=?");
                try {
                    T0.g1(1, str);
                    long j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 17:
                T0 = ((oll0) obj).T0("SELECT invite_hash FROM chats WHERE chat_id=?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 18:
                T0 = ((oll0) obj).T0("SELECT * FROM chats WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    int r8 = eja1.r(T0, "chat_internal_id");
                    int r9 = eja1.r(T0, "chat_id");
                    int r10 = eja1.r(T0, "create_time");
                    int r11 = eja1.r(T0, "addressee_id");
                    int r12 = eja1.r(T0, "name");
                    int r13 = eja1.r(T0, "avatar_id");
                    int r14 = eja1.r(T0, "seen_marker");
                    int r15 = eja1.r(T0, "owner_last_seen_sequence_number");
                    int r16 = eja1.r(T0, "owner_seen_marker_version");
                    int r17 = eja1.r(T0, "flags");
                    int r18 = eja1.r(T0, "other_seen_marker");
                    int r19 = eja1.r(T0, "version");
                    int r20 = eja1.r(T0, "full_info_version");
                    int r21 = eja1.r(T0, "invite_hash");
                    int r22 = eja1.r(T0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
                    int r23 = eja1.r(T0, "alias");
                    int r24 = eja1.r(T0, "current_profile_id");
                    int r25 = eja1.r(T0, "is_transient");
                    int r26 = eja1.r(T0, "min_message_timestamp");
                    int r27 = eja1.r(T0, "parent_internal_id");
                    int r28 = eja1.r(T0, "parent_message_timestamp");
                    int r29 = eja1.r(T0, "last_timestamp");
                    int r30 = eja1.r(T0, "last_seq_no");
                    int r31 = eja1.r(T0, "partner_id");
                    int r32 = eja1.r(T0, "has_guests");
                    if (T0.q()) {
                        t2bVar = new t2b(T0.getLong(r8), T0.Y1(r9), T0.getDouble(r10), T0.isNull(r11) ? null : T0.Y1(r11), T0.isNull(r12) ? null : T0.Y1(r12), T0.isNull(r13) ? null : T0.Y1(r13), T0.isNull(r14) ? null : Long.valueOf(T0.getLong(r14)), T0.getLong(r15), T0.getLong(r16), T0.getLong(r17), T0.isNull(r18) ? null : Long.valueOf(T0.getLong(r18)), T0.getLong(r19), T0.getLong(r20), T0.isNull(r21) ? null : T0.Y1(r21), T0.isNull(r22) ? null : T0.Y1(r22), T0.isNull(r23) ? null : T0.Y1(r23), T0.isNull(r24) ? null : T0.Y1(r24), ((int) T0.getLong(r25)) != 0, T0.isNull(r26) ? null : Long.valueOf(T0.getLong(r26)), T0.isNull(r27) ? null : Long.valueOf(T0.getLong(r27)), T0.isNull(r28) ? null : Long.valueOf(T0.getLong(r28)), T0.isNull(r29) ? null : Long.valueOf(T0.getLong(r29)), T0.isNull(r30) ? null : Long.valueOf(T0.getLong(r30)), T0.isNull(r31) ? null : T0.Y1(r31), ((int) T0.getLong(r32)) != 0);
                    } else {
                        t2bVar = null;
                    }
                    return t2bVar;
                } finally {
                }
            case 19:
                T0 = ((oll0) obj).T0("SELECT version, full_info_version FROM chats WHERE chat_id=?");
                try {
                    T0.g1(1, str);
                    return T0.q() ? new s2b(T0.getLong(0), T0.getLong(1)) : null;
                } finally {
                }
            case 20:
                T0 = ((oll0) obj).T0("SELECT chat_id FROM chats WHERE invite_hash=?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 21:
                T0 = ((oll0) obj).T0("\n        SELECT chat_internal_id, chat_id, addressee_id, flags, current_profile_id, is_transient,\n            parent_internal_id, parent_message_timestamp\n            FROM chats WHERE chat_id = ?\n            ");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        p2bVar2 = new p2b(T0.getLong(0), T0.Y1(1), T0.isNull(2) ? null : T0.Y1(2), T0.getLong(3), T0.isNull(4) ? null : T0.Y1(4), ((int) T0.getLong(5)) != 0, T0.isNull(6) ? null : Long.valueOf(T0.getLong(6)), T0.isNull(7) ? null : Long.valueOf(T0.getLong(7)));
                    } else {
                        p2bVar2 = null;
                    }
                    return p2bVar2;
                } finally {
                }
            case 22:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats_view WHERE addressee_id = ?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 23:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats_view WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 24:
                return b(obj);
            case 25:
                T0 = ((oll0) obj).T0("SELECT is_hidden FROM chats_view WHERE chat_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        Integer valueOf = T0.isNull(0) ? null : Integer.valueOf((int) T0.getLong(0));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                            return bool;
                        }
                    }
                    bool = null;
                    return bool;
                } finally {
                }
            case 26:
                return d(obj);
            case 27:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE chats_view SET is_hidden=? WHERE chat_id=?");
                try {
                    T0.b(1, 1L);
                    T0.g1(2, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 28:
                f.l((mnq0) obj, str);
                return zy11Var;
            default:
                f.l((mnq0) obj, str);
                return zy11Var;
        }
    }
}
