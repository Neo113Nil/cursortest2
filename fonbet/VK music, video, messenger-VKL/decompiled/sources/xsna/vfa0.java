package xsna;

import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;

/* compiled from: PhotosPhotoSizesDtoToImageSizeMapper.kt */
/* loaded from: classes3.dex */
public final class vfa0 {
    public final bpn0 a = new bpn0(new hy2(28));

    public final ImageSize a(PhotosPhotoSizesDto photosPhotoSizesDto) {
        int width;
        int height;
        int width2 = photosPhotoSizesDto.getWidth();
        bpn0 bpn0Var = this.a;
        if (width2 == 0) {
            wfa0 wfa0Var = (wfa0) bpn0Var.getValue();
            PhotosPhotoSizesTypeDto e = photosPhotoSizesDto.e();
            wfa0Var.getClass();
            ImageSizeKey.a aVar = ImageSizeKey.Companion;
            String i = e.i();
            aVar.getClass();
            width = ImageSizeKey.a.g(i);
        } else {
            width = photosPhotoSizesDto.getWidth();
        }
        int i2 = width;
        if (photosPhotoSizesDto.getHeight() == 0) {
            wfa0 wfa0Var2 = (wfa0) bpn0Var.getValue();
            PhotosPhotoSizesTypeDto e2 = photosPhotoSizesDto.e();
            wfa0Var2.getClass();
            ImageSizeKey.a aVar2 = ImageSizeKey.Companion;
            String i3 = e2.i();
            aVar2.getClass();
            height = ImageSizeKey.a.a(i3);
        } else {
            height = photosPhotoSizesDto.getHeight();
        }
        int i4 = height;
        String url = photosPhotoSizesDto.getUrl();
        Boolean valueOf = Boolean.valueOf(photosPhotoSizesDto.e() == PhotosPhotoSizesTypeDto.BASE);
        PhotosPhotoSizesTypeDto e3 = photosPhotoSizesDto.e();
        ImageSizeKey.a aVar3 = ImageSizeKey.Companion;
        String i5 = e3 != null ? e3.i() : null;
        char i6 = ImageSizeKey.SIZE_M_0130.i();
        aVar3.getClass();
        return new ImageSize(url, i2, i4, valueOf, ImageSizeKey.a.c(i5, i6), false, 32, null);
    }
}
