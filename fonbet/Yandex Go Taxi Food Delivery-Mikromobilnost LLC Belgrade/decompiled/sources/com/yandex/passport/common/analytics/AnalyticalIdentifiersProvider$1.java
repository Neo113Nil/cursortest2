package com.yandex.passport.common.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.analytics.AnalyticalIdentifiersProvider$1", f = "AnalyticalIdentifiersProvider.kt", l = {59, 120}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AnalyticalIdentifiersProvider$1 extends SuspendLambda implements wls {
    int I$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticalIdentifiersProvider$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticalIdentifiersProvider$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticalIdentifiersProvider$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r9 == r0) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006f -> B:6:0x0026). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = 5;
        } else if (i2 == 1) {
            i = this.I$0;
            kotlin.b.b(obj);
            b bVar = (b) obj;
            this.this$0.getClass();
            if (bVar == null || bVar.a == null || bVar.b == null) {
                obj = null;
            }
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                this.this$0.c.T(bVar2);
                return zy11Var;
            }
            i--;
            j = e.a;
            this.I$0 = i;
            this.label = 2;
        } else {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            kotlin.b.b(obj);
        }
        d dVar = this.this$0;
        if (i <= 0) {
            dVar.c.T(dVar.c());
            return zy11Var;
        }
        this.I$0 = i;
        this.label = 1;
        obj = tje.k0(((com.yandex.passport.common.coroutine.b) dVar.b).c, new AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2(dVar, null), this);
    }
}
