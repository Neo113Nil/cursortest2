package xsna;

import com.vk.media.recorder.impl.Streamer;

/* compiled from: ConnectionManager.java */
/* loaded from: classes3.dex */
public final class e4j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Streamer.CONNECTION_STATE c;
    public final /* synthetic */ Streamer.STATUS d;
    public final /* synthetic */ g4j e;

    public e4j(g4j g4jVar, int i, Streamer.CONNECTION_STATE connection_state, Streamer.STATUS status) {
        this.e = g4jVar;
        this.b = i;
        this.c = connection_state;
        this.d = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Streamer.b bVar = this.e.j;
        if (bVar != null) {
            bVar.d(this.b, this.c, this.d);
        }
    }
}
