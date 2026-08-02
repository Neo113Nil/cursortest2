package xsna;

import android.database.Cursor;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageAttachesColumn;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMessagesStorageManager.kt */
/* loaded from: classes2.dex */
public final class r3b implements p3b, mtx0 {
    public final g2b b;
    public final com.vk.im.engine.internal.storage.delegates.channel_messages.a c;
    public final dhl0<yj30, Long> d;

    public r3b(tgl0 tgl0Var, boolean z) {
        this.b = new g2b(tgl0Var, z);
        this.c = new com.vk.im.engine.internal.storage.delegates.channel_messages.a(tgl0Var, z);
        this.d = new dhl0<>(100, tgl0Var.c(yj30.class), new z90(10), new ka(this, 13), new com.vk.voip.ui.menu.feature.a(this, 16), tgl0Var.I0());
    }

    @Override // xsna.mf20
    public final lj30 A(Peer peer, gkx0 gkx0Var) {
        long j = peer.b;
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.f.b);
        sb.append(" FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n                WHERE ");
        cr.a(ChannelMessageColumn.WEIGHT, sb, " = ");
        sb.append(gkx0Var.b);
        sb.append("\n                AND ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n            ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        try {
            return d.moveToFirst() ? w1b.b(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.mf20
    public final void B0(int i, int i2, Peer peer) {
        long j = peer.b;
        g2b g2bVar = this.b;
        g2bVar.getClass();
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        cr.a(ChannelMessageColumn.LOCAL_ID, sb, "\n            FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n            WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n            AND ");
        sb.append(ChannelMessageColumn.CNV_MSG_ID.getKey());
        sb.append(" BETWEEN ");
        sb.append(i);
        sb.append(" AND ");
        g2bVar.d.b().h(new defpackage.c(10, g2bVar, h5s.c(i2, "\n            ", sb)));
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> C(Collection<Integer> collection) {
        return T(collection);
    }

    @Override // xsna.mf20
    public final uz50 C0(final int i, Peer peer) {
        long j = peer.b;
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        final g2b g2bVar = this.b;
        w1b w1bVar = g2bVar.f;
        sb.append(w1bVar.b);
        sb.append(" FROM ");
        sgl0 sgl0Var = g2bVar.b;
        sb.append(sgl0Var.a);
        sb.append(" \n                WHERE ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CHANNEL_ID;
        cr.a(channelMessageColumn, sb, " = ? \n                AND ");
        ChannelMessageColumn channelMessageColumn2 = ChannelMessageColumn.CNV_MSG_ID;
        sb.append(channelMessageColumn2.getKey());
        sb.append(" <= ?\n                ORDER BY ");
        sb.append(channelMessageColumn2.getKey());
        sb.append(" DESC LIMIT 2\n            ");
        final String g = xqm0.g(sb.toString());
        final String g2 = xqm0.g("\n                SELECT " + w1bVar.b + " FROM " + sgl0Var.a + "\n                WHERE " + channelMessageColumn.getKey() + " = ?\n                AND " + channelMessageColumn2.getKey() + " >= ?\n                ORDER BY " + channelMessageColumn2.getKey() + " ASC LIMIT 2\n            ");
        final String[] strArr = {String.valueOf(j), String.valueOf(i)};
        return (uz50) g2bVar.d.b().h(new izs() { // from class: xsna.d2b
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                lj30 lj30Var;
                e0w e0wVar = (e0w) obj;
                String str = g;
                String[] strArr2 = strArr;
                Cursor d = e0wVar.d(str, strArr2);
                ArrayList arrayList = new ArrayList(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        boolean moveToFirst = d.moveToFirst();
                        g2b g2bVar2 = g2bVar;
                        if (moveToFirst) {
                            while (!d.isAfterLast()) {
                                g2bVar2.f.getClass();
                                arrayList.add(w1b.b(d));
                                d.moveToNext();
                            }
                        }
                        Trace.endSection();
                        d = e0wVar.d(g2, strArr2);
                        ArrayList arrayList2 = new ArrayList(d.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (d.moveToFirst()) {
                                    while (!d.isAfterLast()) {
                                        g2bVar2.f.getClass();
                                        arrayList2.add(w1b.b(d));
                                        d.moveToNext();
                                    }
                                }
                                Trace.endSection();
                                boolean isEmpty = arrayList.isEmpty();
                                int i2 = i;
                                lj30 lj30Var2 = null;
                                if (isEmpty) {
                                    lj30Var = null;
                                } else {
                                    lj30Var = (lj30) arrayList.get(0);
                                    lj30 lj30Var3 = (lj30) j5g.b0(1, arrayList);
                                    if (i2 == lj30Var.d) {
                                        lj30Var = lj30Var3;
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    lj30 lj30Var4 = (lj30) arrayList2.get(0);
                                    lj30Var2 = i2 == lj30Var4.d ? (lj30) j5g.b0(1, arrayList2) : lj30Var4;
                                }
                                return new uz50(lj30Var, lj30Var2);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
        });
    }

    public final void D(int i, Integer num) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" \n            SET ");
        cr.a(ChannelMessageColumn.LOCAL_REACTION, sb, " = ? \n            WHERE ");
        sb.append(ChannelMessageColumn.LOCAL_ID.getKey());
        sb.append(" = ?\n            ");
        g2bVar.d.b().execSQL(xqm0.g(sb.toString()), new Integer[]{num, Integer.valueOf(i)});
    }

    @Override // xsna.mf20
    public final List<Msg> D0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, int i) {
        long j = peer.b;
        g2b g2bVar = this.b;
        g2bVar.getClass();
        long j2 = gkx0Var.b;
        long j3 = gkx0Var2.b;
        String str = gkx0Var.compareTo(gkx0Var2) < 0 ? "ASC" : "DESC";
        StringBuilder sb = new StringBuilder("\n            SELECT * FROM ");
        sb.append(g2bVar.b.a);
        sb.append(" \n            WHERE ");
        cr.a(ChannelMessageColumn.CHANNEL_ID, sb, " = ? \n            AND ");
        sb.append(ChannelMessageColumn.WEIGHT.getKey());
        sb.append(" BETWEEN ? AND ?\n            ORDER BY weight ");
        sb.append(str);
        sb.append("\n            LIMIT ");
        sb.append(i);
        sb.append("\n            ");
        String g = xqm0.g(sb.toString());
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(str.equals("ASC") ? j2 : j3);
        if (str.equals("ASC")) {
            j2 = j3;
        }
        Cursor d = g2bVar.d.b().d(g, new Long[]{valueOf, valueOf2, Long.valueOf(j2)});
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(g2bVar.f.a(d));
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

    public final void E(int i, long j, boolean z) {
        this.b.a(i, j, z);
    }

    @Override // xsna.mf20
    public final void E0(int i, gkx0 gkx0Var) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" SET ");
        cr.a(ChannelMessageColumn.WEIGHT_BEFORE, sb, " = ? WHERE ");
        sb.append(ChannelMessageColumn.LOCAL_ID.getKey());
        sb.append(" = ?");
        g2bVar.d.b().execSQL(sb.toString(), new String[]{String.valueOf(gkx0Var.b), String.valueOf(i)});
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> F(Collection<Integer> collection, List<? extends MsgSyncState> list) {
        return zik0.a;
    }

    @Override // xsna.mf20
    public final void F0(int i, gkx0 gkx0Var) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" SET ");
        cr.a(ChannelMessageColumn.WEIGHT_AFTER, sb, " = ? WHERE ");
        sb.append(ChannelMessageColumn.LOCAL_ID.getKey());
        sb.append(" = ?");
        g2bVar.d.b().execSQL(sb.toString(), new String[]{String.valueOf(gkx0Var.b), String.valueOf(i)});
    }

    @Override // xsna.p3b
    public final ArrayList G(Class cls, UserId userId, Long l) {
        return (ArrayList) g(j14.b(cls), userId, l);
    }

    @Override // xsna.mf20
    public final void H0(List<? extends Msg> list) {
        a(list);
    }

    @Override // xsna.mf20
    public final gkx0 J(int i) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.LOCAL_ID;
        cr.a(channelMessageColumn, sb, ", ");
        ChannelMessageColumn channelMessageColumn2 = ChannelMessageColumn.WEIGHT;
        cr.a(channelMessageColumn2, sb, "\n                FROM ");
        sb.append(g2bVar.b.a);
        sb.append(" WHERE ");
        sb.append(channelMessageColumn.getKey());
        sb.append(" = ?\n            ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), new String[]{String.valueOf(i)});
        try {
            return d.moveToFirst() ? new gkx0(fl3.C(d, channelMessageColumn2.getKey())) : null;
        } finally {
            d.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0072, code lost:
    
        if (r7 == null) goto L6;
     */
    @Override // xsna.mf20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2, Integer num) {
        String str;
        long j = peer.b;
        StringBuilder sb = new StringBuilder("\n                UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append("\n                SET \n                ");
        cr.a(ChannelMessageColumn.HAS_SPACE_BEFORE, sb, " = 0, \n                ");
        cr.a(ChannelMessageColumn.HAS_SPACE_AFTER, sb, " = 0\n                WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append(" \n                AND ");
        cr.a(ChannelMessageColumn.WEIGHT, sb, " \n                BETWEEN ");
        sb.append(gkx0Var.b);
        sb.append(" AND ");
        sb.append(gkx0Var2.b);
        sb.append(" \n                ");
        if (num != null) {
            str = "AND " + ChannelMessageColumn.CNV_MSG_ID.getKey() + " = " + num;
        }
        str = "";
        sb.append(str);
        sb.append("\n            ");
        g2bVar.d.b().execSQL(xqm0.g(sb.toString()));
    }

    @Override // xsna.mf20
    public final Msg L(int i) {
        return this.b.e(i);
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.d.c();
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> T(Collection<Integer> collection) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        int size = collection.size();
        if (size == 0) {
            return zik0.a;
        }
        if (size == 1) {
            SparseArray<Msg> sparseArray = new SparseArray<>(1);
            int intValue = ((Number) j5g.X(collection)).intValue();
            Msg e = g2bVar.e(intValue);
            if (e != null) {
                sparseArray.put(intValue, e);
            }
            return sparseArray;
        }
        Cursor d = g2bVar.d.b().d(xqm0.g("\n                SELECT * FROM " + g2bVar.b.a + "\n                WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " IN(" + p4g.k(collection, StringUtils.COMMA, null) + ")\n            "), null);
        SparseArray<Msg> sparseArray2 = new SparseArray<>(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseArray2.put(fl3.A(d, ChannelMessageColumn.LOCAL_ID.getKey()), g2bVar.f.a(d));
                        d.moveToNext();
                    }
                }
                return sparseArray2;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.p3b
    public final List<Msg> V(Collection<Integer> collection) {
        return this.b.b(collection);
    }

    @Override // xsna.mf20
    public final void X(int i, boolean z) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" \n            SET ");
        sb.append(ChannelMessageColumn.HAS_SPACE_BEFORE.getKey());
        sb.append(" = ");
        sb.append(z);
        sb.append(" \n            WHERE ");
        sb.append(ChannelMessageColumn.LOCAL_ID.getKey());
        sb.append(" = ");
        sb.append(i);
        sb.append("\n            ");
        g2bVar.d.b().execSQL(xqm0.g(sb.toString()));
    }

    @Override // xsna.p3b
    public final void a(Collection<? extends Msg> collection) {
        this.b.e.a(collection);
    }

    @Override // xsna.p3b
    public final Attach b(int i) {
        return this.b.d(i);
    }

    public final SparseBooleanArray d(long j, Collection<Integer> collection) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CNV_MSG_ID;
        cr.a(channelMessageColumn, sb, " \n                FROM ");
        sb.append(g2bVar.b.a);
        sb.append(" \n                WHERE ");
        sb.append(channelMessageColumn.getKey());
        sb.append(" IN(");
        sb.append(p4g.k(collection, StringUtils.COMMA, null));
        sb.append(")\n                AND ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n            ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseBooleanArray.put(d.getInt(0), true);
                        d.moveToNext();
                    }
                }
                return sparseBooleanArray;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void e(int i) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        g2bVar.d.b().h(new defpackage.c(10, g2bVar, String.valueOf(i)));
    }

    public final void f(long j) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" SET ");
        sb.append(ChannelMessageColumn.PHASE_ID);
        sb.append(" = 0 WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID);
        sb.append(" = ?");
        g2bVar.d.b().execSQL(sb.toString(), new Long[]{Long.valueOf(j)});
    }

    public final List<Msg> g(int i, UserId userId, Long l) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        String g = xqm0.g("\n                WHERE " + ChannelMessageAttachesColumn.CONTENT_TYPE.getKey() + " = " + i + "\n                AND " + ChannelMessageAttachesColumn.CONTENT_ID.getKey() + " = " + l + "\n                AND " + ChannelMessageAttachesColumn.CONTENT_OWNER_ID.getKey() + " = " + userId.b + "\n            ");
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        sb.append(ChannelMessageAttachesColumn.MSG_LOCAL_ID.getKey());
        sb.append("\n            FROM channel_message_attaches\n            ");
        sb.append(g);
        sb.append("\n        ");
        Cursor d = g2bVar.d.b().d("\n            SELECT *\n            FROM " + g2bVar.b.a + "\n            WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " IN(" + xqm0.g(sb.toString()) + ")\n            ", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(g2bVar.f.a(d));
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

    @Override // xsna.mf20
    public final void g0(int i, Peer peer, boolean z) {
        yj30 yj30Var = new yj30(i, peer.b, z);
        dhl0<yj30, Long> dhl0Var = this.d;
        dhl0Var.getClass();
        dhl0Var.f(Collections.singletonList(yj30Var));
    }

    @Override // xsna.mf20
    public final Integer h(Peer peer, gkx0 gkx0Var) {
        long j = peer.b;
        g2b g2bVar = this.b;
        g2bVar.getClass();
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CNV_MSG_ID;
        cr.a(channelMessageColumn, sb, " FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n                WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n                AND ");
        cr.a(ChannelMessageColumn.WEIGHT, sb, " = ");
        sb.append(gkx0Var.b);
        sb.append("\n            ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        try {
            return d.moveToFirst() ? Integer.valueOf(fl3.A(d, channelMessageColumn.getKey())) : null;
        } finally {
            d.close();
        }
    }

    public final SparseArray<Msg> i(long j, Collection<Integer> collection) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        if (collection.isEmpty()) {
            return zik0.a;
        }
        Cursor d = g2bVar.d.b().d(xqm0.g("\n                SELECT * FROM " + g2bVar.b.a + " \n                WHERE " + ChannelMessageColumn.CNV_MSG_ID.getKey() + " IN(" + p4g.k(collection, StringUtils.COMMA, null) + ") \n                AND " + ChannelMessageColumn.CHANNEL_ID.getKey() + " = " + j + "\n            "), null);
        SparseArray<Msg> sparseArray = new SparseArray<>(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        sparseArray.put(fl3.A(d, ChannelMessageColumn.CNV_MSG_ID.getKey()), g2bVar.f.a(d));
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

    @Override // xsna.mf20
    public final void j0(Peer peer, final boolean z) {
        this.d.a(Long.valueOf(peer.b), new izs() { // from class: xsna.q3b
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return yj30.a((yj30) obj, z);
            }
        }, new ha(this, 14));
    }

    public final Msg l(int i, long j) {
        StringBuilder sb = new StringBuilder("\n            SELECT * FROM ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append("\n            WHERE ");
        sb.append(ChannelMessageColumn.CNV_MSG_ID.getKey());
        sb.append(" = ");
        sb.append(i);
        sb.append("\n            AND ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n        ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        try {
            return d.moveToFirst() ? g2bVar.f.a(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.mf20
    public final SparseArray<Msg> m0(Peer peer, Collection<Integer> collection) {
        return i(peer.b, collection);
    }

    @Override // xsna.mf20
    public final ArrayList n(Peer peer, gkx0 gkx0Var, Direction direction, int i) {
        long j = peer.b;
        g2b g2bVar = this.b;
        w1b w1bVar = g2bVar.f;
        Direction direction2 = Direction.BEFORE;
        String str = direction == direction2 ? "<=" : ">=";
        String str2 = direction == direction2 ? "DESC" : "ASC";
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        sb.append(w1bVar.b);
        sb.append("\n            FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n            WHERE ");
        cr.a(ChannelMessageColumn.CHANNEL_ID, sb, " = ? AND ");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.WEIGHT;
        sb.append(channelMessageColumn.getKey());
        sb.append(' ');
        sb.append(str);
        sb.append(" ?\n            ORDER BY ");
        sb.append(channelMessageColumn.getKey());
        sb.append(' ');
        sb.append(str2);
        sb.append("\n            LIMIT ");
        sb.append(i);
        Cursor d = g2bVar.d.b().d(tdj.a(sb, "\n            ", "", "\n            "), new String[]{String.valueOf(j), String.valueOf(gkx0Var.b)});
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(w1b.b(d));
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

    public final void o(Msg msg) {
        com.vk.im.engine.internal.storage.delegates.channel_messages.b bVar = this.b.e;
        bVar.getClass();
        bVar.a(Collections.singletonList(msg));
    }

    @Override // xsna.mf20
    public final yj30 q(Peer peer) {
        return this.d.d(Long.valueOf(peer.b));
    }

    public final Map<Long, lj30> r(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder("\n            SELECT ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.f.b);
        sb.append("\n            FROM ");
        sgl0 sgl0Var = g2bVar.b;
        sb.append(sgl0Var.a);
        sb.append("\n            WHERE (");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CHANNEL_ID;
        cr.a(channelMessageColumn, sb, ", ");
        ChannelMessageColumn channelMessageColumn2 = ChannelMessageColumn.WEIGHT;
        sb.append(channelMessageColumn2.getKey());
        sb.append(") IN(\n                SELECT ");
        sb.append(channelMessageColumn.getKey());
        sb.append(", MAX(");
        sb.append(channelMessageColumn2.getKey());
        sb.append(")\n                FROM ");
        sb.append(sgl0Var.a);
        sb.append("\n                WHERE ");
        sb.append(channelMessageColumn.getKey());
        sb.append(" IN (");
        sb.append(p4g.k(collection, StringUtils.COMMA, null));
        sb.append(")\n                GROUP BY ");
        sb.append(channelMessageColumn.getKey());
        sb.append("\n            )\n        ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(fl3.C(d, ChannelMessageColumn.CHANNEL_ID.getKey())), w1b.b(d));
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

    public final void s0(Attach attach) {
        List singletonList = Collections.singletonList(attach);
        g2b g2bVar = this.b;
        g2bVar.d.I0().u(new k8(5, singletonList, g2bVar));
    }

    public final Map<Long, Msg> t(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder("\n            SELECT *\n            FROM ");
        g2b g2bVar = this.b;
        sgl0 sgl0Var = g2bVar.b;
        sb.append(sgl0Var.a);
        sb.append("\n            WHERE (");
        ChannelMessageColumn channelMessageColumn = ChannelMessageColumn.CHANNEL_ID;
        cr.a(channelMessageColumn, sb, ", ");
        ChannelMessageColumn channelMessageColumn2 = ChannelMessageColumn.WEIGHT;
        sb.append(channelMessageColumn2.getKey());
        sb.append(") IN(\n                SELECT ");
        sb.append(channelMessageColumn.getKey());
        sb.append(", MAX(");
        sb.append(channelMessageColumn2.getKey());
        sb.append(")\n                FROM ");
        sb.append(sgl0Var.a);
        sb.append("\n                WHERE ");
        sb.append(channelMessageColumn.getKey());
        sb.append(" IN (");
        sb.append(p4g.k(collection, StringUtils.COMMA, null));
        sb.append(")\n                GROUP BY ");
        sb.append(channelMessageColumn.getKey());
        sb.append("\n            )\n        ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        HashMap hashMap = new HashMap(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        hashMap.put(Long.valueOf(fl3.C(d, ChannelMessageColumn.CHANNEL_ID.getKey())), g2bVar.f.a(d));
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

    public final List<Attach> v(long j, int i, int i2, Direction direction, List<Integer> list) {
        boolean z;
        g2b g2bVar = this.b;
        g2bVar.getClass();
        String g0 = j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62);
        Direction direction2 = Direction.BEFORE;
        String str = direction == direction2 ? "DESC" : "ASC";
        String str2 = direction == direction2 ? "<" : ">";
        StringBuilder sb = new StringBuilder("\n            SELECT DISTINCT ");
        sb.append(ChannelMessageAttachesColumn.ATTACH_LOCAL_ID.getKey());
        sb.append("\n            FROM channel_message_attaches\n            WHERE ");
        sb.append(ChannelMessageAttachesColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append(" \n            AND ");
        ChannelMessageAttachesColumn channelMessageAttachesColumn = ChannelMessageAttachesColumn.MV_CNV_MSG_ID;
        sb.append(channelMessageAttachesColumn.getKey());
        sb.append(' ');
        sb.append(str2);
        sb.append(' ');
        sb.append(i);
        sb.append(" \n            AND ");
        sb.append(ChannelMessageAttachesColumn.CONTENT_TYPE.getKey());
        sb.append(" IN (");
        sb.append(g0);
        sb.append(")\n            ORDER BY ");
        sb.append(channelMessageAttachesColumn.getKey());
        sb.append(' ');
        sb.append(str);
        sb.append("\n            LIMIT ");
        sb.append(i2);
        sb.append("\n        ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        Attach d2 = g2bVar.d(d.getInt(0));
                        if (d2 != null) {
                            arrayList.add(d2);
                        }
                        d.moveToNext();
                    }
                }
                d.close();
                Trace.endSection();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Attach attach = (Attach) next;
                    boolean z2 = attach instanceof AttachImage;
                    boolean z3 = attach instanceof AttachVideo;
                    boolean z4 = z3 && ((AttachVideo) attach).b.Ia();
                    if (z3) {
                        AttachVideo attachVideo = (AttachVideo) attach;
                        if (attachVideo.b.isExternal() && myc0.f(attachVideo.b.getPlatform())) {
                            z = true;
                            boolean z5 = (z3 || ((AttachVideo) attach).b.R7() == null) ? false : true;
                            if (!z2 || (z4 && !z && !z5)) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    z = false;
                    if (z3) {
                    }
                    if (!z2) {
                    }
                    arrayList2.add(next);
                }
                return direction == Direction.BEFORE ? j5g.y0(arrayList2) : arrayList2;
            } catch (Throwable th) {
                d.close();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // xsna.mf20
    public final void x(int i, boolean z) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.b.a);
        sb.append(" \n            SET ");
        sb.append(ChannelMessageColumn.HAS_SPACE_AFTER.getKey());
        sb.append(" = ");
        sb.append(z);
        sb.append(" \n            WHERE ");
        sb.append(ChannelMessageColumn.LOCAL_ID.getKey());
        sb.append(" = ");
        sb.append(i);
        sb.append("\n            ");
        g2bVar.d.b().execSQL(xqm0.g(sb.toString()));
    }

    @Override // xsna.mf20
    public final lj30 y(int i, Peer peer) {
        long j = peer.b;
        StringBuilder sb = new StringBuilder("\n                SELECT ");
        g2b g2bVar = this.b;
        sb.append(g2bVar.f.b);
        sb.append(" FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n                WHERE ");
        sb.append(ChannelMessageColumn.CNV_MSG_ID.getKey());
        sb.append(" = ");
        sb.append(i);
        sb.append("\n                AND ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        sb.append(j);
        sb.append("\n            ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        try {
            return d.moveToFirst() ? w1b.b(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.p3b
    public final List<MsgFromChannel> z0(List<String> list, List<? extends MsgSyncState> list2) {
        g2b g2bVar = this.b;
        g2bVar.getClass();
        if (((ArrayList) list).isEmpty()) {
            return EmptyList.b;
        }
        String g0 = j5g.g0(list2, StringUtils.COMMA, null, null, 0, new x4(9), 30);
        Cursor d = g2bVar.d.b().d("SELECT * FROM " + g2bVar.b.a + " WHERE " + ChannelMessageColumn.GUID.getKey() + " IN (" + j5g.g0(list, StringUtils.COMMA, null, null, 0, new k60(10), 30) + ") AND " + ChannelMessageColumn.SYNC_STATE.getKey() + " IN(" + g0 + ')', null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(g2bVar.f.a(d));
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
}
