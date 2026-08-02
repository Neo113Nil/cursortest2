package com.yandex.div.core.preload;

import defpackage.bsd;
import defpackage.dpe0;
import defpackage.h73;
import defpackage.kg21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.vrq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Lkg21;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.preload.PreloadResultKt$filterErrorResults$1", f = "PreloadResult.kt", l = {31, 35}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PreloadResultKt$filterErrorResults$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ dpe0 $result;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadResultKt$filterErrorResults$1(dpe0 dpe0Var, Continuation continuation) {
        super(2, continuation);
        this.$result = dpe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreloadResultKt$filterErrorResults$1 preloadResultKt$filterErrorResults$1 = new PreloadResultKt$filterErrorResults$1(this.$result, continuation);
        preloadResultKt$filterErrorResults$1.L$0 = obj;
        return preloadResultKt$filterErrorResults$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreloadResultKt$filterErrorResults$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r6.a(r1, r5) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        srq0 srq0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            srq0 srq0Var2 = (srq0) this.L$0;
            dpe0 dpe0Var = this.$result;
            if (dpe0Var instanceof bsd) {
                it = ((bsd) dpe0Var).a.iterator();
                srq0Var = srq0Var2;
                while (it.hasNext()) {
                }
                return zy11.a;
            }
            if ((dpe0Var instanceof kg21) && ((kg21) dpe0Var).a != null) {
                this.label = 2;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it = (Iterator) this.L$1;
        srq0Var = (srq0) this.L$0;
        b.b(obj);
        while (it.hasNext()) {
            h73 a = a.a((dpe0) it.next());
            this.L$0 = srq0Var;
            this.L$1 = it;
            this.label = 1;
            srq0Var.getClass();
            if (srq0Var.d(vrq0.a((wls) a.b), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
