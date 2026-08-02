package xsna;

import com.vk.push.common.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uje0;

/* compiled from: MergedPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.MergedPushMessagesReceiver$receiveMessages$2", f = "MergedPushMessagesReceiver.kt", l = {35, 38}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e920 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ b9f0<wje0> $channel;
    Object L$0;
    int label;
    final /* synthetic */ f920 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e920(b9f0<wje0> b9f0Var, f920 f920Var, spj<? super e920> spjVar) {
        super(2, spjVar);
        this.$channel = b9f0Var;
        this.this$0 = f920Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e920(this.$channel, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e920) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r10.t(r6, r9) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0092 -> B:6:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0095 -> B:6:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o0b<wje0> it;
        o0b<wje0> o0bVar;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            it = this.$channel.iterator();
            this.L$0 = it;
            this.label = 1;
            a = it.a(this);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0bVar = (o0b) this.L$0;
            kotlin.a.a(obj);
            it = o0bVar;
            this.L$0 = it;
            this.label = 1;
            a = it.a(this);
            if (a != coroutineSingletons) {
                o0bVar = it;
                obj = a;
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                wje0 next = o0bVar.next();
                this.this$0.getClass();
                List<uje0.b> list = next.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((uje0.b) obj2).c.isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                wje0 wje0Var = new wje0(arrayList, next.b, next.c);
                if (arrayList.isEmpty()) {
                    Logger.DefaultImpls.warn$default(this.this$0.c, "Received empty messages", null, 2, null);
                } else {
                    nm8 nm8Var = this.this$0.d;
                    this.L$0 = o0bVar;
                    this.label = 2;
                }
                it = o0bVar;
                this.L$0 = it;
                this.label = 1;
                a = it.a(this);
                if (a != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        o0bVar = (o0b) this.L$0;
        kotlin.a.a(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
