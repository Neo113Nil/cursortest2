package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.zalogin.e;
import ru.yandex.taxi.zalogin.j;
import ru.yandex.taxi.zalogin.m;

/* loaded from: classes6.dex */
public final class dky extends ad5 {
    public final sjy A;
    public final fhz B;
    public final u7j0 C;
    public final tt2 D;
    public bky E;
    public final m F;
    public final j x;
    public final g y;
    public final y50 z;

    public dky(j jVar, g gVar, y50 y50Var, sjy sjyVar, fhz fhzVar, u7j0 u7j0Var, tt2 tt2Var) {
        super(aky.class);
        this.x = jVar;
        this.y = gVar;
        this.z = y50Var;
        this.A = sjyVar;
        this.B = fhzVar;
        this.C = u7j0Var;
        this.D = tt2Var;
        this.F = new m(this);
    }

    public static final void Kg(dky dkyVar, kj kjVar) {
        ((aky) dkyVar.Dg()).showLinkageErrorDialog(false);
        if (kjVar == null) {
            ((aky) dkyVar.Dg()).closeView();
            return;
        }
        bky bkyVar = new bky(kjVar.b, kjVar.h, kjVar.g);
        dkyVar.E = bkyVar;
        ((aky) dkyVar.Dg()).setData(bkyVar);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.A.c();
    }

    public final void Lg(Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        kj kjVar = this.x.f;
        if (kjVar == null) {
            ((aky) Dg()).closeView();
            return;
        }
        fhz fhzVar = this.B;
        rx2 rx2Var = fhzVar.e;
        String name = events$Zalogin$LinkageContext.name();
        long j = fhzVar.b.x.a().a;
        long j2 = kjVar.a;
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("phone_uid", valueOf);
        hashMap.put("portal_uid", valueOf2);
        if (name != null) {
            hashMap.put("context", name);
        }
        rx2Var.a.a("Zalogin.LinkAccountsTap", hashMap, 1, new HashMap());
        ((aky) Dg()).showLinkageProgress();
        sjy sjyVar = this.A;
        sjyVar.a.a(new e(sjyVar, events$Zalogin$LinkageContext, new d82(1)), new dhv(21, sjyVar));
    }
}
