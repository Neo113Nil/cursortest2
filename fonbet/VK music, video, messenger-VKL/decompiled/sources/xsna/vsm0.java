package xsna;

import com.vk.log.L;
import okhttp3.o;
import okhttp3.p;

/* compiled from: StudilkaRemoteConfigUpdate.kt */
/* loaded from: classes17.dex */
public final class vsm0 implements Runnable {
    public final int b;

    public vsm0(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            okhttp3.o oVar = new okhttp3.o(new o.a());
            p.a aVar = new p.a();
            aVar.i("https://remote-mobile-config.studilka.ru/getConfig?app_id=" + this.b);
            aVar.d();
            okhttp3.u execute = ((f8f0) oVar.a(aVar.b())).execute();
            try {
                if (execute.t()) {
                    L.e("StudilkaRemoteConfig", "Studilka remote config loaded successfully.");
                    okhttp3.v vVar = execute.h;
                    usm0.b(vVar != null ? vVar.string() : null);
                } else {
                    L.l("StudilkaRemoteConfig", "Can't update studilka remote config.");
                }
                s3q0 s3q0Var = s3q0.a;
                execute.close();
            } finally {
            }
        } catch (Throwable th) {
            L.j(th, "StudilkaRemoteConfig", "Error updating studilka remote config.");
        }
    }
}
