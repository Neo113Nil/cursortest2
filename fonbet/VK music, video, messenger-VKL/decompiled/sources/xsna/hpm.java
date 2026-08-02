package xsna;

import android.database.Cursor;
import android.os.Trace;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DialogsEntryStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class hpm implements lnm, mtx0 {
    public final tgl0 b;
    public final dhl0<com.vk.im.engine.models.dialogs.b, Long> c;
    public final avm d;

    /* compiled from: DialogsEntryStorageManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgRequestStatus.values().length];
            try {
                iArr[MsgRequestStatus.ACCEPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DialogsEntryStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.im.engine.models.dialogs.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.im.engine.models.dialogs.b bVar) {
            hpm.g((hpm) this.receiver, bVar);
            return s3q0.a;
        }
    }

    /* compiled from: DialogsEntryStorageManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.im.engine.models.dialogs.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.im.engine.models.dialogs.b bVar) {
            hpm.i((hpm) this.receiver, bVar);
            return s3q0.a;
        }
    }

    /* compiled from: DialogsEntryStorageManagerImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<com.vk.im.engine.models.dialogs.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.im.engine.models.dialogs.b bVar) {
            hpm.g((hpm) this.receiver, bVar);
            return s3q0.a;
        }
    }

    /* compiled from: DialogsEntryStorageManagerImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<com.vk.im.engine.models.dialogs.b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.im.engine.models.dialogs.b bVar) {
            hpm.h((hpm) this.receiver, bVar);
            return s3q0.a;
        }
    }

    public hpm(tgl0 tgl0Var) {
        this.b = tgl0Var;
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = new dhl0<>(100, tgl0Var.c(com.vk.im.engine.models.dialogs.b.class), new x50(13), new mbe(1, this, hpm.class, "getFromDb", "getFromDb(Ljava/util/Collection;I)Ljava/util/Map;", 0, 2), new nbe(1, this, hpm.class, "putToDb", "putToDb(Ljava/util/Collection;I)V", 0, 1), tgl0Var.I0());
        this.c = dhl0Var;
        this.d = new avm(tgl0Var, dhl0Var);
    }

    public static DialogMember L(Cursor cursor) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Type.a aVar = Peer.Type.Companion;
        int A = fl3.A(cursor, "member_type");
        aVar.getClass();
        return new DialogMember(Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A)), Peer.a.a(fl3.C(cursor, "invited_by_id"), Peer.Type.a.a(fl3.A(cursor, "invited_by_type"))), fl3.C(cursor, "join_date"), fl3.x(cursor, "is_request"), fl3.B(cursor, "incognito_id"), fl3.F(cursor, "incognito_name"), fl3.x(cursor, "is_admin"), fl3.x(cursor, "can_kick"), fl3.x(cursor, "is_restricted_to_write"));
    }

    public static void d0(e0w e0wVar, long j, int i) {
        StringBuilder a2 = eq0.a(i, "\n            DELETE FROM dialog_members\n            WHERE dialog_id = ", " AND incognito_id = ", j);
        a2.append("\n            ");
        e0wVar.execSQL(a2.toString());
    }

    public static final void g(hpm hpmVar, com.vk.im.engine.models.dialogs.b bVar) {
        byte[] g;
        hpmVar.getClass();
        if (bVar.L.isEmpty()) {
            g = null;
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            g = Serializer.b.g(bVar.L);
        }
        hpmVar.b.b().execSQL("UPDATE dialogs SET expire_msg_cnv_ids = ? WHERE id = ?", new Serializable[]{g, Long.valueOf(bVar.b)});
    }

    public static final void h(hpm hpmVar, com.vk.im.engine.models.dialogs.b bVar) {
        hpmVar.getClass();
        hpmVar.b.b().execSQL("UPDATE dialogs SET locally_read_reactions = ? WHERE id = ?", new Object[]{kvf.a(bVar.V), Long.valueOf(bVar.b)});
    }

    public static final void i(hpm hpmVar, com.vk.im.engine.models.dialogs.b bVar) {
        byte[] g;
        hpmVar.getClass();
        if (bVar.J.isEmpty()) {
            g = null;
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            g = Serializer.b.g(bVar.J);
        }
        hpmVar.b.b().execSQL("UPDATE dialogs SET unread_mention_msg_cnv_ids = ? WHERE id = ?", new Serializable[]{g, Long.valueOf(bVar.b)});
    }

    public static long i0(boolean z) {
        return z ? 1L : 0L;
    }

    public final void A(final int i, final int i2, final long j) {
        this.c.a(Long.valueOf(j), new izs() { // from class: xsna.tom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, i, i2, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -1537, 2097151);
            }
        }, new izs() { // from class: xsna.uom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                hpm.this.b.b().execSQL("UPDATE dialogs SET read_till_in_msg_cnv_id_local = ?, count_unread_local = ? WHERE id = ?", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    public final void B(long j, vjm vjmVar) {
        int i = 9;
        this.c.a(Long.valueOf(j), new igh(vjmVar, i), new dwg(this, i));
    }

    public final void C(int i, long j) {
        this.c.a(Long.valueOf(j), new gp1(i, 1), new yve(this, 13));
    }

    public final void D(final long j, final gkx0 gkx0Var, final int i) {
        if (i != -1) {
            this.b.b().c(new izs() { // from class: xsna.hom
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    this.b.b().execSQL("UPDATE dialog_weight SET x_weight = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(gkx0.this.b), Long.valueOf(j), Integer.valueOf(i)});
                    return s3q0.a;
                }
            });
            return;
        }
        this.c.a(Long.valueOf(j), new s6k(gkx0Var, 4), new gom(j, this, gkx0Var, 0));
    }

    public final void E(long j, Peer peer, boolean z) {
        StringBuilder sb = new StringBuilder("\n            UPDATE dialog_members\n            SET is_restricted_to_write = ");
        sb.append(i0(z));
        sb.append("\n            WHERE dialog_id = ");
        sb.append(j);
        sb.append(" AND member_type = ");
        sb.append(peer.c.h());
        sb.append(" AND member_id = ");
        this.b.b().execSQL(efz.b(peer.d, "\n            ", sb));
    }

    public final void F(int i, long j) {
        this.c.a(Long.valueOf(j), new da6(i, 2), new d(1, this, hpm.class, "updateExpireCnvMsg", "updateExpireCnvMsg(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0));
    }

    public final List G(UserId userId, long j, int i) {
        avm avmVar = this.d;
        avmVar.getClass();
        StringBuilder sb = new StringBuilder("\n            SELECT dialog_id \n            FROM dialog_pinned_msg_attaches \n            WHERE \n                content_type = ");
        sb.append(i);
        sb.append(" AND \n                content_id = ");
        sb.append(j);
        sb.append(" AND \n                content_owner_id = ");
        Cursor d2 = avmVar.b.b().d(efz.b(userId.b, "\n            ", sb), null);
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
                return arrayList;
            } finally {
                d2.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Collection H(UserId userId, Collection collection) {
        Result.Failure failure;
        Map map;
        tgl0 tgl0Var = this.d.b;
        if (collection.isEmpty()) {
            map = jgp.b;
        } else {
            String a2 = zr.a("\n            SELECT *\n            FROM dialogs\n            WHERE id IN(\n                SELECT dialog_id\n                FROM dialog_pinned_msg_attaches\n                WHERE content_type IN(", j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62), ")\n                ) \n                AND pinned_msg_exists = 1\n            ");
            try {
                Cursor m = tgl0Var.b().m(a2, null);
                HashMap hashMap = new HashMap(m.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (m.moveToFirst()) {
                            while (!m.isAfterLast()) {
                                hashMap.put(Long.valueOf(fl3.C(m, "id")), icm.c(m));
                                m.moveToNext();
                            }
                        }
                    } finally {
                        m.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a3 = Result.a(failure);
            Result.Failure failure2 = failure;
            if (a3 != null) {
                try {
                    a3.getMessage();
                    Cursor n = tgl0Var.b().n(a2, null);
                    HashMap hashMap2 = new HashMap(n.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    try {
                        try {
                            if (n.moveToFirst()) {
                                while (!n.isAfterLast()) {
                                    hashMap2.put(Long.valueOf(fl3.C(n, "id")), icm.c(n));
                                    n.moveToNext();
                                }
                            }
                        } finally {
                        }
                    } finally {
                        n.close();
                    }
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
            }
            Throwable a4 = Result.a(failure2);
            if (a4 != null) {
                L.e(a4, "rawQueryWithPossibleLargeData");
            }
            kotlin.a.a(failure2);
            map = (Map) failure2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            PinnedMsg pinnedMsg = (PinnedMsg) entry.getValue();
            owv owvVar = new owv(userId, 0);
            pinnedMsg.getClass();
            if (com.vk.im.engine.models.messages.a.Q7(pinnedMsg, owvVar, true) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            PinnedMsg pinnedMsg2 = (PinnedMsg) entry2.getValue();
            owv owvVar2 = new owv(userId, 0);
            pinnedMsg2.getClass();
            if (com.vk.im.engine.models.messages.a.Q7(pinnedMsg2, owvVar2, true) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return j5g.O0(linkedHashMap2.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<Long, PinnedMsg> I(Class<? extends Attach> cls, UserId userId, Long l) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor n;
        HashMap hashMap;
        avm avmVar = this.d;
        avmVar.getClass();
        int b2 = j14.b(cls);
        tgl0 tgl0Var = avmVar.b;
        StringBuilder sb = new StringBuilder("\n            SELECT *\n            FROM dialogs\n            WHERE id IN(\n                SELECT dialog_id\n                FROM dialog_pinned_msg_attaches\n                WHERE content_type = ");
        sb.append(b2);
        String a2 = defpackage.k0.a(l.longValue(), " AND content_id = ");
        if (a2 == null) {
            a2 = "";
        }
        sb.append(a2);
        sb.append(" AND content_owner_id = ");
        String b3 = efz.b(userId.b, ")\n            ", sb);
        try {
            Cursor m = tgl0Var.b().m(b3, null);
            HashMap hashMap2 = new HashMap(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            hashMap2.put(Long.valueOf(fl3.C(m, "id")), icm.c(m));
                            m.moveToNext();
                        }
                    }
                } finally {
                    m.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a3 = Result.a(failure);
        Object obj = failure;
        if (a3 != null) {
            try {
                a3.getMessage();
                n = tgl0Var.b().n(b3, null);
                hashMap = new HashMap(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            try {
                try {
                    if (n.moveToFirst()) {
                        while (!n.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(n, "id")), icm.c(n));
                            n.moveToNext();
                        }
                    }
                    obj = failure2;
                } finally {
                }
            } finally {
                n.close();
            }
        }
        Throwable a4 = Result.a(obj);
        if (a4 != null) {
            L.e(a4, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(obj);
        return (Map) obj;
    }

    public final Map J(int i, Collection collection) {
        return collection.isEmpty() ? jgp.b : i == -1 ? this.c.e(collection) : M(i, collection);
    }

    public final Set<Long> K(Collection<Long> collection) {
        Cursor d2 = this.b.b().d(go9.b("SELECT id FROM dialogs WHERE is_dead = 1 ", !collection.isEmpty() ? air.b(')', "AND id IN (", p4g.k(collection, StringUtils.COMMA, null)) : ""), null);
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
                return j5g.S0(arrayList);
            } finally {
                d2.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map M(int i, Collection collection) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        HashMap hashMap;
        tgl0 tgl0Var = this.b;
        if (collection.isEmpty()) {
            return jgp.b;
        }
        String k = p4g.k(collection, StringUtils.COMMA, null);
        StringBuilder sb = new StringBuilder("SELECT ");
        nyh0.a(i, (String) icm.a.getValue(), " FROM dialogs INNER JOIN dialog_weight ON dialogs.id = dialog_weight.x_dialog_id WHERE x_folder_id = ", " AND id IN (", sb);
        String a2 = ho8.a(sb, k, ')');
        try {
            m = tgl0Var.b().m(a2, null);
            hashMap = new HashMap(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        hashMap.put(Long.valueOf(fl3.C(m, "id")), icm.a(m));
                        m.moveToNext();
                    }
                }
                Throwable a3 = Result.a(failure);
                Object obj = failure;
                if (a3 != null) {
                    try {
                        a3.getMessage();
                        Cursor n = tgl0Var.b().n(a2, null);
                        HashMap hashMap2 = new HashMap(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        hashMap2.put(Long.valueOf(fl3.C(n, "id")), icm.a(n));
                                        n.moveToNext();
                                    }
                                }
                            } finally {
                            }
                        } finally {
                            n.close();
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
                return (Map) obj;
            } finally {
                m.close();
            }
        } finally {
        }
    }

    public final Boolean N(long j) {
        return fl3.I(this.b.b().d(defpackage.k0.a(j, "SELECT is_diff_dirty FROM dialog_members_meta WHERE dialog_id = "), null));
    }

    public final Long O(long j) {
        return fl3.K(this.b.b().d(defpackage.k0.a(j, "SELECT last_update_pts FROM dialog_members_meta WHERE dialog_id = "), null));
    }

    public final Integer P(long j) {
        return fl3.J(this.b.b().d(defpackage.k0.a(j, "SELECT phase_id FROM dialog_members_meta WHERE dialog_id = "), null));
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    public final String R(long j) {
        return fl3.j(this.b.b().d(defpackage.k0.a(j, "SELECT pagination_anchor FROM dialog_members_meta WHERE dialog_id = "), null));
    }

    public final Integer S(long j) {
        return fl3.J(this.b.b().d("SELECT phase_id FROM dialogs WHERE id = ?", new String[]{String.valueOf(j)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SparseArray<com.vk.im.engine.models.dialogs.b> T() {
        Result.Failure failure;
        tgl0 tgl0Var = this.b;
        StringBuilder sb = new StringBuilder("x_sort_id_local IS NOT NULL AND ((x_sort_id_local & ");
        long j = vjm.k;
        String b2 = efz.b(j, ") > 0)", sb);
        String a2 = qlb0.a(j, "((x_sort_id_server & ", ") > 0) AND x_sort_id_local IS NULL");
        StringBuilder sb2 = new StringBuilder("SELECT ");
        n6j.b(sb2, (String) icm.a.getValue(), " FROM dialogs INNER JOIN dialog_weight ON dialogs.id = dialog_weight.x_dialog_id WHERE x_folder_id = -1 AND ", b2, " OR ");
        sb2.append(a2);
        String sb3 = sb2.toString();
        try {
            Cursor m = tgl0Var.b().m(sb3, null);
            SparseArray sparseArray = new SparseArray(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            sparseArray.put(fl3.A(m, "id"), icm.a(m));
                            m.moveToNext();
                        }
                    }
                } finally {
                    m.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a3 = Result.a(failure);
        Object failure2 = failure;
        if (a3 != null) {
            try {
                a3.getMessage();
                Cursor n = tgl0Var.b().n(sb3, null);
                SparseArray sparseArray2 = new SparseArray(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (n.moveToFirst()) {
                            while (!n.isAfterLast()) {
                                sparseArray2.put(fl3.A(n, "id"), icm.a(n));
                                n.moveToNext();
                            }
                        }
                        failure2 = sparseArray2;
                    } finally {
                        n.close();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
        }
        Throwable a4 = Result.a(failure2);
        if (a4 != null) {
            L.e(a4, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(failure2);
        return (SparseArray) failure2;
    }

    public final boolean U() {
        Boolean I = fl3.I(this.b.b().d("SELECT COUNT(1) FROM dialogs  WHERE type = 1 AND last_msg_cnv_id != 0", null));
        if (I != null) {
            return I.booleanValue();
        }
        return false;
    }

    public final boolean V(long j) {
        com.vk.im.engine.models.dialogs.b c2 = c(j);
        return (c2 != null ? c2.I : null) != null;
    }

    public final void W(final int i, final long j) {
        this.c.a(Long.valueOf(j), new onm(i, 0), new izs() { // from class: xsna.pnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                StringBuilder b2 = jr.b(i, "\n            UPDATE dialogs\n            SET chat_settings_members_count = chat_settings_members_count + ", "\n            WHERE id = ", j);
                b2.append(" AND chat_settings_exists = 1");
                this.b.b().execSQL(b2.toString());
                return s3q0.a;
            }
        });
    }

    public final boolean X(int i, long j) {
        PinnedMsg pinnedMsg;
        com.vk.im.engine.models.dialogs.b d2 = this.d.c.d(Long.valueOf(j));
        return (d2 == null || (pinnedMsg = d2.t) == null || pinnedMsg.c != i) ? false : true;
    }

    public final void Y(int i, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        if (i == -1) {
            this.c.f(collection);
        } else {
            c0(i, collection);
        }
    }

    public final void Z(com.vk.im.engine.models.dialogs.b bVar) {
        Y(-1, Collections.singletonList(bVar));
    }

    public final void a0(long j, Long l) {
        this.b.b().execSQL("\n            UPDATE dialog_members_meta\n            SET last_update_pts = " + l + "\n            WHERE dialog_id = " + j + "\n            ");
    }

    @Override // xsna.lnm
    public final void b(Map<Long, PinnedMsg> map) {
        avm avmVar = this.d;
        avmVar.getClass();
        if (map.isEmpty()) {
            return;
        }
        avmVar.b.b().h(new wqb(6, map, avmVar));
    }

    public final void b0(final int i, final long j) {
        this.b.b().h(new izs() { // from class: xsna.jom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String b2;
                e0w e0wVar = (e0w) obj;
                int i2 = i;
                long j2 = j;
                StringBuilder a2 = eq0.a(i2, "\n                REPLACE INTO dialog_members_meta (dialog_id, phase_id, last_update_pts, is_diff_dirty, pagination_anchor)\n                VALUES(", ", ", j2);
                a2.append(", ");
                hpm hpmVar = this;
                a2.append(hpmVar.O(j2));
                a2.append(", ");
                Boolean N = hpmVar.N(j2);
                String str = "NULL";
                a2.append(N != null ? N.booleanValue() ? "1" : "0" : "NULL");
                a2.append(", ");
                String R = hpmVar.R(j2);
                if (R != null && (b2 = air.b('\'', "'", R)) != null) {
                    str = b2;
                }
                a2.append(str);
                a2.append(")\n                ");
                e0wVar.j(a2.toString());
                return s3q0.a;
            }
        });
    }

    @Override // xsna.lnm
    public final com.vk.im.engine.models.dialogs.b c(long j) {
        return (com.vk.im.engine.models.dialogs.b) J(-1, Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    public final void c0(int i, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((com.vk.im.engine.models.dialogs.b) it.next()).b));
        }
        this.b.b().h(new com.vk.im.engine.internal.storage.delegates.dialogs.a(i, 0, p4g.k(arrayList, StringUtils.COMMA, null), this, collection));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r14 != null) goto L13;
     */
    @Override // xsna.lnm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ohm d(long j, Collection<? extends Peer> collection, Integer num) {
        String str;
        String a2;
        String str2 = "";
        if (collection != null) {
            if (collection.isEmpty()) {
                collection = null;
            }
            if (collection != null) {
                str = ho8.a(new StringBuilder("AND (member_type, member_id) IN (VALUES "), j5g.g0(collection, null, null, null, 0, new qt0(23), 31), ')');
            }
        }
        str = "";
        if (num != null && (a2 = lhg.a(num.intValue(), "LIMIT ")) != null) {
            str2 = a2;
        }
        Cursor d2 = this.b.b().d("SELECT * FROM dialog_members WHERE dialog_id = " + j + ' ' + str + ' ' + str2, null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(L(d2));
                        d2.moveToNext();
                    }
                }
                Trace.endSection();
                return new ohm(arrayList);
            } finally {
                d2.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.lnm
    public final int e() {
        StringBuilder sb = new StringBuilder("x_sort_id_local IS NOT NULL AND ((x_sort_id_local & ");
        long j = vjm.k;
        Integer J = fl3.J(this.b.b().d(y57.a("SELECT COUNT(id) FROM dialogs INNER JOIN dialog_weight ON dialogs.id = dialog_weight.x_dialog_id WHERE x_folder_id = -1 AND ", efz.b(j, ") > 0)", sb), " OR ", qlb0.a(j, "((x_sort_id_server & ", ") > 0) AND x_sort_id_local IS NULL")), null));
        if (J != null) {
            return J.intValue();
        }
        return 0;
    }

    public final void e0(long j) {
        this.b.b().execSQL(defpackage.k0.a(j, "DELETE FROM dialog_members WHERE dialog_id = "));
    }

    @Override // xsna.lnm
    public final void f(final int i, long j) {
        this.c.a(Long.valueOf(j), new izs() { // from class: xsna.ynm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar.e;
                if (vjmVar == null) {
                    vjmVar = bVar.d;
                }
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, vjm.e(vjmVar, 0, 0, 3).j(i), null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -9, 2097151);
            }
        }, new srg(this, 9));
    }

    public final void f0(long j, Collection<? extends Peer> collection) {
        this.b.b().h(new fom(collection, j, 0));
    }

    public final void g0(long j) {
        this.b.b().h(new kd3(j, 1));
    }

    public final void h0(long j, boolean z) {
        this.c.a(Long.valueOf(j), new kom(z, 0), new lom(this, z, 0));
    }

    public final void j(long j, List<Integer> list) {
        this.c.a(Long.valueOf(j), new pwk(list, 2), new b(1, this, hpm.class, "updateExpireCnvMsg", "updateExpireCnvMsg(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0));
    }

    public final void j0(long j, List<Integer> list) {
        this.c.a(Long.valueOf(j), new uoh(list, 7), new e(1, this, hpm.class, "updateLocallyReadReactions", "updateLocallyReadReactions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0));
    }

    public final void k(long j, DialogMember dialogMember) {
        l(j, new ohm(dialogMember));
    }

    public final void k0(final long j, final DraftMsg draftMsg) {
        this.c.a(Long.valueOf(j), new t3h(draftMsg, 7), new izs() { // from class: xsna.tnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                byte[] e2 = Serializer.b.e(DraftMsg.this);
                SQLiteStatement compileStatement = this.b.b().compileStatement("UPDATE dialogs SET draft_msg = ? WHERE id = ?");
                compileStatement.bindBlob(1, e2);
                compileStatement.bindLong(2, j);
                compileStatement.executeUpdateDelete();
                compileStatement.close();
                return s3q0.a;
            }
        });
    }

    public final void l(long j, ohm ohmVar) {
        this.b.b().h(new pom(j, ohmVar, this));
    }

    public final void l0(final long j, final BotKeyboard botKeyboard) {
        this.c.a(Long.valueOf(j), new gmj(botKeyboard, 3), new izs() { // from class: xsna.wnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2 = j;
                SQLiteStatement compileStatement = hpm.this.b.b().compileStatement("\n            UPDATE dialogs\n            SET\n                keyboard_exists = ?,\n                keyboard_author_type = ?, keyboard_author_id = ?, keyboard_one_time = ?,\n                keyboard_column_count = ?, keyboard_buttons = ?\n            WHERE id = ?\n            ");
                BotKeyboard botKeyboard2 = botKeyboard;
                try {
                    if (botKeyboard2 == null) {
                        compileStatement.bindLong(1, 0L);
                        for (int i = 2; i < 7; i++) {
                            compileStatement.bindNull(i);
                        }
                    } else {
                        Peer peer = botKeyboard2.b;
                        rdi.i(compileStatement, 1, true);
                        compileStatement.bindLong(2, peer.c.h());
                        compileStatement.bindLong(3, peer.d);
                        rdi.i(compileStatement, 4, botKeyboard2.c);
                        compileStatement.bindLong(5, botKeyboard2.e);
                        compileStatement.bindBlob(6, apm0.b(botKeyboard2.f));
                    }
                    compileStatement.bindLong(7, j2);
                    compileStatement.executeUpdateDelete();
                    compileStatement.close();
                    return s3q0.a;
                } finally {
                }
            }
        });
    }

    public final void m(long j, List<Integer> list) {
        this.c.a(Long.valueOf(j), new fgh(list, 7), new c(1, this, hpm.class, "updateUnreadCnvMentions", "updateUnreadCnvMentions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0));
    }

    public final void m0(final long j, final boolean z) {
        this.c.a(Long.valueOf(j), new izs() { // from class: xsna.oom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, z, null, null, null, null, 0, false, false, null, null, 0, null, 0, -536870913, 2097151);
            }
        }, new izs() { // from class: xsna.som
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE dialogs SET keyboard_visible = ? WHERE id = ?", new Long[]{Long.valueOf(hpm.i0(z)), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    public final void n(final int i, final long j) {
        this.c.a(Long.valueOf(j), new mnm(i, 1), new izs() { // from class: xsna.apm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE dialogs SET count_unread = ? WHERE id = ?", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    public final void o(long j, WritePermission writePermission) {
        this.c.a(Long.valueOf(j), new bhh(writePermission, 9), new defpackage.b0(15, this, writePermission));
    }

    public final void p(final long j, final boolean z) {
        this.c.a(Long.valueOf(j), new aom(z, 0), new izs() { // from class: xsna.bom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE dialogs SET bar_hidden_locally = ? WHERE id = ?", new Long[]{Long.valueOf(hpm.i0(z)), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    public final void q(long j, Boolean bool) {
        this.c.a(Long.valueOf(j), new nfj(bool, 9), new com.vk.movika.sdk.base.ui.t0(j, bool, this, 1));
    }

    public final void r(long j, Peer peer, boolean z) {
        StringBuilder sb = new StringBuilder("\n            UPDATE dialog_members\n            SET is_admin = ");
        sb.append(i0(z));
        sb.append("\n            WHERE dialog_id = ");
        sb.append(j);
        sb.append(" AND member_type = ");
        sb.append(peer.c.h());
        sb.append(" AND member_id = ");
        this.b.b().execSQL(efz.b(peer.d, "\n            ", sb));
    }

    public final void s(long j, MsgRequestStatus msgRequestStatus) {
        this.c.b(Collections.singletonList(Long.valueOf(j)), new t1e(msgRequestStatus, 14), new m4g(this, 12));
    }

    public final void t(long j) {
        u(Collections.singletonList(Long.valueOf(j)), null);
    }

    public final void u(Collection<Long> collection, MsgRequestStatus msgRequestStatus) {
        this.c.b(collection, new k0j(msgRequestStatus, 7), new mmf(this, 19));
    }

    public final void v(final int i, final long j) {
        this.c.a(Long.valueOf(j), new eh4(i, 1), new izs() { // from class: xsna.xnm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE dialogs SET phase_id = " + i + " WHERE id = " + j);
                return s3q0.a;
            }
        });
    }

    public final void w(final long j, final PinnedMsg pinnedMsg, final boolean z) {
        final avm avmVar = this.d;
        avmVar.getClass();
        avmVar.b.b().h(new izs() { // from class: xsna.wum
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                avm avmVar2 = avm.this;
                long j2 = j;
                avmVar2.d(j2, z);
                avmVar2.b(pinnedMsg, j2);
                return s3q0.a;
            }
        });
    }

    public final void x(PinnedMsg pinnedMsg, long j) {
        avm avmVar = this.d;
        avmVar.getClass();
        avmVar.b(pinnedMsg, j);
    }

    public final void y(final long j, final PushSettings pushSettings) {
        this.c.a(Long.valueOf(j), new jm0(pushSettings, 28), new izs() { // from class: xsna.iom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str;
                String l;
                PushSettings pushSettings2 = pushSettings;
                String str2 = "NULL";
                if (pushSettings2 == null || (str = Long.valueOf(hpm.i0(pushSettings2.b)).toString()) == null) {
                    str = "NULL";
                }
                if (pushSettings2 != null && (l = Long.valueOf(pushSettings2.c).toString()) != null) {
                    str2 = l;
                }
                hpm.this.b.b().execSQL(efz.b(j, "\n            ", xe9.a("\n            UPDATE dialogs\n            SET push_local_is_use_sound = ", str, ",\n                push_local_disabled_until = ", str2, "\n            WHERE id = ")));
                return s3q0.a;
            }
        });
    }

    public final void z(final long j, final PushSettings pushSettings) {
        this.c.a(Long.valueOf(j), new wze(pushSettings, 17), new izs() { // from class: xsna.rom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                e0w b2 = hpm.this.b.b();
                PushSettings pushSettings2 = pushSettings;
                b2.execSQL("\n            UPDATE dialogs\n            SET push_server_is_use_sound = ?,\n                push_server_disabled_until = ?\n            WHERE id = ?\n            ", new Long[]{Long.valueOf(hpm.i0(pushSettings2.b)), Long.valueOf(pushSettings2.c), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }
}
