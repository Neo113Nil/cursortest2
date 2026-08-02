package xsna;

import android.content.Context;
import android.database.Cursor;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.Event;
import com.vk.sqliteext.observer.SQLiteContentChangesListener;
import com.vk.sqliteext.observer.SQLiteContentObserverExtKt;
import com.vk.toggle.features.ImFeatures;
import io.requery.android.database.SlowQueryLogger;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import xsna.bhl0;
import xsna.jvo0;

/* compiled from: ImDatabaseImpl.kt */
/* loaded from: classes2.dex */
public final class f0w implements e0w {
    public final Context a;
    public final String b;
    public final d2l c;
    public final b2l d;
    public final boolean e;
    public final boolean f;
    public final SlowQueryLogger g;
    public final n2w h;
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final LinkedHashSet j = new LinkedHashSet();
    public final boolean k;
    public final boolean l;
    public final bpn0 m;
    public final bpn0 n;

    public f0w(Context context, String str, d2l d2lVar, b2l b2lVar, boolean z, boolean z2, SlowQueryLogger slowQueryLogger, n2w n2wVar) {
        this.a = context;
        this.b = str;
        this.c = d2lVar;
        this.d = b2lVar;
        this.e = z;
        this.f = z2;
        this.g = slowQueryLogger;
        this.h = n2wVar;
        ImFeatures imFeatures = ImFeatures.IM_CANCEL_DB_QUERY;
        imFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.k = bVar.a(imFeatures);
        ImFeatures imFeatures2 = ImFeatures.IM_DB_NO_CKPT_ON_CLOSE;
        imFeatures2.getClass();
        this.l = bVar.a(imFeatures2);
        this.m = new bpn0(new qfj(this, 10));
        this.n = new bpn0(new w4u(this, 4));
    }

