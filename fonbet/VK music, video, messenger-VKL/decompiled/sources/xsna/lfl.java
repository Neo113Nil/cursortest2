package xsna;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lfl implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lfl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                com.google.firebase.heartbeatinfo.a aVar = (com.google.firebase.heartbeatinfo.a) this.c;
                synchronized (aVar) {
                    ((i1v) aVar.a.get()).h(System.currentTimeMillis(), aVar.c.get().getUserAgent());
                }
                return null;
            default:
                return ((gzs) this.c).invoke();
        }
    }
}
