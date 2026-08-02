package xsna;

import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoVideoForAlbumDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class snq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ snq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoGetFromAlbumResponseDto videoGetFromAlbumResponseDto = (VideoGetFromAlbumResponseDto) obj;
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
        VKList vKList = new VKList(ums0.e(ums0Var, arrayList, videoGetFromAlbumResponseDto.g(), videoGetFromAlbumResponseDto.d(), false, 52));
        int i = this.b + 20;
        vKList.n(i < videoGetFromAlbumResponseDto.getCount() ? String.valueOf(i) : null);
        return vKList;
    }
}
