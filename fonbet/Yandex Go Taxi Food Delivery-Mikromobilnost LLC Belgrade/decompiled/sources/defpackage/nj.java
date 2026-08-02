package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.am.d;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f;

/* loaded from: classes9.dex */
public final class nj implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ nj(d dVar, int i) {
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
                Object a = ((e) dVar.h.getValue()).a(continuation);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            default:
                ((f) dVar.i.getValue()).b((String) obj);
                return zy11Var;
        }
    }
}
