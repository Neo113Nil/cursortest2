package defpackage;

import android.net.Uri;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.yandex.taxi.communications.data.a;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes14.dex */
public final class gpf0 {
    public final cs a;
    public final cs b;
    public final wwf c;
    public final kcz0 d;
    public final wpf0 e;

    public gpf0(cs csVar, cs csVar2, wwf wwfVar, kcz0 kcz0Var, wpf0 wpf0Var) {
        this.a = csVar;
        this.b = csVar2;
        this.c = wwfVar;
        this.d = kcz0Var;
        this.e = wpf0Var;
    }

    public final void a(fpf0 fpf0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen) {
        dpf0 a = fpf0Var.a();
        wpf0 wpf0Var = this.e;
        wpf0Var.getClass();
        String str = a.a;
        Map map = a.f;
        RealtimeEventType realtimeEventType = RealtimeEventType.Clicked;
        o2y0 o2y0Var = wpf0Var.g;
        wpf0Var.d(str, map, wpf0.b(o2y0Var != null ? o2y0Var.b() : null), realtimeEventType);
        if (fpf0Var instanceof bpf0) {
            bpf0 bpf0Var = (bpf0) fpf0Var;
            cs csVar = this.a;
            csVar.getClass();
            dpf0 dpf0Var = bpf0Var.a;
            csVar.a.a(dpf0Var, promoPlaqueAnalytics$Screen);
            Runnable runnable = bpf0Var.b;
            if (runnable != null) {
                runnable.run();
                if (bpf0Var.c) {
                    csVar.b.d(dpf0Var.a);
                    return;
                }
                return;
            }
            return;
        }
        if (fpf0Var instanceof apf0) {
            cs csVar2 = this.b;
            csVar2.getClass();
            dpf0 dpf0Var2 = ((apf0) fpf0Var).a;
            csVar2.a.a(dpf0Var2, promoPlaqueAnalytics$Screen);
            csVar2.b.d(dpf0Var2.a);
            return;
        }
        if (fpf0Var instanceof cpf0) {
            cpf0 cpf0Var = (cpf0) fpf0Var;
            wwf wwfVar = this.c;
            wwfVar.getClass();
            dpf0 dpf0Var3 = cpf0Var.a;
            ((ipf0) wwfVar.c).a(dpf0Var3, promoPlaqueAnalytics$Screen);
            ((n3h) wwfVar.b).a(Uri.parse(cpf0Var.b), DeeplinkSource.TOTW_COMMUNICATIONS);
            ((a) wwfVar.a).d(dpf0Var3.a);
            return;
        }
        if (!(fpf0Var instanceof epf0)) {
            w511.b();
            return;
        }
        epf0 epf0Var = (epf0) fpf0Var;
        dpf0 dpf0Var4 = epf0Var.a;
        kcz0 kcz0Var = this.d;
        kcz0Var.getClass();
        ((ipf0) kcz0Var.b).a(dpf0Var4, promoPlaqueAnalytics$Screen);
        ArrayList D = adc.D(epf0Var.b, x8j0.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((x8j0) next).b != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            x8j0 x8j0Var = (x8j0) it2.next();
            epf0Var.c.invoke(x8j0Var.a, x8j0Var.b);
        }
        ((a) kcz0Var.a).d(dpf0Var4.a);
    }
}
