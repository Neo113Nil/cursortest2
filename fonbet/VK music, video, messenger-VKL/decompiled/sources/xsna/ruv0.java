package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.traceprofiler.TraceProfilerServiceImpl;
import java.io.File;

/* compiled from: VkTraceProfilerManager.kt */
/* loaded from: classes7.dex */
public final class ruv0 {
    public static void a(Context context, b25 b25Var) {
        PrivateFiles.a b;
        com.vk.traceprofiler.a aVar = com.vk.traceprofiler.a.a;
        b = e8r.a.b(r2, PrivateSubdir.TRACES.h(), true);
        File file = b.a;
        v6v0 v6v0Var = new v6v0(1, context, b25Var);
        vtc0 vtc0Var = new vtc0(context, 2);
        synchronized (aVar) {
            if (com.vk.traceprofiler.a.b) {
                throw new IllegalStateException("Already inited");
            }
            com.vk.traceprofiler.a.b = true;
            com.vk.traceprofiler.a.d = context.getApplicationContext();
            com.vk.traceprofiler.a.e = file;
            com.vk.traceprofiler.a.f = v6v0Var;
            com.vk.traceprofiler.a.g = vtc0Var;
        }
        o2l.a.getClass();
        b(o2l.b("__dbg_log_method_tracing", false));
    }

    public static void b(boolean z) {
        com.vk.traceprofiler.a aVar = com.vk.traceprofiler.a.a;
        synchronized (aVar) {
            try {
                aVar.a();
                if (com.vk.traceprofiler.a.c != z) {
                    com.vk.traceprofiler.a.c = z;
                    Context context = null;
                    if (z) {
                        int i = TraceProfilerServiceImpl.d;
                        Context context2 = com.vk.traceprofiler.a.d;
                        if (context2 != null) {
                            context = context2;
                        }
                        TraceProfilerServiceImpl.a.a(context, new Intent(context, (Class<?>) TraceProfilerServiceImpl.class));
                    } else {
                        int i2 = TraceProfilerServiceImpl.d;
                        Context context3 = com.vk.traceprofiler.a.d;
                        if (context3 != null) {
                            context = context3;
                        }
                        context.stopService(new Intent(context, (Class<?>) TraceProfilerServiceImpl.class));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
