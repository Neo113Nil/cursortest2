package xsna;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: OreoDecoder.kt */
@TargetApi(26)
/* loaded from: classes.dex */
public final class oy80 extends jdl {
    @Override // xsna.jdl
    public final int b(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return id7.c(i, i2, config);
    }
}
