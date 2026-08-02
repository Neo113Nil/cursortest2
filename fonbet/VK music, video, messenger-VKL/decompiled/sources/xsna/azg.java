package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryCellItemPlaceholderType;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityCreateReviewMapper.kt */
/* loaded from: classes18.dex */
public final class azg {
    public static final ArrayList a(List list) {
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (List<BaseImageDto> list3 : list2) {
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Integer num = null;
            String str = null;
            for (BaseImageDto baseImageDto : list3) {
                if (str == null) {
                    str = baseImageDto.getId();
                }
                arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
            if (str != null) {
                num = arm0.m(10, str);
            }
            arrayList.add(new UploadImageModel(null, null, null, null, ixj0.h(arrayList2), num, 15, null));
        }
        return arrayList;
    }

    public static final ImageGalleryItem.ImageGalleryImageItem b(UploadImageModel uploadImageModel) {
        Integer d = uploadImageModel.d();
        int intValue = d != null ? d.intValue() : 0;
        String str = uploadImageModel.c;
        if (str == null) {
            str = uploadImageModel.f;
        }
        if (str == null) {
            str = "";
        }
        ProgressInfo progressInfo = uploadImageModel.e;
        return new ImageGalleryItem.ImageGalleryImageItem(intValue, progressInfo instanceof ProgressInfo.Loading ? ImageGalleryCellItemPlaceholderType.PROGRESS : progressInfo instanceof ProgressInfo.Error ? ImageGalleryCellItemPlaceholderType.RELOAD : null, str);
    }
}
