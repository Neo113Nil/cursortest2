package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nmt0 implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        VideoFileOld videoFileOld;
        Object obj;
        List<String> f3 = catalogBlockDto.f3();
        EmptyList emptyList = null;
        if (f3 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : f3) {
                List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
                if (p != null) {
                    Iterator<T> it = p.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Integer s1 = ((VideoVideoFullDto) obj).s1();
                        String str2 = (String) j5g.k0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                        if (epx.f(s1, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null)) {
                            break;
                        }
                    }
                    VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj;
                    if (videoVideoFullDto != null) {
                        videoFileOld = ums0.d(ums0.a, videoVideoFullDto, null, null, null, 30);
                        if (videoFileOld == null) {
                            arrayList.add(videoFileOld);
                        }
                    }
                }
                videoFileOld = null;
                if (videoFileOld == null) {
                }
            }
            emptyList = arrayList;
        }
        if (emptyList == null) {
            emptyList = EmptyList.b;
        }
        EmptyList emptyList2 = emptyList;
        ArrayList arrayList2 = new ArrayList(c5g.u(emptyList2, 10));
        Iterator<E> it2 = emptyList2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new VideoTrailerView$State(BlockId.Simple.a(catalogBlockDto.getId()), catalogBlockVariant, (VideoFile) it2.next(), null, null, null, null, null, null, null, false, false, false, 8184, null));
        }
        return arrayList2;
    }
}
