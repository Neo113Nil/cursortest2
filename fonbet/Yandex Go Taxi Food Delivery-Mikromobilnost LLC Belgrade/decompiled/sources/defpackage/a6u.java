package defpackage;

import com.yandex.quark.js.event.c;
import com.yandex.quark.js.event.d;
import com.yandex.quark.js.event.e;
import com.yandex.quark.js.event.g;
import com.yandex.quark.js.event.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a6u implements ifo {
    public final /* synthetic */ int a;
    public final lc41 b;

    public /* synthetic */ a6u(lc41 lc41Var, int i) {
        this.a = i;
        this.b = lc41Var;
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        switch (this.a) {
            case 0:
                return iVar instanceof c;
            case 1:
                return iVar instanceof d;
            case 2:
                return iVar instanceof e;
            default:
                return iVar instanceof g;
        }
    }

    @Override // defpackage.ifo
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        Object value;
        LinkedHashMap linkedHashMap;
        Object value2;
        LinkedHashMap linkedHashMap2;
        switch (this.a) {
            case 0:
                wdo wdoVar = (wdo) ((c) iVar).a();
                lc41 lc41Var = this.b;
                String a = wdoVar.a();
                png b = wdoVar.b();
                synchronized (lc41Var) {
                    hc41 hc41Var = (hc41) ((Map) lc41Var.x.getValue()).get(new z28(a));
                    if (hc41Var == null) {
                        lc41Var.a.e("WebCapabilityRegistry", "Event was not delivered because there is no capability with id = ".concat(z28.a(a)));
                    } else {
                        hc41Var.f(b);
                    }
                }
                return zy11.a;
            case 1:
                zdo zdoVar = (zdo) ((d) iVar).a();
                lc41 lc41Var2 = this.b;
                String b2 = zdoVar.b();
                png c = zdoVar.c();
                List d = zdoVar.d();
                ArrayList arrayList = new ArrayList(tcc.n(d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dnj((String) it.next()));
                }
                jc41 jc41Var = new jc41(b2, c, a.N0(arrayList));
                synchronized (lc41Var2) {
                    if (((Map) lc41Var2.x.getValue()).containsKey(new z28(jc41Var.a()))) {
                        lc41Var2.a.e("WebCapabilityRegistry", "Attempt to register already registered web capability with id = ".concat(z28.a(jc41Var.a())));
                    } else {
                        hc41 hc41Var2 = new hc41(jc41Var, new e331(13, lc41Var2, jc41Var));
                        r0 r0Var = lc41Var2.x;
                        do {
                            value = r0Var.getValue();
                            linkedHashMap = new LinkedHashMap((Map) value);
                            linkedHashMap.put(new z28(hc41Var2.a()), hc41Var2);
                        } while (!r0Var.k(value, linkedHashMap));
                    }
                }
                return zy11.a;
            case 2:
                ceo ceoVar = (ceo) ((e) iVar).a();
                lc41 lc41Var3 = this.b;
                String a2 = ceoVar.a();
                synchronized (lc41Var3) {
                    r0 r0Var2 = lc41Var3.x;
                    do {
                        value2 = r0Var2.getValue();
                        linkedHashMap2 = new LinkedHashMap((Map) value2);
                        linkedHashMap2.remove(new z28(a2));
                    } while (!r0Var2.k(value2, linkedHashMap2));
                }
                return zy11.a;
            default:
                ieo ieoVar = (ieo) ((g) iVar).a();
                lc41 lc41Var4 = this.b;
                String b3 = ieoVar.b();
                png c2 = ieoVar.c();
                synchronized (lc41Var4) {
                    hc41 hc41Var3 = (hc41) ((Map) lc41Var4.x.getValue()).get(new z28(b3));
                    if (hc41Var3 == null) {
                        lc41Var4.a.e("WebCapabilityRegistry", "State was not delivered because there is no capability with id = ".concat(z28.a(b3)));
                    } else {
                        hc41Var3.g(c2);
                    }
                }
                return zy11.a;
        }
    }
}
