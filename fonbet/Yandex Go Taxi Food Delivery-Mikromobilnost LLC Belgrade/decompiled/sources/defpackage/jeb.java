package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class jeb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;

    public /* synthetic */ jeb(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.w = j3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        long j = this.w;
        long j2 = this.c;
        long j3 = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                T0 = oll0Var.T0("UPDATE chats SET seen_marker = ?, owner_last_seen_sequence_number = ? WHERE chat_internal_id = ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 1:
                T0 = oll0Var.T0("UPDATE messages SET message_prev_history_id = 0 WHERE chat_internal_id = ? AND message_history_id = ? AND message_prev_history_id <= ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x2 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 2:
                T0 = oll0Var.T0("UPDATE messages SET views_count = ?, forwards_count = ? WHERE msg_internal_id = ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x3 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 3:
                T0 = oll0Var.T0("DELETE FROM messages WHERE chat_internal_id = ?\n           AND message_prev_history_id = ?\n           AND message_history_id >= ?\n           ");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x4 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 4:
                T0 = oll0Var.T0("SELECT COUNT(*) FROM messages_view\n           WHERE chat_internal_id = ?\n           AND message_history_id > ?\n           AND message_history_id <= ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    int i2 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 5:
                T0 = oll0Var.T0("UPDATE messages_view SET message_previous_history_id = 0 WHERE chat_internal_id = ? AND message_history_id = ? AND message_previous_history_id <= ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x5 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x5);
                } finally {
                }
            case 6:
                T0 = oll0Var.T0("UPDATE messages_view SET views_count = ?, forwards_count = ? WHERE msg_internal_id = ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x6 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x6);
                } finally {
                }
            default:
                T0 = oll0Var.T0("\n        DELETE FROM messages_view WHERE chat_internal_id = ?\n        AND message_history_id >= ?\n        AND message_previous_history_id = ?");
                try {
                    T0.b(1, j3);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x7 = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x7);
                } finally {
                }
        }
    }
}
