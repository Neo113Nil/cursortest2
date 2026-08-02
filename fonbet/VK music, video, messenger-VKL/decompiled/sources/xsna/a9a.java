package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.Collections;
import java.util.List;

/* compiled from: CatalogMarketInfoMapper.kt */
/* loaded from: classes16.dex */
public final class a9a {
    public static Image a(BaseImageDto baseImageDto) {
        return new Image((List<ImageSize>) Collections.singletonList(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null)));
    }
}
