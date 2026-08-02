package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.zalogin.d;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes10.dex */
public final class gpe implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ gpe(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                dVar.a();
                dVar.d(false);
                break;
            default:
                if (dVar.c() && dVar.p) {
                    ((k) dVar.i.get()).l = true;
                    dVar.b(Events$Zalogin$LinkageContext.PUSH, qeb1.b(dVar.e), new zi(21), new zi(21));
                    eky ekyVar = dVar.f;
                    ((cne0) ekyVar.b).u(ekyVar.x, false);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
