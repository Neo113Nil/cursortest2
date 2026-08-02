package com.yandex.go.scooters.discovery;

import com.yandex.go.address.models.Address;
import com.yandex.go.scooters.data.model.ScootersUsePointAExperiment;
import defpackage.m6p0;
import defpackage.min0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.z0o0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryPresenter$focusOnStartIfNeeded$1", f = "ScootersDiscoveryPresenter.kt", l = {HProv.PP_HASHOID, HProv.PP_CIPHEROID, HProv.PP_RESERVED1, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryPresenter$focusOnStartIfNeeded$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryPresenter$focusOnStartIfNeeded$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryPresenter$focusOnStartIfNeeded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryPresenter$focusOnStartIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0051, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
    
        if (r2 == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.go.address.models.Address] */
    /* JADX WARN: Type inference failed for: r9v24, types: [com.yandex.go.address.models.Address] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r9;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        mo21 mo21Var = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused2) {
        }
        if (i == 0) {
            kotlin.b.b(obj);
            z0o0 z0o0Var = this.this$0.J;
            Boolean bool = Boolean.FALSE;
            this.label = 1;
            z0o0Var.Cg(bool, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        mo21Var = (Address) obj;
                        r9 = mo21Var;
                        if (r9 != 0) {
                            ((min0) this.this$0.Dg()).W5(r9.B());
                        }
                        return zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    mo21Var = (mo21) obj;
                    if (mo21Var != null) {
                        ((min0) this.this$0.Dg()).W5(mo21Var.a());
                    }
                    return zy11Var;
                }
                kotlin.b.b(obj);
                boolean z = ((ScootersUsePointAExperiment) obj).b;
                j jVar = this.this$0;
                if (z) {
                    Address e3 = jVar.A.a.e();
                    r9 = e3;
                    if (e3 == null) {
                        ru.yandex.taxi.location.user.c cVar = this.this$0.A;
                        RoutePointType routePointType = RoutePointType.POINT_A;
                        this.L$0 = null;
                        this.label = 3;
                        obj = cVar.a(routePointType, this);
                        if (obj == coroutineSingletons) {
                        }
                        mo21Var = (Address) obj;
                        r9 = mo21Var;
                    }
                    if (r9 != 0) {
                    }
                    return zy11Var;
                }
                po21 po21Var = jVar.B;
                this.L$0 = null;
                this.label = 4;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        m6p0 m6p0Var = this.this$0.G;
        this.label = 2;
        obj = m6p0Var.a.b(this);
    }
}
