package xsna;

import android.graphics.Color;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.stories.dto.StoriesClickableStickerDto;
import com.vk.api.generated.stories.dto.StoriesClickableStickersDto;
import com.vk.api.generated.stories.dto.StoriesGetByIdExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetQuestionByIdResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.user.UserProfile;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoriesGetQuestionById.kt */
/* loaded from: classes15.dex */
public final class nsl0 extends awi<a> {
    public final UserId s;
    public final int t;
    public final int u;

    /* compiled from: StoriesGetQuestionById.kt */
    public static final class a {
        public final StoryAnswer a;

        public a(StoryAnswer storyAnswer) {
            this.a = storyAnswer;
        }
    }

    public nsl0(UserId userId, int i, int i2) {
        this.s = userId;
        this.t = i;
        this.u = i2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        StoriesClickableStickerDto storiesClickableStickerDto;
        Owner owner;
        List<StoriesClickableStickerDto> d;
        Object obj;
        avl0 avl0Var = new avl0();
        StringBuilder sb = new StringBuilder();
        sb.append(this.s);
        sb.append('_');
        sb.append(this.t);
        UserProfile userProfile = null;
        StoriesStoryDto storiesStoryDto = (StoriesStoryDto) j5g.Y(((StoriesGetByIdExtendedResponseDto) yfb.x(zul0.b(avl0Var, Collections.singletonList(sb.toString()), null, null, 30)).f(l7r0Var)).e());
        if (epx.f(storiesStoryDto.q2(), Boolean.TRUE) || storiesStoryDto.C() == BaseBoolIntDto.NO) {
            return new a(null);
        }
        tfx tfxVar = new tfx("stories.getQuestionById", new wd10(15), new nyh0(4));
        tfx.n(tfxVar, "owner_id", this.s, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", this.t, 0, 0, 8);
        tfx.l(tfxVar, "question_id", this.u, 0, 0, 8);
        tfxVar.j("extended", true);
        StoriesGetQuestionByIdResponseDto storiesGetQuestionByIdResponseDto = (StoriesGetQuestionByIdResponseDto) yfb.x(tfxVar).f(l7r0Var);
        StoriesClickableStickersDto K = storiesStoryDto.K();
        if (K == null || (d = K.d()) == null) {
            storiesClickableStickerDto = null;
        } else {
            Iterator<T> it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((StoriesClickableStickerDto) obj).V0() == StoriesClickableStickerDto.TypeDto.QUESTION) {
                    break;
                }
            }
            storiesClickableStickerDto = (StoriesClickableStickerDto) obj;
        }
        String v0 = storiesClickableStickerDto != null ? storiesClickableStickerDto.v0() : null;
        String e = storiesGetQuestionByIdResponseDto.f().e();
        String B = storiesClickableStickerDto != null ? storiesClickableStickerDto.B() : null;
        UserId q = storiesGetQuestionByIdResponseDto.f().q();
        if (q != null) {
            List<UsersUserFullDto> e2 = storiesGetQuestionByIdResponseDto.e();
            if (e2 != null) {
                for (UsersUserFullDto usersUserFullDto : e2) {
                    if (epx.f(usersUserFullDto.s1(), q)) {
                        owner = new k2r0().a(usersUserFullDto);
                        break;
                    }
                }
            }
            List<GroupsGroupFullDto> d2 = storiesGetQuestionByIdResponseDto.d();
            if (d2 != null) {
                for (GroupsGroupFullDto groupsGroupFullDto : d2) {
                    if (epx.f(groupsGroupFullDto.P0(), q)) {
                        owner = equ.a(groupsGroupFullDto);
                        break;
                    }
                }
            }
        }
        owner = null;
        if (epx.f(storiesGetQuestionByIdResponseDto.f().f(), Boolean.TRUE) && owner != null) {
            userProfile = new UserProfile(owner);
        }
        UserProfile userProfile2 = userProfile;
        if (v0 == null) {
            v0 = "";
        }
        return new a(new StoryAnswer(this.s, this.t, this.u, v0, e, userProfile2, Color.parseColor(B), userProfile2 == null, storiesGetQuestionByIdResponseDto.f().g(), null, 512, null));
    }
}
