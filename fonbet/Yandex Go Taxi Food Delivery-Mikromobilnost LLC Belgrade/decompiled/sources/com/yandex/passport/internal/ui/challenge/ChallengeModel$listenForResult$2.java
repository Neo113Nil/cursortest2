package com.yandex.passport.internal.ui.challenge;

import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.ChallengeModel$listenForResult$2", f = "ChallengeModel.kt", l = {105, 108, 110, 114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChallengeModel$listenForResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.ui.common.web.c $webCase;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeModel$listenForResult$2(o oVar, com.yandex.passport.internal.ui.common.web.c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$webCase = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeModel$listenForResult$2(this.this$0, this.$webCase, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeModel$listenForResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        if (r1.emit(r8, r7) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r8 != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o oVar;
        o oVar2;
        r c;
        o oVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oVar = this.this$0;
            fyc fycVar = ((com.yandex.passport.internal.ui.common.web.a) this.$webCase).b;
            this.L$0 = oVar;
            this.L$1 = oVar;
            this.label = 1;
            obj = fycVar.s(this);
            if (obj != coroutineSingletons) {
                oVar2 = oVar;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            oVar = (o) this.L$1;
            oVar2 = (o) this.L$0;
            kotlin.b.b(obj);
        } else if (i == 2) {
            oVar = (o) this.L$1;
            oVar3 = (o) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = oVar;
            this.L$1 = null;
            this.label = 3;
            obj = o.a(oVar3, this);
        } else {
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = (o) this.L$0;
            kotlin.b.b(obj);
            c = (r) obj;
            n0 n0Var = oVar.e;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        if (((Boolean) obj).booleanValue()) {
            n0 n0Var2 = oVar2.e;
            this.L$0 = oVar2;
            this.L$1 = oVar;
            this.label = 2;
            if (n0Var2.emit(q.a, this) != coroutineSingletons) {
                oVar3 = oVar2;
                this.L$0 = oVar;
                this.L$1 = null;
                this.label = 3;
                obj = o.a(oVar3, this);
            }
            return coroutineSingletons;
        }
        oVar2.getClass();
        c = o.c();
        n0 n0Var3 = oVar.e;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
    }
}
