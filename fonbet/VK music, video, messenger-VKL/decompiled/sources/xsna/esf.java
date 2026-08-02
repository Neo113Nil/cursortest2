package xsna;

import java.util.concurrent.Callable;

/* compiled from: ClipsWrapperMemoryStorage.kt */
/* loaded from: classes17.dex */
public final class esf<V> implements Callable {
    public final /* synthetic */ Object b;

    public esf(Object obj) {
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final tqf call() {
        return ((stf) this.b).d.a;
    }
}
