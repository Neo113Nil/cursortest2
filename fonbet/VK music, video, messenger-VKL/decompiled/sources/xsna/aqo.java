package xsna;

import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.log.L;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class aqo implements plk0 {
    @Override // xsna.suk0
    public final void a(olk0 olk0Var) {
        ScheduledExecutorService scheduledExecutorService;
        DynamicTask dynamicTask;
        olk0 olk0Var2 = olk0Var;
        L.p("DynamicLibLoader", "Dynamic lib new state - " + olk0Var2);
        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
        final int g = olk0Var2.g();
        HashMap<Integer, io.reactivex.rxjava3.subjects.d<b.AbstractC0762b>> hashMap = com.vk.core.dynamic_loader.b.i;
        final io.reactivex.rxjava3.subjects.d dVar = hashMap.get(Integer.valueOf(g));
        if (dVar == null) {
            return;
        }
        int i = 2;
        switch (olk0Var2.h()) {
            case 0:
            case 3:
            case 9:
                com.vk.core.dynamic_loader.b.j.remove(Integer.valueOf(g));
                return;
            case 1:
                dVar.onNext(b.AbstractC0762b.e.a);
                return;
            case 2:
                b.AbstractC0762b.d dVar2 = new b.AbstractC0762b.d((int) ((olk0Var2.a() / olk0Var2.i()) * 100));
                b.AbstractC0762b abstractC0762b = (b.AbstractC0762b) dVar.P0();
                if (abstractC0762b != null && !(abstractC0762b instanceof b.AbstractC0762b.d) && !(abstractC0762b instanceof b.AbstractC0762b.a) && dVar2.a()) {
                    dVar.onNext(b.AbstractC0762b.g.a);
                }
                dVar.onNext(dVar2);
                return;
            case 4:
                dVar.onNext(b.AbstractC0762b.c.a);
                return;
            case 5:
                hashMap.remove(Integer.valueOf(g));
                com.vk.core.dynamic_loader.b.a(new wr4(g, dVar));
                return;
            case 6:
                Integer remove = com.vk.core.dynamic_loader.b.j.remove(Integer.valueOf(g));
                if (olk0Var2.c() != -7 || remove == null || remove.intValue() >= 4) {
                    hashMap.remove(Integer.valueOf(g));
                    com.vk.core.dynamic_loader.b.a(new zr4(g, dVar, olk0Var2));
                    return;
                }
                ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
                reentrantLock.lock();
                try {
                    Iterator<Map.Entry<DynamicTask, Integer>> it = com.vk.core.dynamic_loader.b.g.entrySet().iterator();
                    while (true) {
                        scheduledExecutorService = null;
                        if (it.hasNext()) {
                            Map.Entry<DynamicTask, Integer> next = it.next();
                            dynamicTask = next.getKey();
                            if (next.getValue().intValue() != g) {
                                dynamicTask = null;
                            }
                            if (dynamicTask != null) {
                            }
                        } else {
                            dynamicTask = null;
                        }
                    }
                    if (dynamicTask != null) {
                        com.vk.core.dynamic_loader.b.g.remove(dynamicTask);
                        L.p("DynamicLibLoader", "Reenqueue " + dynamicTask.name() + " after fail");
                        c63 c63Var = c63.a;
                        if (c63.f) {
                            com.vk.core.dynamic_loader.b.m = true;
                            ScheduledExecutorService scheduledExecutorService2 = com.vk.core.dynamic_loader.b.d;
                            if (scheduledExecutorService2 != null) {
                                scheduledExecutorService = scheduledExecutorService2;
                            }
                            scheduledExecutorService.schedule(new r0a(dynamicTask, dVar, remove, i), 2L, TimeUnit.SECONDS);
                        } else {
                            com.vk.core.dynamic_loader.b.k.addFirst(new b.a(remove.intValue() + 1, dynamicTask, dVar));
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 7:
                hashMap.remove(Integer.valueOf(g));
                final DynamicTask b = com.vk.core.dynamic_loader.b.b(g);
                com.vk.core.dynamic_loader.b.a(new gzs() { // from class: xsna.bqo
                    @Override // xsna.gzs
                    public final Object invoke() {
                        DynamicTask dynamicTask2 = b;
                        if (dynamicTask2 != null) {
                            com.vk.core.dynamic_loader.b.g.remove(dynamicTask2);
                            uqn0 remove2 = com.vk.core.dynamic_loader.b.h.remove(dynamicTask2);
                            if (remove2 != null) {
                                remove2.c();
                                vpo vpoVar2 = com.vk.core.dynamic_loader.b.a;
                                if (vpoVar2 != null) {
                                    vpoVar2.b(dynamicTask2, g, remove2.a());
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder("Cancel loading dynamic library - ");
                        sb.append(dynamicTask2 != null ? dynamicTask2.name() : null);
                        dVar.onError(new DynamicException.Cancellation(sb.toString()));
                        return s3q0.a;
                    }
                });
                return;
            case 8:
                dVar.onNext(new b.AbstractC0762b.C0763b(new zkb(olk0Var2, g, i)));
                return;
            default:
                return;
        }
    }
}
