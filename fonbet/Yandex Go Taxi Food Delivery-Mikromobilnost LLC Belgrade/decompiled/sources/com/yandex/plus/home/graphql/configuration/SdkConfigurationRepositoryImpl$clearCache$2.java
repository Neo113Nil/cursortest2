package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.log.api.LogPriority;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rkd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.configuration.SdkConfigurationRepositoryImpl$clearCache$2", f = "SdkConfigurationRepositoryImpl.kt", l = {225, HProv.ALG_SID_KECCAK_224, HProv.PP_CIPHEROID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SdkConfigurationRepositoryImpl$clearCache$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkConfigurationRepositoryImpl$clearCache$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkConfigurationRepositoryImpl$clearCache$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkConfigurationRepositoryImpl$clearCache$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r12.f(r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (kotlinx.coroutines.a.f(r5, r11) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        a aVar;
        int i;
        g050 g050Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                kotlinx.coroutines.sync.a aVar3 = aVar2.k;
                this.L$0 = aVar3;
                this.L$1 = aVar2;
                this.I$0 = 0;
                this.label = 1;
                if (aVar3.a(this) != coroutineSingletons) {
                    g050Var = aVar3;
                    aVar = aVar2;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$1;
                g050Var2 = (g050) this.L$0;
                try {
                    b.b(obj);
                    aVar.m = null;
                    aVar.l.l(null);
                    g050Var2.d(null);
                    if (((Number) this.this$0.l.j().getValue()).intValue() > 0) {
                        a aVar4 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return zy11.a;
                } catch (Throwable th) {
                    th = th;
                    g050Var2.d(null);
                    throw th;
                }
            }
            int i3 = this.I$0;
            a aVar5 = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
            i = i3;
            aVar = aVar5;
            rkd0 rkd0Var = aVar.g;
            LogPriority logPriority = LogPriority.INFO;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "SdkConfigurationRepositoryImpl", "clearCache()", null);
            }
            qoh qohVar = aVar.m;
            if (qohVar != null) {
                this.L$0 = g050Var;
                this.L$1 = aVar;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
            }
            g050Var2 = g050Var;
            aVar.m = null;
            aVar.l.l(null);
            g050Var2.d(null);
            if (((Number) this.this$0.l.j().getValue()).intValue() > 0) {
            }
            return zy11.a;
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
    }
}
