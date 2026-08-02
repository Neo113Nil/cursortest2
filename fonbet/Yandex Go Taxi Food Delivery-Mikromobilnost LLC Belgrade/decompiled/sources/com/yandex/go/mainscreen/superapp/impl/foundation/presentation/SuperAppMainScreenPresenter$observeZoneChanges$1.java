package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import com.yandex.go.agreement.api.AcceptanceChangeSource;
import com.yandex.go.zone.model.Zone;
import defpackage.bae0;
import defpackage.dae0;
import defpackage.dd;
import defpackage.kd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.znj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeZoneChanges$1", f = "SuperAppMainScreenPresenter.kt", l = {HProv.PP_AUTH_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPresenter$observeZoneChanges$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/zone/model/Zone;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeZoneChanges$1$2", f = "SuperAppMainScreenPresenter.kt", l = {220}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeZoneChanges$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Zone) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Zone zone = (Zone) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e eVar = this.this$0;
            ArrayList a = ((kd) eVar.c0).a(zone);
            ((com.yandex.go.agreement.interactor.a) eVar.O).e(a, AcceptanceChangeSource.ZONE_INFO);
            ArrayList arrayList = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((dd) next).c()) {
                    arrayList.add(next);
                }
            }
            bae0 bae0Var = eVar.a0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((dd) it2.next()).a());
            }
            dae0 dae0Var = (dae0) bae0Var;
            dae0Var.getClass();
            dae0Var.g = new ArrayList(arrayList2);
            znj znjVar = this.this$0.M;
            this.L$0 = null;
            this.label = 1;
            znjVar.getClass();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPresenter$observeZoneChanges$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenPresenter$observeZoneChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenPresenter$observeZoneChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            d dVar = new d(eVar.L.s);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(dVar, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
