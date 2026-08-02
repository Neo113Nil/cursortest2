package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.group.Group;
import com.vk.toggle.features.ComFeatures;
import java.util.Collections;

/* compiled from: StoryGroups.kt */
/* loaded from: classes2.dex */
public final class i4m0 extends c320<VkPaginationList<Group>> {
    public static final i4m0 e = new i4m0(j4m0.a);

    @Override // xsna.c320
    public final io.reactivex.rxjava3.core.q<VkPaginationList<Group>> d() {
        ComFeatures comFeatures = ComFeatures.COM_MIGRATE_GROUPS_GET_EXTENDED;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(new fo(0, 0, "editor", "start_date,members_count,verified,screen_name,activity,trending,can_upload_story,can_upload_clip,wall,trending,is_business_category"), null, null, 3);
        }
        return rsg0.y0(yfb.y(xqu.h(new zqu(), null, Collections.singletonList(GroupsFilterDto.EDITOR), j4m0.b, null, null, 57), new e750(new dqu(), 14)), null, null, 3);
    }
}
