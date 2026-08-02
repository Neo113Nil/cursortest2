package xsna;

import android.content.SharedPreferences;
import android.opengl.GLES20;
import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.utils.log.LogUploader;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f5m implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ f5m(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUploader.a a;
        switch (this.b) {
            case 0:
                GLES20.glClear(16640);
                return;
            case 1:
                LogUploader logUploader = LogUploader.a;
                synchronized (logUploader) {
                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                    Features.Type type = LogUploader.e;
                    s63 s63Var = null;
                    if (type == null) {
                        type = null;
                    }
                    if (!bVar.a(type)) {
                        LogUploader.b bVar2 = LogUploader.b;
                        bVar2.b(null);
                        SharedPreferences sharedPreferences = bVar2.a;
                        sharedPreferences.edit().putBoolean("log_collector_is_app_sent_key", false).apply();
                        sharedPreferences.edit().putBoolean("log_collector_is_net_sent_key", false).apply();
                        return;
                    }
                    Features.Type type2 = LogUploader.e;
                    if (type2 == null) {
                        type2 = null;
                    }
                    b.d i = bVar.i(type2);
                    try {
                        a = LogUploader.a.C1940a.a(new JSONObject(i != null ? i.c.toString() : null));
                    } catch (Exception e) {
                        L.i(e);
                        s63 s63Var2 = LogUploader.c;
                        if (s63Var2 != null) {
                            s63Var = s63Var2;
                        }
                        s63Var.invoke();
                    }
                    if (a == null) {
                        return;
                    }
                    logUploader.c(a);
                    return;
                }
            default:
                v9v0.b.getClass();
                v9v0.D();
                return;
        }
    }
}
