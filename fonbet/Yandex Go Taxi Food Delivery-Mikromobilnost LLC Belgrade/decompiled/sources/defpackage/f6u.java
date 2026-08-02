package defpackage;

import androidx.datastore.core.MulticastFileObserver;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final /* synthetic */ class f6u implements m1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6u(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.m1k
    public final void dispose() {
        Object obj;
        Map map;
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        Map map2;
        switch (this.a) {
            case 0:
                g6u g6uVar = (g6u) this.b;
                g6uVar.b.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                kn2 kn2Var = (kn2) this.c;
                obj = MulticastFileObserver.LOCK;
                synchronized (obj) {
                    MulticastFileObserver.Companion.getClass();
                    map = MulticastFileObserver.fileObservers;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) map.get(str);
                    if (multicastFileObserver != null) {
                        copyOnWriteArrayList = multicastFileObserver.delegates;
                        copyOnWriteArrayList.remove(kn2Var);
                        copyOnWriteArrayList2 = multicastFileObserver.delegates;
                        if (copyOnWriteArrayList2.isEmpty()) {
                            map2 = MulticastFileObserver.fileObservers;
                            map2.remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
