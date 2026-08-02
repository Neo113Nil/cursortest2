package xsna;

import android.database.Cursor;
import android.os.Trace;
import android.util.ArraySet;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.contacts.Contact;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContactsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class kdj implements hdj, mtx0 {
    public final tgl0 b;
    public final a c = new a(this, new ol(18), new b(1, this, kdj.class, "getByIdsFromDb", "getByIdsFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0));
    public final a d = new a(this, new yy(20), new c(1, this, kdj.class, "getByUserIdsFromDb", "getByUserIdsFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0));

    /* compiled from: ContactsStorageManagerImpl.kt */
    public final class a extends dhl0<Contact, Long> {

        /* compiled from: ContactsStorageManagerImpl.kt */
        /* renamed from: xsna.kdj$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3175a extends FunctionReferenceImpl implements izs<Collection<? extends Contact>, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Collection<? extends Contact> collection) {
                kdj kdjVar = (kdj) this.receiver;
                kdjVar.b.b().h(new ml1(8, kdjVar, collection));
                return s3q0.a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(kdj kdjVar, izs<? super Contact, Long> izsVar, izs<? super Collection<Long>, ? extends Map<Long, Contact>> izsVar2) {
            super(5000, r7.c(Contact.class), izsVar, new zkh(izsVar2), new C3175a(1, kdjVar, kdj.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), r7.I0());
            tgl0 tgl0Var = kdjVar.b;
        }
    }

    /* compiled from: ContactsStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends Contact>> {
        @Override // xsna.izs
        public final Map<Long, ? extends Contact> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            kdj kdjVar = (kdj) this.receiver;
            kdjVar.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            String g0 = j5g.g0(collection2, StringUtils.COMMA, null, null, 0, null, 62);
            Cursor d = kdjVar.b.b().d("SELECT * FROM contacts WHERE id IN (" + g0 + ')', null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "id")), kdjVar.r(d));
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
    }

    /* compiled from: ContactsStorageManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends Contact>> {
        @Override // xsna.izs
        public final Map<Long, ? extends Contact> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            kdj kdjVar = (kdj) this.receiver;
            kdjVar.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            String g0 = j5g.g0(collection2, StringUtils.COMMA, null, null, 0, null, 62);
            Cursor d = kdjVar.b.b().d("SELECT * FROM contacts WHERE user_id IN (" + g0 + ')', null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "user_id")), kdjVar.r(d));
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
    }

    public kdj(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
        this.d.c();
    }

    @Override // xsna.hdj
    public final void a(long j) {
        this.b.b().execSQL("DELETE FROM contacts WHERE user_id = " + j);
        Long valueOf = Long.valueOf(j);
        a aVar = this.d;
        Contact d = aVar.d(valueOf);
        if (d == null) {
            return;
        }
        Long valueOf2 = Long.valueOf(d.b);
        a aVar2 = this.c;
        aVar2.f.u(new ozk0(1, aVar2, valueOf2));
        aVar.f.u(new ozk0(1, aVar, Long.valueOf(j)));
    }

    @Override // xsna.hdj
    public final void b() {
        this.c.c();
        this.d.c();
        this.b.b().h(new m4g(this, 8));
    }

    @Override // xsna.hdj
    public final Contact c(long j) {
        return this.c.e(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.hdj
    public final Map<Long, Contact> d(Collection<Long> collection) {
        return this.c.e(collection);
    }

    @Override // xsna.hdj
    public final void e(Collection<Contact> collection) {
        this.b.b().h(new sf4(6, this, collection));
    }

    @Override // xsna.hdj
    public final void f(Collection<Long> collection) {
        if (collection.isEmpty()) {
            return;
        }
        String g0 = j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62);
        this.b.b().execSQL("DELETE FROM contacts WHERE id IN (" + g0 + ')');
        this.c.c();
        this.d.c();
    }

    @Override // xsna.hdj
    public final boolean g() {
        return this.b.I0().k().getBoolean("key_edu_contact_list_loaded", false);
    }

    @Override // xsna.hdj
    public final List<Contact> getAll() {
        ArrayList l = this.b.b().l(new com.vk.movika.tools.controls.seekbar.l(this, 6));
        int size = l.size();
        a aVar = this.c;
        if (size < aVar.a) {
            aVar.f(l);
            this.d.f(l);
        }
        return l;
    }

    @Override // xsna.hdj
    public final boolean h() {
        return this.b.I0().k().getBoolean("key_show_new_contacts_badge", false);
    }

    @Override // xsna.hdj
    public final void i(ArraySet arraySet) {
        if (arraySet.isEmpty()) {
            return;
        }
        this.c.c();
        this.d.c();
        this.b.b().execSQL(air.b(')', "UPDATE contacts SET is_new = 0 WHERE id IN(", j5g.g0(arraySet, StringUtils.COMMA, null, null, 0, null, 62)));
    }

    @Override // xsna.hdj
    public final void j(boolean z) {
        this.b.I0().k().putBoolean("key_has_new_local", z);
    }

    @Override // xsna.hdj
    public final LinkedHashMap k(Collection collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.d.e(collection));
        linkedHashMap.remove(0L);
        return linkedHashMap;
    }

    @Override // xsna.hdj
    public final void l() {
        this.c.c();
        this.d.c();
        this.b.b().execSQL("UPDATE contacts SET is_new = 0");
    }

    @Override // xsna.hdj
    public final void m(boolean z) {
        this.b.I0().k().putBoolean("key_contact_list_loaded", z);
    }

    @Override // xsna.hdj
    public final void n(final long j, final long j2) {
        this.c.a(Long.valueOf(j), new idj(j2, 0), new izs() { // from class: xsna.jdj
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                e0w b2 = kdj.this.b.b();
                StringBuilder b3 = fp.b(j2, "UPDATE contacts SET user_id = ", " WHERE id = ");
                b3.append(j);
                b2.execSQL(b3.toString());
                return s3q0.a;
            }
        });
    }

    @Override // xsna.hdj
    public final boolean o() {
        return this.b.I0().k().getBoolean("key_has_new_local", false);
    }

    @Override // xsna.hdj
    public final boolean p() {
        return this.b.I0().k().getBoolean("key_contact_list_loaded", false);
    }

    @Override // xsna.hdj
    public final void q(boolean z) {
        this.b.I0().k().putBoolean("key_show_new_contacts_badge", z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Contact r(Cursor cursor) {
        ImageList imageList;
        Contact.LastSeenStatus lastSeenStatus;
        Contact contact = (Contact) this.c.g.get(Long.valueOf(fl3.C(cursor, "id")));
        if (contact != null) {
            return contact;
        }
        long C = fl3.C(cursor, "id");
        String E = fl3.E(cursor, "name");
        String E2 = fl3.E(cursor, "phone");
        byte[] v = fl3.v(cursor, "avatar");
        if (v != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            imageList = (ImageList) Serializer.b.a(v, ImageList.class.getClassLoader());
        }
        imageList = new ImageList(null, 1, null);
        ImageList imageList2 = imageList;
        String E3 = fl3.E(cursor, "local_name");
        String E4 = fl3.E(cursor, "local_phone");
        boolean x = fl3.x(cursor, "is_new");
        String E5 = fl3.E(cursor, "device_local_id");
        Long D = fl3.D(cursor, "user_id");
        long C2 = fl3.C(cursor, "sync_time");
        long C3 = fl3.C(cursor, "import_time");
        Contact.LastSeenStatus.a aVar = Contact.LastSeenStatus.Companion;
        int A = fl3.A(cursor, "last_seen_status");
        aVar.getClass();
        Contact.LastSeenStatus[] values = Contact.LastSeenStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lastSeenStatus = null;
                break;
            }
            Contact.LastSeenStatus lastSeenStatus2 = values[i];
            int i2 = i;
            if (lastSeenStatus2.h() == A) {
                lastSeenStatus = lastSeenStatus2;
                break;
            }
            i = i2 + 1;
        }
        if (lastSeenStatus == null) {
            lastSeenStatus = Contact.LastSeenStatus.LONG_AGO;
        }
        return new Contact(C, E, E2, E3, E4, x, imageList2, E5, D, C2, C3, lastSeenStatus, fl3.x(cursor, "can_write"), fl3.x(cursor, "can_call"), fl3.F(cursor, "calls_id"));
    }
}
