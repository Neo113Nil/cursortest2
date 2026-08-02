package xsna;

import android.database.Cursor;
import android.os.Trace;
import android.util.SparseArray;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.api.ChannelFilter;
import com.vk.dto.common.Direction;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsCountDb;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsHistoryMetaDb;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsRecommendationsDb;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.groups.AdminLevel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class gkb implements uib, mtx0 {
    public final ChannelsDb b;
    public final ChannelsHistoryMetaDb c;
    public final ChannelsRecommendationsDb d;
    public final mey e;
    public final dhl0<bdb, Long> f;
    public final dhl0<wfb, ChannelFilter> g;
    public final dhl0<com.vk.im.engine.models.channels.a, ChannelsCounters.Type> h;

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends ChannelsCounters.Type>, Map<ChannelsCounters.Type, ? extends com.vk.im.engine.models.channels.a>> {
        @Override // xsna.izs
        public final Map<ChannelsCounters.Type, ? extends com.vk.im.engine.models.channels.a> invoke(Collection<? extends ChannelsCounters.Type> collection) {
            ChannelsCounters.Type type;
            ChannelsCounters.Type type2;
            Collection<? extends ChannelsCounters.Type> collection2 = collection;
            ChannelsCountDb channelsCountDb = (ChannelsCountDb) this.receiver;
            channelsCountDb.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            ChannelsCountDb.Column column = ChannelsCountDb.Column.TYPE;
            Collection<? extends ChannelsCounters.Type> collection3 = collection2;
            ArrayList arrayList = new ArrayList(c5g.u(collection3, 10));
            Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ChannelsCounters.Type) it.next()).i()));
            }
            Cursor d = channelsCountDb.b.b().d(channelsCountDb.a.b(arrayList, column), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            ChannelsCounters.Type.a aVar = ChannelsCounters.Type.Companion;
                            ChannelsCountDb.Column column2 = ChannelsCountDb.Column.TYPE;
                            int A = fl3.A(d, column2.getKey());
                            aVar.getClass();
                            ChannelsCounters.Type[] values = ChannelsCounters.Type.values();
                            int length = values.length;
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    type = null;
                                    break;
                                }
                                type = values[i2];
                                if (type.i() == A) {
                                    break;
                                }
                                i2++;
                            }
                            int A2 = fl3.A(d, column2.getKey());
                            ChannelsCounters.Type[] values2 = ChannelsCounters.Type.values();
                            int length2 = values2.length;
                            while (true) {
                                if (i >= length2) {
                                    type2 = null;
                                    break;
                                }
                                type2 = values2[i];
                                if (type2.i() == A2) {
                                    break;
                                }
                                i++;
                            }
                            hashMap.put(type, new com.vk.im.engine.models.channels.a(type2, fl3.A(d, ChannelsCountDb.Column.COUNT.getKey()), fl3.A(d, ChannelsCountDb.Column.PHASE_ID.getKey())));
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
    }

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends com.vk.im.engine.models.channels.a>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends com.vk.im.engine.models.channels.a> collection) {
            Collection<? extends com.vk.im.engine.models.channels.a> collection2 = collection;
            ChannelsCountDb channelsCountDb = (ChannelsCountDb) this.receiver;
            channelsCountDb.getClass();
            if (!collection2.isEmpty()) {
                channelsCountDb.b.b().h(new v53(3, channelsCountDb, collection2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends bdb>> {
        @Override // xsna.izs
        public final Map<Long, ? extends bdb> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            ChannelsDb channelsDb = (ChannelsDb) this.receiver;
            channelsDb.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            ChannelsDb.Column column = ChannelsDb.Column.ID;
            Cursor d = channelsDb.b.b().d(channelsDb.a.b(collection2, column), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, ChannelsDb.Column.ID.getKey())), ChannelsDb.c(d));
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
    }

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Collection<? extends bdb>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends bdb> collection) {
            Collection<? extends bdb> collection2 = collection;
            ChannelsDb channelsDb = (ChannelsDb) this.receiver;
            channelsDb.getClass();
            if (!collection2.isEmpty()) {
                channelsDb.b.b().h(new fo6(6, channelsDb, collection2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Collection<? extends ChannelFilter>, Map<ChannelFilter, ? extends wfb>> {
        @Override // xsna.izs
        public final Map<ChannelFilter, ? extends wfb> invoke(Collection<? extends ChannelFilter> collection) {
            Collection<? extends ChannelFilter> collection2 = collection;
            ChannelsHistoryMetaDb channelsHistoryMetaDb = (ChannelsHistoryMetaDb) this.receiver;
            channelsHistoryMetaDb.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            ChannelsHistoryMetaDb.Column column = ChannelsHistoryMetaDb.Column.FILTER_ID;
            Collection<? extends ChannelFilter> collection3 = collection2;
            ArrayList arrayList = new ArrayList(c5g.u(collection3, 10));
            Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((ChannelFilter) it.next()).i()));
            }
            Cursor d = channelsHistoryMetaDb.b.b().d(channelsHistoryMetaDb.a.b(arrayList, column), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            ChannelFilter.a aVar = ChannelFilter.Companion;
                            int A = fl3.A(d, ChannelsHistoryMetaDb.Column.FILTER_ID.getKey());
                            aVar.getClass();
                            hashMap.put(ChannelFilter.a.a(A), ChannelsHistoryMetaDb.b(d));
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
    }

    /* compiled from: ChannelsStorageManagerImpl.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Collection<? extends wfb>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends wfb> collection) {
            Collection<? extends wfb> collection2 = collection;
            ChannelsHistoryMetaDb channelsHistoryMetaDb = (ChannelsHistoryMetaDb) this.receiver;
            channelsHistoryMetaDb.getClass();
            if (!collection2.isEmpty()) {
                channelsHistoryMetaDb.b.b().h(new az2(3, channelsHistoryMetaDb, collection2));
            }
            return s3q0.a;
        }
    }

    public gkb(tgl0 tgl0Var) {
        ChannelsDb channelsDb = new ChannelsDb(tgl0Var);
        this.b = channelsDb;
        ChannelsHistoryMetaDb channelsHistoryMetaDb = new ChannelsHistoryMetaDb(tgl0Var);
        this.c = channelsHistoryMetaDb;
        ChannelsCountDb channelsCountDb = new ChannelsCountDb(tgl0Var);
        this.d = new ChannelsRecommendationsDb(tgl0Var);
        this.e = tgl0Var.I0().k();
        this.f = new dhl0<>(100, null, new c2(10), new c(1, channelsDb, ChannelsDb.class, "getByIds", "getByIds(Ljava/util/Collection;)Ljava/util/Map;", 0), new d(1, channelsDb, ChannelsDb.class, "put", "put(Ljava/util/Collection;)V", 0), tgl0Var.I0());
        this.g = new dhl0<>(ChannelFilter.h().size(), null, new am0(19), new e(1, channelsHistoryMetaDb, ChannelsHistoryMetaDb.class, "getMeta", "getMeta(Ljava/util/Collection;)Ljava/util/Map;", 0), new f(1, channelsHistoryMetaDb, ChannelsHistoryMetaDb.class, "putMeta", "putMeta(Ljava/util/Collection;)V", 0), tgl0Var.I0());
        this.h = new dhl0<>(ChannelsCounters.Type.h().size(), null, new x50(7), new a(1, channelsCountDb, ChannelsCountDb.class, "getCount", "getCount(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, channelsCountDb, ChannelsCountDb.class, "putCount", "putCount(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    @Override // xsna.uib
    public final void A(bdb bdbVar) {
        dhl0<bdb, Long> dhl0Var = this.f;
        dhl0Var.getClass();
        dhl0Var.f(Collections.singletonList(bdbVar));
    }

    @Override // xsna.uib
    public final ChannelType B(long j) {
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        StringBuilder sb = new StringBuilder("SELECT ");
        sr.c(ChannelsDb.Column.TYPE, sb, " FROM ");
        sb.append(channelsDb.a.a);
        sb.append(" WHERE ");
        sb.append(ChannelsDb.Column.ID.getKey());
        sb.append(" = ?");
        String j2 = fl3.j(channelsDb.b.b().d(sb.toString(), new String[]{String.valueOf(j)}));
        ChannelType.Companion.getClass();
        return ChannelType.a.a(j2);
    }

    @Override // xsna.uib
    public final void C(long j) {
        this.f.a(Long.valueOf(j), new z90(12), new bjb(this, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cd A[Catch: all -> 0x01de, LOOP:0: B:32:0x01cd->B:34:0x01d3, LOOP_START, TryCatch #1 {all -> 0x01de, blocks: (B:30:0x01c7, B:32:0x01cd, B:34:0x01d3), top: B:29:0x01c7, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // xsna.uib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<bdb> D(aeb aebVar, ChannelFilter channelFilter, Direction direction, aeb aebVar2, List<? extends ChannelType> list, int i) {
        String str;
        String str2;
        int i2;
        String str3;
        Cursor d2;
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        String key = ChannelsDb.Column.WEIGHT.getKey();
        aeb aebVar3 = (aeb) jw5.w(aebVar, aebVar2);
        long j = aebVar3.b.b;
        aeb aebVar4 = (aeb) jw5.v(aebVar, aebVar2);
        long j2 = aebVar4.b.b;
        Direction direction2 = Direction.BEFORE;
        String str4 = direction == direction2 ? "DESC" : "ASC";
        String str5 = direction != direction2 ? "DESC" : "ASC";
        String a2 = i < 0 ? "" : lhg.a(i, "LIMIT ");
        StringBuilder sb = new StringBuilder(" AND ");
        sr.c(ChannelsDb.Column.IS_MEMBER, sb, " = ");
        sb.append(channelFilter != ChannelFilter.SUGGESTED ? 1 : 0);
        String sb2 = sb.toString();
        try {
            try {
                if (list != null) {
                    if ((!list.isEmpty() ? list : null) != null) {
                        StringBuilder sb3 = new StringBuilder(" AND ");
                        str = a2;
                        sr.c(ChannelsDb.Column.TYPE, sb3, " IN (");
                        str2 = ho8.a(sb3, j5g.g0(list, ", ", null, null, 0, new md(11), 30), ')');
                        if (str2 == null) {
                            str2 = "";
                        }
                        i2 = ChannelsDb.a.$EnumSwitchMapping$0[channelFilter.ordinal()];
                        String str6 = str5;
                        if (i2 != 1) {
                            str3 = " AND " + ChannelsDb.Column.IS_SUGGESTED.getKey() + " = 1";
                        } else if (i2 == 2) {
                            StringBuilder sb4 = new StringBuilder(" AND ");
                            sr.c(ChannelsDb.Column.IS_ARCHIVED, sb4, " = 0 AND ");
                            sb4.append(ChannelsDb.Column.IS_SUGGESTED.getKey());
                            sb4.append(" = 0");
                            str3 = sb4.toString();
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str3 = " AND " + ChannelsDb.Column.IS_ARCHIVED.getKey() + " = 1";
                        }
                        e0w b2 = channelsDb.b.b();
                        StringBuilder sb5 = new StringBuilder("\n            SELECT * FROM ");
                        n6j.b(sb5, channelsDb.a.a, "\n            WHERE (", key, " > ");
                        sb5.append(j);
                        sb5.append(" OR (");
                        sb5.append(key);
                        tj0.d(sb5, " = ", j, " AND ");
                        ChannelsDb.Column column = ChannelsDb.Column.ID;
                        sr.c(column, sb5, " <= ");
                        sb5.append(aebVar3.c);
                        sb5.append("))\n            AND (");
                        sb5.append(key);
                        tj0.d(sb5, " < ", j2, " OR (");
                        sb5.append(key);
                        sb5.append(" = ");
                        sb5.append(j2);
                        sb5.append(" AND ");
                        sb5.append(column.getKey());
                        sb5.append(" >= ");
                        sb5.append(aebVar4.c);
                        sb5.append("))\n            ");
                        sb5.append(sb2);
                        n6j.b(sb5, "\n            ", str3, "\n            ", str2);
                        sb5.append("\n            ORDER BY ");
                        sb5.append(key);
                        sb5.append(' ');
                        sb5.append(str4);
                        sb5.append(", ");
                        sb5.append(column.getKey());
                        sb5.append(' ');
                        sb5.append(str6);
                        d2 = b2.d(tdj.a(sb5, "\n            ", str, "\n            "), null);
                        ArrayList arrayList = new ArrayList(d2.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        if (d2.moveToFirst()) {
                            while (!d2.isAfterLast()) {
                                arrayList.add(ChannelsDb.c(d2));
                                d2.moveToNext();
                            }
                        }
                        return arrayList;
                    }
                }
                if (d2.moveToFirst()) {
                }
                return arrayList;
            } finally {
                d2.close();
            }
        } finally {
            Trace.endSection();
        }
        str = a2;
        str2 = null;
        if (str2 == null) {
        }
        i2 = ChannelsDb.a.$EnumSwitchMapping$0[channelFilter.ordinal()];
        String str62 = str5;
        if (i2 != 1) {
        }
        e0w b22 = channelsDb.b.b();
        StringBuilder sb52 = new StringBuilder("\n            SELECT * FROM ");
        n6j.b(sb52, channelsDb.a.a, "\n            WHERE (", key, " > ");
        sb52.append(j);
        sb52.append(" OR (");
        sb52.append(key);
        tj0.d(sb52, " = ", j, " AND ");
        ChannelsDb.Column column2 = ChannelsDb.Column.ID;
        sr.c(column2, sb52, " <= ");
        sb52.append(aebVar3.c);
        sb52.append("))\n            AND (");
        sb52.append(key);
        tj0.d(sb52, " < ", j2, " OR (");
        sb52.append(key);
        sb52.append(" = ");
        sb52.append(j2);
        sb52.append(" AND ");
        sb52.append(column2.getKey());
        sb52.append(" >= ");
        sb52.append(aebVar4.c);
        sb52.append("))\n            ");
        sb52.append(sb2);
        n6j.b(sb52, "\n            ", str3, "\n            ", str2);
        sb52.append("\n            ORDER BY ");
        sb52.append(key);
        sb52.append(' ');
        sb52.append(str4);
        sb52.append(", ");
        sb52.append(column2.getKey());
        sb52.append(' ');
        sb52.append(str62);
        d2 = b22.d(tdj.a(sb52, "\n            ", str, "\n            "), null);
        ArrayList arrayList2 = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
    }

    @Override // xsna.uib
    public final void E(int i) {
        this.e.putInt("COLLAPSED_RECOMMENDATIONS_VERSION", i);
    }

    @Override // xsna.uib
    public final void F(long j) {
        Long valueOf = Long.valueOf(j);
        dhl0<bdb, Long> dhl0Var = this.f;
        dhl0Var.f.u(new ozk0(1, dhl0Var, valueOf));
        ChannelsDb channelsDb = this.b;
        channelsDb.b.b().execSQL("DELETE FROM " + channelsDb.a.a + " WHERE " + ChannelsDb.Column.ID.getKey() + " = " + j);
    }

    @Override // xsna.uib
    public final void G(long j, String str) {
        this.f.a(Long.valueOf(j), new kf5(str, 1), new pjb(this, j, str, 0));
    }

    @Override // xsna.uib
    public final void H(final long j, final boolean z) {
        this.f.a(Long.valueOf(j), new xib(z, 0), new izs() { // from class: xsna.yib
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sr.c(ChannelsDb.Column.IS_HIDDEN_IN_ALL_FOLDER, sb, " = ? \n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n        "), new Object[]{Boolean.valueOf(z), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void I(final long j, final AdminLevel adminLevel, final boolean z) {
        this.f.a(Long.valueOf(j), new lv2(z, adminLevel), new izs() { // from class: xsna.qjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sr.c(ChannelsDb.Column.ADMIN_LEVEL, sb, " = ?, ");
                sr.c(ChannelsDb.Column.CAN_POST, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n        "), new Object[]{Integer.valueOf(adminLevel.h()), Long.valueOf(j), Boolean.valueOf(z)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void J(final long j, final boolean z) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.ijb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, Boolean.valueOf(z), null, null, null, null, false, false, -16777217, 7);
            }
        }, new izs() { // from class: xsna.jjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.CAN_COMMENT, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(z ? 1 : 0), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void K(final int i, final int i2, final long j) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.fjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return bdb.a((bdb) obj, 0, 0, i, 0, i2, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -41, 7);
            }
        }, new izs() { // from class: xsna.gjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                gkb.this.b.b(i, i2, j);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void L(final int i, final long j) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.bkb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return bdb.a((bdb) obj, 0, 0, 0, i, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -17, 7);
            }
        }, new izs() { // from class: xsna.ckb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.COUNT_UNREAD, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void M(ChannelFilter channelFilter) {
        String str;
        this.f.c();
        this.g.c();
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        int i = ChannelsDb.a.$EnumSwitchMapping$0[channelFilter.ordinal()];
        if (i == 1) {
            str = "WHERE " + ChannelsDb.Column.IS_SUGGESTED.getKey() + " = 1";
        } else if (i == 2) {
            StringBuilder sb = new StringBuilder("WHERE ");
            sr.c(ChannelsDb.Column.IS_ARCHIVED, sb, " = 0 AND ");
            sb.append(ChannelsDb.Column.IS_SUGGESTED.getKey());
            sb.append(" = 0");
            str = sb.toString();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "WHERE " + ChannelsDb.Column.IS_ARCHIVED.getKey() + " = 1";
        }
        channelsDb.b.b().execSQL("DELETE FROM " + channelsDb.a.a + ' ' + str);
        ChannelsHistoryMetaDb channelsHistoryMetaDb = this.c;
        channelsHistoryMetaDb.b.b().execSQL("DELETE FROM " + channelsHistoryMetaDb.a.a + " WHERE " + ChannelsHistoryMetaDb.Column.FILTER_ID.getKey() + " = " + channelFilter.i());
    }

    @Override // xsna.uib
    public final int N() {
        return this.e.getInt("COLLAPSED_RECOMMENDATIONS_VERSION", 0);
    }

    @Override // xsna.uib
    public final void O(final int i, final long j) {
        this.f.a(Long.valueOf(j), new ojb(i, 0), new izs() { // from class: xsna.yjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sr.c(ChannelsDb.Column.PINNED_MSGS_PHASE, sb, " = ? \n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n        "), new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final int P() {
        return this.e.getInt("CHANNELS_RECOMMENDATIONS_VERSION", 1);
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.f.c();
        this.g.c();
        this.h.c();
    }

    @Override // xsna.uib
    public final void R(long j) {
        this.f.a(Long.valueOf(j), new dz(6), new qu(this, 16));
    }

    @Override // xsna.uib
    public final void S() {
        ChannelsRecommendationsDb channelsRecommendationsDb = this.d;
        channelsRecommendationsDb.b.b().execSQL("DELETE FROM " + channelsRecommendationsDb.a.a);
    }

    @Override // xsna.uib
    public final void T(final long j, final String str) {
        this.f.a(Long.valueOf(j), new vjb(str, 0), new izs() { // from class: xsna.wjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.TITLE, sb, " = ?\n            WHERE ");
                String d2 = bo.d(ChannelsDb.Column.ID, sb, " = ?\n            ");
                channelsDb.b.b().execSQL(d2, new Object[]{str, Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void U(final int i, long j) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.xjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                bdb bdbVar = (bdb) obj;
                vcb vcbVar = bdbVar.i;
                return bdb.a(bdbVar, 0, 0, 0, 0, 0, 0, vcb.b(vcbVar, vjm.e(vcbVar.b, i, 0, 2), 0L, 2), null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -129, 7);
            }
        }, new o46(this, j, 1));
    }

    @Override // xsna.uib
    public final void V(int i, long j) {
        this.f.a(Long.valueOf(j), new xl1(i, 1), new akb(this, j, 0));
    }

    @Override // xsna.uib
    public final HashMap W() {
        StringBuilder sb = new StringBuilder("SELECT ");
        ChannelsRecommendationsDb channelsRecommendationsDb = this.d;
        sgl0 sgl0Var = channelsRecommendationsDb.a;
        sb.append(sgl0Var.c());
        sb.append(" FROM ");
        sb.append(sgl0Var.a);
        Cursor d2 = channelsRecommendationsDb.b.b().d(sb.toString(), null);
        HashMap hashMap = new HashMap(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        hashMap.put(Long.valueOf(fl3.C(d2, ChannelsRecommendationsDb.Column.ID.getKey())), ChannelsRecommendationsDb.b(d2));
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

    @Override // xsna.uib
    public final void X(final long j, final boolean z) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.mjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, z, -1, 6);
            }
        }, new izs() { // from class: xsna.njb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sr.c(ChannelsDb.Column.CAN_POST_DONUT, sb, " = ? \n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n        "), new Object[]{Boolean.valueOf(z), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void Y(long j, ChannelNotificationsSettings channelNotificationsSettings) {
        this.f.a(Long.valueOf(j), new ay0(channelNotificationsSettings, 21), new ag0(this, j, channelNotificationsSettings));
    }

    @Override // xsna.uib
    public final List Z(vcb vcbVar, ChannelFilter channelFilter, Direction direction, vcb vcbVar2) {
        String str;
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        String key = ChannelsDb.Column.SORT_ID_SERVER.getKey();
        vcb vcbVar3 = (vcb) jw5.w(vcbVar, vcbVar2);
        long a2 = vcbVar3.b.a();
        vcb vcbVar4 = (vcb) jw5.v(vcbVar, vcbVar2);
        long a3 = vcbVar4.b.a();
        Direction direction2 = Direction.BEFORE;
        String str2 = direction == direction2 ? "DESC" : "ASC";
        String str3 = direction != direction2 ? "DESC" : "ASC";
        int i = ChannelsDb.a.$EnumSwitchMapping$0[channelFilter.ordinal()];
        if (i == 1) {
            str = " AND " + ChannelsDb.Column.IS_SUGGESTED.getKey() + " = 1";
        } else if (i == 2) {
            StringBuilder sb = new StringBuilder(" AND ");
            sr.c(ChannelsDb.Column.IS_ARCHIVED, sb, " = 0 AND ");
            sb.append(ChannelsDb.Column.IS_SUGGESTED.getKey());
            sb.append(" = 0");
            str = sb.toString();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = " AND " + ChannelsDb.Column.IS_ARCHIVED.getKey() + " = 1";
        }
        e0w b2 = channelsDb.b.b();
        StringBuilder sb2 = new StringBuilder("\n            SELECT * FROM ");
        n6j.b(sb2, channelsDb.a.a, "\n            WHERE (", key, " > ");
        sb2.append(a2);
        sb2.append(" OR (");
        sb2.append(key);
        tj0.d(sb2, " = ", a2, " AND ");
        ChannelsDb.Column column = ChannelsDb.Column.ID;
        sr.c(column, sb2, " <= ");
        sb2.append(vcbVar3.c);
        sb2.append("))\n            AND (");
        sb2.append(key);
        tj0.d(sb2, " < ", a3, " OR (");
        sb2.append(key);
        sb2.append(" = ");
        sb2.append(a3);
        sb2.append(" AND ");
        sb2.append(column.getKey());
        sb2.append(" >= ");
        sb2.append(vcbVar4.c);
        sb2.append("))\n            AND ");
        sb2.append(ChannelsDb.Column.IS_MEMBER.getKey());
        sb2.append(" = 1\n            ");
        sb2.append(str);
        sb2.append("\n            ORDER BY ");
        sb2.append(key);
        sb2.append(' ');
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(column.getKey());
        sb2.append(' ');
        sb2.append(str3);
        sb2.append("\n            ");
        sb2.append("");
        sb2.append("\n            ");
        Cursor d2 = b2.d(sb2.toString(), null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(ChannelsDb.c(d2));
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

    @Override // xsna.uib
    public final void a(Collection<bdb> collection) {
        this.f.f(collection);
    }

    @Override // xsna.uib
    public final void a0(final long j, final ChannelBanInfo channelBanInfo) {
        this.f.a(Long.valueOf(j), new zx(channelBanInfo, 17), new izs() { // from class: xsna.hjb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelBanInfo.Reason reason;
                ChannelsDb channelsDb = gkb.this.b;
                channelsDb.getClass();
                ChannelBanInfo channelBanInfo2 = channelBanInfo;
                Integer num = null;
                String str = channelBanInfo2 != null ? channelBanInfo2.b : null;
                Integer valueOf = channelBanInfo2 != null ? Integer.valueOf(channelBanInfo2.c) : null;
                if (channelBanInfo2 != null && (reason = channelBanInfo2.d) != null) {
                    num = Integer.valueOf(reason.i());
                }
                StringBuilder sb = new StringBuilder("\n                UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n                SET ");
                sr.c(ChannelsDb.Column.BAN_COMMENT, sb, " = ?, ");
                sr.c(ChannelsDb.Column.BAN_END_DATE, sb, " = ?, ");
                sr.c(ChannelsDb.Column.BAN_REASON, sb, " = ? \n                WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{str, valueOf, num, Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void b0(final int i, final long j) {
        this.f.a(Long.valueOf(j), new tjb(i, 0), new izs() { // from class: xsna.ujb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.COUNT_POSTPONED, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final bdb c(long j) {
        return d(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.uib
    public final void c0(Collection<wfb> collection) {
        this.g.f(collection);
    }

    @Override // xsna.uib
    public final Map<Long, bdb> d(Collection<Long> collection) {
        return collection.isEmpty() ? jgp.b : this.f.e(collection);
    }

    @Override // xsna.uib
    public final Collection<bdb> d0() {
        StringBuilder sb = new StringBuilder("\n            SELECT *\n            FROM ");
        ChannelsDb channelsDb = this.b;
        sb.append(channelsDb.a.a);
        sb.append("\n            WHERE ");
        sr.c(ChannelsDb.Column.IS_ARCHIVED, sb, " = 0 \n            AND ");
        sr.c(ChannelsDb.Column.IS_MEMBER, sb, " = 1\n            AND (");
        sr.c(ChannelsDb.Column.READ_TILL_IN_MSG_CNV_ID_LOCAL, sb, " > ");
        sr.c(ChannelsDb.Column.READ_TILL_IN_MSG_CNV_ID, sb, " \n            OR (");
        sr.c(ChannelsDb.Column.NOTIFICATIONS_IS_ENABLED_LOCAL, sb, " IS NOT NULL AND ");
        Cursor d2 = channelsDb.b.b().d(bo.d(ChannelsDb.Column.NOTIFICATIONS_DISABLED_UNTIL_LOCAL, sb, " IS NOT NULL))\n            "), null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(ChannelsDb.c(d2));
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

    @Override // xsna.uib
    public final int e() {
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        StringBuilder sb = new StringBuilder("sort_id_local IS NOT NULL AND ((sort_id_local & ");
        long j = vjm.k;
        String b2 = efz.b(j, ") > 0)", sb);
        String a2 = qlb0.a(j, "((sort_id_server & ", ") > 0) AND sort_id_local IS NULL");
        StringBuilder sb2 = new StringBuilder("SELECT COUNT(*) FROM ");
        n6j.b(sb2, channelsDb.a.a, " WHERE ", b2, " OR ");
        sb2.append(a2);
        Integer J = fl3.J(channelsDb.b.b().d(sb2.toString(), null));
        if (J != null) {
            return J.intValue();
        }
        return 0;
    }

    @Override // xsna.uib
    public final List<Long> e0(boolean z) {
        String str;
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        if (z) {
            StringBuilder sb = new StringBuilder("WHERE ");
            sr.c(ChannelsDb.Column.IS_ARCHIVED, sb, " = 0 AND ");
            sb.append(ChannelsDb.Column.IS_MEMBER.getKey());
            sb.append(" = 1");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder("SELECT ");
        sr.c(ChannelsDb.Column.ID, sb2, " FROM ");
        sb2.append(channelsDb.a.a);
        sb2.append(' ');
        sb2.append(str);
        Cursor d2 = channelsDb.b.b().d(sb2.toString(), null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(Long.valueOf(fl3.C(d2, ChannelsDb.Column.ID.getKey())));
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

    @Override // xsna.uib
    public final void f(final int i, long j) {
        this.f.a(Long.valueOf(j), new izs() { // from class: xsna.fkb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                bdb bdbVar = (bdb) obj;
                vcb vcbVar = bdbVar.j;
                if (vcbVar == null) {
                    vcbVar = bdbVar.i;
                }
                return bdb.a(bdbVar, 0, 0, 0, 0, 0, 0, null, vcb.b(vcbVar, vcbVar.b.j(i), 0L, 2), null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -257, 7);
            }
        }, new vib(this, j));
    }

    @Override // xsna.uib
    public final void g(int i, long j) {
        this.f.a(Long.valueOf(j), new zjb(i, 0), new abb(i, j, this));
    }

    @Override // xsna.uib
    public final void i(Collection<com.vk.im.engine.models.channels.a> collection) {
        this.h.f(collection);
    }

    @Override // xsna.uib
    public final void j(final int i, final long j) {
        this.f.a(Long.valueOf(j), new bm1(i, 2), new izs() { // from class: xsna.dkb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                vjm vjmVar;
                bdb bdbVar = (bdb) obj;
                vcb vcbVar = bdbVar.j;
                vjm e2 = (vcbVar == null || (vjmVar = vcbVar.b) == null) ? null : vjm.e(vjmVar, 0, i, 1);
                if (e2 != null) {
                    this.b.d(j, vcb.b(bdbVar.j, e2, 0L, 2));
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final Map<ChannelsCounters.Type, com.vk.im.engine.models.channels.a> k(Collection<? extends ChannelsCounters.Type> collection) {
        return this.h.e(collection);
    }

    @Override // xsna.uib
    public final void l(ChannelFilter channelFilter) {
        this.g.a(channelFilter, new rf(14), new mp3(4, this, channelFilter));
    }

    @Override // xsna.uib
    public final void m(Map<Long, gbb> map) {
        ChannelsRecommendationsDb channelsRecommendationsDb = this.d;
        channelsRecommendationsDb.b.b().h(new az2(4, channelsRecommendationsDb, (LinkedHashMap) map));
    }

    @Override // xsna.uib
    public final void n(final int i, final long j) {
        this.f.a(Long.valueOf(j), new kjb(i, 0), new izs() { // from class: xsna.ljb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append("\n            SET ");
                sr.c(ChannelsDb.Column.MEMBERS_COUNT, sb, " = ?\n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final wfb o(ChannelFilter channelFilter) {
        return this.g.d(channelFilter);
    }

    @Override // xsna.uib
    public final Integer p(long j) {
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        StringBuilder sb = new StringBuilder("SELECT ");
        sr.c(ChannelsDb.Column.PHASE, sb, " FROM ");
        sb.append(channelsDb.a.a);
        sb.append(" WHERE ");
        sb.append(ChannelsDb.Column.ID.getKey());
        sb.append(" = ?");
        return fl3.J(channelsDb.b.b().d(sb.toString(), new String[]{String.valueOf(j)}));
    }

    @Override // xsna.uib
    public final void q(final long j, final ChannelActionInProgress channelActionInProgress, final Boolean bool) {
        this.f.a(Long.valueOf(j), new com.vk.movika.sdk.base.logic.interactor.i(6, bool, channelActionInProgress), new izs() { // from class: xsna.cjb
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
            
                if (r2 == null) goto L10;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                String str;
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sb.append(ChannelsDb.Column.ACTION_IN_PROGRESS.getKey());
                sb.append(" = ");
                sb.append(channelActionInProgress.i());
                sb.append(" \n            ");
                Boolean bool2 = bool;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    StringBuilder sb2 = new StringBuilder(", ");
                    sr.c(ChannelsDb.Column.IS_MEMBER, sb2, " = ");
                    sb2.append(booleanValue ? 1L : 0L);
                    str = sb2.toString();
                }
                str = "";
                sb.append(str);
                sb.append(" \n            WHERE ");
                sb.append(ChannelsDb.Column.ID.getKey());
                sb.append(" = ");
                sb.append(j);
                sb.append("\n            ");
                channelsDb.b.b().execSQL(xqm0.g(sb.toString()));
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void r(final long j, final ChannelNotificationsSettings channelNotificationsSettings) {
        this.f.a(Long.valueOf(j), new com.vk.movika.sdk.base.observable.p(channelNotificationsSettings, 21), new izs() { // from class: xsna.ekb
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
            
                if (r2 == null) goto L10;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                String str;
                String l;
                ChannelsDb channelsDb = gkb.this.b;
                channelsDb.getClass();
                ChannelNotificationsSettings channelNotificationsSettings2 = channelNotificationsSettings;
                String str2 = "NULL";
                if (channelNotificationsSettings2 != null) {
                    str = Long.valueOf(channelNotificationsSettings2.b ? 1L : 0L).toString();
                }
                str = "NULL";
                if (channelNotificationsSettings2 != null && (l = Long.valueOf(channelNotificationsSettings2.c).toString()) != null) {
                    str2 = l;
                }
                channelsDb.b.b().execSQL(xqm0.g("\n            UPDATE " + channelsDb.a.a + "\n            SET " + ChannelsDb.Column.NOTIFICATIONS_IS_ENABLED_LOCAL.getKey() + " = " + str + ",\n                " + ChannelsDb.Column.NOTIFICATIONS_DISABLED_UNTIL_LOCAL.getKey() + " = " + str2 + "\n            WHERE " + ChannelsDb.Column.ID.getKey() + " = " + j + "\n            "));
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void s(long j, long j2) {
        this.f.a(Long.valueOf(j), new zib(j2, 0), new ajb(this, j, 0));
    }

    @Override // xsna.uib
    public final void t(int i) {
        this.e.putInt("CHANNELS_RECOMMENDATIONS_VERSION", i);
    }

    @Override // xsna.uib
    public final void u(final long j, final aeb aebVar) {
        this.f.a(Long.valueOf(j), new t6(aebVar, 17), new izs() { // from class: xsna.wib
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ChannelsDb channelsDb = gkb.this.b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n            SET ");
                sr.c(ChannelsDb.Column.WEIGHT, sb, " = ? \n            WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Long[]{Long.valueOf(aebVar.b.b), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void v(int i, long j) {
        int i2 = 0;
        this.f.a(Long.valueOf(j), new rjb(i, i2), new sjb(this, j, i2));
    }

    @Override // xsna.uib
    public final void w(final long j) {
        this.f.a(Long.valueOf(j), new qt0(10), new izs() { // from class: xsna.ejb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                bdb bdbVar = (bdb) obj;
                gkb.this.b.b(bdbVar.e, bdbVar.g, j);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.uib
    public final void x(long j, vcb vcbVar) {
        this.f.a(Long.valueOf(j), new d7(vcbVar, 19), new djb(this, j, vcbVar));
    }

    @Override // xsna.uib
    public final SparseArray<bdb> y() {
        ChannelsDb channelsDb = this.b;
        channelsDb.getClass();
        StringBuilder sb = new StringBuilder("sort_id_local IS NOT NULL AND ((sort_id_local & ");
        long j = vjm.k;
        String b2 = efz.b(j, ") > 0)", sb);
        String a2 = qlb0.a(j, "((sort_id_server & ", ") > 0) AND sort_id_local IS NULL");
        StringBuilder sb2 = new StringBuilder("SELECT * FROM ");
        n6j.b(sb2, channelsDb.a.a, " WHERE ", b2, " OR ");
        sb2.append(a2);
        Cursor d2 = channelsDb.b.b().d(sb2.toString(), null);
        SparseArray<bdb> sparseArray = new SparseArray<>(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        sparseArray.put(fl3.A(d2, ChannelsDb.Column.ID.getKey()), ChannelsDb.c(d2));
                        d2.moveToNext();
                    }
                }
                return sparseArray;
            } finally {
                d2.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.uib
    public final void z(ChannelFilter channelFilter, vcb vcbVar) {
        this.g.a(channelFilter, new u8(vcbVar, 19), new f55(this, channelFilter, vcbVar, 1));
    }
}
