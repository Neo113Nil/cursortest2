package xsna;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: AndroidTileMode.android.kt */
/* loaded from: classes11.dex */
public final class kd2 {
    public static final Shader.TileMode a(int i) {
        Shader.TileMode tileMode;
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i != 3) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Shader.TileMode.CLAMP;
        }
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
