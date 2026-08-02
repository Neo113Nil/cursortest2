package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;

/* compiled from: CompactAttachmentPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class l5i extends de {
    public static final int b = cn70.b(40);
    public static final int c = cn70.b(20);

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        String str;
        Image image;
        ImageSize Cb;
        if (!(u1c0Var instanceof k5i)) {
            return 1;
        }
        CompactAttachmentStyle compactAttachmentStyle = ((k5i) u1c0Var).r;
        OverlayImage overlayImage = compactAttachmentStyle.i;
        if (overlayImage == null || (image = overlayImage.b) == null || (Cb = image.Cb(c, true, false)) == null || (str = Cb.d.d) == null) {
            str = overlayImage != null ? overlayImage.c : null;
        }
        return compactAttachmentStyle.d.size() + (((str == null || str.length() == 0) ? 1 : 0) ^ 1);
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ImageSize Cb;
        Image image;
        ImageSize Cb2;
        String str;
        if (!(u1c0Var instanceof k5i)) {
            return null;
        }
        CompactAttachmentStyle compactAttachmentStyle = ((k5i) u1c0Var).r;
        if (i < compactAttachmentStyle.d.size()) {
            Image image2 = (Image) j5g.b0(i, compactAttachmentStyle.d);
            if (image2 == null || (Cb = image2.Cb(b, false, false)) == null) {
                return null;
            }
            return Cb.d.d;
        }
        OverlayImage overlayImage = compactAttachmentStyle.i;
        if (overlayImage != null && (image = overlayImage.b) != null && (Cb2 = image.Cb(c, true, false)) != null && (str = Cb2.d.d) != null) {
            return str;
        }
        if (overlayImage != null) {
            return overlayImage.c;
        }
        return null;
    }
}
