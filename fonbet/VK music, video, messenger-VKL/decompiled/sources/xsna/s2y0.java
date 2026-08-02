package xsna;

import com.vk.dto.common.Peer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionInteractor.kt */
@b6l(c = "com.vk.im.chat.restriction.impl.domain.WriteRestrictionInteractor$disableWritePermission$2", f = "WriteRestrictionInteractor.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s2y0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $dialogId;
    final /* synthetic */ int $durationSec;
    final /* synthetic */ Peer $peer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ v2y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2y0(v2y0 v2y0Var, long j, Peer peer, int i, spj<? super s2y0> spjVar) {
        super(2, spjVar);
        this.this$0 = v2y0Var;
        this.$dialogId = j;
        this.$peer = peer;
        this.$durationSec = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        s2y0 s2y0Var = new s2y0(this.this$0, this.$dialogId, this.$peer, this.$durationSec, spjVar);
        s2y0Var.L$0 = obj;
        return s2y0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s2y0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ezv ezvVar = this.this$0.b;
            jbm jbmVar = new jbm(this.$dialogId, this.$peer, this.$durationSec);
            this.L$0 = null;
            this.label = 1;
            if (ezvVar.a(yvjVar, jbmVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
