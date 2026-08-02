package com.yandex.go.preorder.tariffs;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.c8r;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.tariffs.CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2", f = "CompoundTariffsInfoInteractor.kt", l = {36, 37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ Preorder $preorder;
    final /* synthetic */ Zone $selectedZone;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2(a aVar, Zone zone, Preorder preorder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$selectedZone = zone;
        this.$preorder = preorder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2(this.this$0, this.$selectedZone, this.$preorder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompoundTariffsInfoInteractor$updateCompoundTariffsInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r7.a(r2, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (r7.b(r2, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mi31 b;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.tariffs.interactor.b bVar = this.this$0.d;
            Zone zone = this.$selectedZone;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                List list = ((k) this.this$0.e).j().a;
                String str = this.$preorder.O.a;
                if (str != null && !evu0.J(str) && !list.isEmpty() && (b = c8r.b((c8r) this.this$0.b.get(), str, this.$preorder.V, null, 4)) != null) {
                    this.this$0.c.a(new gnx0(new fnx0(b, SelectionOrigin.PREORDER_CONTROLLER), true));
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        a aVar = this.this$0;
        Zone zone2 = this.$selectedZone;
        this.label = 2;
    }
}
