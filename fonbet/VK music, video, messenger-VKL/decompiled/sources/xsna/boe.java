package xsna;

import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsOwnerGridBatchResponse.kt */
/* loaded from: classes17.dex */
public final class boe {
    public final UserId a;
    public final ShortVideoGetOwnerVideosResponseDto b;
    public final UsersUserFullDto c;
    public final GroupsGetObjectExtendedResponseDto d;
    public final ShortVideoGetOwnerVideosResponseDto e;
    public final NewsfeedGenericResponseDto f;

    public boe(UserId userId, ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto, UsersUserFullDto usersUserFullDto, GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto, ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto2, NewsfeedGenericResponseDto newsfeedGenericResponseDto) {
        this.a = userId;
        this.b = shortVideoGetOwnerVideosResponseDto;
        this.c = usersUserFullDto;
        this.d = groupsGetObjectExtendedResponseDto;
        this.e = shortVideoGetOwnerVideosResponseDto2;
        this.f = newsfeedGenericResponseDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boe)) {
            return false;
        }
        boe boeVar = (boe) obj;
        return epx.f(this.a, boeVar.a) && epx.f(this.b, boeVar.b) && epx.f(this.c, boeVar.c) && epx.f(this.d, boeVar.d) && epx.f(this.e, boeVar.e) && epx.f(this.f, boeVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
        UsersUserFullDto usersUserFullDto = this.c;
        int hashCode2 = (hashCode + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = this.d;
        int hashCode3 = (hashCode2 + (groupsGetObjectExtendedResponseDto == null ? 0 : groupsGetObjectExtendedResponseDto.hashCode())) * 31;
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = this.e;
        int hashCode4 = (hashCode3 + (shortVideoGetOwnerVideosResponseDto == null ? 0 : shortVideoGetOwnerVideosResponseDto.hashCode())) * 31;
        NewsfeedGenericResponseDto newsfeedGenericResponseDto = this.f;
        return hashCode4 + (newsfeedGenericResponseDto != null ? newsfeedGenericResponseDto.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsOwnerGridBatchResponse(ownerId=" + this.a + ", clipsResponse=" + this.b + ", userResponse=" + this.c + ", groupsResponse=" + this.d + ", scheduledClipsResponse=" + this.e + ", likesResponse=" + this.f + ')';
    }
}
