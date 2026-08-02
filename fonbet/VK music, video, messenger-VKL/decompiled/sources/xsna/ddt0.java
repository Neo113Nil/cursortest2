package xsna;

import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoItemsInSimilarDto;
import com.vk.api.generated.video.dto.VideoVideoForAlbumDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.video.VideoListWithTotalCount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoResponseToVideoListWithTotalCountMapper.kt */
/* loaded from: classes3.dex */
public final class ddt0 {
    public static final ddt0 a = new ddt0();

    /* compiled from: VideoResponseToVideoListWithTotalCountMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoItemsInSimilarDto.TypeDto.values().length];
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.CAROUSEL_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoItemsInSimilarDto.TypeDto.FLOOR_CLIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static VideoListWithTotalCount a(VideoGetFromAlbumResponseDto videoGetFromAlbumResponseDto) {
        ums0 ums0Var = ums0.a;
        List<VideoVideoForAlbumDto> e = videoGetFromAlbumResponseDto.e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            VideoVideoFullDto d = ((VideoVideoForAlbumDto) it.next()).d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        List e2 = ums0.e(ums0Var, arrayList, videoGetFromAlbumResponseDto.g(), videoGetFromAlbumResponseDto.d(), false, 52);
        int count = videoGetFromAlbumResponseDto.getCount();
        Integer f = videoGetFromAlbumResponseDto.f();
        return new VideoListWithTotalCount(e2, count, f != null ? f.intValue() : -1);
    }
}
