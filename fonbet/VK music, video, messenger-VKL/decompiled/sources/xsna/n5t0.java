package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumSortAlbumDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l5t0;
import xsna.m5t0;
import xsna.tft0;

/* compiled from: VideoPlaylistVideosRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class n5t0 implements m5t0 {

    /* compiled from: VideoPlaylistVideosRepositoryImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VideoGetFromAlbumResponseDto, VideoListWithTotalCount> {
        @Override // xsna.izs
        public final VideoListWithTotalCount invoke(VideoGetFromAlbumResponseDto videoGetFromAlbumResponseDto) {
            ((ddt0) this.receiver).getClass();
            return ddt0.a(videoGetFromAlbumResponseDto);
        }
    }

    @Override // xsna.m5t0
    public final io.reactivex.rxjava3.core.x<VideoListWithTotalCount> a(m5t0.a aVar) {
        UserId userId = aVar.b;
        int i = aVar.a;
        l5t0 l5t0Var = aVar.d;
        l5t0.b bVar = l5t0Var instanceof l5t0.b ? (l5t0.b) l5t0Var : null;
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.a) : null;
        l5t0.a aVar2 = l5t0Var instanceof l5t0.a ? (l5t0.a) l5t0Var : null;
        String str = aVar2 != null ? aVar2.a : null;
        int count = l5t0Var.getCount();
        VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto = aVar.e ? VideoGetFromAlbumSortAlbumDto.TYPE_1 : VideoGetFromAlbumSortAlbumDto.TYPE_0;
        ArrayList d = tby.d(UsersFieldsDto.FOLLOWERS_COUNT, GroupsFieldsDto.MEMBERS_COUNT, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, UsersFieldsDto.PHOTO_BASE);
        String str2 = aVar.f;
        m5t0.a.C3323a c3323a = aVar.g;
        fz2 y = yfb.y(tft0.a.b(i, userId, Integer.valueOf(count), valueOf, str2, videoGetFromAlbumSortAlbumDto, str, c3323a.a, c3323a.b, Boolean.TRUE, d), new a(1, ddt0.a, ddt0.class, "map", "map(Lcom/vk/api/generated/video/dto/VideoGetFromAlbumResponseDto;)Lcom/vk/dto/video/VideoListWithTotalCount;", 0));
        ahn.D(y);
        return rsg0.W(y, 7);
    }
}
