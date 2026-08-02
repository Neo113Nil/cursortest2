package xsna;

import android.os.Trace;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import xsna.w220;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qs3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.toggle.c cVar;
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        ReentrantReadWriteLock.ReadLock readLock2;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        switch (this.b) {
            case 0:
                return new ht3((b2a) obj, (u2b0) this.c);
            case 1:
                mxi0 mxi0Var = (mxi0) this.c;
                Exception exc = (Exception) obj;
                L.i(exc);
                mxi0Var.a(on00.f(new Pair("encryption_init_error", rte0.w(exc))));
                return s3q0.a;
            default:
                ToggleManager toggleManager = (ToggleManager) this.c;
                if (toggleManager.c != null) {
                    ToggleManager.z.getClass();
                    com.vk.toggle.c cVar2 = toggleManager.h;
                    x220<w220.a, b.d> x220Var = null;
                    eti etiVar = cVar2 instanceof eti ? (eti) cVar2 : null;
                    if (etiVar == null || (cVar = etiVar.b) == null) {
                        new w220("mmaped_storage").a();
                    } else {
                        while (true) {
                            c0g c0gVar = toggleManager.a;
                            readLock = c0gVar.a.readLock();
                            readLock.lock();
                            try {
                                int size = c0gVar.b.size();
                                readLock.unlock();
                                i = 0;
                                if (size != 0) {
                                    c0g c0gVar2 = toggleManager.a;
                                    readLock = c0gVar2.a.readLock();
                                    readLock.lock();
                                    try {
                                        int size2 = c0gVar2.b.size();
                                        readLock.unlock();
                                        toggleManager.b.getClass();
                                        int i2 = size2 * 32;
                                        c0g c0gVar3 = toggleManager.a;
                                        readLock = c0gVar3.a.readLock();
                                        readLock.lock();
                                        try {
                                            int i3 = c0gVar3.d;
                                            readLock.unlock();
                                            long j = i2 + i3;
                                            toggleManager.b.getClass();
                                            if (j >= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                                                c0g c0gVar4 = toggleManager.a;
                                                ReentrantReadWriteLock reentrantReadWriteLock = c0gVar4.a;
                                                ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock.readLock();
                                                int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                                                for (int i4 = 0; i4 < readHoldCount2; i4++) {
                                                    readLock3.unlock();
                                                }
                                                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
                                                writeLock2.lock();
                                                try {
                                                    if (!c0gVar4.c.isEmpty()) {
                                                        Integer num = c0gVar4.b.get(c0gVar4.c.pop());
                                                        c0gVar4.d -= num != null ? num.intValue() : 0;
                                                    }
                                                    s3q0 s3q0Var = s3q0.a;
                                                    while (i < readHoldCount2) {
                                                        readLock3.lock();
                                                        i++;
                                                    }
                                                    writeLock2.unlock();
                                                } catch (Throwable th) {
                                                    while (i < readHoldCount2) {
                                                        readLock3.lock();
                                                        i++;
                                                    }
                                                    writeLock2.unlock();
                                                    throw th;
                                                }
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            } finally {
                            }
                        }
                        c0g c0gVar5 = toggleManager.a;
                        readLock = c0gVar5.a.readLock();
                        readLock.lock();
                        try {
                            Set S0 = j5g.S0(c0gVar5.b.keySet());
                            readLock.unlock();
                            Set<String> set = S0;
                            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                            for (String str : set) {
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.d, new Object[]{go9.b("Save important toggle key=", str)});
                                }
                                b.d b = cVar.b(str, false);
                                if (b == null) {
                                    b = new b.d(str);
                                }
                                arrayList.add(b);
                            }
                            w220 w220Var = toggleManager.b;
                            w220Var.getClass();
                            Trace.beginSection(ndp0.f("MemoryMappedFeatureSource.saveAll"));
                            try {
                                try {
                                    ReentrantReadWriteLock reentrantReadWriteLock2 = w220Var.a;
                                    readLock2 = reentrantReadWriteLock2.readLock();
                                    readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                                    for (int i5 = 0; i5 < readHoldCount; i5++) {
                                        readLock2.unlock();
                                    }
                                    writeLock = reentrantReadWriteLock2.writeLock();
                                    writeLock.lock();
                                } catch (Exception e) {
                                    w220Var.a();
                                    izs<? super Throwable, s3q0> izsVar = w220Var.f;
                                    if (izsVar != null) {
                                        izsVar.invoke(e);
                                    }
                                }
                                try {
                                    File file = new File(w220Var.c);
                                    file.mkdirs();
                                    new File(file, w220Var.d).createNewFile();
                                    w220Var.b();
                                    x220<w220.a, b.d> x220Var2 = w220Var.b;
                                    if (x220Var2 != null) {
                                        int e2 = on00.e(c5g.u(arrayList, 10));
                                        if (e2 < 16) {
                                            e2 = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            linkedHashMap.put(new w220.a(((b.d) next).b.toString()), next);
                                        }
                                        x220Var = x220Var2.c(linkedHashMap.entrySet());
                                    }
                                    w220Var.b = x220Var;
                                    s3q0 s3q0Var2 = s3q0.a;
                                    while (i < readHoldCount) {
                                        readLock2.lock();
                                        i++;
                                    }
                                    writeLock.unlock();
                                    s3q0 s3q0Var3 = s3q0.a;
                                    Trace.endSection();
                                } finally {
                                    while (i < readHoldCount) {
                                        readLock2.lock();
                                        i++;
                                    }
                                    writeLock.unlock();
                                }
                            } finally {
                                Trace.endSection();
                            }
                        } finally {
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
