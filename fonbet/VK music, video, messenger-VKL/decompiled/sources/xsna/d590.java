package xsna;

import com.vk.accountmanager.VideoAccountStrikeInfo;
import com.vk.accountmanager.VideoAccountStrikeType;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.groups.dto.GroupsCountersGroupDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutBlockDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutGoalsDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutSubscriptionsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeMarkDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsStrikesContentRestrictionDto;
import com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto;
import com.vk.api.generated.groups.dto.GroupsVideoChannelDataDto;
import com.vk.api.generated.groups.dto.GroupsVideoChannelOnboardingDto;
import com.vk.api.generated.groups.dto.GroupsWarningNotificationDto;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.donut.model.Donut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: OwnerMappers.kt */
/* loaded from: classes6.dex */
public final class d590 {

    /* compiled from: OwnerMappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GroupsGroupFullDto.VideoNotificationsStatusDto.values().length];
            try {
                iArr[GroupsGroupFullDto.VideoNotificationsStatusDto.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupFullDto.VideoNotificationsStatusDto.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGroupFullDto.VideoNotificationsStatusDto.PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GroupsGroupDonutDto.StatusDto.values().length];
            try {
                iArr2[GroupsGroupDonutDto.StatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GroupsGroupDonutDto.StatusDto.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BaseSexDto.values().length];
            try {
                iArr3[BaseSexDto.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BaseSexDto.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Image a(BaseOwnerCoverDto baseOwnerCoverDto) {
        List<BaseImageDto> e = baseOwnerCoverDto.e();
        List<BaseImageDto> list = e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (!drm0.N(((BaseImageDto) obj).getUrl())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseImageDto baseImageDto = (BaseImageDto) it.next();
            arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new Image(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u490 b(GroupsGroupFullDto groupsGroupFullDto) {
        Image image;
        String D1;
        VideoNotificationsStatus videoNotificationsStatus;
        LinkedHashMap linkedHashMap;
        String str;
        Donut donut;
        lyn lynVar;
        p7t0 p7t0Var;
        GroupsVideoChannelDataDto Q2;
        BaseAPlusMarkDto d;
        GroupsVideoChannelOnboardingDto e;
        Pair pair;
        Donut.DonutStatus donutStatus;
        Donut.DonutStatus donutStatus2;
        BaseLinkButtonActionDto e2;
        Long k;
        Integer j;
        UserId e3 = fkq0.e(fkq0.a(groupsGroupFullDto.P0()));
        String y1 = groupsGroupFullDto.y1();
        BaseBoolIntDto O2 = groupsGroupFullDto.O2();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        VerifyInfo verifyInfo = new VerifyInfo(O2 == baseBoolIntDto, groupsGroupFullDto.I2() == baseBoolIntDto, false, false, false, false, 60, null);
        String a2 = cqm0.a(groupsGroupFullDto.V1());
        if (a2 != null) {
            Serializer.c<Image> cVar = Image.CREATOR;
            image = Image.b.a(a2);
        } else {
            image = null;
        }
        String V1 = groupsGroupFullDto.V1();
        if (V1 == null || (D1 = js5.a(200, V1)) == null) {
            D1 = groupsGroupFullDto.D1();
        }
        Owner owner = new Owner(e3, y1, groupsGroupFullDto.V1(), D1, verifyInfo, image, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194240, null);
        owner.n(groupsGroupFullDto.u3() != GroupsGroupIsClosedDto.OPEN);
        owner.o(groupsGroupFullDto.W() != null ? !drm0.N(r2) : false);
        GroupsGroupAdminLevelDto f = groupsGroupFullDto.f();
        zog zogVar = new zog(f == GroupsGroupAdminLevelDto.ADMINISTRATOR, f == GroupsGroupAdminLevelDto.EDITOR, f == GroupsGroupAdminLevelDto.MODERATOR);
        String l2 = groupsGroupFullDto.l2();
        GroupsCountersGroupDto M = groupsGroupFullDto.M();
        long j2 = 0;
        long intValue = (M == null || (j = M.j()) == null) ? 0L : j.intValue();
        Integer T = groupsGroupFullDto.T();
        GroupsCountersGroupDto M2 = groupsGroupFullDto.M();
        if (M2 == null || (k = M2.k()) == null) {
            Integer o1 = groupsGroupFullDto.o1();
            if (o1 != null) {
                j2 = o1.intValue();
            }
        } else {
            j2 = k.longValue();
        }
        long j3 = j2;
        GroupsCountersGroupDto M3 = groupsGroupFullDto.M();
        Long l = M3 != null ? M3.l() : null;
        String description = groupsGroupFullDto.getDescription();
        boolean z = groupsGroupFullDto.n1() == GroupsGroupFullMemberStatusDto.MEMBER || groupsGroupFullDto.n1() == GroupsGroupFullMemberStatusDto.NOT_SURE || groupsGroupFullDto.n1() == GroupsGroupFullMemberStatusDto.HAS_SENT_A_REQUEST;
        GroupsGroupFullDto.VideoNotificationsStatusDto W2 = groupsGroupFullDto.W2();
        int i = W2 == null ? -1 : a.$EnumSwitchMapping$0[W2.ordinal()];
        if (i == -1) {
            videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
        } else if (i == 1) {
            videoNotificationsStatus = VideoNotificationsStatus.NONE;
        } else if (i == 2) {
            videoNotificationsStatus = VideoNotificationsStatus.ALL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
        }
        VideoNotificationsStatus videoNotificationsStatus2 = videoNotificationsStatus;
        String U1 = groupsGroupFullDto.U1();
        BaseOwnerCoverDto R = groupsGroupFullDto.R();
        Image a3 = R != null ? a(R) : null;
        BaseOwnerCoverDto R2 = groupsGroupFullDto.R();
        boolean z2 = (R2 != null ? R2.d() : null) == baseBoolIntDto;
        BaseOwnerCoverDto R22 = groupsGroupFullDto.R2();
        Image a4 = R22 != null ? a(R22) : null;
        BaseOwnerCoverDto R23 = groupsGroupFullDto.R2();
        boolean z3 = (R23 != null ? R23.d() : null) == baseBoolIntDto;
        GroupsStrikesRestrictionsDto y2 = groupsGroupFullDto.y2();
        if (y2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (y2.e() != null) {
                VideoAccountStrikeType videoAccountStrikeType = VideoAccountStrikeType.VIDEO_UPLOAD;
                GroupsStrikesContentRestrictionDto e4 = y2.e();
                String title = e4 != null ? e4.getTitle() : null;
                GroupsStrikesContentRestrictionDto e5 = y2.e();
                linkedHashMap2.put(videoAccountStrikeType, new VideoAccountStrikeInfo(title, e5 != null ? e5.getDescription() : null));
            }
            if (y2.d() != null) {
                VideoAccountStrikeType videoAccountStrikeType2 = VideoAccountStrikeType.LIVE;
                GroupsStrikesContentRestrictionDto d2 = y2.d();
                String title2 = d2 != null ? d2.getTitle() : null;
                GroupsStrikesContentRestrictionDto d3 = y2.d();
                linkedHashMap2.put(videoAccountStrikeType2, new VideoAccountStrikeInfo(title2, d3 != null ? d3.getDescription() : null));
            }
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap2 = null;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        GroupsGroupDonutDto l0 = groupsGroupFullDto.l0();
        if (l0 != null) {
            GroupsGroupDonutDescriptionDto e6 = l0.e();
            if (e6 instanceof GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) {
                BaseLinkButtonDto e7 = ((GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) e6).e();
                pair = new Pair(e7 != null ? e7.getTitle() : null, (e7 == null || (e2 = e7.e()) == null) ? null : e2.getUrl());
                str = null;
            } else {
                str = null;
                pair = new Pair(null, null);
            }
            String str2 = (String) pair.d();
            String str3 = (String) pair.g();
            boolean j4 = l0.j();
            GroupsGroupDonutDto.StatusDto g = l0.g();
            int i2 = g != null ? a.$EnumSwitchMapping$1[g.ordinal()] : -1;
            if (i2 == 1) {
                donutStatus = Donut.DonutStatus.ACTIVE;
            } else if (i2 != 2) {
                donutStatus2 = str;
                BaseLinkButtonActionDto f2 = l0.f();
                donut = new Donut(j4, donutStatus2, str2, str3, f2 == null ? f2.getUrl() : str);
            } else {
                donutStatus = Donut.DonutStatus.EXPIRING;
            }
            donutStatus2 = donutStatus;
            BaseLinkButtonActionDto f22 = l0.f();
            donut = new Donut(j4, donutStatus2, str2, str3, f22 == null ? f22.getUrl() : str);
        } else {
            str = null;
            donut = null;
        }
        GroupsGroupDonutBlockDto v0 = groupsGroupFullDto.v0();
        if (v0 != null) {
            GroupsGroupDonutSubscriptionsDto e8 = v0.e();
            String title3 = e8 != null ? e8.getTitle() : str;
            GroupsGroupDonutGoalsDto d4 = v0.d();
            String title4 = d4 != null ? d4.getTitle() : str;
            lynVar = (title3 == null || title4 == null) ? str : new lyn(title3, title4);
        } else {
            lynVar = str;
        }
        GroupsVideoChannelDataDto Q22 = groupsGroupFullDto.Q2();
        if (Q22 == null || (e = Q22.e()) == null) {
            p7t0Var = str;
        } else {
            Boolean d5 = e.d();
            Boolean bool = Boolean.FALSE;
            boolean z4 = !epx.f(d5, bool);
            boolean z5 = !epx.f(e.e(), bool);
            boolean z6 = !epx.f(e.g(), bool);
            boolean z7 = !epx.f(e.f(), bool) || e.i() == null;
            Integer i3 = e.i();
            p7t0Var = new p7t0(i3 != null ? i3.intValue() : 0, z5, z4, z6, z7);
        }
        GroupsGroupFullAgeMarkDto i4 = groupsGroupFullDto.i();
        Integer valueOf = i4 != null ? Integer.valueOf(i4.i()) : str;
        GroupsWarningNotificationDto i32 = groupsGroupFullDto.i3();
        return new u490(owner, zogVar, l2, intValue, T, j3, l, description, z, videoNotificationsStatus2, U1, a3, z2, a4, z3, linkedHashMap, donut, lynVar, p7t0Var, valueOf, (!fxc0.B().J().o0() || (Q2 = groupsGroupFullDto.Q2()) == null || (d = Q2.d()) == null) ? str : d.d(), i32 != null ? new WarningNotification(i32.getId(), i32.getTitle(), i32.g(), i32.d(), i32.f(), i32.e()) : str);
    }
}
