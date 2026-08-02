package defpackage;

import android.content.Context;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.view.timeline.overlay.c;

/* loaded from: classes15.dex */
public final class jai0 {
    public final Context a;
    public final xav b;
    public final gsu c;
    public final EmptyDrawable d;
    public final pnt0 e = new pnt0((Object) null);
    public final pnt0 f = new pnt0((Object) null);
    public final zq60 g;
    public final sq60 h;

    public jai0(Context context, xav xavVar, gsu gsuVar) {
        this.a = context;
        this.b = xavVar;
        this.c = gsuVar;
        zq60 zq60Var = new zq60();
        this.g = zq60Var;
        this.h = new sq60(zq60Var);
        int b = kjs0.b(16);
        this.d = new EmptyDrawable(b, b);
    }

    public static final void a(jai0 jai0Var, int i) {
        pnt0 pnt0Var = jai0Var.f;
        if (pnt0Var.a) {
            kp50.a(pnt0Var);
        }
        if (cvw.c(pnt0Var.b, pnt0Var.w, i) >= 0) {
            return;
        }
        gsu gsuVar = jai0Var.c;
        g9v load = jai0Var.b.load(qv10.i(i, "https://", (String) gsuVar.a.c(gsuVar.c), "/reactions/", "/small-48"));
        ((yn50) load).b(null, new c(jai0Var, i, load));
        z83.h(null, (pnt0Var.b(i) == null && jai0Var.e.b(i) == null) ? false : true);
    }
}
