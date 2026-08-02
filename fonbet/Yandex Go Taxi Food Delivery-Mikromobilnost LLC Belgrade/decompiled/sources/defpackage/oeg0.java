package defpackage;

import android.content.Context;
import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.a;
import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.c;

/* loaded from: classes12.dex */
public final class oeg0 {
    public final Context a;
    public final h410 b;
    public final w030 c;
    public final bfg0 d;
    public final deg0 e;
    public final deg0 f;

    public oeg0(Context context, h410 h410Var, w030 w030Var, bfg0 bfg0Var, deg0 deg0Var, deg0 deg0Var2) {
        this.a = context;
        this.b = h410Var;
        this.c = w030Var;
        this.d = bfg0Var;
        this.e = deg0Var;
        this.f = deg0Var2;
    }

    public final c a(deg0 deg0Var) {
        w16 w16Var = (w16) this.b.e.getValue();
        w16Var.getClass();
        zeg0 zeg0Var = new zeg0(0);
        sue0 sue0Var = new sue0(11, this.d);
        hhw hhwVar = w16Var.a;
        return new c(this.a, this.c, zeg0Var, new a(zeg0Var, sue0Var, (o370) hhwVar.o, (o370) hhwVar.p, deg0Var), deg0Var);
    }
}
