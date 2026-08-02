package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.users.UserStorageModel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import xsna.ehq0;

/* compiled from: UsersStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class b2r0 implements x1r0, mtx0 {
    public final tgl0 b;
    public final dhl0<UserStorageModel, Long> c;

    /* compiled from: UsersStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends UserStorageModel>> {
        @Override // xsna.izs
        public final Map<Long, ? extends UserStorageModel> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            b2r0 b2r0Var = (b2r0) this.receiver;
            b2r0Var.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            Cursor d = b2r0Var.b.b().d(air.b(')', "SELECT * FROM users WHERE id IN(", p4g.k(collection2, StringUtils.COMMA, null)), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "id")), sgq0.a(d));
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

    /* compiled from: UsersStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends UserStorageModel>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends UserStorageModel> collection) {
            Collection<? extends UserStorageModel> collection2 = collection;
            b2r0 b2r0Var = (b2r0) this.receiver;
            b2r0Var.getClass();
            if (!collection2.isEmpty()) {
                b2r0Var.b.b().h(new qm90(13, b2r0Var, collection2));
            }
            return s3q0.a;
        }
    }

    public b2r0(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(5000, tgl0Var.c(UserStorageModel.class), new w9l0(6), new a(1, this, b2r0.class, "getFromDb", "getFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, this, b2r0.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.x1r0
    public final void a(Collection<UserStorageModel> collection) {
        this.c.f(collection);
    }

    @Override // xsna.x1r0
    public final UserStorageModel b(long j) {
        return this.c.e(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.x1r0
    public final Map<Long, UserStorageModel> c(Collection<Long> collection) {
        return this.c.e(collection);
    }

    @Override // xsna.x1r0
    public final void d(final UserId userId, final OnlineInfo onlineInfo, final long j) {
        this.c.a(Long.valueOf(userId.b), new mdm0(onlineInfo, 10), new izs() { // from class: xsna.z1r0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long i;
                int i2;
                OnlineInfo onlineInfo2 = OnlineInfo.this;
                Integer valueOf = Integer.valueOf(ehq0.b(onlineInfo2));
                boolean z = onlineInfo2 instanceof VisibleStatus;
                if (z) {
                    i = ((VisibleStatus) onlineInfo2).b;
                } else {
                    if (!(onlineInfo2 instanceof InvisibleStatus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = ((InvisibleStatus) onlineInfo2).b.i();
                }
                Long valueOf2 = Long.valueOf(i);
                if (z) {
                    i2 = ((VisibleStatus) onlineInfo2).d;
                } else {
                    if (!(onlineInfo2 instanceof InvisibleStatus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 0;
                }
                this.b.b().execSQL("UPDATE users\nSET online_type = ?, online_last_seen = ?, online_app_id = ?, sync_time_online = ?\nWHERE id = ? AND online_type >= 0", new Object[]{valueOf, valueOf2, Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(userId.b)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.x1r0
    public final Collection<Long> e() {
        return t(1, 3);
    }

    @Override // xsna.x1r0
    public final irs f(Peer peer) {
        irs irsVar;
        Cursor d = this.b.b().d("SELECT mutual_friends_ids, sync_time FROM mutual_friends WHERE target_id = ?", new Long[]{Long.valueOf(peer.b)});
        try {
            if (d.moveToFirst()) {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                ArrayList<Long> f = new Serializer.d(new DataInputStream(new ByteArrayInputStream(d.getBlob(d.getColumnIndexOrThrow("mutual_friends_ids"))))).f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<Long> it = f.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                irsVar = new irs(arrayList, fl3.C(d, "sync_time"));
            } else {
                irsVar = null;
            }
            d.close();
            return irsVar;
        } catch (Throwable th) {
            d.close();
            throw th;
        }
    }

    @Override // xsna.x1r0
    public final void g(final int i, final long j) {
        this.c.a(Long.valueOf(j), new u34(i, 2), new izs() { // from class: xsna.a2r0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE users SET friend_status = ? WHERE id = ?", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.x1r0
    public final void h(long j, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it.next()).b));
        }
        this.b.I0().u(new ddm(arrayList2, j, 3));
    }

    @Override // xsna.x1r0
    public final void i(final long j, final Long l) {
        this.c.a(Long.valueOf(j), new ksg0(l, 15), new izs() { // from class: xsna.y1r0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE users SET contact_id = ? WHERE id = ?", new Long[]{l, Long.valueOf(j)});
                return s3q0.a;
            }
        });
    }

    @Override // xsna.x1r0
    public final void j(AccountInfo accountInfo) {
        this.c.a(Long.valueOf(accountInfo.b), new mvl0(accountInfo, 6), new wgm0(this, 9));
    }

    @Override // xsna.x1r0
    public final void k() {
        Cursor d = this.b.b().d("\n                 SELECT id \n                 FROM users\n                 WHERE deactivated=0\n                 LIMIT 2147483647\n                 ", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(Long.valueOf(d.getLong(0)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                this.c.b(arrayList, new jz30(15), new mcj0(this, 17));
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.x1r0
    public final void l(Collection<Long> collection) {
        String str;
        boolean isEmpty = collection.isEmpty();
        if (isEmpty) {
            str = "";
        } else {
            if (isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            str = "AND id NOT IN (" + p4g.k(collection, StringUtils.COMMA, null) + ')';
        }
        this.c.c();
        this.b.b().execSQL(xqm0.g("\n            UPDATE users\n            SET online_type = 0\n            WHERE id in (SELECT id FROM users WHERE online_type > 0)\n                " + str + "\n            "));
    }

    @Override // xsna.x1r0
    public final Long m() {
        return this.b.I0().k().h("friends_list_save_time");
    }

    @Override // xsna.x1r0
    public final void n(Peer peer, List<? extends Peer> list, long j) {
        Object[] objArr = new Serializable[3];
        objArr[0] = Long.valueOf(peer.b);
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        List<? extends Peer> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
        new Serializer.e(new DataOutputStream(byteArrayOutputStream)).a0(arrayList);
        objArr[1] = byteArrayOutputStream.toByteArray();
        objArr[2] = Long.valueOf(j);
        this.b.b().i("REPLACE INTO mutual_friends(target_id,mutual_friends_ids,sync_time) VALUES(?,?,?)", objArr);
    }

    @Override // xsna.x1r0
    public final void o(long j) {
        this.b.I0().k().j("friends_list_save_time", j);
    }

    @Override // xsna.x1r0
    public final Long p() {
        return this.b.I0().k().h("friends_suggestions_sync_time");
    }

    @Override // xsna.x1r0
    public final ArrayList q() {
        String string = this.b.I0().k().getString("friends_suggestions_ids");
        ArrayList arrayList = null;
        ArrayList L = string == null ? null : f370.L(new JSONArray(string));
        if (L != null) {
            arrayList = new ArrayList(c5g.u(L, 10));
            Iterator it = L.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
        }
        return arrayList;
    }

    @Override // xsna.x1r0
    public final void r() {
        this.c.c();
        this.b.b().execSQL(xqm0.g("\n            UPDATE users\n            SET sync_time_overall = 0\n            WHERE sync_time_overall <> 0\n            "));
    }

    @Override // xsna.x1r0
    public final void s(Collection<Long> collection, Platform platform, long j, long j2) {
        if (collection.isEmpty()) {
            return;
        }
        this.c.c();
        StringBuilder sb = new StringBuilder("\n            UPDATE users\n            SET online_type = ");
        int i = ehq0.a.$EnumSwitchMapping$0[platform.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        sb.append(i2);
        sb.append(",\n                online_last_seen = ");
        sb.append(j);
        tj0.d(sb, ",\n                sync_time_online = ", j2, "\n            WHERE id IN (");
        sb.append(p4g.k(collection, StringUtils.COMMA, null));
        sb.append(")\n                AND online_type >= 0\n            ");
        this.b.b().execSQL(xqm0.g(sb.toString()));
    }

    @Override // xsna.x1r0
    public final Collection<Long> t(int... iArr) {
        if (iArr.length == 0) {
            return EmptyList.b;
        }
        Cursor d = this.b.b().d(zr.a("\n                 SELECT id \n                 FROM users\n                 WHERE friend_status IN (", rl3.X(StringUtils.COMMA, iArr), ") AND id NOT IN (SELECT id FROM users WHERE deactivated > 0)\n                 "), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(Long.valueOf(d.getLong(0)));
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

    @Override // xsna.x1r0
    public final void u(Peer.User user) {
        this.c.a(Long.valueOf(user.d), new dl70(24), new il7(24, user, this));
    }
}
