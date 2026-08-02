package com.yandex.go.places.impl.ui.organizations;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wls;
import defpackage.ym80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.OrganizationsPresenter$tryLoadNextPage$1", f = "OrganizationsPresenter.kt", l = {283, 284}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsPresenter$tryLoadNextPage$1 extends SuspendLambda implements wls {
    final /* synthetic */ ym80 $lastOrganizationsInfo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsPresenter$tryLoadNextPage$1(d dVar, ym80 ym80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$lastOrganizationsInfo = ym80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsPresenter$tryLoadNextPage$1(this.this$0, this.$lastOrganizationsInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsPresenter$tryLoadNextPage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r4.c(r5, r1, r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.label = 1;
            obj = d.Mg(dVar, this);
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
        Pair pair = (Pair) obj;
        uc4 uc4Var = (uc4) pair.getFirst();
        Float f = (Float) pair.getSecond();
        e eVar = this.this$0.L;
        ym80 ym80Var = this.$lastOrganizationsInfo;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
