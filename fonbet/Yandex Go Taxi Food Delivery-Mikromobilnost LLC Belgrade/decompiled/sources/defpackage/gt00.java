package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.yandex.mapkit.mapview.MapTexture;
import com.yandex.mobile.drive.sdk.map.tools.a;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class gt00 {
    public final Application a;
    public final Context b;
    public final xuy0 c;
    public final tt5 d;
    public final a e;
    public final LinkedHashMap f = new LinkedHashMap();

    public gt00(Application application, Activity activity, xuy0 xuy0Var, tt5 tt5Var, a aVar) {
        this.a = application;
        this.b = activity;
        this.c = xuy0Var;
        this.d = tt5Var;
        this.e = aVar;
    }

    public static void a(vi00 vi00Var) {
        vi00Var.d.a();
        kzo kzoVar = vi00Var.c;
        if (!kzoVar.b) {
            kzoVar.b = true;
            ((m2v) kzoVar.c).G(null);
            ((m2v) kzoVar.w).G(null);
            bvf0.j((ike) kzoVar.x, null);
        }
        MapTexture mapTexture = vi00Var.a;
        if (mapTexture != null) {
            mapTexture.removeTexture();
        }
        TextureRegistry$SurfaceTextureEntry textureRegistry$SurfaceTextureEntry = vi00Var.b;
        if (textureRegistry$SurfaceTextureEntry != null) {
            textureRegistry$SurfaceTextureEntry.release();
        }
        vi00Var.e.remove();
    }
}
