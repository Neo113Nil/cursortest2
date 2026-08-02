package xsna;

import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CollageUiFormat.kt */
/* loaded from: classes4.dex */
public final class a3g {
    public static final List<z2g> a;

    static {
        List<z2g> l = e43.l(new z2g(new x8g0(R.string.editor_crop_format_square), R.drawable.ic_crop_format_square, CollageAspectRatioFormat.CollageSquare, true), new z2g(new rqm0("3:4"), R.drawable.ic_crop_format_3x4, CollageAspectRatioFormat.Collage3X4, false), new z2g(new rqm0("4:3"), R.drawable.ic_crop_format_4x3, CollageAspectRatioFormat.Collage4X3, false), new z2g(new rqm0("9:16"), R.drawable.ic_crop_format_9x16, CollageAspectRatioFormat.Collage9X16, false), new z2g(new rqm0("16:9"), R.drawable.ic_crop_format_16x9, CollageAspectRatioFormat.Collage16X9, false));
        a = l;
        l.get(0);
    }
}
