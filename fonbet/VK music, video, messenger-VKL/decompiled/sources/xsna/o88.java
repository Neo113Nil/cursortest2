package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o88 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o88(AboutVideoItem.a0 a0Var, gzs gzsVar, gzs gzsVar2, q630 q630Var, int i) {
        this.e = a0Var;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.g = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        zo10 zo10Var;
        switch (this.b) {
            case 0:
                wzs wzsVar = (wzs) this.e;
                jai jaiVar = (jai) this.f;
                jai jaiVar2 = (jai) this.g;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                int h = o6j.h(o6jVar.a);
                long j = o6jVar.a;
                int i = o6j.i(j);
                tra0 N = (wzsVar == null || (zo10Var = (zo10) j5g.a0(ztm0Var.t1(t88.SHEET_ABOVE, new jai(-1801987660, new ce0(wzsVar, 2), true)))) == null) ? null : zo10Var.N(j);
                int i2 = N != null ? N.c : 0;
                int i3 = h - i2;
                long b = o6j.b(0, o6jVar.a, 0, 0, i3 + this.d, 7);
                zo10 zo10Var2 = (zo10) j5g.a0(ztm0Var.t1(t88.SHEET, new jai(-608227941, new at3(jaiVar, i3, 1), true)));
                final tra0 N2 = zo10Var2 != null ? zo10Var2.N(b) : null;
                final int intValue = ((Number) this.c.invoke()).intValue();
                final int i4 = intValue + i2;
                final tra0 N3 = ((zo10) j5g.Y(ztm0Var.t1(t88.CONTENT, new jai(-756217679, new bt3(jaiVar2, 2), true)))).N(j);
                final tra0 tra0Var = N;
                return ztm0Var.Q(i, h, jgp.b, new izs() { // from class: xsna.q88
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        tra0.a aVar = (tra0.a) obj3;
                        tra0.a.x(aVar, N3, 0, 0);
                        tra0 tra0Var2 = tra0Var;
                        if (tra0Var2 != null) {
                            tra0.a.x(aVar, tra0Var2, 0, intValue);
                        }
                        tra0 tra0Var3 = N2;
                        if (tra0Var3 != null) {
                            tra0.a.x(aVar, tra0Var3, 0, i4);
                        }
                        return s3q0.a;
                    }
                });
            default:
                ((Integer) obj2).getClass();
                hpp0.a((AboutVideoItem.a0) this.e, this.c, (gzs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
        }
    }

    public /* synthetic */ o88(wzs wzsVar, int i, gzs gzsVar, jai jaiVar, jai jaiVar2) {
        this.e = wzsVar;
        this.d = i;
        this.c = gzsVar;
        this.f = jaiVar;
        this.g = jaiVar2;
    }
}
