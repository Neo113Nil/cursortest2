package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.List;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ez10 extends az10 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(24);

    public ez10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.az10
    public final List A(long j, long j2) {
        return (List) a.b(this.a, true, false, new dz10(6, j2, j));
    }

    @Override // defpackage.az10
    public final String B(long j, long j2) {
        return (String) a.b(this.a, true, false, new dz10(10, j, j2));
    }

    @Override // defpackage.az10
    public final String C(long j, String str) {
        return (String) a.b(this.a, true, false, new qo6(str, j, 17));
    }

    @Override // defpackage.az10
    public final fz10 D(long j, long j2) {
        return (fz10) a.b(this.a, true, false, new dz10(1, j2, j));
    }

    @Override // defpackage.az10
    public final Long E(long j, long j2) {
        return (Long) a.b(this.a, true, false, new dz10(9, j, j2));
    }

    @Override // defpackage.az10
    public final Long F(long j, String str) {
        return (Long) a.b(this.a, true, false, new qo6(j, str, 16));
    }

    @Override // defpackage.az10
    public final boolean G(long j) {
        return ((Boolean) a.b(this.a, true, false, new vh10(j, 7))).booleanValue();
    }

    @Override // defpackage.az10
    public final boolean H(long j, long j2) {
        return ((Boolean) a.b(this.a, true, false, new j2b(28, j2, j))).booleanValue();
    }

    @Override // defpackage.az10
    public final boolean I(long j, long j2) {
        return ((Boolean) a.b(this.a, true, false, new j2b(24, j2, j))).booleanValue();
    }

    @Override // defpackage.az10
    public final long J(jz10 jz10Var) {
        return ((Number) a.b(this.a, false, true, new vmz(20, this, jz10Var))).longValue();
    }

    @Override // defpackage.az10
    public final int K(long j, long j2, long j3) {
        return ((Number) a.b(this.a, false, true, new jeb(5, j, j3, j2))).intValue();
    }

    @Override // defpackage.az10
    public final Cursor L(long j) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(1, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? ORDER BY message_history_id DESC");
        e.b(1, j);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor M(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? AND message_history_id > ? ORDER BY message_history_id DESC");
        e.b(1, j);
        e.b(2, j2);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor N(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(3, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? AND message_history_id >= ?\n           ORDER BY message_history_id ASC LIMIT ?");
        e.b(1, j);
        e.b(2, j2);
        e.b(3, 2L);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor O(int i, long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(4, "SELECT * FROM (\n                SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n                AND message_history_id >= ? AND message_history_id < ?\n                ORDER BY message_history_id ASC LIMIT ?\n           ) ORDER BY message_history_id DESC");
        e.b(1, j);
        e.b(2, j2);
        e.b(3, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
        e.b(4, i);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor P(int i, long j) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? ORDER BY message_history_id DESC LIMIT ?");
        e.b(1, j);
        e.b(2, i);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor Q(long j, long j2, long j3, int i, boolean z) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(6, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view\n           WHERE chat_internal_id = ?\n           AND message_history_id > ? AND message_history_id < ?\n           ORDER BY\n           CASE WHEN ? = 1 THEN message_history_id END DESC,\n           CASE WHEN ? = 0 THEN message_history_id END ASC\n           LIMIT ?");
        e.b(1, j);
        e.b(2, j2);
        e.b(3, j3);
        long j4 = z ? 1L : 0L;
        e.b(4, j4);
        e.b(5, j4);
        e.b(6, i);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor R(long j, long j2, long j3, int i, int[] iArr, boolean z) {
        StringBuilder t = qv10.t("SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view\n           WHERE chat_internal_id = ?\n           AND message_history_id > ? AND message_history_id < ?\n           AND data_type IN(");
        int length = iArr.length;
        q5z.b(t, length);
        t.append(Extension.C_BRAKE);
        t.append("\n");
        t.append("           ORDER BY");
        g8e.D(t, "\n", "           CASE WHEN ", "?", " = 1 THEN message_history_id END DESC,");
        g8e.D(t, "\n", "           CASE WHEN ", "?", " = 0 THEN message_history_id END ASC");
        String r = unr0.r(t, "\n", "           LIMIT ", "?");
        int i2 = length + 6;
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(i2, r);
        e.b(1, j);
        e.b(2, j2);
        e.b(3, j3);
        int i3 = 4;
        for (int i4 : iArr) {
            e.b(i3, i4);
            i3++;
        }
        long j4 = z ? 1L : 0L;
        e.b(length + 4, j4);
        e.b(length + 5, j4);
        e.b(i2, i);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor S(int i, long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(4, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n           AND message_history_id >= ? AND message_history_id <= ?\n           ORDER BY message_history_id DESC LIMIT ?");
        e.b(1, j);
        e.b(2, Long.MIN_VALUE);
        e.b(3, j2);
        e.b(4, i);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor T(long j, long j2, long j3) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(3, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n           AND message_history_id >= ? AND message_history_id <= ?\n           ORDER BY message_history_id DESC");
        e.b(1, j);
        e.b(2, j2);
        e.b(3, j3);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor U(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n           AND message_history_id >= ? ORDER BY message_history_id ASC LIMIT 1");
        e.b(1, j);
        e.b(2, j2);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor V(long j, String str) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "\n        SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view\n        WHERE original_message_chat_id = ? AND original_message_history_id = ?\n    ");
        e.m0(1, str);
        e.b(2, j);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final List W(long j, long j2) {
        return (List) a.b(this.a, true, false, new dz10(4, j, j2));
    }

    @Override // defpackage.az10
    public final Cursor X(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? AND message_history_id = ?");
        e.b(1, j);
        e.b(2, j2);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor Y(long j, String str) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ? AND message_id = ?");
        e.b(1, j);
        e.m0(2, str);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final Cursor Z(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(3, "\n            SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n            AND message_history_id >= ?-999 AND message_history_id <= ?\n            ORDER BY message_history_id DESC\n           ");
        e.b(1, j);
        e.b(2, j2);
        e.b(3, j2);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final void a(long j, long j2) {
        a.b(this.a, false, true, new j2b(27, j, j2));
    }

    @Override // defpackage.az10
    public final Cursor a0(long j, long j2) {
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT messages_view.message_history_id, messages_view.msg_internal_id, messages_view.flags, messages_view.time, messages_view.author, messages_view.data, messages_view.custom_payload, messages_view.message_id, messages_view.reply_data, messages_view.forwarded_author_id, messages_view.host_message_history_id, messages_view.message_sequence_number, messages_view.message_previous_history_id, messages_view.views_count, messages_view.original_message_chat_id, messages_view.original_message_history_id, messages_view.fake_guid, messages_view.forwards_count, messages_view.data_type, messages_view.notification_meta, messages_view.chat_internal_id, messages_view.chat_id, messages_view.translated_lang, messages_view.original_lang, messages_view.translated_text,messages_view.original_reply_lang, messages_view.translated_reply_text,messages_view.translated_suggests,messages_view.forced_translated_text,messages_view.forced_translated_reply_text FROM messages_view WHERE chat_internal_id = ?\n           AND message_previous_history_id = ?");
        e.b(1, j);
        e.b(2, j2);
        return this.a.O0(e);
    }

    @Override // defpackage.az10
    public final void b() {
        a.b(this.a, false, true, new rv10(7));
    }

    @Override // defpackage.az10
    public final iz10 b0(long j, long j2) {
        return (iz10) a.b(this.a, true, false, new dz10(8, j, j2));
    }

    @Override // defpackage.az10
    public final int c(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new j2b(26, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int c0(final double d, final long j, final long j2, final long j3, final long j4, final long j5, final long j6, final long j7, final long j8, final Integer num, final String str, final String str2, final String str3, final String str4, final String str5) {
        return ((Number) a.b(this.a, false, true, new tls() { // from class: bz10
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long j9 = j2;
                long j10 = j4;
                long j11 = j3;
                long j12 = j5;
                long j13 = j6;
                String str6 = str;
                double d2 = d;
                long j14 = j7;
                long j15 = j8;
                long j16 = j;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE messages_view SET\n           message_history_id = ?,\n           message_sequence_number = ?,\n           message_previous_history_id = ?,\n           message_version = ?,\n           flags = ?,\n           data = ?,\n           data_type = ?,\n           custom_payload = ?,\n           time = ?,\n           reply_data = ?,\n           author = ?,\n           views_count = ?,\n           forwards_count = ?,\n           notification_meta = ?\n           WHERE msg_internal_id = ?");
                try {
                    T0.b(1, j9);
                    T0.b(2, j10);
                    T0.b(3, j11);
                    T0.b(4, j12);
                    T0.b(5, j13);
                    T0.g1(6, str6);
                    if (num == null) {
                        T0.p(7);
                    } else {
                        T0.b(7, r1.intValue());
                    }
                    String str7 = str2;
                    if (str7 == null) {
                        T0.p(8);
                    } else {
                        T0.g1(8, str7);
                    }
                    T0.z(d2, 9);
                    String str8 = str3;
                    if (str8 == null) {
                        T0.p(10);
                    } else {
                        T0.g1(10, str8);
                    }
                    String str9 = str4;
                    if (str9 == null) {
                        T0.p(11);
                    } else {
                        T0.g1(11, str9);
                    }
                    T0.b(12, j14);
                    T0.b(13, j15);
                    String str10 = str5;
                    if (str10 == null) {
                        T0.p(14);
                    } else {
                        T0.g1(14, str10);
                    }
                    T0.b(15, j16);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.az10
    public final int d(long j) {
        return ((Number) a.b(this.a, false, true, new vh10(j, 5))).intValue();
    }

    @Override // defpackage.az10
    public final int d0(long j, long j2, long j3) {
        return ((Number) a.b(this.a, false, true, new jeb(6, j2, j3, j))).intValue();
    }

    @Override // defpackage.az10
    public final int e(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new dz10(5, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int e0(long j, String str, Integer num) {
        return ((Number) a.b(this.a, false, true, new ec1(str, num, j, 6))).intValue();
    }

    @Override // defpackage.az10
    public final int f(long j, long j2, long j3) {
        return ((Number) a.b(this.a, false, true, new jeb(7, j, j2, j3))).intValue();
    }

    @Override // defpackage.az10
    public final int f0(long j, long j2, Integer num, String str) {
        return ((Number) a.b(this.a, false, true, new pa6(j, j2, num, str))).intValue();
    }

    @Override // defpackage.az10
    public final int g(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new dz10(3, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int g0(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new dz10(2, j2, j))).intValue();
    }

    @Override // defpackage.az10
    public final String h(long j, long j2) {
        return (String) a.b(this.a, true, false, new j2b(23, j, j2));
    }

    @Override // defpackage.az10
    public final void h0(String str) {
        a.b(this.a, false, true, new vsq(str, 23));
    }

    @Override // defpackage.az10
    public final String i(long j, String str) {
        return (String) a.b(this.a, true, false, new qo6(j, str, 18));
    }

    @Override // defpackage.az10
    public final int i0(long j, long j2, long j3, long j4, String str) {
        return ((Number) a.b(this.a, false, true, new yx10(j2, j3, j4, j, str, 1))).intValue();
    }

    @Override // defpackage.az10
    public final int j(long j, long j2) {
        return ((Number) a.b(this.a, true, false, new j2b(25, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int j0(final long j, final long j2, final long j3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        return ((Number) a.b(this.a, false, true, new tls() { // from class: cz10
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long j4 = j;
                long j5 = j2;
                long j6 = j3;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE messages_view SET\n           original_lang = ?,\n           translated_lang = ?,\n           translated_text = ?,\n           original_reply_lang = ?,\n           translated_reply_text = ?,\n           translated_suggests = ?\n           WHERE chat_internal_id = ?\n                AND message_history_id = ?\n                AND message_version = ?\n           ");
                String str7 = str2;
                try {
                    if (str7 == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str7);
                    }
                    String str8 = str;
                    if (str8 == null) {
                        T0.p(2);
                    } else {
                        T0.g1(2, str8);
                    }
                    String str9 = str3;
                    if (str9 == null) {
                        T0.p(3);
                    } else {
                        T0.g1(3, str9);
                    }
                    String str10 = str4;
                    if (str10 == null) {
                        T0.p(4);
                    } else {
                        T0.g1(4, str10);
                    }
                    String str11 = str5;
                    if (str11 == null) {
                        T0.p(5);
                    } else {
                        T0.g1(5, str11);
                    }
                    String str12 = str6;
                    if (str12 == null) {
                        T0.p(6);
                    } else {
                        T0.g1(6, str12);
                    }
                    T0.b(7, j4);
                    T0.b(8, j5);
                    T0.b(9, j6);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            }
        })).intValue();
    }

    @Override // defpackage.az10
    public final int k(long j, long j2) {
        return ((Number) a.b(this.a, true, false, new dz10(13, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int k0(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new dz10(11, j2, j))).intValue();
    }

    @Override // defpackage.az10
    public final int l(long j, long j2) {
        return ((Number) a.b(this.a, true, false, new dz10(14, j, j2))).intValue();
    }

    @Override // defpackage.az10
    public final int m(long j, long j2, long j3) {
        return ((Number) a.b(this.a, true, false, new jeb(4, j, j2, j3))).intValue();
    }

    @Override // defpackage.az10
    public final Long n(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 4));
    }

    @Override // defpackage.az10
    public final hz10 o(long j, long j2) {
        return (hz10) a.b(this.a, true, false, new dz10(0, j2, j));
    }

    @Override // defpackage.az10
    public final hz10 p(long j, long j2) {
        return (hz10) a.b(this.a, true, false, new j2b(22, j2, j));
    }

    @Override // defpackage.az10
    public final hz10 q(long j, long j2) {
        return (hz10) a.b(this.a, true, false, new j2b(29, j2, j));
    }

    @Override // defpackage.az10
    public final Long r(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 9));
    }

    @Override // defpackage.az10
    public final String s(long j, long j2) {
        return (String) a.b(this.a, true, false, new dz10(15, j, j2));
    }

    @Override // defpackage.az10
    public final List t(long j) {
        return (List) a.b(this.a, true, false, new vh10(j, 6));
    }

    @Override // defpackage.az10
    public final List u(long j, long j2) {
        return (List) a.b(this.a, true, false, new dz10(12, j, j2));
    }

    @Override // defpackage.az10
    public final Long v() {
        return (Long) a.b(this.a, true, false, new rv10(6));
    }

    @Override // defpackage.az10
    public final Long w(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 11));
    }

    @Override // defpackage.az10
    public final Long x(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 8));
    }

    @Override // defpackage.az10
    public final Long y(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 10));
    }

    @Override // defpackage.az10
    public final hz10 z(long j, long j2) {
        return (hz10) a.b(this.a, true, false, new dz10(7, j, j2));
    }
}
