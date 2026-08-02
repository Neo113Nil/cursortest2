package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MsgHistoryStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ck30 implements zj30, mtx0 {
    public final tgl0 b;
    public final dhl0<yj30, Long> c;

    /* compiled from: MsgHistoryStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends yj30>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends yj30> collection) {
            Collection<? extends yj30> collection2 = collection;
            ck30 ck30Var = (ck30) this.receiver;
            ck30Var.getClass();
            if (!collection2.isEmpty()) {
                ck30Var.b.b().h(new bk30(collection2, 0));
            }
            return s3q0.a;
        }
    }

    public ck30(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(100, tgl0Var.c(yj30.class), new f6w(10), new w110(this, 6), new a(1, this, ck30.class, "putHistoryIsEmptyValueToDb", "putHistoryIsEmptyValueToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    @Override // xsna.zj30
    public final lj30 G0(long j) {
        return R(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.zj30
    public final Map<Long, lj30> R(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return jgp.b;
        }
        StringBuilder a2 = t33.a("\n            SELECT ", j5g.g0(com.vk.im.engine.internal.storage.delegates.messages.a.a, null, null, null, 0, new oey(8), 31), "\n            FROM messages m\n            JOIN (\n                SELECT dialog_id, MAX(weight) AS max_weight\n                FROM messages\n                WHERE dialog_id IN (");
        a2.append(p4g.k(collection, StringUtils.COMMA, null));
        a2.append(")\n                GROUP BY dialog_id\n            ) AS latest_msgs\n              ON m.dialog_id = latest_msgs.dialog_id AND m.weight = latest_msgs.max_weight\n        ");
        Cursor d = this.b.b().d(a2.toString(), null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(d.getLong(0)), com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
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

    public final ArrayList b(Peer peer, gkx0 gkx0Var, Direction direction, int i) {
        Direction direction2 = Direction.BEFORE;
        String str = direction == direction2 ? "<=" : ">=";
        String str2 = direction == direction2 ? "DESC" : "ASC";
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        n6j.b(sb, com.vk.im.engine.internal.storage.delegates.messages.a.b, "\n            FROM messages\n            WHERE dialog_id = ? AND weight ", str, " ?\n            ORDER BY weight ");
        nyh0.a(i, str2, "\n            LIMIT ", "\n            ", sb);
        Cursor d = this.b.b().d(i5s.a(sb, "", "\n            "), new String[]{String.valueOf(peer.b), String.valueOf(gkx0Var.b)});
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final lj30 d(int i, Peer peer) {
        Cursor d = this.b.b().d(i5s.a(new StringBuilder("SELECT "), com.vk.im.engine.internal.storage.delegates.messages.a.b, " FROM messages WHERE dialog_id = ? AND cnv_msg_id = ?"), new String[]{String.valueOf(peer.b), String.valueOf(i)});
        try {
            return d.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.a(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.zj30
    public final uz50 e(int i, long j) {
        StringBuilder sb = new StringBuilder("SELECT ");
        String str = com.vk.im.engine.internal.storage.delegates.messages.a.b;
        return (uz50) this.b.b().h(new n330(i5s.a(sb, str, " FROM messages WHERE dialog_id = ? AND cnv_msg_id <= ? ORDER BY cnv_msg_id DESC LIMIT 2"), i, zr.a("SELECT ", str, " FROM messages WHERE dialog_id = ? AND cnv_msg_id >= ? ORDER BY cnv_msg_id ASC LIMIT 2"), new String[]{String.valueOf(j), String.valueOf(i)}));
    }

    @Override // xsna.zj30
    public final Collection<lj30> f(long j, Collection<? extends MsgSyncState> collection) {
        String b;
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        String k = p4g.k(collection, StringUtils.COMMA, new gky(8));
        if (collection.contains(MsgSyncState.DONE)) {
            StringBuilder sb = new StringBuilder("\n            SELECT ");
            sb.append(com.vk.im.engine.internal.storage.delegates.messages.a.b);
            sb.append("\n            FROM messages\n            WHERE dialog_id = ");
            sb.append(j);
            b = tdj.a(sb, " AND sync_state IN(", k, ")\n            ");
        } else {
            StringBuilder sb2 = new StringBuilder("\n            SELECT ");
            n6j.b(sb2, com.vk.im.engine.internal.storage.delegates.messages.a.b, "\n            FROM messages INDEXED BY idx_messages_sync_state\n            WHERE sync_state > 0 AND sync_state IN(", k, ") AND dialog_id = ");
            b = efz.b(j, " \n            ", sb2);
        }
        Cursor d = this.b.b().d(b, null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.zj30
    public final HashMap i() {
        Cursor d = this.b.b().d(i5s.a(new StringBuilder("\n            SELECT "), com.vk.im.engine.internal.storage.delegates.messages.a.b, "\n            FROM messages\n            WHERE (dialog_id, weight) IN(\n                SELECT dialog_id, MAX(weight)\n                FROM messages\n                GROUP BY dialog_id\n            )\n        "), null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(d.getLong(0)), com.vk.im.engine.internal.storage.delegates.messages.a.a(d));
                        d.moveToNext();
                    }
                }
                return hashMap;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.zj30
    public final uz50<lj30> r0(Peer peer, gkx0 gkx0Var) {
        return (uz50) this.b.b().h(new jl6(this, peer, gkx0Var, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zj30
    public final ikx0 t(gv30 gv30Var) {
        gkx0 b;
        Peer peer = gv30Var.b;
        Integer num = gv30Var.c;
        if (num != null) {
            Cursor d = this.b.b().d(i5s.a(new StringBuilder("SELECT "), com.vk.im.engine.internal.storage.delegates.messages.a.b, " FROM messages WHERE local_id = ?"), new String[]{String.valueOf(num.intValue())});
            try {
                lj30 a2 = d.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.a(d) : null;
                if (a2 != null) {
                    gkx0 gkx0Var = a2.h;
                    return new ikx0(gkx0Var, gkx0Var);
                }
            } finally {
                d.close();
            }
        } else {
            Integer num2 = gv30Var.d;
            if (num2 != null) {
                lj30 d2 = d(num2.intValue(), peer);
                if (d2 != null) {
                    gkx0 gkx0Var2 = d2.h;
                    return new ikx0(gkx0Var2, gkx0Var2);
                }
            } else {
                gkx0 gkx0Var3 = gv30Var.f;
                if (gkx0Var3 == null) {
                    Integer num3 = gv30Var.e;
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        lj30 d3 = d(intValue, peer);
                        if (d3 != null) {
                            gkx0Var3 = d3.h;
                        } else {
                            uz50 e = e(intValue, peer.b);
                            lj30 lj30Var = (lj30) e.a;
                            lj30 lj30Var2 = (lj30) e.b;
                            gkx0Var3 = lj30Var != null ? lj30Var.h.b(Direction.AFTER) : lj30Var2 != null ? lj30Var2.h : gkx0.d;
                        }
                    } else {
                        gkx0Var3 = null;
                    }
                }
                gkx0 gkx0Var4 = gv30Var.h;
                if (gkx0Var4 == null) {
                    Integer num4 = gv30Var.g;
                    if (num4 != null) {
                        int intValue2 = num4.intValue();
                        lj30 d4 = d(intValue2, peer);
                        if (d4 != null) {
                            b = d4.h;
                        } else {
                            uz50 e2 = e(intValue2, peer.b);
                            lj30 lj30Var3 = (lj30) e2.a;
                            lj30 lj30Var4 = (lj30) e2.b;
                            b = lj30Var4 != null ? lj30Var4.h.b(Direction.BEFORE) : lj30Var3 != null ? lj30Var3.h : gkx0.e;
                        }
                        gkx0Var4 = b;
                    } else {
                        gkx0Var4 = null;
                    }
                }
                if (gkx0Var3 != null && gkx0Var4 != null && gkx0Var3.compareTo(gkx0Var4) <= 0) {
                    return new ikx0(gkx0Var3, gkx0Var4);
                }
            }
        }
        return null;
    }
}
