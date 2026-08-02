package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import java.util.Map;
import kotlin.Pair;

/* compiled from: MultipleCoownershipResourcesProvider.kt */
/* loaded from: classes3.dex */
public final class s740 {
    public final Context a;

    public static Map a(yg5 yg5Var) {
        ImageSize Cb = yg5Var.A().getImage().Cb(cn70.b(100), false, true);
        Bitmap k = mcr0.k(Cb != null ? Cb.d.d : null);
        return k != null ? pn00.k(new Pair(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, k), new Pair(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, k)) : jgp.b;
    }

    public static Map b(yg5 yg5Var) {
        VideoFile A = yg5Var.A();
        String title = A.getTitle();
        String P = A.P();
        return (title == null || P == null) ? title != null ? dt.b(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, title) : jgp.b : pn00.k(new Pair(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, title), new Pair(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, P));
    }
}
