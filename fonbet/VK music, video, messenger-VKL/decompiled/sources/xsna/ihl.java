package xsna;

import android.view.Choreographer;
import xsna.gw90;

/* compiled from: DefaultJankDetector.kt */
/* loaded from: classes17.dex */
public final class ihl extends gw90 {
    public final Choreographer i;
    public final hhl j;

    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.hhl] */
    public ihl(Choreographer choreographer, long j, gw90.a aVar) {
        super(j, aVar);
        this.i = choreographer;
        final gw90.c cVar = this.h;
        this.j = new Choreographer.FrameCallback() { // from class: xsna.hhl
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                gw90.c.this.invoke(Long.valueOf(j2));
            }
        };
    }

    @Override // xsna.gw90
    public final void a() {
        this.i.postFrameCallback(this.j);
    }

    @Override // xsna.gw90
    public final void b() {
        this.i.postFrameCallback(this.j);
    }

    @Override // xsna.gw90
    public final void c() {
        this.i.removeFrameCallback(this.j);
    }
}
