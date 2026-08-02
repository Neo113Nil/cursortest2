package xsna;

import android.os.Handler;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicLib;
import com.vk.core.dynamic_loader.DynamicTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kpo implements izs {
    public final /* synthetic */ io.reactivex.rxjava3.subjects.d b;
    public final /* synthetic */ DynamicTask c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ kpo(int i, DynamicTask dynamicTask, io.reactivex.rxjava3.subjects.d dVar, boolean z) {
        this.b = dVar;
        this.c = dynamicTask;
        this.d = i;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        Handler handler = com.vk.core.dynamic_loader.a.f;
        final io.reactivex.rxjava3.subjects.d dVar = this.b;
        if (l != null && l.longValue() == 0) {
            handler.post(new o93(dVar, 13));
        }
        handler.post(new jx8(4, dVar, l));
        if (l != null && l.longValue() == 99) {
            handler.postDelayed(new sm9(dVar, 7), 1000L);
            handler.postDelayed(new tw3(dVar, 7), 2000L);
            final int i = this.d;
            final DynamicTask dynamicTask = this.c;
            final boolean z = this.e;
            handler.postDelayed(new Runnable() { // from class: xsna.lpo
                @Override // java.lang.Runnable
                public final void run() {
                    HashMap<DynamicTask, Integer> hashMap = com.vk.core.dynamic_loader.a.b;
                    DynamicTask dynamicTask2 = dynamicTask;
                    hashMap.remove(dynamicTask2);
                    com.vk.core.dynamic_loader.a.c.remove(Integer.valueOf(i));
                    boolean z2 = z;
                    io.reactivex.rxjava3.subjects.d dVar2 = dVar;
                    if (z2) {
                        dVar2.onError(new DynamicException.Storage("Failed to load dynamic library - " + dynamicTask2.name(), -10));
                    } else {
                        LinkedHashSet linkedHashSet = com.vk.core.dynamic_loader.a.a;
                        Set<DynamicLib> i2 = dynamicTask2.i();
                        ArrayList arrayList = new ArrayList(c5g.u(i2, 10));
                        Iterator<T> it = i2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((DynamicLib) it.next()).i());
                        }
                        linkedHashSet.addAll(arrayList);
                        dVar2.onComplete();
                    }
                    uqn0 remove = com.vk.core.dynamic_loader.a.d.remove(dynamicTask2);
                    if (remove != null) {
                        remove.c();
                    }
                }
            }, 3000L);
        }
        return s3q0.a;
    }
}
