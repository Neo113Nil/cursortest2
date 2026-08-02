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

/* compiled from: PartialStoryCacheInitializer.kt */
/* loaded from: classes.dex */
public final class pk90 {
    public static final io.reactivex.rxjava3.subjects.e a;
    public static final io.reactivex.rxjava3.internal.operators.completable.w b;
    public static final AtomicBoolean c;
    public static final AtomicBoolean d;

    static {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        a = eVar;
        ex50 ex50Var = new ex50(new v1w(1), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        b = new io.reactivex.rxjava3.internal.operators.completable.w(eVar, ex50Var, lVar, kVar, kVar, kVar, kVar);
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
    }

    public static void a() {
        PrivateFiles.a b2;
        if (c.getAndSet(true)) {
            return;
        }
        b2 = e8r.a.b(r2, PrivateSubdir.STORIES_VIEWER_VIDEO.h(), true);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        VideoCacheIdImpl videoCacheIdImpl = VideoCacheIdImpl.STORY;
        a8s0.b bVar = new a8s0.b(0L, 104857600L, true, true);
        final o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        ux70.a aVar = new ux70.a(new d.a() { // from class: xsna.ok90
            @Override // okhttp3.d.a
            public final okhttp3.d a(okhttp3.p pVar) {
                return NetworkClient.this.b(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER).a(pVar);
            }
        });
        aVar.c = o260Var.l.a();
        z7s0.a.putIfAbsent(videoCacheIdImpl.getId(), new k7s0(videoCacheIdImpl, bVar, new androidx.media3.datasource.cache.c(b2.a, new dzy(104857600L), new aes0(context.getApplicationContext(), fo8.a(videoCacheIdImpl.getId(), ".db"), null, 1), false), new rn80(), new g.a(aVar, new gtk()), null));
        a.onComplete();
        d.set(true);
    }
}
