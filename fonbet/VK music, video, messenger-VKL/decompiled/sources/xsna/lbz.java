package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qbz;

/* compiled from: LinkVKBidFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.presentation.LinkVKBidFeature$loadData$1", f = "LinkVKBidFeature.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class lbz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isLinkButtonEnabled;
    int label;
    final /* synthetic */ nbz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbz(nbz nbzVar, boolean z, spj<? super lbz> spjVar) {
        super(2, spjVar);
        this.this$0 = nbzVar;
        this.$isLinkButtonEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lbz(this.this$0, this.$isLinkButtonEnabled, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lbz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(qbz.c.b);
                nbz nbzVar = this.this$0;
                vbz vbzVar = nbzVar.g;
                UserId userId = nbzVar.h;
                this.label = 1;
                obj = vbzVar.a(userId, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.this$0.T(new qbz.f((afu0) obj, this.$isLinkButtonEnabled));
        } catch (Exception e) {
            this.this$0.T(new qbz.e(e));
        }
        return s3q0.a;
    }
}
