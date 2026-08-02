package xsna;

import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersSortDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.domain.User;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.iah;

/* compiled from: CommunityMembersInteractor.kt */
@b6l(c = "com.vk.profile.community.members.impl.interactor.CommunityMembersInteractorImpl$getMembers$2", f = "CommunityMembersInteractor.kt", l = {65, JsonToken.BEGIN_ARRAY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class gah extends SuspendLambda implements wzs<yvj, spj<? super Pair<? extends List<? extends User>, ? extends String>>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ CommunityMembersFilter $filter;
    final /* synthetic */ UserId $group;
    final /* synthetic */ String $offset;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ hah this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gah(CommunityMembersFilter communityMembersFilter, hah hahVar, UserId userId, int i, String str, spj<? super gah> spjVar) {
        super(2, spjVar);
        this.$filter = communityMembersFilter;
        this.this$0 = hahVar;
        this.$group = userId;
        this.$count = i;
        this.$offset = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gah(this.$filter, this.this$0, this.$group, this.$count, this.$offset, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Pair<? extends List<? extends User>, ? extends String>> spjVar) {
        return ((gah) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        if (r15 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a4, code lost:
    
        if (r15 == r0) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto2;
        User a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            i = (this.$filter == CommunityMembersFilter.FRIENDS && this.this$0.a) ? 1 : 0;
            hah hahVar = this.this$0;
            ArrayList arrayList = i != 0 ? hahVar.f : hahVar.g;
            zqu zquVar = new zqu();
            UserId a2 = fkq0.a(this.$group);
            int i3 = iah.a.$EnumSwitchMapping$0[this.$filter.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    groupsGetMembersFilterDto2 = GroupsGetMembersFilterDto.FRIENDS;
                } else if (i3 == 3) {
                    groupsGetMembersFilterDto2 = GroupsGetMembersFilterDto.UNSURE;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    groupsGetMembersFilterDto2 = GroupsGetMembersFilterDto.DONUT;
                }
                groupsGetMembersFilterDto = groupsGetMembersFilterDto2;
            } else {
                groupsGetMembersFilterDto = null;
            }
            iz2 A = yfb.A(xqu.g(zquVar, a2, i != 0 ? GroupsGetMembersSortDto.DONS_DESC : null, null, new Integer(this.$count), arrayList, groupsGetMembersFilterDto, this.$offset, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE));
            this.L$0 = null;
            this.I$0 = i;
            this.label = 1;
            obj = evj.p(A, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return (Pair) obj;
            }
            i = this.I$0;
            kotlin.a.a(obj);
        }
        GroupsGetMembersFieldsResponseDto groupsGetMembersFieldsResponseDto = (GroupsGetMembersFieldsResponseDto) obj;
        if (this.$filter != CommunityMembersFilter.ALL) {
            List<GroupsUserXtrRoleDto> d = groupsGetMembersFieldsResponseDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                arrayList2.add(iah.a((GroupsUserXtrRoleDto) it.next()));
            }
            return new Pair(arrayList2, groupsGetMembersFieldsResponseDto.e());
        }
        List<GroupsUserXtrRoleDto> d2 = groupsGetMembersFieldsResponseDto.d();
        hah hahVar2 = this.this$0;
        ArrayList arrayList3 = new ArrayList();
        for (GroupsUserXtrRoleDto groupsUserXtrRoleDto : d2) {
            if (groupsUserXtrRoleDto.C() != null) {
                hahVar2.c.add(iah.a(groupsUserXtrRoleDto));
                a = null;
            } else {
                a = iah.a(groupsUserXtrRoleDto);
            }
            if (a != null) {
                arrayList3.add(a);
            }
        }
        String e = groupsGetMembersFieldsResponseDto.e();
        if (e == null || e.length() == 0) {
            Pair pair = new Pair(j5g.u0(this.this$0.c, j5g.u0(arrayList3, this.this$0.d)), groupsGetMembersFieldsResponseDto.e());
            this.this$0.d.clear();
            return pair;
        }
        if (arrayList3.size() + this.this$0.d.size() >= 20) {
            Pair pair2 = new Pair(j5g.u0(arrayList3, this.this$0.d), groupsGetMembersFieldsResponseDto.e());
            this.this$0.d.clear();
            return pair2;
        }
        g5g.y(arrayList3, this.this$0.d);
        hah hahVar3 = this.this$0;
        UserId userId = this.$group;
        CommunityMembersFilter communityMembersFilter = this.$filter;
        String e2 = groupsGetMembersFieldsResponseDto.e();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.I$0 = i;
        this.label = 2;
        obj = hahVar3.a(userId, communityMembersFilter, e2, this);
    }
}
