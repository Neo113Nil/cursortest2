package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;

/* loaded from: classes4.dex */
public abstract class g5b1 {
    public static final boolean a(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = wd5.a[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        w511.b();
        return false;
    }

    public static final ImageScaleTypeEntity b(ImageScaleTypeDto imageScaleTypeDto) {
        int i = imageScaleTypeDto == null ? -1 : wgv.a[imageScaleTypeDto.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return ImageScaleTypeEntity.FIT_TOP;
            }
            if (i == 2) {
                return ImageScaleTypeEntity.FIT_CENTER;
            }
            if (i == 3) {
                return ImageScaleTypeEntity.FIT_BOTTOM;
            }
            if (i == 4) {
                return ImageScaleTypeEntity.FIT_XY;
            }
            if (i != 5) {
                w511.b();
                return null;
            }
        }
        return ImageScaleTypeEntity.DEFAULT;
    }
}
