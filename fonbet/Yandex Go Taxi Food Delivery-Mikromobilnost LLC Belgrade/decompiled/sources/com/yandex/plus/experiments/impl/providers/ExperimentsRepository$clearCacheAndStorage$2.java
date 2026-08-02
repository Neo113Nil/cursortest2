package com.yandex.plus.experiments.impl.providers;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.providers.ExperimentsRepository$clearCacheAndStorage$2", f = "ExperimentsRepository.kt", l = {193, 113, 114, HProv.PP_CACHE_SIZE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ExperimentsRepository$clearCacheAndStorage$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $cooldown;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRepository$clearCacheAndStorage$2(a aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cooldown = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsRepository$clearCacheAndStorage$2(this.this$0, this.$cooldown, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsRepository$clearCacheAndStorage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(1:(3:(1:(1:(5:7|8|9|10|11)(2:17|18))(7:19|20|21|22|23|(3:26|10|11)|25))(6:33|34|35|36|37|(2:39|25)(4:40|23|(0)|25))|15|16)(1:44))(3:50|(1:52)|25)|45|46|(2:48|25)(3:49|37|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        r13 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Type inference failed for: r10v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v8, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v2, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        long j;
        a aVar2;
        int i;
        int i2;
        int i3;
        a aVar3;
        long j2;
        com.yandex.plus.experiments.api.cache.a aVar4;
        long j3;
        a aVar5;
        g050 g050Var;
        com.yandex.plus.experiments.api.cooldown.a aVar6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.b.b(obj);
            a aVar7 = this.this$0;
            aVar = aVar7.j;
            j = this.$cooldown;
            this.L$0 = aVar;
            this.L$1 = aVar7;
            this.J$0 = j;
            this.I$0 = 0;
            this.label = 1;
            if (aVar.a(this) != coroutineSingletons) {
                aVar2 = aVar7;
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i5 = this.I$1;
                int i6 = this.I$0;
                j2 = this.J$0;
                aVar3 = (a) this.L$1;
                ?? r9 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    i3 = i5;
                    i2 = i6;
                    aVar = r9;
                    aVar4 = aVar3.f;
                    this.L$0 = aVar;
                    this.L$1 = aVar3;
                    this.J$0 = j2;
                    this.I$0 = i2;
                    this.I$1 = i3;
                    this.label = 3;
                    if (aVar4.a(j2, this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j3 = j2;
                    aVar5 = aVar3;
                    aVar6 = aVar5.g;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.I$1 = i3;
                    this.label = 4;
                    if (com.yandex.plus.experiments.api.cooldown.a.d(aVar6, j3, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    g050Var = r9;
                }
            } else if (i4 == 3) {
                int i7 = this.I$1;
                i2 = this.I$0;
                j3 = this.J$0;
                aVar5 = (a) this.L$1;
                ?? r8 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    i3 = i7;
                    aVar = r8;
                    aVar6 = aVar5.g;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.I$1 = i3;
                    this.label = 4;
                    if (com.yandex.plus.experiments.api.cooldown.a.d(aVar6, j3, this) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var = r8;
                }
            } else {
                if (i4 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            g050Var.d(null);
            throw th;
        }
        int i8 = this.I$0;
        j = this.J$0;
        aVar2 = (a) this.L$1;
        ?? r10 = (g050) this.L$0;
        kotlin.b.b(obj);
        i = i8;
        aVar = r10;
        this.L$0 = aVar;
        this.L$1 = aVar2;
        this.J$0 = j;
        this.I$0 = i;
        this.I$1 = 0;
        this.label = 2;
        if (a.c(aVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        i2 = i;
        i3 = 0;
        long j4 = j;
        aVar3 = aVar2;
        j2 = j4;
        aVar4 = aVar3.f;
        this.L$0 = aVar;
        this.L$1 = aVar3;
        this.J$0 = j2;
        this.I$0 = i2;
        this.I$1 = i3;
        this.label = 3;
        if (aVar4.a(j2, this) != coroutineSingletons) {
        }
    }
}
