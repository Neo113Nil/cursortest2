package xsna;

import android.os.Looper;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.function.Consumer;

/* compiled from: BaseVideoTrackDecoderHelper.kt */
/* loaded from: classes3.dex */
public class ir6 implements llt0 {
    public final csp a;
    public final lzf b;
    public final Looper c;
    public final Looper d;
    public final gyi e;
    public final b0u f;
    public final int g;
    public final xmt0 h;
    public final boolean i;
    public final Consumer<Throwable> j;
    public final ErrorStatBuilder k;
    public qq6 l;

    public ir6(csp cspVar, lzf lzfVar, Looper looper, Looper looper2, gyi gyiVar, b0u b0uVar, int i, xmt0 xmt0Var, boolean z, boolean z2, Consumer consumer, ErrorStatBuilder errorStatBuilder, int i2) {
        b0uVar = (i2 & 32) != 0 ? null : b0uVar;
        consumer = (i2 & 1024) != 0 ? null : consumer;
        errorStatBuilder = (i2 & 2048) != 0 ? null : errorStatBuilder;
        this.a = cspVar;
        this.b = lzfVar;
        this.c = looper;
        this.d = looper2;
        this.e = gyiVar;
        this.f = b0uVar;
        this.g = i;
        this.h = xmt0Var;
        this.i = z;
        this.j = consumer;
        this.k = errorStatBuilder;
        this.l = z2 ? new jh90(cspVar, looper2, b0uVar, i, xmt0Var, lzfVar) : new ptj0(cspVar, looper, looper2, b0uVar, i, xmt0Var, lzfVar, errorStatBuilder);
    }

    @Override // xsna.llt0
    public void c(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i) {
        this.h.c = false;
        this.e.c(new ocs(Integer.valueOf(tht0Var.b()), null, 2));
        try {
            this.l.b(i, videoItem);
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th) {
            if (!(this.l instanceof jh90)) {
                throw th;
            }
            RuntimeException runtimeException = new RuntimeException("Parallel decoders preparer failed, try fallback", th);
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.c("DefaultVideoTrackDecoderHelper", runtimeException);
            }
            Consumer<Throwable> consumer = this.j;
            if (consumer != null) {
                consumer.accept(runtimeException);
            }
            this.l.e();
            ptj0 ptj0Var = new ptj0(this.a, this.c, this.d, this.f, this.g, this.h, this.b, this.k);
            this.l = ptj0Var;
            ptj0Var.b(i, videoItem);
        }
        if (this.l instanceof jh90) {
            return;
        }
        tht0Var.seekTo(videoItem.O0());
    }

    public final boolean d() {
        klt0 klt0Var = this.l.f;
        return klt0Var != null && klt0Var.b.d();
    }

    public final void e(boolean z) {
        this.l.f(this.i && z);
    }

    @Override // xsna.llt0
    public void a() {
    }
}
