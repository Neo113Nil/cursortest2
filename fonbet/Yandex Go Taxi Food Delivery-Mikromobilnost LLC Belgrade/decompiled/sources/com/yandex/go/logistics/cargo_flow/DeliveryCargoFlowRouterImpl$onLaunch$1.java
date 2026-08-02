package com.yandex.go.logistics.cargo_flow;

import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.logistics.cargo_flow.experiment.DeliveryOrderFormPersistentSettingsExperiment;
import com.yandex.go.logistics.cargo_flow.experiment.c;
import defpackage.a6s;
import defpackage.bhh;
import defpackage.cv8;
import defpackage.cvu0;
import defpackage.dv8;
import defpackage.ew8;
import defpackage.f4l0;
import defpackage.gyh;
import defpackage.hu0;
import defpackage.jl40;
import defpackage.kr0;
import defpackage.md6;
import defpackage.mvg;
import defpackage.nwh;
import defpackage.ny61;
import defpackage.oyh;
import defpackage.q6s;
import defpackage.qnh;
import defpackage.qyh;
import defpackage.t4s;
import defpackage.tje;
import defpackage.tse;
import defpackage.vki;
import defpackage.vyh;
import defpackage.w511;
import defpackage.wls;
import defpackage.xi8;
import defpackage.xu8;
import defpackage.xvf0;
import defpackage.yu8;
import defpackage.yx1;
import defpackage.z5i;
import defpackage.zi8;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.address.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.DeliveryCargoFlowRouterImpl$onLaunch$1", f = "DeliveryCargoFlowRouterImpl.kt", l = {161}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryCargoFlowRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ gyh $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCargoFlowRouterImpl$onLaunch$1(gyh gyhVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = gyhVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryCargoFlowRouterImpl$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryCargoFlowRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c;
        Object obj3;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            if (this.$payload.g) {
                vki vkiVar = (vki) this.this$0.U.get();
                String str = this.$payload.a;
                this.label = 1;
                c cVar = vkiVar.b;
                if (((DeliveryOrderFormPersistentSettingsExperiment) cVar.a.b()).b) {
                    Iterator it = ((DeliveryOrderFormPersistentSettingsExperiment) cVar.a.b()).c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((DeliveryOrderFormPersistentSettingsExperiment.PersistentConfiguration) obj2).a, str)) {
                            break;
                        }
                    }
                    DeliveryOrderFormPersistentSettingsExperiment.PersistentConfiguration persistentConfiguration = (DeliveryOrderFormPersistentSettingsExperiment.PersistentConfiguration) obj2;
                    if (persistentConfiguration != null) {
                        c = vkiVar.a.c(str, new q6s(persistentConfiguration.b, persistentConfiguration.c), this);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                c = zy11Var;
                if (c == coroutineSingletons) {
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar = this.this$0;
        gyh gyhVar = this.$payload;
        aVar.getClass();
        String str2 = gyhVar.a;
        String str3 = gyhVar.j;
        t4s t4sVar = gyhVar.e;
        ew8 ew8Var = aVar.O;
        Map map = gyhVar.f;
        boolean z = gyhVar.h;
        Integer num = gyhVar.i;
        a6s a6sVar = str3 != null ? new a6s(str3) : null;
        zi8 zi8Var = gyhVar.k;
        int i2 = 0;
        if (zi8Var == null) {
            zi8Var = new xi8(false);
        }
        cv8 cv8Var = new cv8(t4sVar, a6sVar, z, zi8Var, num, map);
        dv8 dv8Var = new dv8(aVar.o0, aVar.k0);
        vyh vyhVar = new vyh(i2, aVar.F);
        oyh oyhVar = aVar.p0;
        qyh qyhVar = aVar.q0;
        yx1 yx1Var = ew8Var.a;
        aVar.r0 = new md6(cv8Var, dv8Var, qyhVar, (qnh) ((z5i) yx1Var.g).get(), (nwh) ((xvf0) yx1Var.h).get(), oyhVar, vyhVar, (f4l0) ((xvf0) yx1Var.b).get(), (com.yandex.go.logistics.cargo_flow.form.cost_centers.a) ((xvf0) yx1Var.d).get(), (com.yandex.go.logistics.cargo_flow.form.repository.a) ((xvf0) yx1Var.e).get(), str2, (g) ((xvf0) yx1Var.f).get(), (ru.yandex.taxi.logistics.payment.a) ((xvf0) yx1Var.a).get(), (ru.yandex.taxi.logistics.photocomment.c) ((xvf0) yx1Var.c).get());
        List list = gyhVar.b;
        List list2 = gyhVar.c;
        String str4 = gyhVar.d;
        com.yandex.go.logistics.cargo_flow.form.address.c cVar2 = aVar.P;
        kr0 kr0Var = aVar.n0;
        if (!list.isEmpty()) {
            com.yandex.go.clarify_address.a aVar2 = (com.yandex.go.clarify_address.a) kr0Var;
            aVar2.c(true, AddressClarificationReason.Other);
            r0 r0Var = cVar2.g;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            try {
                failure = tje.N(aVar.o(), null, null, new DeliveryCargoFlowRouterImpl$resolvePoints$1$1(list, list2, aVar, null), 3);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                failure = new Result.Failure(e2);
            }
            if (Result.a(failure) != null) {
                aVar2.c(false, AddressClarificationReason.Other);
                r0 r0Var2 = cVar2.g;
                Boolean bool2 = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
            }
        }
        yu8 yu8Var = aVar.W;
        yu8Var.getClass();
        if (str4 != null) {
            Iterator<E> it2 = SelectDestinationPolicy.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (cvu0.t(((SelectDestinationPolicy) obj3).name(), str4, true)) {
                    break;
                }
            }
            SelectDestinationPolicy selectDestinationPolicy = (SelectDestinationPolicy) obj3;
            if (selectDestinationPolicy == null) {
                selectDestinationPolicy = SelectDestinationPolicy.SKIP;
            }
            int i3 = xu8.a[selectDestinationPolicy.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    w511.b();
                    return null;
                }
                if (yu8Var.a.getRoute().a.size() < 2) {
                    a.S(aVar, new hu0(1), new bhh(5, aVar), null, null, 40);
                    return zy11Var;
                }
            }
        }
        aVar.R();
        return zy11Var;
    }
}
