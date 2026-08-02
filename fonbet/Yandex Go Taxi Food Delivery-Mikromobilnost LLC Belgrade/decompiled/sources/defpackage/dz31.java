package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes12.dex */
public final class dz31 {
    public final String a;

    public dz31(Context context) {
        String path;
        File externalCacheDir = context.getExternalCacheDir();
        this.a = (externalCacheDir == null || (path = externalCacheDir.getPath()) == null) ? context.getCacheDir().getPath() : path;
    }

    public final String a(String str) {
        return g8e.p(this.a, "/", str);
    }

    public final String b(String str, String str2) {
        return g8e.p(a(str), "/", str2);
    }
}
