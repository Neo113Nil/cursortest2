package defpackage;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class nbs extends pbs {
    public final /* synthetic */ ims a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ x40 c;
    public final /* synthetic */ u40 d;
    public final /* synthetic */ Fragment e;

    public nbs(Fragment fragment, ims imsVar, AtomicReference atomicReference, x40 x40Var, u40 u40Var) {
        this.e = fragment;
        this.a = imsVar;
        this.b = atomicReference;
        this.c = x40Var;
        this.d = u40Var;
    }

    @Override // defpackage.pbs
    public final void a() {
        Fragment fragment = this.e;
        this.b.set(((t50) this.a.mo104apply(null)).d(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
