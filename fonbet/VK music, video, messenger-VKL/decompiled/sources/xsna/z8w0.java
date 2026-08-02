package xsna;

import android.graphics.Color;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterPreviewBackgroundColorDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterPreviewDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarResponseDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VmojiModelTransformer.kt */
/* loaded from: classes5.dex */
public final class z8w0 {
    public static VmojiAvatarModel a(VmojiGetAvatarResponseDto vmojiGetAvatarResponseDto) {
        String e;
        int i;
        String d;
        StickersStickerRenderDto stickersStickerRenderDto;
        Object obj;
        VmojiCharacterPreviewDto d2;
        VmojiCharacterPreviewDto d3;
        List<VmojiCharacterDto> e2 = vmojiGetAvatarResponseDto.e();
        VmojiCharacterDto vmojiCharacterDto = e2 != null ? (VmojiCharacterDto) j5g.a0(e2) : null;
        VmojiCharacterPreviewBackgroundColorDto d4 = (vmojiCharacterDto == null || (d3 = vmojiCharacterDto.d()) == null) ? null : d3.d();
        int i2 = 0;
        if (d4 != null) {
            try {
                e = d4.e();
            } catch (Exception unused) {
                i = 0;
            }
        } else {
            e = null;
        }
        i = Color.parseColor(e);
        if (d4 != null) {
            try {
                d = d4.d();
            } catch (Exception unused2) {
            }
        } else {
            d = null;
        }
        i2 = Color.parseColor(d);
        int i3 = i2;
        String f = (vmojiCharacterDto == null || (d2 = vmojiCharacterDto.d()) == null) ? null : d2.f();
        List<StickersStickerRenderDto> g = vmojiGetAvatarResponseDto.g();
        if (g != null) {
            Iterator<T> it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                StickersStickerRenderDto stickersStickerRenderDto2 = (StickersStickerRenderDto) obj;
                if (epx.f(stickersStickerRenderDto2.getId(), f) && epx.f(stickersStickerRenderDto2.f(), Boolean.FALSE)) {
                    break;
                }
            }
            stickersStickerRenderDto = (StickersStickerRenderDto) obj;
        } else {
            stickersStickerRenderDto = null;
        }
        List<BaseImageDto> d5 = stickersStickerRenderDto != null ? stickersStickerRenderDto.d() : null;
        Image b = b(d5, BaseImageDto.ThemeDto.LIGHT);
        Image b2 = b(d5, BaseImageDto.ThemeDto.DARK);
        VmojiAvatarDto d6 = vmojiGetAvatarResponseDto.d();
        return new VmojiAvatarModel(new VmojiAvatar(d6.getId(), d6.d(), d6.f(), epx.f(d6.g(), Boolean.TRUE), null, 16, null), b, b2, i, i3, null, 32, null);
    }

    public static Image b(List list, BaseImageDto.ThemeDto themeDto) {
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
            arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        return new Image(arrayList2);
    }
}
