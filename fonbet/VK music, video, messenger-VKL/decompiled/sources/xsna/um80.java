package xsna;

/* compiled from: OneVideoPlayerMessage.kt */
/* loaded from: classes8.dex */
public final class um80 {
    public final androidx.media3.exoplayer.i a;

    public um80(androidx.media3.exoplayer.i iVar) {
        this.a = iVar;
    }

    public final void a() {
        androidx.media3.exoplayer.i iVar = this.a;
        synchronized (iVar) {
            fxc0.z(iVar.k);
            iVar.l = true;
            iVar.a(false);
        }
    }

    public final void b() {
        androidx.media3.exoplayer.i iVar = this.a;
        fxc0.z(!iVar.k);
        iVar.j = false;
    }

    public final void c(long j) {
        androidx.media3.exoplayer.i iVar = this.a;
        fxc0.z(!iVar.k);
        iVar.i = j;
    }
}
