package xsna;

import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.api.generated.donut.dto.DonutPostingSettingsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoAddressDetailsDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeocodingItemDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeocodingResponseDto;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallAttachmentsListAttachmentActionButtonDto;
import com.vk.api.generated.wall.dto.WallGetPostingSettingsResponseDto;
import com.vk.api.generated.wall.dto.WallPostingRuleActionButtonAttachmentDependenciesDto;
import com.vk.api.generated.wall.dto.WallPostingRuleAttachmentAnyDependencyDto;
import com.vk.api.generated.wall.dto.WallPostingRuleAttachmentDependenciesDto;
import com.vk.api.generated.wall.dto.WallPostingRuleMediaSizeRestrictionDto;
import com.vk.api.generated.wall.dto.WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto;
import com.vk.api.generated.wall.dto.WallPostingRuleRestrictAttachmentsCombinationDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsAttachmentsAudioDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsAttachmentsDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsAttachmentsGeoDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsCurrentUserDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsPostDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsRuleDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsWallDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsWallGroupDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsWallUserDto;
import com.vk.api.generated.wall.dto.WallUserWallStatusDto;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.log.L;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.domain.rules.api.ActionButtonAttachmentRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.DependencyAllRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.DependencyAnyRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.MediaViewModeRestrictionsRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.RestrictCombinationRule;
import com.vk.newsfeed.posting.impl.domain.rules.api.RestrictMediaSizeRule;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CurrentUser;
import com.vk.newsfeed.posting.impl.presentation.model.GroupAdminLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallStatus;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingRules;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.sessionrooms.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.j3j0;
import xsna.rwi0;
import xsna.urg0;
import xsna.wwi0;
import xsna.xn50;

