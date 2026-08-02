package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import xsna.s3q0;

/* loaded from: classes7.dex */
public abstract class e0 {
    public static final ReentrantLock a = new ReentrantLock();
    public static final LinkedHashMap b = new LinkedHashMap();

    public static void a(Context context, h0 h0Var, i3 i3Var, String str, f0 f0Var, com.vungle.ads.internal.load.e eVar, Long l) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder sb = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap linkedHashMap = b;
            sb.append(linkedHashMap.size());
            com.vungle.ads.internal.util.t.a("WebViewManager", sb.toString());
            String h = h0Var.h();
            if (!linkedHashMap.containsKey(h)) {
                Handler handler = com.vungle.ads.internal.util.y.a;
                com.vungle.ads.internal.util.y.a(new d0(context, h0Var, i3Var, eVar, l, str, h, f0Var));
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static WebView a(Context context, String str) {
        WebView webView;
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = b;
            a0 a0Var = (a0) linkedHashMap.get(str);
            if (a0Var != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = a0Var.a();
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            reentrantLock.unlock();
            return webView;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static com.vungle.ads.internal.ui.z a(h0 h0Var, i3 i3Var, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.platform.f fVar) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            a0 a0Var = (a0) b.get(h0Var.h());
            com.vungle.ads.internal.ui.z b2 = a0Var != null ? a0Var.b() : null;
            if (b2 == null) {
                b2 = new com.vungle.ads.internal.ui.z(h0Var, i3Var, jVar, fVar);
            }
            reentrantLock.unlock();
            return b2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void a(String str) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            b.remove(str);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
