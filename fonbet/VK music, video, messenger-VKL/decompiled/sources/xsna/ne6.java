package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseImageToImageMapper.kt */
/* loaded from: classes3.dex */
public final class ne6 {
    public static Image a(List list) {
        ArrayList arrayList;
        if (list != null) {
            List<BaseImageDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (BaseImageDto baseImageDto : list2) {
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
        } else {
            arrayList = null;
        }
        return new Image(arrayList);
    }
}
