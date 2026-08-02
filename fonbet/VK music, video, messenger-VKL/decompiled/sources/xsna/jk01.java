package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.WebImage;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class jk01 {

    @Nullable
    public final Uri a;
    public Bitmap b;

    public jk01(@Nullable WebImage webImage) {
        this.a = webImage == null ? null : webImage.c;
    }
}
