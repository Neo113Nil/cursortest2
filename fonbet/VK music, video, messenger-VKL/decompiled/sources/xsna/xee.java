package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.group.Group;
import com.vk.toggle.features.ComFeatures;

/* compiled from: StoryGroups.kt */
/* loaded from: classes2.dex */
public final class xee extends c320<VkPaginationList<Group>> {
    public static final xee e = new xee(j4m0.a);

    @Override // xsna.c320
    public final io.reactivex.rxjava3.core.q<VkPaginationList<Group>> d() {
        ComFeatures comFeatures = ComFeatures.COM_MIGRATE_GROUPS_GET_EXTENDED;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(new fo(0, 0, "editor,can_post_clips", "start_date,members_count,verified,screen_name,activity,trending,can_upload_story,can_upload_clip,wall,trending,is_business_category,is_market_online_booking_setting_enabled,is_market_market_link_attachment_enabled,is_market_message_to_bc_attachment_enabled,age_mark,age_limits,is_market_enabled,is_business"), null, null, 3);
        }
        return rsg0.y0(yfb.y(xqu.h(new zqu(), null, e43.l(GroupsFilterDto.EDITOR, GroupsFilterDto.CAN_POST_CLIPS), j4m0.c, null, null, 57), new qm0(new dqu(), 12)), null, null, 3);
    }
}
