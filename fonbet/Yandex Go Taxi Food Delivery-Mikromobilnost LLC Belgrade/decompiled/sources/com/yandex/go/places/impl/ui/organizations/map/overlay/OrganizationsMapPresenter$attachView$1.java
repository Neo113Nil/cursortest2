package com.yandex.go.places.impl.ui.organizations.map.overlay;

import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ub60;
import defpackage.wac0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.map.overlay.OrganizationsMapPresenter$attachView$1", f = "OrganizationsMapPresenter.kt", l = {42, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsMapPresenter$attachView$1 extends SuspendLambda implements wls {
    float F$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsMapPresenter$attachView$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsMapPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsMapPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (defpackage.bb1.l0(r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r5.c(r1, r4) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            wac0 a = cVar.C.a(cVar.y);
            f = a != null ? a.c : 17.0f;
            com.yandex.go.places.impl.domain.interactors.common.a aVar = this.this$0.z;
            this.F$0 = f;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                cVar2.F = false;
                ((gh00) cVar2.D).q(new ub60(25, cVar2));
                return zy11.a;
            }
            f = this.F$0;
            kotlin.b.b(obj);
        }
        this.F$0 = f;
        this.label = 2;
    }
}
