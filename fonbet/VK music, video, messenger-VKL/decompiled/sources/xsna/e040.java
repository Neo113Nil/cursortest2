package xsna;

import android.database.Cursor;
import android.os.Trace;
import android.util.ArraySet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;

/* compiled from: MsgStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class e040 implements d040, zj30, jv30, fh30, m040, mtx0 {
    public final tgl0 b;
    public final ck30 c;
    public final kv30 d;
    public final rj01 e;
    public final n040 f;

    public e040(tgl0 tgl0Var) {
        ck30 ck30Var = new ck30(tgl0Var);
        kv30 kv30Var = new kv30(tgl0Var);
        rj01 rj01Var = new rj01(tgl0Var);
        n040 n040Var = new n040(tgl0Var);
        this.b = tgl0Var;
        this.c = ck30Var;
        this.d = kv30Var;
        this.e = rj01Var;
        this.f = n040Var;
    }

    public static ArrayList N0(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((MsgSyncState) it.next()).j()));
        }
        return arrayList;
    }

    public static long O0(boolean z) {
        return z ? 1L : 0L;
    }

    @Override // xsna.mf20
    public final lj30 A(Peer peer, gkx0 gkx0Var) {
        ck30 ck30Var = this.c;
        ck30Var.getClass();
        Cursor d = ck30Var.b.b().d(i5s.a(new StringBuilder("SELECT "), com.vk.im.engine.internal.storage.delegates.messages.a.b, " FROM messages WHERE dialog_id = ? AND weight = ?"), new String[]{String.valueOf(peer.b), String.valueOf(gkx0Var.b)});
        try {
            return d.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.a(d) : null;
        } finally {
            d.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d040
    public final SparseArray<Msg> A0(long j, long j2) {
        Result.Failure failure;
        Result.Failure failure2;
        tgl0 tgl0Var = this.b;
        String[] strArr = {String.valueOf(j2), String.valueOf(j)};
        try {
            Cursor m = tgl0Var.b().m("\n            SELECT * FROM messages INDEXED BY idx_messages_expirable WHERE \n            expire_ttl > 0 AND is_expired = 0 \n            AND time > ? AND dialog_id = ? \n            AND nested IS NOT NULL\n            ", strArr);
            SparseArray sparseArray = new SparseArray(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            sparseArray.put(fl3.A(m, "local_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
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
        Throwable a = Result.a(failure);
        Object obj = failure;
        if (a != null) {
            try {
                a.getMessage();
                Cursor n = tgl0Var.b().n("\n            SELECT * FROM messages INDEXED BY idx_messages_expirable WHERE \n            expire_ttl > 0 AND is_expired = 0 \n            AND time > ? AND dialog_id = ? \n            AND nested IS NOT NULL\n            ", strArr);
                SparseArray sparseArray2 = new SparseArray(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (n.moveToFirst()) {
                            while (!n.isAfterLast()) {
                                sparseArray2.put(fl3.A(n, "local_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
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
        Throwable a2 = Result.a(obj);
        if (a2 != null) {
            L.e(a2, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(obj);
        return (SparseArray) obj;
    }

    @Override // xsna.d040
    public final void B(int i) {
        this.b.b().execSQL("UPDATE messages SET phase_id = " + i + " WHERE cnv_msg_id = 0");
    }

    @Override // xsna.mf20
    public final void B0(int i, int i2, Peer peer) {
        this.b.b().h(new ux9("\n            SELECT local_id\n            FROM messages\n            WHERE dialog_id = " + peer.b + "\n                AND cnv_msg_id BETWEEN " + i + " AND " + i2 + "\n            ", 5));
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> C(Collection<Integer> collection) {
        return T(collection);
    }

    @Override // xsna.mf20
    public final uz50 C0(int i, Peer peer) {
        ck30 ck30Var = this.c;
        ck30Var.getClass();
        return ck30Var.e(i, peer.b);
    }

    @Override // xsna.jv30
    public final bux0 D(int i, long j) {
        return this.d.D(i, j);
    }

    @Override // xsna.mf20
    public final List<Msg> D0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, int i) {
        return f0(peer.b, gkx0Var, gkx0Var2, i);
    }

    @Override // xsna.fh30
    public final List E(int i, long j, Long l) {
        return this.e.E(i, j, l);
    }

    @Override // xsna.mf20
    public final void E0(int i, gkx0 gkx0Var) {
        this.b.b().execSQL("UPDATE messages SET weight_before = ? WHERE local_id = ?", new String[]{String.valueOf(gkx0Var.b), String.valueOf(i)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mf20
    public final SparseArray<Msg> F(Collection<Integer> collection, List<? extends MsgSyncState> list) {
        Result.Failure failure;
        Result.Failure failure2;
        tgl0 tgl0Var = this.b;
        if (collection.isEmpty() || list.isEmpty()) {
            return zik0.a;
        }
        String g0 = j5g.g0(N0(list), StringUtils.COMMA, null, null, 0, null, 62);
        String g02 = j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62);
        String a = list.contains(MsgSyncState.DONE) ? ss9.a("\n            SELECT *\n            FROM messages\n            WHERE sync_state IN(", g0, ") AND random_id IN(", g02, ")\n            ") : ss9.a("\n            SELECT *\n            FROM messages INDEXED BY idx_messages_sync_state\n            WHERE sync_state > 0 AND sync_state IN(", g0, ") AND random_id IN(", g02, ")\n            ");
        try {
            Cursor m = tgl0Var.b().m(a, null);
            SparseArray sparseArray = new SparseArray(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            sparseArray.put(fl3.A(m, "random_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
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
        Throwable a2 = Result.a(failure);
        Object obj = failure;
        if (a2 != null) {
            try {
                a2.getMessage();
                Cursor n = tgl0Var.b().n(a, null);
                SparseArray sparseArray2 = new SparseArray(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (n.moveToFirst()) {
                            while (!n.isAfterLast()) {
                                sparseArray2.put(fl3.A(n, "random_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
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
        Throwable a3 = Result.a(obj);
        if (a3 != null) {
            L.e(a3, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(obj);
        return (SparseArray) obj;
    }

    @Override // xsna.mf20
    public final void F0(int i, gkx0 gkx0Var) {
        this.b.b().execSQL("UPDATE messages SET weight_after = ? WHERE local_id = ?", new String[]{String.valueOf(gkx0Var.b), String.valueOf(i)});
    }

    @Override // xsna.zj30
    public final lj30 G0(long j) {
        return this.c.G0(j);
    }

    @Override // xsna.d040
    public final void H(long j, gkx0 gkx0Var, gkx0 gkx0Var2, MsgSyncState msgSyncState) {
        StringBuilder b = fp.b(j, "\n            SELECT local_id\n            FROM messages\n            WHERE dialog_id = ", "\n                AND weight BETWEEN ");
        b.append(gkx0Var.b);
        b.append(" AND ");
        b.append(gkx0Var2.b);
        b.append("\n                AND sync_state <> ");
        b.append(msgSyncState.j());
        b.append("\n            ");
        this.b.b().h(new ux9(b.toString(), 5));
    }

    @Override // xsna.mf20
    public final void H0(List<? extends Msg> list) {
        a(list);
    }

    @Override // xsna.jv30
    public final void I(long j, int i, Integer num, ArrayList arrayList) {
        this.d.I(j, i, num, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d040
    public final SparseArray<Msg> I0(long j, Collection<Integer> collection) {
        Result.Failure failure;
        Result.Failure failure2;
        tgl0 tgl0Var = this.b;
        if (collection.isEmpty()) {
            return zik0.a;
        }
        String str = "SELECT * FROM messages WHERE cnv_msg_id IN(" + p4g.k(collection, StringUtils.COMMA, null) + ") AND dialog_id = " + j;
        try {
            Cursor m = tgl0Var.b().m(str, null);
            SparseArray sparseArray = new SparseArray(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            sparseArray.put(fl3.A(m, "cnv_msg_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
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
        Throwable a = Result.a(failure);
        Object obj = failure;
        if (a != null) {
            try {
                a.getMessage();
                Cursor n = tgl0Var.b().n(str, null);
                SparseArray sparseArray2 = new SparseArray(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (n.moveToFirst()) {
                            while (!n.isAfterLast()) {
                                sparseArray2.put(fl3.A(n, "cnv_msg_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
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
        Throwable a2 = Result.a(obj);
        if (a2 != null) {
            L.e(a2, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(obj);
        return (SparseArray) obj;
    }

    @Override // xsna.mf20
    public final gkx0 J(int i) {
        return M0(i).get(i);
    }

    @Override // xsna.mf20
    public final void J0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, Integer num) {
        StringBuilder b = fp.b(0L, "\n                UPDATE messages\n                SET \n                has_space_before = ", ", \n                has_space_after = ");
        b.append(0L);
        b.append("\n                WHERE dialog_id = ");
        long j = peer.b;
        b.append(j);
        b.append(" \n                AND weight\n                BETWEEN ");
        b.append(gkx0Var.b);
        b.append(" AND ");
        b.append(gkx0Var2.b);
        b.append(" \n                ");
        String str = "AND local_id IN (SELECT local_id FROM messages WHERE dialog_id = " + j + " AND cnv_msg_id = " + ((Object) 0) + ')';
        if (str == null) {
            str = "";
        }
        b.append(str);
        b.append("\n            ");
        this.b.b().execSQL(xqm0.g(b.toString()));
    }

    @Override // xsna.m040
    public final void K(MsgTemplate msgTemplate) {
        this.f.K(msgTemplate);
    }

    @Override // xsna.fh30
    public final void K0(int i, long j, boolean z) {
        this.e.K0(i, j, z);
    }

    @Override // xsna.mf20
    public final Msg L(int i) {
        return L0(i);
    }

    public final Msg L0(int i) {
        Object failure;
        tgl0 tgl0Var = this.b;
        String[] strArr = {String.valueOf(i)};
        try {
            Cursor m = tgl0Var.b().m("SELECT * FROM messages WHERE local_id = ?", strArr);
            try {
                failure = m.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(m) : null;
                m.close();
            } catch (Throwable th) {
                m.close();
                throw th;
            }
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            try {
                a.getMessage();
                Cursor n = tgl0Var.b().n("SELECT * FROM messages WHERE local_id = ?", strArr);
                try {
                    Msg b = n.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(n) : null;
                    n.close();
                    failure = b;
                } catch (Throwable th3) {
                    n.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                failure = new Result.Failure(th4);
            }
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.e(a2, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(failure);
        return (Msg) failure;
    }

    @Override // xsna.d040
    public final boolean M(int i, int i2, int i3, long j) {
        if (i > i2) {
            return false;
        }
        return fl3.J(this.b.b().d("\n            SELECT COUNT(1)\n            FROM messages\n            WHERE dialog_id = ?\n                AND cnv_msg_id BETWEEN ? AND ?\n                AND (has_space_before = 1 OR has_space_after = 1 OR phase_id != ?)\n            ", new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(i2), String.valueOf(i3)})).intValue() > 0;
    }

    public final SparseArray<gkx0> M0(int i) {
        Cursor d = this.b.b().d("SELECT local_id, weight FROM messages WHERE local_id = ?", new String[]{String.valueOf(i)});
        SparseArray<gkx0> sparseArray = new SparseArray<>(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseArray.put(d.getInt(0), new gkx0(d.getLong(1)));
                        d.moveToNext();
                    }
                }
                return sparseArray;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.fh30
    public final ArrayList N(long j, int i, int i2, Long l) {
        return this.e.N(j, i, i2, l);
    }

    @Override // xsna.fh30
    public final List O(long j) {
        return this.e.O(j);
    }

    @Override // xsna.m040
    public final void P(int i) {
        this.f.P(i);
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.Q();
    }

    @Override // xsna.zj30
    public final Map<Long, lj30> R(Collection<Long> collection) {
        return this.c.R(collection);
    }

    @Override // xsna.d040
    public final int S(int i, long j) {
        return fl3.J(this.b.b().d("\n            SELECT COUNT(CASE WHEN is_incoming = 1 THEN 1 END)\n            FROM messages\n            WHERE dialog_id = ? AND cnv_msg_id > ?\n            ", new String[]{String.valueOf(j), String.valueOf(i)})).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mf20
    public final SparseArray<Msg> T(Collection<Integer> collection) {
        Result.Failure failure;
        int size = collection.size();
        if (size == 0) {
            return zik0.a;
        }
        if (size == 1) {
            SparseArray<Msg> sparseArray = new SparseArray<>(1);
            int intValue = ((Number) j5g.X(collection)).intValue();
            Msg L0 = L0(intValue);
            if (L0 != null) {
                sparseArray.put(intValue, L0);
            }
            return sparseArray;
        }
        tgl0 tgl0Var = this.b;
        String str = "SELECT * FROM messages WHERE local_id IN(" + p4g.k(collection, StringUtils.COMMA, null) + ')';
        try {
            Cursor m = tgl0Var.b().m(str, null);
            SparseArray sparseArray2 = new SparseArray(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            sparseArray2.put(fl3.A(m, "local_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
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
        Throwable a = Result.a(failure);
        Object failure2 = failure;
        if (a != null) {
            try {
                a.getMessage();
                Cursor n = tgl0Var.b().n(str, null);
                SparseArray sparseArray3 = new SparseArray(n.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (n.moveToFirst()) {
                            while (!n.isAfterLast()) {
                                sparseArray3.put(fl3.A(n, "local_id"), com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                n.moveToNext();
                            }
                        }
                        failure2 = sparseArray3;
                    } finally {
                        n.close();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
        }
        Throwable a2 = Result.a(failure2);
        if (a2 != null) {
            L.e(a2, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(failure2);
        return (SparseArray) failure2;
    }

    @Override // xsna.fh30
    public final Collection U(long j, long j2, long j3) {
        return this.e.U(j, j2, j3);
    }

    @Override // xsna.d040
    public final void W(Collection<? extends Msg> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Collection<? extends Msg> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Msg) it.next()).b));
        }
        this.b.b().h(new com.vk.video.ui.discovery.minimizable.related_videos.j(this, arrayList, collection, 5));
    }

    @Override // xsna.mf20
    public final void X(int i, boolean z) {
        this.b.b().execSQL("UPDATE messages SET has_space_before = ? WHERE local_id = ?", new String[]{String.valueOf(O0(z)), String.valueOf(i)});
    }

    @Override // xsna.fh30
    public final List<Msg> Y(Class<? extends Attach> cls, UserId userId, Long l) {
        return this.e.Y(cls, userId, l);
    }

    @Override // xsna.fh30
    public final ArraySet Z(UserId userId, Collection collection) {
        return this.e.Z(userId, collection);
    }

    @Override // xsna.d040
    public final void a(Collection<? extends Msg> collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.b.b().h(new com.vk.im.engine.internal.storage.delegates.messages.b(collection, 0));
    }

    @Override // xsna.d040
    public final Integer a0(int i, long j) {
        return fl3.J(this.b.b().d("SELECT local_id FROM messages WHERE dialog_id = " + j + " AND cnv_msg_id = " + i, null));
    }

    @Override // xsna.fh30
    public final Attach b(int i) {
        return this.e.b(i);
    }

    @Override // xsna.d040
    public final SparseArray<MsgSyncState> b0(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return new SparseArray<>(0);
        }
        Cursor d = this.b.b().d(air.b(')', "SELECT local_id, sync_state FROM messages WHERE local_id IN(", p4g.k(collection, StringUtils.COMMA, null)), null);
        SparseArray<MsgSyncState> sparseArray = new SparseArray<>(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        int A = fl3.A(d, "local_id");
                        MsgSyncState.a aVar = MsgSyncState.Companion;
                        int A2 = fl3.A(d, "sync_state");
                        aVar.getClass();
                        sparseArray.put(A, MsgSyncState.a.a(A2));
                        d.moveToNext();
                    }
                }
                return sparseArray;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.d040
    public final Integer c(long j) {
        return fl3.J(this.b.b().d(qlb0.a(j, "SELECT cnv_msg_id FROM messages WHERE dialog_id = ", " ORDER BY cnv_msg_id DESC LIMIT 1"), null));
    }

    @Override // xsna.jv30
    public final void c0(int i, long j, List list) {
        this.d.c0(i, j, list);
    }

    @Override // xsna.jv30
    public final void d(long j, int i, Integer num) {
        this.d.d(j, i, num);
    }

    @Override // xsna.d040
    public final Map d0(ArrayList arrayList, Collection collection, long j, int i) {
        if (arrayList.isEmpty() || collection.isEmpty()) {
            return jgp.b;
        }
        String g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
        String b = efz.b(j, "\n            ORDER BY time ASC\n            ", xe9.a(collection.contains(MsgSyncState.DONE) ? "\n            SELECT dialog_id, weight\n            FROM messages\n            WHERE sync_state IN(" : "\n            SELECT dialog_id, weight\n            FROM messages INDEXED BY idx_messages_sync_state\n            WHERE sync_state > 0 AND sync_state IN(", j5g.g0(N0(collection), StringUtils.COMMA, null, null, 0, null, 62), ") AND dialog_id IN(", g0, ") AND time >= "));
        tgl0 tgl0Var = this.b;
        Cursor d = tgl0Var.b().d(b, null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(d.getLong(0)), new gkx0(d.getLong(1)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    linkedHashMap.put(Long.valueOf(longValue), Boolean.valueOf(fl3.J(tgl0Var.b().d("SELECT COUNT(1) FROM messages WHERE dialog_id = ? AND weight BETWEEN ? AND ?", new String[]{String.valueOf(longValue), String.valueOf(((gkx0) entry.getValue()).b), String.valueOf(Long.MAX_VALUE)})).intValue() <= i));
                }
                return linkedHashMap;
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.zj30
    public final uz50 e(int i, long j) {
        return this.c.e(i, j);
    }

    @Override // xsna.fh30
    public final Integer e0(int i) {
        return this.e.e0(i);
    }

    @Override // xsna.zj30
    public final Collection<lj30> f(long j, Collection<? extends MsgSyncState> collection) {
        return this.c.f(j, collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d040
    public final List<Msg> f0(long j, gkx0 gkx0Var, gkx0 gkx0Var2, int i) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = this.b;
        long j2 = gkx0Var.b;
        long j3 = gkx0Var2.b;
        String str = gkx0Var.compareTo(gkx0Var2) < 0 ? "ASC" : "DESC";
        String a = zil0.a(i, "SELECT * FROM messages WHERE dialog_id = ? AND weight BETWEEN ? AND ? ORDER BY weight ", str, " LIMIT ");
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(str.equals("ASC") ? j2 : j3);
        if (str.equals("ASC")) {
            j2 = j3;
        }
        Long[] lArr = {valueOf, valueOf2, Long.valueOf(j2)};
        try {
            m = tgl0Var.b().m(a, lArr);
            arrayList = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a2 = Result.a(failure);
                Object obj = failure;
                if (a2 != null) {
                    try {
                        a2.getMessage();
                        Cursor n = tgl0Var.b().n(a, lArr);
                        ArrayList arrayList2 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
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
                Throwable a3 = Result.a(obj);
                if (a3 != null) {
                    L.e(a3, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(obj);
                return (List) obj;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    @Override // xsna.fh30
    public final List<Msg> g(Collection<Integer> collection) {
        return this.e.g(collection);
    }

    @Override // xsna.mf20
    public final void g0(int i, Peer peer, boolean z) {
        ck30 ck30Var = this.c;
        ck30Var.getClass();
        yj30 yj30Var = new yj30(i, peer.b, z);
        dhl0<yj30, Long> dhl0Var = ck30Var.c;
        dhl0Var.getClass();
        dhl0Var.f(Collections.singletonList(yj30Var));
    }

    @Override // xsna.mf20
    public final Integer h(Peer peer, gkx0 gkx0Var) {
        Cursor d = this.b.b().d("SELECT cnv_msg_id FROM messages WHERE dialog_id = " + peer.b + " AND weight = " + gkx0Var.b, null);
        try {
            return d.moveToFirst() ? Integer.valueOf(d.getInt(0)) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.d040
    public final boolean h0(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Cursor d = this.b.b().d(zr.a("\n            SELECT DISTINCT(dialog_id)\n            FROM messages\n            WHERE local_id IN(", p4g.k(collection, StringUtils.COMMA, null), ")\n            "), null);
        int count = d.getCount();
        d.close();
        return count <= 1;
    }

    @Override // xsna.zj30
    public final HashMap i() {
        return this.c.i();
    }

    @Override // xsna.d040
    public final SparseArray i0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return zik0.a;
        }
        if (size == 1) {
            return M0(((Number) j5g.X(arrayList)).intValue());
        }
        if (arrayList.isEmpty()) {
            return zik0.a;
        }
        Cursor d = this.b.b().d("SELECT local_id, weight FROM messages WHERE local_id IN(" + p4g.k(arrayList, StringUtils.COMMA, null) + ')', null);
        SparseArray sparseArray = new SparseArray(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseArray.put(d.getInt(0), new gkx0(d.getLong(1)));
                        d.moveToNext();
                    }
                }
                return sparseArray;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.d040
    public final void j(long j, gkx0 gkx0Var, gkx0 gkx0Var2) {
        StringBuilder b = fp.b(j, "\n            SELECT local_id\n            FROM messages\n            WHERE dialog_id = ", "\n                AND weight BETWEEN ");
        b.append(gkx0Var.b);
        b.append(" AND ");
        this.b.b().h(new ux9(efz.b(gkx0Var2.b, "\n            ", b), 5));
    }

    @Override // xsna.mf20
    public final void j0(Peer peer, boolean z) {
        ck30 ck30Var = this.c;
        ck30Var.c.a(Long.valueOf(peer.b), new ak30(z, 0), new bbw(ck30Var, 12));
    }

    @Override // xsna.d040
    public final void k(int i, int i2, long j) {
        e0w b = this.b.b();
        StringBuilder a = eq0.a(i, "UPDATE messages SET phase_id = 0 WHERE dialog_id = ", " AND cnv_msg_id >= ", j);
        a.append(" AND cnv_msg_id <= ");
        a.append(i2);
        b.execSQL(a.toString());
    }

    @Override // xsna.fh30
    public final List<Msg> k0(int i, UserId userId, Long l) {
        return this.e.k0(i, userId, l);
    }

    @Override // xsna.m040
    public final MsgTemplate l(int i) {
        return this.f.l(i);
    }

    @Override // xsna.m040
    public final void l0(ArrayList arrayList) {
        this.f.l0(arrayList);
    }

    @Override // xsna.d040
    public final void m(Msg msg) {
        W(Collections.singletonList(msg));
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> m0(Peer peer, Collection<Integer> collection) {
        return I0(peer.b, collection);
    }

    @Override // xsna.mf20
    public final ArrayList n(Peer peer, gkx0 gkx0Var, Direction direction, int i) {
        return this.c.b(peer, gkx0Var, direction, i);
    }

    @Override // xsna.d040
    public final void n0(long j) {
        this.b.b().execSQL("UPDATE messages SET phase_id = -1 WHERE dialog_id = " + j);
    }

    @Override // xsna.d040
    public final void o(Msg msg) {
        a(Collections.singletonList(msg));
    }

    @Override // xsna.d040
    public final int o0(int i, int i2, long j) {
        if (i > i2) {
            return 0;
        }
        StringBuilder a = eq0.a(i, "\n            SELECT COUNT(CASE WHEN is_incoming = 1 THEN 1 END)\n            FROM messages\n            WHERE dialog_id = ", "\n                AND cnv_msg_id BETWEEN ", j);
        a.append(" AND ");
        a.append(i2);
        a.append("\n            ");
        return fl3.J(this.b.b().d(a.toString(), null)).intValue();
    }

    @Override // xsna.d040
    public final MsgSyncState p(int i) {
        Integer J = fl3.J(this.b.b().d(lhg.a(i, "SELECT sync_state FROM messages WHERE local_id = "), null));
        if (J == null) {
            return null;
        }
        MsgSyncState.a aVar = MsgSyncState.Companion;
        int intValue = J.intValue();
        aVar.getClass();
        return MsgSyncState.a.a(intValue);
    }

    @Override // xsna.d040
    public final void p0(long j, gkx0 gkx0Var, gkx0 gkx0Var2) {
        this.b.b().execSQL("\n                UPDATE messages\n                SET has_space_before = ?, has_space_after = ?\n                WHERE dialog_id = ? AND weight BETWEEN ? AND ?\n            ", new String[]{String.valueOf(0L), String.valueOf(0L), String.valueOf(j), String.valueOf(gkx0Var.b), String.valueOf(gkx0Var2.b)});
    }

    @Override // xsna.mf20
    public final yj30 q(Peer peer) {
        return this.c.c.d(Long.valueOf(peer.b));
    }

    @Override // xsna.d040
    public final void q0(Collection<? extends Attach> collection) {
        rj01 rj01Var = this.e;
        ((tgl0) rj01Var.b).b().h(new erh(collection, rj01Var, this, 2));
    }

    @Override // xsna.fh30
    public final List<Attach> r(long j, int i, int i2, Direction direction, List<Integer> list) {
        return this.e.r(j, i, i2, direction, list);
    }

    @Override // xsna.zj30
    public final uz50<lj30> r0(Peer peer, gkx0 gkx0Var) {
        return this.c.r0(peer, gkx0Var);
    }

    @Override // xsna.d040
    public final SparseBooleanArray s(long j, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return new SparseBooleanArray(0);
        }
        if (size == 1) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(1);
            int intValue = ((Number) j5g.X(arrayList)).intValue();
            sparseBooleanArray.put(intValue, y0(intValue, j));
            return sparseBooleanArray;
        }
        Cursor d = this.b.b().d("SELECT cnv_msg_id FROM messages WHERE cnv_msg_id IN(" + p4g.k(arrayList, StringUtils.COMMA, null) + ") AND dialog_id = " + j, null);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseBooleanArray2.put(d.getInt(0), true);
                        d.moveToNext();
                    }
                }
                return sparseBooleanArray2;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.d040
    public final void s0(Attach attach) {
        q0(Collections.singletonList(attach));
    }

    @Override // xsna.zj30
    public final ikx0 t(gv30 gv30Var) {
        return this.c.t(gv30Var);
    }

    @Override // xsna.d040
    public final Msg t0(int i, long j) {
        Object failure;
        Object failure2;
        Cursor n;
        Cursor m;
        tgl0 tgl0Var = this.b;
        String str = "SELECT * FROM messages WHERE cnv_msg_id = " + i + " AND dialog_id = " + j;
        try {
            m = tgl0Var.b().m(str, null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            failure = m.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(m) : null;
            m.close();
            Throwable a = Result.a(failure);
            if (a != null) {
                try {
                    a.getMessage();
                    n = tgl0Var.b().n(str, null);
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                try {
                    failure2 = n.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(n) : null;
                    failure = failure2;
                } finally {
                    n.close();
                }
            }
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                L.e(a2, "rawQueryWithPossibleLargeData");
            }
            kotlin.a.a(failure);
            return (Msg) failure;
        } catch (Throwable th3) {
            m.close();
            throw th3;
        }
    }

    @Override // xsna.d040
    public final Map u(ArrayList arrayList, Collection collection) {
        if (arrayList.isEmpty() || collection.isEmpty()) {
            return jgp.b;
        }
        String g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
        Cursor d = this.b.b().d(ss9.a(collection.contains(MsgSyncState.DONE) ? "\n            SELECT DISTINCT dialog_id\n            FROM messages\n            WHERE sync_state IN(" : "\n            SELECT DISTINCT dialog_id\n            FROM messages INDEXED BY idx_messages_sync_state\n            WHERE sync_state > 0 AND sync_state IN(", j5g.g0(N0(collection), StringUtils.COMMA, null, null, 0, null, 62), ") AND dialog_id IN(", g0, ")\n            "), null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(d.getLong(0)), Boolean.TRUE);
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return hashMap;
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.m040
    public final List<MsgTemplate> u0() {
        return this.f.u0();
    }

    @Override // xsna.fh30
    public final Msg v(int i) {
        return this.e.v(i);
    }

    @Override // xsna.d040
    public final List<Integer> v0(long j, List<Integer> list) {
        Cursor d = this.b.b().d(ho8.a(fp.b(j, "SELECT local_id FROM messages WHERE dialog_id = ", " AND cnv_msg_id IN("), j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62), ')'), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(Integer.valueOf(d.getInt(0)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return arrayList;
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.d040
    public final void w(int i, long j) {
        e0w b = this.b.b();
        StringBuilder b2 = fp.b(1L, "UPDATE messages SET is_hidden = ", " WHERE dialog_id = ");
        b2.append(j);
        b2.append(" AND cnv_msg_id = ");
        b2.append(i);
        b.execSQL(b2.toString());
    }

    @Override // xsna.d040
    public final void w0(int i, long j, boolean z) {
        this.b.b().execSQL("UPDATE messages SET is_important = " + O0(z) + " WHERE dialog_id = " + j + " AND cnv_msg_id = " + i);
    }

    @Override // xsna.mf20
    public final void x(int i, boolean z) {
        this.b.b().execSQL("UPDATE messages SET has_space_after = ? WHERE local_id = ?", new String[]{String.valueOf(O0(z)), String.valueOf(i)});
    }

    @Override // xsna.d040
    public final List x0(Peer peer, Direction direction, int i) {
        ArrayList n = n(peer, gkx0.e, direction, i);
        ArrayList arrayList = new ArrayList(c5g.u(n, 10));
        Iterator it = n.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((lj30) it.next()).c));
        }
        Cursor d = this.b.b().d(air.b(')', "SELECT local_id, from_member_type, from_member_id FROM messages WHERE local_id IN(", p4g.k(arrayList, StringUtils.COMMA, null)), null);
        SparseArray sparseArray = new SparseArray(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        int i2 = d.getInt(0);
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        Peer.Type.a aVar = Peer.Type.Companion;
                        int i3 = d.getInt(1);
                        aVar.getClass();
                        sparseArray.put(i2, Peer.a.a(d.getLong(2), Peer.Type.a.a(i3)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = n.iterator();
                while (it2.hasNext()) {
                    Peer peer2 = (Peer) sparseArray.get(((lj30) it2.next()).c);
                    if (peer2 != null) {
                        arrayList2.add(peer2);
                    }
                }
                return j5g.R(arrayList2);
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.mf20
    public final lj30 y(int i, Peer peer) {
        return this.c.d(i, peer);
    }

    @Override // xsna.d040
    public final boolean y0(int i, long j) {
        return fl3.I(this.b.b().d("SELECT COUNT(1) FROM messages WHERE cnv_msg_id = " + i + " AND dialog_id = " + j, null)).booleanValue();
    }

    @Override // xsna.d040
    public final void z(int i, Boolean bool) {
        tgl0 tgl0Var = this.b;
        if (bool == null) {
            tgl0Var.b().execSQL("UPDATE messages SET was_played_local = NULL WHERE local_id = ?", new String[]{String.valueOf(i)});
        } else {
            tgl0Var.b().execSQL("UPDATE messages SET was_played_local = ? WHERE local_id = ?", new String[]{String.valueOf(O0(bool.booleanValue())), String.valueOf(i)});
        }
    }
}
