package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes9.dex */
public final class a7b0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ a7b0(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                Object emit = oVar.u.emit((gwq) obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            default:
                oVar.k.a((SavePersonalStateNotifier$SavePersonalStateReason) obj);
                return zy11Var;
        }
    }
}
