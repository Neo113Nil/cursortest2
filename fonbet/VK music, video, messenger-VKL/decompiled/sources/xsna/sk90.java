package xsna;

import android.content.Context;
import androidx.media3.datasource.g;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.mediastore.media.VideoCacheIdImpl;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.d;
import xsna.a8s0;
import xsna.ux70;

/* compiled from: PartialVideoCacheInitializer.kt */
/* loaded from: classes.dex */
public final class sk90 {
    public static final io.reactivex.rxjava3.subjects.e a;
    public static final AtomicBoolean b;

    static {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        a = eVar;
        i460 i460Var = new i460(new y240(1), 1);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        new io.reactivex.rxjava3.internal.operators.completable.w(eVar, i460Var, io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar, kVar, kVar);
        b = new AtomicBoolean(false);
    }

    public static void a() {
        PrivateFiles.a b2;
        if (b.getAndSet(true)) {
            return;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        VideoCacheIdImpl videoCacheIdImpl = VideoCacheIdImpl.VIDEOS;
        a8s0.b bVar = new a8s0.b(0L, 0L, true, false);
        final o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        ux70.a aVar = new ux70.a(new d.a() { // from class: xsna.rk90
            @Override // okhttp3.d.a
            public final okhttp3.d a(okhttp3.p pVar) {
                return NetworkClient.this.b(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER).a(pVar);
            }
        });
        aVar.c = o260Var.l.a();
        g.a aVar2 = new g.a(aVar, new gtk());
        b2 = e8r.a.b(r9, PrivateSubdir.VIDEO_PLAYBACK_CACHE.h(), true);
        z7s0.a.putIfAbsent(videoCacheIdImpl.getId(), new k7s0(videoCacheIdImpl, bVar, new androidx.media3.datasource.cache.c(b2.a, new dzy(0L), new aes0(context.getApplicationContext(), fo8.a(videoCacheIdImpl.getId(), ".db"), null, 1), false), xw8.f7, aVar2, null));
        a.onComplete();
    }
}
