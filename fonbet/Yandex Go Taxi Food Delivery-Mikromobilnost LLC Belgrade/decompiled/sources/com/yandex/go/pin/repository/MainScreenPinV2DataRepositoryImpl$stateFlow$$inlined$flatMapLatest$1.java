package com.yandex.go.pin.repository;

import defpackage.e1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ e1c0 $exp$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, a0 a0Var, e1c0 e1c0Var) {
        super(3, continuation);
        this.this$0 = a0Var;
        this.$exp$inlined = e1c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 mainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1 = new MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$exp$inlined);
        mainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        tpr m0Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            a0 a0Var = this.this$0;
            if (booleanValue) {
                m0Var = a0Var.f();
                i = 1;
                obj2 = null;
            } else {
                e1c0 e1c0Var = this.$exp$inlined;
                com.yandex.go.navigation.screen.c cVar = a0Var.i;
                kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(cVar.c(), new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$flatMapLatest$1(a0Var, null));
                tpr t = kotlinx.coroutines.flow.e.t(new x(cVar.c(), a0Var));
                AddressResolveRepository addressResolveRepository = a0Var.b;
                r0 r0Var = addressResolveRepository.a;
                tpr t2 = kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new z(((com.yandex.go.taxi.tariffs.internal.repository.k) a0Var.e).j.a()), new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$1(2, null)));
                ru.yandex.taxi.main.map.i iVar = a0Var.a.a;
                i = 1;
                v vVar = new v(new tpr[]{r0Var, t2, com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.main.map.h(((com.yandex.go.taxi.tariffs.internal.repository.k) iVar.b).f(), iVar)), new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$2(2, null)), com.yandex.go.coroutines.b.d(a0Var.f(), new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$3(a0Var, null)), com.yandex.go.coroutines.b.d(X, new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$4(a0Var, null)), ((ru.yandex.taxi.f) a0Var.j).a(addressResolveRepository.a, a0Var.q), com.yandex.go.coroutines.b.d(((com.yandex.go.summary.branding_pin.i) a0Var.m).c(), new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$5(2, null)), a0Var.k.a, com.yandex.go.coroutines.b.d(a0Var.l.a, new MainScreenPinV2DataRepositoryImpl$contentStateFlow$$inlined$start$6(2, null))}, a0Var, e1c0Var);
                obj2 = null;
                m0Var = new m0(vVar, t, new MainScreenPinV2DataRepositoryImpl$contentStateFlow$9(3, null));
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = i;
            if (kotlinx.coroutines.flow.e.u(m0Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
