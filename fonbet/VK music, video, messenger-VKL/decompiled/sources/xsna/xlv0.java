package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vk.log.L;
import com.vk.stat.vkstat.VkStatSettings;
import com.vk.stat.vkstat.event.SendStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.p;
import okhttp3.t;
import xsna.f1q;

/* compiled from: VkStatImpl.kt */
/* loaded from: classes5.dex */
public final class xlv0 implements plv0 {
    public final VkStatSettings a;
    public final rlv0 b;
    public final eml g;
    public final qlv0 h;
    public final ExecutorService i;
    public final wlv0 j;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<tlv0> k = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<pur> l = new CopyOnWriteArrayList<>();

    public xlv0(VkStatSettings vkStatSettings, rlv0 rlv0Var) {
        this.a = vkStatSettings;
        this.b = rlv0Var;
        this.g = rlv0Var.c;
        this.h = rlv0Var.a;
        this.i = rlv0Var.d;
        this.j = rlv0Var.b;
    }

    @Override // xsna.plv0
    public final void a(slv0 slv0Var) {
        eml emlVar = this.g;
        if (this.e.get()) {
            L.G("VkStatImpl", "VkStat is shutdown, dropping event");
            return;
        }
        if (!this.c.get()) {
            L.G("VkStatImpl", "VkStat not initialized, dropping event");
            return;
        }
        try {
            if (!((ArrayBlockingQueue) emlVar.b).offer(slv0Var, 1000L, TimeUnit.MILLISECONDS)) {
                ((ArrayBlockingQueue) emlVar.b).put(slv0Var);
            }
        } catch (Throwable th) {
            L.f("VkStatImpl", "Failed to add event to buffer", th);
            Iterator<tlv0> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        d();
    }

    public final boolean b() {
        if (this.e.get()) {
            L.G("VkStatImpl", "Cannot init, VkStat is shutdown");
            return false;
        }
        if (!this.c.compareAndSet(false, true)) {
            L.G("VkStatImpl", "VkStat already initialized");
            return false;
        }
        this.h.f = this;
        for (pur purVar : this.b.e) {
            purVar.b(new dp0(27, this, purVar));
            this.l.add(purVar);
        }
        return true;
    }

    public final void c() {
        f1q aVar;
        if (this.e.get()) {
            return;
        }
        int i = this.a.a;
        qlv0 qlv0Var = this.h;
        qlv0Var.getClass();
        if (i > 8000) {
            throw new SQLiteException(tgw.b(i, "Stat cursor count is too large. ", " rows in vk_stat_events (max 8000)"));
        }
        String a = iq.a(i, "\n        SELECT id, event_type_id, schema_version, user_id, eventJson, size\n        FROM vk_stat_events\n        WHERE sentStatus='", SendStatus.INITIAL.name(), "'\n        ORDER BY id ASC\n        LIMIT ", "\n        ");
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = qlv0Var.getWritableDatabase();
        rls0 rls0Var = new rls0(5, a, arrayList);
        writableDatabase.beginTransactionNonExclusive();
        try {
            rls0Var.invoke(writableDatabase);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            List<Collection<jvu0>> singletonList = Collections.singletonList(arrayList);
            if (singletonList.isEmpty()) {
                return;
            }
            for (Collection<jvu0> collection : singletonList) {
                if (!collection.isEmpty()) {
                    wlv0 wlv0Var = this.j;
                    wlv0Var.getClass();
                    if (collection.isEmpty()) {
                        aVar = f1q.b.a;
                    } else {
                        try {
                            String a2 = wlv0Var.a(collection);
                            p.a aVar2 = new p.a();
                            aVar2.i(wlv0Var.a);
                            t.a aVar3 = okhttp3.t.Companion;
                            okhttp3.m mVar = wlv0Var.d;
                            aVar3.getClass();
                            aVar2.f("POST", t.a.a(a2, mVar));
                            okhttp3.u execute = ((f8f0) wlv0Var.c.a(aVar2.b())).execute();
                            try {
                                if (execute.t()) {
                                    Collection<jvu0> collection2 = collection;
                                    ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
                                    Iterator<T> it = collection2.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((jvu0) it.next()).a));
                                    }
                                    aVar = new f1q.d(arrayList2);
                                } else {
                                    aVar = new f1q.a(new IOException("HTTP " + execute.e));
                                }
                                execute.close();
                            } finally {
                            }
                        } catch (IOException e) {
                            aVar = new f1q.a(e);
                        }
                    }
                    boolean z = aVar instanceof f1q.d;
                    CopyOnWriteArrayList<tlv0> copyOnWriteArrayList = this.k;
                    if (z) {
                        f1q.d dVar = (f1q.d) aVar;
                        qlv0Var.c(dVar.a);
                        Iterator<tlv0> it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            tlv0 next = it2.next();
                            dVar.a.size();
                            next.c();
                        }
                    } else {
                        if (aVar instanceof f1q.c) {
                            ((f1q.c) aVar).getClass();
                            qlv0Var.c(null);
                            throw null;
                        }
                        if (aVar instanceof f1q.a) {
                            Iterator<tlv0> it3 = copyOnWriteArrayList.iterator();
                            while (it3.hasNext()) {
                                tlv0 next2 = it3.next();
                                IOException iOException = ((f1q.a) aVar).a;
                                next2.a();
                            }
                        } else if (!(aVar instanceof f1q.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final void d() {
        if (!this.e.get() && this.d.compareAndSet(false, true)) {
            this.i.submit(new ep0(this, 13));
        }
    }
}
