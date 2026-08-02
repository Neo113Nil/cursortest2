package xsna;

import android.content.Context;
import androidx.media3.datasource.g;
import com.vk.core.files.PrivateSubdir;
import com.vk.httpexecutor.api.NetworkClient;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.d;
import xsna.bhs0;
import xsna.hk0;
import xsna.ux70;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes.dex */
public final class erd implements Runnable {
    public final /* synthetic */ yqd b;
    public final /* synthetic */ Context c;

    public erd(yqd yqdVar, Context context) {
        this.b = yqdVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        if (!frd.a()) {
            this.b.invoke(Boolean.FALSE);
            return;
        }
        AtomicBoolean atomicBoolean = frd.c;
        if (atomicBoolean.getAndSet(true)) {
            yqd yqdVar = this.b;
            z0d0 z0d0Var = frd.b;
            yqdVar.invoke(Boolean.valueOf(z0d0Var != null ? z0d0Var.d() : false));
            return;
        }
        z0d0 z0d0Var2 = frd.b;
        if (z0d0Var2 != null && z0d0Var2.d()) {
            this.b.invoke(Boolean.TRUE);
            atomicBoolean.set(false);
            return;
        }
        if (z0d0Var2 != null) {
            Context context = this.c;
            File file = e8r.a.b(PrivateSubdir.CLIPS_DISK_CACHE, ukd.a(com.vk.toggle.d.g().a), true).a;
            r8l r8lVar = new r8l(qu5.c().getCodecInfo().a(), qu5.c().getCodecInfo().b(), 4);
            xgp0 a = sm80.a();
            hk0 hk0Var = hk0.e;
            dhs0 dhs0Var = new dhs0(r8lVar, a, hk0.a.a());
            long j = frd.d.b;
            final o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            ux70.a aVar = new ux70.a(new d.a() { // from class: xsna.zqd
                @Override // okhttp3.d.a
                public final okhttp3.d a(okhttp3.p pVar) {
                    return NetworkClient.this.b(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER).a(pVar);
                }
            });
            aVar.c = o260Var.l.a();
            fz5 fz5Var = fz5.d;
            Context context2 = e43.a;
            aVar.d = fz5Var.t(context2 != null ? context2 : null);
            z0d0Var2.c(context, bhs0.a.a(file, j, dhs0Var, new g.a(aVar, new gtk())), new ny7(this.b));
        }
    }
}
