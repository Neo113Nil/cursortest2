package com.vungle.ads.internal.util;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import kotlin.io.FileWalkDirection;
import xsna.nbr;
import xsna.war;
import xsna.war.b;

/* loaded from: classes7.dex */
public abstract class z {
    public static boolean a() {
        return false;
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static long a(Context context) {
        long j;
        long j2 = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            if (file.exists() && file.exists()) {
                war.b bVar = new war(file, FileWalkDirection.TOP_DOWN).new b();
                j = 0;
                while (bVar.hasNext()) {
                    File next = bVar.next();
                    if (next.isFile()) {
                        j += next.length();
                    }
                }
            } else {
                j = 0;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return j;
            }
            File t = nbr.t(cacheDir, "webviewCache");
            if (t.exists()) {
                war.b bVar2 = new war(t, FileWalkDirection.TOP_DOWN).new b();
                while (bVar2.hasNext()) {
                    File next2 = bVar2.next();
                    if (next2.isFile()) {
                        j2 += next2.length();
                    }
                }
            }
            return j + j2;
        } catch (Exception e2) {
            e = e2;
            j2 = j;
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Error reading WebView data size: ");
            a.append(e.getMessage());
            t.b("WebViewSize", a.toString());
            return j2;
        }
    }
}
