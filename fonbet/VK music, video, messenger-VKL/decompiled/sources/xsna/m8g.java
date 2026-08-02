package xsna;

import android.graphics.ImageFormat;
import com.vk.media.MediaUtils;

/* compiled from: ColorUtils.java */
/* loaded from: classes3.dex */
public final class m8g {
    public static int a(MediaUtils.d dVar) {
        return (int) Math.ceil(((dVar.b * dVar.a) * ImageFormat.getBitsPerPixel(17)) / 8.0d);
    }
}
