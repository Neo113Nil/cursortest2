package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseStickerAnimationDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigContextDto;
import com.vk.api.generated.stickers.dto.StickersStickerPopupDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.stickers.dto.StickersStickerVmojiDto;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerRender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseStickerDtoToStickerItemMapper.kt */
/* loaded from: classes3.dex */
public final class bo6 {

    /* compiled from: BaseStickerDtoToStickerItemMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseStickerAnimationDto.TypeDto.values().length];
            try {
                iArr[BaseStickerAnimationDto.TypeDto.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseStickerAnimationDto.TypeDto.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static StickerItem a(BaseStickerDto baseStickerDto) {
        ImageConfigId imageConfigId;
        Integer l = baseStickerDto.l();
        int intValue = l != null ? l.intValue() : 0;
        Integer j = baseStickerDto.j();
        int intValue2 = j != null ? j.intValue() : 0;
        ImageList b = b(baseStickerDto.f());
        ImageList b2 = b(baseStickerDto.g());
        StickersImageConfigContextDto e = baseStickerDto.e();
        if (e != null) {
            Integer e2 = e.e();
            int intValue3 = e2 != null ? e2.intValue() : 0;
            Integer d = e.d();
            imageConfigId = new ImageConfigId(intValue3, d != null ? d.intValue() : -1);
        } else {
            imageConfigId = null;
        }
        StickerAnimation c = c(baseStickerDto.d());
        Boolean o = baseStickerDto.o();
        boolean booleanValue = o != null ? o.booleanValue() : true;
        StickersStickerRenderDto k = baseStickerDto.k();
        StickerRender d2 = k != null ? d(k) : null;
        StickersStickerVmojiDto n = baseStickerDto.n();
        String d3 = n != null ? n.d() : null;
        StickersStickerPopupDto i = baseStickerDto.i();
        return new StickerItem(intValue, intValue2, b, b2, imageConfigId, c, booleanValue, d2, d3, i != null ? co6.a(i) : null);
    }

    public static ImageList b(List list) {
        if (list == null) {
            return new ImageList(null, 1, null);
        }
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)));
        }
        return new ImageList(new ArrayList(arrayList));
    }

    public static StickerAnimation c(List list) {
        if (list == null) {
            return new StickerAnimation(null, null, 3, null);
        }
        Iterator it = list.iterator();
        String str = "";
        String str2 = str;
        while (it.hasNext()) {
            BaseStickerAnimationDto baseStickerAnimationDto = (BaseStickerAnimationDto) it.next();
            BaseStickerAnimationDto.TypeDto d = baseStickerAnimationDto.d();
            int i = d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()];
            if (i == 1) {
                str = baseStickerAnimationDto.getUrl();
                if (str == null) {
                    str = "";
                }
            } else if (i == 2 && (str2 = baseStickerAnimationDto.getUrl()) == null) {
                str2 = "";
            }
        }
        return new StickerAnimation(str, str2);
    }

    public static StickerRender d(StickersStickerRenderDto stickersStickerRenderDto) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BaseImageDto baseImageDto : stickersStickerRenderDto.d()) {
            Image image = new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE));
            if (baseImageDto.d() == BaseImageDto.ThemeDto.DARK) {
                arrayList2.add(image);
            } else {
                arrayList.add(image);
            }
        }
        String id = stickersStickerRenderDto.getId();
        if (id == null) {
            id = "";
        }
        String str = id;
        ImageList imageList = new ImageList(arrayList);
        ImageList imageList2 = new ImageList(arrayList2);
        Boolean f = stickersStickerRenderDto.f();
        boolean booleanValue = f != null ? f.booleanValue() : false;
        Boolean e = stickersStickerRenderDto.e();
        return new StickerRender(str, imageList, imageList2, booleanValue, e != null ? e.booleanValue() : false);
    }
}
