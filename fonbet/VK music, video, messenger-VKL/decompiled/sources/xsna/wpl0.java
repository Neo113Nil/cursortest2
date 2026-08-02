package xsna;

import com.vk.api.generated.stories.dto.StoriesGetArchiveExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wpl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;

    public /* synthetic */ wpl0(UserId userId, int i) {
        this.b = i;
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                StoriesGetArchiveExtendedResponseDto storiesGetArchiveExtendedResponseDto = (StoriesGetArchiveExtendedResponseDto) obj;
                new j2r0();
                LinkedHashMap b = j2r0.b(storiesGetArchiveExtendedResponseDto.f());
                new dqu();
                LinkedHashMap b2 = dqu.b(storiesGetArchiveExtendedResponseDto.d());
                LinkedHashMap a = b590.a(new b590(), null, storiesGetArchiveExtendedResponseDto.f(), null, 11);
                UserId userId = this.c;
                StoryOwner user = fkq0.d(userId) ? new StoryOwner.User((UserProfile) b.get(userId), null, 2, null) : new StoryOwner.Community((Group) b2.get(fkq0.a(userId)), null, 2, null);
                List<StoriesStoryDto> e = storiesGetArchiveExtendedResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(ivl0.a((StoriesStoryDto) it.next(), a, b, b2));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(storiesGetArchiveExtendedResponseDto.getCount());
                return new ppt(vKList, user);
            default:
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (UIBlock uIBlock : arrayList2) {
                        boolean z2 = uIBlock instanceof UIBlockVideo;
                        UserId userId2 = this.c;
                        if ((z2 && ((UIBlockVideo) uIBlock).B.I0().b == userId2.b) || ((uIBlock instanceof UIBlockSearchAuthor) && (-uIBlock.g.b) == userId2.b)) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
