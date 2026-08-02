package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import com.yandex.go.zone.model.Zone;
import defpackage.ce61;
import defpackage.m4r0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.pzt0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.RefreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1", f = "RefreshTariffsInfoInteractor.kt", l = {216, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class RefreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1(v vVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RefreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1 refreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1 = new RefreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        refreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        refreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1.L$1 = obj2;
        return refreshTariffsInfoInteractor$refreshTariffs$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r14, r0, r13) != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r14.u0(r13) == r2) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr I;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ce61 ce61Var = (ce61) obj2;
            boolean z = ce61Var.b;
            Zone zone = ce61Var.a;
            v vVar = this.this$0;
            if (z) {
                m4r0 m4r0Var = vVar.h;
                m4r0Var.getClass();
                pzt0 a = m4r0Var.d.a(TariffChangeReason.DEFAULT, new SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1(m4r0Var, null, m4r0Var, zone, null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
            } else {
                mth mthVar = new mth(new j0(null, kotlinx.coroutines.flow.e.p(vVar.a.a(zone), 200L), new RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$withPreviousEmit$1(3, null)), 6);
                v vVar2 = this.this$0;
                I = kotlinx.coroutines.flow.e.I(new u(mthVar, vVar2), new RefreshTariffsInfoInteractor$refreshTariffs$2$2(vVar2, null));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        I = pvn.a;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
