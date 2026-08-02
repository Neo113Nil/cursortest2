package defpackage;

import com.yandex.go.taxi.order.a;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;

/* loaded from: classes8.dex */
public final class b20 {
    public final tt2 a;
    public final a3y0 b = new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "ActiveOrderRemoteSettingsSender");
    public final hbp0 c;
    public final ycs0 d;
    public a20 e;

    public b20(tt2 tt2Var) {
        this.a = tt2Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.c = hbp0Var;
        this.d = new ycs0(0);
        hbp0Var.a();
    }

    public final void a(Object obj, String str) {
        a aVar;
        a20 a20Var = this.e;
        if (a20Var == null) {
            ny61.r("You should set delegate before update values");
            return;
        }
        synchronized (this) {
            aVar = (a) this.d.get(str);
            if (aVar == null) {
                aVar = new a(this, str, a20Var);
                this.d.put(str, aVar);
            }
        }
        aVar.a(obj);
    }
}
