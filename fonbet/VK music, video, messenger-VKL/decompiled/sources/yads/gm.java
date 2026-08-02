package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class gm {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(final int i, final long j, final long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final fm fmVar = (fm) it.next();
            if (!fmVar.c) {
                fmVar.a.post(new Runnable() { // from class: xsna.gyy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((yads.kb0) yads.fm.this.b).b(i, j, j2);
                    }
                });
            }
        }
    }
}
