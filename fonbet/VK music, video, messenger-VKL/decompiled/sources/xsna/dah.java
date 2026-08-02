package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommunityMembersDonutBannerInteractor.kt */
@b6l(c = "com.vk.profile.community.members.impl.interactor.CommunityMembersDonutBannerInteractorImpl$closeBanner$2", f = "CommunityMembersDonutBannerInteractor.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class dah extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $bannerId;
    final /* synthetic */ UserId $groupId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dah(UserId userId, String str, spj<? super dah> spjVar) {
        super(2, spjVar);
        this.$groupId = userId;
        this.$bannerId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dah(this.$groupId, this.$bannerId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dah) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(new zqu().q(this.$groupId, this.$bannerId));
            this.label = 1;
            if (evj.p(A, this) == coroutineSingletons) {
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
