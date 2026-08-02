package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class psr {
    public boolean a;
    public a b;
    public long c;
    public gl d;
    public final FlutterJNI e;
    public final ExecutorService f;
    public Future g;

    public static class a {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public psr() {
        this(new FlutterJNI(), jsr.d().d);
        jsr.d().c.getClass();
    }

    public final boolean a() {
        return this.d.a;
    }

    public final void b(Context context, String[] strArr) {
        Context context2;
        if (this.a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ny61.r("ensureInitializationComplete must be called on the main thread");
            return;
        }
        if (this.b == null) {
            ny61.r("ensureInitializationComplete must be called after startInitialization");
            return;
        }
        try {
            ozz0.c("FlutterLoader#ensureInitializationComplete");
            try {
                osr osrVar = (osr) this.g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                sb.append((String) this.d.x);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=".concat((String) this.d.b));
                arrayList.add("--aot-shared-library-name=" + ((String) this.d.x) + str + ((String) this.d.b));
                StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                sb2.append(osrVar.b);
                arrayList.add(sb2.toString());
                arrayList.add("--domain-network-policy=".concat((String) this.d.w));
                this.b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i == 0) {
                    context2 = context;
                    ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r9.totalMem / 1000000.0d) / 2.0d);
                } else {
                    context2 = context;
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        arrayList.add("--merged-platform-ui-thread=disabled");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=".concat(string));
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=".concat(bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                this.e.init(context2, (String[]) arrayList.toArray(new String[0]), null, osrVar.a, osrVar.b, SystemClock.uptimeMillis() - this.c, Build.VERSION.SDK_INT);
                this.a = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e);
            ny61.j(e);
        }
    }

    public final String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.d.c);
        return oyr.t(sb, File.separator, str);
    }

    public final void d(Context context) {
        a aVar = new a();
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ny61.r("startInitialization must be called on the main thread");
            return;
        }
        ozz0.c("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.b = aVar;
            this.c = SystemClock.uptimeMillis();
            this.d = e03.a(applicationContext);
            e a2 = e.a((DisplayManager) applicationContext.getSystemService("display"), this.e);
            a2.b.setAsyncWaitForVsyncDelegate(a2.d);
            this.g = this.f.submit(new nsr(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public psr(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.a = false;
        this.e = flutterJNI;
        this.f = executorService;
    }
}
