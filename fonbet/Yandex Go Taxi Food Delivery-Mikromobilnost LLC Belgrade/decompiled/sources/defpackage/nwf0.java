package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class nwf0 implements lwf0 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ Object b;

    public nwf0(AtomicReference atomicReference, Object obj) {
        this.a = atomicReference;
        this.b = obj;
    }

    public final void a(Object obj) {
        this.a.set(obj);
    }
}
