package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerRender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RenderMapper.kt */
/* loaded from: classes7.dex */
public final class lyf0 {
    public static StickerRender a(StickersStickerRenderDto stickersStickerRenderDto) {
        String id = stickersStickerRenderDto.getId();
        if (id == null) {
            id = "";
        }
        ImageList b = b(stickersStickerRenderDto.d(), BaseImageDto.ThemeDto.LIGHT);
        if (b == null) {
            b = new ImageList(null, 1, null);
        }
        ImageList b2 = b(stickersStickerRenderDto.d(), BaseImageDto.ThemeDto.DARK);
        if (b2 == null) {
            b2 = new ImageList(null, 1, null);
        }
        ImageList imageList = b2;
        Boolean f = stickersStickerRenderDto.f();
        boolean booleanValue = f != null ? f.booleanValue() : false;
        Boolean e = stickersStickerRenderDto.e();
        return new StickerRender(id, b, imageList, booleanValue, e != null ? e.booleanValue() : false);
    }

    public static ImageList b(List list, BaseImageDto.ThemeDto themeDto) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BaseImageDto) obj).d() == themeDto) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseImageDto baseImageDto = (BaseImageDto) it.next();
            arrayList2.add(new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)));
        }
        return new ImageList(new ArrayList(arrayList2));
    }
}
