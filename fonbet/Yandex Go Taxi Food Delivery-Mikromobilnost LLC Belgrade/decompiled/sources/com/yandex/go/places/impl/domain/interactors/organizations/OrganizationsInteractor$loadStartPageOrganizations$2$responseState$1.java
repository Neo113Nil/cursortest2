package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.fg5;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luc4;", "bbox", "Lzy11;", "<anonymous>", "(Luc4;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.domain.interactors.organizations.OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1", f = "OrganizationsDiscoveryInteractor.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onBboxReceived;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1(a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$onBboxReceived = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1 organizationsInteractor$loadStartPageOrganizations$2$responseState$1 = new OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1(this.this$0, this.$onBboxReceived, continuation);
        organizationsInteractor$loadStartPageOrganizations$2$responseState$1.L$0 = obj;
        return organizationsInteractor$loadStartPageOrganizations$2$responseState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1) create((uc4) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uc4 uc4Var = (uc4) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.i.getClass();
            BoundingBox a = fg5.a(uc4Var);
            if (a != null) {
                a aVar = this.this$0;
                tls tlsVar = this.$onBboxReceived;
                aVar.d.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1$1$1 organizationsInteractor$loadStartPageOrganizations$2$responseState$1$1$1 = new OrganizationsInteractor$loadStartPageOrganizations$2$responseState$1$1$1(tlsVar, a, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (tje.k0(g6uVar, organizationsInteractor$loadStartPageOrganizations$2$responseState$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
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
