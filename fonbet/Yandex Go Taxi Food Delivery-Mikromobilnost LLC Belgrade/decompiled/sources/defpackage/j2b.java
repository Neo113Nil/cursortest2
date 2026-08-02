package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final /* synthetic */ class j2b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ j2b(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dy10 dy10Var;
        cy10 cy10Var;
        fy10 fy10Var;
        hz10 hz10Var;
        hz10 hz10Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        r7 = false;
        boolean z2 = false;
        r7 = false;
        boolean z3 = false;
        z = false;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE cache_chat_edit_history_timestamps SET edit_history_client_max_timestamp = ? WHERE chat_internal_id = ?");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 1:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T02 = oll0Var2.T0("UPDATE cache_chat_edit_history_timestamps SET edit_history_server_max_timestamp = ? WHERE chat_internal_id = ?");
                try {
                    T02.b(1, j2);
                    T02.b(2, j);
                    T02.q();
                    int x2 = jx81.x(oll0Var2);
                    T02.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 2:
                oll0 oll0Var3 = (oll0) obj;
                ull0 T03 = oll0Var3.T0("UPDATE chats SET other_seen_marker = ? WHERE chat_internal_id = ?");
                try {
                    T03.b(1, j2);
                    T03.b(2, j);
                    T03.q();
                    int x3 = jx81.x(oll0Var3);
                    T03.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 3:
                oll0 oll0Var4 = (oll0) obj;
                ull0 T04 = oll0Var4.T0("UPDATE chats SET min_message_timestamp = ? WHERE chat_internal_id = ?");
                try {
                    T04.b(1, j2);
                    T04.b(2, j);
                    T04.q();
                    int x4 = jx81.x(oll0Var4);
                    T04.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 4:
                c1y c1yVar = (c1y) obj;
                float w0 = c1yVar.w0(12.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                qam.g0(c1yVar, this.b, 0L, 0L, floatToRawIntBits, null, 246);
                AppColor$Palette appColor$Palette = yrl.a;
                qam.g0(c1yVar, this.c, 0L, 0L, floatToRawIntBits, new jvu0(0, 0, 30, c1yVar.w0(2.0f), 0.0f), 230);
                c1yVar.a();
                return zy11Var;
            case 5:
                oll0 oll0Var5 = (oll0) obj;
                ull0 T05 = oll0Var5.T0("\n        DELETE FROM message_translations\n        WHERE chat_internal_id=? AND message_history_id<=?\n        ");
                try {
                    T05.b(1, j2);
                    T05.b(2, j);
                    T05.q();
                    int x5 = jx81.x(oll0Var5);
                    T05.close();
                    return Integer.valueOf(x5);
                } finally {
                }
            case 6:
                oll0 oll0Var6 = (oll0) obj;
                ull0 T06 = oll0Var6.T0("\n        DELETE FROM message_translations\n        WHERE chat_internal_id=?\n            AND message_history_id<=? AND message_history_id>=?-999\n        ");
                try {
                    T06.b(1, j2);
                    T06.b(2, j);
                    T06.b(3, j);
                    T06.q();
                    int x6 = jx81.x(oll0Var6);
                    T06.close();
                    return Integer.valueOf(x6);
                } finally {
                }
            case 7:
                oll0 oll0Var7 = (oll0) obj;
                ull0 T07 = oll0Var7.T0("UPDATE messages SET flags = ? WHERE msg_internal_id = ?");
                try {
                    T07.b(1, j2);
                    T07.b(2, j);
                    T07.q();
                    int x7 = jx81.x(oll0Var7);
                    T07.close();
                    return Integer.valueOf(x7);
                } finally {
                }
            case 8:
                ull0 T08 = ((oll0) obj).T0("SELECT msg_internal_id, flags FROM messages WHERE message_history_id = ? AND chat_internal_id = ?");
                try {
                    T08.b(1, j2);
                    T08.b(2, j);
                    return T08.q() ? new ey10(T08.getLong(0), T08.getLong(1)) : null;
                } finally {
                }
            case 9:
                ull0 T09 = ((oll0) obj).T0("SELECT message_sequence_number FROM messages WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T09.b(1, j2);
                    T09.b(2, j);
                    return (!T09.q() || T09.isNull(0)) ? null : Long.valueOf(T09.getLong(0));
                } finally {
                }
            case 10:
                ull0 T010 = ((oll0) obj).T0("SELECT message_prev_history_id FROM messages WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T010.b(1, j2);
                    T010.b(2, j);
                    return (!T010.q() || T010.isNull(0)) ? null : Long.valueOf(T010.getLong(0));
                } finally {
                }
            case 11:
                ull0 T011 = ((oll0) obj).T0("SELECT edit_time FROM messages WHERE message_history_id = ? AND chat_internal_id = ?");
                try {
                    T011.b(1, j2);
                    T011.b(2, j);
                    return (!T011.q() || T011.isNull(0)) ? null : Long.valueOf(T011.getLong(0));
                } finally {
                }
            case 12:
                ull0 T012 = ((oll0) obj).T0(" SELECT\n            msg_internal_id, message_id, message_sequence_number, message_prev_history_id, message_history_id, time\n            FROM messages WHERE chat_internal_id = ? AND message_history_id = ?\n        ");
                try {
                    T012.b(1, j2);
                    T012.b(2, j);
                    if (T012.q()) {
                        dy10Var = new dy10(T012.getLong(0), T012.isNull(1) ? null : T012.Y1(1), T012.getLong(2), T012.getLong(3), T012.getLong(4), T012.getDouble(5));
                    } else {
                        dy10Var = null;
                    }
                    return dy10Var;
                } finally {
                }
            case 13:
                ull0 T013 = ((oll0) obj).T0("SELECT message_prev_history_id FROM messages WHERE chat_internal_id = ? AND message_history_id > ?  ORDER BY message_history_id ASC LIMIT 1");
                try {
                    T013.b(1, j2);
                    T013.b(2, j);
                    return (!T013.q() || T013.isNull(0)) ? null : Long.valueOf(T013.getLong(0));
                } finally {
                }
            case 14:
                ull0 T014 = ((oll0) obj).T0("SELECT data FROM messages WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T014.b(1, j2);
                    T014.b(2, j);
                    return (!T014.q() || T014.isNull(0)) ? null : T014.Y1(0);
                } finally {
                }
            case 15:
                ull0 T015 = ((oll0) obj).T0(" SELECT\n            msg_internal_id, flags, data\n            FROM messages WHERE chat_internal_id = ? AND message_history_id = ?\n        ");
                try {
                    T015.b(1, j2);
                    T015.b(2, j);
                    if (T015.q()) {
                        cy10Var = new cy10(T015.getLong(0), T015.getLong(1), T015.isNull(2) ? null : T015.Y1(2));
                    } else {
                        cy10Var = null;
                    }
                    return cy10Var;
                } finally {
                }
            case 16:
                oll0 oll0Var8 = (oll0) obj;
                ull0 T016 = oll0Var8.T0("UPDATE messages SET views_count = ? WHERE msg_internal_id = ?");
                try {
                    T016.b(1, j2);
                    T016.b(2, j);
                    T016.q();
                    int x8 = jx81.x(oll0Var8);
                    T016.close();
                    return Integer.valueOf(x8);
                } finally {
                }
            case 17:
                oll0 oll0Var9 = (oll0) obj;
                ull0 T017 = oll0Var9.T0("DELETE FROM messages WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T017.b(1, j2);
                    T017.b(2, j);
                    T017.q();
                    int x9 = jx81.x(oll0Var9);
                    T017.close();
                    return Integer.valueOf(x9);
                } finally {
                }
            case 18:
                ull0 T018 = ((oll0) obj).T0("SELECT EXISTS (SELECT 1 FROM messages WHERE chat_internal_id = ? AND message_history_id = ?)");
                try {
                    T018.b(1, j2);
                    T018.b(2, j);
                    if (T018.q()) {
                        if (((int) T018.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T018.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 19:
                ull0 T019 = ((oll0) obj).T0("SELECT message_history_id FROM messages WHERE chat_internal_id = ? AND message_history_id > ? AND data IS NOT NULL ORDER BY message_history_id ASC LIMIT 1");
                try {
                    T019.b(1, j2);
                    T019.b(2, j);
                    return (!T019.q() || T019.isNull(0)) ? null : Long.valueOf(T019.getLong(0));
                } finally {
                }
            case 20:
                oll0 oll0Var10 = (oll0) obj;
                ull0 T020 = oll0Var10.T0("DELETE FROM messages WHERE chat_internal_id = ? AND message_history_id <= ?");
                try {
                    T020.b(1, j2);
                    T020.b(2, j);
                    T020.q();
                    int x10 = jx81.x(oll0Var10);
                    T020.close();
                    return Integer.valueOf(x10);
                } finally {
                }
            case 21:
                ull0 T021 = ((oll0) obj).T0("SELECT * FROM messages WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T021.b(1, j2);
                    T021.b(2, j);
                    int r = eja1.r(T021, "row_id");
                    int r2 = eja1.r(T021, "chat_internal_id");
                    int r3 = eja1.r(T021, "message_history_id");
                    int r4 = eja1.r(T021, "message_sequence_number");
                    int r5 = eja1.r(T021, "message_prev_history_id");
                    int r6 = eja1.r(T021, "msg_internal_id");
                    int r7 = eja1.r(T021, "flags");
                    int r8 = eja1.r(T021, "message_id");
                    int r9 = eja1.r(T021, RemoteBioParameters.TIME);
                    int r10 = eja1.r(T021, "author");
                    int r11 = eja1.r(T021, Constants.KEY_DATA);
                    int r12 = eja1.r(T021, "custom_payload");
                    int r13 = eja1.r(T021, "reply_data");
                    int r14 = eja1.r(T021, "edit_time");
                    int r15 = eja1.r(T021, "views_count");
                    int r16 = eja1.r(T021, "forwards_count");
                    int r17 = eja1.r(T021, "notification_meta");
                    if (T021.q()) {
                        fy10Var = new fy10(T021.isNull(r) ? null : Long.valueOf(T021.getLong(r)), T021.getLong(r2), T021.getLong(r3), T021.getLong(r4), T021.getLong(r5), T021.getLong(r6), T021.getLong(r7), T021.isNull(r8) ? null : T021.Y1(r8), T021.getDouble(r9), T021.Y1(r10), T021.isNull(r11) ? null : T021.Y1(r11), T021.isNull(r12) ? null : T021.Y1(r12), T021.isNull(r13) ? null : T021.Y1(r13), T021.getLong(r14), T021.getLong(r15), T021.getLong(r16), T021.isNull(r17) ? null : T021.Y1(r17));
                    } else {
                        fy10Var = null;
                    }
                    return fy10Var;
                } finally {
                }
            case 22:
                ull0 T022 = ((oll0) obj).T0("SELECT data, data_type, message_history_id, message_previous_history_id, message_sequence_number, time\n           FROM messages_view\n           WHERE message_history_id < ? AND chat_internal_id = ?\n           ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T022.b(1, j2);
                    T022.b(2, j);
                    if (T022.q()) {
                        hz10Var = new hz10(T022.isNull(0) ? null : T022.Y1(0), T022.isNull(1) ? null : Integer.valueOf((int) T022.getLong(1)), T022.getLong(2), T022.getLong(4), T022.getLong(3), T022.getDouble(5));
                    } else {
                        hz10Var = null;
                    }
                    return hz10Var;
                } finally {
                }
            case 23:
                ull0 T023 = ((oll0) obj).T0("SELECT author FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T023.b(1, j2);
                    T023.b(2, j);
                    return (!T023.q() || T023.isNull(0)) ? null : T023.Y1(0);
                } finally {
                }
            case 24:
                ull0 T024 = ((oll0) obj).T0("SELECT count(*) FROM messages_view\n            WHERE message_history_id = ? AND chat_internal_id = ?\n            AND (flags & 16) = 0");
                try {
                    T024.b(1, j2);
                    T024.b(2, j);
                    if (T024.q()) {
                        if (((int) T024.getLong(0)) != 0) {
                            z3 = true;
                        }
                    }
                    T024.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 25:
                ull0 T025 = ((oll0) obj).T0("SELECT COUNT(*) FROM messages_view WHERE chat_internal_id = ? AND message_history_id > ?");
                try {
                    T025.b(1, j2);
                    T025.b(2, j);
                    int i2 = T025.q() ? (int) T025.getLong(0) : 0;
                    T025.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 26:
                oll0 oll0Var11 = (oll0) obj;
                ull0 T026 = oll0Var11.T0("UPDATE messages_view SET\n           original_lang = NULL,\n           translated_lang = NULL,\n           translated_text = NULL,\n           original_reply_lang = NULL,\n           translated_reply_text = NULL,\n           translated_suggests = NULL\n           WHERE chat_internal_id = ?\n                AND message_history_id = ?\n                AND translated_lang IS NOT NULL\n           ");
                try {
                    T026.b(1, j2);
                    T026.b(2, j);
                    T026.q();
                    int x11 = jx81.x(oll0Var11);
                    T026.close();
                    return Integer.valueOf(x11);
                } finally {
                }
            case 27:
                ull0 T027 = ((oll0) obj).T0("UPDATE messages_view SET forced_translated_text = NULL WHERE chat_internal_id = ? AND msg_internal_id = ?");
                try {
                    T027.b(1, j2);
                    T027.b(2, j);
                    T027.q();
                    return zy11Var;
                } finally {
                }
            case 28:
                ull0 T028 = ((oll0) obj).T0("SELECT count(*) FROM messages_view\n            WHERE message_history_id = ? AND chat_internal_id = ?");
                try {
                    T028.b(1, j2);
                    T028.b(2, j);
                    if (T028.q()) {
                        if (((int) T028.getLong(0)) != 0) {
                            z2 = true;
                        }
                    }
                    T028.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            default:
                ull0 T029 = ((oll0) obj).T0("SELECT data, data_type, message_history_id, message_previous_history_id, message_sequence_number, time\n           FROM messages_view\n           WHERE message_history_id <= ? AND chat_internal_id = ?\n           ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T029.b(1, j2);
                    T029.b(2, j);
                    if (T029.q()) {
                        hz10Var2 = new hz10(T029.isNull(0) ? null : T029.Y1(0), T029.isNull(1) ? null : Integer.valueOf((int) T029.getLong(1)), T029.getLong(2), T029.getLong(4), T029.getLong(3), T029.getDouble(5));
                    } else {
                        hz10Var2 = null;
                    }
                    return hz10Var2;
                } finally {
                }
        }
    }
}
