package xsna;

import com.vk.push.common.Logger;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uje0;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$handlePush$1", f = "VkpnsNotifierMessagesReceiver.kt", l = {253, 184}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class p4w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ uje0.b $pushMessage;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4w0(s4w0 s4w0Var, uje0.b bVar, spj<? super p4w0> spjVar) {
        super(2, spjVar);
        this.this$0 = s4w0Var;
        this.$pushMessage = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p4w0(this.this$0, this.$pushMessage, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p4w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10.t(r2, r9) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wi50 wi50Var;
        uje0.b bVar;
        s4w0 s4w0Var;
        ui50 ui50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                s4w0 s4w0Var2 = this.this$0;
                wi50Var = s4w0Var2.g;
                bVar = this.$pushMessage;
                this.L$0 = wi50Var;
                this.L$1 = s4w0Var2;
                this.L$2 = bVar;
                this.label = 1;
                if (wi50Var.b(this) != coroutineSingletons) {
                    s4w0Var = s4w0Var2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ui50Var = (ui50) this.L$0;
                try {
                    kotlin.a.a(obj);
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    return s3q0.a;
                } catch (Throwable th) {
                    th = th;
                    ui50Var.c(null);
                    throw th;
                }
            }
            uje0.b bVar2 = (uje0.b) this.L$2;
            s4w0Var = (s4w0) this.L$1;
            ?? r5 = (ui50) this.L$0;
            kotlin.a.a(obj);
            bVar = bVar2;
            wi50Var = r5;
            if (s4w0Var.e.d()) {
                Logger.DefaultImpls.warn$default(s4w0Var.l(), "pushMessagesChannel is closed, push not sent", null, 2, null);
            } else {
                nm8 nm8Var = s4w0Var.e;
                wje0 wje0Var = new wje0(Collections.singletonList(bVar), false, ReceivedBy.WEB_SOCKET);
                this.L$0 = wi50Var;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            }
            ui50Var = wi50Var;
            s3q0 s3q0Var2 = s3q0.a;
            ui50Var.c(null);
            return s3q0.a;
        } catch (Throwable th2) {
            th = th2;
            ui50Var = wi50Var;
            ui50Var.c(null);
            throw th;
        }
    }
}
