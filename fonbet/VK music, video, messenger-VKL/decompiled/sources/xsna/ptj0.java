package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.stat.ErrorStatBuilder;

/* compiled from: SingleDecoderController.kt */
/* loaded from: classes3.dex */
public final class ptj0 extends qq6 {
    public final r6t0 g;
    public final hu5 h;
    public volatile int i;

    public ptj0(csp cspVar, Looper looper, Looper looper2, b0u b0uVar, int i, xmt0 xmt0Var, lzf lzfVar, ErrorStatBuilder errorStatBuilder) {
        super(cspVar, looper2, b0uVar, i, lzfVar, errorStatBuilder);
        this.g = xmt0Var;
        this.h = new hu5(new Handler(looper));
    }

    @Override // xsna.qq6
    public final klt0 a(int i, VideoItem videoItem) {
        this.h.a(new jcf0(this, 3));
        try {
            return new klt0(this.a, c(videoItem, this.d, this.g, this.i));
        } catch (Throwable th) {
            this.h.a(new z4d0(this, 7));
            throw th;
        }
    }

    @Override // xsna.qq6
    public final void f(boolean z) {
        super.f(z);
        try {
            this.h.a(new z4d0(this, 7));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
