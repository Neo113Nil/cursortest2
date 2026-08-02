package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.ironsource.C4217a2;
import com.vk.im.engine.internal.storage.delegates.im_items.ImItemHistoryMetaDb;
import com.vk.im.engine.internal.storage.delegates.im_items.ImItemWeightDb;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.x7w;

/* compiled from: ImItemStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class u7w implements t7w, mtx0 {
    public final dhl0<sew, b5w> b;
    public final ImItemWeightDb c;
    public final ImItemHistoryMetaDb d;

    /* compiled from: ImItemStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends b5w>, Map<b5w, ? extends sew>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final Map<b5w, ? extends sew> invoke(Collection<? extends b5w> collection) {
            return ((u7w) this.receiver).c(collection);
        }
    }

    /* compiled from: ImItemStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends sew>, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends sew> collection) {
            ((u7w) this.receiver).j(collection);
            return s3q0.a;
        }
    }

    public u7w(tgl0 tgl0Var) {
        this.b = new dhl0<>(200, null, new ak(26), new a(1, this, u7w.class, "getWeights", "getWeights(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, this, u7w.class, "updateWeightsInternal", "updateWeightsInternal(Ljava/util/Collection;)V", 0), tgl0Var.I0());
        this.c = new ImItemWeightDb(tgl0Var);
        this.d = new ImItemHistoryMetaDb(tgl0Var);
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.b.c();
    }

    @Override // xsna.t7w
    public final void a() {
        ImItemWeightDb imItemWeightDb = this.c;
        imItemWeightDb.b.b().f(imItemWeightDb.a.a, null, null);
    }

    @Override // xsna.t7w
    public final void b() {
        ImItemHistoryMetaDb imItemHistoryMetaDb = this.d;
        imItemHistoryMetaDb.b.b().f(imItemHistoryMetaDb.a.a, null, null);
    }

    @Override // xsna.t7w
    public final Map<b5w, sew> c(Collection<b5w> collection) {
        ImItemWeightDb imItemWeightDb = this.c;
        imItemWeightDb.getClass();
        if (collection.isEmpty()) {
            return jgp.b;
        }
        Collection<b5w> collection2 = collection;
        String g0 = j5g.g0(collection2, " OR ", null, null, 0, new z7w(0), 30);
        ArrayList arrayList = new ArrayList();
        for (b5w b5wVar : collection2) {
            g5g.y(e43.l(String.valueOf(b5wVar.a), String.valueOf(b5wVar.b.h())), arrayList);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Cursor k = imItemWeightDb.b.b().k(xqm0.g("\n            SELECT " + ImItemWeightDb.Column.ID.getKey() + ", " + ImItemWeightDb.Column.TYPE.getKey() + ", " + ImItemWeightDb.Column.WEIGHT.getKey() + " \n            FROM " + imItemWeightDb.a.a + " \n            WHERE (" + g0 + ")\n        "), strArr);
        HashMap hashMap = new HashMap(k.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (k.moveToFirst()) {
                    while (!k.isAfterLast()) {
                        b5w a2 = ImItemWeightDb.a(k);
                        b5w a3 = ImItemWeightDb.a(k);
                        x7w x7wVar = x7w.f;
                        hashMap.put(a2, new sew(a3, x7w.a.a(k.getBlob(2))));
                        k.moveToNext();
                    }
                }
                Trace.endSection();
                L.d(new fk(9, collection, hashMap));
                return hashMap;
            } finally {
                k.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.t7w
    public final Collection<v7w> d(Collection<b5w> collection) {
        ImItemWeightDb imItemWeightDb = this.c;
        imItemWeightDb.getClass();
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        Collection<b5w> collection2 = collection;
        String g0 = j5g.g0(collection2, " OR ", null, null, 0, new com(10), 30);
        StringBuilder sb = new StringBuilder("\n            SELECT w.id, w.type, w.weight,\n                d.phase_id AS d_phase, d.last_msg_cnv_id > 0 AS d_has_msg, d.draft_msg,\n                c.phase AS c_phase, (c.last_msg_cnv_id > 0) AS c_has_msg\n            FROM ");
        sb.append(imItemWeightDb.a.a);
        sb.append(" AS w\n            LEFT JOIN dialogs AS d ON w.type = ");
        ImItemType imItemType = ImItemType.DIALOG;
        sb.append(imItemType.h());
        sb.append(" AND w.id = d.id\n            LEFT JOIN channels AS c ON w.type = ");
        ImItemType imItemType2 = ImItemType.CHANNEL;
        sb.append(imItemType2.h());
        sb.append(" AND w.id = c.id \n            WHERE (");
        sb.append(g0);
        sb.append(") \n            AND (\n                (\n                    w.type = ");
        sb.append(imItemType.h());
        sb.append("\n                    AND (d.is_archived IS NULL OR d.is_archived = 0)\n                    AND d.type != 1\n                    AND (d.msg_request_status = ");
        sb.append(MsgRequestStatus.NONE.j());
        sb.append(" OR d.msg_request_status = ");
        sb.append(MsgRequestStatus.ACCEPTED.j());
        sb.append(")\n                ) OR \n                (\n                    w.type = ");
        sb.append(imItemType2.h());
        sb.append("\n                    AND (c.is_archived IS NULL OR c.is_archived = 0)\n                    AND c.is_member = 1\n                    AND c.is_hidden_in_all_folder = 0\n                )\n            )\n        ");
        String g = xqm0.g(sb.toString());
        ArrayList arrayList = new ArrayList();
        for (b5w b5wVar : collection2) {
            g5g.y(e43.l(String.valueOf(b5wVar.a), String.valueOf(b5wVar.b.h())), arrayList);
        }
        Cursor k = imItemWeightDb.b.b().k(g, (String[]) arrayList.toArray(new String[0]));
        ArrayList arrayList2 = new ArrayList(k.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (k.moveToFirst()) {
                    while (!k.isAfterLast()) {
                        arrayList2.add(ImItemWeightDb.b(k));
                        k.moveToNext();
                    }
                }
                Trace.endSection();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemWeightDb getByIds size " + arrayList2.size() + " \n" + j5g.g0(arrayList2, "\n", null, null, 0, new d0k(10), 30)});
                }
                return arrayList2;
            } finally {
                k.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.t7w
    public final void e(ArrayList arrayList) {
        ArrayList arrayList2;
        ImItemWeightDb imItemWeightDb = this.c;
        imItemWeightDb.getClass();
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{uq.b(arrayList, new StringBuilder("IM_ITEMS_LOADER ImItemWeightDb.putHistory: items="))});
        }
        if (L.m(loggerOutputTarget)) {
            arrayList2 = arrayList;
        } else {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("IM_ITEMS_LOADER ImItemWeightDb.putHistory: ");
            arrayList2 = arrayList;
            sb.append(j5g.g0(arrayList2, "\n", null, null, 0, new tuq(7), 30));
            L.u(l, logType, new Object[]{sb.toString()});
        }
        SQLiteStatement compileStatement = imItemWeightDb.b.b().compileStatement(xqm0.g("\n                INSERT OR REPLACE INTO " + imItemWeightDb.a.a + " (" + ImItemWeightDb.Column.ID.getKey() + ", " + ImItemWeightDb.Column.TYPE.getKey() + ", " + ImItemWeightDb.Column.WEIGHT.getKey() + ")\n                VALUES (?, ?, ?)\n            "));
        try {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                v7w v7wVar = (v7w) it.next();
                compileStatement.bindLong(ImItemWeightDb.Column.ID.ordinal() + 1, v7wVar.a.a);
                compileStatement.bindLong(ImItemWeightDb.Column.TYPE.ordinal() + 1, v7wVar.a.b.h());
                compileStatement.bindBlob(ImItemWeightDb.Column.WEIGHT.ordinal() + 1, v7wVar.b.c());
                compileStatement.executeInsert();
                compileStatement.clearBindings();
            }
            s3q0 s3q0Var = s3q0.a;
            compileStatement.close();
        } finally {
        }
    }

    @Override // xsna.t7w
    public final void f(com.vk.im.engine.models.im_item.a aVar) {
        ImItemHistoryMetaDb imItemHistoryMetaDb = this.d;
        imItemHistoryMetaDb.getClass();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryMetaDb.put " + aVar});
        }
        SQLiteStatement compileStatement = imItemHistoryMetaDb.b.b().compileStatement("\n        INSERT OR REPLACE INTO " + imItemHistoryMetaDb.a.a + "\n        (folder_id, min_dialogs_weight, min_channels_weight, dialogs_phase, channels_phase, history_full, has_dialogs_error, has_channels_error)\n        VALUES (?, ?, ?, ?, ?, ?, ?, ?)\n    ");
        try {
            compileStatement.clearBindings();
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.FOLDER_ID.h(), -1);
            int h = ImItemHistoryMetaDb.Column.MIN_DIALOGS_WEIGHT.h();
            x7w x7wVar = aVar.a;
            rdi.h(compileStatement, h, x7wVar != null ? x7wVar.c() : null);
            int h2 = ImItemHistoryMetaDb.Column.MIN_CHANNELS_WEIGHT.h();
            x7w x7wVar2 = aVar.b;
            rdi.h(compileStatement, h2, x7wVar2 != null ? x7wVar2.c() : null);
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.DIALOGS_PHASE.h(), aVar.c);
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.CHANNELS_PHASE.h(), aVar.d);
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.HISTORY_FULL.h(), aVar.e ? 1L : 0L);
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.HAS_DIALOGS_ERROR.h(), aVar.f ? 1L : 0L);
            compileStatement.bindLong(ImItemHistoryMetaDb.Column.HAS_CHANNELS_ERROR.h(), aVar.g ? 1L : 0L);
            compileStatement.executeInsert();
            compileStatement.close();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t7w
    public final int g() {
        StringBuilder sb = new StringBuilder("\n            SELECT COUNT(*) FROM ");
        ImItemWeightDb imItemWeightDb = this.c;
        sb.append(imItemWeightDb.a.a);
        sb.append("\n            INDEXED BY idx_weight\n            WHERE weight BETWEEN ? AND ?\n        ");
        Cursor k = imItemWeightDb.b.b().k(xqm0.g(sb.toString()), new byte[][]{((x7w) com.vk.im.engine.models.im_item.b.j.getValue()).c(), ((x7w) com.vk.im.engine.models.im_item.b.k.getValue()).c()});
        try {
            int i = k.moveToFirst() ? k.getInt(0) : 0;
            k.close();
            return i;
        } finally {
        }
    }

    @Override // xsna.t7w
    public final com.vk.im.engine.models.im_item.a getMeta() {
        x7w a2;
        ImItemHistoryMetaDb imItemHistoryMetaDb = this.d;
        Cursor k = imItemHistoryMetaDb.b.b().k(xqm0.g("\n            SELECT * FROM " + imItemHistoryMetaDb.a.a + " WHERE folder_id = ?\n        "), new String[]{C4217a2.f});
        try {
            com.vk.im.engine.models.im_item.a aVar = null;
            x7w a3 = null;
            aVar = null;
            if (k.moveToFirst()) {
                byte[] v = fl3.v(k, ImItemHistoryMetaDb.Column.MIN_DIALOGS_WEIGHT.getKey());
                if (v == null) {
                    a2 = null;
                } else {
                    x7w x7wVar = x7w.f;
                    a2 = x7w.a.a(v);
                }
                byte[] v2 = fl3.v(k, ImItemHistoryMetaDb.Column.MIN_CHANNELS_WEIGHT.getKey());
                if (v2 != null) {
                    x7w x7wVar2 = x7w.f;
                    a3 = x7w.a.a(v2);
                }
                com.vk.im.engine.models.im_item.a aVar2 = new com.vk.im.engine.models.im_item.a(a2, a3, fl3.A(k, ImItemHistoryMetaDb.Column.DIALOGS_PHASE.getKey()), fl3.A(k, ImItemHistoryMetaDb.Column.CHANNELS_PHASE.getKey()), fl3.x(k, ImItemHistoryMetaDb.Column.HISTORY_FULL.getKey()), fl3.x(k, ImItemHistoryMetaDb.Column.HAS_DIALOGS_ERROR.getKey()), fl3.x(k, ImItemHistoryMetaDb.Column.HAS_CHANNELS_ERROR.getKey()));
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryMetaDb.get: found meta=" + aVar2});
                }
                aVar = aVar2;
            } else {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryMetaDb.get: no meta found"});
                }
            }
            k.close();
            return aVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(k, th);
                throw th2;
            }
        }
    }

    @Override // xsna.t7w
    public final l5w h(x7w x7wVar, x7w x7wVar2, x7w x7wVar3, x7w x7wVar4, int i) {
        ImItemWeightDb imItemWeightDb = this.c;
        tgl0 tgl0Var = imItemWeightDb.b;
        sgl0 sgl0Var = imItemWeightDb.a;
        int i2 = (i <= 0 || i == Integer.MAX_VALUE) ? i : i + 1;
        String a2 = i2 > 0 ? lhg.a(i2, "LIMIT ") : "";
        if (x7wVar2 == null) {
            x7wVar2 = x7w.g;
        }
        byte[] c = x7wVar2.c();
        if (x7wVar4 == null) {
            x7wVar4 = x7w.g;
        }
        byte[][] bArr = {c, x7wVar.c(), x7wVar4.c(), x7wVar3.c()};
        StringBuilder sb = new StringBuilder("\n            SELECT w.id, w.type, w.weight,\n                   d.phase_id AS d_phase, d.last_msg_cnv_id > 0 AS d_has_msg, d.draft_msg,\n                   c.phase AS c_phase, (c.last_msg_cnv_id > 0) AS c_has_msg\n            FROM ");
        sb.append(sgl0Var.a);
        sb.append(" AS w\n            INDEXED BY idx_weight\n            LEFT JOIN dialogs AS d ON w.type = ");
        ImItemType imItemType = ImItemType.DIALOG;
        sb.append(imItemType.h());
        sb.append(" AND w.id = d.id\n            LEFT JOIN channels AS c ON w.type = ");
        ImItemType imItemType2 = ImItemType.CHANNEL;
        sb.append(imItemType2.h());
        sb.append(" AND w.id = c.id\n            WHERE (\n                w.type = ");
        sb.append(imItemType.h());
        sb.append("\n                AND w.weight BETWEEN ? AND ?\n                AND (d.is_archived IS NULL OR d.is_archived = 0)\n                AND d.type != 1\n                AND (d.msg_request_status = ");
        sb.append(MsgRequestStatus.NONE.j());
        sb.append(" OR d.msg_request_status = ");
        sb.append(MsgRequestStatus.ACCEPTED.j());
        sb.append(")\n            ) OR (\n                w.type = ");
        sb.append(imItemType2.h());
        sb.append("\n                AND w.weight BETWEEN ? AND ?\n                AND (c.is_archived IS NULL OR c.is_archived = 0)\n                AND c.is_member = 1\n                AND c.is_hidden_in_all_folder = 0\n            )\n            ORDER BY w.weight DESC\n            ");
        sb.append(a2);
        sb.append("\n        ");
        Cursor k = tgl0Var.b().k(xqm0.g(sb.toString()), bArr);
        ArrayList arrayList = new ArrayList(k.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (k.moveToFirst()) {
                    while (!k.isAfterLast()) {
                        arrayList.add(ImItemWeightDb.b(k));
                        k.moveToNext();
                    }
                }
                Trace.endSection();
                final ArrayList arrayList2 = new ArrayList(arrayList);
                final boolean z = i > 0 && arrayList2.size() > i;
                if (z) {
                    arrayList2.remove(e43.h(arrayList2));
                }
                Cursor k2 = tgl0Var.b().k(xqm0.g("\n        SELECT * FROM " + sgl0Var.a + "\n        WHERE (type = " + ImItemType.DIALOG.h() + " AND weight > ?)\n           OR (type = " + ImItemType.CHANNEL.h() + " AND weight > ?)\n        LIMIT 1\n        "), new byte[][]{x7wVar.c(), x7wVar3.c()});
                try {
                    final boolean z2 = k2.getCount() > 0;
                    k2.close();
                    l5w l5wVar = new l5w(arrayList2, z2, z);
                    L.d(new gzs() { // from class: xsna.y7w
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder c2 = gp.c("IM_ITEMS_LOADER ImItemWeightDb getHistory hasBeforeCached ", " hasAfterCached ", " size ", z, z2);
                            ArrayList arrayList3 = arrayList2;
                            c2.append(arrayList3.size());
                            c2.append(" \n");
                            c2.append(j5g.g0(arrayList3, "\n", null, null, 0, new l8k(11), 30));
                            return c2.toString();
                        }
                    });
                    return l5wVar;
                } finally {
                }
            } finally {
                k.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.t7w
    public final void i(Collection<Pair<b5w, x7w>> collection) {
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new sew((b5w) pair.i(), (x7w) pair.j()));
        }
        j(arrayList);
    }

    public final void j(Collection<sew> collection) {
        ImItemWeightDb imItemWeightDb = this.c;
        imItemWeightDb.getClass();
        if (collection.isEmpty()) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{go9.b("IM_ITEMS_LOADER ImItemWeightDb.updateWeights: ", j5g.g0(collection, "\n", null, null, 0, new d4r(6), 30))});
        }
        SQLiteStatement compileStatement = imItemWeightDb.b.b().compileStatement(i5s.a(new StringBuilder("UPDATE "), imItemWeightDb.a.a, " SET weight = ? WHERE id = ? AND type = ?"));
        try {
            for (sew sewVar : collection) {
                compileStatement.clearBindings();
                x7w x7wVar = sewVar.b;
                b5w b5wVar = sewVar.a;
                compileStatement.bindBlob(1, x7wVar.c());
                compileStatement.bindLong(2, b5wVar.a);
                compileStatement.bindLong(3, b5wVar.b.h());
                compileStatement.executeUpdateDelete();
            }
            s3q0 s3q0Var = s3q0.a;
            compileStatement.close();
        } finally {
        }
    }
}
