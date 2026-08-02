package com.yandex.go.summary.interactor.expanded.state;

import defpackage.gsc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qd6;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lgsc;", "Lrd6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.FooterUiStateInteractor$promoUiStateFlow$2$1", f = "FooterUiStateInteractor.kt", l = {100, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FooterUiStateInteractor$promoUiStateFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ gsc $communicationItem;
    final /* synthetic */ qd6 $notification;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterUiStateInteractor$promoUiStateFlow$2$1(qd6 qd6Var, gsc gscVar, Continuation continuation) {
        super(2, continuation);
        this.$notification = qd6Var;
        this.$communicationItem = gscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FooterUiStateInteractor$promoUiStateFlow$2$1 footerUiStateInteractor$promoUiStateFlow$2$1 = new FooterUiStateInteractor$promoUiStateFlow$2$1(this.$notification, this.$communicationItem, continuation);
        footerUiStateInteractor$promoUiStateFlow$2$1.L$0 = obj;
        return footerUiStateInteractor$promoUiStateFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FooterUiStateInteractor$promoUiStateFlow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (kotlinx.coroutines.a.j(r5, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qd6 qd6Var = this.$notification;
            if (qd6Var != null) {
                qd6Var.g.invoke();
            }
            gsc gscVar = this.$communicationItem;
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.$notification.h.invoke();
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        qd6 qd6Var2 = this.$notification;
        if (qd6Var2 != null) {
            long j = qd6Var2.i;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
