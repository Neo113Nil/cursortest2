package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PhotoEditorStatTrackerImpl.kt */
/* loaded from: classes15.dex */
public final class c7a0 implements a7a0 {
    public final String a;
    public final ei90 b;
    public final t9b c;
    public final ReentrantLock d = new ReentrantLock();

    public c7a0(String str, ei90 ei90Var, t9b t9bVar) {
        this.a = str;
        this.b = ei90Var;
        this.c = t9bVar;
    }

    @Override // xsna.a7a0
    public final void a(nt8 nt8Var) {
        ksk0.a(new com.vk.movika.sdk.base.ui.r0(19, nt8Var, this));
    }
}
