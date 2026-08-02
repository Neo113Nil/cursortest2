package defpackage;

import com.yandex.div.core.d;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class d5l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ d5l(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map t;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                d dVar = this.b;
                bay bayVar = dVar.c;
                bayVar.b--;
                d.h(dVar);
                return;
            case 1:
                d dVar2 = this.b;
                dVar2.d.set(true);
                d.h(dVar2);
                return;
            case 2:
                this.b.c.b++;
                return;
            default:
                synchronized (this.b.b) {
                    t = b.t(this.b.b);
                }
                int size = t.size();
                if (t.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = t.entrySet().iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((ppe0) ((Map.Entry) it.next()).getValue()).c) {
                            i++;
                        }
                    }
                }
                int i3 = size - i;
                int i4 = this.b.c.b;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = i4 + i3;
                if (t.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = t.entrySet().iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (((ppe0) ((Map.Entry) it2.next()).getValue()).b) {
                            i2++;
                        }
                    }
                }
                int size2 = this.b.c.a.size() + i2;
                if (i5 == 0 && this.b.d.get() && this.b.e.compareAndSet(false, true)) {
                    this.b.a.finish(size2 != 0);
                    return;
                }
                return;
        }
    }
}
