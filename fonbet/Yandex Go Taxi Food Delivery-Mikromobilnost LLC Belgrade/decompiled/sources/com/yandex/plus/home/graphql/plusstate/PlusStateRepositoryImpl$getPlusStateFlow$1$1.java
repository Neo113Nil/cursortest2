package com.yandex.plus.home.graphql.plusstate;

import com.yandex.plus.home.internal.di.d;
import defpackage.gmd0;
import defpackage.gyy;
import defpackage.hmd0;
import defpackage.iyy;
import defpackage.jyy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.plusstate.PlusStateRepositoryImpl$getPlusStateFlow$1$1", f = "PlusStateRepositoryImpl.kt", l = {58, 60}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusStateRepositoryImpl$getPlusStateFlow$1$1 extends SuspendLambda implements wls {
    int I$0;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusStateRepositoryImpl$getPlusStateFlow$1$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusStateRepositoryImpl$getPlusStateFlow$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusStateRepositoryImpl$getPlusStateFlow$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        Object jyyVar;
        Object a;
        pz40 pz40Var2;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            pz40Var = cVar.i;
            d dVar = cVar.d;
            this.L$0 = pz40Var;
            this.label = 1;
            obj = dVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var2 = (pz40) this.L$0;
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                if (!(a instanceof Result.Failure)) {
                    a = new jyy((hmd0) a);
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    a = new gyy(a2);
                }
                jyyVar = (iyy) a;
                pz40Var = pz40Var2;
                r0 r0Var = (r0) pz40Var;
                r0Var.getClass();
                r0Var.m(null, jyyVar);
                return zy11.a;
            }
            pz40Var = (pz40) this.L$0;
            kotlin.b.b(obj);
        }
        Long l = (Long) obj;
        if (l == null) {
            jyyVar = new jyy(gmd0.a);
            r0 r0Var2 = (r0) pz40Var;
            r0Var2.getClass();
            r0Var2.m(null, jyyVar);
            return zy11.a;
        }
        c cVar2 = this.this$0;
        long longValue = l.longValue();
        this.L$0 = pz40Var;
        this.J$0 = longValue;
        this.I$0 = 0;
        this.label = 2;
        a = c.a(cVar2, this);
        if (a != coroutineSingletons) {
            pz40Var2 = pz40Var;
            if (!(a instanceof Result.Failure)) {
            }
            a2 = Result.a(a);
            if (a2 != null) {
            }
            jyyVar = (iyy) a;
            pz40Var = pz40Var2;
            r0 r0Var22 = (r0) pz40Var;
            r0Var22.getClass();
            r0Var22.m(null, jyyVar);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
