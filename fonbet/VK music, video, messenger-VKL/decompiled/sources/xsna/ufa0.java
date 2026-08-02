package xsna;

import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoFeedGetResponseDto;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PhotosPhotoFeedGetResponseDtoToVKListMapper.kt */
/* loaded from: classes3.dex */
public final class ufa0 {
    public static final ufa0 a = new ufa0();

    public static VKList a(PhotosPhotoFeedGetResponseDto photosPhotoFeedGetResponseDto) {
        List<PhotosPhotoDto> d = photosPhotoFeedGetResponseDto.d();
        bpn0 bpn0Var = xfa0.a;
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(xfa0.a((PhotosPhotoDto) it.next()));
        }
        VKList vKList = new VKList(arrayList);
        vKList.o(photosPhotoFeedGetResponseDto.getCount());
        vKList.l(photosPhotoFeedGetResponseDto.e() != null);
        vKList.n(photosPhotoFeedGetResponseDto.e());
        return vKList;
    }
}