/* compiled from: AboutAppFragment.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class q1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        WebImage webImage;
        ?? r9;
        int i4;
        ?? r4;
        ?? r12;
        ?? r13;
        GroupWallPostingSettings groupWallPostingSettings;
        ActionButton actionButton;
        List a;
        List<DonutLevelDto> f;
        String str4;
        Boolean e;
        WallPostingSettingsAttachmentsGeoDto j;
        String e2;
        Boolean d;
        List<DonutLevelDto> f2;
        WallAttachmentsListAttachmentActionButtonDto d2;
        Object obj2;
        WallPostingSettingsWallGroupDto d3;
        GroupPrivacyType groupPrivacyType;
        GroupWallStatus groupWallStatus;
        GroupAdminLevel groupAdminLevel;
        GroupAdminLevel groupAdminLevel2;
        WallPostingSettingsWallUserDto e3;
        WallPostingSettingsWallGroupDto d4;
        List<WallAttachmentsActionButtonDto> i5;
        List<WallAttachmentsActionButtonDto> g;
        List<WallAttachmentsActionButtonDto> e4;
        WallPostingSettingsAttachmentsAudioDto f3;
        WallPostingRuleActionButtonAttachmentDependenciesDto d5;
        Object obj3;
        Parcelable actionButtonAttachmentRule;
        String str5;
        PhotoVideoDisplayMode photoVideoDisplayMode;
        RuleAttachment a2;
        Parcelable dependencyAnyRule;
        RuleAttachment a3;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.receiver;
                aboutAppFragment.getClass();
                xn50.a.c(aboutAppFragment, (u0) obj);
                return s3q0.a;
            case 1:
                ArchiveFragment archiveFragment = (ArchiveFragment) this.receiver;
                archiveFragment.getClass();
                xn50.a.c(archiveFragment, (ig3) obj);
                return s3q0.a;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 3:
                ((mlu) this.receiver).getClass();
                List<GroupsGroupFullDto> d6 = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d6 == null) {
                    throw new IllegalArgumentException("There isn't group in response");
                }
                List<GroupsGroupFullDto> list = d6;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : list) {
                    WebGroup a4 = mlu.a(groupsGroupFullDto);
                    String l2 = groupsGroupFullDto.l2();
                    if (l2 == null) {
                        l2 = "";
                    }
                    GroupsGroupIsClosedDto u3 = groupsGroupFullDto.u3();
                    int i6 = u3 != null ? u3.i() : 0;
                    GroupsGroupTypeDto L2 = groupsGroupFullDto.L2();
                    if (L2 == null || (str = L2.i()) == null) {
                        str = "";
                    }
                    BaseBoolIntDto I3 = groupsGroupFullDto.I3();
                    int i7 = I3 != null ? I3.i() : 0;
                    String description = groupsGroupFullDto.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    Integer o1 = groupsGroupFullDto.o1();
                    int intValue = o1 != null ? o1.intValue() : 0;
                    String V1 = groupsGroupFullDto.V1();
                    if (V1 != null) {
                        WebImage.CREATOR.getClass();
                        int i8 = i7;
                        i = intValue;
                        i2 = i8;
                        i3 = i6;
                        str2 = str;
                        str3 = description;
                        webImage = WebImage.a.c(V1);
                    } else {
                        String R1 = groupsGroupFullDto.R1();
                        WebImageSize webImageSize = new WebImageSize(R1 == null ? "" : R1, 50, 50, (char) 0, false, null, 56, null);
                        String B1 = groupsGroupFullDto.B1();
                        WebImageSize webImageSize2 = new WebImageSize(B1 == null ? "" : B1, 100, 100, (char) 0, false, null, 56, null);
                        String D1 = groupsGroupFullDto.D1();
                        int i9 = i7;
                        i = intValue;
                        i2 = i9;
                        i3 = i6;
                        str2 = str;
                        str3 = description;
                        webImage = new WebImage((List<WebImageSize>) e43.l(webImageSize, webImageSize2, new WebImageSize(D1 == null ? "" : D1, 200, 200, (char) 0, false, null, 56, null)));
                    }
                    arrayList.add(new WebGroupShortInfo(a4, l2, i3, str2, i2, str3, i, webImage));
                }
                return arrayList;
            case 4:
                ((bn90) this.receiver).T((dn90) obj);
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                rwi0 rwi0Var = (rwi0) obj;
                ((com.vk.voip.ui.sessionrooms.d) this.receiver).getClass();
                if (rwi0Var instanceof rwi0.b) {
                    if (!(((rwi0.b) rwi0Var) instanceof rwi0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwi0.b.a aVar = (rwi0.b.a) rwi0Var;
                    return new e.b.a(aVar.a, aVar.b);
                }
                if (rwi0Var instanceof rwi0.a) {
                    rwi0.a aVar2 = (rwi0.a) rwi0Var;
                    if (aVar2 instanceof rwi0.a.e) {
                        return e.a.C2079e.a;
                    }
                    if (aVar2 instanceof rwi0.a.d) {
                        return e.a.d.a;
                    }
                    if (aVar2 instanceof rwi0.a.f) {
                        return e.a.b.a;
                    }
                    if (aVar2 instanceof rwi0.a.c) {
                        return e.a.f.a;
                    }
                    if (aVar2 instanceof rwi0.a.C3639a) {
                        rwi0.a.C3639a c3639a = (rwi0.a.C3639a) rwi0Var;
                        return new e.a.C2078a(c3639a.a, c3639a.b, c3639a.c);
                    }
                    if (aVar2 instanceof rwi0.a.b) {
                        return new e.a.c(((rwi0.a.b) rwi0Var).a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(rwi0Var instanceof rwi0.c)) {
                    if (!(rwi0Var instanceof rwi0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((rwi0.d) rwi0Var) instanceof rwi0.d.a) {
                        return e.d.a.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                rwi0.c cVar = (rwi0.c) rwi0Var;
                if (cVar instanceof rwi0.c.g) {
                    wwi0.c.C3962c c3962c = ((rwi0.c.g) rwi0Var).a;
                    return new e.c.g(c3962c.a, c3962c.b);
                }
                if (cVar instanceof rwi0.c.d) {
                    return e.c.d.a;
                }
                if (cVar instanceof rwi0.c.C3640c) {
                    return e.c.a.a;
                }
                if (cVar instanceof rwi0.c.b) {
                    return e.c.C2080c.a;
                }
                if (cVar instanceof rwi0.c.a) {
                    return e.c.b.a;
                }
                if (cVar instanceof rwi0.c.e) {
                    return e.c.C2081e.a;
                }
                if (cVar instanceof rwi0.c.f) {
                    return new e.c.f(((rwi0.c.f) rwi0Var).a);
                }
                if (cVar instanceof rwi0.c.h) {
                    return new e.c.h(((rwi0.c.h) rwi0Var).a);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                WallGetPostingSettingsResponseDto wallGetPostingSettingsResponseDto = (WallGetPostingSettingsResponseDto) obj;
                j3j0 j3j0Var = (j3j0) this.receiver;
                PostingPollSettings postingPollSettings = j3j0Var.a;
                List<WallPostingSettingsRuleDto> i10 = wallGetPostingSettingsResponseDto.i();
                String str6 = "";
                if (i10 != null) {
                    r9 = new ArrayList();
                    for (WallPostingSettingsRuleDto wallPostingSettingsRuleDto : i10) {
                        String lowerCase = String.valueOf(wallPostingSettingsRuleDto.getType()).toLowerCase(Locale.ROOT);
                        if (lowerCase.equals("restrict_attachments_combination")) {
                            WallPostingRuleRestrictAttachmentsCombinationDto j2 = wallPostingSettingsRuleDto.j();
                            if (j2 != null) {
                                List<String> d7 = j2.d();
                                ArrayList arrayList2 = new ArrayList(c5g.u(d7, 10));
                                Iterator it = d7.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(urg0.a((String) it.next()));
                                }
                                if (!arrayList2.isEmpty()) {
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        if (((RuleAttachment) it2.next()) == null) {
                                        }
                                    }
                                }
                                actionButtonAttachmentRule = new RestrictCombinationRule(j5g.S0(j5g.V(arrayList2)), j2.e());
                            }
                            actionButtonAttachmentRule = null;
                        } else if (lowerCase.equals("attachment_dependencies")) {
                            WallPostingRuleAttachmentDependenciesDto f4 = wallPostingSettingsRuleDto.f();
                            if (f4 != null && (a3 = urg0.a(f4.d())) != null) {
                                List<String> e5 = f4.e();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = e5.iterator();
                                while (it3.hasNext()) {
                                    RuleAttachment a5 = urg0.a((String) it3.next());
                                    if (a5 != null) {
                                        arrayList3.add(a5);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    dependencyAnyRule = new DependencyAllRule(a3, j5g.S0(arrayList3), f4.f());
                                    actionButtonAttachmentRule = dependencyAnyRule;
                                }
                            }
                            actionButtonAttachmentRule = null;
                        } else {
                            if (lowerCase.equals("attachment_any_dependency")) {
                                WallPostingRuleAttachmentAnyDependencyDto e6 = wallPostingSettingsRuleDto.e();
                                if (e6 != null && (a2 = urg0.a(e6.d())) != null) {
                                    List<String> e7 = e6.e();
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = e7.iterator();
                                    while (it4.hasNext()) {
                                        RuleAttachment a6 = urg0.a((String) it4.next());
                                        if (a6 != null) {
                                            arrayList4.add(a6);
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        dependencyAnyRule = new DependencyAnyRule(a2, j5g.S0(arrayList4), e6.f());
                                        actionButtonAttachmentRule = dependencyAnyRule;
                                    }
                                }
                            } else if (lowerCase.equals("primary_attachments_mode_restricted_attachments")) {
                                WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto i11 = wallPostingSettingsRuleDto.i();
                                if (i11 != null) {
                                    int i12 = urg0.a.$EnumSwitchMapping$0[i11.g().ordinal()];
                                    if (i12 == 1) {
                                        photoVideoDisplayMode = PhotoVideoDisplayMode.Grid;
                                    } else if (i12 == 2) {
                                        photoVideoDisplayMode = PhotoVideoDisplayMode.Carousel;
                                    }
                                    PhotoVideoDisplayMode photoVideoDisplayMode2 = photoVideoDisplayMode;
                                    List<String> d8 = i11.d();
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = d8.iterator();
                                    while (it5.hasNext()) {
                                        RuleAttachment a7 = urg0.a((String) it5.next());
                                        if (a7 != null) {
                                            arrayList5.add(a7);
                                        }
                                    }
                                    actionButtonAttachmentRule = new MediaViewModeRestrictionsRule(photoVideoDisplayMode2, j5g.S0(arrayList5), i11.e(), i11.f().getTitle(), i11.f().e(), i11.f().d());
                                }
                            } else if (lowerCase.equals("media_size_restriction")) {
                                WallPostingRuleMediaSizeRestrictionDto g2 = wallPostingSettingsRuleDto.g();
                                if (g2 == null || (str5 = g2.e()) == null) {
                                    str5 = "";
                                }
                                RuleAttachment a8 = urg0.a(str5);
                                Float d9 = g2 != null ? g2.d() : null;
                                Float f5 = g2 != null ? g2.f() : null;
                                Integer g3 = g2 != null ? g2.g() : null;
                                if (a8 != null && d9 != null && f5 != null && g3 != null) {
                                    actionButtonAttachmentRule = new RestrictMediaSizeRule(a8, d9.floatValue(), f5.floatValue(), g3.intValue());
                                }
                            } else if (lowerCase.equals("action_button_attachment_dependencies") && (d5 = wallPostingSettingsRuleDto.d()) != null) {
                                Iterator it6 = WallActionButtonTypeDto.i().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj3 = it6.next();
                                        if (epx.f(((WallActionButtonTypeDto) obj3).j(), d5.d())) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                WallActionButtonTypeDto wallActionButtonTypeDto = (WallActionButtonTypeDto) obj3;
                                if (wallActionButtonTypeDto != null) {
                                    List<String> e8 = d5.e();
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it7 = e8.iterator();
                                    while (it7.hasNext()) {
                                        RuleAttachment a9 = urg0.a((String) it7.next());
                                        if (a9 != null) {
                                            arrayList6.add(a9);
                                        }
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        actionButtonAttachmentRule = new ActionButtonAttachmentRule(wallActionButtonTypeDto, j5g.S0(arrayList6), d5.f());
                                    }
                                }
                            }
                            actionButtonAttachmentRule = null;
                        }
                        if (actionButtonAttachmentRule != null) {
                            r9.add(actionButtonAttachmentRule);
                        }
                    }
                } else {
                    r9 = EmptyList.b;
                }
                DonutPostingSettingsDto f6 = wallGetPostingSettingsResponseDto.f();
                boolean z = false;
                boolean f7 = f6 != null ? epx.f(f6.g(), Boolean.TRUE) : false;
                WallPostingSettingsAttachmentsDto d10 = wallGetPostingSettingsResponseDto.d();
                if (d10 == null || (f3 = d10.f()) == null) {
                    i4 = 1;
                } else {
                    int d11 = f3.d();
                    if (d11 < 1) {
                        d11 = 1;
                    }
                    i4 = d11;
                }
                WallPostingSettingsAttachmentsDto d12 = wallGetPostingSettingsResponseDto.d();
                boolean z2 = (d12 != null ? d12.f() : null) != null;
                WallPostingSettingsAttachmentsDto d13 = wallGetPostingSettingsResponseDto.d();
                if (d13 == null || (e4 = d13.e()) == null) {
                    r4 = EmptyList.b;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj4 : e4) {
                        if (((WallAttachmentsActionButtonDto) obj4).f() != WallActionButtonTypeDto.BUY_TICKET) {
                            arrayList7.add(obj4);
                        }
                    }
                    r4 = new ArrayList();
                    Iterator it8 = arrayList7.iterator();
                    while (it8.hasNext()) {
                        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = (WallAttachmentsActionButtonDto) it8.next();
                        if (drm0.N(wallAttachmentsActionButtonDto.getTitle())) {
                            wallAttachmentsActionButtonDto = null;
                        }
                        ActionButton actionButton2 = wallAttachmentsActionButtonDto != null ? new ActionButton(wallAttachmentsActionButtonDto, null, 2, null) : null;
                        if (actionButton2 != null) {
                            r4.add(actionButton2);
                        }
                    }
                }
                WallPostingSettingsAttachmentsDto d14 = wallGetPostingSettingsResponseDto.d();
                if (d14 == null || (g = d14.g()) == null) {
                    r12 = EmptyList.b;
                } else {
                    r12 = new ArrayList();
                    for (WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto2 : g) {
                        if (drm0.N(wallAttachmentsActionButtonDto2.getTitle())) {
                            wallAttachmentsActionButtonDto2 = null;
                        }
                        ActionButton actionButton3 = wallAttachmentsActionButtonDto2 != null ? new ActionButton(wallAttachmentsActionButtonDto2, null, 2, null) : null;
                        if (actionButton3 != null) {
                            r12.add(actionButton3);
                        }
                    }
                }
                WallPostingSettingsAttachmentsDto d15 = wallGetPostingSettingsResponseDto.d();
                if (d15 == null || (i5 = d15.i()) == null) {
                    r13 = EmptyList.b;
                } else {
                    r13 = new ArrayList();
                    for (WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto3 : i5) {
                        if (drm0.N(wallAttachmentsActionButtonDto3.getTitle())) {
                            wallAttachmentsActionButtonDto3 = null;
                        }
                        ActionButton actionButton4 = wallAttachmentsActionButtonDto3 != null ? new ActionButton(wallAttachmentsActionButtonDto3, null, 2, null) : null;
                        if (actionButton4 != null) {
                            r13.add(actionButton4);
                        }
                    }
                }
                ArrayList u0 = j5g.u0((Iterable) r13, j5g.u0((Iterable) r12, (Collection) r4));
                Integer f8 = wallGetPostingSettingsResponseDto.j().f();
                int intValue2 = f8 != null ? f8.intValue() : postingPollSettings.b;
                Integer d16 = wallGetPostingSettingsResponseDto.j().d();
                int intValue3 = d16 != null ? d16.intValue() : postingPollSettings.c;
                Integer e9 = wallGetPostingSettingsResponseDto.j().e();
                PostingPollSettings postingPollSettings2 = new PostingPollSettings(intValue2, intValue3, e9 != null ? e9.intValue() : postingPollSettings.d);
                WallPostingSettingsWallDto k = wallGetPostingSettingsResponseDto.k();
                boolean i13 = (k == null || (d4 = k.d()) == null) ? false : d4.i();
                PostingRules postingRules = new PostingRules(j5g.u0(j3j0Var.b, (Collection) r9));
                SettingsPriority settingsPriority = SettingsPriority.Network;
                WallPostingSettingsWallDto k2 = wallGetPostingSettingsResponseDto.k();
                UserWallPostingSettings userWallPostingSettings = (k2 == null || (e3 = k2.e()) == null) ? null : new UserWallPostingSettings(e3.e(), e3.d() == WallUserWallStatusDto.WITH_WALL_REPLIES);
                WallPostingSettingsWallDto k3 = wallGetPostingSettingsResponseDto.k();
                if (k3 == null || (d3 = k3.d()) == null) {
                    groupWallPostingSettings = null;
                } else {
                    int i14 = j3j0.a.$EnumSwitchMapping$0[d3.f().ordinal()];
                    if (i14 == 1) {
                        groupPrivacyType = GroupPrivacyType.OPEN;
                    } else if (i14 == 2) {
                        groupPrivacyType = GroupPrivacyType.CLOSED;
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        groupPrivacyType = GroupPrivacyType.PRIVATE;
                    }
                    GroupPrivacyType groupPrivacyType2 = groupPrivacyType;
                    int i15 = j3j0.a.$EnumSwitchMapping$1[d3.g().ordinal()];
                    if (i15 == 1) {
                        groupWallStatus = GroupWallStatus.DISABLED;
                    } else if (i15 == 2) {
                        groupWallStatus = GroupWallStatus.OPEN;
                    } else if (i15 == 3) {
                        groupWallStatus = GroupWallStatus.LIMITED;
                    } else {
                        if (i15 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        groupWallStatus = GroupWallStatus.RESTRICTED;
                    }
                    GroupWallStatus groupWallStatus2 = groupWallStatus;
                    GroupsGroupAdminLevelDto d17 = d3.d();
                    int i16 = d17 == null ? -1 : j3j0.a.$EnumSwitchMapping$2[d17.ordinal()];
                    if (i16 != -1) {
                        if (i16 == 1) {
                            groupAdminLevel2 = GroupAdminLevel.MODERATOR;
                        } else if (i16 == 2) {
                            groupAdminLevel2 = GroupAdminLevel.EDITOR;
                        } else {
                            if (i16 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            groupAdminLevel2 = GroupAdminLevel.ADMINISTRATOR;
                        }
                        groupAdminLevel = groupAdminLevel2;
                    } else {
                        groupAdminLevel = null;
                    }
                    groupWallPostingSettings = new GroupWallPostingSettings(d3.i(), groupPrivacyType2, groupWallStatus2, groupAdminLevel, d3.e());
                }
                WallPostingSettingsAttachmentsDto d18 = wallGetPostingSettingsResponseDto.d();
                if (d18 == null || (d2 = d18.d()) == null) {
                    actionButton = null;
                } else {
                    Iterator it9 = u0.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj2 = it9.next();
                            WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto4 = ((ActionButton) obj2).b;
                            if (wallAttachmentsActionButtonDto4.f() == d2.f()) {
                                WallActionButtonGoalDto d19 = wallAttachmentsActionButtonDto4.d();
                                Integer valueOf = d19 != null ? Integer.valueOf(d19.d()) : null;
                                WallActionButtonGoalDto d20 = d2.d();
                                if (epx.f(valueOf, d20 != null ? Integer.valueOf(d20.d()) : null)) {
                                    WallActionButtonLevelDto e10 = wallAttachmentsActionButtonDto4.e();
                                    Integer valueOf2 = e10 != null ? Integer.valueOf(e10.d()) : null;
                                    WallActionButtonLevelDto e11 = d2.e();
                                    if (epx.f(valueOf2, e11 != null ? Integer.valueOf(e11.d()) : null)) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    actionButton = (ActionButton) obj2;
                }
                LoadingState loadingState = LoadingState.FINISHED;
                WallPostingSettingsPostDto g4 = wallGetPostingSettingsResponseDto.g();
                int d21 = g4 != null ? g4.d() : 4000;
                if (!j3j0Var.d) {
                    DonutPostingSettingsDto f9 = wallGetPostingSettingsResponseDto.f();
                    a = (f9 == null || (f = f9.f()) == null) ? EmptyList.b : j3j0.a(f);
                } else if (f7) {
                    DonutPostingSettingsDto f10 = wallGetPostingSettingsResponseDto.f();
                    a = (f10 == null || (f2 = f10.f()) == null) ? EmptyList.b : j3j0.a(f2);
                } else {
                    a = EmptyList.b;
                }
                List list2 = a;
                DonutPostingSettingsDto f11 = wallGetPostingSettingsResponseDto.f();
                String e12 = f11 != null ? f11.e() : null;
                DonutPostingSettingsDto f12 = wallGetPostingSettingsResponseDto.f();
                boolean booleanValue = (f12 == null || (d = f12.d()) == null) ? true : d.booleanValue();
                WallPostingSettingsCurrentUserDto e13 = wallGetPostingSettingsResponseDto.e();
                if (e13 == null || (str4 = e13.d()) == null) {
                    str4 = "";
                }
                WallPostingSettingsCurrentUserDto e14 = wallGetPostingSettingsResponseDto.e();
                if (e14 != null && (e2 = e14.e()) != null) {
                    str6 = e2;
                }
                CurrentUser currentUser = new CurrentUser(str4, str6);
                WallPostingSettingsAttachmentsDto d22 = wallGetPostingSettingsResponseDto.d();
                int d23 = (d22 == null || (j = d22.j()) == null) ? j3j0Var.c.r : j.d();
                WallPostingSettingsPostDto g5 = wallGetPostingSettingsResponseDto.g();
                if (g5 != null && (e = g5.e()) != null) {
                    z = e.booleanValue();
                }
                boolean z3 = !z;
                WallPostingSettingsAttachmentsDto d24 = wallGetPostingSettingsResponseDto.d();
                return new PostingSettings(postingPollSettings2, 10, postingRules, settingsPriority, i13, userWallPostingSettings, groupWallPostingSettings, u0, actionButton, loadingState, d21, f7, booleanValue, list2, e12, currentUser, d23, i4, z2, z3, epx.f(d24 != null ? Boolean.valueOf(d24.k()) : null, Boolean.TRUE));
            default:
                ((vwu0) this.receiver).getClass();
                List<VkMapsGeocodingItemDto> d25 = ((VkMapsGeocodingResponseDto) obj).d();
                ArrayList arrayList8 = new ArrayList(c5g.u(d25, 10));
                for (VkMapsGeocodingItemDto vkMapsGeocodingItemDto : d25) {
                    String d26 = vkMapsGeocodingItemDto.d();
                    if (d26 == null) {
                        throw new IllegalStateException("No address in vk geocoder response");
                    }
                    List<Float> f13 = vkMapsGeocodingItemDto.f();
                    if (f13 == null) {
                        throw new IllegalStateException("No coordinates in vk geocoder response");
                    }
                    double floatValue = f13.get(0).floatValue();
                    if (vkMapsGeocodingItemDto.f() == null) {
                        throw new IllegalStateException("No coordinates in vk geocoder response");
                    }
                    Coordinates coordinates = new Coordinates(floatValue, r7.get(1).floatValue());
                    VkMapsGeoAddressDetailsDto e15 = vkMapsGeocodingItemDto.e();
                    String str7 = null;
                    String e16 = e15 != null ? e15.e() : null;
                    VkMapsGeoAddressDetailsDto e17 = vkMapsGeocodingItemDto.e();
                    String k4 = e17 != null ? e17.k() : null;
                    VkMapsGeoAddressDetailsDto e18 = vkMapsGeocodingItemDto.e();
                    String l = e18 != null ? e18.l() : null;
                    VkMapsGeoAddressDetailsDto e19 = vkMapsGeocodingItemDto.e();
                    String g6 = e19 != null ? e19.g() : null;
                    VkMapsGeoAddressDetailsDto e20 = vkMapsGeocodingItemDto.e();
                    String j3 = e20 != null ? e20.j() : null;
                    VkMapsGeoAddressDetailsDto e21 = vkMapsGeocodingItemDto.e();
                    String d27 = e21 != null ? e21.d() : null;
                    VkMapsGeoAddressDetailsDto e22 = vkMapsGeocodingItemDto.e();
                    String i17 = e22 != null ? e22.i() : null;
                    VkMapsGeoAddressDetailsDto e23 = vkMapsGeocodingItemDto.e();
                    if (e23 != null) {
                        str7 = e23.f();
                    }
                    arrayList8.add(new d03(d26, coordinates, e16, k4, l, g6, j3, d27, i17, str7));
                }
                return new qnt(arrayList8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(ArchiveFragment archiveFragment) {
        super(1, archiveFragment, ArchiveFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.vk.voip.ui.sessionrooms.d dVar) {
        super(1, dVar, com.vk.voip.ui.sessionrooms.d.class, "mapFeatureNotificationsToRoomEvents", "mapFeatureNotificationsToRoomEvents(Lcom/vk/voip/ui/sessionrooms/feature/SessionRoomsFeatureNotification;)Lcom/vk/voip/ui/sessionrooms/SessionRoomsEvent;", 0);
        this.b = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, j3j0.class, "mapResponseToSettings", "mapResponseToSettings(Lcom/vk/api/generated/wall/dto/WallGetPostingSettingsResponseDto;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingSettings;", 0);
                break;
            default:
                break;
        }
    }
}
