package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class W6 extends InterruptionSafeThread {
    public final C4927j5 a;
    public final /* synthetic */ X6 b;

    public W6(X6 x6, C4927j5 c4927j5) {
        this.b = x6;
        this.a = c4927j5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.b.j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC4802e9) it2.next()).a(arrayList2);
            }
            ((C5262w5) this.a.p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (X6.a(this.b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.b.e) {
                arrayList = new ArrayList(this.b.f);
                this.b.f.clear();
            }
            X6 x6 = this.b;
            x6.getClass();
            if (!arrayList.isEmpty()) {
                long j = ((C5224uh) x6.h.k.a()).v;
                x6.b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = x6.c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                x6.i.incrementAndGet();
                                x6.a(contentValues, "Event saved to db");
                            }
                            if (x6.i.get() > j) {
                                i = x6.a(writableDatabase);
                                x6.i.addAndGet(-i);
                            } else {
                                i = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i != 0) {
                                Iterator it2 = x6.j.iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC4802e9) it2.next()).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            x6.b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                x6.b.unlock();
            }
            a(arrayList);
        }
    }
}
