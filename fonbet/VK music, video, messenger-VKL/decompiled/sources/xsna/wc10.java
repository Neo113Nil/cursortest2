package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.design.demo.presentation.screens.ecomm.tile.ImageCount;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.im.Image;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: MarketProductTileContentImages.kt */
/* loaded from: classes18.dex */
public final class wc10 {

    /* compiled from: MarketProductTileContentImages.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCount.values().length];
            try {
                iArr[ImageCount.TwoImages.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCount.OneImage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCount.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<ImageSize> a() {
        return e43.l(new ImageSize(new Image(90, 90, "https://sun9-49.userapi.com/impg/QCm-7ZDvgc96MTsuQH-Edix90m4uK-MK95-Ogg/kXVvB6s_iEU.jpg?size=90x0&crop=0.012,0.133,0.976,0.733&quality=95&sign=5a06a196bf391422afff53c90c2bc10c&c_uniq_tag=fGptZ9lIR0dCFtWLTdCGba6KpuefbttzcHvRg6zSzfQ", false), ImageSizeKey.SIZE_KEY_UNDEFINED, false, 4, (zcl) null), new ImageSize(new Image(180, 180, "https://sun9-49.userapi.com/impg/QCm-7ZDvgc96MTsuQH-Edix90m4uK-MK95-Ogg/kXVvB6s_iEU.jpg?size=180x0&crop=0.012,0.133,0.976,0.733&quality=95&sign=20debec8be4540281ce89dc7cfd0c6ca&c_uniq_tag=EYxRCNUM9XnesKuqE4y1ajfbuFAmB6LuOyGtosI_USA", false), ImageSizeKey.SIZE_KEY_UNDEFINED, false, 4, (zcl) null), new ImageSize(new Image(360, 360, "https://sun9-49.userapi.com/impg/QCm-7ZDvgc96MTsuQH-Edix90m4uK-MK95-Ogg/kXVvB6s_iEU.jpg?size=360x0&crop=0.012,0.133,0.976,0.733&quality=95&sign=fadffaffbf964d9e0b820a1f27eb82ba&c_uniq_tag=X_wKmxjXRZp6Ad9g7w_KbkmXK0oWs2SK9s0VBoXK5s4", false), ImageSizeKey.SIZE_KEY_UNDEFINED, false, 4, (zcl) null), new ImageSize(new Image(480, 480, "https://sun9-49.userapi.com/impg/QCm-7ZDvgc96MTsuQH-Edix90m4uK-MK95-Ogg/kXVvB6s_iEU.jpg?size=480x0&crop=0.012,0.133,0.976,0.733&quality=95&sign=e8d020ab4ac0c1577eeb49d65568ba95&c_uniq_tag=2vr1xD9aeY7X-jZJQHe6URVwPWc8E-1oTD3hrF0W8LU", false), ImageSizeKey.SIZE_KEY_UNDEFINED, false, 4, (zcl) null), new ImageSize(new Image(640, 640, "https://sun9-49.userapi.com/impg/QCm-7ZDvgc96MTsuQH-Edix90m4uK-MK95-Ogg/kXVvB6s_iEU.jpg?size=640x0&crop=0.012,0.133,0.976,0.733&quality=95&sign=5a1dfe4fca80952eac7e15659752781b&c_uniq_tag=SIjW3Mpg-9WnVB3I-FMvUfXBOPHd3A3IdckDFOfZol8", false), ImageSizeKey.SIZE_KEY_UNDEFINED, false, 4, (zcl) null));
    }

    public static final List<com.vk.dto.common.Image> b(ImageCount imageCount) {
        int i = a.$EnumSwitchMapping$0[imageCount.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Collections.singletonList(new com.vk.dto.common.Image(a()));
            }
            if (i == 3) {
                return EmptyList.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.vk.dto.common.Image image = new com.vk.dto.common.Image(a());
        ImageSize imageSize = new ImageSize(c(72, 90, false), ImageSizeKey.SIZE_S_0075.i(), false, 4, (zcl) null);
        ImageSize imageSize2 = new ImageSize(c(160, 200, false), ImageSizeKey.SIZE_M_0130.i(), false, 4, (zcl) null);
        ImageSize imageSize3 = new ImageSize(c(464, 580, false), ImageSizeKey.SIZE_X_0604.i(), false, 4, (zcl) null);
        ImageSize imageSize4 = new ImageSize(c(108, 135, false), ImageSizeKey.SIZE_O_0130.i(), false, 4, (zcl) null);
        Image c = c(PsExtractor.VIDEO_STREAM_MASK, 300, false);
        ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_P_0200;
        return e43.l(image, new com.vk.dto.common.Image((List<ImageSize>) e43.l(imageSize, imageSize2, imageSize3, imageSize4, new ImageSize(c, imageSizeKey.i(), false, 4, (zcl) null), new ImageSize(c(360, 450, false), ImageSizeKey.SIZE_Q_0320.i(), false, 4, (zcl) null), new ImageSize(c(464, 580, true), imageSizeKey.i(), false, 4, (zcl) null))));
    }

    public static final Image c(int i, int i2, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("https://sun9-75.userapi.com/s/v1/ig2/PyHc0-LKDP4100aoJhebmr2uhuxFffFNuQitBO3w2I8XJt7oR0ZGhCFnVub-MwYJnfw6OiYpojeBN8LsSYEzRzNE.jpg?quality=95&as=32x40,48x60,72x90,108x135,160x200,240x300,360x450,464x580&from=bu&u=K-lA8uv53Ql1iutOx68YeQ5bkgyXgfehkPqSyQKcwc4");
        if (z) {
            str = "";
        } else {
            str = "&cs=" + i + 'x' + i2;
        }
        sb.append(str);
        return new Image(i, i2, sb.toString(), z);
    }
}