    @Override // xsna.e0w
    public final void a() {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            r().beginTransactionReadonly();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final Cursor b(String str, String[] strArr, String str2, Object[] objArr) {
        Cursor query;
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            rq9 q = q();
            if (this.e) {
                query = new p6g0(r().query(str, strArr, str2, objArr, (String) null, (String) null, (String) null, q), str + ' ' + strArr + ' ' + str2);
            } else {
                query = r().query(str, strArr, str2, objArr, (String) null, (String) null, (String) null, q);
            }
            if (q != null) {
                query = new tq9(query, q, this.j);
            }
            return query;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void beginTransactionNonExclusive() {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            r().beginTransactionNonExclusive();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final <T> T c(izs<? super e0w, ? extends T> izsVar) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            return (T) rdi.t(r(), new qt5(12, izsVar, this));
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void cancel() {
        if (this.k) {
            synchronized (this.j) {
                try {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ImDatabase cancel: canceling " + this.j.size() + " active queries"});
                    }
                    HashSet d = p4g.d(this.j);
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        ((rq9) it.next()).a();
                    }
                    this.j.removeAll(d);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2 A[LOOP:1: B:17:0x00b0->B:18:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.e0w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear() {
        Object failure;
        Throwable a;
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                rwk rwkVar = (rwk) this.m.getValue();
                rdi.t(rwkVar.getWritableDatabase(), new pwk(rwkVar, i));
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"#recreate db " + this.b + " succeed"});
                }
                failure = s3q0.a;
            } finally {
                failure = new Result.Failure(th);
                a = Result.a(failure);
                if (a != null) {
                }
                kotlin.a.a(failure);
                s3q0 s3q0Var = s3q0.a;
                while (i < readHoldCount) {
                }
                writeLock.unlock();
            }
            a = Result.a(failure);
            if (a != null) {
                try {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.e, new Object[]{"Database recreation finished with error " + a + ".\nTrying to delete database file. "});
                    }
                    s();
                    failure = s3q0.a;
                } catch (Throwable th) {
                }
            }
            kotlin.a.a(failure);
            s3q0 s3q0Var2 = s3q0.a;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void close() {
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        readLock.lock();
        try {
            cancel();
            ((rwk) this.m.getValue()).close();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final SQLiteStatement compileStatement(String str) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            return r().compileStatement(str);
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final Cursor d(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            rq9 q = q();
            Cursor p6g0Var = this.e ? new p6g0(r().rawQuery(str, objArr, q), str) : r().rawQuery(str, objArr, q);
            if (q != null) {
                p6g0Var = new tq9(p6g0Var, q, this.j);
            }
            return p6g0Var;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void e(bhl0.a aVar) {
        SQLiteContentObserverExtKt.removeChangesListener(r(), aVar);
    }

    @Override // xsna.e0w
    public final void endTransaction() {
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        readLock.lock();
        try {
            r().endTransaction();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void execSQL(String str) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            if (this.k) {
                rq9 q = q();
                try {
                    r().execSQLWithCancellationSignal(str, q);
                    synchronized (this.j) {
                        ttp0.a(this.j).remove(q);
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"ImDatabase: execSQL finished, active queries: " + this.j.size()});
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable th) {
                    synchronized (this.j) {
                        ttp0.a(this.j).remove(q);
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"ImDatabase: execSQL finished, active queries: " + this.j.size()});
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        throw th;
                    }
                }
            } else {
                r().execSQL(str);
            }
            s3q0 s3q0Var3 = s3q0.a;
            readLock.unlock();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // xsna.e0w
    public final int f(String str, String str2, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            return r().delete(str, str2, objArr);
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final SQLiteStatement g(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            p();
            return compileStatement(str);
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final <T> T h(izs<? super e0w, ? extends T> izsVar) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            return (T) rdi.t(r(), new ij8(19, izsVar, this));
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void i(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            execSQL(str, objArr);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final void j(String str) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            execSQL(str);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final Cursor k(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            rq9 q = q();
            Cursor rawQuery = r().rawQuery(str, objArr, q);
            if (q != null) {
                rawQuery = new tq9(rawQuery, q, this.j);
            }
            return rawQuery;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final ArrayList l(com.vk.movika.tools.controls.seekbar.l lVar) {
        List list;
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                p();
                i += 1000;
                list = (List) lVar.invoke(this, "SELECT * FROM contacts LIMIT 1000 OFFSET " + i);
                arrayList.addAll(list);
            } while (list.size() == 1000);
            return arrayList;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final Cursor m(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            rq9 q = q();
            Cursor rawQueryWithFactory = r().rawQueryWithFactory(jbq.b, str, objArr, null, q);
            if (q != null) {
                rawQueryWithFactory = new tq9(rawQueryWithFactory, q, this.j);
            }
            return rawQueryWithFactory;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.e0w
    public final Cursor n(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            rq9 q = q();
            Cursor rawQueryWithFactory = r().rawQueryWithFactory(a27.b, str, objArr, null, q);
            if (q != null) {
                rawQueryWithFactory = new tq9(rawQueryWithFactory, q, this.j);
            }
            return rawQueryWithFactory;
        } finally {
            readLock.unlock();
        }
    }

    public final void o(SQLiteContentChangesListener sQLiteContentChangesListener) {
        SQLiteContentObserverExtKt.addChangesListener(r(), sQLiteContentChangesListener);
    }

    public final void p() {
        if (this.k && Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final rq9 q() {
        if (!this.k) {
            return null;
        }
        rq9 rq9Var = new rq9();
        synchronized (this.j) {
            this.j.add(rq9Var);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"ImDatabase: query started, active queries: " + this.j.size()});
            }
            s3q0 s3q0Var = s3q0.a;
        }
        return rq9Var;
    }

    public final SQLiteDatabase r() {
        return this.f ? ((rwk) this.m.getValue()).getWritableDatabase() : (SQLiteDatabase) this.n.getValue();
    }

    public final void s() {
        try {
            ((rwk) this.m.getValue()).close();
        } catch (Exception e) {
            L.i(e);
        }
        Context context = this.a;
        String str = this.b;
        boolean deleteDatabase = context.deleteDatabase(str);
        String str2 = str == null ? "" : str;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("ImEngine.doClearSqliteCache");
        aVar.c("dbFileName", str2);
        aVar.a(Boolean.valueOf(deleteDatabase), "deletedSuccessfully");
        bVar.k(aVar.e());
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"#clear db " + str + " succeed: " + deleteDatabase});
    }

    @Override // xsna.e0w
    public final void setTransactionSuccessful() {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            r().setTransactionSuccessful();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            readLock.unlock();
        }
    }

    public final SQLiteDatabase t(rwk rwkVar) {
        long b = k830.b();
        SQLiteDatabase writableDatabase = rwkVar.getWritableDatabase();
        this.h.d(zno.e(jvo0.a.b(b)), this.b);
        return writableDatabase;
    }

    @Override // xsna.e0w
    public final void execSQL(String str, Object[] objArr) {
        p();
        ReentrantReadWriteLock.ReadLock readLock = this.i.readLock();
        if (this.k) {
            readLock.lockInterruptibly();
        } else {
            readLock.lock();
        }
        try {
            if (this.k) {
                rq9 q = q();
                try {
                    r().execSQLWithCancellationSignal(str, objArr, q);
                    synchronized (this.j) {
                        ttp0.a(this.j).remove(q);
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"ImDatabase: execSQL finished, active queries: " + this.j.size()});
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable th) {
                    synchronized (this.j) {
                        ttp0.a(this.j).remove(q);
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"ImDatabase: execSQL finished, active queries: " + this.j.size()});
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        throw th;
                    }
                }
            } else {
                r().execSQL(str, objArr);
            }
            s3q0 s3q0Var3 = s3q0.a;
            readLock.unlock();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
