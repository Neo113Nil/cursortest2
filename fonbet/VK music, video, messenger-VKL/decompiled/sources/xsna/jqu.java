package xsna;

import com.vk.api.generated.groups.dto.GroupsMarketAvitoBadgeDto;
import com.vk.api.generated.groups.dto.GroupsTrustMarksItemDto;
import com.vk.dto.group.GroupMarketInfo;

/* compiled from: GroupsMarketInfoDtoToGroupMarketInfoMapper.kt */
/* loaded from: classes3.dex */
public final class jqu {

    /* compiled from: GroupsMarketInfoDtoToGroupMarketInfoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsMarketAvitoBadgeDto.LinkStatusDto.values().length];
            try {
                iArr[GroupsMarketAvitoBadgeDto.LinkStatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsMarketAvitoBadgeDto.LinkStatusDto.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsMarketAvitoBadgeDto.LinkStatusDto.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a(GroupsTrustMarksItemDto groupsTrustMarksItemDto) {
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.a aVar = GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.Companion;
        String d = groupsTrustMarksItemDto.d();
        aVar.getClass();
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code a2 = GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.a.a(d);
        String title = groupsTrustMarksItemDto.getTitle();
        if (title == null) {
            title = "";
        }
        String f = groupsTrustMarksItemDto.f();
        return new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark(a2, title, f != null ? f : "", groupsTrustMarksItemDto.e(), null, 16, null);
    }
}
