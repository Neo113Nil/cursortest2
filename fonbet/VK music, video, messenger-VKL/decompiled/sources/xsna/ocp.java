package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.im.engine.models.emails.Email;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EmailsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ocp implements ncp, mtx0 {
    public final tgl0 b;
    public final dhl0<Email, Long> c;

    /* compiled from: EmailsStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends Long>, Map<Long, ? extends Email>> {
        @Override // xsna.izs
        public final Map<Long, ? extends Email> invoke(Collection<? extends Long> collection) {
            Collection<? extends Long> collection2 = collection;
            ocp ocpVar = (ocp) this.receiver;
            ocpVar.getClass();
            if (collection2.isEmpty()) {
                return jgp.b;
            }
            Cursor d = ocpVar.b.b().d(air.b(')', "SELECT id, email FROM emails WHERE id IN(", j5g.g0(collection2, StringUtils.COMMA, null, null, 0, null, 62)), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            hashMap.put(Long.valueOf(fl3.C(d, "id")), new Email(fl3.C(d, "id"), fl3.E(d, "email")));
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

    /* compiled from: EmailsStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends Email>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends Email> collection) {
            Collection<? extends Email> collection2 = collection;
            ocp ocpVar = (ocp) this.receiver;
            ocpVar.getClass();
            if (!collection2.isEmpty()) {
                ocpVar.b.b().h(new ij8(12, ocpVar, collection2));
            }
            return s3q0.a;
        }
    }

    public ocp(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(50, tgl0Var.c(Email.class), new x50(14), new a(1, this, ocp.class, "getFromDb", "getFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, this, ocp.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.ncp
    public final void a(Collection<Email> collection) {
        if (((ArrayList) collection).isEmpty()) {
            return;
        }
        this.c.f(collection);
    }

    @Override // xsna.ncp
    public final Email b(long j) {
        return this.c.e(Collections.singletonList(Long.valueOf(j))).get(Long.valueOf(j));
    }

    @Override // xsna.ncp
    public final Map<Long, Email> c(Collection<Long> collection) {
        return this.c.e(collection);
    }
}
