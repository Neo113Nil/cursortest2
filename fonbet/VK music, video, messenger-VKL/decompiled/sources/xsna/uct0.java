package xsna;

import androidx.media3.exoplayer.video.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class uct0 implements Runnable {
    public final /* synthetic */ g.a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;

    public /* synthetic */ uct0(g.a aVar, Object obj, long j) {
        this.b = aVar;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.media3.exoplayer.video.g gVar = this.b.b;
        String str = y2r0.a;
        gVar.b(this.d, this.c);
    }
}
