package com.yandex.go.mainscreen.superapp.impl.foundation.data.factory;

import com.yandex.go.route.interactor.PreorderRouteInteractorImpl$sourceTouchedFlow$lambda$0$$inlined$start$1;
import defpackage.b2k;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wy2;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.persuggest.repository.RequestedSourcePointInfoRepositoryImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lwaw0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.SuperappGeoParamsChangesFactory$createChangesFlow$1", f = "SuperappGeoParamsChangesFactory.kt", l = {36, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappGeoParamsChangesFactory$createChangesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $startWithRawCoordinates;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappGeoParamsChangesFactory$createChangesFlow$1(q qVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$startWithRawCoordinates = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappGeoParamsChangesFactory$createChangesFlow$1 superappGeoParamsChangesFactory$createChangesFlow$1 = new SuperappGeoParamsChangesFactory$createChangesFlow$1(this.this$0, this.$startWithRawCoordinates, continuation);
        superappGeoParamsChangesFactory$createChangesFlow$1.L$0 = obj;
        return superappGeoParamsChangesFactory$createChangesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappGeoParamsChangesFactory$createChangesFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r2, r0, r11) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r12 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr bVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.shortcuts.impl.experiments.f fVar = this.this$0.d;
            this.L$0 = vprVar;
            this.label = 1;
            obj = fVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        int intValue = ((Number) obj).intValue();
        q qVar = this.this$0;
        boolean z = this.$startWithRawCoordinates;
        com.yandex.go.route.interactor.b bVar2 = qVar.a;
        if (z) {
            h hVar = new h(new f(new jqr(((RequestedSourcePointInfoRepositoryImpl) qVar.b).b, new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$pointUpdates$1(2, null), 3), qVar));
            j jVar = new j(new jqr(new l(com.yandex.go.coroutines.b.d(bVar2.g, new PreorderRouteInteractorImpl$sourceTouchedFlow$lambda$0$$inlined$start$1(bVar2, null))), new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$routeUpdates$2(2, null), 3));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            bVar = new p(new n(new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{hVar, jVar}, 2)), new SuperappGeoParamsChangesFactory$createParamsOnSourcePointChangeStartingWithRawCoordinates$1(null, ref$ObjectRef)), qVar, ref$ObjectRef), qVar);
        } else {
            bVar = new b(new d(bVar2.k()), qVar.c);
        }
        b2k s = kotlinx.coroutines.flow.e.s(bVar, new wy2(this.this$0, intValue, i2));
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = intValue;
        this.label = 2;
    }
}
