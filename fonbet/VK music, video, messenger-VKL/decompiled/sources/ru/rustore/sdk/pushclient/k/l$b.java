package ru.rustore.sdk.pushclient.k;

import com.vk.push.common.Logger;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.c4z0;
import xsna.nbz0;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.VkpnsTopicRepository$subscribeToTopic$2", f = "VkpnsTopicRepository.kt", l = {20, 23}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class l$b extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    public int a;
    public final /* synthetic */ c4z0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l$b(c4z0 c4z0Var, String str, spj<? super l$b> spjVar) {
        super(2, spjVar);
        this.b = c4z0Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l$b(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return new l$b(this.b, this.c, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            a.a(obj);
            s9y0 s9y0Var = this.b.b;
            this.a = 1;
            obj = s9y0Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                failure = ((Result) obj).d();
                return new Result(failure);
            }
            a.a(obj);
        }
        String str = (String) obj;
        if (str != null) {
            Logger.DefaultImpls.info$default(this.b.d, "Start subscribe to topic " + this.c, null, 2, null);
            nbz0 nbz0Var = this.b.a;
            String str2 = this.c;
            this.a = 2;
            failure = nbz0Var.a(str, str2, this);
        } else {
            Logger.DefaultImpls.warn$default(this.b.d, "Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic", null, 2, null);
            failure = new Result.Failure(new Exception("Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic"));
        }
        return new Result(failure);
    }
}
