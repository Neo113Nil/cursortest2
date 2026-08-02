package defpackage;

import com.yandex.go.insets.e;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.statebar.a;

/* loaded from: classes.dex */
public final class l2x0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ l2x0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                c2x0 c2x0Var = eVar.c;
                c2x0Var.getClass();
                d2x0 d2x0Var = (d2x0) c2x0Var;
                d2x0Var.d();
                d2x0Var.c();
                break;
            case 1:
                ((d2x0) eVar.c).c();
                break;
            case 2:
                ((d2x0) eVar.c).d();
                break;
            case 3:
                y3u0 y3u0Var = eVar.f;
                a aVar = eVar.e;
                boolean a = y3u0Var.a();
                c2x0 c2x0Var2 = eVar.c;
                if (!a) {
                    ((d2x0) c2x0Var2).b(qoi0.a(aVar.getClass()));
                    break;
                } else {
                    ((d2x0) c2x0Var2).a(1, qoi0.a(aVar.getClass()), !(lhc.c(aVar.d.getTitleTextColor().getDefaultColor()) > 0.5d));
                    break;
                }
            default:
                c2x0 c2x0Var3 = eVar.c;
                c2x0Var3.getClass();
                d2x0 d2x0Var2 = (d2x0) c2x0Var3;
                d2x0Var2.d();
                d2x0Var2.c();
                break;
        }
        return zy11Var;
    }
}
