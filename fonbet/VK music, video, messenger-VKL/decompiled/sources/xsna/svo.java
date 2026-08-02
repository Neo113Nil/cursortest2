package xsna;

import android.util.Size;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: EasterEggsViewCreateHelper.kt */
/* loaded from: classes14.dex */
public final class svo {
    public static Size a(muo muoVar) {
        int i = muoVar.i;
        Size size = new Size(iah0.a(i), iah0.a(muoVar.j));
        nuo nuoVar = muoVar.f;
        if ((nuoVar != null ? nuoVar.a : null) != null) {
            if ((nuoVar != null ? nuoVar.a : null).length() > 0) {
                return sa30.n(new Size(nuoVar.c, nuoVar.d), size);
            }
        }
        Image image = muoVar.e;
        ImageSize Cb = image != null ? image.Cb(iah0.a(i), true, false) : null;
        if (Cb == null) {
            return null;
        }
        com.vk.dto.common.im.Image image2 = Cb.d;
        return sa30.n(new Size(image2.b, image2.c), size);
    }
}
