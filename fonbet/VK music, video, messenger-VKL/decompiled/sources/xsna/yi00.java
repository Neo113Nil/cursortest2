package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.internal.storage.structure.Table;
import com.vk.im.engine.models.groups.ManagedGroup;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ManagedGroupsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class yi00 implements xi00, mtx0 {
    public final tgl0 b;
    public final dhl0<ManagedGroup, Long> c;

    /* compiled from: ManagedGroupsStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends ManagedGroup>> {
        @Override // xsna.izs
        public final Map<Long, ? extends ManagedGroup> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            yi00 yi00Var = (yi00) this.receiver;
            yi00Var.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            Cursor d = yi00Var.b.b().d("SELECT * FROM " + Table.MANAGED_GROUPS.i() + " WHERE id IN(" + p4g.k(collection2, StringUtils.COMMA, null) + ')', null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "id")), yi00.l(d));
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

    /* compiled from: ManagedGroupsStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends ManagedGroup>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends ManagedGroup> collection) {
            yi00 yi00Var = (yi00) this.receiver;
            yi00Var.b.b().h(new o43(25, yi00Var, collection));
            return s3q0.a;
        }
    }

    public yi00(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(100, tgl0Var.c(ManagedGroup.class), new j5n(11), new a(1, this, yi00.class, "getFromDb", "getFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, this, yi00.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    public static void k(SQLiteStatement sQLiteStatement, ManagedGroup managedGroup) {
        sQLiteStatement.bindLong(1, managedGroup.a.d);
        sQLiteStatement.bindString(2, managedGroup.b);
        sQLiteStatement.bindLong(3, managedGroup.c.i());
        sQLiteStatement.bindLong(4, managedGroup.d.i());
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        sQLiteStatement.bindBlob(5, Serializer.b.e(managedGroup.e));
        rdi.i(sQLiteStatement, 6, managedGroup.f);
        rdi.i(sQLiteStatement, 7, managedGroup.g);
        sQLiteStatement.bindLong(8, managedGroup.h);
        sQLiteStatement.bindString(9, managedGroup.i);
    }

    public static ManagedGroup l(Cursor cursor) {
        ImageList imageList;
        Object obj;
        byte[] v = fl3.v(cursor, "avatar");
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Group c = Peer.a.c(fl3.C(cursor, "id"));
        String E = fl3.E(cursor, "title");
        Object obj2 = null;
        if (v == null) {
            imageList = new ImageList(null, 1, null);
        } else {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            imageList = (ImageList) Serializer.b.a(v, ImageList.class.getClassLoader());
        }
        ImageList imageList2 = imageList;
        boolean x = fl3.x(cursor, "avatar_is_nft");
        ManagedGroup.Type.a aVar = ManagedGroup.Type.Companion;
        int A = fl3.A(cursor, "type");
        aVar.getClass();
        Iterator<E> it = ManagedGroup.Type.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ManagedGroup.Type) obj).i() == A) {
                break;
            }
        }
        ManagedGroup.Type type = (ManagedGroup.Type) obj;
        if (type == null) {
            type = ManagedGroup.Type.GROUP;
        }
        ManagedGroup.Type type2 = type;
        ManagedGroup.Access.a aVar2 = ManagedGroup.Access.Companion;
        int A2 = fl3.A(cursor, "access");
        aVar2.getClass();
        Iterator<E> it2 = ManagedGroup.Access.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((ManagedGroup.Access) next).i() == A2) {
                obj2 = next;
                break;
            }
        }
        ManagedGroup.Access access = (ManagedGroup.Access) obj2;
        if (access == null) {
            access = ManagedGroup.Access.OPEN;
        }
        return new ManagedGroup(c, E, type2, access, imageList2, x, fl3.x(cursor, "is_muted"), fl3.A(cursor, "unread_count"), fl3.E(cursor, "activity"));
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.xi00
    public final boolean a() {
        return this.b.I0().k().getBoolean("managed_groups_msg_push_allowed", true);
    }

    @Override // xsna.xi00
    public final ManagedGroup b(long j) {
        return this.c.d(Long.valueOf(j));
    }

    @Override // xsna.xi00
    public final di00 c() {
        tgl0 tgl0Var = this.b;
        Integer e = tgl0Var.I0().k().e("managed_groups_dialogs_unmuted_count");
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        Integer e2 = tgl0Var.I0().k().e("managed_groups_dialogs_unmuted_phase");
        return new di00(intValue, e2 != null ? e2.intValue() : 0);
    }

    @Override // xsna.xi00
    public final void d(ManagedGroup managedGroup) {
        dhl0<ManagedGroup, Long> dhl0Var = this.c;
        dhl0Var.getClass();
        dhl0Var.f(Collections.singletonList(managedGroup));
    }

    @Override // xsna.xi00
    public final void e(Collection<ManagedGroup> collection) {
        this.b.b().f("managed_groups", null, null);
        dhl0<ManagedGroup, Long> dhl0Var = this.c;
        dhl0Var.c();
        dhl0Var.f(collection);
    }

    @Override // xsna.xi00
    public final di00 f() {
        tgl0 tgl0Var = this.b;
        Integer e = tgl0Var.I0().k().e("managed_groups_unread_dialogs_count");
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        Integer e2 = tgl0Var.I0().k().e("managed_groups_dialogs_phase");
        return new di00(intValue, e2 != null ? e2.intValue() : 0);
    }

    @Override // xsna.xi00
    public final void g(boolean z) {
        throw null;
    }

    @Override // xsna.xi00
    public final List<ManagedGroup> getAll() {
        Cursor d = this.b.b().d("SELECT * FROM " + Table.MANAGED_GROUPS.i(), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(l(d));
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

    @Override // xsna.xi00
    public final di00 getCount() {
        tgl0 tgl0Var = this.b;
        Integer e = tgl0Var.I0().k().e("managed_groups_unread_count");
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        Integer e2 = tgl0Var.I0().k().e("managed_groups_unread_phase");
        return new di00(intValue, e2 != null ? e2.intValue() : 0);
    }

    @Override // xsna.xi00
    public final void h(di00 di00Var) {
        tgl0 tgl0Var = this.b;
        tgl0Var.I0().k().putInt("managed_groups_unread_count", di00Var.a);
        tgl0Var.I0().k().putInt("managed_groups_unread_phase", di00Var.b);
    }

    @Override // xsna.xi00
    public final void i(di00 di00Var) {
        tgl0 tgl0Var = this.b;
        tgl0Var.I0().k().putInt("managed_groups_unread_dialogs_count", di00Var.a);
        tgl0Var.I0().k().putInt("managed_groups_dialogs_phase", di00Var.b);
    }

    @Override // xsna.xi00
    public final void j(di00 di00Var) {
        tgl0 tgl0Var = this.b;
        tgl0Var.I0().k().putInt("managed_groups_dialogs_unmuted_count", di00Var.a);
        tgl0Var.I0().k().putInt("managed_groups_dialogs_unmuted_phase", di00Var.b);
    }
}
