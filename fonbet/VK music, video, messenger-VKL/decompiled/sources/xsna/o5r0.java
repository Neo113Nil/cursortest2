package xsna;

import com.vk.uxpolls.api.models.UxPollsPoll;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UxPollsRepositoryImpl.kt */
@b6l(c = "com.vk.uxpolls.data.UxPollsRepositoryImpl$cachePolls$2", f = "UxPollsRepositoryImpl.kt", l = {51, 52}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class o5r0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ List<UxPollsPoll> $polls;
    final /* synthetic */ List<String> $triggers;
    int label;
    final /* synthetic */ t5r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5r0(t5r0 t5r0Var, List<UxPollsPoll> list, List<String> list2, spj<? super o5r0> spjVar) {
        super(1, spjVar);
        this.this$0 = t5r0Var;
        this.$polls = list;
        this.$triggers = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new o5r0(this.this$0, this.$polls, this.$triggers, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((o5r0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r12.d(r3, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (xsna.t5r0.n(r12, r1, r4, r11) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            t5r0 t5r0Var = this.this$0;
            List<UxPollsPoll> list = this.$polls;
            List<String> list2 = this.$triggers;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        lnb0 y = this.this$0.b.y();
        List<UxPollsPoll> list3 = this.$polls;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (UxPollsPoll uxPollsPoll : list3) {
            arrayList.add(new ypb0(uxPollsPoll.getId(), uxPollsPoll.d(), null, uxPollsPoll.e(), uxPollsPoll.f()));
        }
        this.label = 2;
    }
}
