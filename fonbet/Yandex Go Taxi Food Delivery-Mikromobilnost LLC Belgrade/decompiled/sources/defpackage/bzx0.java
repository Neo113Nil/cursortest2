package defpackage;

import com.yandex.go.taxi.order.chat.data.b;
import com.yandex.go.taxi.order.chat.domain.a;
import com.yandex.messenger.websdk.api.Cancelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final /* synthetic */ class bzx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public /* synthetic */ bzx0(a aVar, String str, String str2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = str;
        this.w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ru.yandex.taxi.messenger.unreadcount.a aVar;
        switch (this.a) {
            case 0:
                a aVar2 = this.b;
                String str = this.c;
                String str2 = this.w;
                synchronized (aVar2) {
                    b bVar = (b) aVar2.p.remove(str);
                    if (bVar != null) {
                        bVar.s.a();
                        LinkedHashMap linkedHashMap = bVar.y;
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            ((l8x) ((Map.Entry) it.next()).getValue()).a(null);
                        }
                        linkedHashMap.clear();
                        bVar.x.cancel();
                    }
                    aVar2.e.a.deleteSharedPreferences("ru.yandex.taxi.chat.model.CACHE_" + str);
                    com.yandex.go.taxi.order.chat.data.db.a aVar3 = aVar2.f;
                    aVar3.b.getClass();
                    h6u0.h(aVar3.c, aVar3.d, "order_id = ?", new String[]{str});
                    com.yandex.go.taxi.order.chat.data.db.b bVar2 = aVar2.g;
                    bVar2.a.getClass();
                    h6u0.h(bVar2.b, bVar2.c, "order_id = ?", new String[]{str});
                    if (str2 != null && (aVar = (ru.yandex.taxi.messenger.unreadcount.a) aVar2.l.e.remove(str2)) != null) {
                        aVar.c = true;
                        aVar.e.a(null);
                        Cancelable cancelable = aVar.d;
                        if (cancelable != null) {
                            cancelable.cancel();
                        }
                        aVar.d = null;
                    }
                }
                return;
            default:
                a aVar4 = this.b;
                String str3 = this.c;
                String str4 = this.w;
                b c = aVar4.c(str3);
                isa0 isa0Var = new isa0(c.v.getAndIncrement(), c.c.d(), null, null, str4);
                x3y0 x3y0Var = c.s;
                synchronized (x3y0Var) {
                    x3y0Var.b.a(x3y0Var.a, isa0Var);
                    x3y0Var.c.addLast(isa0Var);
                    c.g(isa0Var);
                }
                c.n.l(c.d());
                return;
        }
    }
}
