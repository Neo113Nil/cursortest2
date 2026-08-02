package defpackage;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.experiment.e;
import ru.yandex.taxi.routeselector.presentation.s;

/* loaded from: classes6.dex */
public final class lal0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ lal0(s sVar, int i) {
        this.a = i;
        this.b = sVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        s sVar = this.b;
        switch (i) {
            case 0:
                ((umb0) sVar.d0).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
                return zy11Var;
            case 1:
                Triple triple = (Triple) obj;
                Object Kg = s.Kg(sVar, (d0l0) triple.getFirst(), (e) triple.getSecond(), (u0c0) triple.getThird(), continuation);
                return Kg == CoroutineSingletons.COROUTINE_SUSPENDED ? Kg : zy11Var;
            default:
                sVar.G.d();
                return zy11Var;
        }
    }
}
