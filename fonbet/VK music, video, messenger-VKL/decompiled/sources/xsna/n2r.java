package xsna;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedPlugins.kt */
/* loaded from: classes4.dex */
public final class n2r<T> implements m2r<T> {
    public final List<m2r<T>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public n2r(List<? extends m2r<T>> list) {
        this.a = list;
    }

    @Override // xsna.m2r
    public final void a(Context context) {
        Iterator<m2r<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @Override // xsna.m2r
    public final void b(eg00<T> eg00Var) {
        Iterator<m2r<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(eg00Var);
        }
    }

    @Override // xsna.m2r
    public final void c(kb80 kb80Var) {
        Iterator<m2r<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(kb80Var);
        }
    }

    @Override // xsna.m2r
    public final void pause() {
        Iterator<m2r<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }
}
