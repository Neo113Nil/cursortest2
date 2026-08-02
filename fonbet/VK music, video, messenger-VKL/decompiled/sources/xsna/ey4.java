package xsna;

import java.util.Iterator;

/* compiled from: AudioStateListener.java */
/* loaded from: classes.dex */
public final class ey4 implements Runnable {
    public final /* synthetic */ dy4 b;

    public ey4(dy4 dy4Var) {
        this.b = dy4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.i.iterator();
        while (it.hasNext()) {
            ((com.vk.music.player.e) it.next()).z3();
        }
    }
}
