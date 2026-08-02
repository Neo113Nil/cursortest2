package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.groups.dto.GroupsActionButtonsDto;
import com.vk.api.generated.groups.dto.GroupsAddressesInfoDto;
import com.vk.api.generated.groups.dto.GroupsAllTrustMarksDto;
import com.vk.api.generated.groups.dto.GroupsBanInfoReasonDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutStatisticDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutSubscriptionInfoDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutWallDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutWallWidgetDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendPreviewProfileDto;
import com.vk.api.generated.groups.dto.GroupsGroupFriendsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeLimitsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeMarkDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupLikeItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupVkTicketDto;
import com.vk.api.generated.groups.dto.GroupsMarketAvitoBadgeDto;
import com.vk.api.generated.groups.dto.GroupsMarketInfoDto;
import com.vk.api.generated.groups.dto.GroupsTrustMarksAdminButtonsUrlDto;
import com.vk.api.generated.groups.dto.GroupsTrustMarksItemDto;
import com.vk.api.generated.groups.dto.GroupsTrustMarksListDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.api.generated.users.dto.UsersUserDonatedFriendDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.GroupVkTicketDto;
import com.vk.dto.profile.Donut;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.jqu;

/* compiled from: GroupsGroupFullToGroupMapper.kt */
/* loaded from: classes3.dex */
public final class dqu {

    /* compiled from: GroupsGroupFullToGroupMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupFullDto.LeaveModeDto.values().length];
            try {
                iArr[GroupsGroupFullDto.LeaveModeDto.ADMIN_LEAVE_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupFullDto.LeaveModeDto.ADMIN_LEAVE_OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Group a(GroupsGroupFullDto groupsGroupFullDto) {
        Group.BanInfo banInfo;
        Donut donut;
        GroupMarketInfo groupMarketInfo;
        GroupLikes groupLikes;
        GroupLeaveMode groupLeaveMode;
        List<BaseImageDto> e;
        GroupMarketInfo.MarketAvitoBadge marketAvitoBadge;
        GroupMarketInfo.CommunityTrustMarks communityTrustMarks;
        boolean z;
        GroupsTrustMarksItemDto B;
        GroupsTrustMarksItemDto p;
        GroupsTrustMarksItemDto o;
        GroupsTrustMarksItemDto i;
        GroupsTrustMarksItemDto g;
        GroupsTrustMarksItemDto f;
        GroupsTrustMarksItemDto j;
        GroupsTrustMarksItemDto n;
        GroupsTrustMarksItemDto C;
        GroupsTrustMarksItemDto e2;
        GroupsTrustMarksItemDto l;
        GroupsTrustMarksItemDto u;
        GroupsTrustMarksItemDto k;
        String f2;
        String e3;
        String d;
        GroupsAddressesInfoDto d2;
        GroupsAddressesInfoDto d3;
        GroupMarketInfo.MarketAvitoBadge.Status status;
        Donut.Description description;
        Donut.Widget widget;
        ArrayList arrayList;
        Donut.Description description2;
        ArrayList arrayList2;
        GroupsGroupFriendPreviewProfileDto groupsGroupFriendPreviewProfileDto;
        Group group = new Group();
        group.c = groupsGroupFullDto.P0();
        group.d = groupsGroupFullDto.y1();
        String l2 = groupsGroupFullDto.l2();
        if (l2 == null) {
            l2 = "";
        }
        group.h = l2;
        String e4 = groupsGroupFullDto.e();
        if (e4 == null) {
            e4 = "";
        }
        group.z = e4;
        BaseBoolIntDto o3 = groupsGroupFullDto.o3();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        group.i = o3 == baseBoolIntDto;
        group.j = groupsGroupFullDto.I3() == baseBoolIntDto;
        group.k = groupsGroupFullDto.w3() == baseBoolIntDto;
        GroupsGroupAdminLevelDto f3 = groupsGroupFullDto.f();
        group.s = f3 != null ? f3.i() : 0;
        GroupsGroupIsClosedDto u3 = groupsGroupFullDto.u3();
        group.m = u3 != null ? u3.i() : 0;
        GroupsGroupFullDto.WallDto h3 = groupsGroupFullDto.h3();
        group.n = h3 != null ? h3.i() : 1;
        group.o = groupsGroupFullDto.W();
        group.f = groupsGroupFullDto.V1();
        group.e = zm00.c(groupsGroupFullDto.V1(), groupsGroupFullDto.R1(), groupsGroupFullDto.B1(), groupsGroupFullDto.D1());
        group.g = zm00.a(groupsGroupFullDto.V1(), groupsGroupFullDto.R1(), groupsGroupFullDto.B1(), groupsGroupFullDto.D1(), groupsGroupFullDto.L1());
        group.p = zm00.d(groupsGroupFullDto.L2());
        Integer q2 = groupsGroupFullDto.q2();
        group.q = q2 != null ? q2.intValue() : 0;
        Integer y0 = groupsGroupFullDto.y0();
        group.r = y0 != null ? y0.intValue() : 0;
        group.t = epx.f(groupsGroupFullDto.k(), Boolean.TRUE);
        group.u = groupsGroupFullDto.M3() == baseBoolIntDto;
        Integer o1 = groupsGroupFullDto.o1();
        group.v = o1 != null ? o1.intValue() : 0;
        boolean z2 = groupsGroupFullDto.O2() == baseBoolIntDto;
        VerifyInfo verifyInfo = group.y;
        verifyInfo.b = z2;
        verifyInfo.c = groupsGroupFullDto.I2() == baseBoolIntDto;
        verifyInfo.e = groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.PREMIUM;
        verifyInfo.f = groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.CONFIRMED;
        GroupsGroupFullMemberStatusDto n1 = groupsGroupFullDto.n1();
        group.C = n1 != null ? n1.i() : -1;
        GroupsGroupFriendsDto D0 = groupsGroupFullDto.D0();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (D0 != null) {
            group.w = D0.getCount();
            List<UserId> d4 = D0.d();
            ArrayList arrayList3 = new ArrayList(c5g.u(d4, 10));
            int i2 = 0;
            for (Object obj : d4) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                UserProfile userProfile = new UserProfile();
                userProfile.c = (UserId) obj;
                List<GroupsGroupFriendPreviewProfileDto> e5 = D0.e();
                if (e5 != null && (groupsGroupFriendPreviewProfileDto = e5.get(i2)) != null) {
                    userProfile.d = groupsGroupFriendPreviewProfileDto.d();
                    userProfile.O = zm00.b(16, groupsGroupFriendPreviewProfileDto.i(), groupsGroupFriendPreviewProfileDto.g(), groupsGroupFriendPreviewProfileDto.e(), groupsGroupFriendPreviewProfileDto.f());
                    userProfile.g = groupsGroupFriendPreviewProfileDto.i();
                }
                arrayList3.add(userProfile);
                i2 = i3;
            }
            group.K = p4g.q(arrayList3);
        }
        BaseBoolIntDto R3 = groupsGroupFullDto.R3();
        BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
        group.D = R3 == baseBoolIntDto2;
        group.E = groupsGroupFullDto.C() == baseBoolIntDto2;
        group.F = groupsGroupFullDto.u() == baseBoolIntDto2;
        Boolean N2 = groupsGroupFullDto.N2();
        Boolean bool = Boolean.TRUE;
        group.G = epx.f(N2, bool);
        group.H = epx.f(groupsGroupFullDto.K0(), bool);
        epx.f(groupsGroupFullDto.z3(), bool);
        group.I = groupsGroupFullDto.x1() == baseBoolIntDto2;
        group.B = groupsGroupFullDto.r2();
        GroupsGroupBanInfoDto j2 = groupsGroupFullDto.j();
        if (j2 == null) {
            banInfo = null;
        } else {
            String d5 = j2.d();
            if (d5 == null) {
                d5 = "";
            }
            GroupsBanInfoReasonDto f4 = j2.f();
            int i4 = f4 != null ? f4.i() : 0;
            Integer e6 = j2.e();
            banInfo = new Group.BanInfo(d5, i4, e6 != null ? e6.intValue() : 0);
        }
        group.J = banInfo;
        group.L = new UserId(groupsGroupFullDto.S0() != null ? r1.intValue() : 0L);
        GroupsGroupDonutDto l0 = groupsGroupFullDto.l0();
        if (l0 != null) {
            new ne6();
            boolean j3 = l0.j();
            GroupsGroupDonutDto.StatusDto g2 = l0.g();
            String i5 = g2 != null ? g2.i() : null;
            BaseLinkButtonActionDto f5 = l0.f();
            Action b = f5 != null ? wf6.b(f5) : null;
            GroupsGroupDonutDescriptionDto e7 = l0.e();
            if (e7 != null) {
                if (e7 instanceof GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) {
                    GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto groupsGroupDonutDescriptionLevelsDisabledDto = (GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsDisabledDto) e7;
                    String title = groupsGroupDonutDescriptionLevelsDisabledDto.getTitle();
                    Image a2 = ne6.a(groupsGroupDonutDescriptionLevelsDisabledDto.i());
                    Boolean g3 = groupsGroupDonutDescriptionLevelsDisabledDto.g();
                    boolean booleanValue = g3 != null ? g3.booleanValue() : false;
                    String a3 = cqm0.a(groupsGroupDonutDescriptionLevelsDisabledDto.l());
                    BaseLinkButtonDto d6 = groupsGroupDonutDescriptionLevelsDisabledDto.d();
                    LinkButton w = d6 != null ? wwf0.w(d6) : null;
                    BaseLinkButtonDto e8 = groupsGroupDonutDescriptionLevelsDisabledDto.e();
                    LinkButton w2 = e8 != null ? wwf0.w(e8) : null;
                    List<UsersUserDonatedFriendDto> f6 = groupsGroupDonutDescriptionLevelsDisabledDto.f();
                    if (f6 != null) {
                        List<UsersUserDonatedFriendDto> list = f6;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(cqu.a((UsersUserDonatedFriendDto) it.next()));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = null;
                    }
                    List<GroupsGroupDonutStatisticDto> j4 = groupsGroupDonutDescriptionLevelsDisabledDto.j();
                    ArrayList arrayList5 = new ArrayList(c5g.u(j4, 10));
                    for (GroupsGroupDonutStatisticDto groupsGroupDonutStatisticDto : j4) {
                        String i6 = groupsGroupDonutStatisticDto.e().i();
                        String description3 = groupsGroupDonutStatisticDto.getDescription();
                        Boolean f7 = groupsGroupDonutStatisticDto.f();
                        boolean booleanValue2 = f7 != null ? f7.booleanValue() : false;
                        BaseLinkButtonActionDto d7 = groupsGroupDonutStatisticDto.d();
                        Action b2 = d7 != null ? wf6.b(d7) : null;
                        String r = groupsGroupDonutStatisticDto.r();
                        Integer g4 = groupsGroupDonutStatisticDto.g();
                        arrayList5.add(new Donut.StatsItem(i6, description3, booleanValue2, b2, r, g4 != null ? g4.intValue() : 0));
                    }
                    GroupsGroupDonutSubscriptionInfoDto k2 = groupsGroupDonutDescriptionLevelsDisabledDto.k();
                    description2 = new Donut.Description(title, a2, booleanValue, a3, w, w2, arrayList2, arrayList5, k2 != null ? new Donut.SubscriptionInfo(k2.e(), wwf0.w(k2.d())) : null);
                } else {
                    if (!(e7 instanceof GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsEnabledDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<UsersUserDonatedFriendDto> d8 = ((GroupsGroupDonutDescriptionDto.GroupsGroupDonutDescriptionLevelsEnabledDto) e7).d();
                    if (d8 != null) {
                        List<UsersUserDonatedFriendDto> list2 = d8;
                        ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList6.add(cqu.a((UsersUserDonatedFriendDto) it2.next()));
                        }
                        arrayList = arrayList6;
                    } else {
                        arrayList = null;
                    }
                    description2 = new Donut.Description("", null, false, null, null, null, arrayList, null, null);
                }
                description = description2;
            } else {
                description = null;
            }
            GroupsGroupDonutWallDto i7 = l0.i();
            boolean f8 = i7.f();
            Boolean d9 = i7.d();
            boolean booleanValue3 = d9 != null ? d9.booleanValue() : false;
            GroupsGroupDonutWallWidgetDto e9 = i7.e();
            if (e9 != null) {
                String title2 = e9.getTitle();
                Image a4 = ne6.a(e9.e());
                String f9 = e9.f();
                BaseLinkButtonDto d10 = e9.d();
                widget = new Donut.Widget(title2, a4, f9, d10 != null ? wwf0.w(d10) : null);
            } else {
                widget = null;
            }
            donut = new Donut(j3, i5, b, description, new Donut.WallInfo(f8, booleanValue3, widget), Integer.valueOf(l0.d()));
        } else {
            donut = null;
        }
        group.Q = donut;
        Boolean F0 = groupsGroupFullDto.F0();
        group.b0 = F0 != null ? F0.booleanValue() : false;
        GroupsGroupVkTicketDto f32 = groupsGroupFullDto.f3();
        group.R = f32 != null ? new GroupVkTicketDto(f32.getTitle(), f32.getDescription(), f32.getUrl(), epx.f(f32.d(), Boolean.TRUE)) : null;
        Integer o2 = groupsGroupFullDto.o();
        group.P = (o2 != null ? o2.intValue() : 0) == 1;
        GroupsMarketInfoDto b1 = groupsGroupFullDto.b1();
        int i8 = 3;
        if (b1 != null) {
            Integer e10 = b1.e();
            MarketPriceDto k3 = b1.k();
            Price i9 = k3 != null ? b210.i(k3) : null;
            MarketCurrencyDto f10 = b1.f();
            Integer valueOf = f10 != null ? Integer.valueOf(f10.getId()) : null;
            MarketCurrencyDto f11 = b1.f();
            String d11 = f11 != null ? f11.d() : null;
            String g5 = b1.g();
            GroupsMarketAvitoBadgeDto d12 = b1.d();
            if (d12 != null) {
                BaseImageDto d13 = d12.d();
                Image image = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(d13.getUrl(), d13.getWidth(), d13.getHeight(), d13.e(), (char) 0, false, 48, null)));
                String title3 = d12.getTitle();
                int i10 = jqu.a.$EnumSwitchMapping$0[d12.e().ordinal()];
                if (i10 == 1) {
                    status = GroupMarketInfo.MarketAvitoBadge.Status.ACTIVE;
                } else if (i10 == 2) {
                    status = GroupMarketInfo.MarketAvitoBadge.Status.INACTIVE;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    status = GroupMarketInfo.MarketAvitoBadge.Status.PENDING;
                }
                marketAvitoBadge = new GroupMarketInfo.MarketAvitoBadge(image, title3, status);
            } else {
                marketAvitoBadge = null;
            }
            MarketIntegrationsTypeDto j5 = b1.j();
            String i11 = j5 != null ? j5.i() : null;
            GroupsTrustMarksListDto l3 = b1.l();
            if (l3 != null) {
                GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a5 = jqu.a(l3.f());
                GroupsActionButtonsDto d14 = l3.d();
                boolean f12 = d14 != null ? epx.f(d14.f(), Boolean.TRUE) : false;
                GroupsActionButtonsDto d15 = l3.d();
                boolean f13 = d15 != null ? epx.f(d15.d(), Boolean.TRUE) : false;
                GroupsActionButtonsDto d16 = l3.d();
                boolean f14 = d16 != null ? epx.f(d16.e(), Boolean.TRUE) : false;
                GroupsAllTrustMarksDto g6 = l3.g();
                if ((g6 == null || (d3 = g6.d()) == null) ? false : d3.e()) {
                    GroupsAllTrustMarksDto g7 = l3.g();
                    if (((g7 == null || (d2 = g7.d()) == null) ? null : d2.d()) != null) {
                        z = true;
                        GroupsTrustMarksAdminButtonsUrlDto e11 = l3.e();
                        String str = (e11 != null || (d = e11.d()) == null) ? "" : d;
                        GroupsTrustMarksAdminButtonsUrlDto e12 = l3.e();
                        String str2 = (e12 != null || (e3 = e12.e()) == null) ? "" : e3;
                        GroupsTrustMarksAdminButtonsUrlDto e13 = l3.e();
                        String str3 = (e13 != null || (f2 = e13.f()) == null) ? "" : f2;
                        GroupsAllTrustMarksDto g8 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a6 = (g8 != null || (k = g8.k()) == null) ? null : jqu.a(k);
                        GroupsAllTrustMarksDto g9 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a7 = (g9 != null || (u = g9.u()) == null) ? null : jqu.a(u);
                        GroupsAllTrustMarksDto g10 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a8 = (g10 != null || (l = g10.l()) == null) ? null : jqu.a(l);
                        GroupsAllTrustMarksDto g11 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a9 = (g11 != null || (e2 = g11.e()) == null) ? null : jqu.a(e2);
                        GroupsAllTrustMarksDto g12 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a10 = (g12 != null || (C = g12.C()) == null) ? null : jqu.a(C);
                        GroupsAllTrustMarksDto g13 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a11 = (g13 != null || (n = g13.n()) == null) ? null : jqu.a(n);
                        GroupsAllTrustMarksDto g14 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a12 = (g14 != null || (j = g14.j()) == null) ? null : jqu.a(j);
                        GroupsAllTrustMarksDto g15 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a13 = (g15 != null || (f = g15.f()) == null) ? null : jqu.a(f);
                        GroupsAllTrustMarksDto g16 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a14 = (g16 != null || (g = g16.g()) == null) ? null : jqu.a(g);
                        GroupsAllTrustMarksDto g17 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a15 = (g17 != null || (i = g17.i()) == null) ? null : jqu.a(i);
                        GroupsAllTrustMarksDto g18 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a16 = (g18 != null || (o = g18.o()) == null) ? null : jqu.a(o);
                        GroupsAllTrustMarksDto g19 = l3.g();
                        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark a17 = (g19 != null || (p = g19.p()) == null) ? null : jqu.a(p);
                        GroupsAllTrustMarksDto g20 = l3.g();
                        communityTrustMarks = new GroupMarketInfo.CommunityTrustMarks(a5, f12, f13, f14, z, str, str2, str3, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, (g20 != null || (B = g20.B()) == null) ? null : jqu.a(B), new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark(GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.PHONE, "", "", "", null, 16, null), new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark(GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.LINKS, "", "", "", null, 16, null));
                    }
                }
                z = false;
                GroupsTrustMarksAdminButtonsUrlDto e112 = l3.e();
                if (e112 != null) {
                }
                GroupsTrustMarksAdminButtonsUrlDto e122 = l3.e();
                if (e122 != null) {
                }
                GroupsTrustMarksAdminButtonsUrlDto e132 = l3.e();
                if (e132 != null) {
                }
                GroupsAllTrustMarksDto g82 = l3.g();
                if (g82 != null) {
                }
                GroupsAllTrustMarksDto g92 = l3.g();
                if (g92 != null) {
                }
                GroupsAllTrustMarksDto g102 = l3.g();
                if (g102 != null) {
                }
                GroupsAllTrustMarksDto g112 = l3.g();
                if (g112 != null) {
                }
                GroupsAllTrustMarksDto g122 = l3.g();
                if (g122 != null) {
                }
                GroupsAllTrustMarksDto g132 = l3.g();
                if (g132 != null) {
                }
                GroupsAllTrustMarksDto g142 = l3.g();
                if (g142 != null) {
                }
                GroupsAllTrustMarksDto g152 = l3.g();
                if (g152 != null) {
                }
                GroupsAllTrustMarksDto g162 = l3.g();
                if (g162 != null) {
                }
                GroupsAllTrustMarksDto g172 = l3.g();
                if (g172 != null) {
                }
                GroupsAllTrustMarksDto g182 = l3.g();
                if (g182 != null) {
                }
                GroupsAllTrustMarksDto g192 = l3.g();
                if (g192 != null) {
                }
                GroupsAllTrustMarksDto g202 = l3.g();
                communityTrustMarks = new GroupMarketInfo.CommunityTrustMarks(a5, f12, f13, f14, z, str, str2, str3, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, (g202 != null || (B = g202.B()) == null) ? null : jqu.a(B), new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark(GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.PHONE, "", "", "", null, 16, null), new GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark(GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code.LINKS, "", "", "", null, 16, null));
            } else {
                communityTrustMarks = null;
            }
            groupMarketInfo = new GroupMarketInfo(e10, i9, valueOf, d11, g5, marketAvitoBadge, i11, communityTrustMarks);
        } else {
            groupMarketInfo = null;
        }
        group.S = groupMarketInfo;
        GroupsGroupLikeItemDto V0 = groupsGroupFullDto.V0();
        if (groupsGroupFullDto.D0() != null) {
            groupLikes = new GroupLikes(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i8, objArr4 == true ? 1 : 0);
            GroupsGroupFriendsDto D02 = groupsGroupFullDto.D0();
            if (D02 != null) {
                we7.i(groupLikes, D02.getCount(), D02.d(), D02.e());
            }
        } else if (V0 != null) {
            GroupLikes groupLikes2 = new GroupLikes(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0);
            groupLikes2.b = groupsGroupFullDto.P0();
            groupLikes2.c = V0.J();
            groupLikes2.d = V0.d().getCount();
            we7.i(groupLikes2, V0.d().getCount(), V0.d().d(), null);
            groupLikes = groupLikes2;
        } else {
            groupLikes = null;
        }
        group.T = groupLikes;
        group.g0 = groupsGroupFullDto.U1();
        BaseOwnerCoverDto R = groupsGroupFullDto.R();
        if (R != null && (e = R.e()) != null) {
            if (e.isEmpty()) {
                e = null;
            }
            if (e != null) {
                new ne6();
                group.i0 = ne6.a(e);
                group.h0 = true;
            }
        }
        String s1 = groupsGroupFullDto.s1();
        group.x = s1 != null ? s1 : "";
        Boolean N0 = groupsGroupFullDto.N0();
        Boolean bool2 = Boolean.TRUE;
        group.U = epx.f(N0, bool2);
        group.V = epx.f(groupsGroupFullDto.y3(), bool2);
        group.W = groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.IS_NCO_ORGANIZATION || groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS;
        group.X = groupsGroupFullDto.J2() == GroupsGroupFullDto.TrustMarkDto.NCO_ORGANIZATION_AND_OTHERS;
        group.Y = epx.f(groupsGroupFullDto.t3(), bool2);
        Integer G = groupsGroupFullDto.G();
        group.d0 = G != null ? G.intValue() : 0;
        group.l = epx.f(groupsGroupFullDto.V2(), bool2);
        GroupsGroupFullDto.LeaveModeDto U0 = groupsGroupFullDto.U0();
        if (U0 != null) {
            int i12 = a.$EnumSwitchMapping$0[U0.ordinal()];
            if (i12 == 1) {
                groupLeaveMode = GroupLeaveMode.NO_MODE_ALERT;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                groupLeaveMode = GroupLeaveMode.OPTIONS_SELECTOR;
            }
        } else {
            groupLeaveMode = null;
        }
        group.j0 = groupLeaveMode;
        group.n0 = epx.f(groupsGroupFullDto.N3(), bool2);
        group.m0 = epx.f(groupsGroupFullDto.H0(), bool2);
        GroupsGroupFullDto.VideoNotificationsStatusDto W2 = groupsGroupFullDto.W2();
        group.k0 = W2 != null ? W2.i() : null;
        group.q0 = epx.f(groupsGroupFullDto.G3(), bool2);
        group.r0 = epx.f(groupsGroupFullDto.E3(), bool2);
        group.s0 = epx.f(groupsGroupFullDto.D3(), bool2);
        group.l0 = groupsGroupFullDto.i2();
        group.v0 = epx.f(groupsGroupFullDto.m3(), bool2);
        group.w0 = groupsGroupFullDto.getUrl();
        group.c0 = epx.f(groupsGroupFullDto.p3(), bool2);
        GroupsGroupFullAgeMarkDto i13 = groupsGroupFullDto.i();
        group.e0 = i13 != null ? i13.i() : 0;
        GroupsGroupFullAgeLimitsDto g21 = groupsGroupFullDto.g();
        group.f0 = g21 != null ? g21.i() : 0;
        group.x0 = groupsGroupFullDto.T2();
        List<String> w0 = groupsGroupFullDto.w0();
        group.y0 = w0 != null ? Boolean.valueOf(w0.contains("admin_receive_monetization_payouts")) : Boolean.FALSE;
        group.Z = epx.f(groupsGroupFullDto.r3(), "1");
        group.t0 = epx.f(groupsGroupFullDto.B3(), bool2);
        group.a0 = epx.f(groupsGroupFullDto.G3(), bool2);
        group.p0 = epx.f(groupsGroupFullDto.F3(), bool2);
        group.q0 = epx.f(groupsGroupFullDto.G3(), bool2);
        group.o0 = epx.f(groupsGroupFullDto.B2(), bool2);
        group.u0 = epx.f(groupsGroupFullDto.K(), bool2);
        return group;
    }

    public static LinkedHashMap b(List list) {
        if (list == null) {
            list = EmptyList.b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((GroupsGroupFullDto) it.next()));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((Group) next).c, next);
        }
        return linkedHashMap;
    }
}
