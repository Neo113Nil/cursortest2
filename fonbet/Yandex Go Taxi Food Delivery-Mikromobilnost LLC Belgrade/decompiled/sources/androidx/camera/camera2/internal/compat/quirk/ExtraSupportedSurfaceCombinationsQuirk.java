package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import com.adjust.sdk.Constants;
import defpackage.anw0;
import defpackage.glg0;
import defpackage.smw0;
import defpackage.ymw0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes10.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements glg0 {
    public static final ymw0 a;
    public static final ymw0 b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        ymw0 ymw0Var = new ymw0();
        SurfaceConfig$ConfigType surfaceConfig$ConfigType = SurfaceConfig$ConfigType.YUV;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.VGA;
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize));
        SurfaceConfig$ConfigType surfaceConfig$ConfigType2 = SurfaceConfig$ConfigType.PRIV;
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2 = SurfaceConfig$ConfigSize.PREVIEW;
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize2));
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize3 = SurfaceConfig$ConfigSize.MAXIMUM;
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize3));
        a = ymw0Var;
        ymw0 ymw0Var2 = new ymw0();
        smw0.w(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize2, ymw0Var2, surfaceConfig$ConfigType2, surfaceConfig$ConfigSize);
        ymw0Var2.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize3));
        b = ymw0Var2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean e() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
