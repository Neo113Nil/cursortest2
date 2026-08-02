package xsna;

import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.questions.dto.QuestionsGetExtendedResponseDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vk.profile.questions.impl.d;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.asx;
import xsna.orx;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class crx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ crx(com.vk.lists.c cVar, boolean z, com.vk.profile.questions.impl.h hVar) {
        this.b = 1;
        this.d = cVar;
        this.c = z;
        this.e = hVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        switch (this.b) {
            case 0:
                drx drxVar = (drx) this.d;
                erx erxVar = (erx) this.e;
                GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
                ArrayList W = drxVar.W(groupsGetFriendsInvitationListResponseDto.i());
                String g = groupsGetFriendsInvitationListResponseDto.g();
                Integer f = groupsGetFriendsInvitationListResponseDto.f();
                int intValue = f != null ? f.intValue() : 0;
                yrx e = frx.e(erxVar, InviteFriendsTabIndex.NOT_INVITED);
                Integer d = groupsGetFriendsInvitationListResponseDto.d();
                int intValue2 = d != null ? d.intValue() : 0;
                boolean isEmpty = W.isEmpty();
                asx.c cVar = asx.c.a;
                yrx a = yrx.a(e, intValue2, isEmpty ? cVar : new asx.a(W, g), 1);
                yrx e2 = frx.e(erxVar, InviteFriendsTabIndex.SELECTED);
                EmptyList emptyList = EmptyList.b;
                emptyList.getClass();
                yrx a2 = yrx.a(e2, 0, cVar, 1);
                yrx e3 = frx.e(erxVar, InviteFriendsTabIndex.INVITED);
                Integer e4 = groupsGetFriendsInvitationListResponseDto.e();
                yrx a3 = yrx.a(e3, e4 != null ? e4.intValue() : 0, asx.b.a, 1);
                if (!this.c) {
                    a3 = null;
                }
                drxVar.T(new orx.c.e(a, a2, a3, new lps(intValue, emptyList)));
                return s3q0.a;
            case 1:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) this.e;
                QuestionsGetExtendedResponseDto questionsGetExtendedResponseDto = (QuestionsGetExtendedResponseDto) obj;
                List<UsersUserFullDto> f2 = questionsGetExtendedResponseDto.f();
                int e5 = on00.e(c5g.u(f2, 10));
                if (e5 < 16) {
                    e5 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e5);
                for (Object obj2 : f2) {
                    linkedHashMap.put(((UsersUserFullDto) obj2).s1(), obj2);
                }
                List<QuestionsQuestionDto> d2 = questionsGetExtendedResponseDto.d();
                ArrayList arrayList2 = new ArrayList();
                for (QuestionsQuestionDto questionsQuestionDto : d2) {
                    UsersUserFullDto usersUserFullDto = (UsersUserFullDto) linkedHashMap.get(questionsQuestionDto.g());
                    d.c cVar3 = null;
                    if (usersUserFullDto != null) {
                        if (!this.c && ((arrayList = hVar.h) == null || !arrayList.isEmpty())) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((com.vk.profile.questions.impl.d) it.next()).b().getId() == questionsQuestionDto.getId()) {
                                }
                            }
                        }
                        hVar.g.getClass();
                        cVar3 = com.vk.profile.questions.impl.c.a(questionsQuestionDto, usersUserFullDto);
                    }
                    if (cVar3 != null) {
                        arrayList2.add(cVar3);
                    }
                }
                cVar2.s(questionsGetExtendedResponseDto.e());
                return new Pair(Integer.valueOf(questionsGetExtendedResponseDto.getCount()), arrayList2);
            default:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.b bVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.b) this.d;
                StoryUserViewer storyUserViewer = (StoryUserViewer) this.e;
                bVar.T(new e.a.C1825a(storyUserViewer.c, (Set) obj));
                if (this.c) {
                    f4z f4zVar = bVar.m;
                    tlo0.a aVar = tlo0.Companion;
                    Object[] objArr = {storyUserViewer.d};
                    aVar.getClass();
                    f4zVar.b(new i.c(new ag1(16, bVar, storyUserViewer), new tlo0.f(R.string.story_statistics_viewers_snackbar_button_revert), tlo0.a.c(R.string.story_statistics_viewers_snackbar_was_hidden, objArr)));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ crx(wk50 wk50Var, Object obj, boolean z, int i) {
        this.b = i;
        this.d = wk50Var;
        this.e = obj;
        this.c = z;
    }
}
