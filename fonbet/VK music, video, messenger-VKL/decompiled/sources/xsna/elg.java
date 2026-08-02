package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.ThemedColor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommonNewsFeedMapper.kt */
/* loaded from: classes3.dex */
public final class elg {
    public static Image a(List list) {
        List<PhotosPhotoSizesDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (PhotosPhotoSizesDto photosPhotoSizesDto : list2) {
            String url = photosPhotoSizesDto.getUrl();
            String d = (url == null || url.length() == 0) ? photosPhotoSizesDto.d() : photosPhotoSizesDto.getUrl();
            int width = photosPhotoSizesDto.getWidth();
            int height = photosPhotoSizesDto.getHeight();
            ImageSizeKey.a aVar = ImageSizeKey.Companion;
            String i = photosPhotoSizesDto.e().i();
            char i2 = ImageSizeKey.SIZE_X_0604.i();
            aVar.getClass();
            arrayList.add(new ImageSize(d, width, height, null, ImageSizeKey.a.c(i, i2), false, 40, null));
        }
        return new Image(arrayList);
    }

    public static ThemedColor b(NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        String e = newsfeedNewsfeedItemColorDto.e();
        Integer a = e != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e) : null;
        String d = newsfeedNewsfeedItemColorDto.d();
        return new ThemedColor(a, d != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d) : null);
    }
}
