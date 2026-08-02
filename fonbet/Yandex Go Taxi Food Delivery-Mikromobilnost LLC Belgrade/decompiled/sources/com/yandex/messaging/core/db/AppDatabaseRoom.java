package com.yandex.messaging.core.db;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.room.RoomDatabase;
import androidx.room.c;
import defpackage.at2;
import defpackage.ct2;
import defpackage.cvg;
import defpackage.ddf;
import defpackage.dt2;
import defpackage.f02;
import defpackage.f3t0;
import defpackage.g0c;
import defpackage.g3t0;
import defpackage.h3t0;
import defpackage.i2z;
import defpackage.i3y;
import defpackage.ikw0;
import defpackage.iwk0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qoi0;
import defpackage.tls;
import defpackage.ys2;
import defpackage.z83;
import defpackage.zq60;
import defpackage.zs2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/core/db/AppDatabaseRoom;", "Landroidx/room/RoomDatabase;", "Lat2;", "<init>", "()V", "ct2", "dt2", "messaging-core-db_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AppDatabaseRoom extends RoomDatabase implements at2 {
    public cvg l;
    public Looper m;
    public ikw0 p;
    public volatile boolean t;
    public volatile boolean u;
    public Context v;
    public ct2 w;
    public final i3y n = a.a(new f02(5, this));
    public final zq60 o = new zq60();
    public final ddf q = new ddf(19, this);
    public final AtomicInteger r = new AtomicInteger();
    public final ReentrantReadWriteLock s = new ReentrantReadWriteLock();

    @Override // androidx.room.RoomDatabase
    public final void B0() {
        if (this.m != null) {
            Looper.myLooper();
            z83.i();
        }
        z83.i();
        ikw0 ikw0Var = this.p;
        if (ikw0Var != null) {
            ikw0Var.close();
        }
    }

    @Override // androidx.room.RoomDatabase
    public final void K0(c cVar) {
        Object obj;
        Object obj2;
        super.K0(cVar);
        this.v = cVar.a;
        List list = cVar.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((RoomDatabase.a) obj2) instanceof ct2) {
                        break;
                    }
                }
            }
            obj = (RoomDatabase.a) obj2;
        } else {
            obj = null;
        }
        this.w = obj instanceof ct2 ? (ct2) obj : null;
    }

    @Override // defpackage.at2
    public final void M(zs2 zs2Var) {
        this.o.d(zs2Var);
    }

    @Override // androidx.room.RoomDatabase
    public final Cursor O0(iwk0 iwk0Var) {
        Cursor O0 = super.O0(iwk0Var);
        cvg cvgVar = this.l;
        if (cvgVar != null) {
            cvgVar.a.getBoolean("CURSOR_DEBUGGING_ENABLED_KEY", false);
        }
        return O0;
    }

    @Override // defpackage.at2
    public final void P(tls tlsVar) {
        ikw0 startTransaction = startTransaction();
        try {
            tlsVar.invoke(this);
            startTransaction.s();
            startTransaction.close();
        } finally {
        }
    }

    @Override // androidx.room.RoomDatabase
    public final void Q0() {
        if (this.m != null) {
            Looper.myLooper();
            z83.i();
        }
        z83.i();
        ikw0 ikw0Var = this.p;
        if (ikw0Var != null) {
            ikw0Var.s();
        }
    }

    public abstract i2z S0();

    @Override // defpackage.at2
    public final boolean T() {
        ct2 ct2Var;
        return M0() && (ct2Var = this.w) != null && ct2Var.c && !this.t;
    }

    @Override // defpackage.at2
    public final ys2 U() {
        ys2 ys2Var;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Cursor W1 = D0().getReadableDatabase().W1("PRAGMA wal_checkpoint(TRUNCATE)");
        try {
            Cursor cursor = W1;
            W1 = cursor;
            try {
                Cursor cursor2 = W1;
                if (cursor.moveToFirst()) {
                    g0c a = qoi0.a(Long.class);
                    boolean equals = a.equals(qoi0.a(String.class));
                    Class cls = Boolean.TYPE;
                    Class cls2 = Double.TYPE;
                    Class cls3 = Float.TYPE;
                    Class cls4 = Short.TYPE;
                    Class cls5 = Integer.TYPE;
                    Class cls6 = Long.TYPE;
                    if (equals) {
                        valueOf = cursor.getString(0);
                    } else if (a.equals(qoi0.a(cls6))) {
                        valueOf = Long.valueOf(cursor.getLong(0));
                    } else if (a.equals(qoi0.a(cls5))) {
                        valueOf = Integer.valueOf(cursor.getInt(0));
                    } else if (a.equals(qoi0.a(cls4))) {
                        valueOf = Short.valueOf(cursor.getShort(0));
                    } else if (a.equals(qoi0.a(cls3))) {
                        valueOf = Float.valueOf(cursor.getFloat(0));
                    } else if (a.equals(qoi0.a(cls2))) {
                        valueOf = Double.valueOf(cursor.getDouble(0));
                    } else if (a.equals(qoi0.a(byte[].class))) {
                        valueOf = cursor.getBlob(0);
                    } else {
                        if (!a.equals(qoi0.a(cls))) {
                            throw new NotImplementedError("No mapping defined for class " + qoi0.a(Long.class).c());
                        }
                        valueOf = Boolean.valueOf(cursor.getInt(0) != 0);
                    }
                    long longValue = ((Long) valueOf).longValue();
                    g0c a2 = qoi0.a(Long.class);
                    if (a2.equals(qoi0.a(String.class))) {
                        valueOf2 = cursor.getString(1);
                    } else if (a2.equals(qoi0.a(cls6))) {
                        valueOf2 = Long.valueOf(cursor.getLong(1));
                    } else if (a2.equals(qoi0.a(cls5))) {
                        valueOf2 = Integer.valueOf(cursor.getInt(1));
                    } else if (a2.equals(qoi0.a(cls4))) {
                        valueOf2 = Short.valueOf(cursor.getShort(1));
                    } else if (a2.equals(qoi0.a(cls3))) {
                        valueOf2 = Float.valueOf(cursor.getFloat(1));
                    } else if (a2.equals(qoi0.a(cls2))) {
                        valueOf2 = Double.valueOf(cursor.getDouble(1));
                    } else if (a2.equals(qoi0.a(byte[].class))) {
                        valueOf2 = cursor.getBlob(1);
                    } else {
                        if (!a2.equals(qoi0.a(cls))) {
                            throw new NotImplementedError("No mapping defined for class " + qoi0.a(Long.class).c());
                        }
                        valueOf2 = Boolean.valueOf(cursor.getInt(1) != 0);
                    }
                    long longValue2 = ((Long) valueOf2).longValue();
                    g0c a3 = qoi0.a(Long.class);
                    if (a3.equals(qoi0.a(String.class))) {
                        valueOf3 = cursor.getString(2);
                    } else if (a3.equals(qoi0.a(cls6))) {
                        valueOf3 = Long.valueOf(cursor.getLong(2));
                    } else if (a3.equals(qoi0.a(cls5))) {
                        valueOf3 = Integer.valueOf(cursor.getInt(2));
                    } else if (a3.equals(qoi0.a(cls4))) {
                        valueOf3 = Short.valueOf(cursor.getShort(2));
                    } else if (a3.equals(qoi0.a(cls3))) {
                        valueOf3 = Float.valueOf(cursor.getFloat(2));
                    } else if (a3.equals(qoi0.a(cls2))) {
                        valueOf3 = Double.valueOf(cursor.getDouble(2));
                    } else if (a3.equals(qoi0.a(byte[].class))) {
                        valueOf3 = cursor.getBlob(2);
                    } else {
                        if (!a3.equals(qoi0.a(cls))) {
                            throw new NotImplementedError("No mapping defined for class " + qoi0.a(Long.class).c());
                        }
                        valueOf3 = Boolean.valueOf(cursor.getInt(2) != 0);
                    }
                    ys2Var = new ys2(longValue, longValue2, ((Long) valueOf3).longValue());
                } else {
                    ys2Var = null;
                }
                ooc.g(W1, null);
                if (ys2Var == null) {
                    ys2Var = new ys2(0);
                }
                ooc.g(W1, null);
                return ys2Var;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.at2
    public final void c0(zs2 zs2Var) {
        this.o.b(zs2Var);
    }

    @Override // defpackage.at2
    public final String e() {
        String str;
        Object valueOf;
        Cursor W1 = D0().getReadableDatabase().W1("PRAGMA synchronous");
        Cursor cursor = W1;
        try {
            Cursor cursor2 = cursor;
            if (W1.moveToFirst()) {
                if (!W1.isNull(0)) {
                    g0c a = qoi0.a(String.class);
                    if (a.equals(qoi0.a(String.class))) {
                        valueOf = W1.getString(0);
                    } else if (a.equals(qoi0.a(Long.TYPE))) {
                        valueOf = Long.valueOf(W1.getLong(0));
                    } else if (a.equals(qoi0.a(Integer.TYPE))) {
                        valueOf = Integer.valueOf(W1.getInt(0));
                    } else if (a.equals(qoi0.a(Short.TYPE))) {
                        valueOf = Short.valueOf(W1.getShort(0));
                    } else if (a.equals(qoi0.a(Float.TYPE))) {
                        valueOf = Float.valueOf(W1.getFloat(0));
                    } else if (a.equals(qoi0.a(Double.TYPE))) {
                        valueOf = Double.valueOf(W1.getDouble(0));
                    } else if (a.equals(qoi0.a(byte[].class))) {
                        valueOf = W1.getBlob(0);
                    } else {
                        if (!a.equals(qoi0.a(Boolean.TYPE))) {
                            throw new NotImplementedError("No mapping defined for class " + qoi0.a(String.class).c());
                        }
                        valueOf = Boolean.valueOf(W1.getInt(0) != 0);
                    }
                    str = (String) valueOf;
                    ooc.g(cursor, null);
                    return str;
                }
            }
            str = null;
            ooc.g(cursor, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(cursor, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.at2
    public final void flush() {
        if (M0() && !this.t) {
            this.u = true;
            if (M0()) {
                ReentrantReadWriteLock reentrantReadWriteLock = this.s;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    super.w0();
                    this.t = true;
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
        }
    }

    @Override // defpackage.at2
    public final long i() {
        long j;
        dt2 dt2Var = (dt2) this.n.getValue();
        synchronized (dt2Var) {
            j = dt2Var.a;
            dt2Var.a = 1 + j;
        }
        return j;
    }

    @Override // defpackage.at2
    public final Object o0(tls tlsVar) {
        ReentrantReadWriteLock.ReadLock readLock = this.s.readLock();
        readLock.lock();
        try {
            return T() ? tlsVar.invoke(this) : null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // defpackage.at2
    public final i2z r0() {
        return S0();
    }

    @Override // defpackage.at2
    public final ikw0 startTransaction() {
        boolean z;
        if (this.m != null) {
            Looper.myLooper();
            z83.i();
        }
        ikw0 ikw0Var = new ikw0(D0().getWritableDatabase(), this.q, this.p);
        if (this.p == null) {
            zq60 zq60Var = this.o;
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z = true;
                } else {
                    if (!z2) {
                        zq60.a(zq60Var);
                        z2 = true;
                    }
                    z = false;
                }
                if (!z) {
                    break;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z2) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return null;
                }
                ((zs2) arrayList.get(i)).a();
                i++;
            }
        }
        this.p = ikw0Var;
        return ikw0Var;
    }

    @Override // defpackage.at2
    public final long t() {
        Context context = this.v;
        if (context == null) {
            context = null;
        }
        long length = context.getDatabasePath(D0().getDatabaseName()).length();
        Context context2 = this.v;
        if (context2 == null) {
            context2 = null;
        }
        File databasePath = context2.getDatabasePath(D0().getDatabaseName() + "-wal");
        File file = databasePath.exists() ? databasePath : null;
        return length + (file != null ? file.length() : 0L);
    }

    @Override // defpackage.at2
    public final h3t0 takeSnapshot() {
        g3t0 g3t0Var = h3t0.a;
        AtomicInteger atomicInteger = this.r;
        return new f3t0(atomicInteger, atomicInteger.get());
    }

    @Override // androidx.room.RoomDatabase
    public final void v0() {
        startTransaction();
    }
}
