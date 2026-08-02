package xsna;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import xsna.gy2;
import xsna.vix0;

/* compiled from: WebSettingsCompat.java */
/* loaded from: classes12.dex */
public final class ohx0 {
    @Deprecated
    public static void a(@NonNull WebSettings webSettings, int i) {
        gy2.h hVar = oix0.h;
        if (hVar.b()) {
            sy2.d(webSettings, i);
        } else {
            if (!hVar.c()) {
                throw oix0.a();
            }
            ((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) vix0.a.a.a).convertSettings(webSettings))).setForceDark(i);
        }
    }

    @Deprecated
    public static void b(@NonNull WebSettings webSettings) {
        if (!oix0.i.c()) {
            throw oix0.a();
        }
        ((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) vix0.a.a.a).convertSettings(webSettings))).setForceDarkBehavior(2);
    }
}
