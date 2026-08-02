package com.yandex.go.suggest.impl.data.flex.document;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.bwp0;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkr;", "Lbwp0;", "queryParams", "Lzy11;", "<anonymous>", "(Lvpr;Lbwp0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$loadingActionsFlow$4", f = "SuperappSuggestDocumentInteractor.kt", l = {83, MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_224, HProv.PP_HASHOID, HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestDocumentInteractor$loadingActionsFlow$4 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestDocumentInteractor$loadingActionsFlow$4(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperappSuggestDocumentInteractor$loadingActionsFlow$4 superappSuggestDocumentInteractor$loadingActionsFlow$4 = new SuperappSuggestDocumentInteractor$loadingActionsFlow$4(this.this$0, (Continuation) obj3);
        superappSuggestDocumentInteractor$loadingActionsFlow$4.L$0 = (vpr) obj;
        superappSuggestDocumentInteractor$loadingActionsFlow$4.L$1 = (bwp0) obj2;
        return superappSuggestDocumentInteractor$loadingActionsFlow$4.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (com.yandex.go.suggest.impl.data.flex.document.c.a(r11, r0, r1, r10) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (kotlinx.coroutines.a.j(r3, r10) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (com.yandex.go.suggest.impl.data.flex.document.c.a(r11, r0, r1, r10) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (com.yandex.go.suggest.impl.data.flex.document.c.b(r11, r0, r1, r3, r10) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (com.yandex.go.suggest.impl.data.flex.document.c.a(r11, r0, r1, r10) == r2) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        vpr vprVar = (vpr) this.L$0;
        bwp0 bwp0Var = (bwp0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    c cVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                } else if (i != 3) {
                    if (i == 4) {
                        kotlin.b.b(obj);
                        this.this$0.a.d = false;
                        return zy11.a;
                    }
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        if (this.this$0.a.b && (bwp0Var.a.length() != 0 || ((str = bwp0Var.b) != null && !evu0.J(str)))) {
            c cVar2 = this.this$0;
            if (cVar2.j == SuperappSuggestExperiment.LoadingStrategy.FULL_REQUEST) {
                o430 o430Var = e3n.b;
                long U = kp50.U(cVar2.k, DurationUnit.MILLISECONDS);
                this.L$0 = vprVar;
                this.L$1 = bwp0Var;
                this.label = 2;
            } else if (cVar2.a.d) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            } else {
                boolean z = bwp0Var.c;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
            }
            return coroutineSingletons;
        }
        c cVar3 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
    }
}
