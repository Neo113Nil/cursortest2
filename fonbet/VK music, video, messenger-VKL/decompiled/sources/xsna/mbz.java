package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qbz;

/* compiled from: LinkVKBidFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.presentation.LinkVKBidFeature$processBidLink$1", f = "LinkVKBidFeature.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class mbz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $vkBidProfileId;
    int label;
    final /* synthetic */ nbz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(nbz nbzVar, long j, spj<? super mbz> spjVar) {
        super(2, spjVar);
        this.this$0 = nbzVar;
        this.$vkBidProfileId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mbz(this.this$0, this.$vkBidProfileId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mbz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(qbz.a.b);
                nbz nbzVar = this.this$0;
                vbz vbzVar = nbzVar.g;
                UserId userId = nbzVar.h;
                long j = this.$vkBidProfileId;
                this.label = 1;
                obj = vbzVar.b(userId, j, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.this$0.i.b(ibz.a);
            } else {
                nbz.U(this.this$0, this.$vkBidProfileId);
            }
            this.this$0.T(qbz.b.b);
        } catch (Exception e) {
            this.this$0.T(new qbz.e(e));
        }
        return s3q0.a;
    }
}
