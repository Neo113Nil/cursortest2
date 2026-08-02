package com.yandex.go.navigator.alt_select;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.alt_select.AltRouteInteractor$clearDestinationNotificationIfNeeded$1", f = "AltRouteInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AltRouteInteractor$clearDestinationNotificationIfNeeded$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltRouteInteractor$clearDestinationNotificationIfNeeded$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltRouteInteractor$clearDestinationNotificationIfNeeded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltRouteInteractor$clearDestinationNotificationIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            zzs zzsVar = aVar.d.f;
            if (zzsVar != null) {
                pe50 c = aVar.e.c();
                int i2 = 0;
                if (c != null && (list = c.b) != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (jl40.l(((ne50) it.next()).c.B(), zzsVar)) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                }
                if (i2 == 0) {
                    com.yandex.go.navigator.notifications.cartech.b bVar = this.this$0.d;
                    this.L$0 = null;
                    this.I$0 = i2;
                    this.label = 1;
                    if (bVar.a(null, null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
