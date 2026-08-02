package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: GamesCatalogAchievementsModalBottomSheetMapper.kt */
/* loaded from: classes17.dex */
public final class l9t {
    public static WebImage a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseImageDto baseImageDto = (BaseImageDto) it.next();
            arrayList2.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
        }
        return new WebImage(arrayList2);
    }
}
