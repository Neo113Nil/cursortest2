package ru.rustore.sdk.pushclient.s;

import com.vk.push.common.Logger;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.kvy0;
import xsna.nay0;
import xsna.p2z0;
import xsna.qzy0;
import xsna.s3q0;
import xsna.spj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushTokenUseCase$invoke$2", f = "RegisterPushTokenUseCase.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class k$b extends SuspendLambda implements izs<spj<? super Result<? extends nay0>>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ p2z0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k$b(p2z0 p2z0Var, String str, spj<? super k$b> spjVar) {
        super(1, spjVar);
        this.c = p2z0Var;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new k$b(this.c, this.d, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Result<? extends nay0>> spjVar) {
        return new k$b(this.c, this.d, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r1 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            a.a(obj);
            qzy0 qzy0Var = this.c.a;
            String str = this.d;
            this.b = 1;
            a = qzy0Var.a(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.a;
                a.a(obj);
                return new Result(obj2);
            }
            a.a(obj);
            a = ((Result) obj).d();
        }
        p2z0 p2z0Var = this.c;
        Throwable a2 = Result.a(a);
        if (a2 != null && (a2 instanceof HostIsNotMasterException)) {
            Logger.DefaultImpls.warn$default(p2z0Var.d, "Register for pushes has failed, received HostIsNotMasterException", null, 2, null);
            kvy0 kvy0Var = p2z0Var.c;
            this.a = a;
            this.b = 2;
            Object a3 = kvy0Var.a.a(this);
            if (a3 != coroutineSingletons) {
                a3 = s3q0.a;
            }
        }
        obj2 = a;
        return new Result(obj2);
    }
}
