package xsna;

import com.vk.dto.common.data.PrivacySetting;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrivacyDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.PrivacyDelegateKt$handleCommentsVideoEdit$1", f = "PrivacyDelegate.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qcd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ kbe0 $action;
    final /* synthetic */ gce0 $this_handleCommentsVideoEdit;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcd0(gce0 gce0Var, kbe0 kbe0Var, spj<? super qcd0> spjVar) {
        super(2, spjVar);
        this.$this_handleCommentsVideoEdit = gce0Var;
        this.$action = kbe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qcd0(this.$this_handleCommentsVideoEdit, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qcd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            ice0 ice0Var = this.$this_handleCommentsVideoEdit.e;
            List<PrivacySetting.PrivacyRule> list = this.$action.b.e;
            this.label = 1;
            i = ice0Var.i(list, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            i = ((Result) obj).d();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a = Result.a(i);
        if (a != null) {
            bVar.a(a);
        }
        if (i instanceof Result.Failure) {
            i = "";
        }
        rdi.y(this.$this_handleCommentsVideoEdit, new k22(this.$action, (String) i));
        return s3q0.a;
    }
}
