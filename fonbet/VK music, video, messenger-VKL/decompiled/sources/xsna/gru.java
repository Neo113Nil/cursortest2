package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupDeactivation;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.engine.models.groups.WarningNotification;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class gru implements bru, mtx0 {
    public final tgl0 b;
    public final dhl0<Group, Long> c;
    public final dhl0<yiu, Long> d;

    /* compiled from: GroupsStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends yiu>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends yiu> collection) {
            Collection<? extends yiu> collection2 = collection;
            gru gruVar = (gru) this.receiver;
            gruVar.getClass();
            if (!collection2.isEmpty()) {
                gruVar.b.b().h(new com.vk.movika.sdk.base.ui.s0(13, gruVar, collection2));
            }
            return s3q0.a;
        }
    }

    /* compiled from: GroupsStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends Group>> {
        @Override // xsna.izs
        public final Map<Long, ? extends Group> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            gru gruVar = (gru) this.receiver;
            gruVar.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            Cursor d = gruVar.b.b().d(air.b(')', "SELECT * FROM groups WHERE id IN(", p4g.k(collection2, StringUtils.COMMA, null)), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "id")), gru.k(d));
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

    /* compiled from: GroupsStorageManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Collection<? extends Group>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends Group> collection) {
            Collection<? extends Group> collection2 = collection;
            gru gruVar = (gru) this.receiver;
            gruVar.getClass();
            if (!collection2.isEmpty()) {
                gruVar.b.b().h(new ij8(17, gruVar, collection2));
            }
            return s3q0.a;
        }
    }

    public gru(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(100, tgl0Var.c(Group.class), new nyq(4), new b(1, this, gru.class, "getFromDb", "getFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0), new c(1, this, gru.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
        this.d = new dhl0<>(100, tgl0Var.c(yiu.class), new x8m(10), new s6k(this, 23), new a(1, this, gru.class, "putCanSendToMePendingFromDb", "putCanSendToMePendingFromDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    public static void j(SQLiteStatement sQLiteStatement, Group group) {
        sQLiteStatement.bindLong(1, group.b);
        sQLiteStatement.bindString(2, group.c);
        sQLiteStatement.bindString(3, group.d);
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        sQLiteStatement.bindBlob(4, Serializer.b.e(group.e));
        sQLiteStatement.bindLong(5, group.f.j());
        rdi.i(sQLiteStatement, 6, group.g);
        rdi.i(sQLiteStatement, 7, group.h);
        rdi.i(sQLiteStatement, 8, group.i);
        sQLiteStatement.bindLong(9, group.j.h());
        sQLiteStatement.bindLong(10, group.k);
        sQLiteStatement.bindLong(11, group.l);
        sQLiteStatement.bindLong(12, group.m);
        sQLiteStatement.bindString(13, group.n);
        rdi.i(sQLiteStatement, 14, group.o);
        sQLiteStatement.bindLong(15, group.p);
        sQLiteStatement.bindLong(16, group.q.h());
        sQLiteStatement.bindString(17, group.r);
        rdi.i(sQLiteStatement, 18, group.s);
        sQLiteStatement.bindLong(19, group.t.j());
        sQLiteStatement.bindString(20, group.u);
        GroupDeactivation groupDeactivation = group.v;
        String str = groupDeactivation != null ? groupDeactivation.b : null;
        if (str == null) {
            str = "";
        }
        sQLiteStatement.bindString(21, str);
        String str2 = groupDeactivation != null ? groupDeactivation.c : null;
        if (str2 == null) {
            str2 = "";
        }
        sQLiteStatement.bindString(22, str2);
        String str3 = groupDeactivation != null ? groupDeactivation.d : null;
        sQLiteStatement.bindString(23, str3 != null ? str3 : "");
        rdi.i(sQLiteStatement, 24, group.w);
        rdi.i(sQLiteStatement, 25, group.x);
        rdi.i(sQLiteStatement, 26, group.z);
        sQLiteStatement.bindLong(27, group.A.h());
        sQLiteStatement.bindLong(28, group.B.h());
        rdi.i(sQLiteStatement, 29, group.y);
        rdi.i(sQLiteStatement, 30, group.C);
        rdi.i(sQLiteStatement, 31, group.D);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.vk.im.engine.models.groups.Group, still in use, count: 2, list:
          (r2v0 com.vk.im.engine.models.groups.Group) from 0x00f2: MOVE (r26v2 com.vk.im.engine.models.groups.Group) = (r2v0 com.vk.im.engine.models.groups.Group) (LINE:243)
          (r2v0 com.vk.im.engine.models.groups.Group) from 0x00d6: MOVE (r26v5 com.vk.im.engine.models.groups.Group) = (r2v0 com.vk.im.engine.models.groups.Group) (LINE:215)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static com.vk.im.engine.models.groups.Group k(android.database.Cursor r36) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.gru.k(android.database.Cursor):com.vk.im.engine.models.groups.Group");
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
        this.d.c();
    }

    @Override // xsna.bru
    public final void a(Collection<Group> collection) {
        this.c.f(collection);
    }

    @Override // xsna.bru
    public final Group b(long j) {
        return this.c.e(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.bru
    public final Map<Long, Group> c(Collection<Long> collection) {
        return this.c.e(collection);
    }

    @Override // xsna.bru
    public final yiu d(long j) {
        return this.d.e(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.bru
    public final void e(long j) {
        this.b.b().execSQL("DELETE FROM groups_can_send_pending WHERE group_id = " + j);
        this.d.c();
    }

    @Override // xsna.bru
    public final void f(final long j, final boolean z, final boolean z2) {
        this.c.a(Long.valueOf(j), new izs() { // from class: xsna.cru
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Group.zb((Group) obj, z, z2, 0L, 0, null, 536870719);
            }
        }, new izs() { // from class: xsna.dru
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL(efz.b(j, "\n                        ", odj.a(z ? 1 : 0, z2 ? 1 : 0, "\n                        UPDATE groups\n                        SET can_send_msg_to_me = ", ", can_send_notify_to_me = ", "\n                        WHERE id = ")));
                return s3q0.a;
            }
        });
    }

    @Override // xsna.bru
    public final void g(yiu yiuVar) {
        this.d.f(Collections.singletonList(yiuVar));
    }

    @Override // xsna.bru
    public final void h(final long j, final MemberStatus memberStatus) {
        this.c.a(Long.valueOf(j), new w7u(memberStatus, 1), new izs() { // from class: xsna.fru
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE groups SET member_status = " + MemberStatus.this.i() + " WHERE id = " + j);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.bru
    public final void i(final long j, final WarningNotification warningNotification) {
        this.c.a(Long.valueOf(j), new u3u(warningNotification, 2), new izs() { // from class: xsna.eru
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                this.b.b().execSQL("UPDATE groups SET warning_notification = " + WarningNotification.this.h() + " WHERE id = " + j);
                return s3q0.a;
            }
        });
    }
}
