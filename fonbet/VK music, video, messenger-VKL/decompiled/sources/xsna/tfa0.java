package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PhotosPhotoAlbumFullDtoToPhotoAlbumMapper.kt */
/* loaded from: classes3.dex */
public final class tfa0 {
    public static final tfa0 a = new tfa0();
    public static final bpn0 b = new bpn0(new ek(22));

    public static PhotoAlbum a(PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto) {
        Image image;
        Object obj;
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.b = photosPhotoAlbumFullDto.getId();
        photoAlbum.c = photosPhotoAlbumFullDto.q();
        Integer D = photosPhotoAlbumFullDto.D();
        photoAlbum.d = D != null ? D.intValue() : 0;
        Integer i = photosPhotoAlbumFullDto.i();
        photoAlbum.e = i != null ? i.intValue() : 0;
        photoAlbum.f = photosPhotoAlbumFullDto.o();
        photoAlbum.m(photosPhotoAlbumFullDto.getTitle());
        String description = photosPhotoAlbumFullDto.getDescription();
        if (description == null) {
            description = "";
        }
        photoAlbum.h = description;
        BasePrivacyDto l = photosPhotoAlbumFullDto.l();
        photoAlbum.i = l != null ? sk6.a(l) : EmptyList.b;
        BasePrivacyDto k = photosPhotoAlbumFullDto.k();
        photoAlbum.j = k != null ? sk6.a(k) : EmptyList.b;
        photoAlbum.k = photosPhotoAlbumFullDto.C();
        Integer u = photosPhotoAlbumFullDto.u();
        photoAlbum.m = u != null ? u.intValue() : -1;
        BaseBoolIntDto f = photosPhotoAlbumFullDto.f();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        photoAlbum.n = f == baseBoolIntDto;
        photoAlbum.o = photosPhotoAlbumFullDto.F() == baseBoolIntDto;
        photoAlbum.p = photosPhotoAlbumFullDto.g() == baseBoolIntDto;
        photoAlbum.q = photosPhotoAlbumFullDto.B() == baseBoolIntDto;
        photoAlbum.s = sv1.v(photosPhotoAlbumFullDto.n());
        Boolean d = photosPhotoAlbumFullDto.d();
        photoAlbum.t = d != null ? d.booleanValue() : false;
        List<PhotosPhotoSizesDto> p = photosPhotoAlbumFullDto.p();
        a.getClass();
        String str = null;
        if (p == null) {
            image = null;
        } else {
            List<PhotosPhotoSizesDto> list = p;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((vfa0) b.getValue()).a((PhotosPhotoSizesDto) it.next()));
            }
            image = new Image(arrayList);
        }
        photoAlbum.y = image;
        if (image != null) {
            photoAlbum.u = image;
        }
        photoAlbum.z = photosPhotoAlbumFullDto.o();
        List<PhotosPhotoSizesDto> p2 = photosPhotoAlbumFullDto.p();
        if (p2 != null) {
            Iterator<T> it2 = p2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((PhotosPhotoSizesDto) obj).e() == PhotosPhotoSizesTypeDto.S) {
                    break;
                }
            }
            PhotosPhotoSizesDto photosPhotoSizesDto = (PhotosPhotoSizesDto) obj;
            if (photosPhotoSizesDto != null) {
                str = photosPhotoSizesDto.getUrl();
            }
        }
        photoAlbum.l = str;
        photoAlbum.w = photosPhotoAlbumFullDto.j() == BaseBoolIntDto.YES;
        photoAlbum.x = epx.f(photosPhotoAlbumFullDto.e(), Boolean.TRUE);
        return photoAlbum;
    }

    public static PhotoAlbum b(AlbumAttachment albumAttachment) {
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.b = albumAttachment.h;
        photoAlbum.c = albumAttachment.g;
        Photo photo = albumAttachment.l;
        photoAlbum.s = photo.L;
        photoAlbum.g = albumAttachment.m;
        photoAlbum.h = albumAttachment.z;
        photoAlbum.k = photo.Fb(130, false).d.d;
        photoAlbum.f = albumAttachment.y;
        return photoAlbum;
    }
}
