package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChatOnlineMembersLoaderImpl.kt */
@b6l(c = "com.vk.im.chat.onlines.impl.ChatOnlineMembersLoaderImpl$runLoadingFlow$1", f = "ChatOnlineMembersLoaderImpl.kt", l = {36, 37, 39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ztb extends SuspendLambda implements wzs<lsr<? super Integer>, spj<? super s3q0>, Object> {
    final /* synthetic */ fmb $chat;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztb(aub aubVar, fmb fmbVar, spj<? super ztb> spjVar) {
        super(2, spjVar);
        this.this$0 = aubVar;
        this.$chat = fmbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ztb ztbVar = new ztb(this.this$0, this.$chat, spjVar);
        ztbVar.L$0 = obj;
        return ztbVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Integer> lsrVar, spj<? super s3q0> spjVar) {
        return ((ztb) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (xsna.s3q0.a == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r0.emit(r7, r11) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r12 != r1) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kp80 kp80Var;
        lsr lsrVar = (lsr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                kp80Var = (kp80) obj;
                Integer num = new Integer(kp80Var.b);
                this.L$0 = lsrVar;
                this.L$1 = kp80Var;
                this.label = 2;
            } else if (i == 2) {
                kp80Var = (kp80) this.L$1;
                kotlin.a.a(obj);
                dz5 dz5Var = this.this$0.b;
                this.L$0 = lsrVar;
                this.L$1 = null;
                this.label = 3;
                Object b = qsl.b((kp80Var.c + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) - qni0.a(), this);
                if (b != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        kotlin.a.a(obj);
        if (!iyx.h(getContext())) {
            return s3q0.a;
        }
        aub aubVar = this.this$0;
        fmb fmbVar = this.$chat;
        this.L$0 = lsrVar;
        this.L$1 = null;
        this.label = 1;
        obj = aub.b(aubVar, fmbVar, this);
    }
}
