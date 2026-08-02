package xsna;

import java.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dqv implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dqv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return Optional.ofNullable(((gzs) this.c).invoke());
            default:
                return com.vungle.ads.internal.session.b.a((com.vungle.ads.internal.session.b) this.c);
        }
    }
}
