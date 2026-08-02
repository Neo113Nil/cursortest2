package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u0w0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1", f = "SuperAppMainFetchZoneInteractor.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ u0w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1(u0w0 u0w0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0w0Var;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1(this.this$0, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                u0w0 u0w0Var = this.this$0;
                String str = this.$zoneName;
                com.yandex.go.zone.interactors.b bVar = u0w0Var.a;
                this.label = 1;
                if (bVar.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed fetching zone and update tariffs from superapp_main screen");
        }
        return zy11.a;
    }
}
