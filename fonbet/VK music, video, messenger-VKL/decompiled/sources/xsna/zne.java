package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsOwnerGridBatchRequest.kt */
/* loaded from: classes17.dex */
public final class zne extends com.vk.api.request.rx.batch.d<ShortVideoGetOwnerVideosResponseDto, List<? extends UsersUserFullDto>, GroupsGetObjectExtendedResponseDto, ShortVideoGetOwnerVideosResponseDto, NewsfeedGenericResponseDto, boe> {
    public final UserId v;

    /* compiled from: ClipsOwnerGridBatchRequest.kt */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zne(dz2 dz2Var, dz2 dz2Var2, dz2 dz2Var3, dz2 dz2Var4, dz2 dz2Var5, UserId userId) {
        super(dz2Var, r4, r5, r6, r7);
        rsg0 rsg0Var;
        rsg0 g5jVar = dz2Var2 == null ? new g5j(EmptyList.b) : dz2Var2;
        rsg0 g5jVar2 = dz2Var3 == null ? new g5j(new GroupsGetObjectExtendedResponseDto(0, EmptyList.b, null, null, null, 28, null)) : dz2Var3;
        rsg0 g5jVar3 = dz2Var4 == null ? new g5j(new ShortVideoGetOwnerVideosResponseDto(0, EmptyList.b, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null)) : dz2Var4;
        if (dz2Var5 == null) {
            EmptyList emptyList = EmptyList.b;
            rsg0Var = new g5j(new NewsfeedGenericResponseDto(emptyList, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777208, null));
        } else {
            rsg0Var = dz2Var5;
        }
        this.v = userId;
    }

    @Override // com.vk.api.request.rx.batch.d
    public final boe K0(bv6<ShortVideoGetOwnerVideosResponseDto> bv6Var, bv6<List<? extends UsersUserFullDto>> bv6Var2, bv6<GroupsGetObjectExtendedResponseDto> bv6Var3, bv6<ShortVideoGetOwnerVideosResponseDto> bv6Var4, bv6<NewsfeedGenericResponseDto> bv6Var5) {
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = bv6Var.a;
        if (shortVideoGetOwnerVideosResponseDto == null) {
            VKApiException vKApiException = bv6Var.b;
            if (vKApiException == null) {
                throw new IllegalStateException("Clips batch response is null");
            }
            throw vKApiException;
        }
        List<? extends UsersUserFullDto> list = bv6Var2.a;
        UsersUserFullDto usersUserFullDto = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) it.next();
                if (usersUserFullDto2 == null) {
                    usersUserFullDto2 = null;
                }
                if (usersUserFullDto2 != null) {
                    usersUserFullDto = usersUserFullDto2;
                    break;
                }
            }
        }
        return new boe(this.v, shortVideoGetOwnerVideosResponseDto, usersUserFullDto, bv6Var3.a, bv6Var4.a, bv6Var5.a);
    }
}
