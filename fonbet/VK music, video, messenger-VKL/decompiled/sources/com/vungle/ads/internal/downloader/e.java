package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.TimeUnit;
import okhttp3.o;

/* loaded from: classes7.dex */
public abstract class e {
    public static o a;

    public static o a(PathProvider pathProvider) {
        o oVar = a;
        if (oVar != null) {
            return oVar;
        }
        o.a aVar = new o.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.e(60L, timeUnit);
        aVar.c(60L, timeUnit);
        aVar.k = null;
        aVar.h = true;
        aVar.i = true;
        ConfigManager.INSTANCE.getClass();
        long min = Math.min(ConfigManager.e(), (PathProvider.a(pathProvider.getCleverCacheDir().getAbsolutePath()) * ConfigManager.d()) / 100);
        if (min > 0) {
            aVar.k = new okhttp3.b(pathProvider.getCleverCacheDir(), min);
        } else {
            boolean z = u.a;
            t.c("AssetDownloader", "cache disk capacity size <=0, no clever cache active.");
        }
        o oVar2 = new o(aVar);
        a = oVar2;
        return oVar2;
    }
}
