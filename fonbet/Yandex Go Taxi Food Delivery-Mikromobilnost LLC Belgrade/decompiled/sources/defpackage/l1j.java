package defpackage;

import com.yandex.go.taxi.order.superapp.orders.multi.c;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.utils.f;

/* loaded from: classes14.dex */
public final class l1j implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ l1j(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                hf2 hf2Var = cVar.A;
                f09 f09Var = cVar.z;
                p080 p080Var = cVar.a;
                cVar.B.getClass();
                switch (bmm.a[((DriveState) obj).ordinal()]) {
                    case 1:
                    case 2:
                        ah00 ah00Var = p080Var.a;
                        o080 o080Var = p080Var.c;
                        gh00 gh00Var = (gh00) ah00Var;
                        if (gh00Var.a.e(o080Var)) {
                            gh00Var.r(o080Var);
                        }
                        jtp0 jtp0Var = cVar.H;
                        o2y0 o2y0Var = cVar.b;
                        f fVar = f09Var.c;
                        jwp0 jwp0Var = new jwp0(jtp0Var, o2y0Var, fVar, (e070) fVar.c, cVar.C);
                        cVar.K = jwp0Var;
                        f09Var.Ig(jwp0Var);
                        if (cVar.I) {
                            an8 an8Var = f09Var.w;
                            an8Var.getClass();
                            an8Var.u(new o09(jwp0Var));
                            hf2Var.e();
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        jwp0 jwp0Var2 = cVar.K;
                        if (jwp0Var2 != null) {
                            f09Var.Hg(jwp0Var2);
                            f09Var.Hg(jwp0Var2);
                            an8 an8Var2 = f09Var.w;
                            an8Var2.getClass();
                            an8Var2.u(new m09(jwp0Var2));
                            cVar.K = null;
                        }
                        hf2Var.f(true);
                        ((gh00) p080Var.a).p(p080Var.c);
                        break;
                    default:
                        w511.b();
                        break;
                }
                cVar.c();
                break;
            case 1:
                vdt0 vdt0Var = (vdt0) obj;
                p080 p080Var2 = cVar.a;
                if (!(vdt0Var instanceof udt0)) {
                    if (vdt0Var instanceof tdt0) {
                        p080Var2.b.Vg(p080Var2.c, cVar.f(), true, true);
                        break;
                    }
                } else {
                    float f = ((udt0) vdt0Var).a;
                    p080Var2.b.Vg(p080Var2.c, cVar.f(), true, true);
                    ((gh00) p080Var2.a).K(f);
                    break;
                }
                break;
            default:
                ((Boolean) obj).getClass();
                p080 p080Var3 = cVar.a;
                p080Var3.b.Vg(p080Var3.c, cVar.f(), true, true);
                break;
        }
        return zy11Var;
    }
}
