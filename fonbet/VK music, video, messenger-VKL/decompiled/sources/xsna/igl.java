package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.common.filter.ImageSide;
import com.vk.dto.common.im.Image;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImageSizeFilters.kt */
/* loaded from: classes18.dex */
public class igl {

    /* compiled from: ImageSizeFilters.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageQuality.values().length];
            try {
                iArr[ImageQuality.BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageQuality.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageQuality.WORST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageQuality.TRAFFIC_FIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageQuality.TRAFFIC_BEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ImageSize a(List list, riw riwVar, boolean z, boolean z2) {
        boolean z3 = z2 || glw.a().b();
        int i = riwVar.a;
        boolean z4 = riwVar.b == ImageSide.WIDTH;
        Iterator it = list.iterator();
        ImageSize imageSize = null;
        while (it.hasNext()) {
            ImageSize imageSize2 = (ImageSize) it.next();
            if (imageSize != null) {
                Image image = imageSize.d;
                int i2 = z4 ? image.b : image.c;
                int i3 = z4 ? imageSize2.d.b : imageSize2.d.c;
                if (z3) {
                    if (!z || i2 < i3) {
                        if (Math.abs(i3 - i) < Math.abs(i2 - i)) {
                        }
                    }
                } else if (i2 > i3) {
                }
            }
            imageSize = imageSize2;
        }
        return imageSize;
    }
}
