package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class j8q0 implements u7m {
    public final npg a;
    public final gg90 b;
    public final ArrayList c;
    public final db7 d;
    public final ra7 e;
    public final pb7 f;
    public final PriorityTaskManager g;
    public final Executor h;
    public final long i;
    public final ArrayList j;
    public volatile boolean k;

    public j8q0(fe10 fe10Var, gg90 gg90Var, db7 db7Var, Executor executor) {
        fe10Var.b.getClass();
        zd10 zd10Var = fe10Var.b;
        this.a = d(zd10Var.a);
        this.b = gg90Var;
        this.c = new ArrayList(zd10Var.c);
        this.d = db7Var;
        this.h = executor;
        ra7 ra7Var = db7Var.a;
        ra7Var.getClass();
        this.e = ra7Var;
        this.f = db7Var.w;
        this.g = db7Var.z;
        this.j = new ArrayList();
        this.i = tw21.W(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT);
    }

    public static npg d(Uri uri) {
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        return mpgVar.a();
    }

    public static void f(List list, pb7 pb7Var, long j) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h8q0 h8q0Var = (h8q0) list.get(i2);
            npg npgVar = h8q0Var.b;
            String buildCacheKey = pb7Var.buildCacheKey(npgVar);
            Integer num = (Integer) hashMap.get(buildCacheKey);
            h8q0 h8q0Var2 = num == null ? null : (h8q0) list.get(num.intValue());
            if (h8q0Var2 != null) {
                long j2 = h8q0Var2.a;
                npg npgVar2 = h8q0Var2.b;
                if (h8q0Var.a <= j2 + j) {
                    Uri uri = npgVar2.a;
                    long j3 = npgVar2.g;
                    if (uri.equals(npgVar.a)) {
                        if (j3 != -1 && npgVar2.f + j3 == npgVar.f && Objects.equals(npgVar2.h, npgVar.h) && npgVar2.i == npgVar.i && npgVar2.c == npgVar.c && npgVar2.e.equals(npgVar.e)) {
                            long j4 = npgVar.g;
                            npg e = npgVar2.e(0L, j4 != -1 ? j3 + j4 : -1L);
                            num.getClass();
                            list.set(num.intValue(), new h8q0(j2, e));
                        }
                    }
                }
            }
            hashMap.put(buildCacheKey, Integer.valueOf(i));
            list.set(i, h8q0Var);
            i++;
        }
        tw21.b0(i, list.size(), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0196 A[LOOP:1: B:40:0x018c->B:42:0x0196, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3 A[EDGE_INSN: B:43:0x01a3->B:44:0x01a3 BREAK  A[LOOP:1: B:40:0x018c->B:42:0x0196], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab A[LOOP:2: B:45:0x01a9->B:46:0x01ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c0  */
    @Override // defpackage.u7m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(t7m t7mVar) {
        int i;
        int size;
        ArrayList arrayList;
        int size2;
        PriorityTaskManager priorityTaskManager;
        ArrayList arrayList2;
        eb7 b;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager2 = this.g;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.a(-4000);
        }
        boolean z = true;
        try {
            eb7 b2 = this.d.b();
            o5r o5rVar = (o5r) c(new f8q0(this, b2, this.a), false);
            if (!this.c.isEmpty()) {
                o5rVar = (o5r) o5rVar.copy(this.c);
            }
            ArrayList e = e(b2, o5rVar, false);
            Collections.sort(e);
            f(e, this.f, this.i);
            int size3 = e.size();
            int size4 = e.size() - 1;
            int i2 = 0;
            long j = 0;
            long j2 = 0;
            while (size4 >= 0) {
                try {
                    npg npgVar = ((h8q0) e.get(size4)).b;
                    String buildCacheKey = this.f.buildCacheKey(npgVar);
                    long j3 = npgVar.g;
                    if (j3 == -1) {
                        long a = bhe.a(this.e.getContentMetadata(buildCacheKey));
                        if (a != -1) {
                            j3 = a - npgVar.f;
                        }
                    }
                    long j4 = j3;
                    boolean z2 = z;
                    int i3 = size4;
                    long cachedBytes = this.e.getCachedBytes(buildCacheKey, npgVar.f, j4);
                    j2 += cachedBytes;
                    if (j4 != -1) {
                        if (j4 == cachedBytes) {
                            i2++;
                            e.remove(i3);
                        }
                        if (j != -1) {
                            j += j4;
                        }
                    } else {
                        j = -1;
                    }
                    size4 = i3 - 1;
                    z = z2;
                } catch (Throwable th) {
                    th = th;
                    i = 0;
                    while (true) {
                        size = this.j.size();
                        arrayList = this.j;
                        if (i < size) {
                            break;
                        }
                        ((skl0) arrayList.get(i)).cancel(true);
                        i++;
                    }
                    for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        ((skl0) this.j.get(size2)).blockUntilFinished();
                        g(size2);
                    }
                    priorityTaskManager = this.g;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.d(-4000);
                    }
                    throw th;
                }
            }
            boolean z3 = z;
            g8q0 g8q0Var = new g8q0(size3, i2, j, j2, t7mVar);
            arrayDeque.addAll(e);
            while (!this.k && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager3 = this.g;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.b();
                }
                if (arrayDeque2.isEmpty()) {
                    b = this.d.b();
                    bArr = new byte[131072];
                } else {
                    i8q0 i8q0Var = (i8q0) arrayDeque2.removeFirst();
                    b = i8q0Var.b;
                    bArr = i8q0Var.w;
                }
                i8q0 i8q0Var2 = new i8q0((h8q0) arrayDeque.removeFirst(), b, g8q0Var, bArr);
                b(i8q0Var2);
                this.h.execute(i8q0Var2);
                for (int size5 = this.j.size() - (z3 ? 1 : 0); size5 >= 0; size5--) {
                    i8q0 i8q0Var3 = (i8q0) this.j.get(size5);
                    if (arrayDeque.isEmpty() || i8q0Var3.isDone()) {
                        try {
                            i8q0Var3.get();
                            g(size5);
                            arrayDeque2.addLast(i8q0Var3);
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(i8q0Var3.a);
                            g(size5);
                            arrayDeque2.addLast(i8q0Var3);
                        }
                    }
                }
                i8q0Var2.blockUntilStarted();
            }
            int i4 = 0;
            while (true) {
                int size6 = this.j.size();
                arrayList2 = this.j;
                if (i4 >= size6) {
                    break;
                }
                ((skl0) arrayList2.get(i4)).cancel(z3);
                i4++;
            }
            for (int size7 = arrayList2.size() - (z3 ? 1 : 0); size7 >= 0; size7--) {
                ((skl0) this.j.get(size7)).blockUntilFinished();
                g(size7);
            }
            PriorityTaskManager priorityTaskManager4 = this.g;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.d(-4000);
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            while (true) {
                size = this.j.size();
                arrayList = this.j;
                if (i < size) {
                }
                ((skl0) arrayList.get(i)).cancel(true);
                i++;
            }
            while (size2 >= 0) {
            }
            priorityTaskManager = this.g;
            if (priorityTaskManager != null) {
            }
            throw th;
        }
    }

    public final void b(skl0 skl0Var) {
        synchronized (this.j) {
            try {
                if (this.k) {
                    throw new InterruptedException();
                }
                this.j.add(skl0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(skl0 skl0Var, boolean z) {
        if (z) {
            skl0Var.run();
            try {
                return skl0Var.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = tw21.a;
                throw e;
            }
        }
        while (!this.k) {
            PriorityTaskManager priorityTaskManager = this.g;
            if (priorityTaskManager != null) {
                priorityTaskManager.b();
            }
            b(skl0Var);
            this.h.execute(skl0Var);
            try {
                return skl0Var.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = tw21.a;
                    throw e2;
                }
            } finally {
                skl0Var.blockUntilFinished();
                h(skl0Var);
            }
        }
        throw new InterruptedException();
    }

    @Override // defpackage.u7m
    public final void cancel() {
        synchronized (this.j) {
            try {
                this.k = true;
                for (int i = 0; i < this.j.size(); i++) {
                    ((skl0) this.j.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(eb7 eb7Var, o5r o5rVar, boolean z);

    public final void g(int i) {
        synchronized (this.j) {
            this.j.remove(i);
        }
    }

    public final void h(skl0 skl0Var) {
        synchronized (this.j) {
            this.j.remove(skl0Var);
        }
    }

    @Override // defpackage.u7m
    public final void remove() {
        ra7 ra7Var = this.e;
        pb7 pb7Var = this.f;
        npg npgVar = this.a;
        db7 db7Var = this.d;
        eb7 c = db7Var.c(null, db7Var.B | 1, -4000);
        try {
            try {
                ArrayList e = e(c, (o5r) c(new f8q0(this, c, npgVar), true), true);
                for (int i = 0; i < e.size(); i++) {
                    ra7Var.removeResource(pb7Var.buildCacheKey(((h8q0) e.get(i)).b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            ra7Var.removeResource(pb7Var.buildCacheKey(npgVar));
        }
    }
}
