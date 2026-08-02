package defpackage;

import com.yandex.go.scooters.offers.v2.g;

/* loaded from: classes13.dex */
public final class c7n0 implements rgo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c7n0(Object obj, sls slsVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = slsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                ((g) this.c).F.h();
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.rgo0
    public final void j(hfa0 hfa0Var) {
        int i = this.a;
        sls slsVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                g gVar = (g) obj;
                gVar.h0.b(hfa0Var.d());
                gVar.F.h();
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                tls tlsVar = (tls) obj;
                m6a0 d = hfa0Var.d();
                if (d != null) {
                    tlsVar.invoke(d);
                    break;
                } else if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
        }
    }
}
