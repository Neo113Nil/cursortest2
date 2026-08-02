package xsna;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.SingleThreadExecutor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Lambda;
import xsna.xv6;

/* compiled from: SendBeaconWorkerImpl.kt */
/* loaded from: classes7.dex */
public final class mhi0 {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final c b = new c(null, "SendBeacon");
    public final a c = new a(this);

    /* compiled from: SendBeaconWorkerImpl.kt */
    public final class a {
        public final bpn0 a;

        /* compiled from: SendBeaconWorkerImpl.kt */
        /* renamed from: xsna.mhi0$a$a, reason: collision with other inner class name */
        public static final class C3343a extends Lambda implements gzs<b> {
            final /* synthetic */ mhi0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3343a(mhi0 mhi0Var) {
                super(0);
                this.this$0 = mhi0Var;
            }

            @Override // xsna.gzs
            public final b invoke() {
                mhi0 mhi0Var = this.this$0;
                return mhi0Var.new b(mhi0Var.a);
            }
        }

        public a(mhi0 mhi0Var) {
            this.a = new bpn0(new C3343a(mhi0Var));
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    public final class b implements Iterable<xv6>, gcy {
        public final jhi0 b;
        public final ArrayDeque c;

        /* compiled from: SendBeaconWorkerImpl.kt */
        public static final class a implements Iterator<xv6>, gcy {
            public xv6 b;
            public final /* synthetic */ Iterator<xv6> c;
            public final /* synthetic */ b d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends xv6> it, b bVar) {
                this.c = it;
                this.d = bVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.c.hasNext();
            }

            @Override // java.util.Iterator
            public final xv6 next() {
                xv6 next = this.c.next();
                this.b = next;
                return next;
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.c.remove();
                b bVar = this.d;
                jhi0 jhi0Var = bVar.b;
                xv6 xv6Var = this.b;
                xv6.a a = xv6Var != null ? xv6Var.a() : null;
                if (a == null) {
                    jhi0Var.getClass();
                } else {
                    SQLiteDatabase writableDatabase = jhi0Var.getWritableDatabase();
                    try {
                        writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(a.d)});
                        writableDatabase.close();
                    } finally {
                    }
                }
                bVar.c();
            }
        }

        /* JADX WARN: Finally extract failed */
        public b(Context context) {
            Cursor cursor = null;
            jhi0 jhi0Var = new jhi0(context, null, null, 2);
            Assert.assertTrue(context instanceof Application);
            this.b = jhi0Var;
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase readableDatabase = jhi0Var.getReadableDatabase();
            try {
                cursor = readableDatabase.query("items", jhi0.b, null, null, null, null, null, null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        arrayList.add(jhi0.b(cursor));
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                readableDatabase.close();
                ArrayDeque arrayDeque = new ArrayDeque(arrayList);
                this.c = arrayDeque;
                Log.e("SendBeaconWorker", "Reading from database, items count: " + arrayDeque.size());
                c();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                readableDatabase.close();
                throw th;
            }
        }

        public final void c() {
            this.c.isEmpty();
            int i = mhi0.d;
            mhi0.this.getClass();
        }

        @Override // java.lang.Iterable
        public final Iterator<xv6> iterator() {
            return new a(this.c.iterator(), this);
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    public static final class c extends SingleThreadExecutor {
    }

    static {
        TimeUnit.DAYS.toMillis(1L);
    }

    public mhi0(Context context, ihi0 ihi0Var) {
        this.a = context;
        new AtomicReference(null);
        Log.d("SendBeaconWorker", "SendBeaconWorker created");
    }
}
