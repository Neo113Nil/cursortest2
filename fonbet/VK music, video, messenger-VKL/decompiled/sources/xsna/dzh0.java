package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.storage.delegates.messages.MsgDbType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsIdList;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.im.engine.utils.StringMatchStrategy;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.czh0;

/* compiled from: SearchStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class dzh0 implements czh0 {
    public final tgl0 a;

    /* compiled from: SearchStorageManagerImpl.kt */
    public static final class a implements izs<e0w, s3q0> {
        public final /* synthetic */ Collection b;
        public final /* synthetic */ SQLiteStatement c;

        public a(Collection collection, SQLiteStatement sQLiteStatement) {
            this.b = collection;
            this.c = sQLiteStatement;
        }

        @Override // xsna.izs
        public final s3q0 invoke(e0w e0wVar) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                SQLiteStatement sQLiteStatement = this.c;
                sQLiteStatement.bindLong(1, longValue);
                sQLiteStatement.executeUpdateDelete();
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchStorageManagerImpl.kt */
    public static final class b implements izs<e0w, s3q0> {
        public final /* synthetic */ Collection b;

        public b(dzh0 dzh0Var, Collection collection) {
            this.b = collection;
        }

        @Override // xsna.izs
        public final s3q0 invoke(e0w e0wVar) {
            e0w e0wVar2 = e0wVar;
            SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
            SQLiteStatement sQLiteStatement = null;
            try {
                for (Object obj : this.b) {
                    Peer.Type type = Peer.Type.CONTACT;
                    compileStatement.bindLong(1, type.h());
                    compileStatement.bindLong(2, ((Contact) obj).b);
                    String La = ((Contact) obj).La();
                    Locale locale = Locale.ROOT;
                    compileStatement.bindString(3, La.toLowerCase(locale));
                    ((Contact) obj).getClass();
                    compileStatement.bindString(4, "".toLowerCase(locale));
                    compileStatement.bindLong(5, ((Contact) obj).G3());
                    if (compileStatement.executeUpdateDelete() == 0) {
                        if (sQLiteStatement == null) {
                            sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                        }
                        sQLiteStatement.bindLong(1, ((Contact) obj).G3());
                        sQLiteStatement.bindLong(2, type.h());
                        sQLiteStatement.bindLong(3, ((Contact) obj).b);
                        sQLiteStatement.bindLong(4, 0L);
                        sQLiteStatement.bindString(5, ((Contact) obj).La().toLowerCase(locale));
                        ((Contact) obj).getClass();
                        sQLiteStatement.bindString(6, "".toLowerCase(locale));
                        sQLiteStatement.bindLong(7, Integer.MAX_VALUE);
                        sQLiteStatement.executeInsert();
                    }
                }
                return s3q0.a;
            } finally {
                compileStatement.close();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            }
        }
    }

    /* compiled from: SearchStorageManagerImpl.kt */
    public static final class c implements izs<e0w, s3q0> {
        public final /* synthetic */ Collection b;

        public c(dzh0 dzh0Var, Collection collection) {
            this.b = collection;
        }

        @Override // xsna.izs
        public final s3q0 invoke(e0w e0wVar) {
            e0w e0wVar2 = e0wVar;
            SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
            SQLiteStatement sQLiteStatement = null;
            try {
                for (Object obj : this.b) {
                    Peer.Type type = Peer.Type.EMAIL;
                    compileStatement.bindLong(1, type.h());
                    compileStatement.bindLong(2, ((Email) obj).b);
                    String str = ((Email) obj).c;
                    Locale locale = Locale.ROOT;
                    compileStatement.bindString(3, str.toLowerCase(locale));
                    compileStatement.bindString(4, "".toLowerCase(locale));
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    compileStatement.bindLong(5, Peer.a.e(((Email) obj).b, type));
                    if (compileStatement.executeUpdateDelete() == 0) {
                        if (sQLiteStatement == null) {
                            sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                        }
                        sQLiteStatement.bindLong(1, Peer.a.e(((Email) obj).b, type));
                        sQLiteStatement.bindLong(2, type.h());
                        sQLiteStatement.bindLong(3, ((Email) obj).b);
                        sQLiteStatement.bindLong(4, 0L);
                        sQLiteStatement.bindString(5, ((Email) obj).c.toLowerCase(locale));
                        sQLiteStatement.bindString(6, "".toLowerCase(locale));
                        sQLiteStatement.bindLong(7, Integer.MAX_VALUE);
                        sQLiteStatement.executeInsert();
                    }
                }
                return s3q0.a;
            } finally {
                compileStatement.close();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            }
        }
    }

    /* compiled from: SearchStorageManagerImpl.kt */
    public static final class d implements izs<e0w, s3q0> {
        public final /* synthetic */ Collection b;

        public d(dzh0 dzh0Var, Collection collection) {
            this.b = collection;
        }

        @Override // xsna.izs
        public final s3q0 invoke(e0w e0wVar) {
            e0w e0wVar2 = e0wVar;
            SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
            SQLiteStatement sQLiteStatement = null;
            try {
                for (Object obj : this.b) {
                    Peer.Type type = Peer.Type.USER;
                    compileStatement.bindLong(1, type.h());
                    compileStatement.bindLong(2, ((UserStorageModel) obj).b);
                    UserStorageModel userStorageModel = (UserStorageModel) obj;
                    String str = userStorageModel.m + ' ' + userStorageModel.n;
                    Locale locale = Locale.ROOT;
                    compileStatement.bindString(3, str.toLowerCase(locale));
                    compileStatement.bindString(4, ((UserStorageModel) obj).d.toLowerCase(locale));
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    compileStatement.bindLong(5, Peer.a.e(((UserStorageModel) obj).b, type));
                    if (compileStatement.executeUpdateDelete() == 0) {
                        if (sQLiteStatement == null) {
                            sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                        }
                        sQLiteStatement.bindLong(1, Peer.a.e(((UserStorageModel) obj).b, type));
                        sQLiteStatement.bindLong(2, type.h());
                        sQLiteStatement.bindLong(3, ((UserStorageModel) obj).b);
                        sQLiteStatement.bindLong(4, 0L);
                        UserStorageModel userStorageModel2 = (UserStorageModel) obj;
                        sQLiteStatement.bindString(5, (userStorageModel2.m + ' ' + userStorageModel2.n).toLowerCase(locale));
                        sQLiteStatement.bindString(6, ((UserStorageModel) obj).d.toLowerCase(locale));
                        sQLiteStatement.bindLong(7, (long) Integer.MAX_VALUE);
                        sQLiteStatement.executeInsert();
                    }
                }
                return s3q0.a;
            } finally {
                compileStatement.close();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            }
        }
    }

    /* compiled from: SearchStorageManagerImpl.kt */
    public static final class e implements izs<e0w, s3q0> {
        public final /* synthetic */ Collection b;

        public e(dzh0 dzh0Var, Collection collection) {
            this.b = collection;
        }

        @Override // xsna.izs
        public final s3q0 invoke(e0w e0wVar) {
            e0w e0wVar2 = e0wVar;
            SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
            SQLiteStatement sQLiteStatement = null;
            try {
                for (Object obj : this.b) {
                    Peer.Type type = Peer.Type.USER;
                    compileStatement.bindLong(1, type.h());
                    compileStatement.bindLong(2, ((User) obj).b);
                    User user = (User) obj;
                    String str = user.o + ' ' + user.p;
                    Locale locale = Locale.ROOT;
                    compileStatement.bindString(3, str.toLowerCase(locale));
                    compileStatement.bindString(4, ((User) obj).f.toLowerCase(locale));
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    compileStatement.bindLong(5, Peer.a.e(((User) obj).b, type));
                    if (compileStatement.executeUpdateDelete() == 0) {
                        if (sQLiteStatement == null) {
                            sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                        }
                        sQLiteStatement.bindLong(1, Peer.a.e(((User) obj).b, type));
                        sQLiteStatement.bindLong(2, type.h());
                        sQLiteStatement.bindLong(3, ((User) obj).b);
                        sQLiteStatement.bindLong(4, 0L);
                        User user2 = (User) obj;
                        sQLiteStatement.bindString(5, (user2.o + ' ' + user2.p).toLowerCase(locale));
                        sQLiteStatement.bindString(6, ((User) obj).f.toLowerCase(locale));
                        sQLiteStatement.bindLong(7, (long) Integer.MAX_VALUE);
                        sQLiteStatement.executeInsert();
                    }
                }
                return s3q0.a;
            } finally {
                compileStatement.close();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            }
        }
    }

    public dzh0(tgl0 tgl0Var) {
        this.a = tgl0Var;
    }

    public static final String t(dzh0 dzh0Var, ProfilesSimpleInfo profilesSimpleInfo, Dialog dialog) {
        String name;
        String str;
        if (dialog.uc()) {
            ChatSettings Hb = dialog.Hb();
            return (Hb == null || (str = Hb.b) == null) ? "" : str;
        }
        qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
        return (Ab == null || (name = Ab.name()) == null) ? "" : name;
    }

    @Override // xsna.czh0
    public final HashMap a(Peer.Type type, int i) {
        Cursor d2 = this.a.b().d("SELECT docid\n                     FROM peers_search\n                     WHERE member_type=" + type.h() + " AND is_from_search = 1\n                     ORDER BY hint_position\n                     LIMIT " + i + "\n                  ", null);
        HashMap hashMap = new HashMap(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        hashMap.put(Long.valueOf(Peer.a.d(d2.getLong(0))), Integer.valueOf(d2.getPosition()));
                        d2.moveToNext();
                    }
                }
                return hashMap;
            } finally {
                d2.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.czh0
    public final DialogsIdList b(int i) {
        Cursor d2 = this.a.b().d(tgw.b(i, "SELECT docid\n                     FROM peers_search\n                     ORDER BY hint_position\n                     LIMIT ", "\n                  "), null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(Long.valueOf(d2.getLong(0)));
                        d2.moveToNext();
                    }
                }
                Trace.endSection();
                return new DialogsIdList(arrayList);
            } finally {
                d2.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.czh0
    public final void c(DialogsIdList dialogsIdList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        new Serializer.e(new DataOutputStream(byteArrayOutputStream)).i0(dialogsIdList);
        this.a.I0().k().k(byteArrayOutputStream.toByteArray(), "key_searched_dialogs");
    }

    @Override // xsna.czh0
    public final void d(Collection<UserStorageModel> collection) {
        this.a.b().h(new d(this, collection));
    }

    @Override // xsna.czh0
    public final ArrayList e(ArrayList arrayList, ArrayList arrayList2, czh0.a aVar, int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String a2 = ho8.a(new StringBuilder(), j5g.g0(arrayList, "* ", null, null, 0, null, 62), ImageSizeKey.SIZE_KEY_BASE);
        String a3 = ho8.a(new StringBuilder(), j5g.g0(arrayList2, "* ", null, null, 0, null, 62), ImageSizeKey.SIZE_KEY_BASE);
        String str = "AND (peers_search.is_from_search = 1 OR peers_search.member_type = " + Peer.Type.CONTACT.h() + ')';
        String str2 = aVar.a ? "AND (last_msg_cnv_id > 0)" : "";
        StringBuilder sb = new StringBuilder("\n                SELECT DISTINCT\n                    peers_search.docid,\n                    peers_search.hint_position,\n                    peers_search.title,\n                    MAX(read_till_in_msg_cnv_id,read_till_out_msg_cnv_id) as sort_order\n                FROM peers_search\n                    INNER JOIN dialogs ON dialogs.id = peers_search.docid\n                WHERE peers_search.title MATCH '");
        sb.append(a2);
        sb.append("' ");
        sb.append(str);
        sb.append(' ');
        n6j.b(sb, str2, "\n            UNION ALL\n                SELECT DISTINCT\n                    peers_search.docid,\n                    peers_search.hint_position,\n                    peers_search.title,\n                    MAX(read_till_in_msg_cnv_id,read_till_out_msg_cnv_id) as sort_order\n                FROM peers_search\n                    INNER JOIN dialogs ON dialogs.id = peers_search.docid\n                WHERE peers_search.title MATCH '", a3, "' ");
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        sb.append("\n            ORDER BY sort_order DESC\n            LIMIT ");
        Cursor d2 = this.a.b().d(h5s.c(i, "\n            ", sb), null);
        ArrayList arrayList3 = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList3.add(Peer.a.b(d2.getLong(0)));
                        d2.moveToNext();
                    }
                }
                Trace.endSection();
                linkedHashSet.addAll(arrayList3);
                return new ArrayList(linkedHashSet);
            } finally {
                d2.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.czh0
    public final void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        tgl0 tgl0Var = this.a;
        SQLiteStatement compileStatement = tgl0Var.b().compileStatement("UPDATE peers_search SET is_from_search = 0, hint_position = 2147483647 WHERE hint_position != 2147483647");
        SQLiteStatement compileStatement2 = tgl0Var.b().compileStatement("UPDATE peers_search SET is_from_search = 1, hint_position = ? WHERE docid = ?");
        tgl0Var.b().c(new ihb(compileStatement, arrayList, compileStatement2, 10));
        compileStatement.close();
        compileStatement2.close();
    }

    @Override // xsna.czh0
    public final boolean g() {
        Integer J = fl3.J(this.a.b().d("SELECT COUNT(1) FROM peers_search WHERE is_from_search MATCH '1'", null));
        return J != null && J.intValue() == 0;
    }

    @Override // xsna.czh0
    public final void h(long j) {
        this.a.I0().k().j("hints_last_updated", j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.czh0
    public final List i(ArrayList arrayList, ArrayList arrayList2, Long l, int i, int i2) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        ArrayList arrayList3;
        tgl0 tgl0Var = this.a;
        String str = "AND type == " + MsgDbType.FROM_USER.i();
        StringBuilder sb = new StringBuilder("\n                SELECT *\n                FROM messages\n                WHERE local_id IN (\n                    SELECT DISTINCT docid\n                    FROM messages_search\n                    WHERE body MATCH '");
        sb.append(p4g.k(arrayList, "* ", null));
        sb.append("*'\n                    UNION\n                    SELECT DISTINCT docid\n                    FROM messages_search\n                    WHERE body MATCH '");
        sb.append(p4g.k(arrayList2, "* ", null));
        sb.append("*'\n                ) ");
        sb.append("AND dialog_id == " + l);
        sb.append(' ');
        sb.append(str);
        sb.append("\n                ORDER BY time DESC\n                LIMIT ");
        String a2 = rzl.a(i2, i, "\n                OFFSET ", "\n                ", sb);
        try {
            m = tgl0Var.b().m(a2, null);
            arrayList3 = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList3.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a3 = Result.a(failure);
                Object obj = failure;
                if (a3 != null) {
                    try {
                        a3.getMessage();
                        Cursor n = tgl0Var.b().n(a2, null);
                        ArrayList arrayList4 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList4.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                        n.moveToNext();
                                    }
                                }
                            } finally {
                                n.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    obj = failure2;
                }
                Throwable a4 = Result.a(obj);
                if (a4 != null) {
                    L.e(a4, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(obj);
                return (List) obj;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    @Override // xsna.czh0
    public final void j(Collection<User> collection) {
        this.a.b().h(new e(this, collection));
    }

    @Override // xsna.czh0
    public final void k(Collection<Contact> collection) {
        this.a.b().h(new b(this, collection));
    }

    @Override // xsna.czh0
    public final long l() {
        return this.a.I0().k().g("hints_last_updated");
    }

    @Override // xsna.czh0
    public final void m(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo) {
        this.a.b().h(new fzh0(this, arrayList, profilesSimpleInfo, this, profilesSimpleInfo, profilesSimpleInfo));
    }

    @Override // xsna.czh0
    public final void n(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return;
        }
        tgl0 tgl0Var = this.a;
        SQLiteStatement compileStatement = tgl0Var.b().compileStatement("DELETE FROM peers_search WHERE docid = ?");
        try {
            tgl0Var.b().c(new a(collection, compileStatement));
            s3q0 s3q0Var = s3q0.a;
            compileStatement.close();
        } finally {
        }
    }

    @Override // xsna.czh0
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.a.b().execSQL(air.b(')', "UPDATE peers_search SET is_from_search = 1 WHERE docid IN(", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62)));
    }

    @Override // xsna.czh0
    public final void p(ArrayList arrayList) {
        this.a.b().h(new ezh0(this, arrayList));
    }

    @Override // xsna.czh0
    public final DialogsIdList q() {
        byte[] b2 = this.a.I0().k().b("key_searched_dialogs");
        if (b2 == null) {
            return new DialogsIdList(null, 1, null);
        }
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        return (DialogsIdList) new Serializer.d(new DataInputStream(new ByteArrayInputStream(b2))).G(DialogsIdList.class.getClassLoader());
    }

    @Override // xsna.czh0
    public final List<Peer> r(long j, String str, StringMatchStrategy stringMatchStrategy, Integer num) {
        String d2;
        if (drm0.N(str)) {
            return EmptyList.b;
        }
        List l = e43.l(blk.M(str), blk.N(str));
        HashSet hashSet = new HashSet();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String str2 = "";
            String y = brm0.y(brm0.y(((String) it.next()).toLowerCase(Locale.ROOT), "'", ""), "*", "");
            int i = StringMatchStrategy.a.$EnumSwitchMapping$0[stringMatchStrategy.ordinal()];
            if (i == 1) {
                y = y.concat("*");
            } else if (i == 2) {
                y = "*".concat(y);
            } else if (i == 3) {
                y = air.b(ImageSizeKey.SIZE_KEY_BASE, "*", y);
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null && (d2 = gq.d(num, "LIMIT ")) != null) {
                str2 = d2;
            }
            StringBuilder a2 = xe9.a("\n            SELECT dialog_members.member_type, dialog_members.member_id\n            FROM dialog_members\n            JOIN peers_search ON\n                peers_search MATCH 'title:", y, " OR domain:", y, "'\n                AND peers_search.member_type = dialog_members.member_type\n                AND peers_search.member_id = dialog_members.member_id\n            WHERE dialog_members.dialog_id = ");
            a2.append(j);
            a2.append("\n            ");
            a2.append(str2);
            a2.append("\n            ");
            Cursor d3 = this.a.b().d(a2.toString(), null);
            ArrayList arrayList = new ArrayList(d3.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (d3.moveToFirst()) {
                    while (!d3.isAfterLast()) {
                        Peer.Type.a aVar = Peer.Type.Companion;
                        int i2 = d3.getInt(0);
                        aVar.getClass();
                        Peer.Type a3 = Peer.Type.a.a(i2);
                        long j2 = d3.getLong(1);
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        Peer a4 = Peer.a.a(j2, a3);
                        if (a4 != null) {
                            arrayList.add(a4);
                        }
                        d3.moveToNext();
                    }
                }
                try {
                    d3.close();
                    Trace.endSection();
                    hashSet.addAll(arrayList);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
            }
        }
        return j5g.O0(hashSet);
    }

    @Override // xsna.czh0
    public final void s(Collection<Email> collection) {
        this.a.b().h(new c(this, collection));
    }
}
