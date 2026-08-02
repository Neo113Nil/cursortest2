package com.yandex.go.drive.vertical.router;

import com.yandex.go.drive.vertical.interactor.k;
import com.yandex.go.zone.repository.o;
import defpackage.c0g;
import defpackage.gzf;
import defpackage.khm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.tt2;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.suggest.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.router.DriveVerticalRootRouterImpl$onLaunch$1", f = "DriveVerticalRootRouterImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveVerticalRootRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ khm $localComponent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveVerticalRootRouterImpl$onLaunch$1(khm khmVar, Continuation continuation) {
        super(2, continuation);
        this.$localComponent = khmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveVerticalRootRouterImpl$onLaunch$1(this.$localComponent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveVerticalRootRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c0g c0gVar = (c0g) ((gzf) this.$localComponent).a;
            i r1 = c0gVar.r1();
            q5z.h(r1);
            o I6 = c0gVar.I6();
            q5z.h(I6);
            com.yandex.go.route.interactor.b W5 = c0gVar.W5();
            q5z.h(W5);
            com.yandex.go.zone.interactors.b n = c0gVar.z.n();
            tt2 Z1 = c0gVar.Z1();
            q5z.h(Z1);
            k kVar = new k(Z1, W5, n, I6, r1);
            this.label = 1;
            if (kVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
