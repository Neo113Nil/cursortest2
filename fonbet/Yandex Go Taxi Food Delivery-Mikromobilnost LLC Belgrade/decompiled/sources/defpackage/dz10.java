package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class dz10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ dz10(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        hz10 hz10Var = null;
        fzy0 fzy0Var = null;
        r5 = null;
        String str = null;
        r5 = null;
        String str2 = null;
        r5 = null;
        Long l = null;
        String Y1 = null;
        iz10 iz10Var = null;
        hz10 hz10Var2 = null;
        r6 = false;
        boolean z = false;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                ull0 T0 = ((oll0) obj).T0("SELECT data, data_type, message_history_id, message_previous_history_id, message_sequence_number, time\n           FROM messages_view\n           WHERE message_history_id > ? AND chat_internal_id = ?\n           ORDER BY message_history_id ASC LIMIT 1");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    if (T0.q()) {
                        hz10Var = new hz10(T0.isNull(0) ? null : T0.Y1(0), T0.isNull(1) ? null : Integer.valueOf((int) T0.getLong(1)), T0.getLong(2), T0.getLong(4), T0.getLong(3), T0.getDouble(5));
                    }
                    return hz10Var;
                } finally {
                }
            case 1:
                ull0 T02 = ((oll0) obj).T0("SELECT msg_internal_id, flags FROM messages_view\n           WHERE message_history_id = ?\n           AND chat_internal_id = ?");
                try {
                    T02.b(1, j2);
                    T02.b(2, j);
                    return T02.q() ? new fz10(T02.getLong(0), T02.getLong(1)) : null;
                } finally {
                }
            case 2:
                oll0 oll0Var = (oll0) obj;
                ull0 T03 = oll0Var.T0("UPDATE messages_view SET flags = ? WHERE msg_internal_id = ?");
                try {
                    T03.b(1, j2);
                    T03.b(2, j);
                    T03.q();
                    int x = jx81.x(oll0Var);
                    T03.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 3:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T04 = oll0Var2.T0("DELETE FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T04.b(1, j2);
                    T04.b(2, j);
                    T04.q();
                    int x2 = jx81.x(oll0Var2);
                    T04.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 4:
                ull0 T05 = ((oll0) obj).T0("\n            SELECT message_history_id FROM messages_view WHERE chat_internal_id = ?\n            AND message_history_id >= ?-999 AND message_history_id <= ?\n            ORDER BY message_history_id DESC\n           ");
                try {
                    T05.b(1, j2);
                    T05.b(2, j);
                    T05.b(3, j);
                    ArrayList arrayList = new ArrayList();
                    while (T05.q()) {
                        arrayList.add(Long.valueOf(T05.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                oll0 oll0Var3 = (oll0) obj;
                ull0 T06 = oll0Var3.T0("DELETE FROM messages_view WHERE chat_internal_id = ? AND message_history_id <= ?");
                try {
                    T06.b(1, j2);
                    T06.b(2, j);
                    T06.q();
                    int x3 = jx81.x(oll0Var3);
                    T06.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 6:
                ull0 T07 = ((oll0) obj).T0("SELECT msg_internal_id, flags FROM messages_view\n           WHERE (message_history_id = ? OR host_message_history_id = ?)\n           AND chat_internal_id = ?");
                try {
                    T07.b(1, j2);
                    T07.b(2, j2);
                    T07.b(3, j);
                    ArrayList arrayList2 = new ArrayList();
                    while (T07.q()) {
                        arrayList2.add(new fz10(T07.getLong(0), T07.getLong(1)));
                    }
                    return arrayList2;
                } finally {
                }
            case 7:
                ull0 T08 = ((oll0) obj).T0("SELECT data, data_type, message_history_id, message_previous_history_id, message_sequence_number, time\n           FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T08.b(1, j2);
                    T08.b(2, j);
                    if (T08.q()) {
                        hz10Var2 = new hz10(T08.isNull(0) ? null : T08.Y1(0), T08.isNull(1) ? null : Integer.valueOf((int) T08.getLong(1)), T08.getLong(2), T08.getLong(4), T08.getLong(3), T08.getDouble(5));
                    }
                    return hz10Var2;
                } finally {
                }
            case 8:
                ull0 T09 = ((oll0) obj).T0("SELECT message_version, translated_lang FROM messages_view\n           WHERE chat_internal_id = ? AND message_history_id = ?\n           ");
                try {
                    T09.b(1, j2);
                    T09.b(2, j);
                    if (T09.q()) {
                        long j3 = T09.getLong(0);
                        if (!T09.isNull(1)) {
                            Y1 = T09.Y1(1);
                        }
                        iz10Var = new iz10(j3, Y1);
                    }
                    return iz10Var;
                } finally {
                }
            case 9:
                ull0 T010 = ((oll0) obj).T0("SELECT msg_internal_id from messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T010.b(1, j2);
                    T010.b(2, j);
                    if (T010.q() && !T010.isNull(0)) {
                        l = Long.valueOf(T010.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 10:
                ull0 T011 = ((oll0) obj).T0("SELECT data FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T011.b(1, j2);
                    T011.b(2, j);
                    if (T011.q() && !T011.isNull(0)) {
                        str2 = T011.Y1(0);
                    }
                    return str2;
                } finally {
                }
            case 11:
                oll0 oll0Var4 = (oll0) obj;
                ull0 T012 = oll0Var4.T0("UPDATE messages_view SET views_count = ? WHERE msg_internal_id = ?");
                try {
                    T012.b(1, j2);
                    T012.b(2, j);
                    T012.q();
                    int x4 = jx81.x(oll0Var4);
                    T012.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 12:
                ull0 T013 = ((oll0) obj).T0("SELECT original_message_chat_id, original_message_history_id\n           FROM messages_view\n           WHERE chat_internal_id = ? AND host_message_history_id = ?\n           ORDER BY message_history_id DESC");
                try {
                    T013.b(1, j2);
                    T013.b(2, j);
                    ArrayList arrayList3 = new ArrayList();
                    while (T013.q()) {
                        arrayList3.add(new gz10(T013.Y1(0), T013.getLong(1)));
                    }
                    return arrayList3;
                } finally {
                }
            case 13:
                ull0 T014 = ((oll0) obj).T0("SELECT COUNT(*) FROM messages_view WHERE chat_internal_id = ? AND message_history_id >= ?");
                try {
                    T014.b(1, j2);
                    T014.b(2, j);
                    int i2 = T014.q() ? (int) T014.getLong(0) : 0;
                    T014.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 14:
                ull0 T015 = ((oll0) obj).T0("SELECT COUNT(*) FROM messages_view\n           WHERE chat_internal_id = ? AND message_history_id >\n           (SELECT message_history_id FROM messages_view\n           WHERE msg_internal_id = ?)");
                try {
                    T015.b(1, j2);
                    T015.b(2, j);
                    int i3 = T015.q() ? (int) T015.getLong(0) : 0;
                    T015.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 15:
                ull0 T016 = ((oll0) obj).T0("SELECT forced_translated_text FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T016.b(1, j2);
                    T016.b(2, j);
                    if (T016.q() && !T016.isNull(0)) {
                        str = T016.Y1(0);
                    }
                    return str;
                } finally {
                }
            case 16:
                return Boolean.valueOf(j2 - ((yyz0) obj).c >= j);
            case 17:
                ull0 T017 = ((oll0) obj).T0("\n        SELECT count(chat_internal_id) FROM pinned_messages\n        WHERE chat_internal_id = ? AND last_action_timestamp >= ?");
                try {
                    T017.b(1, j2);
                    T017.b(2, j);
                    if (T017.q()) {
                        if (((int) T017.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T017.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            default:
                ull0 T018 = ((oll0) obj).T0("SELECT * FROM threads_view  WHERE parent_internal_id=?  AND parent_message_timestamp=?");
                try {
                    T018.b(1, j2);
                    T018.b(2, j);
                    int r = eja1.r(T018, "thread_internal_id");
                    int r2 = eja1.r(T018, "thread_id");
                    int r3 = eja1.r(T018, "unseen");
                    int r4 = eja1.r(T018, "first_unseen_row");
                    int r5 = eja1.r(T018, "is_hidden");
                    int r6 = eja1.r(T018, "is_member");
                    int r7 = eja1.r(T018, "sort_time");
                    int r8 = eja1.r(T018, "parent_internal_id");
                    int r9 = eja1.r(T018, "parent_message_timestamp");
                    if (T018.q()) {
                        fzy0Var = new fzy0(T018.getLong(r), T018.Y1(r2), (int) T018.getLong(r3), T018.isNull(r4) ? null : Integer.valueOf((int) T018.getLong(r4)), ((int) T018.getLong(r5)) != 0, ((int) T018.getLong(r6)) != 0, T018.getLong(r7), T018.getLong(r8), T018.getLong(r9));
                    }
                    return fzy0Var;
                } finally {
                }
        }
    }
}
