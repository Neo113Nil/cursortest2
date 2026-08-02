package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import ru.yandex.taxi.communications.TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1;

/* loaded from: classes9.dex */
public final class cay0 implements gep0 {
    public final hit a;
    public final p3h b;
    public final xzq0 c;
    public final j63 d;
    public final CopyOnWriteArrayList e;
    public pzt0 f;

    public cay0(hit hitVar, p3h p3hVar, xzq0 xzq0Var) {
        this.a = hitVar;
        this.b = p3hVar;
        this.c = xzq0Var;
        String[] strArr = {"pickup_location", "taxi_driving", "taxi_waiting", "taxi_transporting"};
        j63 j63Var = new j63(4);
        for (int i = 0; i < 4; i++) {
            j63Var.add(strArr[i]);
        }
        this.d = j63Var;
        this.e = new CopyOnWriteArrayList();
    }

    public final void a(Consumer consumer) {
        this.e.add(consumer);
        pzt0 pzt0Var = this.f;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.f = tje.N(this.a.a, null, null, new TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1(this.c.f, null, this), 3);
        }
    }

    public final String b() {
        return this.c.m();
    }

    public final void c(Consumer consumer) {
        pzt0 pzt0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        copyOnWriteArrayList.remove(consumer);
        if (!copyOnWriteArrayList.isEmpty() || (pzt0Var = this.f) == null) {
            return;
        }
        pzt0Var.a(null);
    }
}
