package xsna;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: VoipWatchMovieMediatorsDecorator.kt */
/* loaded from: classes7.dex */
public final class k6x0 implements i6x0 {
    public final Collection<i6x0> a;
    public arj b;

    /* JADX WARN: Multi-variable type inference failed */
    public k6x0(Collection<? extends i6x0> collection) {
        this.a = collection;
    }

    @Override // xsna.i6x0
    public final void a(boolean z) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((i6x0) it.next()).a(z);
        }
    }

    @Override // xsna.i6x0
    public final void b(arj arjVar) {
        this.b = arjVar;
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((i6x0) it.next()).b(this.b);
        }
    }
}
