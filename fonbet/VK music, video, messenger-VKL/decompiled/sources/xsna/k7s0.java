package xsna;

import android.content.Context;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.g;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import xsna.a8s0;

/* compiled from: VideoCache.kt */
@ozl
/* loaded from: classes11.dex */
public final class k7s0 {
    public final r7s0 a;
    public final a8s0 b;
    public final androidx.media3.datasource.cache.c c;
    public final xw8 d;
    public final g.a e;
    public final androidx.media3.exoplayer.offline.c f;
    public Map<String, o7o> g = jgp.b;

    /* compiled from: VideoCache.kt */
    public static final class a {
        public static k7s0 a(Context context, r7s0 r7s0Var, a8s0 a8s0Var, g.a aVar, File file, n7s0 n7s0Var, s7s0 s7s0Var, int i) {
            androidx.media3.datasource.cache.b dzyVar;
            fco lk90Var;
            Executor executor = n7s0Var;
            if ((i & 64) != 0) {
                executor = new olk();
            }
            xw8 xw8Var = s7s0Var;
            if ((i & 128) != 0) {
                xw8Var = xw8.f7;
            }
            xw8 xw8Var2 = xw8Var;
            aes0 aes0Var = new aes0(context.getApplicationContext(), fo8.a(r7s0Var.getId(), ".db"), null, 1);
            boolean z = a8s0Var instanceof a8s0.a;
            if (z) {
                dzyVar = new g370();
            } else {
                if (!(a8s0Var instanceof a8s0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                dzyVar = new dzy(((a8s0.b) a8s0Var).d);
            }
            androidx.media3.datasource.cache.c cVar = new androidx.media3.datasource.cache.c(file, dzyVar, aes0Var, false);
            androidx.media3.exoplayer.offline.a aVar2 = new androidx.media3.exoplayer.offline.a(aes0Var);
            a.b bVar = new a.b();
            bVar.e = aVar;
            bVar.c = xw8Var2;
            bVar.f = icd0.a();
            bVar.a = cVar;
            CacheDataSink.a aVar3 = new CacheDataSink.a();
            aVar3.a(cVar);
            bVar.d(aVar3);
            if (z) {
                lk90Var = new androidx.media3.exoplayer.offline.b(bVar, executor);
            } else {
                if (!(a8s0Var instanceof a8s0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                lk90Var = new lk90(bVar, (a8s0.b) a8s0Var, executor);
            }
            androidx.media3.exoplayer.offline.c cVar2 = new androidx.media3.exoplayer.offline.c(context, aVar2, lk90Var);
            if (cVar2.k != 1) {
                cVar2.k = 1;
                cVar2.g++;
                cVar2.d.obtainMessage(5, 1, 0).sendToTarget();
            }
            return new k7s0(r7s0Var, a8s0Var, cVar, xw8Var2, aVar, cVar2);
        }
    }

    public k7s0(r7s0 r7s0Var, a8s0 a8s0Var, androidx.media3.datasource.cache.c cVar, xw8 xw8Var, g.a aVar, androidx.media3.exoplayer.offline.c cVar2) {
        this.a = r7s0Var;
        this.b = a8s0Var;
        this.c = cVar;
        this.d = xw8Var;
        this.e = aVar;
        this.f = cVar2;
    }
}
