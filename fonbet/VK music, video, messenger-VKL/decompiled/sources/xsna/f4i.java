package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommunityTopBarContent.kt */
@b6l(c = "com.vk.profile.community.impl.ui.profile.widget.topbar.CommunityTopBarContentKt$resolveSearch$1$2$1", f = "CommunityTopBarContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f4i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vvr $focusManager;
    final /* synthetic */ nek0 $keyboardController;
    final /* synthetic */ izs<CommunityProfileAction, s3q0> $onAction;
    final /* synthetic */ wh50<tho0> $textFieldValue$delegate;
    final /* synthetic */ h4i $topBarParams;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f4i(h4i h4iVar, nek0 nek0Var, vvr vvrVar, izs<? super CommunityProfileAction, s3q0> izsVar, wh50<tho0> wh50Var, spj<? super f4i> spjVar) {
        super(2, spjVar);
        this.$topBarParams = h4iVar;
        this.$keyboardController = nek0Var;
        this.$focusManager = vvrVar;
        this.$onAction = izsVar;
        this.$textFieldValue$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f4i(this.$topBarParams, this.$keyboardController, this.$focusManager, this.$onAction, this.$textFieldValue$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f4i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.$topBarParams.c.getValue().booleanValue()) {
            nek0 nek0Var = this.$keyboardController;
            if (nek0Var != null) {
                nek0Var.hide();
            }
            this.$focusManager.y(false);
            if (this.$textFieldValue$delegate.getValue().a.c.length() > 0) {
                this.$onAction.invoke(new CommunityProfileAction.b0.b(""));
                this.$textFieldValue$delegate.setValue(new tho0("", 0L, 6));
            }
        }
        return s3q0.a;
    }
}
