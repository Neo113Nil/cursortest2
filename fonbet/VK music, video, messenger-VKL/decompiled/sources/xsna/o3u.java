package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.ImageSizeKey;
import xsna.bwi;
import xsna.kjw;

/* compiled from: GoUploadImageProcessor.kt */
/* loaded from: classes6.dex */
public final class o3u {
    public final Uri a;

    public o3u(String str) {
        int i = bwi.g;
        this.a = bwi.a.a(Uri.parse(str));
    }

    public final String a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Uri uri = this.a;
        kjw.a g = kjw.g(context, uri, false);
        int i = g.a;
        ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_W_2560;
        if (i <= imageSizeKey.getWidth() && g.b < imageSizeKey.getWidth()) {
            return null;
        }
        Context context2 = e43.a;
        return new bwi(context2 != null ? context2 : null, true).a(uri);
    }
}
