package com.yandex.go.suggest.impl.data.flex.document;

import defpackage.aks0;
import defpackage.bwp0;
import defpackage.cnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.r6s0;
import defpackage.tpr;
import defpackage.uwl;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$loadingActionsFlow$5", f = "SuperappSuggestDocumentInteractor.kt", l = {109, 110, HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestDocumentInteractor$loadingActionsFlow$5 extends SuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestDocumentInteractor$loadingActionsFlow$5(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappSuggestDocumentInteractor$loadingActionsFlow$5 superappSuggestDocumentInteractor$loadingActionsFlow$5 = new SuperappSuggestDocumentInteractor$loadingActionsFlow$5(this.this$0, continuation);
        superappSuggestDocumentInteractor$loadingActionsFlow$5.L$0 = obj;
        return superappSuggestDocumentInteractor$loadingActionsFlow$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestDocumentInteractor$loadingActionsFlow$5) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e6, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (com.yandex.go.suggest.impl.data.flex.document.c.a(r9, r1, r6, r21) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ywl ywlVar;
        Object A;
        int i;
        ywl ywlVar2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            ywlVar = cVar.g.b;
            if (ywlVar == null) {
                int i3 = (cVar.f.b.a.getValue() == null || this.this$0.e.h() != null) ? 0 : 1;
                c cVar2 = this.this$0;
                if (i3 != 0) {
                    tpr tprVar = cVar2.c.k;
                    this.L$0 = vprVar;
                    this.L$1 = ywlVar;
                    this.I$0 = i3;
                    this.label = 1;
                    A = e.A(tprVar, this);
                    if (A != coroutineSingletons) {
                        i = i3;
                        ywlVar2 = ywlVar;
                    }
                    return coroutineSingletons;
                }
                if (cVar2.e.h() == null) {
                    ywlVar = new ywl(new aks0("(theme bgMinor 0p (col (space 24p) (col (repeat 5 (padded 0p 72p 0p 0p (row (padded 8p (bone 40p 40p 19p)) (padded 20p 32p 20p 0p (bone 100% 16p 8p)))))) (space 24p) (col (repeat 2 (padded 0p 26p 36p 26p (row 100% sb (repeat 4 (col (bone 48p 48p 16p)))))))))", null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null);
                }
            }
            if (ywlVar != null) {
            }
            return zy11.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            ywlVar2 = (ywl) this.L$1;
            kotlin.b.b(obj);
            ywlVar = ywlVar2;
            if (ywlVar != null) {
                o6s0 o6s0Var = new o6s0(new xzl(ywlVar, null, null, 30));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
            }
            return zy11.a;
        }
        int i4 = this.I$0;
        ywl ywlVar3 = (ywl) this.L$1;
        kotlin.b.b(obj);
        i = i4;
        ywlVar2 = ywlVar3;
        A = obj;
        bwp0 bwp0Var = (bwp0) A;
        if (bwp0Var != null) {
            c cVar3 = this.this$0;
            this.L$0 = vprVar;
            this.L$1 = ywlVar2;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i;
            this.label = 2;
        }
        ywlVar = ywlVar2;
        if (ywlVar != null) {
        }
        return zy11.a;
    }
}
