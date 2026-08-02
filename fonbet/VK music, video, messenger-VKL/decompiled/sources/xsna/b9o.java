package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.a;
import androidx.media3.exoplayer.offline.d;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.vk.log.L;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.j7q;

/* compiled from: DownloadManager.java */
/* loaded from: classes3.dex */
public final class b9o {
    public static final Requirements m = new Requirements(1);
    public final Handler a;
    public final b b;
    public final CopyOnWriteArraySet<c> c;
    public final swk d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public List<n7o> k;
    public final t8g0 l;

    /* compiled from: DownloadManager.java */
    public static final class a {
        public final n7o a;
        public final boolean b;
        public final ArrayList c;

        public a(n7o n7oVar, boolean z, ArrayList arrayList, @Nullable Exception exc) {
            this.a = n7oVar;
            this.b = z;
            this.c = arrayList;
        }
    }

    /* compiled from: DownloadManager.java */
    public static final class b extends Handler {
        public boolean a;
        public final HandlerThread b;
        public final zzx0 c;
        public final otl d;
        public final Handler e;
        public final ArrayList<n7o> f;
        public final HashMap<String, d> g;
        public final swk h;
        public int i;
        public boolean j;
        public int k;
        public int l;
        public int m;

        public b(HandlerThread handlerThread, swk swkVar, zzx0 zzx0Var, otl otlVar, Handler handler, int i, boolean z) {
            super(handlerThread.getLooper());
            this.b = handlerThread;
            this.h = swkVar;
            this.c = zzx0Var;
            this.d = otlVar;
            this.e = handler;
            this.k = i;
            this.l = 5;
            this.j = z;
            this.f = new ArrayList<>();
            this.g = new HashMap<>();
        }

        public static n7o a(n7o n7oVar, int i, int i2) {
            return new n7o(n7oVar.a, i, n7oVar.c, System.currentTimeMillis(), n7oVar.e, i2, 0, n7oVar.h);
        }

