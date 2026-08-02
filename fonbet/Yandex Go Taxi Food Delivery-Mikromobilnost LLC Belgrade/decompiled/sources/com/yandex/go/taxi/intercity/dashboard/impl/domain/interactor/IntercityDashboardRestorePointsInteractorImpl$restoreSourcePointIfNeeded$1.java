package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.z81;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1", f = "IntercityDashboardRestorePointsInteractorImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = this.this$0.b.d;
            ZoneAddress zoneAddress2 = this.this$0.c.c().a;
            if (zoneAddress != null) {
                if (!z81.b(zoneAddress.a, zoneAddress2 != null ? zoneAddress2.a : null)) {
                    i = 1;
                    if (i != 0) {
                        com.yandex.go.route.interactor.b bVar = this.this$0.c;
                        if (zoneAddress == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        bVar.m(zoneAddress, null);
                        tpr a = h.a(this.this$0, zoneAddress.a, RoutePointType.POINT_A);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = i;
                        this.label = 1;
                        if (kotlinx.coroutines.flow.e.j(a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            }
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
