package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseObjectCountDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import com.vk.api.generated.photos.dto.PhotosImageTypeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoScaleType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PhotosPhotoToPhotoMapper.kt */
/* loaded from: classes3.dex */
public final class xfa0 {
    public static final bpn0 a = new bpn0(new om60(4));
    public static final bpn0 b = new bpn0(new pm60(3));

    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Photo a(PhotosPhotoDto photosPhotoDto) {
        boolean z;
        boolean z2;
        List<PhotosPhotoSizesDto> R;
        Image image;
        String a0;
        PhotosImageDto C;
        ImageSize imageSize;
        Image image2;
        PhotosImageDto D;
        ImageSize imageSize2;
        BaseBoolIntDto e;
        Integer d;
        Integer d2;
        Integer d3;
        UserId userId = photosPhotoDto.getUserId();
        if (userId == null) {
            userId = UserId.d;
        }
        if (userId.b == 100) {
            userId = photosPhotoDto.q();
        }
        UserId userId2 = userId;
        BaseObjectCountDto Z = photosPhotoDto.Z();
        int intValue = (Z == null || (d3 = Z.d()) == null) ? 0 : d3.intValue();
        boolean z3 = (photosPhotoDto.j() == null || photosPhotoDto.Z() == null || photosPhotoDto.f() == null || photosPhotoDto.C() == null) ? false : true;
        BaseLikesDto u = photosPhotoDto.u();
        int intValue2 = (u == null || (d2 = u.d()) == null) ? 0 : d2.intValue();
        BaseRepostsInfoDto K = photosPhotoDto.K();
        int count = K != null ? K.getCount() : 0;
        BaseObjectCountDto j = photosPhotoDto.j();
        int intValue3 = (j == null || (d = j.d()) == null) ? 0 : d.intValue();
        BaseLikesDto u2 = photosPhotoDto.u();
        boolean z4 = (u2 == null || (e = u2.e()) == null || e.i() != 1) ? false : true;
        BaseBoolIntDto g = photosPhotoDto.g();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        boolean z5 = g == baseBoolIntDto;
        boolean z6 = photosPhotoDto.i() == null || photosPhotoDto.i() == baseBoolIntDto;
        double floatValue = photosPhotoDto.p() != null ? r0.floatValue() : -9000.0d;
        double floatValue2 = photosPhotoDto.B() != null ? r0.floatValue() : -9000.0d;
        Integer F = photosPhotoDto.F();
        int intValue4 = F != null ? F.intValue() : 0;
        BasePropertyExistsDto o = photosPhotoDto.o();
        if (o != null) {
            z = true;
            if (o.i() == 1) {
                z2 = true;
                Integer G = photosPhotoDto.G();
                int intValue5 = G == null ? G.intValue() : -1;
                boolean z7 = photosPhotoDto.f() != baseBoolIntDto ? z : false;
                R = photosPhotoDto.R();
                if (R != null) {
                    image = Image.d;
                } else {
                    List<PhotosPhotoSizesDto> list = R;
                    vfa0 vfa0Var = (vfa0) b.getValue();
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(vfa0Var.a((PhotosPhotoSizesDto) it.next()));
                    }
                    image = new Image(arrayList);
                }
                ImageSize imageSize3 = (ImageSize) ixj0.b(image.b);
                String str = imageSize3 == null ? imageSize3.d.d : null;
                int id = photosPhotoDto.getId();
                int e2 = photosPhotoDto.e();
                UserId q = photosPhotoDto.q();
                boolean z8 = z;
                int k = photosPhotoDto.k();
                boolean n = photosPhotoDto.n();
                a0 = photosPhotoDto.a0();
                if (a0 == null) {
                    a0 = "";
                }
                String d4 = photosPhotoDto.d();
                String str2 = d4 != null ? d4 : "";
                C = photosPhotoDto.C();
                bpn0 bpn0Var = a;
                if (C != null) {
                    image2 = image;
                    imageSize = null;
                } else {
                    PhotosImageTypeDto e3 = C.e();
                    if (e3 == null) {
                        e3 = PhotosImageTypeDto.M;
                    }
                    PhotosImageTypeDto photosImageTypeDto = e3;
                    ((lfa0) bpn0Var.getValue()).getClass();
                    ImageSizeKey.a aVar = ImageSizeKey.Companion;
                    String i = photosImageTypeDto.i();
                    aVar.getClass();
                    int g2 = ImageSizeKey.a.g(i);
                    ((lfa0) bpn0Var.getValue()).getClass();
                    String i2 = photosImageTypeDto.i();
                    aVar.getClass();
                    int a2 = ImageSizeKey.a.a(i2);
                    String url = C.getUrl();
                    image2 = image;
                    Boolean valueOf = Boolean.valueOf(photosImageTypeDto == PhotosImageTypeDto.BASE ? z8 : false);
                    String i3 = photosImageTypeDto.i();
                    char i4 = ImageSizeKey.SIZE_M_0130.i();
                    aVar.getClass();
                    imageSize = new ImageSize(url, g2, a2, valueOf, ImageSizeKey.a.c(i3, i4), false, 32, null);
                }
                D = photosPhotoDto.D();
                if (D != null) {
                    imageSize2 = null;
                } else {
                    PhotosImageTypeDto e4 = D.e();
                    if (e4 == null) {
                        e4 = PhotosImageTypeDto.BASE;
                    }
                    ((lfa0) bpn0Var.getValue()).getClass();
                    ImageSizeKey.a aVar2 = ImageSizeKey.Companion;
                    String i5 = e4.i();
                    aVar2.getClass();
                    int g3 = ImageSizeKey.a.g(i5);
                    ((lfa0) bpn0Var.getValue()).getClass();
                    String i6 = e4.i();
                    aVar2.getClass();
                    int a3 = ImageSizeKey.a.a(i6);
                    String url2 = D.getUrl();
                    if (e4 != PhotosImageTypeDto.BASE) {
                        z8 = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z8);
                    String i7 = e4.i();
                    char i8 = ImageSizeKey.SIZE_M_0130.i();
                    aVar2.getClass();
                    imageSize2 = new ImageSize(url2, g3, a3, valueOf2, ImageSizeKey.a.c(i7, i8), false, 32, null);
                }
                return new Photo(id, e2, q, userId2, k, intValue2, count, intValue3, intValue, z3, z4, z5, true, z6, n, str, a0, str2, null, image2, floatValue, floatValue2, intValue4, z2, intValue5, z7, imageSize, imageSize2, sv1.v(photosPhotoDto.M()), PhotoScaleType.CENTER_CROP, photosPhotoDto.l(), photosPhotoDto.F5());
            }
        } else {
            z = true;
        }
        z2 = false;
        Integer G2 = photosPhotoDto.G();
        int intValue52 = G2 == null ? G2.intValue() : -1;
        if (photosPhotoDto.f() != baseBoolIntDto) {
        }
        R = photosPhotoDto.R();
        if (R != null) {
        }
        ImageSize imageSize32 = (ImageSize) ixj0.b(image.b);
        if (imageSize32 == null) {
        }
        int id2 = photosPhotoDto.getId();
        int e22 = photosPhotoDto.e();
        UserId q2 = photosPhotoDto.q();
        boolean z82 = z;
        int k2 = photosPhotoDto.k();
        boolean n2 = photosPhotoDto.n();
        a0 = photosPhotoDto.a0();
        if (a0 == null) {
        }
        String d42 = photosPhotoDto.d();
        if (d42 != null) {
        }
        C = photosPhotoDto.C();
        bpn0 bpn0Var2 = a;
        if (C != null) {
        }
        D = photosPhotoDto.D();
        if (D != null) {
        }
        return new Photo(id2, e22, q2, userId2, k2, intValue2, count, intValue3, intValue, z3, z4, z5, true, z6, n2, str, a0, str2, null, image2, floatValue, floatValue2, intValue4, z2, intValue52, z7, imageSize, imageSize2, sv1.v(photosPhotoDto.M()), PhotoScaleType.CENTER_CROP, photosPhotoDto.l(), photosPhotoDto.F5());
    }
}
