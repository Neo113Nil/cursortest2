package xsna;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsMenuDto;
import com.vk.api.generated.groups.dto.GroupsMenuItemDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oo1 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oo1(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        this.d = extendedCommunityProfile;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        z4h z4hVar;
        GroupsGroupFullDto groupsGroupFullDto;
        GroupsMenuDto t1;
        ?? r6;
        z4h.a aVar;
        String str;
        String str2;
        List<String> pathSegments;
        String str3;
        Image image;
        switch (this.b) {
            case 0:
                ro1 ro1Var = (ro1) this.d;
                if (!this.c) {
                    PickerRecyclerPaginatedView pickerRecyclerPaginatedView = ro1Var.b.T;
                    if (pickerRecyclerPaginatedView == null) {
                        pickerRecyclerPaginatedView = null;
                    }
                    pickerRecyclerPaginatedView.fj(null, null);
                }
                return s3q0.a;
            default:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.d;
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) == null || (t1 = groupsGroupFullDto.t1()) == null) {
                    z4hVar = null;
                } else {
                    List<GroupsMenuItemDto> e = t1.e();
                    if (e != null) {
                        r6 = new ArrayList();
                        for (GroupsMenuItemDto groupsMenuItemDto : e) {
                            if (groupsMenuItemDto.e() != null) {
                                CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType = epx.f(groupsMenuItemDto.f().i(), MBridgeConstans.DYNAMIC_VIEW_WX_APP) ? CommunityInternalMenu$Companion$MenuItemType.BUSINESS_APP : CommunityInternalMenu$Companion$MenuItemType.REGULAR;
                                String obj2 = drm0.p0(groupsMenuItemDto.getUrl()).toString();
                                if (epx.f(groupsMenuItemDto.f().i(), MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                                    try {
                                        pathSegments = Uri.parse(obj2).getPathSegments();
                                    } catch (Exception e2) {
                                        com.vk.metrics.eventtracking.b.a.a(e2);
                                    }
                                    if (pathSegments != null) {
                                        ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
                                        while (true) {
                                            if (listIterator.hasPrevious()) {
                                                str3 = listIterator.previous();
                                                if (brm0.B(str3, MBridgeConstans.DYNAMIC_VIEW_WX_APP, false)) {
                                                }
                                            } else {
                                                str3 = null;
                                            }
                                        }
                                        String str4 = str3;
                                        if (str4 != null) {
                                            str = drm0.U(str4, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                            str2 = str;
                                        }
                                    }
                                    str = null;
                                    str2 = str;
                                } else {
                                    str2 = null;
                                }
                                List<BaseImageDto> d2 = groupsMenuItemDto.d();
                                if (d2 != null) {
                                    List D0 = j5g.D0(new y4h(0), d2);
                                    if (D0 != null) {
                                        List<BaseImageDto> list = D0;
                                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                        for (BaseImageDto baseImageDto : list) {
                                            arrayList.add(new ImageSize(new com.vk.dto.common.im.Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)), (char) 0, false, 6, (zcl) null));
                                        }
                                        if (arrayList.isEmpty()) {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            image = new Image(arrayList);
                                            aVar = new z4h.a(groupsMenuItemDto.e().intValue(), groupsMenuItemDto.f().i(), groupsMenuItemDto.getTitle(), obj2, image, 0, communityInternalMenu$Companion$MenuItemType, epx.f(groupsMenuItemDto.g(), Boolean.TRUE), str2);
                                        }
                                    }
                                }
                                image = null;
                                aVar = new z4h.a(groupsMenuItemDto.e().intValue(), groupsMenuItemDto.f().i(), groupsMenuItemDto.getTitle(), obj2, image, 0, communityInternalMenu$Companion$MenuItemType, epx.f(groupsMenuItemDto.g(), Boolean.TRUE), str2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                r6.add(aVar);
                            }
                        }
                    } else {
                        r6 = EmptyList.b;
                    }
                    Boolean g = t1.g();
                    Boolean bool = Boolean.TRUE;
                    z4h z4hVar2 = new z4h(r6, epx.f(g, bool), epx.f(t1.d(), bool), t1.f());
                    if (this.c) {
                        Collection collection = (Collection) r6;
                        if (!collection.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList(collection);
                            arrayList2.add(0, new z4h.a(0, "", (String) null, (String) null, (Image) null, 0, CommunityInternalMenu$Companion$MenuItemType.ADMIN_GEAR, false, 384));
                            z4hVar = z4h.a(z4hVar2, arrayList2, 14);
                        }
                    }
                    z4hVar = z4hVar2;
                }
                extendedCommunityProfile.g2 = z4hVar;
                return new ptk(extendedCommunityProfile, false);
        }
    }

    public /* synthetic */ oo1(boolean z, ro1 ro1Var) {
        this.c = z;
        this.d = ro1Var;
    }
}
