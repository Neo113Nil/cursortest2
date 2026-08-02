package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.vbr;

/* compiled from: VideoPrimaryAttachViewFactory.kt */
/* loaded from: classes15.dex */
public final class j6t0 {
    public static final float a = cn70.a() * 12.0f;
    public static final vbr.a.b b = new vbr.a.b();

    /* compiled from: VideoPrimaryAttachViewFactory.kt */
    public static final class a {
        public static ImageSize a(VideoAttachment videoAttachment, int i) {
            return videoAttachment.k.getImage().E0() > 2.0f ? Image.Bb(i, videoAttachment.k.getImage().b, true, false, true) : Image.Bb(i, videoAttachment.k.getImage().b, false, false, true);
        }
    }
}
