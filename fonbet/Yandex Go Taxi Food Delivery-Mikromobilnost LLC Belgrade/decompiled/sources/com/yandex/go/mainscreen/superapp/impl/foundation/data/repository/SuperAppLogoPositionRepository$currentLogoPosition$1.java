package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.jbh;
import defpackage.kc00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$currentLogoPosition$1", f = "SuperAppLogoPositionRepository.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppLogoPositionRepository$currentLogoPosition$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppLogoPositionRepository$currentLogoPosition$1(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperAppLogoPositionRepository$currentLogoPosition$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperAppLogoPositionRepository$currentLogoPosition$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 e = ((jbh) this.this$0.a).e(SuperAppMainScreenLogoImageExperiment.k);
            this.L$0 = null;
            this.label = 1;
            obj = e.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        SuperAppMainScreenLogoImageExperiment superAppMainScreenLogoImageExperiment = (SuperAppMainScreenLogoImageExperiment) obj;
        ic00 ic00Var = ((kc00) this.this$0.c).a;
        ic00Var.getClass();
        if (!(ic00Var instanceof hc00)) {
            return SuperAppLogoPositionRepository$LogoPosition.CENTER;
        }
        boolean z = superAppMainScreenLogoImageExperiment.e;
        if (z) {
            this.this$0.b.getClass();
            return SuperAppLogoPositionRepository$LogoPosition.LEFT;
        }
        if (z) {
            this.this$0.b.getClass();
        }
        return SuperAppLogoPositionRepository$LogoPosition.CENTER;
    }
}
