package xsna;

import com.vk.api.generated.photos.dto.PhotosGetLutImagesResponseDto;
import com.vk.api.generated.photos.dto.PhotosLutGroupsDto;
import com.vk.api.generated.photos.dto.PhotosLutImagesDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.x900;

/* compiled from: RemoteExtendedLutsDataSource.kt */
/* loaded from: classes15.dex */
public final class hvf0 {
    public final HashMap a = new HashMap();

    public final rbq a() {
        ArrayList arrayList;
        List<PhotosLutGroupsDto> d;
        ArrayList arrayList2;
        HashMap hashMap = this.a;
        hashMap.clear();
        PhotosGetLutImagesResponseDto photosGetLutImagesResponseDto = (PhotosGetLutImagesResponseDto) yfb.x(new tfx("photos.getLutImages", new as(26), new p11(23))).u(0L);
        if (photosGetLutImagesResponseDto == null || (d = photosGetLutImagesResponseDto.d()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (PhotosLutGroupsDto photosLutGroupsDto : d) {
                List<PhotosLutImagesDto> d2 = photosLutGroupsDto.d();
                if (d2 != null) {
                    List<PhotosLutImagesDto> list = d2;
                    arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (PhotosLutImagesDto photosLutImagesDto : list) {
                        int id = photosLutImagesDto.getId() + 1000000;
                        hashMap.put(Integer.valueOf(id), photosLutImagesDto.getUrl());
                        arrayList2.add(new v900(id, photosLutImagesDto.d(), false, x900.c.a));
                    }
                } else {
                    arrayList2 = null;
                }
                w900 w900Var = (arrayList2 == null || arrayList2.isEmpty()) ? null : new w900(photosLutGroupsDto.getId(), photosLutGroupsDto.e(), false, arrayList2);
                if (w900Var != null) {
                    arrayList.add(w900Var);
                }
            }
        }
        if (arrayList != null) {
            return new rbq(arrayList, new HashMap(hashMap));
        }
        return null;
    }
}
