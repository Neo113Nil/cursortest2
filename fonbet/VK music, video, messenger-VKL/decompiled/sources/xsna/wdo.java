package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DraftsListInlineActor.kt */
@b6l(c = "com.vk.draftslist.impl.ui.store.DraftsListInlineActor$initialLoadDrafts$1", f = "DraftsListInlineActor.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class wdo extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onError;
    int I$0;
    int label;
    final /* synthetic */ ydo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdo(ydo ydoVar, gzs<s3q0> gzsVar, spj<? super wdo> spjVar) {
        super(2, spjVar);
        this.this$0 = ydoVar;
        this.$onError = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wdo(this.this$0, this.$onError, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wdo) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                beo a = this.this$0.c.a();
                this.I$0 = 0;
                this.label = 1;
                obj = a.a(0, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            rdi.y(this.this$0, new zqh((hfo) obj, 11));
        } catch (Exception unused) {
            this.$onError.invoke();
        }
        return s3q0.a;
    }
}
