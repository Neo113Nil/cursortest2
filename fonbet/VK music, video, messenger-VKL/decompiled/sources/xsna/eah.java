package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.groups.dto.GroupsDonutFriendsBannerDto;
import com.vk.api.generated.groups.dto.GroupsGetBannerResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.impl.domain.BannerButton;
import com.vk.profile.community.members.impl.domain.BannerButtonStyle;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CommunityMembersDonutBannerInteractor.kt */
@b6l(c = "com.vk.profile.community.members.impl.interactor.CommunityMembersDonutBannerInteractorImpl$getBanner$2", f = "CommunityMembersDonutBannerInteractor.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class eah extends SuspendLambda implements wzs<yvj, spj<? super MembersListBanner>, Object> {
    final /* synthetic */ UserId $groupId;
    int label;
    final /* synthetic */ fah this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eah(UserId userId, fah fahVar, spj<? super eah> spjVar) {
        super(2, spjVar);
        this.$groupId = userId;
        this.this$0 = fahVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eah(this.$groupId, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super MembersListBanner> spjVar) {
        return ((eah) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String url;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(new zqu().p(this.$groupId, new Integer(21)));
            this.label = 1;
            obj = evj.p(A, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.getClass();
        GroupsDonutFriendsBannerDto e = ((GroupsGetBannerResponseDto) obj).e();
        if (e == null) {
            return null;
        }
        String title = e.getTitle();
        String f = e.f();
        String title2 = e.e().getTitle();
        if (title2 == null) {
            return null;
        }
        BannerButtonStyle bannerButtonStyle = e.d() == GroupsDonutFriendsBannerDto.ActionTypeDto.REGULAR ? BannerButtonStyle.PAID : BannerButtonStyle.FREE;
        BaseLinkButtonActionDto e2 = e.e().e();
        if (e2 == null || (url = e2.getUrl()) == null) {
            return null;
        }
        return new MembersListBanner(title, f, new BannerButton(title2, bannerButtonStyle, url), "donut_friends");
    }
}
