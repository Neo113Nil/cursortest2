package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.d9o;

/* loaded from: classes10.dex */
public final class kj0 extends Handler {
    public final HandlerThread a;
    public final rq3 b;
    public final tj0 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;

    public kj0(HandlerThread handlerThread, rc0 rc0Var, sc0 sc0Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = rc0Var;
        this.c = sc0Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static int a(hj0 hj0Var, hj0 hj0Var2) {
        long j = hj0Var.c;
        long j2 = hj0Var2.c;
        int i = mc3.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public final void b() {
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            hj0 hj0Var = (hj0) this.e.get(i2);
            mj0 mj0Var = (mj0) this.f.get(hj0Var.a.b);
            int i3 = hj0Var.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        mj0Var.getClass();
                        if (mj0Var.e) {
                            throw new IllegalStateException();
                        }
                        if (this.h || this.g != 0 || i >= this.i) {
                            a(hj0Var, 0, 0);
                            mj0Var.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            throw new IllegalStateException();
                        }
                        if (mj0Var == null) {
                            mj0 mj0Var2 = new mj0(hj0Var.a, ((sc0) this.c).a(hj0Var.a), hj0Var.h, true, this.j, this);
                            this.f.put(hj0Var.a.b, mj0Var2);
                            mj0Var2.start();
                        } else if (!mj0Var.e) {
                            mj0Var.a(false);
                        }
                    }
                } else if (mj0Var != null) {
                    if (mj0Var.e) {
                        throw new IllegalStateException();
                    }
                    mj0Var.a(false);
                }
            } else if (mj0Var != null) {
                if (mj0Var.e) {
                    throw new IllegalStateException();
                }
                mj0Var.a(false);
            } else if (this.h || this.g != 0 || this.k >= this.i) {
                mj0Var = null;
            } else {
                hj0 a = a(hj0Var, 2, 0);
                mj0 mj0Var3 = new mj0(a.a, ((sc0) this.c).a(a.a), a.h, false, this.j, this);
                this.f.put(a.a.b, mj0Var3);
                int i4 = this.k;
                this.k = i4 + 1;
                if (i4 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                mj0Var3.start();
                mj0Var = mj0Var3;
            }
            if (mj0Var != null && !mj0Var.e) {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qc0 qc0Var;
        List list;
        qc0 qc0Var2 = null;
        int i = 7;
        r10 = 0;
        int i2 = 0;
        switch (message.what) {
            case 0:
                this.g = message.arg1;
                try {
                    try {
                        ((rc0) this.b).b();
                        int[] iArr = {0, 1, 2, 5, 7};
                        rc0 rc0Var = (rc0) this.b;
                        rc0Var.a();
                        StringBuilder sb = new StringBuilder("state IN (");
                        for (int i3 = 0; i3 < 5; i3++) {
                            if (i3 > 0) {
                                sb.append(',');
                            }
                            sb.append(iArr[i3]);
                        }
                        sb.append(')');
                        qc0Var = new qc0(rc0Var.a(sb.toString(), (String[]) null));
                    } catch (IOException e) {
                        e = e;
                    }
                    while (true) {
                        try {
                        } catch (IOException e2) {
                            e = e2;
                            qc0Var2 = qc0Var;
                            ji1.b("DownloadManager", ji1.a("Failed to load index.", e));
                            this.e.clear();
                            mc3.a((Closeable) qc0Var2);
                            this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                            b();
                            i2 = 1;
                            this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            qc0Var2 = qc0Var;
                            mc3.a((Closeable) qc0Var2);
                            throw th;
                        }
                        if (!qc0Var.a.moveToPosition(qc0Var.a.getPosition() + 1)) {
                            mc3.a((Closeable) qc0Var);
                            this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                            b();
                            i2 = 1;
                            this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                            return;
                        }
                        this.e.add(rc0.a(qc0Var.a));
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 1:
                this.h = message.arg1 != 0;
                b();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 2:
                this.g = message.arg1;
                b();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 3:
                String str = (String) message.obj;
                int i4 = message.arg1;
                if (str == null) {
                    for (int i5 = 0; i5 < this.e.size(); i5++) {
                        a((hj0) this.e.get(i5), i4);
                    }
                    try {
                        rc0 rc0Var2 = (rc0) this.b;
                        rc0Var2.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i4));
                            rc0Var2.b.getWritableDatabase().update(rc0Var2.a, contentValues, rc0.e, null);
                        } catch (Throwable th3) {
                            throw new v30(th3);
                        }
                    } catch (IOException e3) {
                        ji1.b("DownloadManager", ji1.a("Failed to set manual stop reason", e3));
                    }
                } else {
                    hj0 a = a(str, false);
                    if (a != null) {
                        a(a, i4);
                    } else {
                        try {
                            ((rc0) this.b).a(i4, str);
                        } catch (IOException e4) {
                            ji1.b("DownloadManager", ji1.a("Failed to set manual stop reason: ".concat(str), e4));
                        }
                    }
                }
                b();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 4:
                this.i = message.arg1;
                b();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 5:
                this.j = message.arg1;
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 6:
                qj0 qj0Var = (qj0) message.obj;
                int i6 = message.arg1;
                hj0 a2 = a(qj0Var.b, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (a2 != null) {
                    int i7 = a2.b;
                    long j = (i7 == 5 || i7 == 3 || i7 == 4) ? currentTimeMillis : a2.c;
                    if (i7 != 5 && i7 != 7) {
                        i = i6 != 0 ? 1 : 0;
                    }
                    qj0 qj0Var2 = a2.a;
                    if (!qj0Var2.b.equals(qj0Var.b)) {
                        throw new IllegalArgumentException();
                    }
                    if (qj0Var2.e.isEmpty() || qj0Var.e.isEmpty()) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        list = new ArrayList(qj0Var2.e);
                        for (int i8 = 0; i8 < qj0Var.e.size(); i8++) {
                            z43 z43Var = (z43) qj0Var.e.get(i8);
                            if (!list.contains(z43Var)) {
                                list.add(z43Var);
                            }
                        }
                    }
                    a(new hj0(new qj0(qj0Var2.b, qj0Var.c, qj0Var.d, list, qj0Var.f, qj0Var.g, qj0Var.h), i, j, currentTimeMillis, -1L, i6, 0, new oj0()));
                } else {
                    a(new hj0(qj0Var, i6 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i6, 0, new oj0()));
                }
                b();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 7:
                String str2 = (String) message.obj;
                hj0 a3 = a(str2, true);
                if (a3 == null) {
                    ji1.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    a(a3, 5, 0);
                    b();
                }
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 8:
                a();
                i2 = 1;
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 9:
                mj0 mj0Var = (mj0) message.obj;
                String str3 = mj0Var.b.b;
                this.f.remove(str3);
                boolean z = mj0Var.e;
                if (!z) {
                    int i9 = this.k - 1;
                    this.k = i9;
                    if (i9 == 0) {
                        removeMessages(11);
                    }
                }
                if (mj0Var.h) {
                    b();
                } else {
                    Exception exc = mj0Var.i;
                    if (exc != null) {
                        ji1.b("DownloadManager", ji1.a("Task failed: " + mj0Var.b + ", " + z, exc));
                    }
                    hj0 a4 = a(str3, false);
                    a4.getClass();
                    int i10 = a4.b;
                    if (i10 != 2) {
                        if (i10 != 5 && i10 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z) {
                            throw new IllegalStateException();
                        }
                        if (i10 == 7) {
                            int i11 = a4.f;
                            a(a4, i11 == 0 ? 0 : 1, i11);
                            b();
                        } else {
                            this.e.remove(a(a4.a.b));
                            try {
                                rq3 rq3Var = this.b;
                                String str4 = a4.a.b;
                                rc0 rc0Var3 = (rc0) rq3Var;
                                rc0Var3.a();
                                try {
                                    rc0Var3.b.getWritableDatabase().delete(rc0Var3.a, "id = ?", new String[]{str4});
                                } catch (Throwable th4) {
                                    throw new v30(th4);
                                }
                            } catch (IOException unused) {
                                ji1.b("DownloadManager", "Failed to remove from database");
                            }
                            this.d.obtainMessage(2, new jj0(a4, true, new ArrayList(this.e), null)).sendToTarget();
                        }
                    } else {
                        if (z) {
                            throw new IllegalStateException();
                        }
                        hj0 hj0Var = new hj0(a4.a, exc == null ? 3 : 4, a4.c, System.currentTimeMillis(), a4.e, a4.f, exc == null ? 0 : 1, a4.h);
                        this.e.remove(a(hj0Var.a.b));
                        try {
                            ((rc0) this.b).a(hj0Var);
                        } catch (IOException e5) {
                            ji1.b("DownloadManager", ji1.a("Failed to update index.", e5));
                        }
                        this.d.obtainMessage(2, new jj0(hj0Var, false, new ArrayList(this.e), exc)).sendToTarget();
                    }
                    b();
                }
                this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                return;
            case 10:
                mj0 mj0Var2 = (mj0) message.obj;
                int i12 = message.arg1;
                int i13 = message.arg2;
                int i14 = mc3.a;
                long j2 = ((i12 & 4294967295L) << 32) | (4294967295L & i13);
                hj0 a5 = a(mj0Var2.b.b, false);
                a5.getClass();
                if (j2 == a5.e || j2 == -1) {
                    return;
                }
                a(new hj0(a5.a, a5.b, a5.c, System.currentTimeMillis(), j2, a5.f, a5.g, a5.h));
                return;
            case 11:
                for (int i15 = 0; i15 < this.e.size(); i15++) {
                    hj0 hj0Var2 = (hj0) this.e.get(i15);
                    if (hj0Var2.b == 2) {
                        try {
                            ((rc0) this.b).a(hj0Var2);
                        } catch (IOException e6) {
                            ji1.b("DownloadManager", ji1.a("Failed to update index.", e6));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((mj0) it.next()).a(true);
                }
                try {
                    ((rc0) this.b).b();
                } catch (IOException e7) {
                    ji1.b("DownloadManager", ji1.a("Failed to update index.", e7));
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final hj0 a(String str, boolean z) {
        int a = a(str);
        if (a != -1) {
            return (hj0) this.e.get(a);
        }
        if (!z) {
            return null;
        }
        try {
            return ((rc0) this.b).b(str);
        } catch (IOException e) {
            ji1.b("DownloadManager", ji1.a("Failed to load download: " + str, e));
            return null;
        }
    }

    public final int a(String str) {
        for (int i = 0; i < this.e.size(); i++) {
            if (((hj0) this.e.get(i)).a.b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final hj0 a(hj0 hj0Var) {
        int i = hj0Var.b;
        if (i != 3 && i != 4) {
            int a = a(hj0Var.a.b);
            if (a == -1) {
                this.e.add(hj0Var);
                Collections.sort(this.e, new d9o(2));
            } else {
                boolean z = hj0Var.c != ((hj0) this.e.get(a)).c;
                this.e.set(a, hj0Var);
                if (z) {
                    Collections.sort(this.e, new d9o(2));
                }
            }
            try {
                ((rc0) this.b).a(hj0Var);
            } catch (IOException e) {
                ji1.b("DownloadManager", ji1.a("Failed to update index.", e));
            }
            this.d.obtainMessage(2, new jj0(hj0Var, false, new ArrayList(this.e), null)).sendToTarget();
            return hj0Var;
        }
        throw new IllegalStateException();
    }

    public final hj0 a(hj0 hj0Var, int i, int i2) {
        if (i != 3 && i != 4) {
            return a(new hj0(hj0Var.a, i, hj0Var.c, System.currentTimeMillis(), hj0Var.e, i2, 0, hj0Var.h));
        }
        throw new IllegalStateException();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            int[] iArr = {3, 4};
            rc0 rc0Var = (rc0) this.b;
            rc0Var.a();
            StringBuilder sb = new StringBuilder("state IN (");
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(iArr[i]);
            }
            sb.append(')');
            Cursor a = rc0Var.a(sb.toString(), (String[]) null);
            while (a.moveToPosition(a.getPosition() + 1)) {
                try {
                    arrayList.add(rc0.a(a));
                } finally {
                }
            }
            a.close();
        } catch (IOException unused) {
            ji1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ArrayList arrayList2 = this.e;
            hj0 hj0Var = (hj0) arrayList2.get(i2);
            arrayList2.set(i2, new hj0(hj0Var.a, 5, hj0Var.c, System.currentTimeMillis(), hj0Var.e, 0, 0, hj0Var.h));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ArrayList arrayList3 = this.e;
            hj0 hj0Var2 = (hj0) arrayList.get(i3);
            arrayList3.add(new hj0(hj0Var2.a, 5, hj0Var2.c, System.currentTimeMillis(), hj0Var2.e, 0, 0, hj0Var2.h));
        }
        Collections.sort(this.e, new d9o(2));
        try {
            ((rc0) this.b).c();
        } catch (IOException e) {
            ji1.b("DownloadManager", ji1.a("Failed to update index.", e));
        }
        ArrayList arrayList4 = new ArrayList(this.e);
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            this.d.obtainMessage(2, new jj0((hj0) this.e.get(i4), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final void a(hj0 hj0Var, int i) {
        if (i == 0) {
            if (hj0Var.b == 1) {
                a(hj0Var, 0, 0);
            }
        } else if (i != hj0Var.f) {
            int i2 = hj0Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            a(new hj0(hj0Var.a, i2, hj0Var.c, System.currentTimeMillis(), hj0Var.e, i, 0, hj0Var.h));
        }
    }
}