        @Nullable
        public final n7o b(String str, boolean z) {
            int c = c(str);
            if (c != -1) {
                return this.f.get(c);
            }
            if (!z) {
                return null;
            }
            try {
                return yao.b(this.c.b(str));
            } catch (IOException e) {
                ahn.o("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }

        public final int c(String str) {
            int i = 0;
            while (true) {
                ArrayList<n7o> arrayList = this.f;
                if (i >= arrayList.size()) {
                    return -1;
                }
                if (arrayList.get(i).a.b.equals(str)) {
                    return i;
                }
                i++;
            }
        }

        public final void d(n7o n7oVar) {
            int i = n7oVar.b;
            fxc0.z((i == 3 || i == 4) ? false : true);
            int c = c(n7oVar.a.b);
            ArrayList<n7o> arrayList = this.f;
            if (c == -1) {
                arrayList.add(n7oVar);
                Collections.sort(arrayList, new c9o(0));
            } else {
                boolean z = n7oVar.c != arrayList.get(c).c;
                arrayList.set(c, n7oVar);
                if (z) {
                    Collections.sort(arrayList, new c9o(0));
                }
            }
            try {
                this.c.d(yao.a(n7oVar));
            } catch (IOException e) {
                ahn.o("DownloadManager", "Failed to update index.", e);
            }
            this.e.obtainMessage(2, new a(n7oVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final n7o e(n7o n7oVar, int i, int i2) {
            fxc0.z((i == 3 || i == 4) ? false : true);
            n7o a = a(n7oVar, i, i2);
            d(a);
            return a;
        }

        public final void f(n7o n7oVar, int i) {
            if (i == 0) {
                if (n7oVar.b == 1) {
                    e(n7oVar, 0, 0);
                }
            } else if (i != n7oVar.f) {
                int i2 = n7oVar.b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                d(new n7o(n7oVar.a, i2, n7oVar.c, System.currentTimeMillis(), n7oVar.e, i, 0, n7oVar.h));
            }
        }

        public final void g() {
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList<n7o> arrayList = this.f;
                if (i >= arrayList.size()) {
                    return;
                }
                n7o n7oVar = arrayList.get(i);
                DownloadRequest downloadRequest = n7oVar.a;
                String str = downloadRequest.b;
                HashMap<String, d> hashMap = this.g;
                d dVar = hashMap.get(str);
                int i3 = n7oVar.b;
                otl otlVar = this.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            dVar.getClass();
                            fxc0.z(!dVar.e);
                            if (this.j || this.i != 0 || i2 >= this.k) {
                                e(n7oVar, 0, 0);
                                dVar.a(false);
                            }
                        } else {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar == null) {
                                d dVar2 = new d(n7oVar.a, otlVar.a(downloadRequest), n7oVar.h, true, this.l, this);
                                hashMap.put(downloadRequest.b, dVar2);
                                dVar2.start();
                            } else if (!dVar.e) {
                                dVar.a(false);
                            }
                        }
                    } else if (dVar != null) {
                        fxc0.z(!dVar.e);
                        dVar.a(false);
                    }
                } else if (dVar != null) {
                    fxc0.z(!dVar.e);
                    dVar.a(false);
                } else if (this.j || this.i != 0 || this.m >= this.k) {
                    dVar = null;
                } else {
                    n7o e = e(n7oVar, 2, 0);
                    DownloadRequest downloadRequest2 = e.a;
                    d dVar3 = new d(e.a, otlVar.a(downloadRequest2), e.h, false, this.l, this);
                    hashMap.put(downloadRequest2.b, dVar3);
                    int i4 = this.m;
                    this.m = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.e) {
                    i2++;
                }
                i++;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a.C0060a c0060a = null;
            int i = 7;
            r10 = 0;
            int i2 = 0;
            switch (message.what) {
                case 0:
                    int i3 = message.arg1;
                    zzx0 zzx0Var = this.c;
                    ArrayList<n7o> arrayList = this.f;
                    this.i = i3;
                    try {
                        try {
                            try {
                                zzx0Var.f();
                                c0060a = zzx0Var.g(0, 1, 2, 5, 7);
                                while (c0060a.moveToNext()) {
                                    arrayList.add(yao.b(androidx.media3.exoplayer.offline.a.l(c0060a.b)));
                                }
                            } finally {
                                y2r0.h(c0060a);
                            }
                        } catch (IOException e) {
                            ahn.o("DownloadManager", "Failed to load index.", e);
                            arrayList.clear();
                        }
                        this.e.obtainMessage(0, new ArrayList(arrayList)).sendToTarget();
                        g();
                        i2 = 1;
                        this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                        return;
                    } catch (SQLiteException e2) {
                        L.f("DownloadManager", "Failed to access database", e2);
                        twk.a(this.h.getReadableDatabase());
                        throw e2;
                    }
                case 1:
                    this.j = message.arg1 != 0;
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 2:
                    this.i = message.arg1;
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i4 = message.arg1;
                    zzx0 zzx0Var2 = this.c;
                    ArrayList<n7o> arrayList2 = this.f;
                    if (str == null) {
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            f(arrayList2.get(i5), i4);
                        }
                        try {
                            zzx0Var2.h(i4);
                        } catch (IOException e3) {
                            ahn.o("DownloadManager", "Failed to set manual stop reason", e3);
                        }
                    } else {
                        n7o b = b(str, false);
                        if (b != null) {
                            f(b, i4);
                        } else {
                            try {
                                zzx0Var2.c(i4, str);
                            } catch (IOException e4) {
                                ahn.o("DownloadManager", "Failed to set manual stop reason: ".concat(str), e4);
                            }
                        }
                    }
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 4:
                    this.k = message.arg1;
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 5:
                    this.l = message.arg1;
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i6 = message.arg1;
                    n7o b2 = b(downloadRequest.b, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (b2 != null) {
                        int i7 = b2.b;
                        long j = (i7 == 5 || i7 == 3 || i7 == 4) ? currentTimeMillis : b2.c;
                        if (i7 != 5 && i7 != 7) {
                            i = i6 != 0 ? 1 : 0;
                        }
                        d(new n7o(b2.a.a(downloadRequest), i, j, currentTimeMillis, i6));
                    } else {
                        d(new n7o(downloadRequest, i6 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i6));
                    }
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    n7o b3 = b(str2, true);
                    if (b3 == null) {
                        ahn.n("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(b3, 5, 0);
                        g();
                    }
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 8:
                    zzx0 zzx0Var3 = this.c;
                    ArrayList<n7o> arrayList3 = this.f;
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        a.C0060a g = zzx0Var3.g(3, 4);
                        while (g.moveToNext()) {
                            try {
                                arrayList4.add(yao.b(androidx.media3.exoplayer.offline.a.l(g.b)));
                            } finally {
                            }
                        }
                        g.close();
                    } catch (IOException unused) {
                        ahn.n("DownloadManager", "Failed to load downloads.");
                    }
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        arrayList3.set(i8, a(arrayList3.get(i8), 5, 0));
                    }
                    for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                        arrayList3.add(a((n7o) arrayList4.get(i9), 5, 0));
                    }
                    Collections.sort(arrayList3, new c9o(0));
                    try {
                        zzx0Var3.e();
                    } catch (IOException e5) {
                        ahn.o("DownloadManager", "Failed to update index.", e5);
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList3);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        this.e.obtainMessage(2, new a(arrayList3.get(i10), false, arrayList5, null)).sendToTarget();
                    }
                    g();
                    i2 = 1;
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.b.b;
                    this.g.remove(str3);
                    boolean z = dVar.e;
                    if (!z) {
                        int i11 = this.m - 1;
                        this.m = i11;
                        if (i11 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.h) {
                        g();
                    } else {
                        Exception exc = dVar.i;
                        if (exc != null) {
                            ahn.o("DownloadManager", "Task failed: " + dVar.b + ", " + z, exc);
                        }
                        n7o b4 = b(str3, false);
                        b4.getClass();
                        int i12 = b4.b;
                        if (i12 == 2) {
                            fxc0.z(!z);
                            ArrayList<n7o> arrayList6 = this.f;
                            n7o n7oVar = new n7o(b4.a, exc == null ? 3 : 4, b4.c, System.currentTimeMillis(), b4.e, b4.f, exc == null ? 0 : 1, b4.h);
                            arrayList6.remove(c(n7oVar.a.b));
                            try {
                                this.c.d(yao.a(n7oVar));
                            } catch (IOException e6) {
                                ahn.o("DownloadManager", "Failed to update index.", e6);
                            }
                            this.e.obtainMessage(2, new a(n7oVar, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i12 != 5 && i12 != 7) {
                                throw new IllegalStateException();
                            }
                            fxc0.z(z);
                            ArrayList<n7o> arrayList7 = this.f;
                            int i13 = b4.b;
                            DownloadRequest downloadRequest2 = b4.a;
                            if (i13 == 7) {
                                int i14 = b4.f;
                                e(b4, i14 == 0 ? 0 : 1, i14);
                                g();
                            } else {
                                arrayList7.remove(c(downloadRequest2.b));
                                try {
                                    this.c.a(downloadRequest2.b);
                                } catch (IOException unused2) {
                                    ahn.n("DownloadManager", "Failed to remove from database");
                                }
                                this.e.obtainMessage(2, new a(b4, true, new ArrayList(arrayList7), null)).sendToTarget();
                            }
                        }
                        g();
                    }
                    this.e.obtainMessage(1, i2, this.g.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    long i0 = y2r0.i0(message.arg1, message.arg2);
                    n7o b5 = b(dVar2.b.b, false);
                    b5.getClass();
                    if (i0 == b5.e || i0 == -1) {
                        return;
                    }
                    d(new n7o(b5.a, b5.b, b5.c, System.currentTimeMillis(), i0, b5.f, b5.g, b5.h));
                    return;
                case 11:
                    ArrayList<n7o> arrayList8 = this.f;
                    for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                        n7o n7oVar2 = arrayList8.get(i15);
                        if (n7oVar2.b == 2) {
                            try {
                                this.c.d(yao.a(n7oVar2));
                            } catch (IOException e7) {
                                ahn.o("DownloadManager", "Failed to update index.", e7);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.g.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        this.c.f();
                    } catch (IOException e8) {
                        ahn.o("DownloadManager", "Failed to update index.", e8);
                    }
                    this.f.clear();
                    this.b.quit();
                    synchronized (this) {
                        this.a = true;
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* compiled from: DownloadManager.java */
    public static class d extends Thread implements d.a {
        public final DownloadRequest b;
        public final androidx.media3.exoplayer.offline.d c;
        public final n9o d;
        public final boolean e;
        public final int f;

        @Nullable
        public volatile b g;
        public volatile boolean h;

        @Nullable
        public Exception i;
        public long j = -1;

        public d(DownloadRequest downloadRequest, androidx.media3.exoplayer.offline.d dVar, n9o n9oVar, boolean z, int i, b bVar) {
            this.b = downloadRequest;
            this.c = dVar;
            this.d = n9oVar;
            this.e = z;
            this.f = i;
            this.g = bVar;
        }

        public final void a(boolean z) {
            if (z) {
                this.g = null;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.cancel();
            interrupt();
        }

        @Override // androidx.media3.exoplayer.offline.d.a
        public final void b(long j, long j2, float f) {
            this.d.a = j2;
            this.d.b = f;
            if (j != this.j) {
                this.j = j;
                b bVar = this.g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
            if (f == 100.0d) {
                DownloadRequest downloadRequest = this.b;
                String str = downloadRequest.b;
                String str2 = downloadRequest.d;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.e) {
                    this.c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.h) {
                        try {
                            this.c.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.h) {
                                long j2 = this.d.a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                int i2 = i + 1;
                                if (i2 > this.f) {
                                    throw e;
                                }
                                Thread.sleep(Math.min(i * 1000, 5000));
                                i = i2;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.i = e2;
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public b9o(Context context, swk swkVar, zzx0 zzx0Var, otl otlVar) {
        context.getApplicationContext();
        this.d = swkVar;
        this.h = 3;
        this.g = true;
        this.k = Collections.EMPTY_LIST;
        this.c = new CopyOnWriteArraySet<>();
        final x8o x8oVar = new x8o(this);
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, new Handler.Callback() { // from class: xsna.xao
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                try {
                    x8o.this.handleMessage(message);
                    return true;
                } catch (Throwable th) {
                    L.l(ms9.b("internal error: ", th));
                    return true;
                }
            }
        });
        this.a = handler;
        HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
        handlerThread.setUncaughtExceptionHandler(new a9o(this));
        handlerThread.start();
        b bVar = new b(handlerThread, swkVar, zzx0Var, otlVar, handler, this.h, this.g);
        this.b = bVar;
        t8g0 t8g0Var = new t8g0(context, new z7(this, 23), m);
        this.l = t8g0Var;
        int b2 = t8g0Var.b();
        this.i = b2;
        this.e = 1;
        bVar.obtainMessage(0, b2, 0).sendToTarget();
    }

    public final void a(j7q.a aVar) {
        this.c.add(aVar);
    }

    public final void b() {
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void c() {
        f(true);
    }

    public final void d() {
        synchronized (this.b) {
            try {
                b bVar = this.b;
                if (bVar.a) {
                    return;
                }
                bVar.sendEmptyMessage(12);
                boolean z = false;
                while (true) {
                    b bVar2 = this.b;
                    if (bVar2.a) {
                        break;
                    }
                    try {
                        bVar2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                this.a.removeCallbacksAndMessages(null);
                this.l.c();
                this.k = Collections.EMPTY_LIST;
                this.e = 0;
                this.f = false;
                this.i = 0;
                this.j = false;
                Iterator<c> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().onReleased();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str) {
        this.e++;
        this.b.obtainMessage(7, str).sendToTarget();
    }

    public final void f(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        this.e++;
        this.b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean i = i();
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (i) {
            b();
        }
    }

    public final void g() {
        if (this.h == 1) {
            return;
        }
        this.h = 1;
        this.e++;
        this.b.obtainMessage(4, 1, 0).sendToTarget();
    }

    public final void h(@Nullable String str) {
        this.e++;
        this.b.obtainMessage(3, 1, 0, str).sendToTarget();
    }

    public final boolean i() {
        boolean z;
        if (!this.g && this.i != 0) {
            for (int i = 0; i < this.k.size(); i++) {
                if (this.k.get(i).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.j != z;
        this.j = z;
        return z2;
    }

    /* compiled from: DownloadManager.java */
    public interface c {
        default void b() {
        }

        default void onInitialized() {
        }

        default void onReleased() {
        }

        default void a(b9o b9oVar, n7o n7oVar) {
        }
    }
}
