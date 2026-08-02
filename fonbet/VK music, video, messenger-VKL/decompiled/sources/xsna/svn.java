package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;

/* compiled from: DomainResolvedWithDataToExecuteResolveScreenNameMapper.kt */
/* loaded from: classes3.dex */
public final class svn {
    public static mch0 a(UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto) {
        UserProfile userProfile;
        Group group;
        ApiApplication apiApplication;
        UserId P0;
        String type = utilsDomainResolvedWithDataDto.getType();
        long g = utilsDomainResolvedWithDataDto.g();
        GroupsGroupFullDto f = utilsDomainResolvedWithDataDto.f();
        UserId e = (f == null || (P0 = f.P0()) == null) ? UserId.d : fkq0.e(P0);
        UsersUserFullDto i = utilsDomainResolvedWithDataDto.i();
        if (i != null) {
            new j2r0();
            userProfile = j2r0.a(i);
        } else {
            userProfile = null;
        }
        GroupsGroupFullDto f2 = utilsDomainResolvedWithDataDto.f();
        if (f2 != null) {
            new dqu();
            group = dqu.a(f2);
        } else {
            group = null;
        }
        AppsAppDto d = utilsDomainResolvedWithDataDto.d();
        if (d != null) {
            new re3();
            apiApplication = re3.b(d);
        } else {
            apiApplication = null;
        }
        AppsAppEmbeddedUrlDto e2 = utilsDomainResolvedWithDataDto.e();
        return new mch0(type, g, e, userProfile, group, apiApplication, e2 != null ? new se3(e2.f(), e2.d(), e2.e()) : null);
    }
}
