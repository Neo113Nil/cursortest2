package defpackage;

import androidx.compose.foundation.pager.d;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final /* synthetic */ class ny8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ ny8(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int o;
        int k;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return new Pair(Boolean.valueOf(dVar.k.a()), Integer.valueOf(dVar.k()));
            case 1:
                return new ppm(dVar);
            case 2:
                o = dVar.o();
                break;
            case 3:
                o = dVar.o();
                break;
            case 4:
                o = ((Number) dVar.s.getValue()).intValue();
                break;
            case 5:
                o = ((Number) dVar.s.getValue()).intValue();
                break;
            case 6:
                return Integer.valueOf(dVar.k.a() ? dVar.r.getIntValue() : dVar.k());
            case 7:
                boolean a = dVar.k.a();
                yx40 yx40Var = dVar.q;
                if (!a) {
                    k = dVar.k();
                } else if (yx40Var.getIntValue() != -1) {
                    k = yx40Var.getIntValue();
                } else {
                    float abs = Math.abs(dVar.l());
                    fwi fwiVar = dVar.n;
                    z890 z890Var = a990.a;
                    if (abs >= Math.abs(Math.min(fwiVar.w0(56.0f), dVar.p() / 2.0f) / dVar.p())) {
                        boolean m = dVar.m();
                        int i2 = dVar.e;
                        k = m ? i2 + 1 : i2;
                    } else {
                        k = dVar.k();
                    }
                }
                o = dVar.j(k);
                break;
            case 8:
                o = dVar.o();
                break;
            default:
                return new Pair(Integer.valueOf(dVar.k()), Boolean.valueOf(dVar.k.a()));
        }
        return Integer.valueOf(o);
    }
}
