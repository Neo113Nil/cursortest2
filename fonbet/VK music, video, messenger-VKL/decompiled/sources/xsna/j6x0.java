package xsna;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: VoipWatchMovieMediatorImpl.kt */
/* loaded from: classes7.dex */
public final class j6x0 implements i6x0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean b = true;
    public arj c;

    @Override // xsna.i6x0
    public final void a(boolean z) {
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jvw0) it.next()).a(z);
        }
    }

    @Override // xsna.i6x0
    public final void b(arj arjVar) {
        this.c = arjVar;
    }
}
