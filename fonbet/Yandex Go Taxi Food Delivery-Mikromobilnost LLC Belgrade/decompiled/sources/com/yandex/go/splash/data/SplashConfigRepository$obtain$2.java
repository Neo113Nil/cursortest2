package com.yandex.go.splash.data;

import defpackage.bst0;
import defpackage.g9n;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zg2;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbst0;", "<anonymous>", "(Ltse;)Lbst0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.data.SplashConfigRepository$obtain$2", f = "SplashConfigRepository.kt", l = {32, 32, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SplashConfigRepository$obtain$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashConfigRepository$obtain$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplashConfigRepository$obtain$2 splashConfigRepository$obtain$2 = new SplashConfigRepository$obtain$2(this.this$0, continuation);
        splashConfigRepository$obtain$2.L$0 = obj;
        return splashConfigRepository$obtain$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashConfigRepository$obtain$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new SplashConfigRepository$obtain$2$dynamic$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new SplashConfigRepository$obtain$2$v2$1(this.this$0, null), 3);
            h2 = tje.h(tseVar, null, null, new SplashConfigRepository$obtain$2$animated$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else if (i == 1) {
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return (bst0) obj;
            }
            h2 = (noh) this.L$3;
            b.b(obj);
            zg2 zg2Var = (zg2) obj;
            if (zg2Var != null) {
                return zg2Var;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            obj = h2.k(this);
        }
        g9n g9nVar = (g9n) obj;
        if (g9nVar != null) {
            return g9nVar;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.label = 2;
        obj = h.k(this);
    }
}
