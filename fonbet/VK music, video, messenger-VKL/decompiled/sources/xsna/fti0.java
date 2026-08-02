package xsna;

import com.google.firebase.sessions.SessionDatastoreImpl;

/* compiled from: SessionDatastoreImpl_Factory.java */
/* loaded from: classes.dex */
public final class fti0 implements vhq<SessionDatastoreImpl> {
    public final e9e0<kotlin.coroutines.d> b;
    public final e9e0<fvk<uyc0>> c;

    public fti0(e9e0<kotlin.coroutines.d> e9e0Var, e9e0<fvk<uyc0>> e9e0Var2) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new SessionDatastoreImpl(this.b.get(), this.c.get());
    }
}
