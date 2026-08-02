package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class okw {
    public okw() {
        new sf01(this);
    }

    @Nullable
    @Deprecated
    public static WebImage a(@Nullable MediaMetadata mediaMetadata) {
        List list;
        if (mediaMetadata == null || (list = mediaMetadata.b) == null || list.isEmpty()) {
            return null;
        }
        return (WebImage) list.get(0);
    }
}
