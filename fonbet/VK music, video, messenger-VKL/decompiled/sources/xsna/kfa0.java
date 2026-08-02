package xsna;

import com.vk.api.generated.photos.dto.PhotosImageDto;
import com.vk.api.generated.photos.dto.PhotosImageTypeDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotosImageDtoToImageMapper.kt */
/* loaded from: classes3.dex */
public final class kfa0 {
    public final bpn0 a = new bpn0(new ap80(1));

    public final Image a(List<PhotosImageDto> list) {
        Integer f;
        Integer d;
        List<PhotosImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (PhotosImageDto photosImageDto : list2) {
            Integer f2 = photosImageDto.f();
            bpn0 bpn0Var = this.a;
            String str = null;
            if (f2 != null && f2.intValue() == 0) {
                PhotosImageTypeDto e = photosImageDto.e();
                if (e != null) {
                    ((lfa0) bpn0Var.getValue()).getClass();
                    ImageSizeKey.a aVar = ImageSizeKey.Companion;
                    String i = e.i();
                    aVar.getClass();
                    f = Integer.valueOf(ImageSizeKey.a.g(i));
                } else {
                    f = null;
                }
            } else {
                f = photosImageDto.f();
            }
            Integer d2 = photosImageDto.d();
            if (d2 != null && d2.intValue() == 0) {
                PhotosImageTypeDto e2 = photosImageDto.e();
                if (e2 != null) {
                    ((lfa0) bpn0Var.getValue()).getClass();
                    ImageSizeKey.a aVar2 = ImageSizeKey.Companion;
                    String i2 = e2.i();
                    aVar2.getClass();
                    d = Integer.valueOf(ImageSizeKey.a.a(i2));
                } else {
                    d = null;
                }
            } else {
                d = photosImageDto.d();
            }
            String url = photosImageDto.getUrl();
            int intValue = f != null ? f.intValue() : 0;
            int intValue2 = d != null ? d.intValue() : 0;
            lfa0 lfa0Var = (lfa0) bpn0Var.getValue();
            PhotosImageTypeDto e3 = photosImageDto.e();
            lfa0Var.getClass();
            ImageSizeKey.a aVar3 = ImageSizeKey.Companion;
            if (e3 != null) {
                str = e3.i();
            }
            char i3 = ImageSizeKey.SIZE_M_0130.i();
            aVar3.getClass();
            arrayList.add(new ImageSize(url, intValue, intValue2, null, ImageSizeKey.a.c(str, i3), false, 40, null));
        }
        return new Image(arrayList);
    }
}
