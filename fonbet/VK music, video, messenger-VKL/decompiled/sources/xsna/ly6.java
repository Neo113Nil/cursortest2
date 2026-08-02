package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.ky6;

/* compiled from: BgApplyPreferences.kt */
/* loaded from: classes.dex */
public final class ly6 implements ky6.a.InterfaceC3212a {
    public final /* synthetic */ ky6 a;

    public ly6(ky6 ky6Var) {
        this.a = ky6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[LOOP:2: B:38:0x0077->B:39:0x0079, LOOP_END] */
    @Override // xsna.ky6.a.InterfaceC3212a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ky6.d dVar) {
        boolean z;
        int i = dVar.a;
        ky6 ky6Var = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = ky6Var.d;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ky6.b bVar = ky6Var.g;
            LinkedHashMap linkedHashMap = ky6Var.f;
            if ((bVar != null ? bVar.a : Integer.MIN_VALUE) <= i) {
                ky6Var.g = null;
            }
            Iterator<Map.Entry<String, ky6.c>> it = dVar.b.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                ky6.b bVar2 = (ky6.b) linkedHashMap.get(key);
                if (bVar2 != null && bVar2.a <= i) {
                    linkedHashMap.remove(key);
                }
            }
            if (ky6Var.g == null && linkedHashMap.isEmpty()) {
                z = false;
                ky6Var.e = z;
                s3q0 s3q0Var = s3q0.a;
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
            z = true;
            ky6Var.e = z;
            s3q0 s3q0Var2 = s3q0.a;
            while (i2 < readHoldCount) {
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:10:0x0027, B:13:0x002d, B:16:0x0044, B:17:0x004e, B:19:0x0054, B:21:0x006e, B:24:0x0072, B:30:0x007b, B:32:0x007f, B:36:0x0089, B:45:0x0034, B:47:0x0038), top: B:9:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[LOOP:2: B:37:0x008d->B:38:0x008f, LOOP_END] */
    @Override // xsna.ky6.a.InterfaceC3212a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ky6.d dVar) {
        boolean z;
        int i = dVar.a;
        ky6 ky6Var = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = ky6Var.d;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ky6.b bVar = ky6Var.g;
            LinkedHashMap linkedHashMap = ky6Var.f;
            if (bVar != null) {
                if (bVar.a < i) {
                }
                for (Map.Entry<String, ky6.c> entry : dVar.b.entrySet()) {
                    String key = entry.getKey();
                    ky6.c value = entry.getValue();
                    ky6.b bVar2 = (ky6.b) linkedHashMap.get(key);
                    if (bVar2 == null || bVar2.a < i) {
                        linkedHashMap.put(key, new ky6.b(i, value));
                    }
                }
                if (ky6Var.g == null && linkedHashMap.isEmpty()) {
                    z = false;
                    ky6Var.e = z;
                    s3q0 s3q0Var = s3q0.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
                z = true;
                ky6Var.e = z;
                s3q0 s3q0Var2 = s3q0.a;
                while (i2 < readHoldCount) {
                }
                writeLock.unlock();
            }
            if (dVar.c) {
                linkedHashMap.clear();
                ky6Var.g = new ky6.b(i, ky6.c.a.a);
            }
            while (r11.hasNext()) {
            }
            if (ky6Var.g == null) {
                z = false;
                ky6Var.e = z;
                s3q0 s3q0Var22 = s3q0.a;
                while (i2 < readHoldCount) {
                }
                writeLock.unlock();
            }
            z = true;
            ky6Var.e = z;
            s3q0 s3q0Var222 = s3q0.a;
            while (i2 < readHoldCount) {
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
