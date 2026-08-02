package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommunityTopBarContent.kt */
@b6l(c = "com.vk.profile.community.impl.ui.profile.widget.topbar.CommunityTopBarContentKt$resolveSearch$1$1$1", f = "CommunityTopBarContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e4i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<CommunityProfileAction, s3q0> $onAction;
    final /* synthetic */ wh50<tho0> $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e4i(izs<? super CommunityProfileAction, s3q0> izsVar, wh50<tho0> wh50Var, spj<? super e4i> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$textFieldValue$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e4i(this.$onAction, this.$textFieldValue$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e4i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(new CommunityProfileAction.b0.b(this.$textFieldValue$delegate.getValue().a.c));
        return s3q0.a;
    }
}
