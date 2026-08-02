package xsna;

import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallGetPostPreviewResponseDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: PostPreviewWithInfoRequestFromApi.kt */
/* loaded from: classes4.dex */
public final class w6c0 implements yzs<bv6<AppsGetResponseDto>, ?, bv6<WallGetPostPreviewResponseDto>, v6c0> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r6c0 c;

    public w6c0(boolean z, r6c0 r6c0Var, UserId userId) {
        this.b = z;
        this.c = r6c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v6c0 invoke(bv6<AppsGetResponseDto> bv6Var, Object obj, bv6<WallGetPostPreviewResponseDto> bv6Var2) {
        UsersUserFullDto usersUserFullDto;
        GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto;
        List<GroupsGroupFullDto> d;
        List singletonList;
        List singletonList2;
        bv6<AppsGetResponseDto> bv6Var3 = bv6Var;
        bv6<WallGetPostPreviewResponseDto> bv6Var4 = bv6Var2;
        T t = ((bv6) obj).a;
        boolean z = this.b;
        if (z) {
            List list = t instanceof List ? (List) t : null;
            if (list != null) {
                usersUserFullDto = (UsersUserFullDto) j5g.a0(list);
                GroupsGroupFullDto groupsGroupFullDto = (z || (groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) t) == null || (d = groupsGetByIdObjectResponseDto.d()) == null) ? null : (GroupsGroupFullDto) j5g.a0(d);
                AppsGetResponseDto appsGetResponseDto = bv6Var3.a;
                WallGetPostPreviewResponseDto wallGetPostPreviewResponseDto = bv6Var4.a;
                WallWallItemDto d2 = wallGetPostPreviewResponseDto != null ? wallGetPostPreviewResponseDto.d() : null;
                r6c0 r6c0Var = this.c;
                Owner owner = (Owner) r6c0Var.f.invoke();
                qg3 qg3Var = r6c0Var.b;
                singletonList = usersUserFullDto != null ? Collections.singletonList(usersUserFullDto) : null;
                if (singletonList == null) {
                    singletonList = EmptyList.b;
                }
                singletonList2 = groupsGroupFullDto != null ? Collections.singletonList(groupsGroupFullDto) : null;
                if (singletonList2 == null) {
                    singletonList2 = EmptyList.b;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) qg3Var.invoke(singletonList, singletonList2));
                linkedHashMap.put(owner.b, owner);
                return new v6c0(d2 != null ? (NewsEntry) r6c0Var.c.invoke(d2, linkedHashMap) : null, appsGetResponseDto != null ? (ApiApplication) r6c0Var.a.invoke(appsGetResponseDto) : null, groupsGroupFullDto != null ? new Group((Owner) r6c0Var.d.invoke(groupsGroupFullDto)) : null, usersUserFullDto != null ? new UserProfile((Owner) r6c0Var.e.invoke(usersUserFullDto)) : null);
            }
        }
        usersUserFullDto = null;
        if (z) {
            AppsGetResponseDto appsGetResponseDto2 = bv6Var3.a;
            WallGetPostPreviewResponseDto wallGetPostPreviewResponseDto2 = bv6Var4.a;
            if (wallGetPostPreviewResponseDto2 != null) {
            }
            r6c0 r6c0Var2 = this.c;
            Owner owner2 = (Owner) r6c0Var2.f.invoke();
            qg3 qg3Var2 = r6c0Var2.b;
            if (usersUserFullDto != null) {
            }
            if (singletonList == null) {
            }
            if (groupsGroupFullDto != null) {
            }
            if (singletonList2 == null) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) qg3Var2.invoke(singletonList, singletonList2));
            linkedHashMap2.put(owner2.b, owner2);
            if (appsGetResponseDto2 != null) {
            }
            if (groupsGroupFullDto != null) {
            }
            if (usersUserFullDto != null) {
            }
            return new v6c0(d2 != null ? (NewsEntry) r6c0Var2.c.invoke(d2, linkedHashMap2) : null, appsGetResponseDto2 != null ? (ApiApplication) r6c0Var2.a.invoke(appsGetResponseDto2) : null, groupsGroupFullDto != null ? new Group((Owner) r6c0Var2.d.invoke(groupsGroupFullDto)) : null, usersUserFullDto != null ? new UserProfile((Owner) r6c0Var2.e.invoke(usersUserFullDto)) : null);
        }
        AppsGetResponseDto appsGetResponseDto22 = bv6Var3.a;
        WallGetPostPreviewResponseDto wallGetPostPreviewResponseDto22 = bv6Var4.a;
        if (wallGetPostPreviewResponseDto22 != null) {
        }
        r6c0 r6c0Var22 = this.c;
        Owner owner22 = (Owner) r6c0Var22.f.invoke();
        qg3 qg3Var22 = r6c0Var22.b;
        if (usersUserFullDto != null) {
        }
        if (singletonList == null) {
        }
        if (groupsGroupFullDto != null) {
        }
        if (singletonList2 == null) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap((Map) qg3Var22.invoke(singletonList, singletonList2));
        linkedHashMap22.put(owner22.b, owner22);
        if (appsGetResponseDto22 != null) {
        }
        if (groupsGroupFullDto != null) {
        }
        if (usersUserFullDto != null) {
        }
        return new v6c0(d2 != null ? (NewsEntry) r6c0Var22.c.invoke(d2, linkedHashMap22) : null, appsGetResponseDto22 != null ? (ApiApplication) r6c0Var22.a.invoke(appsGetResponseDto22) : null, groupsGroupFullDto != null ? new Group((Owner) r6c0Var22.d.invoke(groupsGroupFullDto)) : null, usersUserFullDto != null ? new UserProfile((Owner) r6c0Var22.e.invoke(usersUserFullDto)) : null);
    }
}
