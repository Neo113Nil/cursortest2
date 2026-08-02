package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserProfileFriendsAndFollowersInfoViewHolder.kt */
@b6l(c = "com.vk.profile.user.impl.ui.adapter.holders.UserProfileFriendsAndFollowersInfoViewHolder$Content$2$1", f = "UserProfileFriendsAndFollowersInfoViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class spq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $showOnboarding;
    final /* synthetic */ etv0 $tooltipState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spq0(boolean z, etv0 etv0Var, spj<? super spq0> spjVar) {
        super(2, spjVar);
        this.$showOnboarding = z;
        this.$tooltipState = etv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new spq0(this.$showOnboarding, this.$tooltipState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((spq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$showOnboarding) {
            this.$tooltipState.setVisible(true);
        }
        return s3q0.a;
    }
}
